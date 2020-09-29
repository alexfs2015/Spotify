package defpackage;

/* renamed from: lod reason: default package */
public final class lod implements wig<gfj> {
    private final wzi<gfn> a;

    private lod(wzi<gfn> wzi) {
        this.a = wzi;
    }

    public static lod a(wzi<gfn> wzi) {
        return new lod(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gfj) wil.a(((gfn) this.a.get()).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
