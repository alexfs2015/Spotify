package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Albums;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Artists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Playlists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Tracks;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: lpa reason: default package */
public final class lpa {
    private final String a;
    private final hne b;
    private final String c;
    private final Context d;
    private final hec e;
    private final wug f;
    private final wug g;
    private final hrp h;

    public lpa(String str, hne hne, String str2, Context context, hec hec, wug wug, wug wug2, hrp hrp) {
        this.a = str;
        this.b = hne;
        this.c = str2;
        this.d = context;
        this.e = hec;
        this.f = wug;
        this.g = wug2;
        this.h = hrp;
    }

    public final wud<List<MediaItem>> a(String str) {
        wud wud;
        wud c2 = vun.a((wrf<T>) this.e.a()).c((wut<? super T, Boolean>) $$Lambda$ePtv_adNAMcR3MMVxmbatAr9CM4.INSTANCE).c();
        if (TextUtils.isEmpty(str)) {
            wud = wud.a((Throwable) new Exception("Search query can't be empty"));
        } else {
            wud = vun.a((ObservableSource<T>) this.b.f().b(str, 0, 50, this.a, new Bundle()).a(1).d(), BackpressureStrategy.LATEST).c(20, TimeUnit.SECONDS, this.f).h(new $$Lambda$lpa$a4UfWMfMNRJjrQSEzn6mRClfN4U(str));
        }
        return wud.a(c2, wud, (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$OK67bpi4CH6H7luaU2TdzC1_rIk.INSTANCE).a(1).f(new $$Lambda$lpa$m3bT0if_OkW7IkL4POCpcKSfbNE(this)).h($$Lambda$lpa$r_0rjk6HBVqu64Mq9lMe9k2cVI.INSTANCE).b(this.f).a(this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(ho hoVar) {
        fpt fpt = (fpt) fay.a(hoVar.a);
        Response response = (Response) fay.a(hoVar.b);
        ArrayList arrayList = new ArrayList(9);
        boolean c2 = jsl.c(fpt);
        int i = (!response.hasTracks() || !c2) ? 0 : 1;
        if (response.hasAlbums()) {
            i++;
        }
        if (response.hasArtists()) {
            i++;
        }
        if (response.hasPlaylists()) {
            i++;
        }
        if (i != 0) {
            int i2 = 9 / i;
            if (response.hasTracks() && c2) {
                Bundle bundle = new gox().a(this.d.getString(R.string.collection_start_songs_title)).a;
                if (response.getTracks().getItems().size() > i2) {
                    arrayList.addAll(Arrays.asList(hrp.a(new Tracks(response.getTracks().getItems().subList(0, i2)), bundle)));
                } else {
                    arrayList.addAll(Arrays.asList(hrp.a(response.getTracks(), bundle)));
                }
            }
            if (response.hasArtists()) {
                Bundle bundle2 = new gox().a(this.d.getString(R.string.collection_start_artists_title)).a;
                if (response.getArtists().getItems().size() > i2) {
                    arrayList.addAll(Arrays.asList(hrp.a(new Artists(response.getArtists().getItems().subList(0, i2)), bundle2)));
                } else {
                    arrayList.addAll(Arrays.asList(hrp.a(response.getArtists(), bundle2)));
                }
            }
            if (response.hasAlbums()) {
                Bundle bundle3 = new gox().a(this.d.getString(R.string.collection_start_albums_title)).a;
                if (response.getAlbums().getItems().size() > i2) {
                    arrayList.addAll(Arrays.asList(hrp.a(new Albums(response.getAlbums().getItems().subList(0, i2)), bundle3)));
                } else {
                    arrayList.addAll(Arrays.asList(hrp.a(response.getAlbums(), bundle3)));
                }
            }
            if (response.hasPlaylists()) {
                Bundle bundle4 = new gox().a(this.d.getString(R.string.collection_start_playlists_title)).a;
                if (response.getPlaylists().getItems().size() > i2) {
                    arrayList.addAll(Arrays.asList(hrp.a(new Playlists(response.getPlaylists().getItems().subList(0, i2)), bundle4)));
                } else {
                    arrayList.addAll(Arrays.asList(hrp.a(response.getPlaylists(), bundle4)));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return rtf.a;
        }
        return rtz.a((List<MediaBrowserItem>) arrayList, this.c);
    }
}
