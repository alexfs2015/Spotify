package defpackage;

/* renamed from: smi reason: default package */
public final class smi implements vua<smh> {
    private final wlc<b> a;
    private final wlc<tcn> b;

    private smi(wlc<b> wlc, wlc<tcn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static smi a(wlc<b> wlc, wlc<tcn> wlc2) {
        return new smi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new smh((b) this.a.get(), (tcn) this.b.get());
    }
}
