package defpackage;

/* renamed from: uxq reason: default package */
public final class uxq implements vua<uxp> {
    private final wlc<uxo> a;

    private uxq(wlc<uxo> wlc) {
        this.a = wlc;
    }

    public static uxq a(wlc<uxo> wlc) {
        return new uxq(wlc);
    }

    public static uxp a(Object obj) {
        return new uxp((uxo) obj);
    }

    public final /* synthetic */ Object get() {
        return new uxp((uxo) this.a.get());
    }
}
