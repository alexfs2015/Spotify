package defpackage;

/* renamed from: owc reason: default package */
public final class owc implements vua<owb> {
    private final wlc<ovz> a;
    private final wlc<a> b;

    private owc(wlc<ovz> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static owc a(wlc<ovz> wlc, wlc<a> wlc2) {
        return new owc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new owb((ovz) this.a.get(), (a) this.b.get());
    }
}
