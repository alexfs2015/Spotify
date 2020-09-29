package defpackage;

import io.netty.buffer.PoolArena;

/* renamed from: vzf reason: default package */
public final class vzf<T> {
    private static /* synthetic */ boolean s = (!vzf.class.desiredAssertionStatus());
    final PoolArena<T> a;
    public final T b;
    public final boolean c = true;
    public final int d;
    public vzg<T> e;
    vzf<T> f;
    vzf<T> g;
    private final byte[] h;
    private final byte[] i;
    private final vzi<T>[] j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final byte q;
    private int r;

    public vzf(PoolArena<T> poolArena, T t, int i2, int i3, int i4, int i5) {
        this.a = poolArena;
        this.b = t;
        this.l = i2;
        this.m = i4;
        this.n = i3;
        this.d = i5;
        this.q = (byte) (i3 + 1);
        this.o = 31 - Integer.numberOfLeadingZeros(i5);
        this.k = (i2 - 1) ^ -1;
        this.r = i5;
        if (s || i3 < 30) {
            this.p = 1 << i3;
            this.h = new byte[(this.p << 1)];
            this.i = new byte[this.h.length];
            int i6 = 0;
            int i7 = 1;
            while (i6 <= i3) {
                int i8 = 1 << i6;
                int i9 = i7;
                for (int i10 = 0; i10 < i8; i10++) {
                    byte b2 = (byte) i6;
                    this.h[i9] = b2;
                    this.i[i9] = b2;
                    i9++;
                }
                i6++;
                i7 = i9;
            }
            this.j = new vzi[this.p];
            return;
        }
        StringBuilder sb = new StringBuilder("maxOrder should be < 30, but is: ");
        sb.append(i3);
        throw new AssertionError(sb.toString());
    }

    public vzf(PoolArena<T> poolArena, T t, int i2) {
        this.a = poolArena;
        this.b = t;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.q = (byte) (this.n + 1);
        this.d = i2;
        this.o = 31 - Integer.numberOfLeadingZeros(this.d);
        this.p = 0;
    }

    public final int a() {
        int i2 = this.r;
        if (i2 == 0) {
            return 100;
        }
        int i3 = (int) ((((long) i2) * 100) / ((long) this.d));
        if (i3 == 0) {
            return 99;
        }
        return 100 - i3;
    }

    public final long a(int i2) {
        if ((this.k & i2) != 0) {
            return e(i2);
        }
        return f(i2);
    }

    private long e(int i2) {
        int d2 = d(this.n - ((31 - Integer.numberOfLeadingZeros(i2)) - this.m));
        if (d2 < 0) {
            return (long) d2;
        }
        this.r -= g(d2);
        return (long) d2;
    }

