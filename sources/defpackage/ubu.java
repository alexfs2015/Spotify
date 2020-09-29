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

/* renamed from: ubu reason: default package */
public final class ubu implements uau {
    final PublishSubject<ucb> a = PublishSubject.a();
    private final ucf b;
    private final ucg c;
    private final RxResolver d;
    private final hvl e;
    private final Scheduler f;
    private final Scheduler g;
    private final Scheduler h;
    private final AtomicInteger i = new AtomicInteger(0);
    private final rnc j;
    private Observable<ucd> k;

    public ubu(ucf ucf, ucg ucg, RxResolver rxResolver, hvl hvl, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, rnf rnf) {
        this.b = ucf;
        this.c = ucg;
        this.d = rxResolver;
        this.e = hvl;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = scheduler3;
        this.j = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
    }

    public final Observable<uax> a() {
        return c().c((Function<? super T, ? extends R>) $$Lambda$ubu$dwJY_M9_gM7cM6lxaijotIM7teM.INSTANCE).a(Functions.a());
    }

    private Completable a(ucb ucb) {
        int incrementAndGet = this.i.incrementAndGet();
        return c().c(1).b((Consumer<? super T>) new $$Lambda$ubu$yWYWRCdJ7ivTYHEhezSFS3m9Yc<Object>(this, ucb, incrementAndGet)).c((ObservableSource<? extends T>) c()).c((Predicate<? super T>) new $$Lambda$ubu$68atDX4JZ7J_KFK0uFsSuWhYdM<Object>(incrementAndGet)).g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ucb ucb, int i2, ucd ucd) {
        this.a.onNext(ucb);
        this.a.onNext(new k(i2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i2, ucd ucd) {
        if (ucd.c() >= i2) {
            if (!(ucd.e() || ucd.g() || ucd.i())) {
                return true;
            }
        }
        return false;
    }

    private Observable<ucd> c() {
        if (this.k == null) {
            this.k = d().a(this.h).c((Consumer<? super Disposable>) $$Lambda$ubu$5PhSjxuPhHFcC3x4qly4ApBP16Q.INSTANCE).a((Action) $$Lambda$ubu$IT9t_YRSDM0QCb2ITRf6YC3Zr_g.INSTANCE).a(1).a();
        }
        return this.k;
    }

    private Observable<ucd> d() {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new Callable<ObservableSource<? extends ucd>>() {
            private ucd a;

            /* access modifiers changed from: private */
            public /* synthetic */ void a(ucd ucd) {
                this.a = ucd;
            }

            public final /* synthetic */ Object call() {
                Observable d = Observable.d();
                ubu ubu = ubu.this;
                c a2 = ubu.a(ubu, (Observable) ubu.a);
                ucd ucd = this.a;
                return d.a(klb.a(a2, ucd != null ? ucd.a(false) : ucd.a)).b((Consumer<? super T>) new $$Lambda$ubu$2$dmWDbvKtqOfDrP2WlgYkvVk670<Object>(this));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv f() {
        return new kld(this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv e() {
        return new kld(this.g);
    }

    public final Completable a(boolean z) {
        return a((ucb) new h(z));
    }

    public final Completable a(String str) {
        return a((ucb) new e(str));
    }

    public final Completable b() {
        return a((ucb) new g());
    }

    static /* synthetic */ c a(ubu ubu, Observable observable) {
        $$Lambda$7ZqQ3bpIsHr0eU1PSXad1GRVJW8 r0 = $$Lambda$7ZqQ3bpIsHr0eU1PSXad1GRVJW8.INSTANCE;
        ucf ucf = ubu.b;
        ucg ucg = ubu.c;
        Scheduler scheduler = ubu.f;
        a a2 = klb.a((kjz<M, E, F>) r0, klb.a().a(b.class, uce.a(ucf, scheduler)).a(c.class, uce.b(ucf, scheduler)).a(e.class, uce.c(ucf, scheduler)).a(d.class, uce.d(ucf, scheduler)).a(f.class, uce.e(ucf, scheduler)).a(a.class, uce.f(ucf, scheduler)).a(g.class, uce.a(ucg)).a()).a((kjo<M, F>) $$Lambda$XYzHNeE_ODnFum7PrjJXa8Vk9xE.INSTANCE).b(new $$Lambda$ubu$J7bOY0oEUT1Hn8XCeXQE6IHteQ(ubu)).a((kkp<kkv>) new $$Lambda$ubu$WP4HDJ7yfbTLmkGwRWqMFK0DhDU<kkv>(ubu));
        RxResolver rxResolver = ubu.d;
        hvl hvl = ubu.e;
        a a3 = a2.a(kla.a(observable, uch.a(rxResolver, ubu.j, ubu.g), uch.a(hvl)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return a3;
    }
}
