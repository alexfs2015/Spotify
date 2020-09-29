package defpackage;

/* renamed from: fpm reason: default package */
public final class fpm implements vua<fpl> {
    private final wlc<fph> a;

    private fpm(wlc<fph> wlc) {
        this.a = wlc;
    }

    public static fpm a(wlc<fph> wlc) {
        return new fpm(wlc);
    }

    public static fpl a(Object obj) {
        return new fpl((fph) obj);
    }

    public final /* synthetic */ Object get() {
        return new fpl((fph) this.a.get());
    }
}
