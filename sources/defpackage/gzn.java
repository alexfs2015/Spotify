package defpackage;

/* renamed from: gzn reason: default package */
public final class gzn implements vua<gzm> {
    private final wlc<a> a;

    private gzn(wlc<a> wlc) {
        this.a = wlc;
    }

    public static gzn a(wlc<a> wlc) {
        return new gzn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gzm((a) this.a.get());
    }
}
