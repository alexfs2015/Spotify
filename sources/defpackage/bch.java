package defpackage;

import java.util.Arrays;

/* renamed from: bch reason: default package */
public final class bch implements bbz {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final bby[] d;
    private int e;
    private int f;
    private int g;
    private bby[] h;

    public bch(boolean z, int i) {
        this(true, 65536, 0);
    }

    private bch(boolean z, int i, int i2) {
        bdl.a(i > 0);
        bdl.a(true);
        this.a = z;
        this.b = i;
        this.g = 0;
        this.h = new bby[100];
        this.c = null;
        this.d = new bby[1];
    }

    public final synchronized bby a() {
        bby bby;
        this.f++;
        if (this.g > 0) {
            bby[] bbyArr = this.h;
            int i = this.g - 1;
            this.g = i;
            bby = bbyArr[i];
            this.h[this.g] = null;
        } else {
            bby = new bby(new byte[this.b], 0);
        }
        return bby;
    }

    public final synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    public final synchronized void a(bby bby) {
        this.d[0] = bby;
        a(this.d);
    }

    public final synchronized void a(bby[] bbyArr) {
        if (this.g + bbyArr.length >= this.h.length) {
            this.h = (bby[]) Arrays.copyOf(this.h, Math.max(this.h.length << 1, this.g + bbyArr.length));
        }
        for (bby bby : bbyArr) {
            if (bby.a != this.c) {
                if (bby.a.length != this.b) {
                    StringBuilder sb = new StringBuilder("Unexpected allocation: ");
                    sb.append(System.identityHashCode(bby.a));
                    sb.append(", ");
                    sb.append(System.identityHashCode(this.c));
                    sb.append(", ");
                    sb.append(bby.a.length);
                    sb.append(", ");
                    sb.append(this.b);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            bby[] bbyArr2 = this.h;
            int i = this.g;
            this.g = i + 1;
            bbyArr2[i] = bby;
        }
        this.f -= bbyArr.length;
        notifyAll();
    }

    public final synchronized void b() {
        int i = 0;
        int max = Math.max(0, ben.a(this.e, this.b) - this.f);
        if (max < this.g) {
            if (this.c != null) {
                int i2 = this.g - 1;
                while (i <= i2) {
                    bby bby = this.h[i];
                    if (bby.a == this.c) {
                        i++;
                    } else {
                        bby bby2 = this.h[i2];
                        if (bby2.a != this.c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.h[i] = bby2;
                            int i4 = i2 - 1;
                            this.h[i2] = bby;
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

    public final int c() {
        return this.b;
    }

    public final synchronized void d() {
        if (this.a) {
            a(0);
        }
    }

    public final synchronized int e() {
        return this.f * this.b;
    }
}
