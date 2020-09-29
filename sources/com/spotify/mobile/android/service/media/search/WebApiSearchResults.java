package com.spotify.mobile.android.service.media.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebApiSearchResults implements JacksonModel {
    private static final String KEY_RESULTS = "results";
    private static final String KEY_SEARCH_TERM = "search_term";
    @JsonIgnore
    private final Response mResults;
    @JsonIgnore
    private final String mSearchTerm;

    @JsonCreator
    public WebApiSearchResults(@JsonProperty("search_term") String str, @JsonProperty("results") Response response) {
        this.mSearchTerm = str;
        this.mResults = response;
    }

    @JsonGetter("results")
    public Response getResults() {
        return this.mResults;
    }

    @JsonGetter("search_term")
    public String getSearchTerm() {
        return this.mSearchTerm;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return !this.mResults.hasTracks();
    }
}
