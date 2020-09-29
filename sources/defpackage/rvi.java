package defpackage;

/* renamed from: rvi reason: default package */
public final class rvi implements wig<rvh> {
    private final wzi<run> a;
    private final wzi<rut> b;
    private final wzi<ruo> c;
    private final wzi<rvn> d;

    private rvi(wzi<run> wzi, wzi<rut> wzi2, wzi<ruo> wzi3, wzi<rvn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rvi a(wzi<run> wzi, wzi<rut> wzi2, wzi<ruo> wzi3, wzi<rvn> wzi4) {
        return new rvi(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rvh((run) this.a.get(), (rut) this.b.get(), (ruo) this.c.get(), (rvn) this.d.get());
    }
}
