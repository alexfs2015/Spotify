package com.spotify.voiceassistant.models.v1;

public class CosmosSearchRequest {
    @fiq(a = "parsed_query")
    public ParsedQuery parsedQuery;
    @fiq(a = "source_device")
    public SourceDevice sourceDevice;
    @fiq(a = "text_query")
    public String textQuery;
    @fiq(a = "text_query_language")
    public String textQueryLanguage;

    public CosmosSearchRequest(String str, String str2, ParsedQuery parsedQuery2, SourceDevice sourceDevice2) {
        this.textQuery = str;
        this.textQueryLanguage = str2;
        this.parsedQuery = parsedQuery2;
        this.sourceDevice = sourceDevice2;
    }
}
