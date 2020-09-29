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

/* renamed from: mlw reason: default package */
public final class mlw implements mlv {
    private final Observable<ConnectManager> a;
    private final gmk b;

    /* renamed from: mlw$a */
    static class a implements BiFunction<List<gtz>, Optional<GaiaDevice>, List<gtz>> {
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
                    gua gua = new gua("unknown", "local_device", GaiaDeviceState.LOGGED_IN, GaiaTypes.UNKNOWN);
                    GaiaDevice gaiaDevice2 = new GaiaDevice(false, false, false, false, gua.a, false, gua.b, false, false, false, gua.c, false, 0, gua.d, gua.e, gua.f, gua.g, gua.h, gua.i, gua.j, gua.k, gua.l, gua.m, gua.n, false, gua.o);
                    gaiaDevice = gaiaDevice2;
                    break;
                }
                gtz gtz = (gtz) it.next();
                if (gtz.isSelf()) {
                    gaiaDevice = gtz;
                    break;
                }
            }
            if (optional.b() && ((GaiaDevice) optional.c()).isSelf()) {
                gaiaDevice.setActive();
            }
            return list;
        }
    }

    public mlw(Observable<ConnectManager> observable, gmk gmk) {
        this.a = observable.a(1).a();
        this.b = gmk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ConnectManager a(ConnectManager connectManager, ConnectManagerState connectManagerState) {
        return connectManager;
    }

    /* access modifiers changed from: private */
    public Observable<List<gtz>> a(ConnectManager connectManager) {
        return connectManager.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mlw$0zEGkSQMp30oWLS5OP2QNDDAXQ<Object,Object>(connectManager), false);
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
    public /* synthetic */ void a(float f, ConnectManager connectManager) {
        this.b.a(Float.valueOf(f));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ConnectManagerState connectManagerState) {
        return connectManagerState == ConnectManagerState.STARTED;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Float f) {
        return f.floatValue() >= 0.0f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource c(ConnectManager connectManager) {
        return connectManager.i().e(Float.valueOf(this.b.c())).a((Predicate<? super T>) $$Lambda$mlw$EzKbXT6rPexki_4I1nr2Qvg96U.INSTANCE);
    }

    private Observable<ConnectManager> e() {
        return this.a.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mlw$NapbSkwPH8YGnDkcAt4LPffIfg.INSTANCE, false);
    }

    public final Observable<List<gtz>> a() {
        return Observable.a((ObservableSource<? extends T1>) e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mlw$7juxHFVSGJHq6Tgh_yZ1V30C4uI<Object,Object>(this), false), (ObservableSource<? extends T2>) e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mlw$yIP3k2_bsn0t73WUIvxvYBOpeeI.INSTANCE, false), (BiFunction<? super T1, ? super T2, ? extends R>) new a<Object,Object,Object>(0)).a(Functions.a());
    }

    public final Disposable a(float f) {
        return e().a((Consumer<? super T>) new $$Lambda$mlw$OpiIPMCkM3Db0F98TFVI0QgRWc<Object>(this, f), (Consumer<? super Throwable>) $$Lambda$mlw$I6XkY_Zr4Gmmr4OsetEeKQRdvs.INSTANCE);
    }

    public final Disposable a(gtz gtz) {
        return e().a((Consumer<? super T>) new $$Lambda$mlw$17v66PsGnWvLkw7aIo2hjueYxI<Object>(gtz), (Consumer<? super Throwable>) new $$Lambda$mlw$Knyuxhm8EDIQ24etOjPEcqOu1IE<Object>(gtz));
    }

    public final Disposable b() {
        return e().a((Consumer<? super T>) $$Lambda$MukfWW9xRrquwYK_T_A5mnvOM1s.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mlw$IOht0Jst6NvFVBJvweA8cFJ6_Q.INSTANCE);
    }

    public final Observable<Float> c() {
        return e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mlw$295e5uoiq6GzwxXhZTaHpbDyzTA<Object,Object>(this), false);
    }

    public final Disposable d() {
        return e().a((Consumer<? super T>) $$Lambda$Wi3cm_Xes7CXxDYmKE7ols3KCo.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mlw$F_PqvOU2_Z1s16ZR1jBlrUqOeQA.INSTANCE);
    }
}
