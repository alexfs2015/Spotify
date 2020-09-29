package defpackage;

/* renamed from: pkh reason: default package */
public final class pkh implements wig<pkg> {
    private final wzi<pkf> a;
    private final wzi<pkk> b;
    private final wzi<jtz> c;
    private final wzi<jty> d;
    private final wzi<String> e;

    private pkh(wzi<pkf> wzi, wzi<pkk> wzi2, wzi<jtz> wzi3, wzi<jty> wzi4, wzi<String> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pkh a(wzi<pkf> wzi, wzi<pkk> wzi2, wzi<jtz> wzi3, wzi<jty> wzi4, wzi<String> wzi5) {
        pkh pkh = new pkh(wzi, wzi2, wzi3, wzi4, wzi5);
        return pkh;
    }

    public final /* synthetic */ Object get() {
        pkg pkg = new pkg((pkf) this.a.get(), (pkk) this.b.get(), (jtz) this.c.get(), (jty) this.d.get(), (String) this.e.get());
        return pkg;
    }
}
