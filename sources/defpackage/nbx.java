package defpackage;

/* renamed from: nbx reason: default package */
public final class nbx implements wig<nbw> {
    private final wzi<fqn> a;
    private final wzi<uix> b;
    private final wzi<rou> c;

    private nbx(wzi<fqn> wzi, wzi<uix> wzi2, wzi<rou> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nbx a(wzi<fqn> wzi, wzi<uix> wzi2, wzi<rou> wzi3) {
        return new nbx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new nbw((fqn) this.a.get(), (uix) this.b.get(), (rou) this.c.get());
    }
}
