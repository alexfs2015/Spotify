package defpackage;

/* renamed from: ila reason: default package */
public final class ila implements vua<ikz> {
    private final wlc<ikx> a;

    private ila(wlc<ikx> wlc) {
        this.a = wlc;
    }

    public static ila a(wlc<ikx> wlc) {
        return new ila(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ikz((ikx) this.a.get());
    }
}
