package defpackage;

/* renamed from: djm reason: default package */
public final class djm extends djw {
    private final boolean d;

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.c.invoke(null, new Object[]{this.a.a(), Boolean.valueOf(this.d)})).longValue();
        synchronized (this.b) {
            this.b.P = Long.valueOf(longValue);
        }
    }

    public djm(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 61);
        this.d = dil.l;
    }
}
