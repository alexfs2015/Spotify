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

@cey
/* renamed from: ecd reason: default package */
public final class ecd implements ech {
    final String a;
    final Object b = new Object();
    ecs c;
    int d = -2;
    private final ecp e;
    private final long f;
    private final ebz g;
    private final eby h;
    private doy i;
    private final dpc j;
    private final Context k;
    private final coy l;
    private final boolean m;
    private final dup n;
    private final List<String> o;
    private final List<String> p;
    private final List<String> q;
    private final boolean r;
    private final boolean s;
    private ecy t;

    public ecd(Context context, String str, ecp ecp, ebz ebz, eby eby, doy doy, dpc dpc, coy coy, boolean z, boolean z2, dup dup, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        ebz ebz2 = ebz;
        eby eby2 = eby;
        this.k = context;
        this.e = ecp;
        this.h = eby2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            str2 = d();
        }
        this.a = str2;
        this.g = ebz2;
        long j2 = eby2.t != -1 ? eby2.t : ebz2.b != -1 ? ebz2.b : 10000;
        this.f = j2;
        this.i = doy;
        this.j = dpc;
        this.l = coy;
        this.m = z;
        this.r = z2;
        this.n = dup;
        this.o = list;
        this.p = list2;
        this.q = list3;
        this.s = z3;
    }

    private static ecs a(bkn bkn) {
        return new edn(bkn);
    }

    public final void a(int i2) {
        synchronized (this.b) {
            this.d = i2;
            this.b.notify();
        }
    }

    public final void a(ecy ecy) {
        synchronized (this.b) {
            this.d = 0;
            this.t = ecy;
            this.b.notify();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.g.m != -1;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    this.c.c();
                }
            } catch (RemoteException unused) {
                cow.a(5);
            }
            this.d = -1;
            this.b.notify();
        }
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
            cow.a(5);
        }
        return str;
    }

    public final ecg a(long j2, long j3) {
        ecg ecg;
        synchronized (this.b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ecc ecc = new ecc();
            cmd.a.post(new ece(this, ecc));
            long j4 = this.f;
            while (this.d == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j5 = j4 - (elapsedRealtime2 - elapsedRealtime);
                long j6 = j3 - (elapsedRealtime2 - j2);
                if (j5 <= 0 || j6 <= 0) {
                    cow.a(4);
                    this.d = 3;
                } else {
                    try {
                        this.b.wait(Math.min(j5, j6));
                    } catch (InterruptedException unused) {
                        this.d = 5;
                    }
                }
            }
            ecg = new ecg(this.h, this.c, this.a, ecc, this.d, e(), bjl.l().b() - elapsedRealtime);
        }
        return ecg;
    }

    private final ecy e() {
        if (this.d != 0 || !c()) {
            return null;
        }
        try {
            if (!(!b(4) || this.t == null || this.t.a() == 0)) {
                return this.t;
            }
        } catch (RemoteException unused) {
            cow.a(5);
        }
        return new ecf(f());
    }

    /* access modifiers changed from: 0000 */
    public final ecs b() {
        String valueOf = String.valueOf(this.a);
        String str = "Instantiating mediation adapter: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(4);
        if (!this.m && !this.h.b()) {
            if (((Boolean) dpn.f().a(dsp.bu)).booleanValue()) {
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
                    return a((bkn) new AdMobAdapter());
                }
            }
            if (((Boolean) dpn.f().a(dsp.bv)).booleanValue()) {
                if ("com.google.ads.mediation.AdUrlAdapter".equals(this.a)) {
                    return a((bkn) new AdUrlAdapter());
                }
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
                return new edn(new zzzv());
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
            cow.a(3);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i2) {
        try {
            Bundle bundle = this.m ? this.c.l() : this.j.d ? this.c.k() : this.c.j();
            return bundle != null && (bundle.getInt("capabilities", 0) & i2) == i2;
        } catch (RemoteException unused) {
            cow.a(5);
            return false;
        }
    }

    private final String a(String str) {
        if (str != null && c() && !b(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                cow.a(5);
            }
        }
        return str;
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
            cow.a(5);
            return 0;
        }
    }

    private static bez b(String str) {
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
            cow.a(5);
        }
        return aVar.a();
    }

    static /* synthetic */ void a(ecd ecd, ecc ecc) {
        String a2 = ecd.a(ecd.h.k);
        try {
            if (ecd.l.c >= 4100000) {
                if (!ecd.m) {
                    if (!ecd.h.b()) {
                        if (ecd.j.d) {
                            ecd.c.a(cas.a(ecd.k), ecd.i, a2, ecd.h.a, (ecv) ecc);
                            return;
                        } else if (!ecd.r) {
                            ecd.c.a(cas.a(ecd.k), ecd.j, ecd.i, a2, ecd.h.a, ecc);
                            return;
                        } else if (ecd.h.o != null) {
                            ecd.c.a(cas.a(ecd.k), ecd.i, a2, ecd.h.a, ecc, new dup(b(ecd.h.s)), ecd.h.r);
                            return;
                        } else {
                            ecd.c.a(cas.a(ecd.k), ecd.j, ecd.i, a2, ecd.h.a, ecc);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(ecd.o);
                if (ecd.p != null) {
                    for (String str : ecd.p) {
                        String str2 = ":false";
                        if (ecd.q != null && ecd.q.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + str2.length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                ecd.c.a(cas.a(ecd.k), ecd.i, a2, ecd.h.a, ecc, ecd.n, arrayList);
            } else if (ecd.j.d) {
                ecd.c.a(cas.a(ecd.k), ecd.i, a2, ecc);
            } else {
                ecd.c.a(cas.a(ecd.k), ecd.j, ecd.i, a2, (ecv) ecc);
            }
        } catch (RemoteException unused) {
            cow.a(5);
            ecd.a(5);
        }
    }
}
