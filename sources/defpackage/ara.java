package defpackage;

import android.util.Pair;

/* renamed from: ara reason: default package */
final class ara {
    final a a = new a();
    final b b = new b();
    arl c = arl.a;
    int d;
    boolean e;
    aqy f;
    aqy g;
    aqy h;
    int i;
    Object j;
    private long k;
    private long l;

    private long a(Object obj) {
        int i2 = this.c.a(obj, this.a).c;
        Object obj2 = this.j;
        if (obj2 != null) {
            int a2 = this.c.a(obj2);
            if (a2 != -1 && this.c.a(a2, this.a, false).c == i2) {
                return this.l;
            }
        }
        for (aqy a3 = a(); a3 != null; a3 = a3.g) {
            if (a3.b.equals(obj)) {
                return a3.f.a.d;
            }
        }
        for (aqy a4 = a(); a4 != null; a4 = a4.g) {
            int a5 = this.c.a(a4.b);
            if (a5 != -1 && this.c.a(a5, this.a, false).c == i2) {
                return a4.f.a.d;
            }
        }
        long j2 = this.k;
        this.k = 1 + j2;
        return j2;
    }

    private aqz a(Object obj, int i2, int i3, long j2, long j3) {
        a aVar = new a(obj, i2, i3, j3);
        boolean a2 = a(aVar);
        boolean a3 = a(aVar, a2);
        long c2 = this.c.a(aVar.a, this.a).c(aVar.b, aVar.c);
        if (i3 == this.a.b(i2)) {
            a aVar2 = this.a;
        }
        aqz aqz = new aqz(aVar, 0, j2, c2, a2, a3);
        return aqz;
    }

    private a a(Object obj, long j2, long j3) {
        this.c.a(obj, this.a);
        int a2 = this.a.a(j2);
        if (a2 == -1) {
            int b2 = this.a.b(j2);
            a aVar = new a(obj, j3, b2 == -1 ? Long.MIN_VALUE : this.a.a(b2));
            return aVar;
        }
        a aVar2 = new a(obj, a2, this.a.b(a2), j3);
        return aVar2;
    }

    private boolean a(a aVar) {
        int i2 = this.c.a(aVar.a, this.a).f.b;
        if (i2 == 0) {
            return true;
        }
        int i3 = i2 - 1;
        boolean a2 = aVar.a();
        if (this.a.a(i3) != Long.MIN_VALUE) {
            return !a2 && aVar.e == Long.MIN_VALUE;
        }
        int d2 = this.a.d(i3);
        if (d2 == -1) {
            return false;
        }
        return (a2 && aVar.b == i3 && aVar.c == d2 + -1) || (!a2 && this.a.b(i3) == d2);
    }

    private boolean a(a aVar, boolean z) {
        int a2 = this.c.a(aVar.a);
        return !this.c.a(this.c.a(a2, this.a, false).c, this.b, false).e && this.c.b(a2, this.a, this.b, this.d, this.e) && z;
    }

    private aqz b(Object obj, long j2, long j3) {
        int b2 = this.a.b(j2);
        long a2 = b2 == -1 ? Long.MIN_VALUE : this.a.a(b2);
        a aVar = new a(obj, j3, a2);
        this.c.a(aVar.a, this.a);
        boolean a3 = a(aVar);
        aqz aqz = new aqz(aVar, j2, -9223372036854775807L, a2 == Long.MIN_VALUE ? this.a.d : a2, a3, a(aVar, a3));
        return aqz;
    }

    public final aqy a() {
        return b() ? this.f : this.h;
    }

