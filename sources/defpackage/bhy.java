package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

@cfp
/* renamed from: bhy reason: default package */
public final class bhy extends cda {
    private AdOverlayInfoParcel a;
    private Activity b;
    private boolean c = false;
    private boolean d = false;

    public bhy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.a = adOverlayInfoParcel;
        this.b = activity;
    }

    private final synchronized void a() {
        if (!this.d) {
            if (this.a.c != null) {
                this.a.c.I_();
            }
            this.d = true;
        }
    }

    public final void a(int i, int i2, Intent intent) {
    }

    public final void a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.a;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                if (adOverlayInfoParcel.b != null) {
                    this.a.b.e();
                }
                if (!(this.b.getIntent() == null || !this.b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.a.c == null)) {
                    this.a.c.g();
                }
            }
            bkc.b();
            if (!bhh.a((Context) this.b, this.a.a, this.a.i)) {
                this.b.finish();
            }
            return;
        }
        this.b.finish();
    }

    public final void a(cbi cbi) {
    }

    public final void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
    }

    public final void d() {
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
        if (this.c) {
            this.b.finish();
            return;
        }
        this.c = true;
        if (this.a.c != null) {
            this.a.c.f();
        }
    }

    public final void i() {
        if (this.a.c != null) {
            this.a.c.d();
        }
        if (this.b.isFinishing()) {
            a();
        }
    }

    public final void j() {
        if (this.b.isFinishing()) {
            a();
        }
    }

    public final void k() {
        if (this.b.isFinishing()) {
            a();
        }
    }

    public final void l() {
    }
}
