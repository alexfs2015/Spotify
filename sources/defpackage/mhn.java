package defpackage;

/* renamed from: mhn reason: default package */
public final class mhn implements wig<a> {
    private final wzi<mhk> a;
    private final wzi<hhc> b;
    private final wzi<mhe> c;
    private final wzi<mho> d;

    private mhn(wzi<mhk> wzi, wzi<hhc> wzi2, wzi<mhe> wzi3, wzi<mho> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mhn a(wzi<mhk> wzi, wzi<hhc> wzi2, wzi<mhe> wzi3, wzi<mho> wzi4) {
        return new mhn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (a) wil.a(new mhq((mhk) this.a.get(), (mhe) this.c.get(), (hhc) this.b.get(), (mho) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
