package defpackage;

/* renamed from: pok reason: default package */
public final class pok implements wig<poj> {
    private final wzi<pnz> a;
    private final wzi<pob> b;

    private pok(wzi<pnz> wzi, wzi<pob> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pok a(wzi<pnz> wzi, wzi<pob> wzi2) {
        return new pok(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new poj((pnz) this.a.get(), (pob) this.b.get());
    }
}
