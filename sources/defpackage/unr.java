package defpackage;

import android.content.Context;

/* renamed from: unr reason: default package */
public final class unr implements wig<unq> {
    private final wzi<Context> a;
    private final wzi<unp> b;
    private final wzi<fqn> c;

    private unr(wzi<Context> wzi, wzi<unp> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static unr a(wzi<Context> wzi, wzi<unp> wzi2, wzi<fqn> wzi3) {
        return new unr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new unq((Context) this.a.get(), (unp) this.b.get(), (fqn) this.c.get());
    }
}
