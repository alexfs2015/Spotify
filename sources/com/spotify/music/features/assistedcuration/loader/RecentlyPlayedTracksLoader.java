package com.spotify.music.features.assistedcuration.loader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Locale;

public final class RecentlyPlayedTracksLoader {
    private final gky<RecentlyPlayedTracksResponse> a;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class RecentlyPlayedTracksResponse implements JacksonModel {
        public abstract List<ResponseTrack> getTracks();

        @JsonCreator
        public static RecentlyPlayedTracksResponse create(@JsonProperty("tracks") List<ResponseTrack> list) {
            return new AutoValue_RecentlyPlayedTracksLoader_RecentlyPlayedTracksResponse(list);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ResponseItem implements JacksonModel {
        public abstract String getName();

        public abstract String getUri();

        @JsonCreator
        public static ResponseItem create(@JsonProperty("link") String str, @JsonProperty("name") String str2) {
            return new AutoValue_RecentlyPlayedTracksLoader_ResponseItem(str, str2);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ResponseTrack implements JacksonModel {
        public abstract ResponseItem getAlbum();

        public abstract List<ResponseItem> getArtists();

        public abstract String getImage();

        public abstract String getName();

        public abstract String getPreviewId();

        public abstract String getUri();

        public abstract boolean isExplicit();

        @JsonCreator
        public static ResponseTrack create(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("imageUri") String str3, @JsonProperty("previewId") String str4, @JsonProperty("isExplicit") boolean z, @JsonProperty("album") ResponseItem responseItem, @JsonProperty("artists") List<ResponseItem> list) {
            AutoValue_RecentlyPlayedTracksLoader_ResponseTrack autoValue_RecentlyPlayedTracksLoader_ResponseTrack = new AutoValue_RecentlyPlayedTracksLoader_ResponseTrack(str, str2, str3, str4, z, responseItem, list);
            return autoValue_RecentlyPlayedTracksLoader_ResponseTrack;
        }
    }

    public RecentlyPlayedTracksLoader(gky<RecentlyPlayedTracksResponse> gky) {
        this.a = gky;
    }

    public final wud<List<lqv>> a(int i) {
        return this.a.resolve(new Request(Request.GET, String.format(Locale.US, "sp://core-recently-played/unstable/tracks?include_hidden=false&include_local_tracks=false&include_episodes=false&limit=%d", new Object[]{Integer.valueOf(100)}))).h($$Lambda$RecentlyPlayedTracksLoader$LrVV90B1NhVqSuvWuEuQOPbuvP4.INSTANCE).f($$Lambda$joB5mIIrXaMYfKXzjdeVvpFck.INSTANCE).f($$Lambda$YKdP6feesZ4EM3i0oZu_e8LZeNY.INSTANCE);
    }
}
