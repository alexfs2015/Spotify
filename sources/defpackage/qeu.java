package defpackage;

/* renamed from: qeu reason: default package */
public final class qeu implements wig<qet> {
    private final wzi<sin> a;
    private final wzi<sqb> b;
    private final wzi<squ> c;
    private final wzi<hbl> d;

    private qeu(wzi<sin> wzi, wzi<sqb> wzi2, wzi<squ> wzi3, wzi<hbl> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qeu a(wzi<sin> wzi, wzi<sqb> wzi2, wzi<squ> wzi3, wzi<hbl> wzi4) {
        return new qeu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qet((sin) this.a.get(), (sqb) this.b.get(), (squ) this.c.get(), (hbl) this.d.get());
    }
}
