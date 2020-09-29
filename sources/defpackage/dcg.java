package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbes;
import java.util.List;

/* renamed from: dcg reason: default package */
final class dcg implements der {
    private final dce a;
    private int b;
    private int c;
    private int d = 0;

    dcg(dce dce) {
        this.a = (dce) dda.a(dce, "input");
        this.a.c = this;
    }

    private final Object a(zzbes zzbes, Class<?> cls, dcn dcn) {
        switch (dch.a[zzbes.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return n();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(p());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(i());
            case 7:
                return Float.valueOf(e());
            case 8:
                return Integer.valueOf(h());
            case 9:
                return Long.valueOf(g());
            case 10:
                a(2);
                return c(dem.a().a(cls), dcn);
            case 11:
                return Integer.valueOf(q());
            case 12:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return m();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void a(int i) {
        if ((this.b & 7) != i) {
            throw zzbbu.f();
        }
    }

    private final void a(List<String> list, boolean z) {
        int a2;
        int a3;
        if ((this.b & 7) != 2) {
            throw zzbbu.f();
        } else if (!(list instanceof ddk) || z) {
            do {
                list.add(z ? m() : l());
                if (!this.a.t()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.b);
            this.d = a2;
        } else {
            ddk ddk = (ddk) list;
            do {
                ddk.a(n());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw zzbbu.g();
        }
    }

    private final <T> T c(des<T> des, dcn dcn) {
        int m = this.a.m();
        if (this.a.a < this.a.b) {
            int c2 = this.a.c(m);
            T a2 = des.a();
            this.a.a++;
            des.a(a2, this, dcn);
            des.c(a2);
            this.a.a(0);
            this.a.a--;
            this.a.d(c2);
            return a2;
        }
        throw new zzbbu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw zzbbu.g();
        }
    }

    private final <T> T d(des<T> des, dcn dcn) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T a2 = des.a();
            des.a(a2, this, dcn);
            des.c(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw zzbbu.g();
        } finally {
            this.c = i;
        }
    }

    private final void d(int i) {
        if (this.a.u() != i) {
            throw zzbbu.a();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.a();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final <T> T a(des<T> des, dcn dcn) {
        a(2);
        return c(des, dcn);
    }

    public final void a(List<Double> list) {
        int a2;
        int a3;
        if (list instanceof dcj) {
            dcj dcj = (dcj) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    dcj.a(this.a.b());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    dcj.a(this.a.b());
                } while (this.a.u() < u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.b()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.u() < u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final <T> void a(List<T> list, des<T> des, dcn dcn) {
        int a2;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(c(des, dcn));
                if (!this.a.t() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.d = a2;
            return;
        }
        throw zzbbu.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (c() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.ads.zzbbu(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void a(java.util.Map<K, V> r8, defpackage.ddt<K, V> r9, defpackage.dcn r10) {
        /*
            r7 = this;
            r0 = 2
            r7.a(r0)
            dce r1 = r7.a
            int r1 = r1.m()
            dce r2 = r7.a
            int r1 = r2.c(r1)
            K r2 = r9.b
            V r3 = r9.d
        L_0x0014:
            int r4 = r7.a()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            dce r5 = r7.a     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.t()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.c()     // Catch:{ zzbbv -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.ads.zzbbu r4 = new com.google.android.gms.internal.ads.zzbbu     // Catch:{ zzbbv -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzbbv -> 0x004e }
            throw r4     // Catch:{ zzbbv -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.ads.zzbes r4 = r9.c     // Catch:{ zzbbv -> 0x004e }
            V r5 = r9.d     // Catch:{ zzbbv -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzbbv -> 0x004e }
            java.lang.Object r3 = r7.a(r4, r5, r10)     // Catch:{ zzbbv -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.ads.zzbes r4 = r9.a     // Catch:{ zzbbv -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.a(r4, r5, r5)     // Catch:{ zzbbv -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.c()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.ads.zzbbu r8 = new com.google.android.gms.internal.ads.zzbbu     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            dce r8 = r7.a
            r8.d(r1)
            return
        L_0x0064:
            r8 = move-exception
            dce r9 = r7.a
            r9.d(r1)
            goto L_0x006c
        L_0x006b:
            throw r8
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcg.a(java.util.Map, ddt, dcn):void");
    }

    public final int b() {
        return this.b;
    }

    public final <T> T b(des<T> des, dcn dcn) {
        a(3);
        return d(des, dcn);
    }

    public final void b(List<Float> list) {
        int a2;
        int a3;
        if (list instanceof dcw) {
            dcw dcw = (dcw) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    dcw.a(this.a.c());
                } while (this.a.u() < u);
            } else if (i == 5) {
                do {
                    dcw.a(this.a.c());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.c()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final <T> void b(List<T> list, des<T> des, dcn dcn) {
        int a2;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(d(des, dcn));
                if (!this.a.t() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.d = a2;
            return;
        }
        throw zzbbu.f();
    }

    public final void c(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ddo.a(this.a.d());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    ddo.a(this.a.d());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.d()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.d()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final boolean c() {
        if (!this.a.t()) {
            int i = this.b;
            if (i != this.c) {
                return this.a.b(i);
            }
        }
        return false;
    }

    public final double d() {
        a(1);
        return this.a.b();
    }

    public final void d(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ddo.a(this.a.e());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    ddo.a(this.a.e());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.e()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final float e() {
        a(5);
        return this.a.c();
    }

    public final void e(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    dcz.c(this.a.f());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    dcz.c(this.a.f());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.f()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.f()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final long f() {
        a(0);
        return this.a.d();
    }

    public final void f(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ddo.a(this.a.g());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    ddo.a(this.a.g());
                } while (this.a.u() < u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.g()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Long.valueOf(this.a.g()));
                } while (this.a.u() < u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final long g() {
        a(0);
        return this.a.e();
    }

    public final void g(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    dcz.c(this.a.h());
                } while (this.a.u() < u);
            } else if (i == 5) {
                do {
                    dcz.c(this.a.h());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.h()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final int h() {
        a(0);
        return this.a.f();
    }

    public final void h(List<Boolean> list) {
        int a2;
        int a3;
        if (list instanceof dbx) {
            dbx dbx = (dbx) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    dbx.a(this.a.i());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    dbx.a(this.a.i());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final long i() {
        a(1);
        return this.a.g();
    }

    public final void i(List<String> list) {
        a(list, false);
    }

    public final int j() {
        a(5);
        return this.a.h();
    }

    public final void j(List<String> list) {
        a(list, true);
    }

    public final void k(List<zzbah> list) {
        int a2;
        if ((this.b & 7) == 2) {
            do {
                list.add(n());
                if (!this.a.t()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.b);
            this.d = a2;
            return;
        }
        throw zzbbu.f();
    }

    public final boolean k() {
        a(0);
        return this.a.i();
    }

    public final String l() {
        a(2);
        return this.a.j();
    }

    public final void l(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    dcz.c(this.a.m());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    dcz.c(this.a.m());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.m()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final String m() {
        a(2);
        return this.a.k();
    }

    public final void m(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    dcz.c(this.a.n());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    dcz.c(this.a.n());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final zzbah n() {
        a(2);
        return this.a.l();
    }

    public final void n(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    dcz.c(this.a.o());
                } while (this.a.u() < u);
            } else if (i == 5) {
                do {
                    dcz.c(this.a.o());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int m2 = this.a.m();
                c(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final int o() {
        a(0);
        return this.a.m();
    }

    public final void o(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ddo.a(this.a.p());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    ddo.a(this.a.p());
                } while (this.a.u() < u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int m2 = this.a.m();
                b(m2);
                int u2 = this.a.u() + m2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.u() < u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final int p() {
        a(0);
        return this.a.n();
    }

    public final void p(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    dcz.c(this.a.q());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    dcz.c(this.a.q());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final int q() {
        a(5);
        return this.a.o();
    }

    public final void q(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ddo.a(this.a.r());
                    if (!this.a.t()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.b);
                this.d = a3;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    ddo.a(this.a.r());
                } while (this.a.u() < u);
                d(u);
            } else {
                throw zzbbu.f();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (!this.a.t()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.b);
                this.d = a2;
            } else if (i2 == 2) {
                int u2 = this.a.u() + this.a.m();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.u() < u2);
                d(u2);
            } else {
                throw zzbbu.f();
            }
        }
    }

    public final long r() {
        a(1);
        return this.a.p();
    }

    public final int s() {
        a(0);
        return this.a.q();
    }

    public final long t() {
        a(0);
        return this.a.r();
    }
}
