package defpackage;

/* renamed from: djc reason: default package */
public final class djc extends djw {
    public djc(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dbr dbr = this.b;
        Long valueOf = Long.valueOf(-1);
        dbr.d = valueOf;
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
