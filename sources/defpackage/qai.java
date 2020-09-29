package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

/* renamed from: qai reason: default package */
public final class qai implements qav {
    private final b<sbu, sbs> a;
    private qcq b;
    private gup c;
    private final sfj d;
    private final pzw e;
    private final sfx f;
    private final boolean g;
    private final qam h;
    private final ryz i;
    private final spi j;
    private final qbr k;

    public final void a(Parcelable parcelable) {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final String j() {
        return "";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onIntroAnimationComplete() {
    }

    public qai(sbl sbl, sfj sfj, pzw pzw, sfx sfx, boolean z, sbk sbk, qam qam, ryz ryz, spi spi, qbr qbr) {
        this.d = sfj;
        this.e = pzw;
        this.f = sfx;
        this.g = z;
        this.h = qam;
        this.i = ryz;
        this.j = spi;
        this.k = qbr;
        this.a = kjt.a(sbl.a(), sbu.a.g().a(sbk).a(), kkd.a());
    }

    public final void a(gup gup, qcq qcq) {
        this.c = gup;
        this.b = qcq;
        pzr pzr = new pzr(this.b, this.c, this.d, this.e);
        b<sbu, sbs> bVar = this.a;
        bVar.getClass();
        pzy pzy = new pzy(new $$Lambda$hs66Vs9u2EkD5D03ddMNwRKz27M(bVar), this.f);
        b<sbu, sbs> bVar2 = this.a;
        qam qam = this.h;
        qam.getClass();
        bVar2.a(kkg.a(new $$Lambda$C5UGxQxU8D1rEAmo9WTIHPtN4U(qam), new $$Lambda$qai$Ygvx1tykOY6DOlNCuHokN49XyNs(pzr, pzy)));
    }

    public final void a() {
        this.a.c();
        this.b.i();
    }

    public final void b() {
        this.a.d();
    }

    public final void c() {
        this.a.b();
    }

    public final void d() {
        this.k.a();
    }

    public final Parcelable e() {
        return new rri(UUID.randomUUID().toString(), this.c.a());
    }

    public final void i() {
        this.i.d();
    }

    public final boolean k() {
        String str;
        sfx sfx = this.f;
        if (this.g) {
            str = ViewUris.H.toString();
        } else {
            str = ViewUris.af.toString();
        }
        sfx.b(str);
        return false;
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            this.j.a(intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT"));
        }
    }
}
