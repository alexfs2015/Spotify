package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.effortlesslogin.LoginState;
import com.spotify.effortlesslogin.LoginState.Type;
import com.spotify.effortlesslogin.backend.EffortlessLoginTokenResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: gda reason: default package */
public class gda extends lt {
    public final ln<LoginState> a = new ln<>();
    private final gdd b;
    private final gdf c;
    private final vix d;
    private final Scheduler e;
    private final Scheduler f;
    private final SerialDisposable g = new SerialDisposable();

    public gda(gdd gdd, gdf gdf, vix vix, Scheduler scheduler, Scheduler scheduler2) {
        this.b = gdd;
        this.c = gdf;
        this.d = vix;
        this.e = scheduler;
        this.f = scheduler2;
    }

    public final void c() {
        a(Type.LOGGING_IN);
        this.g.a(this.d.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gda$4tNQmY63GrZepGYKZt6gpBV5l0<Object,Object>(this), false).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$gda$IWZmo_mj5C53LAg8qIkyLpYbGE<Object,Object>(this), false).b(this.f).a(this.e).a((Consumer<? super T>) new $$Lambda$gda$HFkKvp1PvX5mCcRzzuhwAZ78KU<Object>(this), (Consumer<? super Throwable>) new $$Lambda$gda$2TmNvNaFKY2LhY9kX3riNVBNDk<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        a(bool.booleanValue() ? Type.LOGGED_IN : Type.LOGIN_FAILED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to do effortless login", new Object[0]);
        a(Type.LOGIN_FAILED);
    }

    /* access modifiers changed from: private */
    public Observable<EffortlessLoginTokenResponse> a(viz viz) {
        return this.c.a(viz.a());
    }

    /* access modifiers changed from: private */
    public Single<Boolean> a(EffortlessLoginTokenResponse effortlessLoginTokenResponse) {
        return this.b.a(effortlessLoginTokenResponse.token());
    }

    private void a(Type type) {
        this.a.b(LoginState.a(type));
    }

    public final void a() {
        this.g.a(Disposables.a());
        super.a();
    }
}
