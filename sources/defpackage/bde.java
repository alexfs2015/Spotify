package defpackage;

import java.util.Arrays;

/* renamed from: bde reason: default package */
public final class bde {
    public int a;
    private long[] b;

    public bde() {
        this(32);
    }

    private bde(int i) {
        this.b = new long[32];
    }

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder sb = new StringBuilder("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final long[] a() {
        return Arrays.copyOf(this.b, this.a);
    }
}
