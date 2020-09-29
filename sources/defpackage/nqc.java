package defpackage;

/* renamed from: nqc reason: default package */
public final class nqc implements wig<ous> {
    private final wzi<out> a;
    private final wzi<gkq> b;

    private nqc(wzi<out> wzi, wzi<gkq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nqc a(wzi<out> wzi, wzi<gkq> wzi2) {
        return new nqc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ous) wil.a(((out) this.a.get()).a((gkq) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
