package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: uop reason: default package */
public final class uop implements unp {
    final PublishSubject<uow> a = PublishSubject.a();
    private final upa b;
    private final upb c;
    private final RxResolver d;
    private final hxx e;
    private final Scheduler f;
    private final Scheduler g;
    private final AtomicInteger h = new AtomicInteger(0);
    private final rwi i;
    private Observable<uoy> j;

    public uop(upa upa, upb upb, RxResolver rxResolver, hxx hxx, Scheduler scheduler, Scheduler scheduler2, rwl rwl) {
        this.b = upa;
        this.c = upb;
        this.d = rxResolver;
        this.e = hxx;
        this.f = scheduler;
        this.g = scheduler2;
        this.i = new rwi(rwl) {
            public final rwj a(rwj rwj) {
                return rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
    }

    private Completable a(uow uow) {
        int incrementAndGet = this.h.incrementAndGet();
        return c().c(1).b((Consumer<? super T>) new $$Lambda$uop$acmUNOh6IZVI_kpDlI76NKg7ybc<Object>(this, uow, incrementAndGet)).c((ObservableSource<? extends T>) c()).b((Predicate<? super T>) new $$Lambda$uop$OsehuD6VMAP8fRmkUyzcb2HnB6c<Object>(incrementAndGet)).g();
    }

    static /* synthetic */ c a(uop uop, Observable observable) {
        $$Lambda$AecZdxNCbdEY4B1My68dKggwgVE r0 = $$Lambda$AecZdxNCbdEY4B1My68dKggwgVE.INSTANCE;
        upa upa = uop.b;
        a a2 = kok.a((kni<M, E, F>) r0, kok.a().a(b.class, uoz.a(upa)).a(c.class, uoz.b(upa)).a(e.class, uoz.c(upa)).a(d.class, uoz.d(upa)).a(f.class, uoz.e(upa)).a(a.class, uoz.f(upa)).a(g.class, uoz.a(uop.c)).a()).a((kmx<M, F>) $$Lambda$H2qvTlpUawiCml11L_vzxbVaqZo.INSTANCE).b(new $$Lambda$uop$oWrSoeUTVNsOxVxuoNlkoYHFd2Y(uop)).a((kny<koe>) new $$Lambda$uop$RYt4OL1urNSQG5ALAHfx6rzG7fc<koe>(uop));
        RxResolver rxResolver = uop.d;
        hxx hxx = uop.e;
        a a3 = a2.a(koj.a(observable, upc.a(rxResolver, uop.i, uop.f), upc.a(hxx)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return a3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uow uow, int i2, uoy uoy) {
        this.a.onNext(uow);
        this.a.onNext(new k(i2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i2, uoy uoy) {
        if (uoy.d() >= i2) {
            if (!(uoy.f() || uoy.h() || uoy.j())) {
                return true;
            }
        }
        return false;
    }

    private Observable<uoy> c() {
        if (this.j == null) {
            this.j = d().a(this.g).c((Consumer<? super Disposable>) $$Lambda$uop$Fk4hna6xMpq3v6EncGxq6SePKow.INSTANCE).a((Action) $$Lambda$uop$QwbGcgX3EKSMG0eLpUL4wxcFjE.INSTANCE).a(1).a();
        }
        return this.j;
    }

    private Observable<uoy> d() {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new Callable<ObservableSource<? extends uoy>>() {
            private uoy a;

            /* access modifiers changed from: private */
            public /* synthetic */ void a(uoy uoy) {
                this.a = uoy;
            }

            public final /* synthetic */ Object call() {
                Observable d = Observable.d();
                uop uop = uop.this;
                c a2 = uop.a(uop, (Observable) uop.a);
                uoy uoy = this.a;
                if (uoy == null) {
                    uoy = uoy.a;
                }
                return d.a(kok.a(a2, uoy)).b((Consumer<? super T>) new $$Lambda$uop$2$rULVjBEYdy6cUTGJ1GDQY3SVLY<Object>(this));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe e() {
        return new kom(this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe f() {
        return new kom(this.f);
    }

    public final Completable a(String str) {
        return a((uow) new e(str));
    }

    public final Completable a(boolean z) {
        return a((uow) new h(true));
    }

    public final Observable<uns> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$uop$bybFrbRZ3uMUbI__OJnIulwvI78.INSTANCE).a(Functions.a());
    }

    public final Completable b() {
        return a((uow) new g());
    }
}
