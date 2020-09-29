package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvl reason: default package */
public final class uvl implements wig<xii<Offer>> {
    private final wzi<xii<Offer>> a;

    private uvl(wzi<xii<Offer>> wzi) {
        this.a = wzi;
    }

    public static uvl a(wzi<xii<Offer>> wzi) {
        return new uvl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((xii) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
