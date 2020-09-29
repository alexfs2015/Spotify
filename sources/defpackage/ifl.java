package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ifl reason: default package */
public final class ifl implements ifu {
    private final ifr a;
    private final ifx b;
    private final ifp c;
    private final ifv d;

    public ifl(ifr ifr, ifx ifx, ifp ifp, ifv ifv) {
        this.a = ifr;
        this.b = ifx;
        this.c = ifp;
        this.d = ifv;
    }

    public final Map<Class<? extends ift>, ift> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(ifr.class, this.a);
        hashMap.put(ifx.class, this.b);
        hashMap.put(ifp.class, this.c);
        hashMap.put(ifv.class, this.d);
        return hashMap;
    }
}
