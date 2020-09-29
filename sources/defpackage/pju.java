package defpackage;

/* renamed from: pju reason: default package */
public final class pju implements wig<pjt> {
    private final wzi<gwt> a;
    private final wzi<gwm> b;
    private final wzi<pit> c;

    private pju(wzi<gwt> wzi, wzi<gwm> wzi2, wzi<pit> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pju a(wzi<gwt> wzi, wzi<gwm> wzi2, wzi<pit> wzi3) {
        return new pju(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pjt((gwt) this.a.get(), (gwm) this.b.get(), (pit) this.c.get());
    }
}
