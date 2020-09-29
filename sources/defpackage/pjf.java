package defpackage;

/* renamed from: pjf reason: default package */
public final class pjf implements wig<pje> {
    private final wzi<a> a;
    private final wzi<a> b;
    private final wzi<a> c;
    private final wzi<a> d;

    private pjf(wzi<a> wzi, wzi<a> wzi2, wzi<a> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pjf a(wzi<a> wzi, wzi<a> wzi2, wzi<a> wzi3, wzi<a> wzi4) {
        return new pjf(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pje((a) this.a.get(), (a) this.b.get(), (a) this.c.get(), (a) this.d.get());
    }
}
