package defpackage;

/* renamed from: qjm reason: default package */
public final class qjm implements vua<qjl> {
    private final wlc<qho> a;
    private final wlc<qkj> b;
    private final wlc<qja> c;
    private final wlc<qju> d;

    private qjm(wlc<qho> wlc, wlc<qkj> wlc2, wlc<qja> wlc3, wlc<qju> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qjm a(wlc<qho> wlc, wlc<qkj> wlc2, wlc<qja> wlc3, wlc<qju> wlc4) {
        return new qjm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qjl((qho) this.a.get(), (qkj) this.b.get(), (qja) this.c.get(), (qju) this.d.get());
    }
}
