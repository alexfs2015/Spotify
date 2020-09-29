package defpackage;

/* renamed from: auc reason: default package */
public final class auc {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final aqe f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final aud[] k;

    public auc(int i2, int i3, long j2, long j3, long j4, aqe aqe, int i4, aud[] audArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = aqe;
        this.g = i4;
        this.k = audArr;
        this.j = i5;
        this.h = jArr;
        this.i = jArr2;
    }

    public final aud a(int i2) {
        aud[] audArr = this.k;
        if (audArr == null) {
            return null;
        }
        return audArr[i2];
    }
}
