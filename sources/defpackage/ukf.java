package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ukf reason: default package */
public final class ukf implements vua<gky<Offer>> {
    private final wlc<gkz> a;
    private final wlc<ObjectMapper> b;

    private ukf(wlc<gkz> wlc, wlc<ObjectMapper> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ukf a(wlc<gkz> wlc, wlc<ObjectMapper> wlc2) {
        return new ukf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(CC.a((gkz) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
