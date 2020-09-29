package com.spotify.voiceassistant.models.v1;

public class CosmosSearchRequest {
    @fjk(a = "parsed_query")
    public ParsedQuery parsedQuery;
    @fjk(a = "source_device")
    public SourceDevice sourceDevice;
    @fjk(a = "text_query")
    public String textQuery;
    @fjk(a = "text_query_language")
    public String textQueryLanguage;

    public CosmosSearchRequest(String str, String str2, ParsedQuery parsedQuery2, SourceDevice sourceDevice2) {
        this.textQuery = str;
        this.textQueryLanguage = str2;
        this.parsedQuery = parsedQuery2;
        this.sourceDevice = sourceDevice2;
    }
}
