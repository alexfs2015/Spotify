package defpackage;

/* renamed from: eau reason: default package */
public final class eau extends cqi<ebd> {
    final eay b;
    private final Object c = new Object();
    private boolean d;

    public eau(eay eay) {
        this.b = eay;
    }

    public final void b() {
        synchronized (this.c) {
            if (!this.d) {
                this.d = true;
                a(new eav(), new cqg());
                a(new eaw(this), new eax(this));
            }
        }
    }
}
