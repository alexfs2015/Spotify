package com.spotify.mobile.android.spotlets.ads.marquee;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

public class MarqueeService extends vtp {
    public hvl a;
    public hec b;
    public defpackage.kju.a<MarqueeTriggerModel, ibm, ibk> c;
    private final a d = new a();
    private final SerialDisposable e = new SerialDisposable();
    private kju<MarqueeTriggerModel, ibm, ibk> f;

    public class a extends Binder {
        public a() {
        }
    }

    public void onCreate() {
        Logger.b("[Marquee] - onCreate service", new Object[0]);
        super.onCreate();
        this.e.a(Observable.a((ObservableSource<? extends T1>) this.b.a(hwb.l).j(), (ObservableSource<? extends T2>) this.a.a.c((Function<? super T, ? extends R>) $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac.INSTANCE).a(Functions.a()).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$MarqueeService$D7zx744S4cRoooaVaUa_srEFhTQ.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                MarqueeService.this.a((Boolean) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$MarqueeService$72ELqBlni7WJ65I5uaSnup3TfOc.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(RolloutFlag rolloutFlag, Boolean bool) {
        return Boolean.valueOf(rolloutFlag == RolloutFlag.ENABLED && bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            Logger.b("[Marquee] - start MarqueeService", new Object[0]);
            if (this.f == null) {
                this.f = this.c.a(MarqueeTriggerModel.a);
            }
            return;
        }
        b();
    }

    private void b() {
        Logger.b("[Marquee] - stop MarqueeService", new Object[0]);
        kju<MarqueeTriggerModel, ibm, ibk> kju = this.f;
        if (kju != null) {
            kju.dispose();
            this.f = null;
        }
    }

    public void onDestroy() {
        Logger.b("[Marquee] - onDestroy service", new Object[0]);
        a();
        super.onDestroy();
    }

    public final void a() {
        this.e.bf_();
        b();
    }

    public IBinder onBind(Intent intent) {
        return this.d;
    }

    public static Intent a(Context context) {
        return new Intent(context, MarqueeService.class);
    }
}
