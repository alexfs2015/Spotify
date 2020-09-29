package defpackage;

import android.os.Looper;

/* renamed from: kbm reason: default package */
public final class kbm implements wig<kdp> {
    private final wzi<Looper> a;
    private final wzi<kah> b;
    private final wzi<kcz> c;
    private final wzi<rwl> d;
    private final wzi<jlr> e;

    private kbm(wzi<Looper> wzi, wzi<kah> wzi2, wzi<kcz> wzi3, wzi<rwl> wzi4, wzi<jlr> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static kbm a(wzi<Looper> wzi, wzi<kah> wzi2, wzi<kcz> wzi3, wzi<rwl> wzi4, wzi<jlr> wzi5) {
        kbm kbm = new kbm(wzi, wzi2, wzi3, wzi4, wzi5);
        return kbm;
    }

    public final /* synthetic */ Object get() {
        kdp kdp = new kdp((Looper) this.a.get(), (kah) this.b.get(), (kcz) this.c.get(), (rwl) this.d.get(), (jlr) this.e.get());
        return (kdp) wil.a(kdp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
