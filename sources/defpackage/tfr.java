package defpackage;

import android.content.Context;

/* renamed from: tfr reason: default package */
public final class tfr implements wig<tfq> {
    private final wzi<uzg> a;
    private final wzi<fqn> b;
    private final wzi<Context> c;
    private final wzi<vrr> d;

    private tfr(wzi<uzg> wzi, wzi<fqn> wzi2, wzi<Context> wzi3, wzi<vrr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tfr a(wzi<uzg> wzi, wzi<fqn> wzi2, wzi<Context> wzi3, wzi<vrr> wzi4) {
        return new tfr(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new tfq((uzg) this.a.get(), (fqn) this.b.get(), (Context) this.c.get(), (vrr) this.d.get());
    }
}
