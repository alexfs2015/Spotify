package defpackage;

import android.net.Uri.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: hvc reason: default package */
public final class hvc<T> {
    private final hva<T> a;
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final String c;
    private final hgy d;
    private final RxResolver e;
    private final xil f;
    private final ObjectMapper g;
    private final hxx h;
    private final WeakReference<hvd<T>> i;
    private final jty j;
    private xip k = xon.b();

    public hvc(hvd<T> hvd, hva<T> hva, String str, RxResolver rxResolver, hgy hgy, hxx hxx, xil xil, ObjectMapper objectMapper, jty jty) {
        this.i = new WeakReference<>(hvd);
        this.a = hva;
        this.c = str;
        this.e = rxResolver;
        this.d = hgy;
        this.h = hxx;
        this.f = xil;
        this.g = objectMapper;
        this.j = jty;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Request a(hvd hvd, int i2, int i3, fqn fqn, SessionState sessionState) {
        boolean c2 = jus.c(fqn);
        htw htw = new htw();
        htw.a("page", String.valueOf(i2));
        htw.a("per_page", String.valueOf(i3));
        String str = this.c;
        if (str != null) {
            htw.a("region", str);
        }
        htw.a("locale", SpotifyLocale.a());
        htw.a("platform", "android");
        htw.a("version", this.j.a());
        htw.a("dt", this.b.format(new Date(jtp.a.a())));
        String str2 = "1";
        htw.a("suppress404", str2);
        htw.a("suppress_response_codes", str2);
        htw.a("product", c2 ? "" : "shuffle");
        return RequestBuilder.get(hvd.a(htw).a(new Builder().scheme("hm").appendEncodedPath(hvd.a())).toString()).build();
    }

    /* access modifiers changed from: private */
    public List<T> a(Response response, hvd<T> hvd) {
        try {
            HttpCallbackReceiver.defaultVerifyResponse(response);
            return hvd.a(response.getBody(), this.g);
        } catch (Exception e2) {
            Assertion.a("Spaces parsing has failed", (Throwable) e2);
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Request request) {
        return wit.a((ObservableSource<T>) this.e.resolve(request), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Exception while trying to download content.", new Object[0]);
        this.a.a(null);
    }

    public final void a() {
        if (!this.k.isUnsubscribed()) {
            this.k.unsubscribe();
        }
    }

    public final void a(int i2, int i3) {
        hvd hvd = (hvd) this.i.get();
        if (hvd != null) {
            xii a2 = xii.a(wit.a((xfk<T>) this.d.a()).a(1), wit.a((xfk<T>) this.h.a).c((xiy<? super T, Boolean>) $$Lambda$02gp8ebwmA4MuLHDaqFeeJlcWR0.INSTANCE).a(1).d(4000, TimeUnit.MILLISECONDS), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$hvc$ssgIs4EdrzHUzqjhS2mgf7WrEWg<Object,Object,Object>(this, hvd, i2, i3)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$hvc$eXghcejE2zmIlRJZxofaPq01ls<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$hvc$DfzRa507UxbtyVQf8hAkiG_WiuM<Object,Object>(this, hvd)).a(this.f);
            hva<T> hva = this.a;
            hva.getClass();
            this.k = a2.a((xis<? super T>) new $$Lambda$GU5NxQvNXuTpSBYBGeo8H2M3zyo<Object>(hva), (xis<Throwable>) new $$Lambda$hvc$u29J0zRjao0OlHGbuU8FoOTGDys<Throwable>(this));
        }
    }
}
