package defpackage;

/* renamed from: pws reason: default package */
public final class pws implements vua<Boolean> {
    private final wlc<fpt> a;

    private pws(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static pws a(wlc<fpt> wlc) {
        return new pws(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.c((fpt) this.a.get()));
    }
}
