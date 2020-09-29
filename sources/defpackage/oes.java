package defpackage;

/* renamed from: oes reason: default package */
public final class oes implements vua<oer> {
    private final wlc<a> a;

    private oes(wlc<a> wlc) {
        this.a = wlc;
    }

    public static oes a(wlc<a> wlc) {
        return new oes(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oer((a) this.a.get());
    }
}
