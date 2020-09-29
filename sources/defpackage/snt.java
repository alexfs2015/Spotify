package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.mandatorytrials.model.PremiumTrial;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;

/* renamed from: snt reason: default package */
public final class snt {
    final CompositeDisposable a = new CompositeDisposable();
    private final snq b;
    private final snx c;
    private final hed d;
    private final hec e;
    private final Observable<Boolean> f;
    private final twu g;
    private final Scheduler h;

    public snt(snq snq, snx snx, twu twu, hed hed, hec hec, Observable<Boolean> observable, Scheduler scheduler) {
        this.b = snq;
        this.c = snx;
        this.d = hed;
        this.e = hec;
        this.f = observable;
        this.h = scheduler;
        this.g = twu;
    }

    public final void a() {
        this.a.c();
        Observable a2 = this.f.a(Functions.a());
        String str = "on-demand-trial";
        Observable a3 = Observable.a((ObservableSource<? extends T1>) vun.b(this.d.a(str).f($$Lambda$snt$VIu99RYuOxOGArmwbZUs2YKxK44.INSTANCE)), (ObservableSource<? extends T2>) vun.b(twu.a(this.d)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$snt$p9vB5dbfclpGzeMVxK4BAoL8so<Object,Object,Object>(this));
        String str2 = "payment-state";
        Disposable a4 = Observable.a(a2, a3, vun.b(this.d.a(str2).f($$Lambda$snt$3eaxu4O26U6EBG1lbpMBUmjQeK8.INSTANCE)), this.e.a().j(), $$Lambda$4VAe6AL_XnLEST7iDc7dQUHeM4.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$snt$3C1fUxb2jOvS5fSfJFR8PLHLNp4<Object>(this), (Consumer<? super Throwable>) $$Lambda$snt$wId8XXqQNk6QUZB4cSUOvMxBE.INSTANCE);
        Disposable a5 = Observable.a((ObservableSource<? extends T1>) this.e.a().j(), (ObservableSource<? extends T2>) vun.b(this.d.a(str).b().f($$Lambda$snt$wjDwUPU13SiiA7Z4f6hRrkSFpq4.INSTANCE)), (ObservableSource<? extends T3>) vun.b(this.d.a(str2).f($$Lambda$snt$pjfiRiJRSjUmHMQW7nRqgU626E4.INSTANCE)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$snt$m87xQwfKpEcb1ntez5rG71COB3Y.INSTANCE).a(Functions.a()).a(this.h).a((Consumer<? super T>) new $$Lambda$snt$anQe1X3DbIQjJ6hvTbwdqFU74<Object>(this), (Consumer<? super Throwable>) $$Lambda$snt$RLz6Q7CxDmQO1Unn9rdiJOjI2vE.INSTANCE);
        this.a.a(a4, a5);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(soa soa) {
        if (soa.a().booleanValue()) {
            if (!snx.b(soa.d()) && (soa.c().booleanValue() || soa.b().booleanValue())) {
                snq snq = this.b;
                if (!snq.a.c.a(snx.a, false) && snq.a.c.a(snx.b, false)) {
                    snq.a.c.a().a(snx.a, true).b();
                    snq.b.a(MessageRequest.a("odt", "end-of-trial", PlaceboBannerView.V1));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fpt fpt, Boolean bool, Boolean bool2) {
        return Boolean.valueOf(((Boolean) fay.a(bool)).booleanValue() || ((Boolean) fay.a(bool2)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.c.c.a().a(snx.b, true).b();
            Logger.b("Has been exposed", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean c(String str) {
        return Boolean.valueOf(str != null && str.contains(PremiumTrial.ACTIVE.mValue));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool2.booleanValue() && bool.booleanValue()) {
            this.c.c.a().a(snx.b, false).b();
        }
        if (bool.booleanValue() && !bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(String str) {
        return Boolean.valueOf(str != null && str.contains(PremiumTrial.EXPIRED.mValue));
    }
}
