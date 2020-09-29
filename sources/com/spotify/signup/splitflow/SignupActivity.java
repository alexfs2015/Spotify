package com.spotify.signup.splitflow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import io.reactivex.subjects.PublishSubject;

public class SignupActivity extends q implements a, b {
    public vxa g;
    public PasswordValidator h;
    public gom i;
    public wbn j;
    public vxe k;
    public gbp l;
    public got m;
    public vxh n;
    public vxw o;
    public gqm p;
    private boolean q;
    private final PublishSubject<Boolean> r = PublishSubject.a();
    private b<vyl, vyj> s;
    private final Listeners t = new Listeners();

    public final boolean a(b bVar) {
        return this.t.a((b) fbp.a(bVar));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SIGNUP, null);
    }

    public final boolean b(b bVar) {
        return this.t.b((b) fbp.a(bVar));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        vxe vxe = this.k;
        if (waq.a(i2)) {
            vxe.a.b = vxe.c;
            vxe.a.a(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.r.onNext(Boolean.TRUE);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        whp.a((Activity) this);
        gar.a(this);
        super.onCreate(bundle);
        if (bundle2 != null) {
            this.q = bundle2.getBoolean("com.spotify.signup.splitflow.smartlock_credentials_have_been_requested", false);
        }
        getWindow().setFlags(8192, 8192);
        Object obj = bundle2 == null ? vyl.d : (vyl) fbp.a(bundle2.getParcelable("KEY_SIGNUP_MODEL"));
        wam wam = new wam(this, new ftm(this));
        wap wap = new wap(((vyl) fbp.a(obj)).h(), ((vyl) fbp.a(obj)).e().a(), getLayoutInflater(), null, this.j, wam, this.l);
        setContentView(wap.b);
        vxg vxg = new vxg(this, wap, this.r, this.g, this.h, this.i, this.k, wam, this.m, new vxf(this.l), this.o, this.p);
        this.s = knk.a(vxg.a(), obj);
        this.s.a(wap);
        if (!this.q) {
            this.q = true;
            this.k.a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.t.a((gcp<b>) Event.ON_DESTROY);
        this.s.b();
    }

    public void onPause() {
        super.onPause();
        this.t.a((gcp<b>) Event.ON_PAUSE);
        this.s.d();
    }

    public void onResume() {
        super.onResume();
        this.t.a((gcp<b>) Event.ON_RESUME);
        this.s.c();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("KEY_SIGNUP_MODEL", (Parcelable) this.s.e());
        bundle.putBoolean("com.spotify.signup.splitflow.smartlock_credentials_have_been_requested", this.q);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.t.a((gcp<b>) Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        this.t.a((gcp<b>) Event.ON_STOP);
    }
}
