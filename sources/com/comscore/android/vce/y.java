package com.comscore.android.vce;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class y {
    static final String A = "mt";
    static final String B = "x";
    static final String C = "y";
    static final String D = "w";
    static final String E = "h";
    static final int F = 0;
    static final int G = 1;
    static final String H = "\"y\":";
    static final String I = "\"x\":";
    static final String J = "\"w\":";
    static final String K = "\"h\":";
    static final String d = "d";
    static final String e = "de";
    static final String f = "v";
    static final String g = "f";
    static final String h = "fs";
    static final String i = "m";
    static final String j = "at";
    static final String k = "b";
    static final String l = "af";
    static final String m = "t";
    static final String n = "ct";
    static final String o = "o";
    static final String p = "sof";
    static final String q = "sz";
    static final String r = "ssz";
    static final String s = "sc";
    static final String t = "p";
    static final String u = "scsz";
    static final String v = "ay";
    static final String w = "vi";
    static final String x = "via";
    static final String y = "vip";
    static final String z = "vis";
    final DecimalFormat L;
    final DecimalFormat M;
    Map<String, Object> N;
    HashMap<String, String> O;
    Map P;
    Map Q;
    private int R = -999;
    private int S = -999;
    private String T = "-1";
    private String U = "";
    private int V = -1;
    private int W = -1;
    private int X = -1;
    private int Y = -1;
    private int Z = -1;
    String a = "DataTrack";
    private int aa = -1;
    private int ab = -1;
    private int ac = -1;
    private int ad = -1;
    private int ae = -1;
    private int af = -1;
    private int ag = -1;
    private int ah = -1;
    private int ai = -1;
    private int aj = -1;
    private int ak = -1;
    private int al = -1;
    private int am = -1;
    private int an = -1;
    private int ao = -1;
    private float ap = 1.0f;
    private float aq = 1.0f;
    private float ar = -1.0f;
    private float as = -1.0f;
    private float at = -1.0f;
    private float au = -1.0f;
    final p b;
    final k c;

    y(p pVar, k kVar) {
        this.b = pVar;
        this.c = kVar;
        this.N = new HashMap();
        this.L = new DecimalFormat("#0.00");
        this.M = new DecimalFormat("#0");
    }

    /* access modifiers changed from: 0000 */
    public String A() {
        return this.L.format((double) this.at);
    }

    /* access modifiers changed from: 0000 */
    public String B() {
        return this.L.format((double) this.au);
    }

    /* access modifiers changed from: 0000 */
    public boolean C() {
        return 1 == this.W;
    }

    /* access modifiers changed from: 0000 */
    public String D() {
        HashMap<String, String> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get("ns_vc_aot");
    }

    /* access modifiers changed from: 0000 */
    public String E() {
        HashMap<String, String> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get("ns_ap_po");
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> F() {
        return this.O;
    }

    /* access modifiers changed from: 0000 */
    public void G() {
    }

    /* access modifiers changed from: 0000 */
    public void H() {
    }

    /* access modifiers changed from: 0000 */
    public void I() {
    }

    /* access modifiers changed from: 0000 */
    public String J() {
        if (this.N.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\"mt\":");
        sb.append(b((Map) this.N.get(A)));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("}");
        return sb3.toString();
    }

    /* access modifiers changed from: 0000 */
    public String K() {
        n nVar = new n();
        nVar.b();
        int i2 = this.R;
        if (i2 != -999) {
            nVar.a(d, i2);
        }
        int i3 = this.S;
        if (i3 != -999) {
            nVar.a(e, i3);
        }
        nVar.a(g, this.V);
        nVar.a(h, this.W);
        nVar.a(k, this.Y);
        nVar.a(l, this.Z);
        nVar.a(m, this.aa);
        nVar.a(n, this.ab);
        nVar.a(v, this.ac);
        nVar.a(j, this.X);
        nVar.a(o, this.ad, this.ae);
        nVar.b(q, this.af, this.ag);
        nVar.a(p, this.ah, this.ai);
        nVar.b(r, this.aj, this.ak);
        nVar.b(u, this.al, this.am);
        nVar.c(t, this.an, this.ao);
        nVar.a(s, this.L.format((double) this.ap), this.L.format((double) this.aq));
        String str = ".";
        String str2 = ",";
        nVar.a(w, this.L.format((double) this.ar).replace(str2, str));
        nVar.a(x, this.L.format((double) this.as).replace(str2, str));
        nVar.a(y, this.L.format((double) this.at).replace(str2, str));
        nVar.a(z, this.L.format((double) this.au).replace(str2, str));
        nVar.a(f, this.U);
        nVar.a(i, this.T);
        nVar.c();
        return nVar.a();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.N.clear();
        this.N = null;
        HashMap<String, String> hashMap = this.O;
        if (hashMap != null) {
            hashMap.clear();
            this.O = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        this.ar = f2;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, float f3) {
        this.ap = f2;
        this.aq = f3;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        this.R = i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        this.ad = i2;
        this.ae = i3;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-data");
        this.a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(HashMap<String, String> hashMap) {
        this.O = (HashMap) hashMap.clone();
        this.N.put(A, this.O);
    }

    /* access modifiers changed from: 0000 */
    public void a(Map map) {
        String str;
        StringBuilder sb;
        String str2;
        Iterator it;
        Map map2 = map;
        HashMap hashMap = new HashMap();
        String str3 = A;
        String str4 = ")";
        String str5 = "(";
        if (map2.get(str3) != null) {
            HashMap hashMap2 = (HashMap) map2.get(str3);
            if (this.Q == null) {
                hashMap = hashMap2;
            } else {
                for (String str6 : hashMap2.keySet()) {
                    if (!hashMap2.get(str6).equals(this.Q.get(str6))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(hashMap2.get(str6));
                        sb2.append(str5);
                        sb2.append(this.Q.get(str6));
                        sb2.append(str4);
                        hashMap.put(str6, sb2.toString());
                    }
                }
            }
            this.Q = (HashMap) hashMap2.clone();
        }
        String str7 = "fd";
        if (map2.get(str7) != null) {
            HashMap hashMap3 = (HashMap) map2;
            if (this.P == null) {
                hashMap = hashMap3;
            } else {
                Iterator it2 = hashMap3.keySet().iterator();
                while (it2.hasNext()) {
                    String str8 = (String) it2.next();
                    if (hashMap3.get(str8) instanceof Map) {
                        Map map3 = (Map) hashMap3.get(str8);
                        Map map4 = (Map) this.P.get(str8);
                        for (String str9 : map3.keySet()) {
                            if (!map3.get(str9).equals(map4.get(str9))) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str8);
                                sb3.append(".");
                                sb3.append(str9);
                                String sb4 = sb3.toString();
                                StringBuilder sb5 = new StringBuilder();
                                it = it2;
                                sb5.append(map3.get(str9));
                                sb5.append(str5);
                                sb5.append(map4.get(str9));
                                sb5.append(str4);
                                hashMap.put(sb4, sb5.toString());
                            } else {
                                it = it2;
                            }
                            it2 = it;
                        }
                    } else {
                        Iterator it3 = it2;
                        if (!hashMap3.get(str8).equals(this.P.get(str8))) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(hashMap3.get(str8));
                            sb6.append(str5);
                            sb6.append(this.P.get(str8));
                            sb6.append(str4);
                            hashMap.put(str8, sb6.toString());
                        }
                        it2 = it3;
                    }
                }
            }
            this.P = (HashMap) hashMap3.clone();
            for (String str10 : hashMap3.keySet()) {
                if (hashMap3.get(str10) instanceof Map) {
                    this.P.put(str10, ((HashMap) hashMap3.get(str10)).clone());
                }
            }
        }
        if (hashMap.size() > 0) {
            Object obj = map2.get(str3);
            String str11 = "";
            if (obj != null) {
                sb = new StringBuilder();
                sb.append(str11);
                str = "JS:META (Changes) ";
            } else {
                sb = new StringBuilder();
                sb.append(str11);
                str = "JS:VI (Changes) ";
            }
            sb.append(str);
            String sb7 = sb.toString();
            for (String str12 : hashMap.keySet()) {
                String str13 = str12.equals(k) ? "AppBackground" : str12.equals(l) ? "AppFocus" : str12.equals(g) ? "WebViewFocus" : str12.equals(m) ? "Top View" : str12.equals(str7) ? "FaceDown" : str11;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb7);
                sb8.append("  ");
                if (str13.equals(str11)) {
                    str2 = str11;
                } else {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str13);
                    sb9.append(" ");
                    str2 = sb9.toString();
                }
                sb8.append(str2);
                sb8.append(str12);
                sb8.append(":");
                sb8.append(hashMap.get(str12).toString());
                sb7 = sb8.toString();
            }
            this.b.a(this.a, sb7);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        this.V = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.S;
    }

    /* access modifiers changed from: 0000 */
    public String b(Map<String, Object> map) {
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        Map map2;
        StringBuilder sb4;
        String str2;
        Object obj;
        Map map3;
        String str3;
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        String str4 = "{";
        while (true) {
            str = ",";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            String str5 = (String) entry.getKey();
            boolean equals = str5.equals(o);
            String str6 = B;
            String str7 = " ,\"x\":";
            String str8 = C;
            String str9 = "},";
            if (equals) {
                map3 = (Map) entry.getValue();
                sb2 = new StringBuilder();
                sb2.append(str4);
                str3 = "\"o\":{\"y\":";
            } else if (str5.equals(s)) {
                map3 = (Map) entry.getValue();
                sb2 = new StringBuilder();
                sb2.append(str4);
                str3 = "\"sc\":{\"y\":";
            } else if (str5.equals(p)) {
                map3 = (Map) entry.getValue();
                sb2 = new StringBuilder();
                sb2.append(str4);
                str3 = "\"sof\":{\"y\":";
            } else {
                boolean equals2 = str5.equals(t);
                str6 = m;
                String str10 = k;
                if (equals2) {
                    map3 = (Map) entry.getValue();
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append("\"p\":{\"b\":");
                    sb2.append(map3.get(str10));
                    sb2.append(" ,\"r\":");
                    sb2.append(map3.get("r"));
                    sb2.append(" ,\"l\":");
                    sb2.append(map3.get("l"));
                    sb2.append(" ,\"t\":");
                    obj = map3.get(str6);
                    sb2.append(obj);
                    sb2.append(str9);
                    str4 = sb2.toString();
                } else {
                    boolean equals3 = str5.equals(q);
                    String str11 = E;
                    String str12 = " ,\"h\":";
                    String str13 = D;
                    if (equals3) {
                        map2 = (Map) entry.getValue();
                        sb4 = new StringBuilder();
                        sb4.append(str4);
                        str2 = "\"sz\":{\"w\":";
                    } else if (str5.equals(r)) {
                        map2 = (Map) entry.getValue();
                        sb4 = new StringBuilder();
                        sb4.append(str4);
                        str2 = "\"ssz\":{\"w\":";
                    } else if (str5.equals(u)) {
                        map2 = (Map) entry.getValue();
                        sb4 = new StringBuilder();
                        sb4.append(str4);
                        str2 = "\"scsz\":{\"w\":";
                    } else {
                        String str14 = "\"";
                        if (str5.equals(d) || str5.equals(g) || str5.equals(str10) || str5.equals(j) || str5.equals(h) || str5.equals(n) || str5.equals(e) || str5.equals(str6) || str5.equals(l) || str5.equals(v)) {
                            sb = new StringBuilder();
                            sb.append(str4);
                            sb.append(str14);
                            sb.append(str5);
                            sb.append("\":");
                            sb.append(entry.getValue());
                            sb.append(str);
                        } else {
                            String str15 = "\",";
                            String str16 = "\":\"";
                            if (str5.equals(x) || str5.equals(w) || str5.equals(z) || str5.equals(y)) {
                                String str17 = (String) entry.getValue();
                                sb = new StringBuilder();
                                sb.append(str4);
                                sb.append(str14);
                                sb.append(str5);
                                sb.append(str16);
                                sb.append(str17.replace(str, "."));
                                sb.append(str15);
                            } else {
                                if (!this.c.g() || !str5.equals("ns_ak")) {
                                    sb3 = new StringBuilder();
                                    sb3.append(str4);
                                    sb3.append(str14);
                                    sb3.append(str5);
                                    sb3.append(str16);
                                    sb3.append(entry.getValue());
                                } else {
                                    String obj2 = entry.getValue().toString();
                                    sb3 = new StringBuilder();
                                    sb3.append(str4);
                                    sb3.append(str14);
                                    sb3.append(str5);
                                    sb3.append(str16);
                                    sb3.append(ad.b(obj2));
                                }
                                sb2.append(str15);
                                str4 = sb2.toString();
                            }
                        }
                        str4 = sb.toString();
                    }
                    sb2.append(str2);
                    sb2.append(map2.get(str13));
                    sb2.append(str12);
                    obj = map2.get(str11);
                    sb2.append(obj);
                    sb2.append(str9);
                    str4 = sb2.toString();
                }
            }
            sb2.append(str3);
            sb2.append(map3.get(str8));
            sb2.append(str7);
            obj = map3.get(str6);
            sb2.append(obj);
            sb2.append(str9);
            str4 = sb2.toString();
        }
        if (str4.endsWith(str)) {
            str4 = str4.substring(0, str4.length() - 1);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str4);
        sb5.append("}");
        return sb5.toString();
    }

    /* access modifiers changed from: 0000 */
    public void b(float f2) {
        this.as = f2;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        this.S = i2;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, int i3) {
        this.af = i2;
        this.ag = i3;
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        this.T = str;
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        this.W = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.T;
    }

    /* access modifiers changed from: 0000 */
    public void c(float f2) {
        this.at = f2;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        this.ac = i2;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2, int i3) {
        this.aj = i2;
        this.ak = i3;
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        this.U = str;
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z2) {
        this.aa = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        return this.U;
    }

    /* access modifiers changed from: 0000 */
    public void d(float f2) {
        this.au = f2;
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2) {
        this.an = i2;
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2, int i3) {
        this.ah = i2;
        this.ai = i3;
    }

    /* access modifiers changed from: 0000 */
    public void d(boolean z2) {
        this.ab = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public float e() {
        return this.ap;
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2) {
        this.ao = i2;
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2, int i3) {
        this.al = i2;
        this.am = i3;
    }

    /* access modifiers changed from: 0000 */
    public void e(boolean z2) {
        this.Y = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return this.ad;
    }

    /* access modifiers changed from: 0000 */
    public void f(boolean z2) {
        this.Z = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int g() {
        return this.ae;
    }

    /* access modifiers changed from: 0000 */
    public void g(boolean z2) {
        this.X = z2 ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append(B);
        sb.append(this.ae);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int i() {
        return this.ac;
    }

    /* access modifiers changed from: 0000 */
    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.af);
        sb.append(B);
        sb.append(this.ag);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int k() {
        return this.af;
    }

    /* access modifiers changed from: 0000 */
    public int l() {
        return this.ag;
    }

    /* access modifiers changed from: 0000 */
    public int m() {
        return this.al;
    }

    /* access modifiers changed from: 0000 */
    public int n() {
        return this.am;
    }

    /* access modifiers changed from: 0000 */
    public String o() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.al);
        sb.append(B);
        sb.append(this.am);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int p() {
        return this.an;
    }

    /* access modifiers changed from: 0000 */
    public int q() {
        return this.ao;
    }

    /* access modifiers changed from: 0000 */
    public int r() {
        return this.V;
    }

    /* access modifiers changed from: 0000 */
    public int s() {
        return (this.Z == 1 && this.V == 1 && this.Y == 0) ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int t() {
        return this.aa;
    }

    /* access modifiers changed from: 0000 */
    public int u() {
        return this.ab;
    }

    /* access modifiers changed from: 0000 */
    public int v() {
        return this.Y;
    }

    /* access modifiers changed from: 0000 */
    public int w() {
        return this.Z;
    }

    /* access modifiers changed from: 0000 */
    public String x() {
        return this.L.format((double) this.ar);
    }

    /* access modifiers changed from: 0000 */
    public String y() {
        return this.M.format((double) (this.ar * 100.0f));
    }

    /* access modifiers changed from: 0000 */
    public String z() {
        return this.L.format((double) this.as);
    }
}
