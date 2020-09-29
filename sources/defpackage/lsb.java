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

/* renamed from: lsb reason: default package */
public final class lsb {
    private final lrz a;
    private final CollectionStateProvider b;
    private final lon c;
    private final AlbumOfflineStateProvider d;
    private final utg e;

    public lsb(lrz lrz, CollectionStateProvider collectionStateProvider, lon lon, AlbumOfflineStateProvider albumOfflineStateProvider, utg utg) {
        this.a = (lrz) fbp.a(lrz);
        this.b = (CollectionStateProvider) fbp.a(collectionStateProvider);
        this.c = (lon) fbp.a(lon);
        this.d = (AlbumOfflineStateProvider) fbp.a(albumOfflineStateProvider);
        this.e = utg;
    }

    private static String a() {
        return String.valueOf(SpotifyLocale.a().hashCode());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ lsj a(Album album, Boolean bool, Boolean bool2, a aVar) {
        List<AlbumTrack> tracks = album.getTracks();
        List<OfflineTrack> a2 = aVar.a();
        HashMap hashMap = new HashMap(a2.size());
        for (OfflineTrack offlineTrack : a2) {
            hashMap.put(offlineTrack.getUri(), offlineTrack.getOfflineState());
        }
        ArrayList arrayList = new ArrayList(tracks.size());
        for (AlbumTrack albumTrack : tracks) {
            vli vli = (vli) hashMap.get(albumTrack.getUri());
            if (vli == null) {
                vli = new f();
            }
            arrayList.add(AlbumTrack.create(albumTrack, vli));
        }
        Album create = Album.create(album, arrayList);
        OfflineAlbum b2 = aVar.b();
        isy isy = new isy(b2.getCollectionUri(), AlbumCollectionState.a(b2.getNumTracksInCollection(), b2.isCompleteInCollection()), b2.getOfflineState(), b2.getInferredOfflineState());
        lsn lsn = new lsn(create.getUri(), create.getName(), create.getFirstArtistName(), utg.a(create.getCoverUri(), create.getUri(), true), true, create.getFirstArtistUri());
        lsi lsi = new lsi(create, lsn, bool.booleanValue(), bool2.booleanValue(), isy);
        return lsi;
    }

    /* access modifiers changed from: private */
    public xii<lsj> a(Album album) {
        String uri = album.getUri();
        return xii.a(wit.a((ObservableSource<T>) this.b.b(uri, uri, uri), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$lsb$JeDo581mKs5riPHRURmb5L0ihQ4<Object,Object>(uri)).b(), this.c.a().b(), this.d.a(album), (xja<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$lsb$aiKk7SLgxKQg7qqZYRfjdpjiI<Object,Object,Object,Object>(this, album));
    }

    public xii<lsj> a(String str) {
        return xim.a(wit.a((SingleSource<T>) this.a.a(str, a()))).h(new $$Lambda$lsb$pl3NQjzKGTh_9vaO0bu5ism2h_s(this)).b();
    }
}
