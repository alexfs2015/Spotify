package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oxo reason: default package */
final class oxo {
    final CompositeDisposable a = new CompositeDisposable();
    final ooh b;
    final oxk c;
    final String d;
    final hec e;
    final CompletableSubject f = CompletableSubject.f();
    oxs g;
    private final tmu h;
    private oyl i;
    private final opw j;
    private final Scheduler k;
    private final BehaviorSubject<oqg> l = BehaviorSubject.a();
    private final SerialDisposable m = new SerialDisposable();
    private final a n = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            oxo oxo = oxo.this;
            boolean a2 = oxo.b.c().a();
            if (oxo.b.c().d() || !z) {
                oxo.g.a(a2);
            } else {
                oxo.g.b(a2);
            }
        }
    };

    public oxo(tmu tmu, opw opw, oxk oxk, String str, hec hec, Scheduler scheduler, ooh ooh) {
        this.h = tmu;
        this.b = ooh;
        this.c = oxk;
        this.d = str;
        this.e = hec;
        this.j = opw;
        this.k = scheduler;
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        if (!oqg.n()) {
            if (oqg.m()) {
                this.g.e();
                return;
            }
            this.g.f();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.l.onNext(oqg);
        this.f.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public final void a() {
        boolean b2 = this.b.c().b();
        boolean d2 = this.i.d();
        if (!d2 && this.b.a()) {
            this.h.a();
        }
        if (this.b.c().d()) {
            this.c.b(this.d);
            this.a.a((b2 ? this.i.c() : this.i.b()).a((Action) $$Lambda$oxo$hXtYjxpOOIHFc2sumaR75Z_9XoY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oxo$dAefs_7HDjWMLYn4bIuzHpyb3Zk.INSTANCE));
            return;
        }
        if (d2) {
            this.c.a(this.d);
        } else {
            this.c.b(this.d);
        }
        this.a.a(this.i.a(b2).a((Action) $$Lambda$oxo$ZI4VadUSZCMfEiD6DDeAZEOpDY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oxo$lme2TTd_an1scd4IwnYu5XkxFm0.INSTANCE));
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.j;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.k);
        $$Lambda$oxo$SHx5ocXIwQq3Tzo4GZLrZzcVljM r1 = new $$Lambda$oxo$SHx5ocXIwQq3Tzo4GZLrZzcVljM(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(oxs oxs) {
        this.g = oxs;
        if (oxs != null) {
            this.m.a(this.l.d((Consumer<? super T>) new $$Lambda$oxo$8I_5xpueni6AAs_UdQZnAdwvAoQ<Object>(this)));
            this.i.a(this.n);
            return;
        }
        this.m.a(Disposables.a());
        this.i.b(this.n);
    }
}
