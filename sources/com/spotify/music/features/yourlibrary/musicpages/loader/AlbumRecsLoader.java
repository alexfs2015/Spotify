package com.spotify.music.features.yourlibrary.musicpages.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public final class AlbumRecsLoader {
    public final gmm<AlbumRecsResponse> a;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumRec implements JacksonModel {
        private final String mUri;

        @JsonCreator
        public AlbumRec(@JsonProperty("uri") String str) {
            this.mUri = str;
        }

        public String getUri() {
            return this.mUri;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumRecsResponse implements JacksonModel {
        private final List<AlbumRec> mAlbumRecs;

        @JsonCreator
        public AlbumRecsResponse(@JsonProperty("albumRecommendations") List<AlbumRec> list) {
            this.mAlbumRecs = list;
        }

        public List<AlbumRec> getAlbumRecs() {
            return this.mAlbumRecs;
        }
    }

    public AlbumRecsLoader(gmm<AlbumRecsResponse> gmm) {
        this.a = gmm;
    }
}