    /* access modifiers changed from: 0000 */
    public aqz a(aqy aqy, long j2) {
        long j3;
        Object obj;
        long j4;
        aqy aqy2 = aqy;
        aqz aqz = aqy2.f;
        if (aqz.e) {
            int a2 = this.c.a(this.c.a(aqz.a.a), this.a, this.b, this.d, this.e);
            if (a2 == -1) {
                return null;
            }
            int i2 = this.c.a(a2, this.a, true).c;
            Object obj2 = this.a.b;
            long j5 = aqz.a.d;
            long j6 = 0;
            if (this.c.a(i2, this.b, false).f == a2) {
                long j7 = (aqy2.j + aqz.d) - j2;
                arl arl = this.c;
                Pair a3 = arl.a(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j7));
                if (a3 == null) {
                    return null;
                }
                Object obj3 = a3.first;
                long longValue = ((Long) a3.second).longValue();
                if (aqy2.g == null || !aqy2.g.b.equals(obj3)) {
                    j4 = this.k;
                    this.k = 1 + j4;
                } else {
                    j4 = aqy2.g.f.a.d;
                }
                j6 = longValue;
                j3 = j4;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j5;
            }
            long j8 = j6;
            return a(a(obj, j8, j3), j8, j6);
        }
        a aVar = aqz.a;
        this.c.a(aVar.a, this.a);
        if (aVar.a()) {
            int i3 = aVar.b;
            int d2 = this.a.d(i3);
            if (d2 == -1) {
                return null;
            }
            int a4 = this.a.a(i3, aVar.c);
            if (a4 >= d2) {
                return b(aVar.a, aqz.c, aVar.d);
            } else if (!this.a.b(i3, a4)) {
                return null;
            } else {
                return a(aVar.a, i3, a4, aqz.c, aVar.d);
            }
        } else if (aqz.a.e != Long.MIN_VALUE) {
            int a5 = this.a.a(aqz.a.e);
            if (a5 == -1) {
                return b(aVar.a, aqz.a.e, aVar.d);
            }
            int b2 = this.a.b(a5);
            if (!this.a.b(a5, b2)) {
                return null;
            }
            return a(aVar.a, a5, b2, aqz.a.e, aVar.d);
        } else {
            int i4 = this.a.f.b;
            if (i4 == 0) {
                return null;
            }
            int i5 = i4 - 1;
            if (this.a.a(i5) != Long.MIN_VALUE || this.a.c(i5)) {
                return null;
            }
            int b3 = this.a.b(i5);
            if (!this.a.b(i5, b3)) {
                return null;
            }
            long j9 = this.a.d;
            return a(aVar.a, i5, b3, j9, aVar.d);
        }
    }

    public final aqz a(aqz aqz) {
        boolean a2 = a(aqz.a);
        boolean a3 = a(aqz.a, a2);
        this.c.a(aqz.a.a, this.a);
        long j2 = aqz.a.a() ? this.a.c(aqz.a.b, aqz.a.c) : aqz.a.e == Long.MIN_VALUE ? this.a.d : aqz.a.e;
        aqz aqz2 = new aqz(aqz.a, aqz.b, aqz.c, j2, a2, a3);
        return aqz2;
    }

    /* access modifiers changed from: 0000 */
    public aqz a(a aVar, long j2, long j3) {
        this.c.a(aVar.a, this.a);
        if (!aVar.a()) {
            return b(aVar.a, j3, aVar.d);
        } else if (!this.a.b(aVar.b, aVar.c)) {
            return null;
        } else {
            return a(aVar.a, aVar.b, aVar.c, j2, aVar.d);
        }
    }

    public final a a(Object obj, long j2) {
        return a(obj, j2, a(obj));
    }

    public final void a(long j2) {
        aqy aqy = this.h;
        if (aqy != null) {
            aqy.b(j2);
        }
    }

    public final void a(boolean z) {
        aqy a2 = a();
        if (a2 != null) {
            this.j = z ? a2.b : null;
            this.l = a2.f.a.d;
            a2.c();
            a(a2);
        } else if (!z) {
            this.j = null;
        }
        this.f = null;
        this.h = null;
        this.g = null;
        this.i = 0;
    }

    public final boolean a(aqy aqy) {
        boolean z = false;
        bdl.b(aqy != null);
        this.h = aqy;
        while (aqy.g != null) {
            aqy = aqy.g;
            if (aqy == this.g) {
                this.g = this.f;
                z = true;
            }
            aqy.c();
            this.i--;
        }
        this.h.g = null;
        return z;
    }

    public final boolean a(ayf ayf) {
        aqy aqy = this.h;
        return aqy != null && aqy.a == ayf;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final aqy c() {
        aqy aqy = this.f;
        if (aqy != null) {
            if (aqy == this.g) {
                this.g = aqy.g;
            }
            this.f.c();
            this.i--;
            if (this.i == 0) {
                this.h = null;
                this.j = this.f.b;
                this.l = this.f.f.a.d;
            }
            this.f = this.f.g;
        } else {
            aqy aqy2 = this.h;
            this.f = aqy2;
            this.g = aqy2;
        }
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        aqy a2 = a();
        if (a2 == null) {
            return true;
        }
        int a3 = this.c.a(a2.b);
        while (true) {
            a3 = this.c.a(a3, this.a, this.b, this.d, this.e);
            while (a2.g != null && !a2.f.e) {
                a2 = a2.g;
            }
            if (a3 == -1 || a2.g == null || this.c.a(a2.g.b) != a3) {
                boolean a4 = a(a2);
                a2.f = a(a2.f);
            } else {
                a2 = a2.g;
            }
        }
        boolean a42 = a(a2);
        a2.f = a(a2.f);
        return !a42 || !b();
    }
}
