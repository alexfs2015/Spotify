package defpackage;

/* renamed from: dkh reason: default package */
public final class dkh extends dkn {
    private final djm d;
    private long e;

    public dkh(djc djc, String str, String str2, dci dci, int i, djm djm) {
        super(djc, str, str2, dci, i, 53);
        this.d = djm;
        if (djm != null) {
            if (djm.b == -2 && djm.a.get() == null) {
                djm.b = -3;
            }
            this.e = djm.b;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            this.b.I = (Long) this.c.invoke(null, new Object[]{Long.valueOf(this.e)});
        }
    }
}
