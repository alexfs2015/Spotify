package defpackage;

/* renamed from: dki reason: default package */
public final class dki extends dkn {
    private static volatile Long d;
    private static final Object e = new Object();

    public dki(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 33);
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
            this.b.r = d;
        }
    }
}
