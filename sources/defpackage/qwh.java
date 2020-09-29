package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: qwh reason: default package */
public final class qwh implements wig<qwg> {
    private final wzi<RxResolver> a;
    private final wzi<rog> b;
    private final wzi<qwk> c;
    private final wzi<qwt> d;
    private final wzi<qwm> e;
    private final wzi<qwo> f;
    private final wzi<qwi> g;
    private final wzi<qwc> h;
    private final wzi<ObjectMapper> i;
    private final wzi<Scheduler> j;

    private qwh(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<qwk> wzi3, wzi<qwt> wzi4, wzi<qwm> wzi5, wzi<qwo> wzi6, wzi<qwi> wzi7, wzi<qwc> wzi8, wzi<ObjectMapper> wzi9, wzi<Scheduler> wzi10) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
    }

    public static qwh a(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<qwk> wzi3, wzi<qwt> wzi4, wzi<qwm> wzi5, wzi<qwo> wzi6, wzi<qwi> wzi7, wzi<qwc> wzi8, wzi<ObjectMapper> wzi9, wzi<Scheduler> wzi10) {
        qwh qwh = new qwh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return qwh;
    }

    public final /* synthetic */ Object get() {
        qwg qwg = new qwg((RxResolver) this.a.get(), this.b, (qwk) this.c.get(), (qwt) this.d.get(), (qwm) this.e.get(), (qwo) this.f.get(), (qwi) this.g.get(), (qwc) this.h.get(), (ObjectMapper) this.i.get(), (Scheduler) this.j.get());
        return qwg;
    }
}
