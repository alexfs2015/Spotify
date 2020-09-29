package defpackage;

/* renamed from: nqb reason: default package */
public final class nqb implements wig<oya> {
    private final wzi<oyb> a;
    private final wzi<gkq> b;

    private nqb(wzi<oyb> wzi, wzi<gkq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nqb a(wzi<oyb> wzi, wzi<gkq> wzi2) {
        return new nqb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oya) wil.a(((oyb) this.a.get()).a((gkq) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
