package defpackage;

/* renamed from: bug reason: default package */
abstract class bug {
    private final bue a;

    protected bug(bue bue) {
        this.a = bue;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(buf buf) {
        buf.a.lock();
        try {
            if (buf.k == this.a) {
                a();
                buf.a.unlock();
            }
        } finally {
            buf.a.unlock();
        }
    }
}
