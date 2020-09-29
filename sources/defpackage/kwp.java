package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException.AuthError;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: kwp reason: default package */
public final class kwp {
    private final Scheduler a;
    private final Flowable<SessionState> b;

    public kwp(Scheduler scheduler, Flowable<SessionState> flowable) {
        this.a = scheduler;
        this.b = flowable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Throwable th) {
        return th instanceof TimeoutException ? Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_AUTHENTICATION_FAILED)) : Completable.a(th);
    }

    /* access modifiers changed from: private */
    public static boolean a(SessionState sessionState) {
        if (!(!sessionState.loggedIn() && !sessionState.loggingIn())) {
            return (!sessionState.canConnect() && !sessionState.connected()) || b(sessionState);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Throwable th) {
        return th instanceof TimeoutException ? Observable.b(Boolean.FALSE) : Observable.a(th);
    }

    /* access modifiers changed from: private */
    public static boolean b(SessionState sessionState) {
        return sessionState.loggedIn() && sessionState.connected();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource c(SessionState sessionState) {
        return !sessionState.loggedIn() ? Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_NOT_LOGGED_IN)) : !sessionState.canConnect() ? Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_OFFLINE_MODE_ACTIVE)) : Completable.a();
    }

    public final Observable<Boolean> a() {
        return this.b.a((Predicate<? super T>) $$Lambda$kwp$C2pt32XwtPEnzx4_ZVQsdoTgbQw.INSTANCE).b((Predicate<? super T>) $$Lambda$kwp$C2pt32XwtPEnzx4_ZVQsdoTgbQw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kwp$GV68QtszVfbCq2xYOhc3qXkd2e8.INSTANCE).e(10, TimeUnit.SECONDS, this.a).j().d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$kwp$hz7qlC02w44fIhLCgzHTh4Ej3hY.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public final Completable b() {
        Flowable b2 = this.b.a((Predicate<? super T>) $$Lambda$kwp$fxljrXOYrmjv0v0RmCGOgpTdVuQ.INSTANCE).e(60, TimeUnit.SECONDS, this.a).b((Predicate<? super T>) $$Lambda$kwp$C2pt32XwtPEnzx4_ZVQsdoTgbQw.INSTANCE);
        $$Lambda$kwp$AAYKJqix0p6V4G2SqqNfppX0jo r1 = $$Lambda$kwp$AAYKJqix0p6V4G2SqqNfppX0jo.INSTANCE;
        ObjectHelper.a(r1, "mapper is null");
        ObjectHelper.a(Integer.MAX_VALUE, "maxConcurrency");
        return RxJavaPlugins.a((Completable) new FlowableFlatMapCompletableCompletable(b2, r1, false, Integer.MAX_VALUE)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$kwp$7cMHD_WtnD4jixSaQCtefVo.INSTANCE);
    }
}
