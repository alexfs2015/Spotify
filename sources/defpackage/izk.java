package defpackage;

import android.content.Context;

/* renamed from: izk reason: default package */
public final class izk implements vua<izg> {
    private final wlc<Context> a;
    private final wlc<ixg> b;
    private final wlc<ixi> c;
    private final wlc<iyb> d;
    private final wlc<iyg> e;
    private final wlc<iyl> f;

    private izk(wlc<Context> wlc, wlc<ixg> wlc2, wlc<ixi> wlc3, wlc<iyb> wlc4, wlc<iyg> wlc5, wlc<iyl> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static izk a(wlc<Context> wlc, wlc<ixg> wlc2, wlc<ixi> wlc3, wlc<iyb> wlc4, wlc<iyg> wlc5, wlc<iyl> wlc6) {
        izk izk = new izk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return izk;
    }

    public static izg a(Context context, ixg ixg, ixi ixi, iyb iyb, iyg iyg, iyl iyl) {
        return (izg) vuf.a(izj.a(context, ixg, ixi, iyb, iyg, iyl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (ixg) this.b.get(), (ixi) this.c.get(), (iyb) this.d.get(), (iyg) this.e.get(), (iyl) this.f.get());
    }
}
