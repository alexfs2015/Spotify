package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectManagerState;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.Iterator;
import java.util.List;

/* renamed from: mhi reason: default package */
public final class mhi implements mhh {
    private final Observable<ConnectManager> a;
    private final gkw b;

    /* renamed from: mhi$a */
    static class a implements BiFunction<List<grz>, Optional<GaiaDevice>, List<grz>> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            GaiaDevice gaiaDevice;
            List list = (List) obj;
            Optional optional = (Optional) obj2;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gsa gsa = new gsa("unknown", "local_device", GaiaDeviceState.LOGGED_IN, GaiaTypes.UNKNOWN);
                    GaiaDevice gaiaDevice2 = new GaiaDevice(false, false, false, false, gsa.a, false, gsa.b, false, false, false, gsa.c, false, 0, gsa.d, gsa.e, gsa.f, gsa.g, gsa.h, gsa.i, gsa.j, gsa.k, gsa.l, gsa.m, gsa.n, false, gsa.o);
                    gaiaDevice = gaiaDevice2;
                    break;
                }
                grz grz = (grz) it.next();
                if (grz.isSelf()) {
                    gaiaDevice = grz;
                    break;
                }
            }
            if (optional.b() && ((GaiaDevice) optional.c()).isSelf()) {
                gaiaDevice.setActive();
            }
            return list;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ConnectManager a(ConnectManager connectManager, ConnectManagerState connectManagerState) {
        return connectManager;
    }

    public mhi(Observable<ConnectManager> observable, gkw gkw) {
        this.a = observable.a(1).a();
        this.b = gkw;
    }

    private Observable<ConnectManager> e() {
        return this.a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mhi$E202DcwHRc3KA7ZjyaQxJnr3R2k.INSTANCE, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ConnectManagerState connectManagerState) {
        return connectManagerState == ConnectManagerState.STARTED;
    }

    public final Observable<List<grz>> a() {
        return Observable.a((ObservableSource<? extends T1>) e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mhi$pe0LKyL53kiHIMQvU58ktI1WQXk<Object,Object>(this), false), (ObservableSource<? extends T2>) e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mhi$hnLA4GvTL7D8oreRscV7Pw73gQ.INSTANCE, false), (BiFunction<? super T1, ? super T2, ? extends R>) new a<Object,Object,Object>(0)).a(Functions.a());
    }

    public final Disposable a(grz grz) {
        return e().a((Consumer<? super T>) new $$Lambda$mhi$sN9RGUOFM5kIdJmk2BDmHgthz7o<Object>(grz), (Consumer<? super Throwable>) new $$Lambda$mhi$jyq1GMnR4ngEi6W481rLMlrrles<Object>(grz));
    }

    public final Disposable b() {
        return e().a((Consumer<? super T>) $$Lambda$MukfWW9xRrquwYK_T_A5mnvOM1s.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mhi$zIgZR5SbQp2tvKdQHB3KnIVWYIk.INSTANCE);
    }

    public final Observable<Float> c() {
        return e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mhi$bQ40KeLpmHAkOvrF3h2C3DL3HN4<Object,Object>(this), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(ConnectManager connectManager) {
        return connectManager.i().e(Float.valueOf(this.b.c())).a((Predicate<? super T>) $$Lambda$mhi$v7q9REoGSeusCVphoqNcWIVMVuw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Float f) {
        return f.floatValue() >= 0.0f;
    }

    public final Disposable a(float f) {
        return e().a((Consumer<? super T>) new $$Lambda$mhi$VNmP1hyicEDh6dIXrKF_657Z0w<Object>(this, f), (Consumer<? super Throwable>) $$Lambda$mhi$JPvwOj9F_IbEDIXzSlht8yk7FQM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f, ConnectManager connectManager) {
        this.b.a(Float.valueOf(f));
    }

    public final Disposable d() {
        return e().a((Consumer<? super T>) $$Lambda$Wi3cm_Xes7CXxDYmKE7ols3KCo.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mhi$nJzVrYVIbVFF7sJuZsqME2m_xc4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ConnectManager connectManager, GaiaDevice gaiaDevice) {
        if (!gaiaDevice.isSelf() && gaiaDevice.isActive() && connectManager.v()) {
            gaiaDevice.setSupportsVolume(true);
            Logger.b("supportsVolume overwritten: %b", Boolean.valueOf(gaiaDevice.supportsVolume()));
        }
        return Observable.b(gaiaDevice);
    }

    /* access modifiers changed from: private */
    public Observable<List<grz>> a(ConnectManager connectManager) {
        return connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mhi$RNg8RPsvtvkIKnzPpOfWhiK43oE<Object,Object>(connectManager), false);
    }
}
