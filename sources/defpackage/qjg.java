package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

/* renamed from: qjg reason: default package */
public final class qjg implements qjt {
    private final b<smb, slz> a;
    private qlt b;
    private gwp c;
    private final spq d;
    private final qiu e;
    private final sqe f;
    private final boolean g;
    private final qjk h;
    private final sin i;
    private final szp j;
    private final qkp k;

    public qjg(sls sls, spq spq, qiu qiu, sqe sqe, boolean z, slr slr, qjk qjk, sin sin, szp szp, qkp qkp) {
        this.d = spq;
        this.e = qiu;
        this.f = sqe;
        this.g = z;
        this.h = qjk;
        this.i = sin;
        this.j = szp;
        this.k = qkp;
        this.a = knc.a(sls.a(), smb.a.g().a(slr).a(), knm.a());
    }

    public final void a() {
        this.a.c();
        this.b.i();
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            this.j.a(intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT"));
        }
    }

    public final void a(Parcelable parcelable) {
    }

    public final void a(gwp gwp, qlt qlt) {
        this.c = gwp;
        this.b = qlt;
        qip qip = new qip(this.b, this.c, this.d, this.e);
        b<smb, slz> bVar = this.a;
        bVar.getClass();
        qiw qiw = new qiw(new $$Lambda$j4LskAYyncG1KUfb5oq6NpwFgA(bVar), this.f);
        b<smb, slz> bVar2 = this.a;
        qjk qjk = this.h;
        qjk.getClass();
        bVar2.a(knp.a(new $$Lambda$IIpyynCQ8Y1Etr3KwwAFU9S6bxI(qjk), new $$Lambda$qjg$w90RfkIgs8DjSiqg7u2N0n8Ptv8(qip, qiw)));
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
        return new sap(UUID.randomUUID().toString(), this.c.a());
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
        this.i.d();
    }

    public final String j() {
        return "";
    }

    public final boolean k() {
        this.f.b(this.g ? ViewUris.G.toString() : ViewUris.ae.toString());
        return false;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onIntroAnimationComplete() {
    }
}
