package defpackage;

import java.util.Arrays;

/* renamed from: bej reason: default package */
public final class bej<V> {
    private long[] a;
    private V[] b;
    private int c;
    private int d;

    public bej() {
        this(10);
    }

    private bej(int i) {
        this.a = new long[10];
        this.b = (Object[]) new Object[10];
    }

    public final synchronized V a(long j) {
        V v;
        v = null;
        while (this.d > 0 && j - this.a[this.c] >= 0) {
            v = this.b[this.c];
            this.b[this.c] = null;
            this.c = (this.c + 1) % this.b.length;
            this.d--;
        }
        return v;
    }

    public final synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, null);
    }

    public final synchronized void a(long j, V v) {
        if (this.d > 0) {
            if (j <= this.a[((this.c + this.d) - 1) % this.b.length]) {
                a();
            }
        }
        int length = this.b.length;
        if (this.d >= length) {
            int i = length << 1;
            long[] jArr = new long[i];
            V[] vArr = (Object[]) new Object[i];
            int i2 = length - this.c;
            System.arraycopy(this.a, this.c, jArr, 0, i2);
            System.arraycopy(this.b, this.c, vArr, 0, i2);
            if (this.c > 0) {
                System.arraycopy(this.a, 0, jArr, i2, this.c);
                System.arraycopy(this.b, 0, vArr, i2, this.c);
            }
            this.a = jArr;
            this.b = vArr;
            this.c = 0;
        }
        int length2 = (this.c + this.d) % this.b.length;
        this.a[length2] = j;
        this.b[length2] = v;
        this.d++;
    }
}
