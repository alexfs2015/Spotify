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

/* renamed from: sya reason: default package */
public final class sya {
    final CompositeDisposable a = new CompositeDisposable();
    private final sxx b;
    private final sye c;
    private final hgz d;
    private final hgy e;
    private final Observable<Boolean> f;
    private final uix g;
    private final Scheduler h;

    public sya(sxx sxx, sye sye, uix uix, hgz hgz, hgy hgy, Observable<Boolean> observable, Scheduler scheduler) {
        this.b = sxx;
        this.c = sye;
        this.d = hgz;
        this.e = hgy;
        this.f = observable;
        this.h = scheduler;
        this.g = uix;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fqn fqn, Boolean bool, Boolean bool2) {
        return Boolean.valueOf(((Boolean) fbp.a(bool)).booleanValue() || ((Boolean) fbp.a(bool2)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool2.booleanValue() && bool.booleanValue()) {
            this.c.c.a().a(sye.b, false).b();
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.c.c.a().a(sye.b, true).b();
            Logger.b("Has been exposed", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(syh syh) {
        if (syh.a().booleanValue()) {
            if (!sye.b(syh.d()) && (syh.c().booleanValue() || syh.b().booleanValue())) {
                sxx sxx = this.b;
                if (!sxx.a.c.a(sye.a, false) && sxx.a.c.a(sye.b, false)) {
                    sxx.a.c.a().a(sye.a, true).b();
                    sxx.b.a(MessageRequest.a("odt", "end-of-trial", PlaceboBannerView.V1));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean c(String str) {
        return Boolean.valueOf(str != null && str.contains(PremiumTrial.ACTIVE.mValue));
    }

    public final void a() {
        this.a.c();
        Observable a2 = this.f.a(Functions.a());
        String str = "on-demand-trial";
        Observable a3 = Observable.a((ObservableSource<? extends T1>) wit.b(this.d.a(str).e((xiy<? super T, ? extends R>) $$Lambda$sya$22AWo8SCczPyVbGBb1oBCNlC9zA.INSTANCE)), (ObservableSource<? extends T2>) wit.b(uix.a(this.d)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$sya$16E3N8xsoNJaOpEyNC2_9u2xZ28<Object,Object,Object>(this));
        String str2 = "payment-state";
        Disposable a4 = Observable.a(a2, a3, wit.b(this.d.a(str2).e((xiy<? super T, ? extends R>) $$Lambda$sya$crDy7lRtKfkjmKby2liypVLb6Uc.INSTANCE)), this.e.a().j(), $$Lambda$bPiRVu7vTKHlM2YUhb4iPB5WcM.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$sya$Ivwt8Etd8N6hfYtE03Bv3MyF9uE<Object>(this), (Consumer<? super Throwable>) $$Lambda$sya$YDnIqTZqnsMB1GayYOW8JIlsr7w.INSTANCE);
        Disposable a5 = Observable.a((ObservableSource<? extends T1>) this.e.a().j(), (ObservableSource<? extends T2>) wit.b(this.d.a(str).b().e((xiy<? super T, ? extends R>) $$Lambda$sya$2SLv9piq_71bK_J5SH6SpX3dy9c.INSTANCE)), (ObservableSource<? extends T3>) wit.b(this.d.a(str2).e((xiy<? super T, ? extends R>) $$Lambda$sya$AC7jUyUv_MUkxlwUZTx9OzSoj1Q.INSTANCE)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$sya$CLi4fGIxwszPwTlVy3qBM82df6g.INSTANCE).a(Functions.a()).a(this.h).a((Consumer<? super T>) new $$Lambda$sya$x6YM3tLwHNwmOiMfEEuqBCFE57I<Object>(this), (Consumer<? super Throwable>) $$Lambda$sya$d90P3Vl_9NW6aZIvDA1h_iC6M.INSTANCE);
        this.a.a(a4, a5);
    }
}
