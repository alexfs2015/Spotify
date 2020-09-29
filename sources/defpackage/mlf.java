package defpackage;

/* renamed from: mlf reason: default package */
public final class mlf implements wig<mle> {
    private final wzi<mmf> a;
    private final wzi<mmr> b;
    private final wzi<mmt> c;

    private mlf(wzi<mmf> wzi, wzi<mmr> wzi2, wzi<mmt> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mlf a(wzi<mmf> wzi, wzi<mmr> wzi2, wzi<mmt> wzi3) {
        return new mlf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mle((mmf) this.a.get(), (mmr) this.b.get(), (mmt) this.c.get());
    }
}
