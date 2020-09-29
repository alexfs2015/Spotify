package defpackage;

/* renamed from: pdc reason: default package */
public final class pdc implements vua<Boolean> {
    private final wlc<fpt> a;

    private pdc(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static pdc a(wlc<fpt> wlc) {
        return new pdc(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jsl.c((fpt) this.a.get()));
    }
}
