package defpackage;

import android.content.Context;

/* renamed from: lxq reason: default package */
public final class lxq implements wig<lxp> {
    private final wzi<Context> a;
    private final wzi<fqn> b;

    private lxq(wzi<Context> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lxq a(wzi<Context> wzi, wzi<fqn> wzi2) {
        return new lxq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lxp((Context) this.a.get(), (fqn) this.b.get());
    }
}
