package defpackage;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: rps reason: default package */
public final class rps {
    public final rpe a;
    public final a b;
    public final CompositeDisposable c;
    private final rox d;
    private final rpu e;
    private final rpq f;
    private final rur g;
    private final Handler h;
    private Runnable i;
    private Optional<rpp> j = Optional.e();

    public rps(rpe rpe, rox rox, rpu rpu, rpq rpq, rur rur) {
        this.a = rpe;
        this.d = rox;
        this.e = rpu;
        this.f = rpq;
        this.g = rur;
        this.c = new CompositeDisposable();
        this.h = new Handler();
        this.b = new $$Lambda$rps$HtkCYjJXTicLdA2a315CKag_QY(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        if (this.a.a((fps<?>) rpi.a)) {
            this.c.a(this.d.a.d((Consumer<? super T>) new $$Lambda$rps$sMkNfGZl_C1qmoHwS2mDLQq1Gv0<Object>(this)));
            this.c.a(this.e.c().a(Functions.a()).d((Consumer<? super T>) new $$Lambda$rps$LY9_sdjg9VSoBWo93y69L0DJzBY<Object>(this)));
            this.c.a(this.d.b.d((Consumer<? super T>) new $$Lambda$rps$JUYneZ6itYoNouM5dCEyHC7zlI8<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(GaiaDevice gaiaDevice) {
        a();
        this.i = new $$Lambda$rps$iuBbM0K9PWU0eAbx0koM2k3Tek(this, gaiaDevice);
        this.h.postDelayed(this.i, 90);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Float f2) {
        if (this.j.b()) {
            ((rpp) this.j.c()).a(rpp.a(Float.valueOf(f2.floatValue())));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(GaiaDevice gaiaDevice) {
        if (a(gaiaDevice)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(GaiaDevice gaiaDevice) {
        if (gaiaDevice.isSelf()) {
            b();
            return;
        }
        if (!a(gaiaDevice)) {
            float d2 = this.e.d();
            this.j = Optional.b(new rpp(this.f.a, Float.valueOf(d2).floatValue()));
            this.g.c().a((mk) this.j.c());
            Logger.b("Connect volume controls enabled", new Object[0]);
        }
    }

    private void b() {
        this.j = Optional.e();
        this.g.c().a(3);
        Logger.b("Connect volume controls disabled", new Object[0]);
    }

    public void a() {
        Runnable runnable = this.i;
        if (runnable != null) {
            this.h.removeCallbacks(runnable);
        }
    }

    private static boolean a(GaiaDevice gaiaDevice) {
        return GaiaTypes.CAST_AUDIO == gaiaDevice.getType() || GaiaTypes.CAST_VIDEO == gaiaDevice.getType();
    }
}
