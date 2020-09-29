package defpackage;

/* renamed from: gjj reason: default package */
public final class gjj implements wig<gix> {
    private final wzi<giz> a;
    private final wzi<rwl> b;

    private gjj(wzi<giz> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gjj a(wzi<giz> wzi, wzi<rwl> wzi2) {
        return new gjj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gix) wil.a(CC.a((giz) this.a.get(), (rwl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
