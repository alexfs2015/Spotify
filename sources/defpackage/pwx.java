package defpackage;

/* renamed from: pwx reason: default package */
public final class pwx implements vua<Boolean> {
    private final wlc<sgr> a;
    private final wlc<fpt> b;

    private pwx(wlc<sgr> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pwx a(wlc<sgr> wlc, wlc<fpt> wlc2) {
        return new pwx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        sgr sgr = (sgr) this.a.get();
        return Boolean.valueOf(((Boolean) ((fpt) fay.a((fpt) this.b.get())).a(ses.h)).booleanValue());
    }
}
