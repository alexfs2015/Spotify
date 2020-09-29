package defpackage;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: ckz reason: default package */
public final class ckz {
    public final String A;
    public final String B;
    public final duf C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final List<String> J;
    public final dnh K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    private final cga P;
    private final long Q;
    private final long R;
    private final String S;
    public final doy a;
    public final csr b;
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
    public final eby o;
    public final ecs p;
    public final String q;
    public final ebz r;
    public final ecc s;
    public final String t;
    public final dpc u;
    public final cjx v;
    public final List<String> w;
    public final List<String> x;
    public final long y;
    public final long z;

    public ckz(cla cla) {
        cla cla2 = cla;
        this(cla2.a.c, null, cla2.b.c, cla2.e, cla2.b.e, cla2.b.i, cla2.b.k, cla2.b.j, cla2.a.i, cla2.b.g, null, null, null, cla2.c, null, cla2.b.h, cla2.d, cla2.b.f, cla2.f, cla2.g, cla2.b.n, cla2.h, null, cla2.b.A, cla2.b.B, cla2.b.B, cla2.b.D, cla2.b.E, null, cla2.b.H, cla2.b.L, cla2.i, cla2.b.O, cla2.j, cla2.b.Q, cla2.b.R, cla2.b.S, cla2.b.T);
    }

    public ckz(doy doy, csr csr, List<String> list, int i2, List<String> list2, List<String> list3, int i3, long j2, String str, boolean z2, eby eby, ecs ecs, String str2, ebz ebz, ecc ecc, long j3, dpc dpc, long j4, long j5, long j6, String str3, JSONObject jSONObject, duf duf, cjx cjx, List<String> list4, List<String> list5, boolean z3, cga cga, String str4, List<String> list6, String str5, dnh dnh, boolean z4, boolean z5, boolean z6, List<String> list7, boolean z7, String str6) {
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.a = doy;
        this.b = csr;
        this.c = a(list);
        this.d = i2;
        this.e = a(list2);
        this.g = a(list3);
        this.h = i3;
        this.i = j2;
        this.j = str;
        this.n = z2;
        this.o = eby;
        this.p = ecs;
        this.q = str2;
        this.r = ebz;
        this.s = ecc;
        this.Q = j3;
        this.u = dpc;
        this.R = j4;
        this.y = j5;
        this.z = j6;
        this.A = str3;
        this.k = jSONObject;
        this.C = duf;
        this.v = cjx;
        this.w = a(list4);
        this.x = a(list5);
        this.l = z3;
        this.P = cga;
        this.t = str4;
        this.J = a(list6);
        this.B = str5;
        this.K = dnh;
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
        csr csr = this.b;
        if (csr == null || csr.x() == null) {
            return false;
        }
        return this.b.x().b();
    }
}
