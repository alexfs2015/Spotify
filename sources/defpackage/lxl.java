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

/* renamed from: lxl reason: default package */
public final class lxl {
    public xip a = xon.b();
    public lxr b;
    private final lwv c;
    private final loy d;
    private final hhc e;
    private final String f;
    private final String g;
    private final sre h;

    public lxl(lwv lwv, hhc hhc, String str, String str2, sre sre, loy loy) {
        this.c = (lwv) fbp.a(lwv);
        this.e = (hhc) fbp.a(hhc);
        this.f = str;
        this.g = str2;
        this.h = sre;
        this.d = loy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs) {
        try {
            return (hcs) this.h.apply(hcs);
        } catch (Exception e2) {
            Assertion.a("Error while mapping hubs commands in assisted curation", (Throwable) e2);
            return hcs;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs b(hcs hcs) {
        return hcs.toBuilder().b(this.g).a(hcx.builder().a(hcy.builder().a(this.g)).a()).a();
    }

    public final void a(lxr lxr) {
        Request request;
        this.b = (lxr) fbp.a(lxr);
        lwv lwv = this.c;
        String str = this.f;
        RxResolver rxResolver = lwv.a;
        int i = defpackage.lwv.AnonymousClass1.a[jva.a(str).b.ordinal()];
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
                request = new Request(str2, uql.a(buildUpon, lwv.b, lwv.c, R.integer.grid_columns_land, lwv.d).build().toString());
            } else if (lvy.a(str)) {
                String b2 = lvy.b(str);
                String c2 = lvy.c(str);
                StringBuilder sb = new StringBuilder("hm://vanilla/v1/views/hub2/");
                sb.append(b2);
                request = new Request(str2, uql.a(Uri.parse(sb.toString()).buildUpon(), lwv.b, lwv.c, R.integer.grid_columns_land, lwv.d).appendQueryParameter(str5, String.format(str6, new Object[]{c2})).appendQueryParameter(str4, str3).build().toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Bad uri in AssistedCurationSearchEntityDataSource: ");
                sb2.append(str);
                throw new AssertionError(sb2.toString());
            }
        } else {
            Builder buildUpon2 = Uri.parse("hm://vanilla/v1/views/hub2/assisted-curation-search-album-entity").buildUpon();
            buildUpon2.appendQueryParameter(str5, String.format("albumURI:%s", new Object[]{str}));
            buildUpon2.appendQueryParameter(str4, str3);
            request = new Request(str2, uql.a(buildUpon2, lwv.b, lwv.c, R.integer.grid_columns_land, lwv.d).build().toString());
        }
        this.a = wit.a((ObservableSource<T>) rxResolver.resolve(request), BackpressureStrategy.BUFFER).a(wit.a((ObservableTransformer<T, R>) JacksonResponseParser.forClass(HubsJsonViewModel.class, lwv.e, lwv.f), BackpressureStrategy.LATEST)).a(hcs.class).e((xiy<? super T, ? extends R>) new $$Lambda$lxl$dtrK0l6_3ireqXrQ4Kzpdp0vtE<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$lxl$723W9nZjax1e2YtTmdIBchklc4<Object,Object>(this)).a((c<? super T, ? extends R>) this.d).a(wit.a(this.e.c())).a((xij<? super T>) new xij<hcs>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
                lxr lxr = lxl.this.b;
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SEARCH;
                String string = lxr.c.getString(R.string.error_general_title);
                String string2 = lxr.c.getString(R.string.error_general_body);
                lxr.a.a(hdb.builder().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) spotifyIconV2)).a(hcy.builder().a(string).d(string2)).a()).a(), false);
            }

            public final /* synthetic */ void onNext(Object obj) {
                lxl.this.b.a.a((hcs) obj, false);
            }
        });
    }
}
