package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: nvy reason: default package */
public final class nvy {
    final kda a;
    final Activity b;
    private final kdl c;
    private final nut d;
    private final spi e;
    private final jfg f;

    nvy(kda kda, kdl kdl, Activity activity, nut nut, spi spi, jfg jfg) {
        this.a = kda;
        this.c = kdl;
        this.b = activity;
        this.d = nut;
        this.e = spi;
        this.f = jfg;
    }

    public void a() {
        this.b.startActivity(new Intent("android.intent.action.VIEW", this.d.a(PartnerType.GOOGLE_MAPS.mPackageName)));
    }

    public final void b() {
        this.c.f();
    }

    public final void c() {
        this.e.a((String) ((juc) fay.a(jud.a(LinkType.NAVIGATION_APPS_SETTINGS))).c.get(0));
    }

    public void a(AuthorizationRequest authorizationRequest) {
        try {
            this.b.startActivityForResult(jfg.a(this.b, authorizationRequest), nuy.a.shortValue());
        } catch (ActivityNotFoundException e2) {
            Logger.e(e2, "Unable to start AuthorizationActivity", new Object[0]);
        }
    }
}
