package defpackage;

/* renamed from: hzd reason: default package */
public final class hzd implements wig<hzx> {
    private final wzi<rwl> a;
    private final wzi<gmn> b;

    private hzd(wzi<rwl> wzi, wzi<gmn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hzd a(wzi<rwl> wzi, wzi<gmn> wzi2) {
        return new hzd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hzx) wil.a(CC.a((rwl) this.a.get(), (gmn) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
