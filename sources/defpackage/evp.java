package defpackage;

import android.text.TextUtils;

/* renamed from: evp reason: default package */
final class evp {
    private String A;
    private long B;
    private long C;
    final ery a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    String h;
    boolean i;
    private final String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private long o;
    private long p;
    private long q;
    private String r;
    private long s;
    private String t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private boolean y;
    private boolean z;

    evp(ery ery, String str) {
        bwx.a(ery);
        bwx.a(str);
        this.a = ery;
        this.j = str;
        this.a.p().c();
    }

    public final String a() {
        this.a.p().c();
        return this.j;
    }

    public final String b() {
        this.a.p().c();
        return this.k;
    }

    public final void a(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.k, str);
        this.k = str;
    }

    public final String c() {
        this.a.p().c();
        return this.l;
    }

    public final void b(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.i |= !evm.c(this.l, str);
        this.l = str;
    }

    public final String d() {
        this.a.p().c();
        return this.A;
    }

    public final void c(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.i |= !evm.c(this.A, str);
        this.A = str;
    }

    public final String e() {
        this.a.p().c();
        return this.m;
    }

    public final void d(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.m, str);
        this.m = str;
    }

    public final String f() {
        this.a.p().c();
        return this.n;
    }

    public final void e(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.n, str);
        this.n = str;
    }

    public final long g() {
        this.a.p().c();
        return this.p;
    }

    public final void a(long j2) {
        this.a.p().c();
        this.i |= this.p != j2;
        this.p = j2;
    }

    public final long h() {
        this.a.p().c();
        return this.q;
    }

    public final void b(long j2) {
        this.a.p().c();
        this.i |= this.q != j2;
        this.q = j2;
    }

    public final String i() {
        this.a.p().c();
        return this.r;
    }

    public final void f(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.r, str);
        this.r = str;
    }

    public final long j() {
        this.a.p().c();
        return this.s;
    }

    public final void c(long j2) {
        this.a.p().c();
        this.i |= this.s != j2;
        this.s = j2;
    }

    public final String k() {
        this.a.p().c();
        return this.t;
    }

    public final void g(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.t, str);
        this.t = str;
    }

    public final long l() {
        this.a.p().c();
        return this.u;
    }

    public final void d(long j2) {
        this.a.p().c();
        this.i |= this.u != j2;
        this.u = j2;
    }

    public final long m() {
        this.a.p().c();
        return this.v;
    }

    public final void e(long j2) {
        this.a.p().c();
        this.i |= this.v != j2;
        this.v = j2;
    }

    public final boolean n() {
        this.a.p().c();
        return this.w;
    }

    public final void a(boolean z2) {
        this.a.p().c();
        this.i |= this.w != z2;
        this.w = z2;
    }

    public final void f(long j2) {
        boolean z2 = true;
        bwx.b(j2 >= 0);
        this.a.p().c();
        boolean z3 = this.i;
        if (this.o == j2) {
            z2 = false;
        }
        this.i = z2 | z3;
        this.o = j2;
    }

    public final long o() {
        this.a.p().c();
        return this.o;
    }

    public final long p() {
        this.a.p().c();
        return this.B;
    }

    public final void g(long j2) {
        this.a.p().c();
        this.i |= this.B != j2;
        this.B = j2;
    }

    public final long q() {
        this.a.p().c();
        return this.C;
    }

    public final void h(long j2) {
        this.a.p().c();
        this.i |= this.C != j2;
        this.C = j2;
    }

    public final void r() {
        this.a.p().c();
        long j2 = this.o + 1;
        if (j2 > 2147483647L) {
            this.a.q().f.a("Bundle index overflow. appId", eqw.a(this.j));
            j2 = 0;
        }
        this.i = true;
        this.o = j2;
    }

    public final String s() {
        this.a.p().c();
        return this.h;
    }

    public final void h(String str) {
        this.a.p().c();
        this.i |= !evm.c(this.h, str);
        this.h = str;
    }

    public final long t() {
        this.a.p().c();
        return this.x;
    }

    public final void i(long j2) {
        this.a.p().c();
        this.i |= this.x != j2;
        this.x = j2;
    }

    public final boolean u() {
        this.a.p().c();
        return this.y;
    }

    public final void b(boolean z2) {
        this.a.p().c();
        this.i = this.y != z2;
        this.y = z2;
    }

    public final boolean v() {
        this.a.p().c();
        return this.z;
    }

    public final void c(boolean z2) {
        this.a.p().c();
        this.i = this.z != z2;
        this.z = z2;
    }
}
