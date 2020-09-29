package com.spotify.voiceassistant.models.v2;

import com.spotify.voiceassistant.models.v1.ParsedQuery;

public class SearchRequest {
    @fiq(a = "parsed_query")
    public ParsedQuery parsed_query;
    @fiq(a = "target_device")
    public TargetDevice target_device;
    @fiq(a = "text_query")
    public String text_query;
    @fiq(a = "text_query_language")
    public String text_query_language;

    public SearchRequest(String str, String str2, TargetDevice targetDevice, ParsedQuery parsedQuery) {
        this.text_query = str;
        this.text_query_language = str2;
        this.target_device = targetDevice;
        this.parsed_query = parsedQuery;
    }
}
