package defpackage;

/* renamed from: rpm reason: default package */
public final class rpm implements wig<rpl> {
    private final wzi<vgw> a;
    private final wzi<rpy> b;
    private final wzi<Boolean> c;
    private final wzi<stq> d;
    private final wzi<Boolean> e;

    private rpm(wzi<vgw> wzi, wzi<rpy> wzi2, wzi<Boolean> wzi3, wzi<stq> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rpm a(wzi<vgw> wzi, wzi<rpy> wzi2, wzi<Boolean> wzi3, wzi<stq> wzi4, wzi<Boolean> wzi5) {
        rpm rpm = new rpm(wzi, wzi2, wzi3, wzi4, wzi5);
        return rpm;
    }

    public final /* synthetic */ Object get() {
        rpl rpl = new rpl((vgw) this.a.get(), wif.b(this.b), ((Boolean) this.c.get()).booleanValue(), wif.b(this.d), ((Boolean) this.e.get()).booleanValue());
        return rpl;
    }
}
