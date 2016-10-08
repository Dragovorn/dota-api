/*
 * Copyright (c)  2016-2016, Andrew Burr
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.dragovorn.dotaapi;

import com.sun.istack.internal.NotNull;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class DotaAPI {

    private final String key;

    private final HttpClient client;

    private enum Call {
        GETMATCHHISTORY("IDOTA2Match_570/GetMatchHistory/V001"),
        GETMATCHDETAILS("IDOTA2Match_570/GetMatchDetails/V001"),
        RESOLVEVANITYURL("ISteamUser/ResolveVanityURL/v0001");

        private final String url;

        Call(String url) {
            this.url = url;
        }

        public String getUrl(String key) {
            return "https://api.steampowered.com/" + this.url + "/?key=" + key;
        }
    }

    public DotaAPI(@NotNull String key) {
        this.key = key;
        this.client = HttpClientBuilder.create().build();
    }

    public JSONObject getMatchesById(@NotNull long steamId, int num) throws IOException { // maybe catch this exception later rather than throwing it
        return makeApiRequest(Call.GETMATCHHISTORY, "&account_id=" + steamId + "&matches_requested=" + num);
    }

    // don't use this, too broad and won't work well when people have spaces in their names
    @Deprecated
    public JSONObject getMatchesByName(@NotNull String name, int num) throws IOException { // buggy
        return makeApiRequest(Call.GETMATCHHISTORY, "&player_name=" + name + "&matches_requested=" + num);
    }

    public JSONObject getMatchesByURL(@NotNull String url, int num) throws IOException {
        return getMatchesById(makeApiRequest(Call.RESOLVEVANITYURL, "&vanityurl=" + url).getJSONObject("response").getLong("steamid"), num);
    }

    public JSONObject getMatchDetails(@NotNull String id) throws IOException {
        return makeApiRequest(Call.GETMATCHDETAILS, "&match_id=" + id);
    }

    private JSONObject makeApiRequest(Call call, String params) throws IOException {
        HttpResponse response = this.client.execute(makeGetRequest(call.getUrl(this.key) + params));

        return new JSONObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
    }

    private HttpGet makeGetRequest(String url) {
        HttpGet request = new HttpGet(url);
        request.addHeader("content-type", "application/json");

        return request;
    }
}