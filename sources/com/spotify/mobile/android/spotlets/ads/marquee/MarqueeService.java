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

public class MarqueeService extends whv {
    public hxx a;
    public hgy b;
    public defpackage.knd.a<MarqueeTriggerModel, idy, idw> c;
    private final a d = new a();
    private final SerialDisposable e = new SerialDisposable();
    private knd<MarqueeTriggerModel, idy, idw> f;

    public class a extends Binder {
        public a() {
        }
    }

    public static Intent a(Context context) {
        Class<MarqueeService> cls = MarqueeService.class;
        return new Intent(context, MarqueeService.class);
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
        String str = "e[sqeMeopecier  a urSat]rMvsequ";
        Logger.b("[Marquee] - stop MarqueeService", new Object[0]);
        knd<MarqueeTriggerModel, idy, idw> knd = this.f;
        if (knd != null) {
            knd.dispose();
            this.f = null;
        }
    }

    public final void a() {
        this.e.bd_();
        b();
    }

    public IBinder onBind(Intent intent) {
        return this.d;
    }

    public void onCreate() {
        String str = "qe[mtr-vo  ueaeeMisnrrC ec]a";
        Logger.b("[Marquee] - onCreate service", new Object[0]);
        super.onCreate();
        this.e.a(Observable.a((ObservableSource<? extends T1>) this.b.a(hyn.l).j(), (ObservableSource<? extends T2>) this.a.a.c((Function<? super T, ? extends R>) $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac.INSTANCE).a(Functions.a()).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$MarqueeService$D7zx744S4cRoooaVaUa_srEFhTQ.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                MarqueeService.this.a((Boolean) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$MarqueeService$72ELqBlni7WJ65I5uaSnup3TfOc.INSTANCE));
    }

    public void onDestroy() {
        String str = "coa oD eMv t[rs-e]rioeeyqsrnu";
        Logger.b("[Marquee] - onDestroy service", new Object[0]);
        a();
        super.onDestroy();
    }
}
