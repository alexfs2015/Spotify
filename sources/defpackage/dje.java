package defpackage;

/* renamed from: dje reason: default package */
public final class dje extends djw {
    private long d;

    public dje(dil dil, String str, String str2, dbr dbr, long j, int i) {
        super(dil, str, str2, dbr, i, 25);
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
