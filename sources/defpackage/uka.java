package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uka reason: default package */
public final class uka implements vua<wud<Offer>> {
    private final wlc<wud<Offer>> a;

    private uka(wlc<wud<Offer>> wlc) {
        this.a = wlc;
    }

    public static uka a(wlc<wud<Offer>> wlc) {
        return new uka(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((wud) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
