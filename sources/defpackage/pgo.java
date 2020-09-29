package defpackage;

/* renamed from: pgo reason: default package */
public final class pgo implements wig<pgn> {
    private final wzi<szp> a;
    private final wzi<pgp> b;

    private pgo(wzi<szp> wzi, wzi<pgp> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pgo a(wzi<szp> wzi, wzi<pgp> wzi2) {
        return new pgo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pgn((szp) this.a.get(), (pgp) this.b.get());
    }
}
