package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Response;

/* renamed from: iky reason: default package */
public final class iky implements vua<ikx> {
    private final wlc<Context> a;
    private final wlc<gky<Response>> b;
    private final wlc<wug> c;

    private iky(wlc<Context> wlc, wlc<gky<Response>> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iky a(wlc<Context> wlc, wlc<gky<Response>> wlc2, wlc<wug> wlc3) {
        return new iky(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ikx((Context) this.a.get(), (gky) this.b.get(), (wug) this.c.get());
    }
}
