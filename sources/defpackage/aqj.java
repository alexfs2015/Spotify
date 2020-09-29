package defpackage;

import android.util.Pair;

/* renamed from: aqj reason: default package */
final class aqj {
    final a a = new a();
    final b b = new b();
    aqu c = aqu.a;
    int d;
    boolean e;
    aqh f;
    aqh g;
    aqh h;
    int i;
    Object j;
    private long k;
    private long l;

    public final boolean a(axo axo) {
        aqh aqh = this.h;
        return aqh != null && aqh.a == axo;
    }

    public final void a(long j2) {
        aqh aqh = this.h;
        if (aqh != null) {
            aqh.b(j2);
        }
    }

    public final aqh a() {
        return b() ? this.f : this.h;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final aqh c() {
        aqh aqh = this.f;
        if (aqh != null) {
            if (aqh == this.g) {
                this.g = aqh.g;
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
            aqh aqh2 = this.h;
            this.f = aqh2;
            this.g = aqh2;
        }
        return this.f;
    }

    public final boolean a(aqh aqh) {
        boolean z = false;
        bcu.b(aqh != null);
        this.h = aqh;
        while (aqh.g != null) {
            aqh = aqh.g;
            if (aqh == this.g) {
                this.g = this.f;
                z = true;
            }
            aqh.c();
            this.i--;
        }
        this.h.g = null;
        return z;
    }

    public final void a(boolean z) {
        aqh a2 = a();
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

    public final aqi a(aqi aqi) {
        long j2;
        boolean a2 = a(aqi.a);
        boolean a3 = a(aqi.a, a2);
        this.c.a(aqi.a.a, this.a);
        if (aqi.a.a()) {
            j2 = this.a.c(aqi.a.b, aqi.a.c);
        } else if (aqi.a.e == Long.MIN_VALUE) {
            j2 = this.a.d;
        } else {
            j2 = aqi.a.e;
        }
        aqi aqi2 = new aqi(aqi.a, aqi.b, aqi.c, j2, a2, a3);
        return aqi2;
    }

    public final a a(Object obj, long j2) {
        return a(obj, j2, a(obj));
    }

    private a a(Object obj, long j2, long j3) {
        long j4;
        this.c.a(obj, this.a);
        int a2 = this.a.a(j2);
        if (a2 == -1) {
            int b2 = this.a.b(j2);
            if (b2 == -1) {
                j4 = Long.MIN_VALUE;
            } else {
                j4 = this.a.a(b2);
            }
            a aVar = new a(obj, j3, j4);
            return aVar;
        }
        a aVar2 = new a(obj, a2, this.a.b(a2), j3);
        return aVar2;
    }

    private long a(Object obj) {
        int i2 = this.c.a(obj, this.a).c;
        Object obj2 = this.j;
        if (obj2 != null) {
            int a2 = this.c.a(obj2);
            if (a2 != -1 && this.c.a(a2, this.a, false).c == i2) {
                return this.l;
            }
        }
        for (aqh a3 = a(); a3 != null; a3 = a3.g) {
            if (a3.b.equals(obj)) {
                return a3.f.a.d;
            }
        }
        for (aqh a4 = a(); a4 != null; a4 = a4.g) {
            int a5 = this.c.a(a4.b);
            if (a5 != -1 && this.c.a(a5, this.a, false).c == i2) {
                return a4.f.a.d;
            }
        }
        long j2 = this.k;
        this.k = 1 + j2;
        return j2;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        aqh a2 = a();
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
        if (!a42 || !b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public aqi a(aqh aqh, long j2) {
        long j3;
        Object obj;
        long j4;
        aqh aqh2 = aqh;
        aqi aqi = aqh2.f;
        if (aqi.e) {
            int a2 = this.c.a(this.c.a(aqi.a.a), this.a, this.b, this.d, this.e);
            if (a2 == -1) {
                return null;
            }
            int i2 = this.c.a(a2, this.a, true).c;
            Object obj2 = this.a.b;
            long j5 = aqi.a.d;
            long j6 = 0;
            if (this.c.a(i2, this.b, false).f == a2) {
                long j7 = (aqh2.j + aqi.d) - j2;
                aqu aqu = this.c;
                Pair a3 = aqu.a(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j7));
                if (a3 == null) {
                    return null;
                }
                Object obj3 = a3.first;
                long longValue = ((Long) a3.second).longValue();
                if (aqh2.g == null || !aqh2.g.b.equals(obj3)) {
                    j4 = this.k;
                    this.k = 1 + j4;
                } else {
                    j4 = aqh2.g.f.a.d;
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
        a aVar = aqi.a;
        this.c.a(aVar.a, this.a);
        if (aVar.a()) {
            int i3 = aVar.b;
            int d2 = this.a.d(i3);
            if (d2 == -1) {
                return null;
            }
            int a4 = this.a.a(i3, aVar.c);
            if (a4 >= d2) {
                return b(aVar.a, aqi.c, aVar.d);
            } else if (!this.a.b(i3, a4)) {
                return null;
            } else {
                return a(aVar.a, i3, a4, aqi.c, aVar.d);
            }
        } else if (aqi.a.e != Long.MIN_VALUE) {
            int a5 = this.a.a(aqi.a.e);
            if (a5 == -1) {
                return b(aVar.a, aqi.a.e, aVar.d);
            }
            int b2 = this.a.b(a5);
            if (!this.a.b(a5, b2)) {
                return null;
            }
            return a(aVar.a, a5, b2, aqi.a.e, aVar.d);
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

    /* access modifiers changed from: 0000 */
    public aqi a(a aVar, long j2, long j3) {
        this.c.a(aVar.a, this.a);
        if (!aVar.a()) {
            return b(aVar.a, j3, aVar.d);
        } else if (!this.a.b(aVar.b, aVar.c)) {
            return null;
        } else {
            return a(aVar.a, aVar.b, aVar.c, j2, aVar.d);
        }
    }

    private aqi a(Object obj, int i2, int i3, long j2, long j3) {
        a aVar = new a(obj, i2, i3, j3);
        boolean a2 = a(aVar);
        boolean a3 = a(aVar, a2);
        long c2 = this.c.a(aVar.a, this.a).c(aVar.b, aVar.c);
        if (i3 == this.a.b(i2)) {
            a aVar2 = this.a;
        }
        aqi aqi = new aqi(aVar, 0, j2, c2, a2, a3);
        return aqi;
    }

    private aqi b(Object obj, long j2, long j3) {
        long j4;
        long j5;
        int b2 = this.a.b(j2);
        if (b2 == -1) {
            j4 = Long.MIN_VALUE;
        } else {
            j4 = this.a.a(b2);
        }
        a aVar = new a(obj, j3, j4);
        this.c.a(aVar.a, this.a);
        boolean a2 = a(aVar);
        boolean a3 = a(aVar, a2);
        if (j4 == Long.MIN_VALUE) {
            j5 = this.a.d;
        } else {
            j5 = j4;
        }
        aqi aqi = new aqi(aVar, j2, -9223372036854775807L, j5, a2, a3);
        return aqi;
    }

    private boolean a(a aVar) {
        int i2 = this.c.a(aVar.a, this.a).f.b;
        if (i2 == 0) {
            return true;
        }
        int i3 = i2 - 1;
        boolean a2 = aVar.a();
        if (this.a.a(i3) == Long.MIN_VALUE) {
            int d2 = this.a.d(i3);
            if (d2 == -1) {
                return false;
            }
            if ((a2 && aVar.b == i3 && aVar.c == d2 + -1) || (!a2 && this.a.b(i3) == d2)) {
                return true;
            }
            return false;
        } else if (a2 || aVar.e != Long.MIN_VALUE) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(a aVar, boolean z) {
        int a2 = this.c.a(aVar.a);
        if (this.c.a(this.c.a(a2, this.a, false).c, this.b, false).e || !this.c.b(a2, this.a, this.b, this.d, this.e) || !z) {
            return false;
        }
        return true;
    }
}
