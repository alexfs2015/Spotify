package defpackage;

import android.content.Context;

/* renamed from: sxu reason: default package */
public final class sxu implements wig<sxt> {
    private final wzi<Context> a;
    private final wzi<szl> b;

    private sxu(wzi<Context> wzi, wzi<szl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sxu a(wzi<Context> wzi, wzi<szl> wzi2) {
        return new sxu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sxt((Context) this.a.get(), (szl) this.b.get());
    }
}
