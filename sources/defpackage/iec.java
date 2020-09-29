package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: iec reason: default package */
public final class iec implements wig<a<MarqueeTriggerModel, idy, idw>> {
    private final wzi<Observable<idy>> a;
    private final wzi<Observable<idy>> b;
    private final wzi<Observable<idy>> c;
    private final wzi<iby> d;
    private final wzi<ick> e;
    private final wzi<igf> f;
    private final wzi<lbi> g;
    private final wzi<Context> h;
    private final wzi<Scheduler> i;
    private final wzi<hgy> j;
    private final wzi<hzr> k;
    private final wzi<Scheduler> l;
    private final wzi<iei> m;
    private final wzi<ieh> n;

    public static a<MarqueeTriggerModel, idy, idw> a(Observable<idy> observable, Observable<idy> observable2, Observable<idy> observable3, iby iby, ick ick, igf igf, lbi lbi, Context context, Scheduler scheduler, hgy hgy, hzr hzr, Scheduler scheduler2, iei iei, ieh ieh) {
        return (a) wil.a(CC.a(observable, observable2, observable3, iby, ick, igf, lbi, context, scheduler, hgy, hzr, scheduler2, iei, ieh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (iby) this.d.get(), (ick) this.e.get(), (igf) this.f.get(), (lbi) this.g.get(), (Context) this.h.get(), (Scheduler) this.i.get(), (hgy) this.j.get(), (hzr) this.k.get(), (Scheduler) this.l.get(), (iei) this.m.get(), (ieh) this.n.get());
    }
}
