package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.disposables.Disposables;

/* renamed from: pab reason: default package */
public final class pab implements a {
    final pad a;
    final tmo b;
    final pbp c;
    wuk d;
    /* access modifiers changed from: 0000 */
    public wuk e;
    private final ozz f;
    private final par g;
    private final spi h;
    private final iww i;
    private final ozu j;
    private final pbm k;
    private final String l;
    private final wug m;
    private final wug n;
    private tms o = new b();
    private final lkn p;
    private boolean q;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    public pab(pad pad, ozz ozz, par par, final a aVar, spi spi, tmo tmo, iww iww, ozu ozu, pbm pbm, pbp pbp, String str, wug wug, wug wug2, lkn lkn) {
        this.a = pad;
        this.f = ozz;
        this.g = par;
        this.b = tmo;
        this.j = ozu;
        this.l = str;
        this.h = spi;
        this.i = iww;
        this.k = pbm;
        this.c = pbp;
        this.m = wug;
        this.n = wug2;
        this.p = lkn;
        aVar.a(new c() {
            public final void b(Bundle bundle) {
                if (!pab.this.c.a()) {
                    pab.this.c.a(pab.this.a.f());
                }
            }

            public final void c() {
                pab.this.b();
                pab.this.e = pab.this.p.a().a(pab.this.m).a((wun<? super T>) new $$Lambda$pab$2IJ5n9Uqk135nUmwgG8RJWQvq3E<Object>(pab.this), (wun<Throwable>) $$Lambda$pab$gPYCQjNoqstLiOinwgbcSzYGq0.INSTANCE);
            }

            public final void a() {
                pab pab = pab.this;
                pab.d.unsubscribe();
                pab.e.unsubscribe();
                pab.b.b.a(Disposables.b());
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.q = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public void b() {
        this.d = wud.a(this.g.a(this.l).a((c<? super T, ? extends R>) this.c), this.j.a(this.l, this.n).h($$Lambda$pab$f16MYZrnoSwyF3KhfHw29lY2cI.INSTANCE), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$u9UAaUzdf2NQHO2HNm6ayhI4mI.INSTANCE).a(this.m).a((wun<? super T>) new $$Lambda$pab$c9vPMxy9Bdp6r1vST8ps5NbaRE<Object>(this), (wun<Throwable>) new $$Lambda$pab$mZ57fQbLi9M32Z5DYGYQMjRMDg<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Error while fetching episode [%s]", this.l);
        this.a.b();
    }

    /* access modifiers changed from: private */
    public void a(ho<paq, tms> hoVar) {
        ((paq) fay.a(hoVar.a)).a((gcs<b>) new $$Lambda$pab$7b8X5U3tmXsGfkpcHV7QkwnyS0<b>(this), (gcs<a>) new $$Lambda$pab$yZsnQ_vkh_VkL33KH2XhcL_hOTk<a>(this), (gcs<c>) new $$Lambda$pab$emaMxfDBuqb4gMKv6im5GpNYNo<c>(this, (tms) fay.a(hoVar.b)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        a(false);
    }

    private void a(boolean z) {
        if (z) {
            this.a.d();
        } else {
            this.a.e();
        }
    }

    private void d(String str) {
        this.h.a(str);
    }

    public final void a(String str, boolean z) {
        tms tms = this.o;
        if ((tms instanceof c) && ((c) tms).b) {
            this.b.a.pause();
            this.k.b();
        } else if (!this.q || !z) {
            this.b.a(str, this.l, -1);
            this.k.a();
        } else {
            this.p.a(this.l, str);
            this.k.a();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.i.a(str, str3, (String) null, str2, str4, (String) null, jnu.a);
        this.k.c();
    }

    public final void a() {
        this.d.unsubscribe();
        b();
    }

    public final void a(String str) {
        this.k.c(str);
        d(str);
    }

    public final void b(String str) {
        this.k.a(str);
        d(str);
    }

    public final void c(String str) {
        this.k.b(str);
        d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        a(cVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tms tms, c cVar) {
        uys uys = cVar.a;
        Optional<gzz> optional = cVar.b;
        Optional<gzz> optional2 = cVar.c;
        this.o = tms;
        tms.a($$Lambda$pab$mFkgKuVKHGyRIN4gQvC8370FQj8.INSTANCE, new $$Lambda$pab$4dVvMRLYQlgydHNA7KXST2O4Ks(this), new $$Lambda$pab$QamVmht290xHnp9hgBwo_nfu1cg(this));
        this.a.c();
        this.a.a(this.f.a(uys, tms));
        this.a.a(this.f.a(uys, (gzz) optional2.d()));
        if (!optional.b() || ((gzz) optional.c()).body().isEmpty()) {
            this.a.g();
        } else {
            this.a.a((gzz) optional.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Logger.e("Fail to load episode [%s]: %s", this.l, aVar.a);
        this.a.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tms b(Throwable th) {
        return new b();
    }
}
