package defpackage;

/* renamed from: lwm reason: default package */
public final class lwm implements wig<lwl> {
    private final wzi<lwd> a;
    private final wzi<has> b;
    private final wzi<sin> c;
    private final wzi<sqb> d;
    private final wzi<squ> e;

    private lwm(wzi<lwd> wzi, wzi<has> wzi2, wzi<sin> wzi3, wzi<sqb> wzi4, wzi<squ> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lwm a(wzi<lwd> wzi, wzi<has> wzi2, wzi<sin> wzi3, wzi<sqb> wzi4, wzi<squ> wzi5) {
        lwm lwm = new lwm(wzi, wzi2, wzi3, wzi4, wzi5);
        return lwm;
    }

    public final /* synthetic */ Object get() {
        lwl lwl = new lwl((lwd) this.a.get(), (has) this.b.get(), (sin) this.c.get(), (sqb) this.d.get(), (squ) this.e.get());
        return lwl;
    }
}
