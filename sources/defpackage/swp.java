package defpackage;

/* renamed from: swp reason: default package */
public final class swp implements wig<swo> {
    private final wzi<b> a;
    private final wzi<tmu> b;

    private swp(wzi<b> wzi, wzi<tmu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static swp a(wzi<b> wzi, wzi<tmu> wzi2) {
        return new swp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new swo((b) this.a.get(), (tmu) this.b.get());
    }
}
