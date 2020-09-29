package defpackage;

/* renamed from: iht reason: default package */
public final class iht implements wig<ihs> {
    private final wzi<hyh> a;
    private final wzi<jlr> b;
    private final wzi<hyi> c;
    private final wzi<ihr> d;

    private iht(wzi<hyh> wzi, wzi<jlr> wzi2, wzi<hyi> wzi3, wzi<ihr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static iht a(wzi<hyh> wzi, wzi<jlr> wzi2, wzi<hyi> wzi3, wzi<ihr> wzi4) {
        return new iht(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ihs((hyh) this.a.get(), (jlr) this.b.get(), (hyi) this.c.get(), (ihr) this.d.get());
    }
}
