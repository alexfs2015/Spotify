package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: ibq reason: default package */
public final class ibq implements vua<a<MarqueeTriggerModel, ibm, ibk>> {
    private final wlc<Observable<ibm>> a;
    private final wlc<Observable<ibm>> b;
    private final wlc<Observable<ibm>> c;
    private final wlc<hzm> d;
    private final wlc<hzy> e;
    private final wlc<ids> f;
    private final wlc<kxz> g;
    private final wlc<Context> h;
    private final wlc<Scheduler> i;
    private final wlc<hec> j;
    private final wlc<hxf> k;
    private final wlc<Scheduler> l;
    private final wlc<Scheduler> m;
    private final wlc<ibw> n;
    private final wlc<ibv> o;

    public static a<MarqueeTriggerModel, ibm, ibk> a(Observable<ibm> observable, Observable<ibm> observable2, Observable<ibm> observable3, hzm hzm, hzy hzy, ids ids, kxz kxz, Context context, Scheduler scheduler, hec hec, hxf hxf, Scheduler scheduler2, Scheduler scheduler3, ibw ibw, ibv ibv) {
        return (a) vuf.a(CC.a(observable, observable2, observable3, hzm, hzy, ids, kxz, context, scheduler, hec, hxf, scheduler2, scheduler3, ibw, ibv), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (hzm) this.d.get(), (hzy) this.e.get(), (ids) this.f.get(), (kxz) this.g.get(), (Context) this.h.get(), (Scheduler) this.i.get(), (hec) this.j.get(), (hxf) this.k.get(), (Scheduler) this.l.get(), (Scheduler) this.m.get(), (ibw) this.n.get(), (ibv) this.o.get());
    }
}
