package defpackage;

/* renamed from: wql reason: default package */
public abstract class wql<I> extends wpd {
    private final wxw b;
    private final boolean c;

    protected wql() {
        this(true);
    }

    private wql(boolean z) {
        this.b = wxw.a(this, wql.class, "I");
        this.c = true;
    }

    public final void a(wpb wpb, Object obj) {
        boolean z = true;
        try {
            if (this.b.a(obj)) {
                a_(wpb, obj);
            } else {
                z = false;
                wpb.d(obj);
            }
        } finally {
            if (this.c && z) {
                wvn.a(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a_(wpb wpb, I i);
}
