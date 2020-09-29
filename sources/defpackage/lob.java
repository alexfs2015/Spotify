package defpackage;

import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineAlbum;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineTrack;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.a;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumTrack;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: lob reason: default package */
public final class lob {
    private final lnz a;
    private final CollectionStateProvider b;
    private final lkn c;
    private final AlbumOfflineStateProvider d;
    private final uhs e;

    public lob(lnz lnz, CollectionStateProvider collectionStateProvider, lkn lkn, AlbumOfflineStateProvider albumOfflineStateProvider, uhs uhs) {
        this.a = (lnz) fay.a(lnz);
        this.b = (CollectionStateProvider) fay.a(collectionStateProvider);
        this.c = (lkn) fay.a(lkn);
        this.d = (AlbumOfflineStateProvider) fay.a(albumOfflineStateProvider);
        this.e = uhs;
    }

    public wud<loj> a(String str) {
        return wuh.a(vun.a((SingleSource<T>) this.a.a(str, a()))).i(new $$Lambda$lob$0RyvDW3EbGH_yVYiwzVw0lp908(this)).b();
    }

    private static String a() {
        return String.valueOf(SpotifyLocale.a().hashCode());
    }

    /* access modifiers changed from: private */
    public wud<loj> a(Album album) {
        String uri = album.getUri();
        return wud.a(vun.a((ObservableSource<T>) this.b.b(uri, uri, uri), BackpressureStrategy.BUFFER).f(new $$Lambda$lob$UEs2khXtmcf5DKzdqDXOPHexI(uri)).b(), this.c.a().b(), this.d.a(album), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$lob$dg_cCNNcAhstmpZi8qBvZTBt2xc<Object,Object,Object,Object>(this, album));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ loj a(Album album, Boolean bool, Boolean bool2, a aVar) {
        List<AlbumTrack> tracks = album.getTracks();
        List<OfflineTrack> a2 = aVar.a();
        HashMap hashMap = new HashMap(a2.size());
        for (OfflineTrack offlineTrack : a2) {
            hashMap.put(offlineTrack.getUri(), offlineTrack.getOfflineState());
        }
        ArrayList arrayList = new ArrayList(tracks.size());
        for (AlbumTrack albumTrack : tracks) {
            uzf uzf = (uzf) hashMap.get(albumTrack.getUri());
            if (uzf == null) {
                uzf = new f();
            }
            arrayList.add(AlbumTrack.create(albumTrack, uzf));
        }
        Album create = Album.create(album, arrayList);
        OfflineAlbum b2 = aVar.b();
        iql iql = new iql(b2.getCollectionUri(), AlbumCollectionState.a(b2.getNumTracksInCollection(), b2.isCompleteInCollection()), b2.getOfflineState(), b2.getInferredOfflineState());
        lon lon = new lon(create.getUri(), create.getName(), create.getFirstArtistName(), uhs.a(create.getCoverUri(), create.getUri(), true), true, create.getFirstArtistUri());
        loi loi = new loi(create, lon, bool.booleanValue(), bool2.booleanValue(), iql);
        return loi;
    }
}
