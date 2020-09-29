package defpackage;

/* renamed from: nld reason: default package */
public final class nld implements wig<Boolean> {
    private final wzi<rqb> a;
    private final wzi<uix> b;
    private final wzi<fqn> c;

    private nld(wzi<rqb> wzi, wzi<uix> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nld a(wzi<rqb> wzi, wzi<uix> wzi2, wzi<fqn> wzi3) {
        return new nld(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(CC.a((rqb) this.a.get(), (uix) this.b.get(), (fqn) this.c.get()));
    }
}
