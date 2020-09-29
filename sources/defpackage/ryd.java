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

/* renamed from: ryd reason: default package */
public final class ryd {
    public final Observable<GaiaDevice> a;
    public final Observable<GaiaDevice> b;
    public final rze c;
    public final SerialDisposable d = new SerialDisposable();
    public final BehaviorSubject<ryc> e = BehaviorSubject.a();
    private final Observable<ryc> f;
    private final Observable<PlayerState> g;

    public ryd(ConnectManager connectManager, Scheduler scheduler, Flowable<PlayerState> flowable, rze rze) {
        this.g = flowable.j();
        this.c = rze;
        this.a = connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$k5IFIFh2b0rvliibq9wFIyISHk.INSTANCE, false).a((Predicate<? super T>) $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A.INSTANCE).a(Functions.a());
        this.b = connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$k5IFIFh2b0rvliibq9wFIyISHk.INSTANCE, false).a((Predicate<? super T>) $$Lambda$ryd$HQSxffuLzoGCgD6u5PpcPkDriM.INSTANCE).a((BiPredicate<? super T, ? super T>) $$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I.INSTANCE);
        this.f = Observable.a((ObservableSource<? extends T1>) connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ryd$qmbx3eBBss7eiiTemJAFuWcN45M.INSTANCE, false), (ObservableSource<? extends T2>) this.g, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ryd$yBwaEjHVnjzF6CYkOud9oREnZ3A.INSTANCE).b(100, TimeUnit.MILLISECONDS, scheduler).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$ryd$f1l_r_BbDiUjGuDX2go4BYb5CKw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ObservableSource<ryc> a(List<GaiaDevice> list) {
        ryc ryc;
        if (list.size() <= 1) {
            ryc = ryc.a();
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
                ryc = new ryc(ryc.a(gaiaDevice2) ? 3 : 2, Optional.b(gaiaDevice2));
            } else if (gaiaDevice != null) {
                ryc = new ryc(ryc.a(gaiaDevice) ? 5 : 4, Optional.b(gaiaDevice));
            } else {
                ryc = new ryc(1, Optional.e());
            }
        }
        return Observable.b(ryc);
    }

    /* access modifiers changed from: private */
    public static ryc a(ryc ryc) {
        Logger.b("Connect event: %s", ryc);
        return ryc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ryc a(ryc ryc, PlayerState playerState) {
        return (!playerState.isPlaying() || playerState.track() == null) ? ryc.a() : ryc;
    }

    /* access modifiers changed from: private */
    public static boolean a(GaiaDevice gaiaDevice) {
        return gaiaDevice.isBeingActivated() || gaiaDevice.getState() == GaiaDeviceState.CONNECTING;
    }

    public final void a() {
        SerialDisposable serialDisposable = this.d;
        Observable<ryc> observable = this.f;
        BehaviorSubject<ryc> behaviorSubject = this.e;
        behaviorSubject.getClass();
        $$Lambda$zxVLwe_JiOXaiQxGg7E5NEW8DOM r3 = new $$Lambda$zxVLwe_JiOXaiQxGg7E5NEW8DOM(behaviorSubject);
        BehaviorSubject<ryc> behaviorSubject2 = this.e;
        behaviorSubject2.getClass();
        serialDisposable.a(observable.a((Consumer<? super T>) r3, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject2)));
        this.c.a();
    }
}
