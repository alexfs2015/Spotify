package defpackage;

import android.content.Context;

/* renamed from: qqj reason: default package */
public final class qqj implements wig<qqi> {
    private final wzi<kk> a;
    private final wzi<Integer> b;
    private final wzi<fqn> c;
    private final wzi<Context> d;

    private qqj(wzi<kk> wzi, wzi<Integer> wzi2, wzi<fqn> wzi3, wzi<Context> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qqj a(wzi<kk> wzi, wzi<Integer> wzi2, wzi<fqn> wzi3, wzi<Context> wzi4) {
        return new qqj(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qqi((kk) this.a.get(), ((Integer) this.b.get()).intValue(), (fqn) this.c.get(), (Context) this.d.get());
    }
}
