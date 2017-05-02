package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.DotaMatch;
import com.dragovorn.dotaapi.match.IMatch;
import com.google.common.base.Throwables;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dota implements IDota {

    private final String key;

    private final HttpClient client;

    private enum Call {
        GETMATCHHISTORY("IDOTA2Match_570/GetMatchHistory/V001"),
        GETMATCHDETAILS("IDOTA2Match_570/GetMatchDetails/V001"),
        GETMATCHSEQUENCENUM("IDOTA2Match_570/GetMatchHistoryBySequenceNum/V001"),
        RESOLVEVANITYURL("ISteamUser/ResolveVanityURL/v0001");

        private final String url;

        Call(String url) {
            this.url = url;
        }

        public String getUrl(String key) {
            return "https://api.steampowered.com/" + this.url + "/?key=" + key;
        }
    }

    public Dota(String key) {
        this.key = key;
        this.client = HttpClientBuilder.create().build();
    }

    private JSONObject makeApiRequest(Call call, String params) throws IOException {
        HttpResponse response = this.client.execute(makeGetRequest(call.getUrl(this.key) + params));

        return new JSONObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
    }

    private JSONObject makeApiRequest(Call call) throws IOException {
        return makeApiRequest(call, "");
    }

    private HttpGet makeGetRequest(String url) {
        HttpGet request = new HttpGet(url);
        request.addHeader("content-type", "application/json");

        return request;
    }

    @Override
    public IMatch getMatchById(long id) {
        try {
            return new DotaMatch(makeApiRequest(Call.GETMATCHDETAILS, "&match_id=" + id).getJSONObject("result"));
        } catch (IOException exception) {
            throw Throwables.propagate(exception);
        }
    }

    @Override
    public IMatch getMatchBySeqId(long id) {
        return getMatchesBySeqId(id, 1).get(0);
    }

    /**
     * @deprecated unimplemented
     */
    @Deprecated
    @Override
    public List<IMatch> getMatchesById(long id, int num) {
        return null;
    }

    @Override
    public List<IMatch> getMatchesBySeqId(long id, int num) {
        try {
            ArrayList<IMatch> matches = new ArrayList<>();

            JSONObject response = makeApiRequest(Call.GETMATCHSEQUENCENUM, "&match_id=" + id).getJSONObject("result");

            JSONArray array = response.getJSONArray("matches");

            for (Object object : array) {
                JSONObject jsonObject = (JSONObject) object;

                matches.add(new DotaMatch(jsonObject));
            }

            return matches;
        } catch (IOException exception) {
            throw Throwables.propagate(exception);
        }
    }
}