package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: axy reason: default package */
public final class axy {
    public static final axy a = new axy(new long[0]);
    public final int b = 0;
    public final long[] c;
    public final a[] d;
    public final long e;
    private long f;

    /* renamed from: axy$a */
    public static final class a {
        public final int a;
        public final int[] b;
        public final long[] c;
        private Uri[] d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            bcu.a(true);
            this.a = -1;
            this.b = iArr;
            this.d = uriArr;
            this.c = jArr;
        }

        public final int a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.b;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        public final boolean a() {
            return this.a == -1 || a(-1) < this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a == aVar.a && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.b, aVar.b) && Arrays.equals(this.c, aVar.c);
            }
        }

        public final int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
        }
    }

    private axy(long... jArr) {
        this.c = Arrays.copyOf(jArr, 0);
        this.d = new a[0];
        this.e = 0;
        this.f = -9223372036854775807L;
    }

    public final int a(long j) {
        int length = this.c.length - 1;
        while (length >= 0 && a(j, length)) {
            length--;
        }
        if (length < 0 || !this.d[length].a()) {
            return -1;
        }
        return length;
    }

    public final int b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.c;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.d[i].a())) {
                i++;
            }
        }
        if (i < this.c.length) {
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axy axy = (axy) obj;
            return this.b == axy.b && Arrays.equals(this.c, axy.c) && Arrays.equals(this.d, axy.d);
        }
    }

    public final int hashCode() {
        return (((((this.b * 31 * 31) + 1) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    private boolean a(long j, int i) {
        long j2 = this.c[i];
        return j2 == Long.MIN_VALUE || j < j2;
    }
}
