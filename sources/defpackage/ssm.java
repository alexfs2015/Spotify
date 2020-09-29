package defpackage;

/* renamed from: ssm reason: default package */
public final class ssm implements vua<ssl> {
    private final wlc<sst> a;
    private final wlc<fpt> b;

    private ssm(wlc<sst> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ssm a(wlc<sst> wlc, wlc<fpt> wlc2) {
        return new ssm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ssl((sst) this.a.get(), (fpt) this.b.get());
    }
}
