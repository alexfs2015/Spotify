package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvr reason: default package */
public final class uvr implements wig<xii<Offer>> {
    private final wzi<xii<Optional<Offer>>> a;
    private final wzi<xii<Offer>> b;

    private uvr(wzi<xii<Optional<Offer>>> wzi, wzi<xii<Offer>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uvr a(wzi<xii<Optional<Offer>>> wzi, wzi<xii<Offer>> wzi2) {
        return new uvr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((xii) this.a.get(), (xii) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
