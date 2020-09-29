package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;
import java.util.Set;

public final class RecsLoaderImpl implements rhr {
    private final gmn a;
    private final ObjectMapper b;

    static class RecsRequest implements JacksonModel {
        @JsonProperty("condensed")
        public boolean condensed = true;
        @JsonProperty("numResults")
        public int numResults;
        @JsonProperty("trackSkipIDs")
        public Set<String> skipIds;
        @JsonProperty("title")
        public String title;
        @JsonProperty("trackIDs")
        public Set<String> trackIds;
        @JsonProperty("playlistURI")
        public String uri;

        public RecsRequest(int i, Set<String> set, Set<String> set2, String str) {
            this.numResults = i;
            this.skipIds = set;
            this.trackIds = set2;
            this.title = str;
        }
    }

    public RecsLoaderImpl(gmn gmn, rwl rwl) {
        this.a = gmn;
        this.b = rwl.a().a();
    }

    public final Observable<RecsResponse> a(int i, Set<String> set, Set<String> set2) {
        try {
            return wit.b(this.a.a(RecsResponse.class).resolve(new Request(Request.POST, "hm://playlistextender/ft/v2/assist-curation", null, this.b.writeValueAsBytes(new RecsRequest(i, set2, set, null)))));
        } catch (JsonProcessingException e) {
            Logger.e(e, "Failed creating recs request", new Object[0]);
            return Observable.a((Throwable) e);
        }
    }
}
