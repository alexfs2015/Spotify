package defpackage;

import android.app.Application;

/* renamed from: rtx reason: default package */
public final class rtx implements wig<rtw> {
    private final wzi<Application> a;
    private final wzi<a> b;
    private final wzi<rtl> c;
    private final wzi<rtu> d;
    private final wzi<rts> e;
    private final wzi<rtq> f;
    private final wzi<rto> g;

    private rtx(wzi<Application> wzi, wzi<a> wzi2, wzi<rtl> wzi3, wzi<rtu> wzi4, wzi<rts> wzi5, wzi<rtq> wzi6, wzi<rto> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static rtx a(wzi<Application> wzi, wzi<a> wzi2, wzi<rtl> wzi3, wzi<rtu> wzi4, wzi<rts> wzi5, wzi<rtq> wzi6, wzi<rto> wzi7) {
        rtx rtx = new rtx(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return rtx;
    }

    public final /* synthetic */ Object get() {
        rtw rtw = new rtw((Application) this.a.get(), (a) this.b.get(), (rtl) this.c.get(), (rtu) this.d.get(), this.e, (rtq) this.f.get(), (rto) this.g.get());
        return rtw;
    }
}
