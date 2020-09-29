package defpackage;

/* renamed from: pya reason: default package */
public final class pya implements vua<Boolean> {
    private final wlc<b> a;

    private pya(wlc<b> wlc) {
        this.a = wlc;
    }

    public static pya a(wlc<b> wlc) {
        return new pya(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((b) this.a.get()).f);
    }
}
