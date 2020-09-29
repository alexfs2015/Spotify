package defpackage;

import android.text.TextUtils;

/* renamed from: ewg reason: default package */
final class ewg {
    private String A;
    private long B;
    private long C;
    final esp a;
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

    ewg(esp esp, String str) {
        bxo.a(esp);
        bxo.a(str);
        this.a = esp;
        this.j = str;
        this.a.p().c();
    }

    public final String a() {
        this.a.p().c();
        return this.j;
    }

    public final void a(long j2) {
        this.a.p().c();
        this.i |= this.p != j2;
        this.p = j2;
    }

    public final void a(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.k, str);
        this.k = str;
    }

    public final void a(boolean z2) {
        this.a.p().c();
        this.i |= this.w != z2;
        this.w = z2;
    }

    public final String b() {
        this.a.p().c();
        return this.k;
    }

    public final void b(long j2) {
        this.a.p().c();
        this.i |= this.q != j2;
        this.q = j2;
    }

    public final void b(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.i |= !ewd.c(this.l, str);
        this.l = str;
    }

    public final void b(boolean z2) {
        this.a.p().c();
        this.i = this.y != z2;
        this.y = z2;
    }

    public final String c() {
        this.a.p().c();
        return this.l;
    }

    public final void c(long j2) {
        this.a.p().c();
        this.i |= this.s != j2;
        this.s = j2;
    }

    public final void c(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.i |= !ewd.c(this.A, str);
        this.A = str;
    }

    public final void c(boolean z2) {
        this.a.p().c();
        this.i = this.z != z2;
        this.z = z2;
    }

    public final String d() {
        this.a.p().c();
        return this.A;
    }

    public final void d(long j2) {
        this.a.p().c();
        this.i |= this.u != j2;
        this.u = j2;
    }

    public final void d(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.m, str);
        this.m = str;
    }

    public final String e() {
        this.a.p().c();
        return this.m;
    }

    public final void e(long j2) {
        this.a.p().c();
        this.i |= this.v != j2;
        this.v = j2;
    }

    public final void e(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.n, str);
        this.n = str;
    }

    public final String f() {
        this.a.p().c();
        return this.n;
    }

    public final void f(long j2) {
        boolean z2 = true;
        bxo.b(j2 >= 0);
        this.a.p().c();
        boolean z3 = this.i;
        if (this.o == j2) {
            z2 = false;
        }
        this.i = z2 | z3;
        this.o = j2;
    }

    public final void f(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.r, str);
        this.r = str;
    }

    public final long g() {
        this.a.p().c();
        return this.p;
    }

    public final void g(long j2) {
        this.a.p().c();
        this.i |= this.B != j2;
        this.B = j2;
    }

    public final void g(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.t, str);
        this.t = str;
    }

    public final long h() {
        this.a.p().c();
        return this.q;
    }

    public final void h(long j2) {
        this.a.p().c();
        this.i |= this.C != j2;
        this.C = j2;
    }

    public final void h(String str) {
        this.a.p().c();
        this.i |= !ewd.c(this.h, str);
        this.h = str;
    }

    public final String i() {
        this.a.p().c();
        return this.r;
    }

    public final void i(long j2) {
        this.a.p().c();
        this.i |= this.x != j2;
        this.x = j2;
    }

    public final long j() {
        this.a.p().c();
        return this.s;
    }

    public final String k() {
        this.a.p().c();
        return this.t;
    }

    public final long l() {
        this.a.p().c();
        return this.u;
    }

    public final long m() {
        this.a.p().c();
        return this.v;
    }

    public final boolean n() {
        this.a.p().c();
        return this.w;
    }

    public final long o() {
        this.a.p().c();
        return this.o;
    }

    public final long p() {
        this.a.p().c();
        return this.B;
    }

    public final long q() {
        this.a.p().c();
        return this.C;
    }

    public final void r() {
        this.a.p().c();
        long j2 = this.o + 1;
        if (j2 > 2147483647L) {
            this.a.q().f.a("Bundle index overflow. appId", ern.a(this.j));
            j2 = 0;
        }
        this.i = true;
        this.o = j2;
    }

    public final String s() {
        this.a.p().c();
        return this.h;
    }

    public final long t() {
        this.a.p().c();
        return this.x;
    }

    public final boolean u() {
        this.a.p().c();
        return this.y;
    }

    public final boolean v() {
        this.a.p().c();
        return this.z;
    }
}
