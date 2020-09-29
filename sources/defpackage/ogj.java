package defpackage;

/* renamed from: ogj reason: default package */
public final class ogj implements vua<ogi> {
    private final wlc<ogk> a;
    private final wlc<a> b;

    private ogj(wlc<ogk> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ogj a(wlc<ogk> wlc, wlc<a> wlc2) {
        return new ogj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ogi((ogk) this.a.get(), (a) this.b.get());
    }
}
