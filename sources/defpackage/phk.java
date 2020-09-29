package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.disposables.Disposables;

/* renamed from: phk reason: default package */
public final class phk implements a {
    final phm a;
    final tyj b;
    final piy c;
    xip d;
    /* access modifiers changed from: 0000 */
    public xip e;
    private final phi f;
    private final pia g;
    private final szp h;
    private final izh i;
    private final phd j;
    private final piv k;
    private final String l;
    private final xil m;
    private final xil n;
    private tyn o = new b();
    private final lon p;
    private boolean q;

    public phk(phm phm, phi phi, pia pia, final a aVar, szp szp, tyj tyj, izh izh, phd phd, piv piv, piy piy, String str, xil xil, xil xil2, lon lon) {
        this.a = phm;
        this.f = phi;
        this.g = pia;
        this.b = tyj;
        this.j = phd;
        this.l = str;
        this.h = szp;
        this.i = izh;
        this.k = piv;
        this.c = piy;
        this.m = xil;
        this.n = xil2;
        this.p = lon;
        aVar.a(new c() {
            public final void a() {
                phk phk = phk.this;
                phk.d.unsubscribe();
                phk.e.unsubscribe();
                phk.b.b.a(Disposables.b());
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
                if (!phk.this.c.a()) {
                    phk.this.c.a(phk.this.a.f());
                }
            }

            public final void c() {
                phk.this.b();
                phk.this.e = phk.this.p.a().a(phk.this.m).a((xis<? super T>) new $$Lambda$phk$cgdHokVndFdsxmHa0kuyFycS1nc<Object>(phk.this), (xis<Throwable>) $$Lambda$phk$CfSoYhmeGf9SIn_0afB2Fj1dYBk.INSTANCE);
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(ho<phz, tyn> hoVar) {
        ((phz) fbp.a(hoVar.a)).a((ged<b>) new $$Lambda$phk$zv60cfW69dlsVaM7NhAfpCHmxY<b>(this), (ged<a>) new $$Lambda$phk$HkTpFXQ5m0SmCcXhYsfIajl09w<a>(this), (ged<c>) new $$Lambda$phk$S1kMFpEFpSa5J1l_Kwpzs72NY<c>(this, (tyn) fbp.a(hoVar.b)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.q = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Error while fetching episode [%s]", this.l);
        this.a.b();
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
    public /* synthetic */ void a(a aVar) {
        a(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        a(cVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tyn tyn, c cVar) {
        vkv vkv = cVar.a;
        Optional<hcs> optional = cVar.b;
        Optional<hcs> optional2 = cVar.c;
        this.o = tyn;
        tyn.a($$Lambda$phk$iVjWOA1CENzbejOQVqiExNpj168.INSTANCE, new $$Lambda$phk$JTFTivZzOHtPL21PqVzebPMilw(this), new $$Lambda$phk$Rf6QR8BL_XEd0SU5pwzzYS_NC6A(this));
        this.a.c();
        this.a.a(this.f.a(vkv, tyn));
        this.a.a(this.f.a(vkv, (hcs) optional2.d(), (hcs) optional.d()));
    }

    private void a(boolean z) {
        if (z) {
            this.a.d();
        } else {
            this.a.e();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tyn b(Throwable th) {
        return new b();
    }

    /* access modifiers changed from: private */
    public void b() {
        this.d = xii.a(this.g.a(this.l).a((c<? super T, ? extends R>) this.c), this.j.a(this.l, this.n).g($$Lambda$phk$O3ioLzRoNbTsfl40VUPIQ6xTA1A.INSTANCE), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$tgfV3sAHUNP35RSnBBIt7MHdBH4.INSTANCE).a(this.m).a((xis<? super T>) new $$Lambda$phk$jAS3DnGtiYn3o_i5qX48dx6HyOE<Object>(this), (xis<Throwable>) new $$Lambda$phk$q6LMlmQrAjZNspfMhr5P9ROXE<Throwable>(this));
    }

    private void d(String str) {
        this.h.a(str);
    }

    public final void a() {
        this.d.unsubscribe();
        b();
    }

    public final void a(String str) {
        this.k.c(str);
        d(str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.i.a(str, str3, (String) null, str2, str4, (String) null, jqg.a);
        this.k.c();
    }

    public final void a(String str, boolean z) {
        tyn tyn = this.o;
        if ((tyn instanceof c) && ((c) tyn).b) {
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

    public final void b(String str) {
        this.k.a(str);
        d(str);
    }

    public final void c(String str) {
        this.k.b(str);
        d(str);
    }
}
