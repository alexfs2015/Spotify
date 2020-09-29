package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvk reason: default package */
public final class uvk implements wig<xii<Offer>> {
    private final wzi<gmm<Offer>> a;
    private final wzi<vas<Offer>> b;
    private final wzi<xii<String>> c;
    private final wzi<Request> d;
    private final wzi<hhc> e;

    private uvk(wzi<gmm<Offer>> wzi, wzi<vas<Offer>> wzi2, wzi<xii<String>> wzi3, wzi<Request> wzi4, wzi<hhc> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static uvk a(wzi<gmm<Offer>> wzi, wzi<vas<Offer>> wzi2, wzi<xii<String>> wzi3, wzi<Request> wzi4, wzi<hhc> wzi5) {
        uvk uvk = new uvk(wzi, wzi2, wzi3, wzi4, wzi5);
        return uvk;
    }

    public final /* synthetic */ Object get() {
        hhc hhc = (hhc) this.e.get();
        return (xii) wil.a(CC.a((gmm) this.a.get(), (vas) this.b.get(), (xii) this.c.get(), (Request) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
