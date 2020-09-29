package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Albums;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Artists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Playlists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Tracks;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: sct reason: default package */
public final class sct {
    private final String a;
    private final hpt b;
    private final String c;
    private final Context d;
    private final Flowable<fqn> e;
    private final xil f;
    private final xil g;
    private final hub h;

    public sct(String str, hpt hpt, String str2, Context context, Flowable<fqn> flowable, xil xil, xil xil2, hub hub) {
        this.a = str;
        this.b = hpt;
        this.c = str2;
        this.d = context;
        this.e = flowable;
        this.f = xil;
        this.g = xil2;
        this.h = hub;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(int i, ho hoVar) {
        fqn fqn = (fqn) fbp.a(hoVar.a);
        Response response = (Response) fbp.a(hoVar.b);
        ArrayList arrayList = new ArrayList(9);
        boolean c2 = jus.c(fqn);
        int i2 = (!response.hasTracks() || !c2) ? 0 : 1;
        if (response.hasAlbums()) {
            i2++;
        }
        if (response.hasArtists()) {
            i2++;
        }
        if (response.hasPlaylists()) {
            i2++;
        }
        if (i2 != 0) {
            if (i <= 0) {
                i = 9 / i2;
            }
            if (response.hasTracks() && c2) {
                Bundle bundle = new gqn().a(this.d.getString(R.string.collection_start_songs_title)).a;
                if (response.getTracks().getItems().size() > i) {
                    arrayList.addAll(Arrays.asList(hub.a(new Tracks(response.getTracks().getItems().subList(0, i)), bundle)));
                } else {
                    arrayList.addAll(Arrays.asList(hub.a(response.getTracks(), bundle)));
                }
            }
            if (response.hasArtists()) {
                Bundle bundle2 = new gqn().a(this.d.getString(R.string.collection_start_artists_title)).a;
                if (response.getArtists().getItems().size() > i) {
                    arrayList.addAll(Arrays.asList(hub.a(new Artists(response.getArtists().getItems().subList(0, i)), bundle2)));
                } else {
                    arrayList.addAll(Arrays.asList(hub.a(response.getArtists(), bundle2)));
                }
            }
            if (response.hasAlbums()) {
                Bundle bundle3 = new gqn().a(this.d.getString(R.string.collection_start_albums_title)).a;
                if (response.getAlbums().getItems().size() > i) {
                    arrayList.addAll(Arrays.asList(hub.a(new Albums(response.getAlbums().getItems().subList(0, i)), bundle3)));
                } else {
                    arrayList.addAll(Arrays.asList(hub.a(response.getAlbums(), bundle3)));
                }
            }
            if (response.hasPlaylists()) {
                Bundle bundle4 = new gqn().a(this.d.getString(R.string.collection_start_playlists_title)).a;
                if (response.getPlaylists().getItems().size() > i) {
                    arrayList.addAll(Arrays.asList(hub.a(new Playlists(response.getPlaylists().getItems().subList(0, i)), bundle4)));
                } else {
                    arrayList.addAll(Arrays.asList(hub.a(response.getPlaylists(), bundle4)));
                }
            }
        }
        return arrayList.isEmpty() ? scm.a : sdl.a((List<MediaBrowserItem>) arrayList, this.c);
    }

    private xii<Response> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return xii.a((Throwable) new Exception("Search query can't be empty"));
        }
        return wit.a((ObservableSource<T>) this.b.f().a(str, 0, 50, this.a, new Bundle()).a(1).d(), BackpressureStrategy.LATEST).c(20, TimeUnit.SECONDS, this.f).g(new $$Lambda$sct$bj3PV6LkfOzPuyuKkZXTKgifH3s(str));
    }

    public final xii<List<MediaItem>> a(String str, int i) {
        return xii.a(wit.a((xfk<T>) this.e).c((xiy<? super T, Boolean>) $$Lambda$94wd4FkYC1H9eM36vjo8Ri6PAiE.INSTANCE).c(), a(str), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$WF8CxyKEinA8c1KZGUAx9P5LHMY.INSTANCE).a(1).e((xiy<? super T, ? extends R>) new $$Lambda$sct$6MYfevYPssRuYFPFoiUeYfuWQdc<Object,Object>(this, i)).g($$Lambda$sct$Ie8JrsYAxH_7JRe1VtLv7_PaiY.INSTANCE).b(this.f).a(this.g);
    }
}
