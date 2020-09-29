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

/* renamed from: gel reason: default package */
public class gel extends ly {
    public final ls<LoginState> a = new ls<>();
    private final geo b;
    private final geq c;
    private final vwc d;
    private final Scheduler e;
    private final Scheduler f;
    private final SerialDisposable g = new SerialDisposable();

    public gel(geo geo, geq geq, vwc vwc, Scheduler scheduler, Scheduler scheduler2) {
        this.b = geo;
        this.c = geq;
        this.d = vwc;
        this.e = scheduler;
        this.f = scheduler2;
    }

    /* access modifiers changed from: private */
    public Observable<EffortlessLoginTokenResponse> a(vwe vwe) {
        return this.c.a(vwe.a()).a((Consumer<? super Throwable>) new $$Lambda$gel$KPFlf6eRoj_l_5OEEvzG0zAaI<Object>(this));
    }

    /* access modifiers changed from: private */
    public Single<Boolean> a(EffortlessLoginTokenResponse effortlessLoginTokenResponse) {
        return this.b.a(effortlessLoginTokenResponse.token()).c((Consumer<? super Throwable>) new $$Lambda$gel$2Srom7TFMfqpBEuKxhB7Wu3Alo<Object>(this));
    }

    private void a(Type type) {
        this.a.b(LoginState.a(type));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        a(bool.booleanValue() ? Type.LOGGED_IN : Type.LOGIN_FAILED);
    }

    private void a(String str) {
        this.a.b(new gej(Type.LOGIN_FAILED, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a("Failed to login with One Time Token");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        a("Failed to get One Time Token");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e(th, "Failed to do effortless login", new Object[0]);
        a(Type.LOGIN_FAILED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        a("Failed to fetch Samsung Token");
    }

    public final void a() {
        this.g.a(Disposables.a());
        super.a();
    }

    public final void c() {
        a(Type.LOGGING_IN);
        this.g.a(this.d.a().a((Consumer<? super Throwable>) new $$Lambda$gel$opNaWMYqXgr56yDy4XNCC06xcdw<Object>(this)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gel$jClotWsW8vyweLmnS_16vw2bOo<Object,Object>(this), false).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$gel$K3GlqCmFW3ItEaKXW6gLUBlIrS0<Object,Object>(this), false).b(this.f).a(this.e).a((Consumer<? super T>) new $$Lambda$gel$RZmFhSDvdq1kB5RdzL_yHULdq8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$gel$3ibN7oFiKeDWu4UK2SCGXztZok<Object>(this)));
    }
}
