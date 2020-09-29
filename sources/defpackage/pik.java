package defpackage;

/* renamed from: pik reason: default package */
public final class pik implements wig<Boolean> {
    private final wzi<rqb> a;
    private final wzi<fqn> b;

    private pik(wzi<rqb> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pik a(wzi<rqb> wzi, wzi<fqn> wzi2) {
        return new pik(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!((rqb) this.a.get()).a((fqn) this.b.get()));
    }
}
