package defpackage;

/* renamed from: qeo reason: default package */
public final class qeo implements wig<qen> {
    private final wzi<sqw> a;
    private final wzi<sin> b;
    private final wzi<sqb> c;
    private final wzi<has> d;
    private final wzi<squ> e;

    private qeo(wzi<sqw> wzi, wzi<sin> wzi2, wzi<sqb> wzi3, wzi<has> wzi4, wzi<squ> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qeo a(wzi<sqw> wzi, wzi<sin> wzi2, wzi<sqb> wzi3, wzi<has> wzi4, wzi<squ> wzi5) {
        qeo qeo = new qeo(wzi, wzi2, wzi3, wzi4, wzi5);
        return qeo;
    }

    public final /* synthetic */ Object get() {
        qen qen = new qen((sqw) this.a.get(), (sin) this.b.get(), (sqb) this.c.get(), (has) this.d.get(), (squ) this.e.get());
        return qen;
    }
}
