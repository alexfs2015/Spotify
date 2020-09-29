package defpackage;

/* renamed from: sdr reason: default package */
public final class sdr implements vua<sdq> {
    private final wlc<Boolean> a;

    private sdr(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static sdr a(wlc<Boolean> wlc) {
        return new sdr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sdq(((Boolean) this.a.get()).booleanValue());
    }
}
