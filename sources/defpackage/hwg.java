package defpackage;

import android.content.Context;

/* renamed from: hwg reason: default package */
public final class hwg implements wig<hwe> {
    private final wzi<Context> a;
    private final wzi<gix> b;
    private final wzi<rwl> c;
    private final wzi<gcb> d;
    private final wzi<giz> e;
    private final wzi<jyg> f;

    private hwg(wzi<Context> wzi, wzi<gix> wzi2, wzi<rwl> wzi3, wzi<gcb> wzi4, wzi<giz> wzi5, wzi<jyg> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static hwg a(wzi<Context> wzi, wzi<gix> wzi2, wzi<rwl> wzi3, wzi<gcb> wzi4, wzi<giz> wzi5, wzi<jyg> wzi6) {
        hwg hwg = new hwg(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return hwg;
    }

    public final /* synthetic */ Object get() {
        hwe hwe = new hwe((Context) this.a.get(), (gix) this.b.get(), (rwl) this.c.get(), (gcb) this.d.get(), (giz) this.e.get(), (jyg) this.f.get());
        return hwe;
    }
}
