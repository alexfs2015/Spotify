package defpackage;

import android.content.Context;

/* renamed from: hfq reason: default package */
public final class hfq implements wig<hfp> {
    private final wzi<Context> a;
    private final wzi<jyg> b;
    private final wzi<rwl> c;

    private hfq(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hfq a(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        return new hfq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hfp((Context) this.a.get(), (jyg) this.b.get(), (rwl) this.c.get());
    }
}
