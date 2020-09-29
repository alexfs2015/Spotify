package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: ocl reason: default package */
public final class ocl {
    final kfb a;
    final Activity b;
    private final kfm c;
    private final obg d;
    private final szp e;
    private final jhv f;

    ocl(kfb kfb, kfm kfm, Activity activity, obg obg, szp szp, jhv jhv) {
        this.a = kfb;
        this.c = kfm;
        this.b = activity;
        this.d = obg;
        this.e = szp;
        this.f = jhv;
    }

    public void a() {
        this.b.startActivity(new Intent("android.intent.action.VIEW", this.d.a(PartnerType.GOOGLE_MAPS.mPackageName)));
    }

    public void a(AuthorizationRequest authorizationRequest) {
        try {
            this.b.startActivityForResult(jhv.a(this.b, authorizationRequest), obl.a.shortValue());
        } catch (ActivityNotFoundException e2) {
            Logger.e(e2, "Unable to start AuthorizationActivity", new Object[0]);
        }
    }

    public final void b() {
        this.c.f();
    }

    public final void c() {
        this.e.a((String) ((jwk) fbp.a(jwl.a(LinkType.NAVIGATION_APPS_SETTINGS))).c.get(0));
    }
}
