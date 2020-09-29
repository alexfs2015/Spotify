package defpackage;

/* renamed from: djh reason: default package */
public final class djh extends djw {
    private static volatile Long d;
    private static final Object e = new Object();

    public djh(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 22);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.l = d;
        }
    }
}
