package defpackage;

/* renamed from: djv reason: default package */
public final class djv extends dkn {
    private long d;

    public djv(djc djc, String str, String str2, dci dci, long j, int i) {
        super(djc, str, str2, dci, i, 25);
        this.d = j;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.c.invoke(null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.W = Long.valueOf(longValue);
            if (this.d != 0) {
                this.b.j = Long.valueOf(longValue - this.d);
                this.b.m = Long.valueOf(this.d);
            }
        }
    }
}
