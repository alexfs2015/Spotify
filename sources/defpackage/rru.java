package defpackage;

/* renamed from: rru reason: default package */
public final class rru implements wig<rrt> {
    private final wzi<rqw> a;
    private final wzi<wgj> b;

    private rru(wzi<rqw> wzi, wzi<wgj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rru a(wzi<rqw> wzi, wzi<wgj> wzi2) {
        return new rru(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rrt((rqw) this.a.get(), (wgj) this.b.get());
    }
}
