package defpackage;

/* renamed from: ncv reason: default package */
public final class ncv implements wig<ncu> {
    private final wzi<ncw> a;
    private final wzi<rqb> b;
    private final wzi<uix> c;
    private final wzi<fqn> d;

    private ncv(wzi<ncw> wzi, wzi<rqb> wzi2, wzi<uix> wzi3, wzi<fqn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ncv a(wzi<ncw> wzi, wzi<rqb> wzi2, wzi<uix> wzi3, wzi<fqn> wzi4) {
        return new ncv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ncu((ncw) this.a.get(), (rqb) this.b.get(), (uix) this.c.get(), (fqn) this.d.get());
    }
}
