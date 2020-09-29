package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvq reason: default package */
public final class uvq implements wig<gmm<Offer>> {
    private final wzi<gmn> a;
    private final wzi<ObjectMapper> b;

    private uvq(wzi<gmn> wzi, wzi<ObjectMapper> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uvq a(wzi<gmn> wzi, wzi<ObjectMapper> wzi2) {
        return new uvq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(CC.a((gmn) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
