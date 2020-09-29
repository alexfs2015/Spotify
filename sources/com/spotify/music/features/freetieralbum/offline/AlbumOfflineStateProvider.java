package com.spotify.music.features.freetieralbum.offline;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AlbumOfflineStateProvider {
    private final gmm<OfflineState> a;

    public static abstract class Album implements JacksonModel {
        @JsonCreator
        public static Album create(@JsonProperty("collectionLink") String str, @JsonProperty("offline") String str2, @JsonProperty("inferredOffline") String str3, @JsonProperty("syncProgress") int i, @JsonProperty("complete") boolean z, @JsonProperty("numTracksInCollection") int i2) {
            AutoValue_AlbumOfflineStateProvider_Album autoValue_AlbumOfflineStateProvider_Album = new AutoValue_AlbumOfflineStateProvider_Album(str, vlj.a(str2, i), vlj.a(str3, i), z, i2);
            return autoValue_AlbumOfflineStateProvider_Album;
        }

        public abstract String getCollectionUri();

        public abstract vli getInferredOfflineState();

        public abstract int getNumTracksInCollection();

        public abstract vli getOfflineState();

        public abstract boolean isCompleteInCollection();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class OfflineState implements JacksonModel {
        @JsonCreator
        public static OfflineState create(@JsonProperty("album") Album album, @JsonProperty("items") List<Track> list) {
            return new AutoValue_AlbumOfflineStateProvider_OfflineState(album, list);
        }

        public abstract Album getAlbum();

        public abstract List<Track> getTracks();
    }

    public static abstract class Track implements JacksonModel {
        @JsonCreator
        public static Track create(@JsonProperty("offline") String str, @JsonProperty("syncProgress") int i, @JsonProperty("link") String str2) {
            return new AutoValue_AlbumOfflineStateProvider_Track(vlj.a(str, i), str2);
        }

        public abstract String getLink();

        public abstract vli getOfflineState();
    }

    public AlbumOfflineStateProvider(gmm<OfflineState> gmm) {
        this.a = gmm;
    }

    public final xii<OfflineState> a(String str) {
        return this.a.resolve(new Request(Request.SUB, String.format("sp://core-collection/unstable/@/view/album/%s", new Object[]{str}))).c(500, TimeUnit.MILLISECONDS);
    }
}
