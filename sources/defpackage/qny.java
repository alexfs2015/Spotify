package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: qny reason: default package */
public final class qny implements vua<qnx> {
    private final wlc<RxResolver> a;
    private final wlc<rfe> b;
    private final wlc<qob> c;
    private final wlc<qok> d;
    private final wlc<qod> e;
    private final wlc<qof> f;
    private final wlc<qnz> g;
    private final wlc<qnt> h;
    private final wlc<ObjectMapper> i;
    private final wlc<Scheduler> j;

    private qny(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<qob> wlc3, wlc<qok> wlc4, wlc<qod> wlc5, wlc<qof> wlc6, wlc<qnz> wlc7, wlc<qnt> wlc8, wlc<ObjectMapper> wlc9, wlc<Scheduler> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static qny a(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<qob> wlc3, wlc<qok> wlc4, wlc<qod> wlc5, wlc<qof> wlc6, wlc<qnz> wlc7, wlc<qnt> wlc8, wlc<ObjectMapper> wlc9, wlc<Scheduler> wlc10) {
        qny qny = new qny(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return qny;
    }

    public final /* synthetic */ Object get() {
        qnx qnx = new qnx((RxResolver) this.a.get(), this.b, (qob) this.c.get(), (qok) this.d.get(), (qod) this.e.get(), (qof) this.f.get(), (qnz) this.g.get(), (qnt) this.h.get(), (ObjectMapper) this.i.get(), (Scheduler) this.j.get());
        return qnx;
    }
}
