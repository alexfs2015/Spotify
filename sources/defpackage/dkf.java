package defpackage;

/* renamed from: dkf reason: default package */
public final class dkf extends dkn {
    private final StackTraceElement[] d;

    public dkf(djc djc, String str, String str2, dci dci, int i, StackTraceElement[] stackTraceElementArr) {
        super(djc, str, str2, dci, i, 45);
        this.d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            int i = 1;
            dja dja = new dja((String) this.c.invoke(null, new Object[]{this.d}));
            synchronized (this.b) {
                this.b.B = dja.a;
                if (dja.b.booleanValue()) {
                    dci dci = this.b;
                    if (dja.c.booleanValue()) {
                        i = 0;
                    }
                    dci.J = Integer.valueOf(i);
                }
            }
        }
    }
}
