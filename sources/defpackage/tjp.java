package defpackage;

/* renamed from: tjp reason: default package */
public final class tjp implements vua<tjo> {
    private final wlc<a> a;
    private final wlc<heg> b;
    private final wlc<a> c;
    private final wlc<rbg> d;
    private final wlc<String> e;

    private tjp(wlc<a> wlc, wlc<heg> wlc2, wlc<a> wlc3, wlc<rbg> wlc4, wlc<String> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static tjp a(wlc<a> wlc, wlc<heg> wlc2, wlc<a> wlc3, wlc<rbg> wlc4, wlc<String> wlc5) {
        tjp tjp = new tjp(wlc, wlc2, wlc3, wlc4, wlc5);
        return tjp;
    }

    public final /* synthetic */ Object get() {
        tjo tjo = new tjo(this.a, this.b, this.c, this.d, this.e);
        return tjo;
    }
}
