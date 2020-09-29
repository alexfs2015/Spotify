package defpackage;

/* renamed from: ebl reason: default package */
public final class ebl extends cqz<ebu> {
    final ebp b;
    private final Object c = new Object();
    private boolean d;

    public ebl(ebp ebp) {
        this.b = ebp;
    }

    public final void b() {
        synchronized (this.c) {
            if (!this.d) {
                this.d = true;
                a(new ebm(), new cqx());
                a(new ebn(this), new ebo(this));
            }
        }
    }
}
