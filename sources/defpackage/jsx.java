package defpackage;

import android.content.Intent;

/* renamed from: jsx reason: default package */
public final class jsx {
    public final ocq a;
    public final kk b;
    public ohd c;
    public jtb d;
    public jtc e;
    public pxc f;
    public iak g;
    public qpd h;

    public jsx(ocq ocq, kk kkVar) {
        this.a = ocq;
        this.b = kkVar;
    }

    public final void a(Intent intent) {
        ocq ocq = this.a;
        for (kpx kpx : ocq.e) {
            fqn fqn = ocq.d;
            kpx.d().a = intent.getStringExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME");
            kpx.b.a(intent, fqn);
        }
    }
}
