package defpackage;

/* renamed from: rme reason: default package */
public final class rme implements wig<rmd> {
    private final wzi<ruc> a;
    private final wzi<rmh> b;

    private rme(wzi<ruc> wzi, wzi<rmh> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rme a(wzi<ruc> wzi, wzi<rmh> wzi2) {
        return new rme(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rmd((ruc) this.a.get(), (rmh) this.b.get());
    }
}
