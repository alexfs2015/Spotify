package defpackage;

/* renamed from: djo reason: default package */
public final class djo extends djw {
    private final StackTraceElement[] d;

    public djo(dil dil, String str, String str2, dbr dbr, int i, StackTraceElement[] stackTraceElementArr) {
        super(dil, str, str2, dbr, i, 45);
        this.d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            int i = 1;
            dij dij = new dij((String) this.c.invoke(null, new Object[]{this.d}));
            synchronized (this.b) {
                this.b.B = dij.a;
                if (dij.b.booleanValue()) {
                    dbr dbr = this.b;
                    if (dij.c.booleanValue()) {
                        i = 0;
                    }
                    dbr.J = Integer.valueOf(i);
                }
            }
        }
    }
}
