/* Copyright 2015 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.collector.http.fetch;

import com.norconex.collector.core.data.CrawlState;

/**
 * Hold HTTP response information obtained from fetching a document.
 * @author Pascal Essiembre
 * @since 2.2.0
 */
public class HttpFetchResponse {

    private final CrawlState crawlState;
    private final int statusCode;
    private final String reasonPhrase;
    
    public HttpFetchResponse(
            CrawlState crawlState, int statusCode, String reasonPhrase) {
        super();
        this.crawlState = crawlState;
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        if (crawlState == null) {
            throw new IllegalArgumentException(
                    "Crawl state argument cannot be null.");
        }
    }

    public CrawlState getCrawlState() {
        return crawlState;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return "HttpFetchResponse [crawlState=" + crawlState + ", statusCode="
                + statusCode + ", reasonPhrase=" + reasonPhrase + "]";
    }
}
