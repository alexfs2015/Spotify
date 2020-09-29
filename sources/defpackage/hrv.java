package defpackage;

/* renamed from: hrv reason: default package */
public final class hrv implements wig<hru> {
    private final wzi<htf> a;
    private final wzi<hrk> b;
    private final wzi<hsb> c;
    private final wzi<hrs> d;
    private final wzi<hrm> e;

    private hrv(wzi<htf> wzi, wzi<hrk> wzi2, wzi<hsb> wzi3, wzi<hrs> wzi4, wzi<hrm> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static hrv a(wzi<htf> wzi, wzi<hrk> wzi2, wzi<hsb> wzi3, wzi<hrs> wzi4, wzi<hrm> wzi5) {
        hrv hrv = new hrv(wzi, wzi2, wzi3, wzi4, wzi5);
        return hrv;
    }

    public final /* synthetic */ Object get() {
        hru hru = new hru(this.a, (hrk) this.b.get(), (hsb) this.c.get(), (hrs) this.d.get(), (hrm) this.e.get());
        return hru;
    }
}
