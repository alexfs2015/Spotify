package defpackage;

/* renamed from: djk reason: default package */
public final class djk extends djw {
    public djk(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            dhz dhz = new dhz((String) this.c.invoke(null, new Object[]{this.a.a()}));
            synchronized (this.b) {
                this.b.c = Long.valueOf(dhz.a);
                this.b.O = Long.valueOf(dhz.b);
            }
        }
    }
}
