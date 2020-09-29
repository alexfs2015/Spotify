package defpackage;

import java.util.Arrays;

/* renamed from: atf reason: default package */
public final class atf implements ats {
    private int a;
    private int[] b;
    private long[] c;
    private long[] d;
    private long[] e;
    private final long f;

    public atf(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        this.a = iArr.length;
        int i = this.a;
        if (i > 0) {
            this.f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f = 0;
        }
    }

    public final a a(long j) {
        int a2 = ben.a(this.e, j, true, true);
        att att = new att(this.e[a2], this.c[a2]);
        if (att.b >= j || a2 == this.a - 1) {
            return new a(att);
        }
        int i = a2 + 1;
        return new a(att, new att(this.e[i], this.c[i]));
    }

    public final long b() {
        return this.f;
    }

    public final boolean l_() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.b));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.d));
        sb.append(")");
        return sb.toString();
    }
}
