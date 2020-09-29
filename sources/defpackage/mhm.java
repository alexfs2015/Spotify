package defpackage;

/* renamed from: mhm reason: default package */
public final class mhm implements wig<a> {
    private final wzi<mhk> a;
    private final wzi<mhr> b;
    private final wzi<hhc> c;
    private final wzi<mhe> d;
    private final wzi<mho> e;

    private mhm(wzi<mhk> wzi, wzi<mhr> wzi2, wzi<hhc> wzi3, wzi<mhe> wzi4, wzi<mho> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mhm a(wzi<mhk> wzi, wzi<mhr> wzi2, wzi<hhc> wzi3, wzi<mhe> wzi4, wzi<mho> wzi5) {
        mhm mhm = new mhm(wzi, wzi2, wzi3, wzi4, wzi5);
        return mhm;
    }

    public final /* synthetic */ Object get() {
        mhr mhr = (mhr) this.b.get();
        hhc hhc = (hhc) this.c.get();
        mht mht = new mht((mhe) this.d.get(), mhr, hhc, (mhk) this.a.get(), (mho) this.e.get());
        return (a) wil.a(mht, "Cannot return null from a non-@Nullable @Provides method");
    }
}
