package defpackage;

/* renamed from: djp reason: default package */
public final class djp extends djw {
    public djp(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 51);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            dik dik = new dik((String) this.c.invoke(null, new Object[0]));
            this.b.G = dik.a;
            this.b.H = dik.b;
        }
    }
}
