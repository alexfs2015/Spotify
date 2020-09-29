package defpackage;

import io.reactivex.Completable;
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

/* renamed from: oqi reason: default package */
final class oqi {
    final CompositeDisposable a = new CompositeDisposable();
    final ohd b;
    final oqe c;
    final String d;
    final hbj e;
    final CompletableSubject f = CompletableSubject.f();
    oqm g;
    private final tcn h;
    private orf i;
    private final ois j;
    private final Scheduler k;
    private final BehaviorSubject<ojc> l = BehaviorSubject.a();
    private final SerialDisposable m = new SerialDisposable();
    private final a n = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            oqi oqi = oqi.this;
            boolean a2 = oqi.b.c().a();
            if (oqi.b.c().d() || !z) {
                oqi.g.a(a2);
            } else {
                oqi.g.b(a2);
            }
        }
    };

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public oqi(tcn tcn, ois ois, oqe oqe, String str, hbj hbj, Scheduler scheduler, ohd ohd) {
        this.h = tcn;
        this.b = ohd;
        this.c = oqe;
        this.d = str;
        this.e = hbj;
        this.j = ois;
        this.k = scheduler;
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.j;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.k);
        $$Lambda$oqi$9P4__ZyDJA1SiY66Lj58lwh60 r1 = new $$Lambda$oqi$9P4__ZyDJA1SiY66Lj58lwh60(this);
        CompletableSubject completableSubject = this.f;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.l.onNext(ojc);
        this.f.onComplete();
    }

    public final void a(oqm oqm) {
        this.g = oqm;
        if (oqm != null) {
            this.m.a(this.l.d((Consumer<? super T>) new $$Lambda$oqi$FKKb8DmlbkzJ7g6vCUKo4GeRbfs<Object>(this)));
            this.i.a(this.n);
            return;
        }
        this.m.a(Disposables.a());
        this.i.b(this.n);
    }

    public final void a() {
        Completable completable;
        boolean b2 = this.b.c().b();
        boolean d2 = this.i.d();
        if (!d2 && this.b.a()) {
            this.h.a();
        }
        if (this.b.c().d()) {
            this.c.b(this.d);
            CompositeDisposable compositeDisposable = this.a;
            if (b2) {
                completable = this.i.c();
            } else {
                completable = this.i.b();
            }
            compositeDisposable.a(completable.a((Action) $$Lambda$oqi$5R3QxLQLD45Hahw8NgCpxtf72w.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oqi$eQLNVSzjwDevSBDCawh7va0hno.INSTANCE));
            return;
        }
        if (d2) {
            this.c.a(this.d);
        } else {
            this.c.b(this.d);
        }
        this.a.a(this.i.a(b2).a((Action) $$Lambda$oqi$eFfSuvtTrSaKVqwXEAIMVMFiT_A.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oqi$leLVCWHnGzZlmXV15QNzvbPoIAg.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        if (!ojc.n()) {
            if (ojc.m()) {
                this.g.e();
                return;
            }
            this.g.f();
        }
    }
}
