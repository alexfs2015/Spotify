package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.Collection;

/* renamed from: owo reason: default package */
class owo {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    final BehaviorSubject<a> c = BehaviorSubject.a(a.f().a(true).a());
    private final opw d;
    private final owq e;
    private final String f;
    private final Scheduler g;
    private final SerialDisposable h = new SerialDisposable();
    private owt i;

    /* renamed from: owo$a */
    public static abstract class a {

        /* renamed from: owo$a$a reason: collision with other inner class name */
        public interface C0072a {
            C0072a a(hdb hdb);

            C0072a a(boolean z);

            a a();

            C0072a b(boolean z);

            C0072a c(boolean z);
        }

        public static C0072a f() {
            return new a().a(hdb.EMPTY).a(false).b(false).c(false);
        }

        public abstract hdb a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract boolean d();

        public abstract C0072a e();
    }

    public owo(opw opw, owq owq, String str, Scheduler scheduler) {
        this.d = opw;
        this.e = owq;
        this.f = str;
        this.g = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(oqg oqg) {
        boolean b2 = oqg.b().a().b();
        return (oqg.n() || !((a) this.c.j()).b()) ? Observable.b(((a) this.c.j()).e().c(b2).a(false).b(false).a()) : this.e.a(this.f).e((Function<? super Throwable, ? extends T>) $$Lambda$owo$NHetluXf9wuJ3eaXJx1slB9Vr2A.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$owo$rPBIl0nfDmjdqIcEOOpGpX5fKk<Object,Object>(b2)).f((ObservableSource<? extends T>) Observable.b(a.f().c(b2).b(true).a(true).a()));
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar.c()) {
            this.i.a(true);
        } else if (aVar.a().body().isEmpty() || aVar.d()) {
            this.i.a(false);
        } else {
            this.i.a(ImmutableList.a((Collection<? extends E>) aVar.a().body()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        this.c.onNext(aVar);
        if (!aVar.c()) {
            this.b.onComplete();
        }
    }

    public final void a(defpackage.omg.a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.d;
        opw.getClass();
        compositeDisposable.a(c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$S_hgBX16SCzOObmTMgYeQ3aWOns<Object,Object>(opw)).h(new $$Lambda$owo$evlVkl5wgKyOTTlXz5ugnXX2TBA(this)).a(this.g).a((Consumer<? super T>) new $$Lambda$owo$e79LtuxUpPV2qNPQk1P3KWrVH30<Object>(this), (Consumer<? super Throwable>) $$Lambda$owo$he1ZeNaMmXI_kDGGMNL4Vf4hN30.INSTANCE));
    }

    public final void a(owt owt) {
        this.i = owt;
        if (owt != null) {
            this.h.a(this.c.d((Consumer<? super T>) new $$Lambda$owo$PXneCNJdBBxGrysryYYT8TVbHA<Object>(this)));
        } else {
            this.h.a(Disposables.a());
        }
    }
}
