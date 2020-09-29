package defpackage;

/* renamed from: djr reason: default package */
public final class djr extends dkn {
    private static volatile String d;
    private static final Object e = new Object();

    public djr(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 29);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.o = "E";
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (String) this.c.invoke(null, new Object[]{this.a.a()});
                }
            }
        }
        synchronized (this.b) {
            this.b.o = dhp.a(d.getBytes(), true);
        }
    }
}
