package defpackage;

/* renamed from: oce reason: default package */
public final class oce implements wig<ocd> {
    private final wzi<seq> a;
    private final wzi<ocj> b;

    private oce(wzi<seq> wzi, wzi<ocj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oce a(wzi<seq> wzi, wzi<ocj> wzi2) {
        return new oce(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ocd((seq) this.a.get(), (ocj) this.b.get());
    }
}
