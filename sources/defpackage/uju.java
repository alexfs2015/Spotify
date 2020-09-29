package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uju reason: default package */
public final class uju implements vua<jlp> {
    private final wlc<gky<Offer>> a;
    private final wlc<jlm> b;
    private final wlc<jrs> c;

    public static jlp a(gky<Offer> gky, jlm jlm, jrs jrs) {
        return (jlp) vuf.a(CC.a(gky, jlm, jrs), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gky) this.a.get(), (jlm) this.b.get(), (jrs) this.c.get());
    }
}
