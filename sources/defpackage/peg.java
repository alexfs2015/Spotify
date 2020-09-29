package defpackage;

import android.content.Context;

/* renamed from: peg reason: default package */
public final class peg implements wig<pef> {
    private final wzi<Context> a;
    private final wzi<jyg> b;
    private final wzi<rwl> c;

    private peg(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static peg a(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        return new peg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pef((Context) this.a.get(), (jyg) this.b.get(), (rwl) this.c.get());
    }
}
