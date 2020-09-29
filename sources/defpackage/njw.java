package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: njw reason: default package */
public final class njw {
    final uxh a;
    final String b;
    final CompositeDisposable c = new CompositeDisposable();
    final nng d;
    public nka e;
    public volatile boolean f;
    private final nkd g;
    private final nnl<wsj<Void>> h;

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public njw(final a aVar, final oix oix, nkd nkd, kxz kxz, uxh uxh, String str, final hvl hvl, nng nng) {
        this.g = nkd;
        this.a = uxh;
        this.b = str;
        this.d = nng;
        aVar.a(new c() {
            public final void b(Bundle bundle) {
                super.b(bundle);
                if (bundle != null) {
                    njw.this.f = bundle.getBoolean("triggerResync", false);
                }
            }

            public final void a(Bundle bundle) {
                super.a(bundle);
                bundle.putBoolean("triggerResync", njw.this.f);
            }

            public final void c() {
                CompositeDisposable compositeDisposable = njw.this.c;
                Observable a2 = Observable.b((Callable<? extends T>) new $$Lambda$njw$1$ubXBLrzGqnMMyvKjmtXNWYwOcug<Object>(this, oix)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$njw$1$tFlci_5Y0h7r7BG0Uu8rppOkyaY<Object,Object>(this, hvl), false);
                $$Lambda$njw$1$MXF64tdJQjD3s4bSE4jwWhEZ7IA r2 = new $$Lambda$njw$1$MXF64tdJQjD3s4bSE4jwWhEZ7IA(this);
                ObjectHelper.a(r2, "predicate is null");
                compositeDisposable.a(RxJavaPlugins.a((Observable<T>) new ObservableTakeWhile<T>(a2, r2)).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$njw$1$dbUvrEm1LjHEgeSwsAAwy8fcJw<Object>(this)));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ Observable a(oix oix) {
                Logger.b("mTriggerResync %b", Boolean.valueOf(njw.this.f));
                if (!njw.this.f) {
                    return oix.c();
                }
                Completable b2 = njw.this.a.a(njw.this.b).b((Action) new $$Lambda$njw$1$UK32x4x5lgOM_hWDRRAs5EarA(this));
                Observable c2 = oix.c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Scheduler a2 = Schedulers.a();
                ObjectHelper.a(timeUnit, "unit is null");
                ObjectHelper.a(a2, "scheduler is null");
                ObservableSampleTimed observableSampleTimed = new ObservableSampleTimed(c2, 500, timeUnit, a2, false);
                return b2.a((ObservableSource<T>) RxJavaPlugins.a((Observable<T>) observableSampleTimed));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                njw.this.f = false;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ boolean b(nni nni) {
                return njw.this.e != null;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(nni nni) {
                njw njw = njw.this;
                Logger.b(nni.toString(), new Object[0]);
                njw.e.ap();
                if ((nni instanceof a) || (nni instanceof e)) {
                    njw.e.aq();
                    njw.e.al();
                } else if ((nni instanceof d) || (nni instanceof c)) {
                    njw.e.aq();
                    njw.e.al();
                } else if (nni instanceof j) {
                    njw.e.as();
                    DebugFlag debugFlag = DebugFlag.HOME_MIX_WELCOME_SCREEN_SHOW;
                } else if (nni instanceof g) {
                    njw.e.an();
                } else if (nni instanceof i) {
                    njw.e.am();
                } else {
                    if (nni instanceof h) {
                        njw.e.ao();
                    }
                }
            }

            public final void a() {
                njw.this.c.c();
            }

            public final void aP_() {
                aVar.b(this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ ObservableSource a(hvl hvl, Observable observable) {
                return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) hvl.a.j(), (BiFunction<? super T1, ? super T2, ? extends R>) njw.this.d).a(Functions.a());
            }
        });
        this.h = new nnl<>(kxz, $$Lambda$njw$rgrUmDRwrAJhFuzKMB9NY0Shdp4.INSTANCE);
    }

    public final void a() {
        this.c.a(this.g.a(ImmutableMap.b("enabled", Boolean.TRUE)).a((SingleTransformer<? super T, ? extends R>) this.h).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$njw$XgFD521qbUk3_iummlYZl9HA4NQ<Object,Object>(this)).d().e(nnk.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$njw$ZJvTJ5WWJE4nhXg0k1jzydmthR4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$njw$pUEVjM288DI8P0YDJmPNmHmS4M<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nnk nnk) {
        Logger.b(nnk.toString(), new Object[0]);
        if (!(nnk.a instanceof b) && this.e != null) {
            if (nnk.a instanceof a) {
                this.e.at();
            } else if (nnk.a instanceof c) {
                this.e.ay();
            } else {
                this.e.aw();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        nka nka = this.e;
        if (nka != null) {
            nka.at();
        }
    }

    public final void b() {
        this.c.a(this.g.a().f($$Lambda$njw$T50K0JcezGqNlLBJWDzpYFFTCdc.INSTANCE).bd_().a((CompletableSource) this.a.a(this.b)).a(AndroidSchedulers.a()).a((Action) $$Lambda$njw$k3CalfCO1fwErp1spzdQzKAbg4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$njw$gQjQBdNTHsSr5qTdmDPALIPc3E.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(wsj wsj) {
        if (wsj.a.c == 200) {
            return Integer.valueOf(wsj.a.c);
        }
        throw new RuntimeException(String.format("Server returned error %d", new Object[]{Integer.valueOf(wsj.a.c)}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(nnk nnk) {
        if (nnk.a instanceof d) {
            return this.a.a(this.b).a((SingleSource<T>) Single.b(nnk));
        }
        return Single.b(nnk);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(wsj wsj) {
        return wsj != null && (wsj.a.c == 200 || wsj.a.c == 202);
    }
}
