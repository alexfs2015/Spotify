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

/* renamed from: hsk reason: default package */
public final class hsk<T> {
    private final hsi<T> a;
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final String c;
    private final hec d;
    private final RxResolver e;
    private final wug f;
    private final ObjectMapper g;
    private final hvl h;
    private final WeakReference<hsl<T>> i;
    private wuk j = xaj.b();

    public hsk(hsl<T> hsl, hsi<T> hsi, String str, RxResolver rxResolver, hec hec, hvl hvl, wug wug, ObjectMapper objectMapper) {
        this.i = new WeakReference<>(hsl);
        this.a = hsi;
        this.c = str;
        this.e = rxResolver;
        this.d = hec;
        this.h = hvl;
        this.f = wug;
        this.g = objectMapper;
    }

    public final void a() {
        if (!this.j.isUnsubscribed()) {
            this.j.unsubscribe();
        }
    }

    public final void a(int i2, int i3) {
        hsl hsl = (hsl) this.i.get();
        if (hsl != null) {
            wud a2 = wud.a(vun.a((wrf<T>) this.d.a()).a(1), vun.a((wrf<T>) this.h.a).c((wut<? super T, Boolean>) $$Lambda$aihsryigh8IbmprELa05RucwrPA.INSTANCE).a(1).d(4000, TimeUnit.MILLISECONDS), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$hsk$sssK8nXDBSL1AK5ESKtvxsTqo8<Object,Object,Object>(this, hsl, i2, i3)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$hsk$M2mIsmLSXNXsDiTrdhIrqpqXo<Object,Object>(this)).f(new $$Lambda$hsk$T0IYn8xjGvmiTfUitMCUwsPVIWs(this, hsl)).a(this.f);
            hsi<T> hsi = this.a;
            hsi.getClass();
            this.j = a2.a((wun<? super T>) new $$Lambda$aOoFGnetuQRmfpTkmFwdukbeHsU<Object>(hsi), (wun<Throwable>) new $$Lambda$hsk$WbQ3VxDIfwrLWqHwufgJyDDXg<Throwable>(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Request request) {
        return vun.a((ObservableSource<T>) this.e.resolve(request), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Exception while trying to download content.", new Object[0]);
        this.a.a(null);
    }

    /* access modifiers changed from: private */
    public List<T> a(Response response, hsl<T> hsl) {
        try {
            HttpCallbackReceiver.defaultVerifyResponse(response);
            return hsl.a(response.getBody(), this.g);
        } catch (Exception e2) {
            Assertion.a("Spaces parsing has failed", (Throwable) e2);
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Request a(hsl hsl, int i2, int i3, fpt fpt, SessionState sessionState) {
        boolean c2 = jsl.c(fpt);
        hrk hrk = new hrk();
        hrk.a("page", String.valueOf(i2));
        hrk.a("per_page", String.valueOf(i3));
        String str = this.c;
        if (str != null) {
            hrk.a("region", str);
        }
        hrk.a("locale", SpotifyLocale.a());
        hrk.a("platform", "android");
        hrk.a("version", ((jro) ggw.a(jro.class)).a());
        hrk.a("dt", this.b.format(new Date(jrf.a.a())));
        String str2 = "1";
        hrk.a("suppress404", str2);
        hrk.a("suppress_response_codes", str2);
        hrk.a("product", c2 ? "" : "shuffle");
        return RequestBuilder.get(hsl.a(hrk).a(new Builder().scheme("hm").appendEncodedPath(hsl.a())).toString()).build();
    }
}
