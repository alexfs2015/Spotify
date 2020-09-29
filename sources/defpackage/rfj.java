package defpackage;

import android.content.Context;

/* renamed from: rfj reason: default package */
public final class rfj implements wig<rfi> {
    private final wzi<rbg> a;
    private final wzi<Context> b;
    private final wzi<kk> c;
    private final wzi<rlh> d;
    private final wzi<rks> e;

    private rfj(wzi<rbg> wzi, wzi<Context> wzi2, wzi<kk> wzi3, wzi<rlh> wzi4, wzi<rks> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rfj a(wzi<rbg> wzi, wzi<Context> wzi2, wzi<kk> wzi3, wzi<rlh> wzi4, wzi<rks> wzi5) {
        rfj rfj = new rfj(wzi, wzi2, wzi3, wzi4, wzi5);
        return rfj;
    }

    public final /* synthetic */ Object get() {
        rfi rfi = new rfi((rbg) this.a.get(), (Context) this.b.get(), (kk) this.c.get(), (rlh) this.d.get(), (rks) this.e.get());
        return rfi;
    }
}
