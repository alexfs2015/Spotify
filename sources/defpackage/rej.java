package defpackage;

import android.os.Handler;

/* renamed from: rej reason: default package */
public final class rej implements wig<hfs> {
    private final wzi<hft> a;

    private rej(wzi<hft> wzi) {
        this.a = wzi;
    }

    public static rej a(wzi<hft> wzi) {
        return new rej(wzi);
    }

    public final /* synthetic */ Object get() {
        hft hft = (hft) this.a.get();
        hfr hfr = new hfr(new Handler(), hft.b, 200);
        hft.a.a(hfr);
        return (hfs) wil.a(hfr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
