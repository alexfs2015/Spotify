package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzzv;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ecu reason: default package */
public final class ecu implements ecy {
    final String a;
    final Object b = new Object();
    edj c;
    int d = -2;
    private final edg e;
    private final long f;
    private final ecq g;
    private final ecp h;
    private dpp i;
    private final dpt j;
    private final Context k;
    private final cpp l;
    private final boolean m;
    private final dvg n;
    private final List<String> o;
    private final List<String> p;
    private final List<String> q;
    private final boolean r;
    private final boolean s;
    private edp t;

    public ecu(Context context, String str, edg edg, ecq ecq, ecp ecp, dpp dpp, dpt dpt, cpp cpp, boolean z, boolean z2, dvg dvg, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        ecq ecq2 = ecq;
        ecp ecp2 = ecp;
        this.k = context;
        this.e = edg;
        this.h = ecp2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            str2 = d();
        }
        this.a = str2;
        this.g = ecq2;
        long j2 = ecp2.t != -1 ? ecp2.t : ecq2.b != -1 ? ecq2.b : 10000;
        this.f = j2;
        this.i = dpp;
        this.j = dpt;
        this.l = cpp;
        this.m = z;
        this.r = z2;
        this.n = dvg;
        this.o = list;
        this.p = list2;
        this.q = list3;
        this.s = z3;
    }

    private static edj a(ble ble) {
        return new eee(ble);
    }

    private final String a(String str) {
        if (str != null && c() && !b(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                cpn.a(5);
            }
        }
        return str;
    }

    static /* synthetic */ void a(ecu ecu, ect ect) {
        String a2 = ecu.a(ecu.h.k);
        try {
            if (ecu.l.c >= 4100000) {
                if (!ecu.m) {
                    if (!ecu.h.b()) {
                        if (ecu.j.d) {
                            ecu.c.a(cbj.a(ecu.k), ecu.i, a2, ecu.h.a, (edm) ect);
                            return;
                        } else if (!ecu.r) {
                            ecu.c.a(cbj.a(ecu.k), ecu.j, ecu.i, a2, ecu.h.a, ect);
                            return;
                        } else if (ecu.h.o != null) {
                            ecu.c.a(cbj.a(ecu.k), ecu.i, a2, ecu.h.a, ect, new dvg(b(ecu.h.s)), ecu.h.r);
                            return;
                        } else {
                            ecu.c.a(cbj.a(ecu.k), ecu.j, ecu.i, a2, ecu.h.a, ect);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(ecu.o);
                if (ecu.p != null) {
                    for (String str : ecu.p) {
                        String str2 = ":false";
                        if (ecu.q != null && ecu.q.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + str2.length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                ecu.c.a(cbj.a(ecu.k), ecu.i, a2, ecu.h.a, ect, ecu.n, arrayList);
            } else if (ecu.j.d) {
                ecu.c.a(cbj.a(ecu.k), ecu.i, a2, ect);
            } else {
                ecu.c.a(cbj.a(ecu.k), ecu.j, ecu.i, a2, (edm) ect);
            }
        } catch (RemoteException unused) {
            cpn.a(5);
            ecu.a(5);
        }
    }

    private static bfq b(String str) {
        String str2 = "any";
        a aVar = new a();
        if (str == null) {
            return aVar.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = 0;
            aVar.c = jSONObject.optBoolean("multiple_images", false);
            aVar.a = jSONObject.optBoolean("only_urls", false);
            String optString = jSONObject.optString("native_image_orientation", str2);
            if ("landscape".equals(optString)) {
                i2 = 2;
            } else if ("portrait".equals(optString)) {
                i2 = 1;
            } else if (!str2.equals(optString)) {
                i2 = -1;
            }
            aVar.b = i2;
        } catch (JSONException unused) {
            cpn.a(5);
        }
        return aVar.a();
    }

    private final String d() {
        String str = "com.google.ads.mediation.customevent.CustomEventAdapter";
        try {
            if (!TextUtils.isEmpty(this.h.e)) {
                if (this.e.b(this.h.e)) {
                    str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
                }
                return str;
            }
        } catch (RemoteException unused) {
            cpn.a(5);
        }
        return str;
    }

    private final edp e() {
        if (this.d != 0 || !c()) {
            return null;
        }
        try {
            if (!(!b(4) || this.t == null || this.t.a() == 0)) {
                return this.t;
            }
        } catch (RemoteException unused) {
            cpn.a(5);
        }
        return new ecw(f());
    }

    private final int f() {
        if (this.h.k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.h.k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            cpn.a(5);
            return 0;
        }
    }

    public final ecx a(long j2, long j3) {
        ecx ecx;
        synchronized (this.b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ect ect = new ect();
            cmu.a.post(new ecv(this, ect));
            long j4 = this.f;
            while (this.d == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j5 = j4 - (elapsedRealtime2 - elapsedRealtime);
                long j6 = j3 - (elapsedRealtime2 - j2);
                if (j5 <= 0 || j6 <= 0) {
                    cpn.a(4);
                    this.d = 3;
                } else {
                    try {
                        this.b.wait(Math.min(j5, j6));
                    } catch (InterruptedException unused) {
                        this.d = 5;
                    }
                }
            }
            ecx = new ecx(this.h, this.c, this.a, ect, this.d, e(), bkc.l().b() - elapsedRealtime);
        }
        return ecx;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    this.c.c();
                }
            } catch (RemoteException unused) {
                cpn.a(5);
            }
            this.d = -1;
            this.b.notify();
        }
    }

    public final void a(int i2) {
        synchronized (this.b) {
            this.d = i2;
            this.b.notify();
        }
    }

    public final void a(edp edp) {
        synchronized (this.b) {
            this.d = 0;
            this.t = edp;
            this.b.notify();
        }
    }

    /* access modifiers changed from: 0000 */
    public final edj b() {
        String valueOf = String.valueOf(this.a);
        String str = "Instantiating mediation adapter: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cpn.a(4);
        if (!this.m && !this.h.b()) {
            if (((Boolean) dqe.f().a(dtg.bu)).booleanValue()) {
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                    return a((ble) new AdMobAdapter());
                }
            }
            if (((Boolean) dqe.f().a(dtg.bv)).booleanValue()) {
                if ("com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                    return a((ble) new AdUrlAdapter());
                }
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new eee(new zzzv());
            }
        }
        try {
            return this.e.a(this.a);
        } catch (RemoteException unused) {
            String str2 = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.a);
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                new String(str2);
            }
            cpn.a(3);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i2) {
        try {
            Bundle bundle = this.m ? this.c.l() : this.j.d ? this.c.k() : this.c.j();
            return bundle != null && (bundle.getInt("capabilities", 0) & i2) == i2;
        } catch (RemoteException unused) {
            cpn.a(5);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.g.m != -1;
    }
}
