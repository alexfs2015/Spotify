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

/* renamed from: ktg reason: default package */
public final class ktg {
    private final Scheduler a;
    private final Flowable<SessionState> b;

    public ktg(Scheduler scheduler, Flowable<SessionState> flowable) {
        this.a = scheduler;
        this.b = flowable;
    }

    public final Observable<Boolean> a() {
        return this.b.a((Predicate<? super T>) $$Lambda$ktg$UQ1meizsTOLULRtF_IZ8fZ0v3dM.INSTANCE).b((Predicate<? super T>) $$Lambda$ktg$UQ1meizsTOLULRtF_IZ8fZ0v3dM.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ktg$Z_GXS7TE5VVveSCyDknSO7pxPA.INSTANCE).e(10, TimeUnit.SECONDS, this.a).j().d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ktg$a0kyAcTnP9Odg4Ob3ubZFcMIBfE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Throwable th) {
        if (th instanceof TimeoutException) {
            return Observable.b(Boolean.FALSE);
        }
        return Observable.a(th);
    }

    /* access modifiers changed from: 0000 */
    public final Completable b() {
        Flowable b2 = this.b.a((Predicate<? super T>) $$Lambda$ktg$HUvLHUfX7gMPX5IViAVG2PNa0QQ.INSTANCE).e(60, TimeUnit.SECONDS, this.a).b((Predicate<? super T>) $$Lambda$ktg$UQ1meizsTOLULRtF_IZ8fZ0v3dM.INSTANCE);
        $$Lambda$ktg$lCy64EGJmjhSnfXnGeJ7qH7taJ8 r1 = $$Lambda$ktg$lCy64EGJmjhSnfXnGeJ7qH7taJ8.INSTANCE;
        ObjectHelper.a(r1, "mapper is null");
        ObjectHelper.a(Integer.MAX_VALUE, "maxConcurrency");
        return RxJavaPlugins.a((Completable) new FlowableFlatMapCompletableCompletable(b2, r1, false, Integer.MAX_VALUE)).a((Function<? super Throwable, ? extends CompletableSource>) $$Lambda$ktg$eY8T10InGxSh6j04vKZU5UoOfZQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource c(SessionState sessionState) {
        if (!sessionState.loggedIn()) {
            return Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_NOT_LOGGED_IN));
        }
        if (!sessionState.canConnect()) {
            return Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_OFFLINE_MODE_ACTIVE));
        }
        return Completable.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Throwable th) {
        if (th instanceof TimeoutException) {
            return Completable.a((Throwable) new BuiltInAuthException(AuthError.ERROR_AUTHENTICATION_FAILED));
        }
        return Completable.a(th);
    }

    /* access modifiers changed from: private */
    public static boolean b(SessionState sessionState) {
        return sessionState.loggedIn() && sessionState.connected();
    }

    /* access modifiers changed from: private */
    public static boolean a(SessionState sessionState) {
        if (!(!sessionState.loggedIn() && !sessionState.loggingIn())) {
            return (!sessionState.canConnect() && !sessionState.connected()) || b(sessionState);
        }
    }
}
