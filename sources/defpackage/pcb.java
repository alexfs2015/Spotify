package defpackage;

/* renamed from: pcb reason: default package */
public final class pcb implements vua<pca> {
    private final wlc<a> a;
    private final wlc<rxw> b;

    private pcb(wlc<a> wlc, wlc<rxw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pcb a(wlc<a> wlc, wlc<rxw> wlc2) {
        return new pcb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pca(vtz.b(this.a), (rxw) this.b.get());
    }
}
