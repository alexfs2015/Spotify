package defpackage;

import android.content.Context;

/* renamed from: inh reason: default package */
public final class inh implements wig<ing> {
    private final wzi<Context> a;
    private final wzi<vwu> b;
    private final wzi<ini> c;

    private inh(wzi<Context> wzi, wzi<vwu> wzi2, wzi<ini> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static inh a(wzi<Context> wzi, wzi<vwu> wzi2, wzi<ini> wzi3) {
        return new inh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ing((Context) this.a.get(), (vwu) this.b.get(), (ini) this.c.get());
    }
}
