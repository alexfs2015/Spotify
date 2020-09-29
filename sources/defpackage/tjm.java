package defpackage;

/* renamed from: tjm reason: default package */
public final class tjm implements vua<tjl> {
    private final wlc<a> a;
    private final wlc<oew> b;
    private final wlc<a> c;
    private final wlc<tjo> d;

    private tjm(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<tjo> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tjm a(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<tjo> wlc4) {
        return new tjm(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tjl(this.a, this.b, this.c, this.d);
    }
}
