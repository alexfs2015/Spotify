package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ujz reason: default package */
public final class ujz implements vua<wud<Offer>> {
    private final wlc<gky<Offer>> a;
    private final wlc<upn<Offer>> b;
    private final wlc<wud<String>> c;
    private final wlc<Request> d;
    private final wlc<heg> e;

    private ujz(wlc<gky<Offer>> wlc, wlc<upn<Offer>> wlc2, wlc<wud<String>> wlc3, wlc<Request> wlc4, wlc<heg> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ujz a(wlc<gky<Offer>> wlc, wlc<upn<Offer>> wlc2, wlc<wud<String>> wlc3, wlc<Request> wlc4, wlc<heg> wlc5) {
        ujz ujz = new ujz(wlc, wlc2, wlc3, wlc4, wlc5);
        return ujz;
    }

    public final /* synthetic */ Object get() {
        heg heg = (heg) this.e.get();
        return (wud) vuf.a(CC.a((gky) this.a.get(), (upn) this.b.get(), (wud) this.c.get(), (Request) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
