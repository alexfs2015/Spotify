package defpackage;

/* renamed from: dkd reason: default package */
public final class dkd extends dkn {
    private final boolean d;

    public dkd(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 61);
        this.d = djc.l;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.c.invoke(null, new Object[]{this.a.a(), Boolean.valueOf(this.d)})).longValue();
        synchronized (this.b) {
            this.b.P = Long.valueOf(longValue);
        }
    }
}
