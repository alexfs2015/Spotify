package defpackage;

import java.util.Set;

/* renamed from: scs reason: default package */
public final class scs implements wig<scr> {
    private final wzi<seb> a;
    private final wzi<scx> b;
    private final wzi<scz> c;
    private final wzi<sde> d;
    private final wzi<Set<scp>> e;

    private scs(wzi<seb> wzi, wzi<scx> wzi2, wzi<scz> wzi3, wzi<sde> wzi4, wzi<Set<scp>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static scs a(wzi<seb> wzi, wzi<scx> wzi2, wzi<scz> wzi3, wzi<sde> wzi4, wzi<Set<scp>> wzi5) {
        scs scs = new scs(wzi, wzi2, wzi3, wzi4, wzi5);
        return scs;
    }

    public final /* synthetic */ Object get() {
        scr scr = new scr((seb) this.a.get(), (scx) this.b.get(), (scz) this.c.get(), (sde) this.d.get(), (Set) this.e.get());
        return scr;
    }
}
