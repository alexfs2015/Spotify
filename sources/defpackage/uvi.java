package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvi reason: default package */
public final class uvi implements wig<xii<Optional<Offer>>> {
    private final wzi<vas<Offer>> a;
    private final wzi<xii<String>> b;

    private uvi(wzi<vas<Offer>> wzi, wzi<xii<String>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uvi a(wzi<vas<Offer>> wzi, wzi<xii<String>> wzi2) {
        return new uvi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((vas) this.a.get(), (xii) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
