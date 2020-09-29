package defpackage;

/* renamed from: vsw reason: default package */
public final class vsw implements wig<vsu> {
    private final wzi<vub> a;

    private vsw(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsu a(vub vub) {
        return (vsu) wil.a(vsv.a(vub), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vsw a(wzi<vub> wzi) {
        return new vsw(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((vub) this.a.get());
    }
}
