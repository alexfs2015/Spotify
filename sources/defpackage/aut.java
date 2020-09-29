package defpackage;

/* renamed from: aut reason: default package */
public final class aut {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final aqv f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final auu[] k;

    public aut(int i2, int i3, long j2, long j3, long j4, aqv aqv, int i4, auu[] auuArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = aqv;
        this.g = i4;
        this.k = auuArr;
        this.j = i5;
        this.h = jArr;
        this.i = jArr2;
    }

    public final auu a(int i2) {
        auu[] auuArr = this.k;
        if (auuArr == null) {
            return null;
        }
        return auuArr[i2];
    }
}
