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

@cfp
/* renamed from: bir reason: default package */
public final class bir extends bkl implements bgh, bhg {
    private transient boolean j;
    private int k = -1;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public float m;
    /* access modifiers changed from: private */
    public boolean n;
    private clf p;
    private String q;
    private final String r;
    private final ciw s;

    public bir(Context context, dpt dpt, String str, edg edg, cpp cpp, bkz bkz) {
        super(context, dpt, str, edg, cpp, bkz);
        boolean z = false;
        this.j = false;
        if (dpt != null) {
            if ("reward_mb".equals(dpt.a)) {
                z = true;
            }
        }
        this.r = z ? "/Rewarded" : "/Interstitial";
        this.s = z ? new ciw(this.e, this.o, new bit(this), this, this) : null;
    }

    private static clr b(clr clr) {
        clr clr2 = clr;
        try {
            String jSONObject = chz.a(clr2.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, clr2.a.e);
            ecp ecp = new ecp(jSONObject, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            cgp cgp = clr2.b;
            ecq ecq = new ecq(Collections.singletonList(ecp), ((Long) dqe.f().a(dtg.bz)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), cgp.H, cgp.I, "");
            cgp cgp2 = new cgp(clr2.a, cgp.a, cgp.b, Collections.emptyList(), Collections.emptyList(), cgp.f, true, cgp.h, Collections.emptyList(), cgp.j, cgp.k, cgp.l, cgp.m, cgp.n, cgp.o, cgp.p, null, cgp.r, cgp.s, cgp.t, cgp.u, cgp.v, cgp.x, cgp.y, cgp.z, null, Collections.emptyList(), Collections.emptyList(), cgp.D, cgp.E, cgp.F, cgp.G, cgp.H, cgp.I, cgp.J, null, cgp.L, cgp.M, cgp.N, cgp.O, cgp.Q, Collections.emptyList(), cgp.S, cgp.T);
            clr clr3 = new clr(clr2.a, cgp2, ecq, clr2.d, clr2.e, clr2.f, clr2.g, null, clr2.i, null);
            return clr3;
        } catch (JSONException e) {
            cml.a("Unable to generate ad state for an interstitial ad with pooling.", e);
            return clr2;
        }
    }

    private final void b(Bundle bundle) {
        bkc.e().b(this.e.c, this.e.e.a, "gmob-apps", bundle, false);
    }

    private final boolean e(boolean z) {
        return this.s != null && z;
    }

    public final void I() {
        Bitmap bitmap;
        int i;
        bxo.b("showInterstitial must be called on the main UI thread.");
        if (e(this.e.j != null && this.e.j.n)) {
            this.s.a(this.n);
            return;
        }
        if (bkc.B().d(this.e.c)) {
            this.q = bkc.B().f(this.e.c);
            String valueOf = String.valueOf(this.q);
            String valueOf2 = String.valueOf(this.r);
            this.q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.e.j == null) {
            cpn.a(5);
            return;
        }
        if (((Boolean) dqe.f().a(dtg.bp)).booleanValue()) {
            String packageName = (this.e.c.getApplicationContext() != null ? this.e.c.getApplicationContext() : this.e.c).getPackageName();
            String str = "action";
            String str2 = "appid";
            if (!this.j) {
                cpn.a(5);
                Bundle bundle = new Bundle();
                bundle.putString(str2, packageName);
                bundle.putString(str, "show_interstitial_before_load_finish");
                b(bundle);
            }
            bkc.e();
            if (!cmu.f(this.e.c)) {
                cpn.a(5);
                Bundle bundle2 = new Bundle();
                bundle2.putString(str2, packageName);
                bundle2.putString(str, "show_interstitial_app_not_in_foreground");
                b(bundle2);
            }
        }
        if (!this.e.d()) {
            if (this.e.j.n && this.e.j.p != null) {
                try {
                    if (((Boolean) dqe.f().a(dtg.aO)).booleanValue()) {
                        this.e.j.p.a(this.n);
                    }
                    this.e.j.p.b();
                } catch (RemoteException unused) {
                    cpn.a(5);
                    K();
                }
            } else if (this.e.j.b == null) {
                cpn.a(5);
            } else if (this.e.j.b.B()) {
                cpn.a(5);
            } else {
                this.e.j.b.b(true);
                this.e.a(this.e.j.b.o());
                if (this.e.j.k != null) {
                    this.g.a(this.e.i, this.e.j);
                }
                clq clq = this.e.j;
                if (clq.a()) {
                    new dlu(this.e.c, clq.b.o()).a((dly) clq.b);
                } else {
                    clq.b.x().a((cus) new bis(this, clq));
                }
                if (this.e.J) {
                    bkc.e();
                    bitmap = cmu.g(this.e.c);
                } else {
                    bitmap = null;
                }
                coq y = bkc.y();
                if (bitmap == null) {
                    cpn.a(3);
                    i = -1;
                } else {
                    i = y.b.getAndIncrement();
                    y.a.put(Integer.valueOf(i), bitmap);
                }
                this.k = i;
                if (!((Boolean) dqe.f().a(dtg.bP)).booleanValue() || bitmap == null) {
                    biw biw = new biw(this.e.J, J(), false, 0.0f, -1, this.n, this.e.j.L, this.e.j.O);
                    int C = this.e.j.b.C();
                    if (C == -1) {
                        C = this.e.j.h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.j.b, C, this.e.e, this.e.j.A, biw);
                    bkc.c();
                    bhr.a(this.e.c, adOverlayInfoParcel, true);
                    return;
                }
                new biu(this, this.k).h();
            }
        }
    }

    public final void I_() {
        super.I_();
        this.g.a(this.e.j);
        clf clf = this.p;
        if (clf != null) {
            clf.a(false);
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
        bkc.y().a(Integer.valueOf(this.k));
        if (this.e.c()) {
            this.e.a();
            this.e.j = null;
            this.e.J = false;
            this.j = false;
        }
    }

    public final void L() {
        bhk t = this.e.j.b.t();
        if (t != null) {
            t.a();
        }
    }

    /* access modifiers changed from: protected */
    public final cti a(clr clr, bla bla, clb clb) {
        bkc.f();
        cti a = ctp.a(this.e.c, cuv.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.i, clr.i);
        a.x().a(this, this, null, this, this, ((Boolean) dqe.f().a(dtg.ag)).booleanValue(), this, bla, this, clb);
        a(a);
        a.a(clr.a.v);
        a.a("/reward", (bhc<? super cti>) new bgg<Object>(this));
        return a;
    }

    public final void a(cko cko) {
        if (e(this.e.j != null && this.e.j.n)) {
            b(this.s.a(cko));
            return;
        }
        if (this.e.j != null) {
            if (this.e.j.x != null) {
                bkc.e();
                cmu.a(this.e.c, this.e.e.a, this.e.j.x);
            }
            if (this.e.j.v != null) {
                cko = this.e.j.v;
            }
        }
        b(cko);
    }

    public final void a(clr clr, dtt dtt) {
        if (clr.e != -2) {
            super.a(clr, dtt);
            return;
        }
        if (e(clr.c != null)) {
            this.s.a();
            return;
        }
        if (!((Boolean) dqe.f().a(dtg.aR)).booleanValue()) {
            super.a(clr, dtt);
            return;
        }
        boolean z = !clr.b.g;
        if (a(clr.a.c) && z) {
            this.e.k = b(clr);
        }
        super.a(this.e.k, dtt);
    }

    public final void a(boolean z) {
        this.e.J = z;
    }

    public final void a(boolean z, float f) {
        this.l = z;
        this.m = f;
    }

    public final boolean a(clq clq, clq clq2) {
        if (e(clq2.n)) {
            return ciw.b();
        }
        if (!super.a(clq, clq2)) {
            return false;
        }
        if (!(this.e.c() || this.e.H == null || clq2.k == null)) {
            this.g.a(this.e.i, clq2, this.e.H);
        }
        b(clq2, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(dpp dpp, clq clq, boolean z) {
        if (this.e.c() && clq.b != null) {
            bkc.g();
            cna.a(clq.b);
        }
        return this.d.b;
    }

    public final boolean a(dpp dpp, dtt dtt) {
        if (this.e.j != null) {
            cpn.a(5);
            return false;
        }
        if (this.p == null && a(dpp) && bkc.B().d(this.e.c) && !TextUtils.isEmpty(this.e.b)) {
            this.p = new clf(this.e.c, this.e.b);
        }
        return super.a(dpp, dtt);
    }

    public final void c(boolean z) {
        bxo.b("setImmersiveMode must be called on the main UI thread.");
        this.n = z;
    }

    public final void g() {
        aa();
        super.g();
        if (!(this.e.j == null || this.e.j.b == null)) {
            cup x = this.e.j.b.x();
            if (x != null) {
                x.g();
            }
        }
        if (!(!bkc.B().d(this.e.c) || this.e.j == null || this.e.j.b == null)) {
            clg B = bkc.B();
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
        clf clf = this.p;
        if (clf != null) {
            clf.a(true);
        }
        if (this.h != null && this.e.j != null && this.e.j.b != null) {
            this.e.j.b.a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
        }
    }

    public final void t_() {
        if (e(this.e.j != null && this.e.j.n)) {
            this.s.c();
            A();
            return;
        }
        if (!(this.e.j == null || this.e.j.w == null)) {
            bkc.e();
            cmu.a(this.e.c, this.e.e.a, this.e.j.w);
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
        cti cti = this.e.j != null ? this.e.j.b : null;
        clr clr = this.e.k;
        if (!(clr == null || clr.b == null || !clr.b.Q || cti == null || !bkc.u().a(this.e.c))) {
            int i = this.e.e.b;
            int i2 = this.e.e.c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.h = bkc.u().a(sb.toString(), cti.n(), "", "javascript", H());
            if (this.h != null) {
                bkc.u().a(this.h, cti.o());
                bkc.u().a(this.h);
            }
        }
        super.x();
        this.j = true;
    }
}
