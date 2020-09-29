package defpackage;

import java.util.Arrays;

/* renamed from: fdj reason: default package */
public class fdj<K> {
    transient Object[] a;
    transient int[] b;
    public transient int c;
    public transient int d;
    private transient int[] e;
    private transient long[] f;
    private transient float g;
    private transient int h;

    /* renamed from: fdj$a */
    class a extends com.google.common.collect.Multisets.a<K> {
        private K a;
        private int b;

        a(int i) {
            this.a = fdj.this.a[i];
            this.b = i;
        }

        public final int a() {
            int i = this.b;
            if (i == -1 || i >= fdj.this.c || !fbn.a(this.a, fdj.this.a[this.b])) {
                this.b = fdj.this.a((Object) this.a);
            }
            if (this.b == -1) {
                return 0;
            }
            return fdj.this.b[this.b];
        }

        public final K b() {
            return this.a;
        }
    }

    public fdj() {
        a(3, 1.0f);
    }

    public fdj(int i) {
        this(i, 1.0f);
    }

    fdj(int i, float f2) {
        a(i, f2);
    }

    public fdj(fdj<? extends K> fdj) {
        a(fdj.c, 1.0f);
        int a2 = fdj.a();
        while (a2 != -1) {
            a((K) fdj.b(a2), fdj.c(a2));
            a2 = fdj.a(a2);
        }
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    private static int[] i(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void j(int i) {
        int length = this.f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                f(max);
            }
        }
    }

    private void k(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.g)) + 1;
        int[] i3 = i(i);
        long[] jArr = this.f;
        int length = i3.length - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & length;
            int i7 = i3[i6];
            i3[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.h = i2;
        this.e = i3;
    }

    public int a() {
        return this.c == 0 ? -1 : 0;
    }

    public int a(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public final int a(Object obj) {
        int a2 = fdc.a(obj);
        int[] iArr = this.e;
        int i = iArr[(iArr.length - 1) & a2];
        while (i != -1) {
            long j = this.f[i];
            if (((int) (j >>> 32)) == a2 && fbn.a(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int a(K k, int i) {
        fcl.b(i, "count");
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int a2 = fdc.a((Object) k);
        int[] iArr2 = this.e;
        int length = (iArr2.length - 1) & a2;
        int i2 = this.c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) != a2 || !fbn.a(k, objArr[i3])) {
                    int i4 = (int) j;
                    if (i4 == -1) {
                        jArr[i3] = a(j, i2);
                        break;
                    }
                    i3 = i4;
                } else {
                    int i5 = iArr[i3];
                    iArr[i3] = i;
                    return i5;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            j(i6);
            a(i2, k, i, a2);
            this.c = i6;
            if (i2 >= this.h) {
                k(this.e.length * 2);
            }
            this.d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, float f2) {
        boolean z = false;
        fbp.a(i >= 0, (Object) "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z = true;
        }
        fbp.a(z, (Object) "Illegal load factor");
        int a2 = fdc.a(i, (double) f2);
        this.e = i(a2);
        this.g = f2;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f = jArr;
        this.h = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, K k, int i2, int i3) {
        this.f[i] = (((long) i3) << 32) | 4294967295L;
        this.a[i] = k;
        this.b[i] = i2;
    }

    public final int b(Object obj) {
        int a2 = a(obj);
        if (a2 == -1) {
            return 0;
        }
        return this.b[a2];
    }

    public int b(Object obj, int i) {
        int[] iArr = this.e;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f[i2] >>> 32)) != i || !fbn.a(obj, this.a[i2])) {
                int i4 = (int) this.f[i2];
                if (i4 == -1) {
                    return 0;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                int i6 = this.b[i2];
                if (i3 == -1) {
                    this.e[length] = (int) this.f[i2];
                } else {
                    long[] jArr = this.f;
                    jArr[i3] = a(jArr[i3], (int) jArr[i2]);
                }
                h(i2);
                this.c--;
                this.d++;
                return i6;
            }
        }
    }

    public final K b(int i) {
        fbp.a(i, this.c, "index");
        return this.a[i];
    }

    public void b() {
        this.d++;
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        this.c = 0;
    }

    public final void b(int i, int i2) {
        fbp.a(i, this.c, "index");
        this.b[i] = i2;
    }

    public final int c(int i) {
        fbp.a(i, this.c, "index");
        return this.b[i];
    }

    public final defpackage.fdh.a<K> d(int i) {
        fbp.a(i, this.c, "index");
        return new a(i);
    }

    public final void e(int i) {
        if (i > this.f.length) {
            f(i);
        }
        if (i >= this.h) {
            k(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* access modifiers changed from: 0000 */
    public void f(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f = copyOf;
    }

    public final int g(int i) {
        return b(this.a[i], (int) (this.f[i] >>> 32));
    }

    /* access modifiers changed from: 0000 */
    public void h(int i) {
        int i2 = this.c - 1;
        if (i < i2) {
            Object[] objArr = this.a;
            objArr[i] = objArr[i2];
            int[] iArr = this.b;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.f;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int i3 = (int) (j >>> 32);
            int[] iArr2 = this.e;
            int length = i3 & (iArr2.length - 1);
            int i4 = iArr2[length];
            if (i4 == i2) {
                iArr2[length] = i;
            } else {
                while (true) {
                    long[] jArr2 = this.f;
                    long j2 = jArr2[i4];
                    int i5 = (int) j2;
                    if (i5 == i2) {
                        jArr2[i4] = a(j2, i);
                        return;
                    }
                    i4 = i5;
                }
            }
        } else {
            this.a[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
        }
    }
}
