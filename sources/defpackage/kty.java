package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: kty reason: default package */
final class kty {
    Disposable a = Disposables.b();
    private final Flowable<SessionState> b;
    private final ktp c;
    private final ktw d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    kty(Flowable<SessionState> flowable, ktp ktp, ktw ktw) {
        this.b = flowable;
        this.c = ktp;
        this.d = ktw;
    }

    public final void a() {
        this.a = this.b.a((Predicate<? super T>) $$Lambda$kty$9Ymiv9ZolXH_9AQ_H6I7GUUTb8w.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kty$3u5VuI1xz9rs09_cpUERFl4gME.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$kty$uRahhjRXUqLRjf3KG9YWMP6hFZ4<Object>(this), (Consumer<? super Throwable>) $$Lambda$kty$TYRF4WbEy23FgVX2hlI58eOwabM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(SessionState sessionState) {
        return sessionState.loggingOut() || !sessionState.loggedIn();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.c.b();
        this.d.b();
    }
}
