package defpackage;

import java.util.Arrays;

/* renamed from: bbq reason: default package */
public final class bbq implements bbi {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final bbh[] d;
    private int e;
    private int f;
    private int g;
    private bbh[] h;

    public bbq(boolean z, int i) {
        this(true, 65536, 0);
    }

    private bbq(boolean z, int i, int i2) {
        bcu.a(i > 0);
        bcu.a(true);
        this.a = z;
        this.b = i;
        this.g = 0;
        this.h = new bbh[100];
        this.c = null;
        this.d = new bbh[1];
    }

    public final synchronized void d() {
        if (this.a) {
            a(0);
        }
    }

    public final synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    public final synchronized bbh a() {
        bbh bbh;
        this.f++;
        if (this.g > 0) {
            bbh[] bbhArr = this.h;
            int i = this.g - 1;
            this.g = i;
            bbh = bbhArr[i];
            this.h[this.g] = null;
        } else {
            bbh = new bbh(new byte[this.b], 0);
        }
        return bbh;
    }

    public final synchronized void a(bbh bbh) {
        this.d[0] = bbh;
        a(this.d);
    }

    public final synchronized void a(bbh[] bbhArr) {
        if (this.g + bbhArr.length >= this.h.length) {
            this.h = (bbh[]) Arrays.copyOf(this.h, Math.max(this.h.length << 1, this.g + bbhArr.length));
        }
        for (bbh bbh : bbhArr) {
            if (bbh.a != this.c) {
                if (bbh.a.length != this.b) {
                    StringBuilder sb = new StringBuilder("Unexpected allocation: ");
                    sb.append(System.identityHashCode(bbh.a));
                    sb.append(", ");
                    sb.append(System.identityHashCode(this.c));
                    sb.append(", ");
                    sb.append(bbh.a.length);
                    sb.append(", ");
                    sb.append(this.b);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            bbh[] bbhArr2 = this.h;
            int i = this.g;
            this.g = i + 1;
            bbhArr2[i] = bbh;
        }
        this.f -= bbhArr.length;
        notifyAll();
    }

    public final synchronized void b() {
        int i = 0;
        int max = Math.max(0, bdw.a(this.e, this.b) - this.f);
        if (max < this.g) {
            if (this.c != null) {
                int i2 = this.g - 1;
                while (i <= i2) {
                    bbh bbh = this.h[i];
                    if (bbh.a == this.c) {
                        i++;
                    } else {
                        bbh bbh2 = this.h[i2];
                        if (bbh2.a != this.c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.h[i] = bbh2;
                            int i4 = i2 - 1;
                            this.h[i2] = bbh;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, max, this.g, null);
            this.g = max;
        }
    }

    public final synchronized int e() {
        return this.f * this.b;
    }

    public final int c() {
        return this.b;
    }
}
