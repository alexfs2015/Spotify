package defpackage;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@cfp
/* renamed from: clq reason: default package */
public final class clq {
    public final String A;
    public final String B;
    public final duw C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final List<String> J;
    public final dny K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    private final cgr P;
    private final long Q;
    private final long R;
    private final String S;
    public final dpp a;
    public final cti b;
    public final List<String> c;
    public final int d;
    public final List<String> e;
    public final List<String> f;
    public final List<String> g;
    public final int h;
    public final long i;
    public final String j;
    public final JSONObject k;
    public final boolean l;
    public boolean m;
    public final boolean n;
    public final ecp o;
    public final edj p;
    public final String q;
    public final ecq r;
    public final ect s;
    public final String t;
    public final dpt u;
    public final cko v;
    public final List<String> w;
    public final List<String> x;
    public final long y;
    public final long z;

    public clq(clr clr) {
        clr clr2 = clr;
        this(clr2.a.c, null, clr2.b.c, clr2.e, clr2.b.e, clr2.b.i, clr2.b.k, clr2.b.j, clr2.a.i, clr2.b.g, null, null, null, clr2.c, null, clr2.b.h, clr2.d, clr2.b.f, clr2.f, clr2.g, clr2.b.n, clr2.h, null, clr2.b.A, clr2.b.B, clr2.b.B, clr2.b.D, clr2.b.E, null, clr2.b.H, clr2.b.L, clr2.i, clr2.b.O, clr2.j, clr2.b.Q, clr2.b.R, clr2.b.S, clr2.b.T);
    }

    public clq(dpp dpp, cti cti, List<String> list, int i2, List<String> list2, List<String> list3, int i3, long j2, String str, boolean z2, ecp ecp, edj edj, String str2, ecq ecq, ect ect, long j3, dpt dpt, long j4, long j5, long j6, String str3, JSONObject jSONObject, duw duw, cko cko, List<String> list4, List<String> list5, boolean z3, cgr cgr, String str4, List<String> list6, String str5, dny dny, boolean z4, boolean z5, boolean z6, List<String> list7, boolean z7, String str6) {
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.a = dpp;
        this.b = cti;
        this.c = a(list);
        this.d = i2;
        this.e = a(list2);
        this.g = a(list3);
        this.h = i3;
        this.i = j2;
        this.j = str;
        this.n = z2;
        this.o = ecp;
        this.p = edj;
        this.q = str2;
        this.r = ecq;
        this.s = ect;
        this.Q = j3;
        this.u = dpt;
        this.R = j4;
        this.y = j5;
        this.z = j6;
        this.A = str3;
        this.k = jSONObject;
        this.C = duw;
        this.v = cko;
        this.w = a(list4);
        this.x = a(list5);
        this.l = z3;
        this.P = cgr;
        this.t = str4;
        this.J = a(list6);
        this.B = str5;
        this.K = dny;
        this.L = z4;
        this.M = z5;
        this.N = z6;
        this.f = a(list7);
        this.O = z7;
        this.S = str6;
    }

    private static <T> List<T> a(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean a() {
        cti cti = this.b;
        if (cti == null || cti.x() == null) {
            return false;
        }
        return this.b.x().b();
    }
}
