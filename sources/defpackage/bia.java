package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bia reason: default package */
public final class bia extends bju implements bfq, bgp {
    private transient boolean j;
    private int k = -1;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public float m;
    /* access modifiers changed from: private */
    public boolean n;
    private cko p;
    private String q;
    private final String r;
    private final cif s;

    public bia(Context context, dpc dpc, String str, ecp ecp, coy coy, bki bki) {
        super(context, dpc, str, ecp, coy, bki);
        boolean z = false;
        this.j = false;
        if (dpc != null) {
            if ("reward_mb".equals(dpc.a)) {
                z = true;
            }
        }
        this.r = z ? "/Rewarded" : "/Interstitial";
        this.s = z ? new cif(this.e, this.o, new bic(this), this, this) : null;
    }

    private static cla b(cla cla) {
        cla cla2 = cla;
        try {
            String jSONObject = chi.a(cla2.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, cla2.a.e);
            eby eby = new eby(jSONObject, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            cfy cfy = cla2.b;
            ebz ebz = new ebz(Collections.singletonList(eby), ((Long) dpn.f().a(dsp.bz)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), cfy.H, cfy.I, "");
            cfy cfy2 = new cfy(cla2.a, cfy.a, cfy.b, Collections.emptyList(), Collections.emptyList(), cfy.f, true, cfy.h, Collections.emptyList(), cfy.j, cfy.k, cfy.l, cfy.m, cfy.n, cfy.o, cfy.p, null, cfy.r, cfy.s, cfy.t, cfy.u, cfy.v, cfy.x, cfy.y, cfy.z, null, Collections.emptyList(), Collections.emptyList(), cfy.D, cfy.E, cfy.F, cfy.G, cfy.H, cfy.I, cfy.J, null, cfy.L, cfy.M, cfy.N, cfy.O, cfy.Q, Collections.emptyList(), cfy.S, cfy.T);
            cla cla3 = new cla(cla2.a, cfy2, ebz, cla2.d, cla2.e, cla2.f, cla2.g, null, cla2.i, null);
            return cla3;
        } catch (JSONException e) {
            clu.a("Unable to generate ad state for an interstitial ad with pooling.", e);
            return cla2;
        }
    }

    private final void b(Bundle bundle) {
        bjl.e().b(this.e.c, this.e.e.a, "gmob-apps", bundle, false);
    }

    private final boolean e(boolean z) {
        return this.s != null && z;
    }

    public final void I_() {
        super.I_();
        this.g.a(this.e.j);
        cko cko = this.p;
        if (cko != null) {
            cko.a(false);
        }
        G();
    }

    /* access modifiers changed from: protected */
    public final boolean J() {
        if (!(this.e.c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.e.c).getWindow();
        if (!(window == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
                return true;
            }
        }
        return false;
    }

    public final void K() {
        bjl.y().a(Integer.valueOf(this.k));
        if (this.e.c()) {
            this.e.a();
            this.e.j = null;
            this.e.J = false;
            this.j = false;
        }
    }

    public final void L() {
        bgt t = this.e.j.b.t();
        if (t != null) {
            t.a();
        }
    }

    /* access modifiers changed from: protected */
    public final csr a(cla cla, bkj bkj, ckk ckk) {
        bjl.f();
        csr a = csy.a(this.e.c, cue.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.i, cla.i);
        a.x().a(this, this, null, this, this, ((Boolean) dpn.f().a(dsp.ag)).booleanValue(), this, bkj, this, ckk);
        a(a);
        a.a(cla.a.v);
        a.a("/reward", (bgl<? super csr>) new bfp<Object>(this));
        return a;
    }

    public final void a(cjx cjx) {
        if (e(this.e.j != null && this.e.j.n)) {
            b(this.s.a(cjx));
            return;
        }
        if (this.e.j != null) {
            if (this.e.j.x != null) {
                bjl.e();
                cmd.a(this.e.c, this.e.e.a, this.e.j.x);
            }
            if (this.e.j.v != null) {
                cjx = this.e.j.v;
            }
        }
        b(cjx);
    }

    public final void a(cla cla, dtc dtc) {
        if (cla.e != -2) {
            super.a(cla, dtc);
            return;
        }
        if (e(cla.c != null)) {
            this.s.a();
            return;
        }
        if (!((Boolean) dpn.f().a(dsp.aR)).booleanValue()) {
            super.a(cla, dtc);
            return;
        }
        boolean z = !cla.b.g;
        if (a(cla.a.c) && z) {
            this.e.k = b(cla);
        }
        super.a(this.e.k, dtc);
    }

    public final void a(boolean z) {
        this.e.J = z;
    }

    public final void a(boolean z, float f) {
        this.l = z;
        this.m = f;
    }

    public final boolean a(ckz ckz, ckz ckz2) {
        if (e(ckz2.n)) {
            return cif.b();
        }
        if (!super.a(ckz, ckz2)) {
            return false;
        }
        if (!(this.e.c() || this.e.H == null || ckz2.k == null)) {
            this.g.a(this.e.i, ckz2, this.e.H);
        }
        b(ckz2, false);
        return true;
    }

    public final void c(boolean z) {
        bwx.b("setImmersiveMode must be called on the main UI thread.");
        this.n = z;
    }

    public final void t_() {
        if (e(this.e.j != null && this.e.j.n)) {
            this.s.c();
            A();
            return;
        }
        if (!(this.e.j == null || this.e.j.w == null)) {
            bjl.e();
            cmd.a(this.e.c, this.e.e.a, this.e.j.w);
        }
        A();
    }

    /* access modifiers changed from: protected */
    public final void u() {
        K();
        super.u();
    }

    public final void u_() {
        if (e(this.e.j != null && this.e.j.n)) {
            this.s.d();
        }
        B();
    }

    /* access modifiers changed from: protected */
    public final void x() {
        csr csr = this.e.j != null ? this.e.j.b : null;
        cla cla = this.e.k;
        if (!(cla == null || cla.b == null || !cla.b.Q || csr == null || !bjl.u().a(this.e.c))) {
            int i = this.e.e.b;
            int i2 = this.e.e.c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.h = bjl.u().a(sb.toString(), csr.n(), "", "javascript", H());
            if (this.h != null) {
                bjl.u().a(this.h, csr.o());
                bjl.u().a(this.h);
            }
        }
        super.x();
        this.j = true;
    }

    public final boolean a(doy doy, dtc dtc) {
        if (this.e.j != null) {
            cow.a(5);
            return false;
        }
        if (this.p == null && a(doy) && bjl.B().d(this.e.c) && !TextUtils.isEmpty(this.e.b)) {
            this.p = new cko(this.e.c, this.e.b);
        }
        return super.a(doy, dtc);
    }

    /* access modifiers changed from: protected */
    public final boolean a(doy doy, ckz ckz, boolean z) {
        if (this.e.c() && ckz.b != null) {
            bjl.g();
            cmj.a(ckz.b);
        }
        return this.d.b;
    }

    public final void g() {
        aa();
        super.g();
        if (!(this.e.j == null || this.e.j.b == null)) {
            cty x = this.e.j.b.x();
            if (x != null) {
                x.g();
            }
        }
        if (!(!bjl.B().d(this.e.c) || this.e.j == null || this.e.j.b == null)) {
            ckp B = bjl.B();
            Context context = this.e.j.b.getContext();
            String str = this.q;
            if (B.a(context) && (context instanceof Activity)) {
                if (B.a(context, "com.google.firebase.analytics.FirebaseAnalytics", B.a, false)) {
                    String str2 = "setCurrentScreen";
                    Method f = B.f(context, str2);
                    try {
                        Activity activity = (Activity) context;
                        f.invoke(B.a.get(), new Object[]{activity, str, context.getPackageName()});
                    } catch (Exception unused) {
                        B.b(str2, false);
                    }
                }
            }
        }
        cko cko = this.p;
        if (cko != null) {
            cko.a(true);
        }
        if (this.h != null && this.e.j != null && this.e.j.b != null) {
            this.e.j.b.a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
        }
    }

    public final void I() {
        Bitmap bitmap;
        int i;
        bwx.b("showInterstitial must be called on the main UI thread.");
        if (e(this.e.j != null && this.e.j.n)) {
            this.s.a(this.n);
            return;
        }
        if (bjl.B().d(this.e.c)) {
            this.q = bjl.B().f(this.e.c);
            String valueOf = String.valueOf(this.q);
            String valueOf2 = String.valueOf(this.r);
            this.q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.e.j == null) {
            cow.a(5);
            return;
        }
        if (((Boolean) dpn.f().a(dsp.bp)).booleanValue()) {
            String packageName = (this.e.c.getApplicationContext() != null ? this.e.c.getApplicationContext() : this.e.c).getPackageName();
            String str = "action";
            String str2 = "appid";
            if (!this.j) {
                cow.a(5);
                Bundle bundle = new Bundle();
                bundle.putString(str2, packageName);
                bundle.putString(str, "show_interstitial_before_load_finish");
                b(bundle);
            }
            bjl.e();
            if (!cmd.f(this.e.c)) {
                cow.a(5);
                Bundle bundle2 = new Bundle();
                bundle2.putString(str2, packageName);
                bundle2.putString(str, "show_interstitial_app_not_in_foreground");
                b(bundle2);
            }
        }
        if (!this.e.d()) {
            if (this.e.j.n && this.e.j.p != null) {
                try {
                    if (((Boolean) dpn.f().a(dsp.aO)).booleanValue()) {
                        this.e.j.p.a(this.n);
                    }
                    this.e.j.p.b();
                } catch (RemoteException unused) {
                    cow.a(5);
                    K();
                }
            } else if (this.e.j.b == null) {
                cow.a(5);
            } else if (this.e.j.b.B()) {
                cow.a(5);
            } else {
                this.e.j.b.b(true);
                this.e.a(this.e.j.b.o());
                if (this.e.j.k != null) {
                    this.g.a(this.e.i, this.e.j);
                }
                ckz ckz = this.e.j;
                if (ckz.a()) {
                    new dld(this.e.c, ckz.b.o()).a((dlh) ckz.b);
                } else {
                    ckz.b.x().a((cub) new bib(this, ckz));
                }
                if (this.e.J) {
                    bjl.e();
                    bitmap = cmd.g(this.e.c);
                } else {
                    bitmap = null;
                }
                cnz y = bjl.y();
                if (bitmap == null) {
                    cow.a(3);
                    i = -1;
                } else {
                    i = y.b.getAndIncrement();
                    y.a.put(Integer.valueOf(i), bitmap);
                }
                this.k = i;
                if (!((Boolean) dpn.f().a(dsp.bP)).booleanValue() || bitmap == null) {
                    bif bif = new bif(this.e.J, J(), false, 0.0f, -1, this.n, this.e.j.L, this.e.j.O);
                    int C = this.e.j.b.C();
                    if (C == -1) {
                        C = this.e.j.h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.j.b, C, this.e.e, this.e.j.A, bif);
                    bjl.c();
                    bha.a(this.e.c, adOverlayInfoParcel, true);
                    return;
                }
                new bid(this, this.k).h();
            }
        }
    }
}
