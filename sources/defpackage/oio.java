package defpackage;

/* renamed from: oio reason: default package */
public final class oio implements wig<gnt<ohl>> {
    private final wzi<gnl<ohl>> a;
    private final wzi<gnu<ohl>> b;
    private final wzi<a> c;

    private oio(wzi<gnl<ohl>> wzi, wzi<gnu<ohl>> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static oio a(wzi<gnl<ohl>> wzi, wzi<gnu<ohl>> wzi2, wzi<a> wzi3) {
        return new oio(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (gnt) wil.a(new gnt((gnl) this.a.get(), (gnu) this.b.get(), (a) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
