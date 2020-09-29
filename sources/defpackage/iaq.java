package defpackage;

import java.util.Random;

/* renamed from: iaq reason: default package */
public final class iaq implements vua<iap> {
    private final wlc<hzr> a;
    private final wlc<hzo> b;
    private final wlc<Random> c;

    public static iap a(hzr hzr, hzo hzo) {
        return new iap(hzr, hzo);
    }

    public final /* synthetic */ Object get() {
        iap iap = new iap((hzr) this.a.get(), (hzo) this.b.get());
        iap.a = (Random) this.c.get();
        return iap;
    }
}
