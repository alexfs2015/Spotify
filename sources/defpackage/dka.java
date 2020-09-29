package defpackage;

/* renamed from: dka reason: default package */
public final class dka extends dkn {
    private static volatile String d;
    private static final Object e = new Object();

    public dka(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 1);
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
