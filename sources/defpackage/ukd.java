package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ukd reason: default package */
public final class ukd implements vua<upn<Offer>> {
    private final wlc<upm<Offer>> a;

    private ukd(wlc<upm<Offer>> wlc) {
        this.a = wlc;
    }

    public static ukd a(wlc<upm<Offer>> wlc) {
        return new ukd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (upn) vuf.a(CC.a((upm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
