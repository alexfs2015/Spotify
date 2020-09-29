package defpackage;

/* renamed from: twe reason: default package */
public final class twe implements vua<twd> {
    private final wlc<ttv> a;

    private twe(wlc<ttv> wlc) {
        this.a = wlc;
    }

    public static twe a(wlc<ttv> wlc) {
        return new twe(wlc);
    }

    public final /* synthetic */ Object get() {
        return new twd((ttv) this.a.get());
    }
}
