package defpackage;

import android.content.Context;

/* renamed from: ufl reason: default package */
public final class ufl implements wig<ufk> {
    private final wzi<Context> a;
    private final wzi<tyx> b;
    private final wzi<ugg> c;

    private ufl(wzi<Context> wzi, wzi<tyx> wzi2, wzi<ugg> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ufl a(wzi<Context> wzi, wzi<tyx> wzi2, wzi<ugg> wzi3) {
        return new ufl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ufk((Context) this.a.get(), (tyx) this.b.get(), (ugg) this.c.get());
    }
}
