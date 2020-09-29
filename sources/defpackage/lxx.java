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

/* renamed from: lxx reason: default package */
public final class lxx implements lxv {
    public final CompositeDisposable a = new CompositeDisposable();
    public final gyl b;
    public final gup c;
    public final rrj d;
    public String e = UUID.randomUUID().toString();
    private final lyt f;
    private final lyw g;
    private final lyu h;
    private final Scheduler i;
    private final rda j;
    private final Completable k;
    private final gzz l;

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public lxx(lyt lyt, lyu lyu, Scheduler scheduler, rda rda, gyl gyl, gup gup, lxt lxt, rrj rrj, Completable completable, gzz gzz) {
        this.f = (lyt) fay.a(lyt);
        this.i = scheduler;
        this.j = (rda) fay.a(rda);
        this.h = (lyu) fay.a(lyu);
        this.b = (gyl) fay.a(gyl);
        this.c = (gup) fay.a(gup);
        this.g = new lyw(lxt);
        this.d = rrj;
        this.k = completable;
        this.l = gzz;
    }

    public final void c() {
        Flowable c2 = this.f.a(this.g.a(this).c(lys.a(0, "")), d()).a(1).c();
        this.a.a(c2.a(this.i).a((Consumer<? super T>) new $$Lambda$lxx$kD2geafRf2Lr5aPWporINW_xlCQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$lxx$aftRUx2RU9lWDLxqqtgsQOKE3Kk.INSTANCE));
        CompositeDisposable compositeDisposable = this.a;
        Flowable a2 = c2.a((FlowableTransformer<? super T, ? extends R>) this.h).a(Functions.a()).a(this.i);
        rda rda = this.j;
        rda.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$_O3fVVl3gBUIJgwFXFESLy3NUxA<Object>(rda), (Consumer<? super Throwable>) $$Lambda$lxx$aJjRyCLvyGuArHTgfRtJBfs38.INSTANCE));
        this.a.a(this.k.a(this.i).a((Action) $$Lambda$lxx$E3mpR8Z_TeDzIjx_UzZ4HFDUrA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$lxx$0dpk7EOGmOP7I_cowmvZaTPUxgo.INSTANCE));
        this.b.a();
    }

    public final int a() {
        return lzh.a(d());
    }

    public final String b() {
        return (String) jtc.a(d().custom().string("next_page_id"), "");
    }

    private gzz d() {
        gzz gzz = (gzz) this.c.d.a();
        return gzz.equals(hai.EMPTY) ? this.l : gzz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gzz gzz) {
        this.c.a(gzz, false);
    }
}
