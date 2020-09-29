package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.UUID;

/* renamed from: qjr reason: default package */
public final class qjr implements snm {
    public final gwp a;
    public final hbe b;
    public final sin c;
    public final sok d;
    public final sps e;
    public final soh f;
    public String g = UUID.randomUUID().toString();
    public final saq h;
    public final CompositeDisposable i = new CompositeDisposable();
    public hcs j = hdb.EMPTY;
    private final sog k;
    private final Scheduler l;
    private final snt m;
    private final snr n;
    private final rly o;
    private final qlp p;

    public qjr(gwp gwp, hbe hbe, sog sog, rly rly, qlp qlp, sin sin, sok sok, sps sps, soh soh, saq saq, Scheduler scheduler, snt snt, snr snr) {
        this.a = (gwp) fbp.a(gwp);
        this.b = (hbe) fbp.a(hbe);
        this.k = (sog) fbp.a(sog);
        this.o = (rly) fbp.a(rly);
        this.l = scheduler;
        this.m = snt;
        this.n = snr;
        this.p = (qlp) fbp.a(qlp);
        this.c = (sin) fbp.a(sin);
        this.d = (sok) fbp.a(sok);
        this.e = (sps) fbp.a(sps);
        this.f = soh;
        this.h = saq;
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "SearchDrillDownPresenter results onError = %s", th.getClass().getSimpleName());
    }

    public final int a() {
        return six.d(this.j);
    }

    /* access modifiers changed from: protected */
    public final void a(hcs hcs) {
        this.a.a(hcs, false);
        this.j = hcs;
    }

    public final void a(Flowable<sqj> flowable) {
        Flowable c2 = this.k.a(flowable, this.j).a(1).c();
        this.i.a(c2.a(this.l).a((Consumer<? super T>) new $$Lambda$98rV41UDvyyfrb9cPfbKUCSBpDM<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qjr$_bH6_wQ2wd_x6xL7OCEwq3uTgEE<Object>(this)));
        CompositeDisposable compositeDisposable = this.i;
        Flowable a2 = snt.a(c2).a(this.l);
        qlp qlp = this.p;
        qlp.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$3CpcAv2Itftgs9z3eiWQOZQFYho<Object>(qlp), (Consumer<? super Throwable>) $$Lambda$qjr$Vq_M37vA_CbNcZ7v3t78JKUZBCk.INSTANCE));
        CompositeDisposable compositeDisposable2 = this.i;
        Flowable a3 = snr.a(c2).a(this.l);
        rly rly = this.o;
        rly.getClass();
        compositeDisposable2.a(a3.a((Consumer<? super T>) new $$Lambda$6JCmfjD0VF95yqsrqCFU1e_zrW8<Object>(rly), (Consumer<? super Throwable>) $$Lambda$qjr$yWtfreDNc_2X6Nt0c9XUlPegxw.INSTANCE));
    }

    public final String b() {
        return six.a(this.j);
    }

    public final boolean c() {
        return !((Boolean) jvi.a(((hcs) fbp.a(this.j)).custom().boolValue("isLastPage"), Boolean.TRUE)).booleanValue();
    }
}
