package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mft reason: default package */
public final class mft implements a<ConnectManager>, mfs {
    private final mfu a;
    private final hip b;
    private final wlc<Scheduler> c;
    private boolean d;
    private boolean e;
    private GaiaDevice f;
    private Disposable g = Disposables.b();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public mft(hip hip, mfu mfu, wlc<Scheduler> wlc) {
        this.b = hip;
        this.a = mfu;
        this.c = wlc;
    }

    /* access modifiers changed from: private */
    public void b(GaiaDevice gaiaDevice) {
        if (this.a.l() && this.d && gaiaDevice != null) {
            if (gaiaDevice.isSelf()) {
                g();
            } else if (!gaiaDevice.equals(this.f)) {
                c(gaiaDevice);
            }
        }
    }

    public final void a() {
        this.e = false;
        if (this.b.d()) {
            ((ConnectManager) this.b.i()).t();
        }
        this.a.k();
    }

    public final void b() {
        this.e = true;
        this.a.k();
    }

    public final void c() {
        this.b.a(this);
        this.b.a();
    }

    public final void e() {
        this.d = false;
    }

    public final void d() {
        if (this.b.d()) {
            this.b.b();
        }
        this.g.bf_();
    }

    public final void a(GaiaDevice gaiaDevice) {
        if (gaiaDevice == null || gaiaDevice.getIdentifier() == null || gaiaDevice.getIdentifier().isEmpty()) {
            g();
        } else {
            c(gaiaDevice);
        }
    }

    private void g() {
        this.a.k();
    }

    private void c(GaiaDevice gaiaDevice) {
        Assertion.a((Object) gaiaDevice);
        this.f = gaiaDevice;
        this.a.a(gaiaDevice.getName());
        if (this.a.m()) {
            this.a.a(this.f);
        }
    }

    public final void f() {
        if (this.f != null && this.e && this.b.d()) {
            ((ConnectManager) this.b.i()).d(this.f.getAttachId());
        }
    }

    public final /* synthetic */ void a(Object obj) {
        this.d = true;
        this.g = ((ConnectManager) this.b.i()).g().a((Scheduler) this.c.get()).a((Consumer<? super T>) new $$Lambda$mft$_1dgqcuaDZ8PMf5j4AF0AsyINM<Object>(this), (Consumer<? super Throwable>) $$Lambda$mft$QUCayHEqBZcFLEby_lvRQ7z_iz8.INSTANCE);
    }
}
