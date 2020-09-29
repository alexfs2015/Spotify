package defpackage;

/* renamed from: dkg reason: default package */
public final class dkg extends dkn {
    public dkg(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 51);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            djb djb = new djb((String) this.c.invoke(null, new Object[0]));
            this.b.G = djb.a;
            this.b.H = djb.b;
        }
    }
}
