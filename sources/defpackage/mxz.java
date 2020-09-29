package defpackage;

/* renamed from: mxz reason: default package */
public final class mxz implements wig<mxs> {
    private final wzi<Boolean> a;
    private final wzi<mzz> b;
    private final wzi<mxt> c;

    private mxz(wzi<Boolean> wzi, wzi<mzz> wzi2, wzi<mxt> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mxz a(wzi<Boolean> wzi, wzi<mzz> wzi2, wzi<mxt> wzi3) {
        return new mxz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (mzz) this.b.get();
        Object obj2 = (mxt) this.c.get();
        if (!((Boolean) this.a.get()).booleanValue()) {
            obj = obj2;
        }
        return (mxs) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
