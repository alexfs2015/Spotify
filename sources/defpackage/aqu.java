package defpackage;

import android.util.Pair;

/* renamed from: aqu reason: default package */
public abstract class aqu {
    public static final aqu a = new aqu() {
        public final int a(Object obj) {
            return -1;
        }

        public final int b() {
            return 0;
        }

        public final int d() {
            return 0;
        }

        public final b a(int i, b bVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        public final a a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        public final Object a(int i) {
            throw new IndexOutOfBoundsException();
        }
    };

    /* renamed from: aqu$a */
    public static final class a {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public axy f;

        public final long a(int i) {
            return this.f.c[i];
        }

        public final int b(int i) {
            return this.f.d[i].a(-1);
        }

        public final int a(int i, int i2) {
            return this.f.d[i].a(i2);
        }

        public final boolean c(int i) {
            return !this.f.d[i].a();
        }

        public final int a(long j) {
            return this.f.a(j);
        }

        public final int b(long j) {
            return this.f.b(j);
        }

        public final int d(int i) {
            return this.f.d[i].a;
        }

        public final boolean b(int i, int i2) {
            defpackage.axy.a aVar = this.f.d[i];
            return (aVar.a == -1 || aVar.b[i2] == 0) ? false : true;
        }

        public final long c(int i, int i2) {
            defpackage.axy.a aVar = this.f.d[i];
            if (aVar.a != -1) {
                return aVar.c[i2];
            }
            return -9223372036854775807L;
        }
    }

    /* renamed from: aqu$b */
    public static final class b {
        public Object a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
    }

    public abstract int a(Object obj);

    public abstract a a(int i, a aVar, boolean z);

    public abstract b a(int i, b bVar, boolean z, long j);

    public abstract Object a(int i);

    public abstract int b();

    public abstract int d();

    public final boolean a() {
        return b() == 0;
    }

    private int a(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == e() ? c() : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == e()) {
            return -1;
        } else {
            return i + 1;
        }
    }

    private int e() {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public final int c() {
        return a() ? -1 : 0;
    }

    public final b a(int i, b bVar, boolean z) {
        return a(i, bVar, false, 0);
    }

    public final boolean b(int i, a aVar, b bVar, int i2, boolean z) {
        return a(i, aVar, bVar, i2, z) == -1;
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i, long j) {
        return a(bVar, aVar, i, j, 0);
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i, long j, long j2) {
        bcu.a(i, 0, b());
        a(i, bVar, false, j2);
        if (j == -9223372036854775807L) {
            j = bVar.h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = bVar.f;
        long j3 = bVar.j + j;
        long j4 = a(i2, aVar, true).d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < bVar.g) {
            j3 -= j4;
            i2++;
            j4 = a(i2, aVar, true).d;
        }
        return Pair.create(aVar.b, Long.valueOf(j3));
    }

    public final a a(Object obj, a aVar) {
        return a(a(obj), aVar, true);
    }

    public final int a(int i, a aVar, b bVar, int i2, boolean z) {
        int i3 = a(i, aVar, false).c;
        if (a(i3, bVar, false).g != i) {
            return i + 1;
        }
        int a2 = a(i3, i2, z);
        if (a2 == -1) {
            return -1;
        }
        return a(a2, bVar, false).f;
    }
}
