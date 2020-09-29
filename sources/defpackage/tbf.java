package defpackage;

/* renamed from: tbf reason: default package */
public final class tbf implements vua<tbe> {
    private final wlc<rka> a;

    private tbf(wlc<rka> wlc) {
        this.a = wlc;
    }

    public static tbf a(wlc<rka> wlc) {
        return new tbf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tbe((rka) this.a.get());
    }
}
