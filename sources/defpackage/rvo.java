package defpackage;

/* renamed from: rvo reason: default package */
public final class rvo implements wig<rvn> {
    private final wzi<juc> a;
    private final wzi<ruv> b;
    private final wzi<hxx> c;
    private final wzi<ruo> d;
    private final wzi<Boolean> e;

    private rvo(wzi<juc> wzi, wzi<ruv> wzi2, wzi<hxx> wzi3, wzi<ruo> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rvo a(wzi<juc> wzi, wzi<ruv> wzi2, wzi<hxx> wzi3, wzi<ruo> wzi4, wzi<Boolean> wzi5) {
        rvo rvo = new rvo(wzi, wzi2, wzi3, wzi4, wzi5);
        return rvo;
    }

    public final /* synthetic */ Object get() {
        rvn rvn = new rvn((juc) this.a.get(), (ruv) this.b.get(), (hxx) this.c.get(), (ruo) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return rvn;
    }
}
