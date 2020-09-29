package defpackage;

/* renamed from: ozc reason: default package */
public final class ozc implements vua<ozb> {
    private final wlc<oyz> a;
    private final wlc<owi> b;
    private final wlc<Boolean> c;
    private final wlc<Boolean> d;
    private final wlc<Boolean> e;

    private ozc(wlc<oyz> wlc, wlc<owi> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ozc a(wlc<oyz> wlc, wlc<owi> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5) {
        ozc ozc = new ozc(wlc, wlc2, wlc3, wlc4, wlc5);
        return ozc;
    }

    public final /* synthetic */ Object get() {
        ozb ozb = new ozb((oyz) this.a.get(), (owi) this.b.get(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue());
        return ozb;
    }
}
