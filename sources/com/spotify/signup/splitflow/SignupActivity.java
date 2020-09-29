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
    public vju g;
    public PasswordValidator h;
    public gmx i;
    public vof j;
    public vjy k;
    public gao l;
    public gne m;
    public vkb n;
    public vkq o;
    private final PublishSubject<Boolean> p = PublishSubject.a();
    private b<vlf, vld> q;
    private final Listeners r = new Listeners();

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        vjy vjy = this.k;
        if (vnk.a(i2)) {
            vjy.a.a(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        vlf vlf;
        vtj.a((Activity) this);
        fzx.a(this);
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        if (bundle == null) {
            vlf = vlf.d;
        } else {
            vlf = (vlf) fay.a(bundle.getParcelable("KEY_SIGNUP_MODEL"));
        }
        vng vng = new vng(this, new fss(this));
        vnj vnj = new vnj(((vlf) fay.a(vlf)).h(), ((vlf) fay.a(vlf)).e().a(), getLayoutInflater(), null, this.j, vng, this.l);
        setContentView(vnj.b);
        vka vka = new vka(this, vnj, this.p, this.g, this.h, this.i, this.k, vng, this.m, new vjz(this.l), this.o);
        this.q = kkb.a(vka.a(), vlf);
        this.q.a(vnj);
        this.k.a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("KEY_SIGNUP_MODEL", (Parcelable) this.q.e());
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.r.a((gbr<b>) Event.ON_START);
    }

    public void onResume() {
        super.onResume();
        this.r.a((gbr<b>) Event.ON_RESUME);
        this.q.c();
    }

    public void onPause() {
        super.onPause();
        this.r.a((gbr<b>) Event.ON_PAUSE);
        this.q.d();
    }

    public void onStop() {
        super.onStop();
        this.r.a((gbr<b>) Event.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        this.r.a((gbr<b>) Event.ON_DESTROY);
        this.q.b();
    }

    public void onBackPressed() {
        this.p.onNext(Boolean.TRUE);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SIGNUP, null);
    }

    public final boolean a(b bVar) {
        return this.r.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.r.b((b) fay.a(bVar));
    }
}
