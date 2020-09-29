package defpackage;

/* renamed from: log reason: default package */
public final class log implements wig<gfk<fli>> {
    private final wzi<gfj> a;

    private log(wzi<gfj> wzi) {
        this.a = wzi;
    }

    public static log a(wzi<gfj> wzi) {
        return new log(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gfk) wil.a(new gfv((gfj) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
