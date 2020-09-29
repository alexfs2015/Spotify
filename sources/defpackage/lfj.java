package defpackage;

/* renamed from: lfj reason: default package */
public final class lfj implements wig<xgp> {
    private final wzi<giz> a;
    private final wzi<rwl> b;

    private lfj(wzi<giz> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lfj a(wzi<giz> wzi, wzi<rwl> wzi2) {
        return new lfj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (xgp) wil.a(giy.a(((giz) this.a.get()).b, (rwl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
