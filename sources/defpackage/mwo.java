package defpackage;

/* renamed from: mwo reason: default package */
public final class mwo implements vua<mwn> {
    private final wlc<ims> a;
    private final wlc<mwr> b;

    private mwo(wlc<ims> wlc, wlc<mwr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mwo a(wlc<ims> wlc, wlc<mwr> wlc2) {
        return new mwo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mwn(this.a, this.b);
    }
}
