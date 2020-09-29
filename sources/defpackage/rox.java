package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: rox reason: default package */
public final class rox {
    public final Observable<GaiaDevice> a;
    public final Observable<GaiaDevice> b;
    public final rpv c;
    public final SerialDisposable d = new SerialDisposable();
    public final BehaviorSubject<row> e = BehaviorSubject.a();
    private final Observable<row> f;
    private final Observable<PlayerState> g;

    public rox(ConnectManager connectManager, Scheduler scheduler, Flowable<PlayerState> flowable, rpv rpv) {
        this.g = flowable.j();
        this.c = rpv;
        this.a = connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$k5IFIFh2b0rvliibq9wFIyISHk.INSTANCE, false).a((Predicate<? super T>) $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A.INSTANCE).a(Functions.a());
        this.b = connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$k5IFIFh2b0rvliibq9wFIyISHk.INSTANCE, false).a((Predicate<? super T>) $$Lambda$rox$hwLetiBjGpBehNhvdfc1lcrNu68.INSTANCE).a((BiPredicate<? super T, ? super T>) $$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10.INSTANCE);
        this.f = Observable.a((ObservableSource<? extends T1>) connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$rox$SV4JUkfwwk4ZGRJ_t7fwWmFFDuY.INSTANCE, false), (ObservableSource<? extends T2>) this.g, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rox$tKkrzkF8vWB0wf3GW2UNXTgx8D4.INSTANCE).b(100, TimeUnit.MILLISECONDS, scheduler).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$rox$xCP3pP03DyWNh4RwZbsVXtRWu2A.INSTANCE);
    }

    public final void a() {
        SerialDisposable serialDisposable = this.d;
        Observable<row> observable = this.f;
        BehaviorSubject<row> behaviorSubject = this.e;
        behaviorSubject.getClass();
        $$Lambda$NRAZ9f5eRI6b41CSTilOnLvoV8 r3 = new $$Lambda$NRAZ9f5eRI6b41CSTilOnLvoV8(behaviorSubject);
        BehaviorSubject<row> behaviorSubject2 = this.e;
        behaviorSubject2.getClass();
        serialDisposable.a(observable.a((Consumer<? super T>) r3, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject2)));
        this.c.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ row a(row row, PlayerState playerState) {
        if (!playerState.isPlaying() || playerState.track() == null) {
            return row.a();
        }
        return row;
    }

    /* access modifiers changed from: private */
    public static ObservableSource<row> a(List<GaiaDevice> list) {
        row row;
        if (list.size() <= 1) {
            row = row.a();
        } else {
            GaiaDevice gaiaDevice = null;
            GaiaDevice gaiaDevice2 = null;
            for (GaiaDevice gaiaDevice3 : list) {
                if (gaiaDevice3.isActive() && !gaiaDevice3.isSelf()) {
                    gaiaDevice = gaiaDevice3;
                } else if (gaiaDevice3.isBeingActivated()) {
                    gaiaDevice2 = gaiaDevice3;
                }
            }
            if (gaiaDevice2 != null) {
                row = new row(row.a(gaiaDevice2) ? 3 : 2, Optional.b(gaiaDevice2));
            } else if (gaiaDevice != null) {
                row = new row(row.a(gaiaDevice) ? 5 : 4, Optional.b(gaiaDevice));
            } else {
                row = new row(1, Optional.e());
            }
        }
        return Observable.b(row);
    }

    /* access modifiers changed from: private */
    public static row a(row row) {
        Logger.b("Connect event: %s", row);
        return row;
    }

    /* access modifiers changed from: private */
    public static boolean a(GaiaDevice gaiaDevice) {
        return gaiaDevice.isBeingActivated() || gaiaDevice.getState() == GaiaDeviceState.CONNECTING;
    }
}
