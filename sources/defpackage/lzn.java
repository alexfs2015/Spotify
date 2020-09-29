package defpackage;

/* renamed from: lzn reason: default package */
public final class lzn implements vua<a> {
    private final wlc<gvd> a;

    private lzn(wlc<gvd> wlc) {
        this.a = wlc;
    }

    public static lzn a(wlc<gvd> wlc) {
        return new lzn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new a((gvd) this.a.get());
    }
}
