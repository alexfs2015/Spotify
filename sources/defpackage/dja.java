package defpackage;

/* renamed from: dja reason: default package */
public final class dja extends djw {
    private static volatile String d;
    private static final Object e = new Object();

    public dja(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 29);
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
            this.b.o = dgy.a(d.getBytes(), true);
        }
    }
}
