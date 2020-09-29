package defpackage;

/* renamed from: orj reason: default package */
public final class orj implements vua<ori> {
    private final wlc<ora> a;
    private final wlc<ord> b;

    private orj(wlc<ora> wlc, wlc<ord> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static orj a(wlc<ora> wlc, wlc<ord> wlc2) {
        return new orj(wlc, wlc2);
    }

    public static ori b(wlc<ora> wlc, wlc<ord> wlc2) {
        return new ori(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ori(this.a, this.b);
    }
}
