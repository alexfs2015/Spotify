package defpackage;

/* renamed from: uxw reason: default package */
public final class uxw implements vua<uxv> {
    private final wlc<uxu> a;

    private uxw(wlc<uxu> wlc) {
        this.a = wlc;
    }

    public static uxw a(wlc<uxu> wlc) {
        return new uxw(wlc);
    }

    public static uxv a(Object obj) {
        return new uxv((uxu) obj);
    }

    public final /* synthetic */ Object get() {
        return new uxv((uxu) this.a.get());
    }
}
