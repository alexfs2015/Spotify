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

@cey
/* renamed from: cii reason: default package */
public final class cii extends bjp implements cjk {
    public static cii j;
    boolean k;
    public final cif l;
    private boolean m;
    private final cko n;

    public cii(Context context, bki bki, dpc dpc, ecp ecp, coy coy) {
        super(context, dpc, null, ecp, coy, bki);
        j = this;
        this.n = new cko(context, null);
        cif cif = new cif(this.e, this.o, this, this, this);
        this.l = cif;
    }

    public final void E_() {
        if (bjl.B().e(this.e.c)) {
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
        bwx.b("isLoaded must be called on the main UI thread.");
        return this.e.g == null && this.e.h == null && this.e.j != null;
    }

    public final void a(Context context) {
        this.l.a(context);
    }

    public final void a(cla cla, dtc dtc) {
        if (cla.e != -2) {
            cmd.a.post(new cik(this, cla));
            return;
        }
        this.e.k = cla;
        if (cla.c == null) {
            this.e.k = b(cla);
        }
        this.l.a();
    }

    public final boolean a(ckz ckz, ckz ckz2) {
        b(ckz2, false);
        return cif.b();
    }

    public final boolean a(doy doy, ckz ckz, boolean z) {
        return false;
    }

    public final void b() {
        this.l.c();
        A();
    }

    public final void c() {
        if (bjl.B().e(this.e.c)) {
            this.n.a(false);
        }
        u();
    }

    public final void c(boolean z) {
        bwx.b("setImmersiveMode must be called on the main UI thread.");
        this.k = z;
    }

    public final void u() {
        this.e.j = null;
        super.u();
    }

    public final void a(cjc cjc) {
        bwx.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(cjc.b)) {
            cow.a(5);
            cmd.a.post(new cij(this));
            return;
        }
        this.m = false;
        this.e.b = cjc.b;
        this.n.a = cjc.b;
        super.b(cjc.a);
    }

    public final void o() {
        cif cif = this.l;
        bwx.b("pause must be called on the main UI thread.");
        for (String str : cif.a.keySet()) {
            try {
                cjs cjs = (cjs) cif.a.get(str);
                if (!(cjs == null || cjs.a == null)) {
                    cjs.a.d();
                }
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final void p() {
        cif cif = this.l;
        bwx.b("resume must be called on the main UI thread.");
        for (String str : cif.a.keySet()) {
            try {
                cjs cjs = (cjs) cif.a.get(str);
                if (!(cjs == null || cjs.a == null)) {
                    cjs.a.e();
                }
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final void j() {
        cif cif = this.l;
        bwx.b("destroy must be called on the main UI thread.");
        for (String str : cif.a.keySet()) {
            try {
                cjs cjs = (cjs) cif.a.get(str);
                if (!(cjs == null || cjs.a == null)) {
                    cjs.a.c();
                }
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
            }
        }
        super.j();
    }

    public final void a(cjx cjx) {
        cjx a = this.l.a(cjx);
        if (bjl.B().e(this.e.c) && a != null) {
            ckp B = bjl.B();
            Context context = this.e.c;
            String i = bjl.B().i(this.e.c);
            String str = this.e.b;
            String str2 = a.a;
            int i2 = a.b;
            if (B.a(context)) {
                Bundle a2 = ckp.a(i, false);
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
                clu.a();
            }
        }
        b(a);
    }

    private static cla b(cla cla) {
        cla cla2 = cla;
        clu.a();
        try {
            JSONObject a = chi.a(cla2.b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, cla2.a.e);
            String jSONObject2 = jSONObject.toString();
            eby eby = new eby(a.toString(), Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            ebz ebz = new ebz(Arrays.asList(new eby[]{eby}), ((Long) dpn.f().a(dsp.bz)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "");
            cla cla3 = new cla(cla2.a, cla2.b, ebz, cla2.d, cla2.e, cla2.f, cla2.g, cla2.h, cla2.i, null);
            return cla3;
        } catch (JSONException e) {
            clu.a("Unable to generate ad state for non-mediated rewarded video.", e);
            cla cla4 = new cla(cla2.a, cla2.b, null, cla2.d, 0, cla2.f, cla2.g, cla2.h, cla2.i, null);
            return cla4;
        }
    }
}
