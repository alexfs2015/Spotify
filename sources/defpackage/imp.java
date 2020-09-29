package defpackage;

/* renamed from: imp reason: default package */
public final class imp implements vua<imo> {
    private final wlc<imq> a;
    private final wlc<iqb> b;

    private imp(wlc<imq> wlc, wlc<iqb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static imp a(wlc<imq> wlc, wlc<iqb> wlc2) {
        return new imp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new imo((imq) this.a.get(), (iqb) this.b.get());
    }
}
