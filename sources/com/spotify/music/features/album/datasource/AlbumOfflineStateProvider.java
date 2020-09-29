package com.spotify.music.features.album.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AlbumOfflineStateProvider {
    private final gmm<AlbumOfflineState> a;
    private final gmm<TracksOfflineState> b;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class AlbumOfflineState implements JacksonModel {
        @JsonCreator
        public static AlbumOfflineState create(@JsonProperty("album") OfflineAlbum offlineAlbum) {
            return new AutoValue_AlbumOfflineStateProvider_AlbumOfflineState(offlineAlbum);
        }

        public abstract OfflineAlbum getAlbum();
    }

    public static abstract class OfflineAlbum implements JacksonModel {
        @JsonCreator
        public static OfflineAlbum create(@JsonProperty("collectionLink") String str, @JsonProperty("offline") String str2, @JsonProperty("inferredOffline") String str3, @JsonProperty("syncProgress") int i, @JsonProperty("complete") boolean z, @JsonProperty("numTracksInCollection") int i2) {
            AutoValue_AlbumOfflineStateProvider_OfflineAlbum autoValue_AlbumOfflineStateProvider_OfflineAlbum = new AutoValue_AlbumOfflineStateProvider_OfflineAlbum(str, str2, "yes".equalsIgnoreCase(str3), i, vlj.a(str2, i), vlj.a(str3, i), z, i2);
            return autoValue_AlbumOfflineStateProvider_OfflineAlbum;
        }

        public abstract String getCollectionUri();

        public abstract vli getInferredOfflineState();

        public abstract int getNumTracksInCollection();

        @Deprecated
        public abstract String getOffline();

        public abstract vli getOfflineState();

        @Deprecated
        public abstract int getSyncProgress();

        public abstract boolean isCompleteInCollection();

        @Deprecated
        public abstract boolean isInferredOffline();
    }

    public static abstract class OfflineTrack implements JacksonModel {
        @JsonCreator
        public static OfflineTrack create(@JsonProperty("offline_availability") String str, @JsonProperty("uri") String str2) {
            return new AutoValue_AlbumOfflineStateProvider_OfflineTrack(vlj.a(str, 0), str2);
        }

        public abstract vli getOfflineState();

        public abstract String getUri();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class TracksOfflineState implements JacksonModel {
        @JsonCreator
        public static TracksOfflineState create(@JsonProperty("resources") List<OfflineTrack> list) {
            return new AutoValue_AlbumOfflineStateProvider_TracksOfflineState(list);
        }

        public abstract List<OfflineTrack> getTracks();
    }

    public static abstract class a {
        public abstract List<OfflineTrack> a();

        public abstract OfflineAlbum b();
    }

    public AlbumOfflineStateProvider(gmm<AlbumOfflineState> gmm, gmm<TracksOfflineState> gmm2) {
        this.a = gmm;
        this.b = gmm2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(AlbumOfflineState albumOfflineState, TracksOfflineState tracksOfflineState) {
        return new lsa(tracksOfflineState.getTracks(), albumOfflineState.getAlbum());
    }

    public final xii<a> a(Album album) {
        String format = String.format("sp://core-collection/unstable/@/view/album/%s", new Object[]{jva.a(album.getUri()).f()});
        String str = Request.SUB;
        xii b2 = this.a.resolve(new Request(str, format)).c(500, TimeUnit.MILLISECONDS).b();
        List<AlbumTrack> tracks = album.getTracks();
        fbl a2 = fbl.a(",").a();
        ArrayList arrayList = new ArrayList();
        for (AlbumTrack uri : tracks) {
            arrayList.add(uri.getUri());
        }
        return xii.a(b2, this.b.resolve(new Request(str, String.format("sp://offline/v1/resources?uris=%s", new Object[]{a2.a((Iterable<?>) arrayList)}))).c(500, TimeUnit.MILLISECONDS), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$AlbumOfflineStateProvider$fJkBQNTZc20EsoIeKSutvsKcetQ.INSTANCE);
    }
}
