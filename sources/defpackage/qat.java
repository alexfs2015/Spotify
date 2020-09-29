package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.UUID;

/* renamed from: qat reason: default package */
public final class qat implements sdf {
    public final gup a;
    public final gyl b;
    public final ryz c;
    public final sed d;
    public final sfl e;
    public final sea f;
    public String g = UUID.randomUUID().toString();
    public final rrj h;
    public final CompositeDisposable i = new CompositeDisposable();
    public gzz j = hai.EMPTY;
    private final sdz k;
    private final Scheduler l;
    private final sdm m;
    private final sdk n;
    private final rda o;
    private final qcm p;

    public qat(gup gup, gyl gyl, sdz sdz, rda rda, qcm qcm, ryz ryz, sed sed, sfl sfl, sea sea, rrj rrj, Scheduler scheduler, sdm sdm, sdk sdk) {
        this.a = (gup) fay.a(gup);
        this.b = (gyl) fay.a(gyl);
        this.k = (sdz) fay.a(sdz);
        this.o = (rda) fay.a(rda);
        this.l = scheduler;
        this.m = sdm;
        this.n = sdk;
        this.p = (qcm) fay.a(qcm);
        this.c = (ryz) fay.a(ryz);
        this.d = (sed) fay.a(sed);
        this.e = (sfl) fay.a(sfl);
        this.f = sea;
        this.h = rrj;
    }

    public final void a(Flowable<sgc> flowable) {
        Flowable c2 = this.k.a(flowable, this.j).a(1).c();
        this.i.a(c2.a(this.l).a((Consumer<? super T>) new $$Lambda$iS2WxHcLMUw_nyLpuf0SZjkeR_E<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qat$bj899OX7eVsBMsUGlDUJqbd2aAM<Object>(this)));
        CompositeDisposable compositeDisposable = this.i;
        Flowable a2 = sdm.a(c2).a(this.l);
        qcm qcm = this.p;
        qcm.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$MqDBZR4Uw30rLwl_PGQpsPnyBY<Object>(qcm), (Consumer<? super Throwable>) $$Lambda$qat$cv8pZR62u4eknOuUA0YYyQkyCL8.INSTANCE));
        CompositeDisposable compositeDisposable2 = this.i;
        Flowable a3 = sdk.a(c2).a(this.l);
        rda rda = this.o;
        rda.getClass();
        compositeDisposable2.a(a3.a((Consumer<? super T>) new $$Lambda$_O3fVVl3gBUIJgwFXFESLy3NUxA<Object>(rda), (Consumer<? super Throwable>) $$Lambda$qat$NekGiMNfNalVuLdrOEDKxtpapc.INSTANCE));
    }

    /* access modifiers changed from: protected */
    public final void a(gzz gzz) {
        this.a.a(gzz, false);
        this.j = gzz;
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "SearchDrillDownPresenter results onError = %s", th.getClass().getSimpleName());
    }

    public final int a() {
        return rzj.d(this.j);
    }

    public final String b() {
        return rzj.a(this.j);
    }

    public final boolean c() {
        return !((Boolean) jtc.a(((gzz) fay.a(this.j)).custom().boolValue("isLastPage"), Boolean.TRUE)).booleanValue();
    }
}
