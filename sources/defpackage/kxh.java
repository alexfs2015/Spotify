package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: kxh reason: default package */
final class kxh {
    Disposable a = Disposables.b();
    private final Flowable<SessionState> b;
    private final kwy c;
    private final kxf d;

    kxh(Flowable<SessionState> flowable, kwy kwy, kxf kxf) {
        this.b = flowable;
        this.c = kwy;
        this.d = kxf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.c.b();
        this.d.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(SessionState sessionState) {
        return sessionState.loggingOut() || !sessionState.loggedIn();
    }

    public final void a() {
        this.a = this.b.a((Predicate<? super T>) $$Lambda$kxh$Bf1TOCSAp3UALo9VR4K1fR70ap0.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kxh$Fa0Cihla9IBWbCaFsQhm6GbMlc.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$kxh$zHf53qNQ9szgQdajAZ7wyqPG1w4<Object>(this), (Consumer<? super Throwable>) $$Lambda$kxh$CEX9p1GZY7execg2EOpNDz3qhzw.INSTANCE);
    }
}
