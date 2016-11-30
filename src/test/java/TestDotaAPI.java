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

import com.dragovorn.dotaapi.DotaAPI;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class TestDotaAPI {

    private DotaAPI dotaAPI = new DotaAPI(MyKeys.key);

    @Test
    public void testGetMatchHistory() {
        try {
            System.out.println(this.dotaAPI.getMatchesByURL("Dragovorn", 1).toString(4)); // my steam url
        } catch (IOException exception) {
            exception.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetMatchDetails() {
        try {
            System.out.println(this.dotaAPI.getMatchDetails("2695234392").toString(4));
        } catch (IOException exception) {
            exception.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetMatchBySequenceNum() {
        try {
            System.out.println(this.dotaAPI.getMatchesBySequenceNum("1", 1).toString(4));
        } catch (IOException exception) {
            exception.printStackTrace();
            fail();
        }
    }
}