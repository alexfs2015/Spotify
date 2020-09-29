package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.moat.analytics.mobile.MoatAdEvent;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ciz reason: default package */
public final class ciz extends bkg implements ckb {
    public static ciz j;
    boolean k;
    public final ciw l;
    private boolean m;
    private final clf n;

    public ciz(Context context, bkz bkz, dpt dpt, edg edg, cpp cpp) {
        super(context, dpt, null, edg, cpp, bkz);
        j = this;
        this.n = new clf(context, null);
        ciw ciw = new ciw(this.e, this.o, this, this, this);
        this.l = ciw;
    }

    private static clr b(clr clr) {
        clr clr2 = clr;
        cml.a();
        try {
            JSONObject a = chz.a(clr2.b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, clr2.a.e);
            String jSONObject2 = jSONObject.toString();
            ecp ecp = new ecp(a.toString(), Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            ecq ecq = new ecq(Arrays.asList(new ecp[]{ecp}), ((Long) dqe.f().a(dtg.bz)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "");
            clr clr3 = new clr(clr2.a, clr2.b, ecq, clr2.d, clr2.e, clr2.f, clr2.g, clr2.h, clr2.i, null);
            return clr3;
        } catch (JSONException e) {
            cml.a("Unable to generate ad state for non-mediated rewarded video.", e);
            clr clr4 = new clr(clr2.a, clr2.b, null, clr2.d, 0, clr2.f, clr2.g, clr2.h, clr2.i, null);
            return clr4;
        }
    }

    public final void E_() {
        if (bkc.B().e(this.e.c)) {
            this.n.a(true);
        }
        a(this.e.j, false);
        w();
    }

    public final void F_() {
        this.l.d();
        B();
    }

    public final void G_() {
        e();
    }

    public final void H_() {
        v();
    }

    public final boolean J() {
        bxo.b("isLoaded must be called on the main UI thread.");
        return this.e.g == null && this.e.h == null && this.e.j != null;
    }

    public final void a(Context context) {
        this.l.a(context);
    }

    public final void a(cjt cjt) {
        bxo.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(cjt.b)) {
            cpn.a(5);
            cmu.a.post(new cja(this));
            return;
        }
        this.m = false;
        this.e.b = cjt.b;
        this.n.a = cjt.b;
        super.b(cjt.a);
    }

    public final void a(cko cko) {
        cko a = this.l.a(cko);
        if (bkc.B().e(this.e.c) && a != null) {
            clg B = bkc.B();
            Context context = this.e.c;
            String i = bkc.B().i(this.e.c);
            String str = this.e.b;
            String str2 = a.a;
            int i2 = a.b;
            if (B.a(context)) {
                Bundle a2 = clg.a(i, false);
                a2.putString("_ai", str);
                a2.putString(MoatAdEvent.EVENT_TYPE, str2);
                a2.putInt("value", i2);
                B.a(context, "_ar", a2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 75);
                sb.append("Log a Firebase reward video event, reward type: ");
                sb.append(str2);
                sb.append(", reward value: ");
                sb.append(i2);
                sb.toString();
                cml.a();
            }
        }
        b(a);
    }

    public final void a(clr clr, dtt dtt) {
        if (clr.e != -2) {
            cmu.a.post(new cjb(this, clr));
            return;
        }
        this.e.k = clr;
        if (clr.c == null) {
            this.e.k = b(clr);
        }
        this.l.a();
    }

    public final boolean a(clq clq, clq clq2) {
        b(clq2, false);
        return ciw.b();
    }

    public final boolean a(dpp dpp, clq clq, boolean z) {
        return false;
    }

    public final void b() {
        this.l.c();
        A();
    }

    public final void c() {
        if (bkc.B().e(this.e.c)) {
            this.n.a(false);
        }
        u();
    }

    public final void c(boolean z) {
        bxo.b("setImmersiveMode must be called on the main UI thread.");
        this.k = z;
    }

    public final void j() {
        ciw ciw = this.l;
        bxo.b("destroy must be called on the main UI thread.");
        for (String str : ciw.a.keySet()) {
            try {
                ckj ckj = (ckj) ciw.a.get(str);
                if (!(ckj == null || ckj.a == null)) {
                    ckj.a.c();
                }
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
            }
        }
        super.j();
    }

    public final void o() {
        ciw ciw = this.l;
        bxo.b("pause must be called on the main UI thread.");
        for (String str : ciw.a.keySet()) {
            try {
                ckj ckj = (ckj) ciw.a.get(str);
                if (!(ckj == null || ckj.a == null)) {
                    ckj.a.d();
                }
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final void p() {
        ciw ciw = this.l;
        bxo.b("resume must be called on the main UI thread.");
        for (String str : ciw.a.keySet()) {
            try {
                ckj ckj = (ckj) ciw.a.get(str);
                if (!(ckj == null || ckj.a == null)) {
                    ckj.a.e();
                }
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final void u() {
        this.e.j = null;
        super.u();
    }
}
