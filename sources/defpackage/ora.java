package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: ora reason: default package */
final class ora {
    final CompositeDisposable a = new CompositeDisposable();
    final oqw b;
    final OffliningLogger c;
    final ttb d;
    final szp e;
    final CompletableSubject f = CompletableSubject.f();
    oqg g;
    private final Scheduler h;
    private final vjj i;
    private final ttd j;
    private final BehaviorSubject<oqg> k = BehaviorSubject.a();
    private final SerialDisposable l = new SerialDisposable();
    private orh m;

    public ora(oqw oqw, OffliningLogger offliningLogger, Scheduler scheduler, final String str, final vjv vjv, vjj vjj, ttd ttd, szp szp) {
        this.h = scheduler;
        this.i = vjj;
        this.b = oqw;
        this.c = offliningLogger;
        this.j = ttd;
        this.e = szp;
        this.d = new ttb(new $$Lambda$ora$YYcnB29tpA7Z5DUwKS5dRTewSZQ(this), new tsz() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final void a(boolean z) {
                ora.this.a.a(ora.this.i.a(ora.this.g.a().getUri(), ora.this.g.b().b(), z).a((Action) $$Lambda$ora$EMMTlnfLhGq_WxaDh6kxVmb2vg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ora$OfX0LsEflezLlkII1SzXf4A_nPg.INSTANCE));
            }

            public final void b(boolean z) {
                ora.this.a.a((z ? vjv.a(str) : vjv.b(str)).a((Action) $$Lambda$ora$1$fHjlrFdZHYf8yHCClWjFIRrD2iE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ora$1$qK_mxGbu9ZSwxIftAZeZvQ0UBeo.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public void a(final oqg oqg) {
        this.g = oqg;
        this.d.a((tsy) new tsy() {
            public final vli a() {
                return oqg.a().s();
            }

            public final boolean b() {
                return !oqg.a().k() && !oqg.a().h();
            }
        });
        boolean z = !oqg.h();
        boolean z2 = false;
        this.m.a(!oqg.n() && z);
        orh orh = this.m;
        if (!oqg.n() && !z) {
            z2 = true;
        }
        orh.b(z2);
        this.m.c(!oqg.g());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vli vli) {
        orh orh = this.m;
        if (orh != null) {
            orh.updateDownloadViewState(vli);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.k.onNext(oqg);
        this.f.onComplete();
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = aVar.b().c().a(this.h);
        $$Lambda$ora$X2xFitb94tvbRvarCRasqnI1cb4 r1 = new $$Lambda$ora$X2xFitb94tvbRvarCRasqnI1cb4(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(orh orh) {
        this.m = orh;
        if (orh != null) {
            this.l.a(this.k.d((Consumer<? super T>) new $$Lambda$ora$oTR0Kp6DztRpUOo0_idFpE7X8PQ<Object>(this)));
            this.j.a((a) this.d);
            this.j.a();
            return;
        }
        this.l.a(Disposables.a());
        this.j.b();
        this.j.b(this.d);
    }
}
