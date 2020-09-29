package defpackage;

/* renamed from: jyf reason: default package */
public final class jyf implements vua<jye> {
    private final wlc<hed> a;

    private jyf(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static jyf a(wlc<hed> wlc) {
        return new jyf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jye((hed) this.a.get());
    }
}
