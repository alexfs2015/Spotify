package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvo reason: default package */
public final class uvo implements wig<vas<Offer>> {
    private final wzi<var<Offer>> a;

    private uvo(wzi<var<Offer>> wzi) {
        this.a = wzi;
    }

    public static uvo a(wzi<var<Offer>> wzi) {
        return new uvo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vas) wil.a(CC.a((var) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
