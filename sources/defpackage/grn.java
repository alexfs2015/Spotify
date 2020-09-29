package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.libs.connect.volume.VolumeState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* renamed from: grn reason: default package */
public final class grn implements grb {
    public volatile float a;
    private GaiaDevice b;
    private Disposable c = Disposables.b();
    private Disposable d = Disposables.b();
    private final RxResolver e;
    private final gkr f;
    private final Scheduler g;
    private Disposable h;
    private Disposable i;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    grn(RxResolver rxResolver, gkr gkr, Scheduler scheduler) {
        this.e = rxResolver;
        this.f = gkr;
        this.g = scheduler;
    }

    public final void a(Observer<Float> observer, Observable<GaiaDevice> observable, GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
        if (this.d.b()) {
            this.d = observable.a(this.g).a((Consumer<? super T>) new $$Lambda$grn$kw1WqyyGuN4y69GoGYsyENMyTng<Object>(this), (Consumer<? super Throwable>) $$Lambda$grn$ExIe_KScyecK7qGgdVb32GtXgk.INSTANCE);
        }
        if (this.c.b()) {
            this.c = this.f.a().a((Consumer<? super T>) new $$Lambda$grn$ysZX3qfYExPPkWItsjGQs7LW38<Object>(this, observer), (Consumer<? super Throwable>) new $$Lambda$grn$C7juAAZAsTOaPNdqQcMfiZ0bNx4<Object>(observer));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Observer observer, VolumeState volumeState) {
        this.a = volumeState.getVolume();
        observer.onNext(Float.valueOf(this.a));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Observer observer, Throwable th) {
        Logger.e(th, "Failed to resolve volume controller", new Object[0]);
        observer.onNext(Float.valueOf(0.0f));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
    }

    public final void a() {
        this.d.bf_();
        this.c.bf_();
    }

    public final boolean a(float f2) {
        if (!g()) {
            return false;
        }
        Disposable disposable = this.h;
        if (disposable != null && !disposable.b()) {
            this.h.bf_();
        }
        this.h = this.f.a(Float.valueOf(f2)).d();
        return true;
    }

    private void a(String str) {
        fay.a(this.b);
        Request build = RequestBuilder.postBytes(str, String.valueOf(this.b.getIdentifier()).getBytes(Charset.defaultCharset())).build();
        Disposable disposable = this.i;
        if (disposable != null && !disposable.b()) {
            this.i.bf_();
        }
        this.i = this.e.resolve(build).c(500, TimeUnit.MILLISECONDS).a((Consumer<? super T>) $$Lambda$grn$g8jbdPVxlV9QuBo1dYNF7TPewKM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$grn$FDVJRPfvVS60qkgBqDWOq3sHU.INSTANCE);
    }

    public final boolean d() {
        if (!g()) {
            return false;
        }
        a("sp://connect/v1/volume/up");
        return true;
    }

    public final boolean e() {
        if (!g()) {
            return false;
        }
        a("sp://connect/v1/volume/down");
        return true;
    }

    public final float f() {
        return this.a;
    }

    public final boolean g() {
        GaiaDevice gaiaDevice = this.b;
        return gaiaDevice != null && !gaiaDevice.isSelf() && this.b.supportsVolume();
    }
}
