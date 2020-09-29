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

/* renamed from: spp reason: default package */
public final class spp extends gjs<Intent> {
    private final Completable a;
    private final Observable<fpt> b;
    private final Observable<SessionState> c;
    private final Scheduler d;
    private final wuv<Intent, fpt, SessionState, Completable> e;
    private final String f;
    private final wut<Intent, String> g;

    /* renamed from: spp$a */
    public static class a {
        final Completable a;
        final Observable<fpt> b;
        final Observable<SessionState> c;
        final Scheduler d;

        public a(Completable completable, Observable<fpt> observable, Observable<SessionState> observable2, Scheduler scheduler) {
            this.a = completable;
            this.b = observable;
            this.c = observable2;
            this.d = scheduler;
        }

        public final spp a(wup<Intent, fpt, SessionState> wup, String str, wut<Intent, String> wut) {
            spp spp = new spp(this.a, this.b, this.c, this.d, wup, str, wut);
            return spp;
        }
    }

    public final /* synthetic */ Completable a(Object obj) {
        Intent intent = (Intent) obj;
        Object obj2 = new Object();
        return Observable.a((ObservableSource<? extends T1>) this.a.b((Action) new $$Lambda$spp$6YWGlLCgopBMxkUo09cGyOQ6AQ0(obj2)).a((ObservableSource<T>) Observable.b(gbn.a())), (ObservableSource<? extends T2>) this.b.b((Consumer<? super T>) new $$Lambda$spp$CtthgMx3Lo6cUBr6ASRIMvoiico<Object>(obj2)), (ObservableSource<? extends T3>) this.c.b((Consumer<? super T>) new $$Lambda$spp$UBMhcjsLpQ44o_zNTXmM2io8pGA<Object>(obj2)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$spp$LABExEIADXLf5I8C0bm2B0AOdE0<Object,Object,Object,Object>(this, intent)).c(1).h().e(new $$Lambda$spp$EtcwO95ihhKrjnnx0O2ZKHPOJZc(this));
    }

    public final /* synthetic */ String b(Object obj) {
        return (String) this.g.call((Intent) obj);
    }

    spp(Completable completable, Observable<fpt> observable, Observable<SessionState> observable2, Scheduler scheduler, wup<Intent, fpt, SessionState> wup, String str, wut<Intent, String> wut) {
        this.a = (Completable) fay.a(completable);
        this.b = (Observable) fay.a(observable);
        this.c = (Observable) fay.a(observable2);
        this.d = (Scheduler) fay.a(scheduler);
        this.e = new $$Lambda$spp$jnZQIppQiR9tTI_IrI5NlH3Hf8Q(wup);
        this.f = str;
        this.g = wut;
    }

    spp(Completable completable, Observable<fpt> observable, Observable<SessionState> observable2, Scheduler scheduler, wuv<Intent, fpt, SessionState, Completable> wuv, String str, wut<Intent, String> wut) {
        this.a = (Completable) fay.a(completable);
        this.b = (Observable) fay.a(observable);
        this.c = (Observable) fay.a(observable2);
        this.d = (Scheduler) fay.a(scheduler);
        this.e = wuv;
        this.f = str;
        this.g = wut;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable a(Intent intent, gbn gbn, fpt fpt, SessionState sessionState) {
        return (Completable) this.e.call(intent, fpt, sessionState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Completable completable) {
        return completable.b(this.d);
    }

    public final String a() {
        return this.f;
    }
}
