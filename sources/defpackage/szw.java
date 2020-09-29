package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;

/* renamed from: szw reason: default package */
public final class szw extends gld<Intent> {
    private final Completable a;
    private final Observable<fqn> b;
    private final Observable<SessionState> c;
    private final Scheduler d;
    private final xja<Intent, fqn, SessionState, Completable> e;
    private final String f;
    private final xiy<Intent, String> g;

    /* renamed from: szw$a */
    public static class a {
        final Completable a;
        final Observable<fqn> b;
        final Observable<SessionState> c;
        final Scheduler d;

        public a(Completable completable, Observable<fqn> observable, Observable<SessionState> observable2, Scheduler scheduler) {
            this.a = completable;
            this.b = observable;
            this.c = observable2;
            this.d = scheduler;
        }

        public final szw a(xiu<Intent, fqn, SessionState> xiu, String str, xiy<Intent, String> xiy) {
            szw szw = new szw(this.a, this.b, this.c, this.d, xiu, str, xiy);
            return szw;
        }
    }

    szw(Completable completable, Observable<fqn> observable, Observable<SessionState> observable2, Scheduler scheduler, xiu<Intent, fqn, SessionState> xiu, String str, xiy<Intent, String> xiy) {
        this.a = (Completable) fbp.a(completable);
        this.b = (Observable) fbp.a(observable);
        this.c = (Observable) fbp.a(observable2);
        this.d = (Scheduler) fbp.a(scheduler);
        this.e = new $$Lambda$szw$3D3YLJWo7EiJMEBsyz3QX8Bi9MM(xiu);
        this.f = str;
        this.g = xiy;
    }

    szw(Completable completable, Observable<fqn> observable, Observable<SessionState> observable2, Scheduler scheduler, xja<Intent, fqn, SessionState, Completable> xja, String str, xiy<Intent, String> xiy) {
        this.a = (Completable) fbp.a(completable);
        this.b = (Observable) fbp.a(observable);
        this.c = (Observable) fbp.a(observable2);
        this.d = (Scheduler) fbp.a(scheduler);
        this.e = xja;
        this.f = str;
        this.g = xiy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, gcl gcl, fqn fqn, SessionState sessionState) {
        return (Completable) this.e.call(intent, fqn, sessionState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Completable completable) {
        return completable.b(this.d);
    }

    public final /* synthetic */ Completable a(Object obj) {
        Intent intent = (Intent) obj;
        Object obj2 = new Object();
        return Observable.a((ObservableSource<? extends T1>) this.a.b((Action) new $$Lambda$szw$eJURMHwvF0x9iJrHp7eKx3mJ4eQ(obj2)).a((ObservableSource<T>) Observable.b(gcl.a())), (ObservableSource<? extends T2>) this.b.b((Consumer<? super T>) new $$Lambda$szw$n4t22gbJnqSqZUdh2T4_fm_wQZQ<Object>(obj2)), (ObservableSource<? extends T3>) this.c.b((Consumer<? super T>) new $$Lambda$szw$8wajjR6aCeQwT21czCoh7YG73M8<Object>(obj2)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$szw$HSaZAl3DHDcawjTxR49RezLqS0o<Object,Object,Object,Object>(this, intent)).c(1).h().e(new $$Lambda$szw$SC9RLFfCOZsO3cHDM9aJtlPAIhU(this));
    }

    public final String a() {
        return this.f;
    }

    public final /* synthetic */ String b(Object obj) {
        return (String) this.g.call((Intent) obj);
    }
}
