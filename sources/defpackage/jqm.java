package defpackage;

import android.content.Intent;

/* renamed from: jqm reason: default package */
public final class jqm {
    public final nwd a;
    public final kf b;
    public oal c;
    public jqq d;
    public jqr e;
    public pog f;
    public hxy g;
    public qgp h;

    public jqm(nwd nwd, kf kfVar) {
        this.a = nwd;
        this.b = kfVar;
    }

    public final void a(Intent intent) {
        nwd nwd = this.a;
        for (kmo kmo : nwd.e) {
            fpt fpt = nwd.d;
            kmo.d().a = intent.getStringExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME");
            kmo.b.a(intent, fpt);
        }
    }
}
