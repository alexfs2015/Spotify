package defpackage;

import android.content.Context;

/* renamed from: nje reason: default package */
public final class nje implements wig<niz> {
    private final wzi<Context> a;
    private final wzi<String> b;
    private final wzi<rwl> c;
    private final wzi<String> d;
    private final wzi<Boolean> e;

    private nje(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3, wzi<String> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nje a(wzi<Context> wzi, wzi<String> wzi2, wzi<rwl> wzi3, wzi<String> wzi4, wzi<Boolean> wzi5) {
        nje nje = new nje(wzi, wzi2, wzi3, wzi4, wzi5);
        return nje;
    }

    public final /* synthetic */ Object get() {
        niz niz = new niz((Context) this.a.get(), (String) this.b.get(), (rwl) this.c.get(), (String) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return niz;
    }
}
