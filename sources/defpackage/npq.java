package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
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

/* renamed from: npq reason: default package */
public final class npq {
    final CompositeDisposable a = new CompositeDisposable();
    public npu b;
    public volatile boolean c;
    private final npx d;
    private final vjj e;
    private final String f;
    private final ntm<xgo<Void>> g;
    private final nth h;
    private final hxx i;

    public npq(npx npx, lbi lbi, vjj vjj, String str, hxx hxx, nth nth) {
        this.d = npx;
        this.e = vjj;
        this.f = str;
        this.h = nth;
        this.i = hxx;
        this.g = new ntm<>(lbi, $$Lambda$npq$pFijB17Z0nRc9S68tuZWKyU68w.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) this.i.a.j(), (BiFunction<? super T1, ? super T2, ? extends R>) this.h).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(xgo xgo) {
        if (xgo.a.c == 200) {
            return Integer.valueOf(xgo.a.c);
        }
        throw new RuntimeException(String.format("Server returned error %d", new Object[]{Integer.valueOf(xgo.a.c)}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ntj ntj) {
        Logger.b(ntj.toString(), new Object[0]);
        this.b.ap();
        if ((ntj instanceof a) || (ntj instanceof e)) {
            this.b.aq();
            this.b.al();
        } else if ((ntj instanceof d) || (ntj instanceof c)) {
            this.b.aq();
            this.b.al();
        } else if (ntj instanceof j) {
            this.b.as();
            DebugFlag debugFlag = DebugFlag.HOME_MIX_WELCOME_SCREEN_SHOW;
        } else if (ntj instanceof g) {
            this.b.an();
        } else if (ntj instanceof i) {
            this.b.am();
        } else {
            if (ntj instanceof h) {
                this.b.ao();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ntl ntl) {
        Logger.b(ntl.toString(), new Object[0]);
        if (!(ntl.a instanceof b) && this.b != null) {
            if (ntl.a instanceof a) {
                this.b.at();
            } else if (ntl.a instanceof c) {
                this.b.ay();
            } else {
                this.b.aw();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable b(a aVar) {
        Logger.b("mTriggerResync %b", Boolean.valueOf(this.c));
        if (!this.c) {
            return aVar.b().c();
        }
        Completable b2 = this.e.a(this.f).b((Action) new $$Lambda$npq$08yzlReaSQOEpv3btFBI4ALWz_o(this));
        Observable c2 = aVar.b().c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler a2 = Schedulers.a();
        ObjectHelper.a(timeUnit, "unit is null");
        ObjectHelper.a(a2, "scheduler is null");
        ObservableSampleTimed observableSampleTimed = new ObservableSampleTimed(c2, 500, timeUnit, a2, false);
        return b2.a((ObservableSource<T>) RxJavaPlugins.a((Observable<T>) observableSampleTimed));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(ntl ntl) {
        return ntl.a instanceof d ? this.e.a(this.f).a((SingleSource<T>) Single.b(ntl)) : Single.b(ntl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        npu npu = this.b;
        if (npu != null) {
            npu.at();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(ntj ntj) {
        return this.b != null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(xgo xgo) {
        return xgo != null && (xgo.a.c == 200 || xgo.a.c == 202);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c = false;
    }

    public final void a() {
        this.a.a(this.d.a(ImmutableMap.b("enabled", Boolean.TRUE)).a((SingleTransformer<? super T, ? extends R>) this.g).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$npq$G8OGLup5Z2rYgkhJSRws8IP8ROI<Object,Object>(this)).d().e(ntl.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$npq$XIPygA4yhOVp_IFogXKhq5zqN6A<Object>(this), (Consumer<? super Throwable>) new $$Lambda$npq$GdDX5YJACnj95fKG3QwU5D60Dlo<Object>(this)));
    }

    public final void a(a aVar) {
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.b((Callable<? extends T>) new $$Lambda$npq$rJSERR9bTHbUwj4phS9aKaLoFhE<Object>(this, aVar)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$npq$a047rUTC3Nbz1HBi05KZrE3AYYQ<Object,Object>(this), false);
        $$Lambda$npq$YfXFzqrDDnD7iR1BnuizXMw6mw r1 = new $$Lambda$npq$YfXFzqrDDnD7iR1BnuizXMw6mw(this);
        ObjectHelper.a(r1, "predicate is null");
        compositeDisposable.a(RxJavaPlugins.a((Observable<T>) new ObservableTakeWhile<T>(a2, r1)).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$npq$XQ1waBw1fMr9DBICFjhtv9NU5Q<Object>(this)));
    }

    public final void b() {
        this.a.a(this.d.a().f($$Lambda$npq$e8Ds_O1og_lEkeNKZ12wt6Q6jZc.INSTANCE).bb_().a((CompletableSource) this.e.a(this.f)).a(AndroidSchedulers.a()).a((Action) $$Lambda$npq$h9ZxlJwInTBnM5fQFK2nkAS99Mk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$npq$mQwUBE0DJjQQsLubZdrWiZi9psc.INSTANCE));
    }
}
