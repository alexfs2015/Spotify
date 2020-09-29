package defpackage;

/* renamed from: dkb reason: default package */
public final class dkb extends dkn {
    public dkb(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            diq diq = new diq((String) this.c.invoke(null, new Object[]{this.a.a()}));
            synchronized (this.b) {
                this.b.c = Long.valueOf(diq.a);
                this.b.O = Long.valueOf(diq.b);
            }
        }
    }
}
