package defpackage;

/* renamed from: djs reason: default package */
public final class djs extends djw {
    public djs(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dbr dbr;
        Integer valueOf;
        this.b.E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a()})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                dbr = this.b;
                valueOf = Integer.valueOf(1);
            } else {
                dbr = this.b;
                valueOf = Integer.valueOf(0);
            }
            dbr.E = valueOf;
        }
    }
}
