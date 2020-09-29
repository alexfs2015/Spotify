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

/* renamed from: opi reason: default package */
class opi {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    final BehaviorSubject<a> c = BehaviorSubject.a(a.f().a(true).a());
    private final ois d;
    private final opk e;
    private final String f;
    private final Scheduler g;
    private final SerialDisposable h = new SerialDisposable();
    private opn i;

    /* renamed from: opi$a */
    public static abstract class a {

        /* renamed from: opi$a$a reason: collision with other inner class name */
        public interface C0071a {
            C0071a a(hai hai);

            C0071a a(boolean z);

            a a();

            C0071a b(boolean z);

            C0071a c(boolean z);
        }

        public abstract hai a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract boolean d();

        public abstract C0071a e();

        public static C0071a f() {
            return new a().a(hai.EMPTY).a(false).b(false).c(false);
        }
    }

    public opi(ois ois, opk opk, String str, Scheduler scheduler) {
        this.d = ois;
        this.e = opk;
        this.f = str;
        this.g = scheduler;
    }

    public final void a(defpackage.ofc.a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.d;
        ois.getClass();
        compositeDisposable.a(c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$pMoOriiGE1GbrTE0FfTeRih_xQI<Object,Object>(ois)).h(new $$Lambda$opi$9rW_frC6JYS4tA9nSDfLTHaOBKQ(this)).a(this.g).a((Consumer<? super T>) new $$Lambda$opi$ZIhCyM7gQR3wp87WIQozaI3w6EA<Object>(this), (Consumer<? super Throwable>) $$Lambda$opi$VjTlHcg1DyWxbq5Z5KV41Pzsrh0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ojc ojc) {
        boolean b2 = ojc.b().a().b();
        if (ojc.n() || !((a) this.c.j()).b()) {
            return Observable.b(((a) this.c.j()).e().c(b2).a(false).b(false).a());
        }
        return this.e.a(this.f).e((Function<? super Throwable, ? extends T>) $$Lambda$opi$4Ebqg1iMd1xWheSgOm72vPKYih4.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$opi$mca7yvz2FDFuRKJYkARwZ5Yp1wU<Object,Object>(b2)).f((ObservableSource<? extends T>) Observable.b(a.f().c(b2).b(true).a(true).a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        this.c.onNext(aVar);
        if (!aVar.c()) {
            this.b.onComplete();
        }
    }

    public final void a(opn opn) {
        this.i = opn;
        if (opn != null) {
            this.h.a(this.c.d((Consumer<? super T>) new $$Lambda$opi$NzV4EygDqse2b6QEsVTC8S5S1ho<Object>(this)));
        } else {
            this.h.a(Disposables.a());
        }
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
}
