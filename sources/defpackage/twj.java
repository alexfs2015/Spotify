package defpackage;

/* renamed from: twj reason: default package */
public final class twj implements vua<twi> {
    private final wlc<tmy> a;

    private twj(wlc<tmy> wlc) {
        this.a = wlc;
    }

    public static twj a(wlc<tmy> wlc) {
        return new twj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new twi((tmy) this.a.get());
    }
}
