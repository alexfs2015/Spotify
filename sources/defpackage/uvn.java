package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvn reason: default package */
public final class uvn implements wig<xir> {
    private final wzi<vas<Offer>> a;

    private uvn(wzi<vas<Offer>> wzi) {
        this.a = wzi;
    }

    public static uvn a(wzi<vas<Offer>> wzi) {
        return new uvn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xir) wil.a(CC.a((vas) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
