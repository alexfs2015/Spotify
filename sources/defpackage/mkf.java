package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mkf reason: default package */
public final class mkf implements a<ConnectManager>, mke {
    private final mkg a;
    private final gtb b;
    private final wzi<Scheduler> c;
    private boolean d;
    private boolean e;
    private GaiaDevice f;
    private Disposable g = Disposables.b();

    public mkf(gtb gtb, mkg mkg, wzi<Scheduler> wzi) {
        this.b = gtb;
        this.a = mkg;
        this.c = wzi;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
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

    private void c(GaiaDevice gaiaDevice) {
        Assertion.a((Object) gaiaDevice);
        this.f = gaiaDevice;
        this.a.a(gaiaDevice.getName());
        if (this.a.m()) {
            this.a.a(this.f);
        }
    }

    private void g() {
        this.a.k();
    }

    public final void a() {
        this.e = false;
        if (this.b.c()) {
            ((ConnectManager) this.b.h()).t();
        }
        this.a.k();
    }

    public final void a(GaiaDevice gaiaDevice) {
        if (gaiaDevice == null || gaiaDevice.getIdentifier() == null || gaiaDevice.getIdentifier().isEmpty()) {
            g();
        } else {
            c(gaiaDevice);
        }
    }

    public final /* synthetic */ void a(Object obj) {
        this.d = true;
        this.g = ((ConnectManager) this.b.h()).g().a((Scheduler) this.c.get()).a((Consumer<? super T>) new $$Lambda$mkf$zKe0KVj3XYVHb3obP1s4gs7xw<Object>(this), (Consumer<? super Throwable>) $$Lambda$mkf$Fc5Vvrs2k16_8QD7v6aPyy0WArs.INSTANCE);
    }

    public final void b() {
        this.e = true;
        this.a.k();
    }

    public final void c() {
        this.b.a(this);
        this.b.a();
    }

    public final void d() {
        if (this.b.c()) {
            this.b.b();
        }
        this.g.bd_();
    }

    public final void e() {
        this.d = false;
    }

    public final void f() {
        if (this.f != null && this.e && this.b.c()) {
            ((ConnectManager) this.b.h()).d(this.f.getAttachId());
        }
    }
}
