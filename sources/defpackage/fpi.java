package defpackage;

/* renamed from: fpi reason: default package */
public final class fpi implements vua<fph> {
    private final wlc<fpj> a;

    private fpi(wlc<fpj> wlc) {
        this.a = wlc;
    }

    public static fpi a(wlc<fpj> wlc) {
        return new fpi(wlc);
    }

    public static fph a(Object obj) {
        return new fph((fpj) obj);
    }

    public final /* synthetic */ Object get() {
        return new fph((fpj) this.a.get());
    }
}
