package defpackage;

/* renamed from: phu reason: default package */
public final class phu implements wig<pht> {
    private final wzi<phv> a;
    private final wzi<phx> b;
    private final wzi<jtz> c;
    private final wzi<jty> d;
    private final wzi<String> e;

    private phu(wzi<phv> wzi, wzi<phx> wzi2, wzi<jtz> wzi3, wzi<jty> wzi4, wzi<String> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static phu a(wzi<phv> wzi, wzi<phx> wzi2, wzi<jtz> wzi3, wzi<jty> wzi4, wzi<String> wzi5) {
        phu phu = new phu(wzi, wzi2, wzi3, wzi4, wzi5);
        return phu;
    }

    public final /* synthetic */ Object get() {
        pht pht = new pht((phv) this.a.get(), (phx) this.b.get(), (jtz) this.c.get(), (jty) this.d.get(), (String) this.e.get());
        return pht;
    }
}
