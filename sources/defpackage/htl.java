package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import com.spotify.mobile.android.service.media.search.WebApiSearchResults;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: htl reason: default package */
public final class htl implements htk {
    private final Resources a;
    private final htn b;
    private final hed c;
    private final hrc d;
    private final hou e;
    private final PublishSubject<htp> f = PublishSubject.a();

    public htl(Resources resources, htn htn, hed hed, hrc hrc, hou hou) {
        this.a = resources;
        this.b = htn;
        this.c = hed;
        this.d = hrc;
        this.e = hou;
    }

    public final Single<List<MediaBrowserItem>> a(String str, int i, int i2, String str2, Bundle bundle) {
        Single h = this.c.b(MoatAdEvent.EVENT_TYPE).c(1).h();
        $$Lambda$htl$r_XvHABwId6tOn1BqtSMl0WVWY r1 = new $$Lambda$htl$r_XvHABwId6tOn1BqtSMl0WVWY(this, str, i, i2, bundle);
        return h.a((Function<? super T, ? extends SingleSource<? extends R>>) r1).a((Consumer<? super Disposable>) new $$Lambda$htl$tZIjy_fxNUr18Xehw06CGxSBxOk<Object>(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(String str, int i, int i2, Bundle bundle, String str2) {
        return a(str, i, i2, bundle).f(new $$Lambda$htl$PK6cTtW2VivLgNuSE98mzIc8qxM(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(String str, String str2, WebApiSearchResults webApiSearchResults) {
        hrc hrc = this.d;
        Response results = webApiSearchResults.getResults();
        boolean equalsIgnoreCase = "premium".equalsIgnoreCase(str2);
        boolean z = true;
        Logger.b("Storing search result for \"%s\".", str);
        hrc.e = str;
        hrc.a = null;
        if (results.hasAlbums()) {
            hrc.a = Arrays.asList(hrp.a(results.getAlbums(), (Bundle) null));
        }
        hrc.b = null;
        if (results.hasArtists()) {
            hrc.b = Arrays.asList(hrp.a(results.getArtists(), (Bundle) null));
        }
        hrc.c = null;
        if (results.hasPlaylists()) {
            hrc.c = Arrays.asList(hrp.a(results.getPlaylists(), (Bundle) null));
        }
        hrc.d = null;
        if (equalsIgnoreCase && results.hasTracks()) {
            hrc.d = Arrays.asList(hrp.a(results.getTracks(), (Bundle) null));
        }
        ArrayList arrayList = new ArrayList(4);
        if (!equalsIgnoreCase || !results.hasTracks()) {
            z = false;
        }
        hrc.a(arrayList, z, "com.spotify.search.tracks", R.string.webapi_search_songs_title);
        hrc.a(arrayList, results.hasAlbums(), "com.spotify.search.albums", R.string.webapi_search_albums_title);
        hrc.a(arrayList, results.hasArtists(), "com.spotify.search.artists", R.string.webapi_search_artists_title);
        hrc.a(arrayList, results.hasPlaylists(), "com.spotify.search.playlists", R.string.webapi_search_playlists_title);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, Disposable disposable) {
        this.e.b(str, str2);
    }

    public final Single<Response> b(String str, int i, int i2, String str2, Bundle bundle) {
        return a(str, 0, 50, bundle).f($$Lambda$HZA9jS57Mnu3uMuaN_gRsx9qezg.INSTANCE).a((Consumer<? super Disposable>) new $$Lambda$htl$qVz54biUf6Z8akBeJ9e36CoP2A<Object>(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Disposable disposable) {
        this.e.b(str, str2);
    }

    private Single<WebApiSearchResults> a(String str, int i, int i2, Bundle bundle) {
        Single h = this.c.b("country_code").c(1).h();
        $$Lambda$htl$cfZM3uZTbIbrYp9CJ6lFFSCLCnU r1 = new $$Lambda$htl$cfZM3uZTbIbrYp9CJ6lFFSCLCnU(this, str, i, i2, bundle);
        return h.a((Function<? super T, ? extends SingleSource<? extends R>>) r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, int i, int i2, Bundle bundle, String str2) {
        return this.b.a(str, str2, i, i2, bundle);
    }

    public final hpd a() {
        return this.d;
    }

    public final void b() {
        this.f.onNext(htp.a(true, null));
    }

    public final void a(int i) {
        this.f.onNext(htp.a(false, this.a.getString(i)));
    }

    public final Observable<htp> c() {
        return this.f;
    }
}
