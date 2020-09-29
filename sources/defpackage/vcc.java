package defpackage;

import android.content.Context;

/* renamed from: vcc reason: default package */
public final class vcc implements wig<vcb> {
    private final wzi<Context> a;
    private final wzi<jyg> b;
    private final wzi<rwl> c;

    private vcc(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vcc a(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        return new vcc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new vcb((Context) this.a.get(), (jyg) this.b.get(), (rwl) this.c.get());
    }
}
