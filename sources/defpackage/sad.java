package defpackage;

/* renamed from: sad reason: default package */
public final class sad implements vua<sac> {
    private final wlc<saa> a;
    private final wlc<rzq> b;

    private sad(wlc<saa> wlc, wlc<rzq> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sad a(wlc<saa> wlc, wlc<rzq> wlc2) {
        return new sad(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sac((saa) this.a.get(), (rzq) this.b.get());
    }
}
