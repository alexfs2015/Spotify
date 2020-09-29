package defpackage;

/* renamed from: bux reason: default package */
abstract class bux {
    private final buv a;

    protected bux(buv buv) {
        this.a = buv;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(buw buw) {
        buw.a.lock();
        try {
            if (buw.k == this.a) {
                a();
                buw.a.unlock();
            }
        } finally {
            buw.a.unlock();
        }
    }
}
