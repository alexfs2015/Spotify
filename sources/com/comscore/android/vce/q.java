package com.comscore.android.vce;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.comscore.android.CommonUtils;
import com.comscore.android.ConnectivityType;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.CrossPublisherIdUtil.GeneratedCrossPublisherId;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.HashMap;
import org.json.JSONObject;

class q {
    static final String A = "ns_vc_cc";
    static final String B = "ns_vc_nc";
    static final String C = "ns_ap_ni";
    static final String D = "pt";
    static final String E = "right";
    static final String F = "left";
    static final String G = "updown";
    static final String a = "Meta";
    static final String c = "nofwk";
    static final String d = "unknown";
    static final String e = "ns_ap_device";
    static final String f = "ns_ap_pn";
    static final String g = "ns_ap_pfv";
    static final String h = "ns_ap_ar";
    static final String i = "ns_ap_jb";
    static final String j = "ns_ap_an";
    static final String k = "ns_ap_bi";
    static final String l = "ns_ap_ver";
    static final String m = "ns_ap_lang";
    static final String n = "ns_radio";
    static final String o = "ns_ap_res";
    static final String p = "ns_ap_sd";
    static final String q = "ns_ap_po";
    static final String r = "ns_ak";
    static final String s = "ns_vc_sv";
    static final String t = "ns_vc_pb";
    static final String u = "ns_vc_pa";
    static final String v = "ns_vc_vd";
    static final String w = "ns_vc_sver";
    static final String x = "ns_vc_aot";
    static final String y = "ns_vc_nw";
    static final String z = "ns_vc_cn";
    final HashMap<String, String> H = new HashMap<>();
    String I;
    BroadcastReceiver J;
    final s K;
    final i L;
    final w M;
    private int N = -1;
    private int O = -1;
    final p b;

    q(p pVar, s sVar, i iVar, w wVar) {
        this.b = pVar;
        this.K = sVar;
        this.M = wVar;
        this.L = iVar;
        b();
    }

    /* access modifiers changed from: 0000 */
    public String A() {
        return CommonUtils.getPackageName(this.K.c());
    }

