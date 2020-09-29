package defpackage;

/* renamed from: djd reason: default package */
public final class djd extends djw {
    private static volatile Long d;
    private static final Object e = new Object();

    public djd(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 44);
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
            this.b.A = d;
        }
    }
}
