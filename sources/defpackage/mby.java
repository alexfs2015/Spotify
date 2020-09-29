package defpackage;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import java.util.UUID;

/* renamed from: mby reason: default package */
public final class mby implements mbw {
    public final CompositeDisposable a = new CompositeDisposable();
    public final hbe b;
    public final gwp c;
    public final saq d;
    public String e = UUID.randomUUID().toString();
    private final mcu f;
    private final mcx g;
    private final mcv h;
    private final Scheduler i;
    private final rly j;
    private final Completable k;
    private final hcs l;

    public mby(mcu mcu, mcv mcv, Scheduler scheduler, rly rly, hbe hbe, gwp gwp, mbu mbu, saq saq, Completable completable, hcs hcs) {
        this.f = (mcu) fbp.a(mcu);
        this.i = scheduler;
        this.j = (rly) fbp.a(rly);
        this.h = (mcv) fbp.a(mcv);
        this.b = (hbe) fbp.a(hbe);
        this.c = (gwp) fbp.a(gwp);
        this.g = new mcx(mbu);
        this.d = saq;
        this.k = completable;
        this.l = hcs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hcs hcs) {
        this.c.a(hcs, false);
    }

    private hcs d() {
        hcs hcs = (hcs) this.c.d.a();
        return hcs.equals(hdb.EMPTY) ? this.l : hcs;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final int a() {
        return mdi.a(d());
    }

    public final String b() {
        return (String) jvi.a(d().custom().string("next_page_id"), "");
    }

    public final void c() {
        Flowable c2 = this.f.a(this.g.a(this).c(mct.a(0, "")), d()).a(1).c();
        this.a.a(c2.a(this.i).a((Consumer<? super T>) new $$Lambda$mby$HabIFh2SrqU2km1VTOITIJ5IpSk<Object>(this), (Consumer<? super Throwable>) $$Lambda$mby$331Nr5o41JAYYVBSSFEUfMgKIQ.INSTANCE));
        CompositeDisposable compositeDisposable = this.a;
        Flowable a2 = c2.a((FlowableTransformer<? super T, ? extends R>) this.h).a(Functions.a()).a(this.i);
        rly rly = this.j;
        rly.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$6JCmfjD0VF95yqsrqCFU1e_zrW8<Object>(rly), (Consumer<? super Throwable>) $$Lambda$mby$qFwD9YcOima1XQoZczmUiQWQ6rw.INSTANCE));
        this.a.a(this.k.a(this.i).a((Action) $$Lambda$mby$qvnrFOe2hBUln3UnR2GHqu0X74M.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mby$_aQXYTV_EdGOW5bquVDhZfGSOg.INSTANCE));
        this.b.a();
    }
}
