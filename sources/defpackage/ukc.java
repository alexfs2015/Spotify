package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ukc reason: default package */
public final class ukc implements vua<wum> {
    private final wlc<upn<Offer>> a;

    private ukc(wlc<upn<Offer>> wlc) {
        this.a = wlc;
    }

    public static ukc a(wlc<upn<Offer>> wlc) {
        return new ukc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wum) vuf.a(CC.a((upn) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
