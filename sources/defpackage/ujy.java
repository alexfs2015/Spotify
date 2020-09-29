package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ujy reason: default package */
public final class ujy implements vua<upm<Offer>> {
    private final wlc<upk> a;
    private final wlc<ObjectMapper> b;

    private ujy(wlc<upk> wlc, wlc<ObjectMapper> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ujy a(wlc<upk> wlc, wlc<ObjectMapper> wlc2) {
        return new ujy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (upm) vuf.a(CC.a((upk) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
