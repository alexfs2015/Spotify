package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvj reason: default package */
public final class uvj implements wig<var<Offer>> {
    private final wzi<vap> a;
    private final wzi<ObjectMapper> b;

    private uvj(wzi<vap> wzi, wzi<ObjectMapper> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uvj a(wzi<vap> wzi, wzi<ObjectMapper> wzi2) {
        return new uvj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (var) wil.a(CC.a((vap) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