    private long f(int i2) {
        vzi c2 = this.a.c(i2);
        synchronized (c2) {
            int d2 = d(this.n);
            if (d2 < 0) {
                long j2 = (long) d2;
                return j2;
            }
            vzi<T>[] vziArr = this.j;
            int i3 = this.l;
            this.r -= i3;
            int i4 = d2 ^ this.p;
            vzi<T> vzi = vziArr[i4];
            if (vzi == null) {
                vzi<T> vzi2 = new vzi<>(c2, this, d2, h(d2), i3, i2);
                vziArr[i4] = vzi2;
                vzi = vzi2;
            } else {
                vzi.a(c2, i2);
            }
            long a2 = vzi.a();
            return a2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j2) {
        int i2 = (int) j2;
        int i3 = (int) (j2 >>> 32);
        if (i3 != 0) {
            vzi<T> vzi = this.j[this.p ^ i2];
            if (s || (vzi != null && vzi.e)) {
                vzi c2 = this.a.c(vzi.f);
                synchronized (c2) {
                    int i4 = i3 & 1073741823;
                    boolean z = true;
                    if (vzi.f != 0) {
                        int i5 = i4 >>> 6;
                        int i6 = i4 & 63;
                        if (!vzi.j) {
                            if (((vzi.b[i5] >>> i6) & 1) == 0) {
                                throw new AssertionError();
                            }
                        }
                        long[] jArr = vzi.b;
                        jArr[i5] = (1 << i6) ^ jArr[i5];
                        vzi.h = i4;
                        int i7 = vzi.i;
                        vzi.i = i7 + 1;
                        if (i7 == 0) {
                            vzi.a(c2);
                        } else if (vzi.i == vzi.g) {
                            if (vzi.c != vzi.d) {
                                vzi.e = false;
                                vzi.b();
                                z = false;
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
        this.r += g(i2);
        this.h[i2] = this.i[i2];
        c(i2);
    }

    public final void b(vzk<T> vzk, long j2, int i2) {
        a(vzk, j2, (int) (j2 >>> 32), i2);
    }

    private void a(vzk<T> vzk, long j2, int i2, int i3) {
        if (s || i2 != 0) {
            int i4 = (int) j2;
            vzi<T> vzi = this.j[this.p ^ i4];
            if (!s && !vzi.e) {
                throw new AssertionError();
            } else if (s || i3 <= vzi.f) {
                vzk.a(this, j2, h(i4) + ((i2 & 1073741823) * vzi.f), i3, vzi.f, this.a.b.c());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    private int g(int i2) {
        return 1 << (this.o - this.i[i2]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(": ");
        sb.append(a());
        sb.append("%, ");
        sb.append(this.d - this.r);
        sb.append('/');
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.a.a(this);
    }

    private void b(int i2) {
        while (i2 > 1) {
            int i3 = i2 >>> 1;
            byte[] bArr = this.h;
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 ^ 1];
            if (b2 < b3) {
                b3 = b2;
            }
            this.h[i3] = b3;
            i2 = i3;
        }
    }

    private void c(int i2) {
        int i3 = this.i[i2] + 1;
        while (i2 > 1) {
            int i4 = i2 >>> 1;
            byte[] bArr = this.h;
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 ^ 1];
            i3--;
            if (b2 == i3 && b3 == i3) {
                bArr[i4] = (byte) (i3 - 1);
            } else {
                if (b2 < b3) {
                    b3 = b2;
                }
                this.h[i4] = b3;
            }
            i2 = i4;
        }
    }

    private int d(int i2) {
        int i3;
        int i4 = 1 << i2;
        int i5 = -i4;
        byte b2 = this.h[1];
        if (b2 > i2) {
            return -1;
        }
        int i6 = 1;
        while (true) {
            if (b2 >= i2) {
                i3 = i6 & i5;
                if (i3 != 0) {
                    break;
                }
            }
            i6 <<= 1;
            byte[] bArr = this.h;
            byte b3 = bArr[i6];
            if (b3 > i2) {
                i6 ^= 1;
                b2 = bArr[i6];
            } else {
                b2 = b3;
            }
        }
        byte b4 = this.h[i6];
        if (s || (b4 == i2 && i3 == i4)) {
            this.h[i6] = this.q;
            b(i6);
            return i6;
        }
        throw new AssertionError(String.format("val = %d, id & initial = %d, d = %d", new Object[]{Byte.valueOf(b4), Integer.valueOf(i3), Integer.valueOf(i2)}));
    }

    public final void a(vzk<T> vzk, long j2, int i2) {
        int i3 = (int) j2;
        int i4 = (int) (j2 >>> 32);
        if (i4 == 0) {
            byte b2 = this.h[i3];
            if (s || b2 == this.q) {
                vzk.a(this, j2, h(i3), i2, g(i3), this.a.b.c());
                return;
            }
            throw new AssertionError(String.valueOf(b2));
        }
        a(vzk, j2, i4, i2);
    }

    private int h(int i2) {
        return ((1 << this.i[i2]) ^ i2) * g(i2);
    }
}
