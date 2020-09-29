package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: ltm reason: default package */
public final class ltm {
    public wuk a = xaj.b();
    public lts b;
    private final lsw c;
    private final lky d;
    private final heg e;
    private final String f;
    private final String g;
    private final sgx h;

    public ltm(lsw lsw, heg heg, String str, String str2, sgx sgx, lky lky) {
        this.c = (lsw) fay.a(lsw);
        this.e = (heg) fay.a(heg);
        this.f = str;
        this.g = str2;
        this.h = sgx;
        this.d = lky;
    }

    public final void a(lts lts) {
        Request request;
        this.b = (lts) fay.a(lts);
        lsw lsw = this.c;
        String str = this.f;
        RxResolver rxResolver = lsw.a;
        int i = defpackage.lsw.AnonymousClass1.a[jst.a(str).b.ordinal()];
        String str2 = Request.GET;
        String str3 = "500";
        String str4 = "limit";
        String str5 = "signal";
        if (i != 1) {
            String str6 = "artistURI:%s";
            if (i == 2) {
                Builder buildUpon = Uri.parse("hm://vanilla/v1/views/hub2/assisted-curation-search-artist-entity").buildUpon();
                buildUpon.appendQueryParameter(str5, String.format(str6, new Object[]{str}));
                buildUpon.appendQueryParameter(str4, str3);
                request = new Request(str2, udq.a(buildUpon, lsw.b, lsw.c, R.integer.grid_columns_land, lsw.d).build().toString());
            } else if (lrz.a(str)) {
                String b2 = lrz.b(str);
                String c2 = lrz.c(str);
                StringBuilder sb = new StringBuilder("hm://vanilla/v1/views/hub2/");
                sb.append(b2);
                request = new Request(str2, udq.a(Uri.parse(sb.toString()).buildUpon(), lsw.b, lsw.c, R.integer.grid_columns_land, lsw.d).appendQueryParameter(str5, String.format(str6, new Object[]{c2})).appendQueryParameter(str4, str3).build().toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Bad uri in AssistedCurationSearchEntityDataSource: ");
                sb2.append(str);
                throw new AssertionError(sb2.toString());
            }
        } else {
            Builder buildUpon2 = Uri.parse("hm://vanilla/v1/views/hub2/assisted-curation-search-album-entity").buildUpon();
            buildUpon2.appendQueryParameter(str5, String.format("albumURI:%s", new Object[]{str}));
            buildUpon2.appendQueryParameter(str4, str3);
            request = new Request(str2, udq.a(buildUpon2, lsw.b, lsw.c, R.integer.grid_columns_land, lsw.d).build().toString());
        }
        this.a = vun.a((ObservableSource<T>) rxResolver.resolve(request), BackpressureStrategy.BUFFER).a(vun.a((ObservableTransformer<T, R>) JacksonResponseParser.forClass(HubsJsonViewModel.class, lsw.e, lsw.f), BackpressureStrategy.LATEST)).a(gzz.class).f(new $$Lambda$ltm$1pkpC_XKYr7ak7xCLTF7mHNAdLU(this)).f(new $$Lambda$ltm$_kgHBxgtne9KLR6P1nX2yR5mV0(this)).a((c<? super T, ? extends R>) this.d).a(vun.a(this.e.c())).a((wue<? super T>) new wue<gzz>() {
            public final void onCompleted() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                ltm.this.b.a.a((gzz) obj, false);
            }

            public final void onError(Throwable th) {
                lts lts = ltm.this.b;
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SEARCH;
                String string = lts.c.getString(R.string.error_general_title);
                String string2 = lts.c.getString(R.string.error_general_body);
                lts.a.a(hai.builder().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(string).d(string2)).a()).a(), false);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz b(gzz gzz) {
        return gzz.toBuilder().b(this.g).a(hae.builder().a(haf.builder().a(this.g)).a()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz) {
        try {
            return (gzz) this.h.apply(gzz);
        } catch (Exception e2) {
            Assertion.a("Error while mapping hubs commands in assisted curation", (Throwable) e2);
            return gzz;
        }
    }
}
