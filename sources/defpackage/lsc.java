package defpackage;

/* renamed from: lsc reason: default package */
public final class lsc implements vua<lsb> {
    private final wlc<fpt> a;
    private final wlc<rgz> b;

    private lsc(wlc<fpt> wlc, wlc<rgz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lsc a(wlc<fpt> wlc, wlc<rgz> wlc2) {
        return new lsc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lsb((fpt) this.a.get(), (rgz) this.b.get());
    }
}