    /* access modifiers changed from: 0000 */
    public String B() {
        HashMap<String, String> hashMap = this.H;
        String str = r;
        if (!hashMap.containsKey(str)) {
            D();
        }
        return (String) this.H.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void C() {
        D();
    }

    /* access modifiers changed from: 0000 */
    public void D() {
        String str;
        GeneratedCrossPublisherId generatedCrossPublisherDeviceId = CrossPublisherIdUtil.getGeneratedCrossPublisherDeviceId();
        String str2 = null;
        if (generatedCrossPublisherDeviceId != null) {
            str = generatedCrossPublisherDeviceId.getValue();
            if (str == null || str.isEmpty()) {
                str = null;
            }
            if (generatedCrossPublisherDeviceId.isChanged()) {
                str2 = "1";
            }
        } else {
            str = null;
        }
        b(str, str2);
    }

    /* access modifiers changed from: 0000 */
    public String E() {
        String str = v;
        if (a(str)) {
            a(str, F());
        }
        return b(str);
    }

    /* access modifiers changed from: 0000 */
    public String F() {
        String str = d;
        try {
            Signature[] signatureArr = this.K.c().getPackageManager().getPackageInfo(this.K.c().getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                str = Integer.toString(signatureArr[0].hashCode());
            }
        } catch (Exception unused) {
        }
        return ad.d(str);
    }

    /* access modifiers changed from: 0000 */
    public String G() {
        return CommonUtils.getDeviceModel();
    }

    /* access modifiers changed from: 0000 */
    public String H() {
        J();
        return this.I;
    }

    /* access modifiers changed from: 0000 */
    public HashMap<String, String> I() {
        return this.H;
    }

    /* access modifiers changed from: 0000 */
    public void J() {
        try {
            this.I = new JSONObject(this.H).toString();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public String K() {
        return Vce.getSdkVersion();
    }

    /* access modifiers changed from: 0000 */
    public int L() {
        return this.N;
    }

    /* access modifiers changed from: 0000 */
    public int M() {
        return this.O;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.J != null) {
            this.K.c().unregisterReceiver(this.J);
            this.J = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        this.N = i2;
        this.O = i3;
        this.H.put(q, m());
        this.L.o();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        this.H.put(str, str2);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        return !this.H.containsKey(str);
    }

    /* access modifiers changed from: 0000 */
    public String b(String str) {
        return (String) this.H.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        d();
    }

    /* access modifiers changed from: 0000 */
    public void b(String str, String str2) {
        HashMap<String, String> hashMap = this.H;
        String str3 = r;
        String str4 = (String) hashMap.get(str3);
        HashMap<String, String> hashMap2 = this.H;
        String str5 = C;
        String str6 = (String) hashMap2.get(str5);
        if (str != null) {
            str = ad.b(str);
            this.H.put(str3, str);
        } else if (str4 != null) {
            this.H.remove(str3);
        }
        if (str2 != null) {
            this.H.put(str5, str2);
        } else if (str6 != null) {
            this.H.remove(str5);
        }
        boolean z2 = false;
        if ((str4 != null && !str4.equals(str)) || (str4 == null && str != null)) {
            z2 = true;
        }
        if ((str6 != null && !str6.equals(str2)) || (str6 == null && str2 != null)) {
            z2 = true;
        }
        if (z2) {
            this.L.o();
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        if (str.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.M.q();
            j();
            return;
        }
        if (str.equals("android.intent.action.CONFIGURATION_CHANGED")) {
            this.M.r();
            i();
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        String str = k;
        String str2 = j;
        String str3 = v;
        try {
            this.H.put(s, K());
            this.H.put(u, this.L.n());
            this.H.put(t, this.L.m());
            this.H.put(e, G());
            this.H.put(f, f());
            this.H.put(g, g());
            this.H.put(i, e());
            if (a(str3)) {
                a(str3, F());
            }
            if (a(str2)) {
                a(str2, w());
            }
            if (a(str)) {
                a(str, A());
            }
            this.H.put(l, x());
            this.H.put(w, y());
            this.H.put(m, u());
            this.H.put(y, t());
            this.H.put(z, g(s()));
            this.H.put(A, r());
            this.H.put(B, q());
            this.H.put(h, p());
            this.H.put(p, o());
            this.H.put(o, n());
            this.H.put(q, m());
            this.H.put(n, l());
            this.H.put(x, k());
            D();
            h();
            c();
        } catch (Error unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(String str) {
        this.H.put("apiMethodNumber", str);
    }

    /* access modifiers changed from: 0000 */
    public String e() {
        return CommonUtils.isDeviceRooted() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
    }

    /* access modifiers changed from: 0000 */
    public void e(String str) {
        this.H.put(u, str);
    }

    /* access modifiers changed from: 0000 */
    public String f() {
        return CommonUtils.getOsName();
    }

    /* access modifiers changed from: 0000 */
    public void f(String str) {
        this.H.put(t, str);
    }

    /* access modifiers changed from: 0000 */
    public String g() {
        return CommonUtils.getOsVersion();
    }

    /* access modifiers changed from: 0000 */
    public String g(String str) {
        return str.replaceAll("[^A-Za-z0-9\\s_&.,]", "");
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        this.J = new BroadcastReceiver() {
            public void onReceive(Context context, final Intent intent) {
                final String action = intent.getAction();
                q.this.K.a(new Runnable() {
                    public void run() {
                        try {
                            q.this.c(action);
                        } catch (Exception unused) {
                        }
                    }
                }, 300);
            }
        };
        this.K.c().registerReceiver(this.J, intentFilter);
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        String k2 = k();
        HashMap<String, String> hashMap = this.H;
        String str = x;
        if (!((String) hashMap.get(str)).equals(k2)) {
            this.H.put(str, k2);
            this.H.put(p, o());
            this.H.put(o, n());
            this.H.put(q, m());
            this.L.o();
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        String l2 = l();
        HashMap<String, String> hashMap = this.H;
        String str = n;
        if (!((String) hashMap.get(str)).equalsIgnoreCase(l2)) {
            this.H.put(str, l2);
            this.H.put(y, t());
            this.L.o();
        }
    }

    /* access modifiers changed from: 0000 */
    public String k() {
        if (!this.M.c()) {
            return c;
        }
        int e2 = this.M.e();
        return e2 != 0 ? e2 != 1 ? e2 != 2 ? e2 != 3 ? d : E : G : F : D;
    }

    /* access modifiers changed from: 0000 */
    public String l() {
        switch (CommonUtils.getConnectivityType(this.K.c())) {
            case ConnectivityType.ETHERNET /*40100*/:
                return "eth";
            case ConnectivityType.WIFI /*40101*/:
                return "wifi";
            case ConnectivityType.WWAN /*40102*/:
                return "wwan";
            case ConnectivityType.BLUETOOTH /*40103*/:
                return "bt";
            case ConnectivityType.EMULATOR /*40104*/:
                return "emu";
            default:
                return d;
        }
    }

    /* access modifiers changed from: 0000 */
    public String m() {
        StringBuilder sb;
        int b2;
        String str = "0x";
        if (this.N != -1) {
            sb = new StringBuilder(str);
            b2 = this.N;
        } else {
            sb = new StringBuilder(str);
            b2 = this.M.j().b();
        }
        sb.append(b2);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public String n() {
        ae f2 = this.M.f();
        return String.format("%dx%d", new Object[]{Integer.valueOf(f2.a()), Integer.valueOf(f2.b())});
    }

    /* access modifiers changed from: 0000 */
    public String o() {
        ae g2 = this.M.g();
        return String.format("%dx%d", new Object[]{Integer.valueOf(g2.a()), Integer.valueOf(g2.b())});
    }

    /* access modifiers changed from: 0000 */
    public String p() {
        return CommonUtils.getDeviceArchitecture();
    }

    /* access modifiers changed from: 0000 */
    public String q() {
        return !this.M.d() ? c : this.M.m();
    }

    /* access modifiers changed from: 0000 */
    public String r() {
        return !this.M.d() ? c : this.M.n();
    }

    /* access modifiers changed from: 0000 */
    public String s() {
        return !this.M.d() ? c : this.M.o();
    }

    /* access modifiers changed from: 0000 */
    public String t() {
        if (!this.M.d()) {
            return c;
        }
        switch (this.M.p()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return IdHelperAndroid.NO_ID_AVAILABLE;
        }
    }

    /* access modifiers changed from: 0000 */
    public String u() {
        return CommonUtils.getLanguage();
    }

    /* access modifiers changed from: 0000 */
    public String v() {
        String str = j;
        if (a(str)) {
            a(str, w());
        }
        return b(str);
    }

    /* access modifiers changed from: 0000 */
    public String w() {
        return CommonUtils.getApplicationName(this.K.c());
    }

    /* access modifiers changed from: 0000 */
    public String x() {
        return CommonUtils.getApplicationVersion(this.K.c());
    }

    /* access modifiers changed from: 0000 */
    public String y() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.K.c().getPackageManager().getPackageInfo(this.K.c().getPackageName(), 0);
        } catch (NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageInfo.versionCode);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public String z() {
        String str = k;
        if (a(str)) {
            a(str, A());
        }
        return b(str);
    }
}
