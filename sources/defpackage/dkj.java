package defpackage;

/* renamed from: dkj reason: default package */
public final class dkj extends dkn {
    public dkj(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dci dci;
        Integer valueOf;
        this.b.E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a()})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                dci = this.b;
                valueOf = Integer.valueOf(1);
            } else {
                dci = this.b;
                valueOf = Integer.valueOf(0);
            }
            dci.E = valueOf;
        }
    }
}
