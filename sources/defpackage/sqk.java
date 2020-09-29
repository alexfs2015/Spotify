package defpackage;

/* renamed from: sqk reason: default package */
public final class sqk implements vua<sqj> {
    private final wlc<raq> a;

    private sqk(wlc<raq> wlc) {
        this.a = wlc;
    }

    public static sqk a(wlc<raq> wlc) {
        return new sqk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sqj((raq) this.a.get());
    }
}
