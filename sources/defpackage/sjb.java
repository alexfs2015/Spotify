package defpackage;

/* renamed from: sjb reason: default package */
public final class sjb implements wig<sja> {
    private final wzi<siv> a;
    private final wzi<sjt> b;
    private final wzi<sjy> c;
    private final wzi<sjv> d;
    private final wzi<Boolean> e;
    private final wzi<siw> f;

    private sjb(wzi<siv> wzi, wzi<sjt> wzi2, wzi<sjy> wzi3, wzi<sjv> wzi4, wzi<Boolean> wzi5, wzi<siw> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static sjb a(wzi<siv> wzi, wzi<sjt> wzi2, wzi<sjy> wzi3, wzi<sjv> wzi4, wzi<Boolean> wzi5, wzi<siw> wzi6) {
        sjb sjb = new sjb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return sjb;
    }

    public final /* synthetic */ Object get() {
        sja sja = new sja((siv) this.a.get(), (sjt) this.b.get(), (sjy) this.c.get(), (sjv) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (siw) this.f.get());
        return sja;
    }
}
