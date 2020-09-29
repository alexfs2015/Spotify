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

/* renamed from: gtp reason: default package */
public final class gtp implements gta {
    public volatile float a;
    private GaiaDevice b;
    private Disposable c = Disposables.b();
    private Disposable d = Disposables.b();
    private final RxResolver e;
    private final gmf f;
    private final Scheduler g;
    private Disposable h;
    private Disposable i;

    gtp(RxResolver rxResolver, gmf gmf, Scheduler scheduler) {
        this.e = rxResolver;
        this.f = gmf;
        this.g = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
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

    private void a(String str) {
        fbp.a(this.b);
        Request build = RequestBuilder.postBytes(str, String.valueOf(this.b.getIdentifier()).getBytes(Charset.defaultCharset())).build();
        Disposable disposable = this.i;
        if (disposable != null && !disposable.b()) {
            this.i.bd_();
        }
        this.i = this.e.resolve(build).c(500, TimeUnit.MILLISECONDS).a((Consumer<? super T>) $$Lambda$gtp$23mwqBbJ6eMReZjO8rwjkmi_z0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$gtp$_ASOs5ubTv4dhd4SyNhJ2gjTxoI.INSTANCE);
    }

    public final void a() {
        this.d.bd_();
        this.c.bd_();
    }

    public final void a(Observer<Float> observer, Observable<GaiaDevice> observable, GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
        if (this.d.b()) {
            this.d = observable.a(this.g).a((Consumer<? super T>) new $$Lambda$gtp$NUpaS7gmrebUYmcA0KXthXuDXRQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$gtp$qUBEQOxlEMuC3uVrKYyKx7p5aYM.INSTANCE);
        }
        if (this.c.b()) {
            this.c = this.f.a().a((Consumer<? super T>) new $$Lambda$gtp$pIEPHN1VZG1PZ_PWPFW5n52A<Object>(this, observer), (Consumer<? super Throwable>) new $$Lambda$gtp$eQjWAHQJKxmpzXOfnMx3Bel3kRA<Object>(observer));
        }
    }

    public final boolean a(float f2) {
        if (!g()) {
            return false;
        }
        Disposable disposable = this.h;
        if (disposable != null && !disposable.b()) {
            this.h.bd_();
        }
        this.h = this.f.a(Float.valueOf(f2)).d();
        return true;
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
