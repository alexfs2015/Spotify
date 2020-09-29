package defpackage;

/* renamed from: djt reason: default package */
public final class djt extends dkn {
    public djt(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dci dci = this.b;
        Long valueOf = Long.valueOf(-1);
        dci.d = valueOf;
        this.b.e = valueOf;
        int[] iArr = (int[]) this.c.invoke(null, new Object[]{this.a.a()});
        synchronized (this.b) {
            this.b.d = Long.valueOf((long) iArr[0]);
            this.b.e = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.b.N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
