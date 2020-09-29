package defpackage;

/* renamed from: txy reason: default package */
public final class txy implements wig<txx> {
    private final wzi<a> a;
    private final wzi<a> b;
    private final wzi<a> c;

    private txy(wzi<a> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static txy a(wzi<a> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        return new txy(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new txx(wif.b(this.a), (a) this.b.get(), (a) this.c.get());
    }
}
