package defpackage;

/* renamed from: djj reason: default package */
public final class djj extends djw {
    private static volatile String d;
    private static final Object e = new Object();

    public djj(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 1);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.a = "E";
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (String) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.a = d;
        }
    }
}