package defpackage;

/* renamed from: djq reason: default package */
public final class djq extends djw {
    private final div d;
    private long e;

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            this.b.I = (Long) this.c.invoke(null, new Object[]{Long.valueOf(this.e)});
        }
    }

    public djq(dil dil, String str, String str2, dbr dbr, int i, div div) {
        super(dil, str, str2, dbr, i, 53);
        this.d = div;
        if (div != null) {
            if (div.b == -2 && div.a.get() == null) {
                div.b = -3;
            }
            this.e = div.b;
        }
    }
}
