package defpackage;

/* renamed from: bdq reason: default package */
public final class bdq {
    private boolean a;

    public final synchronized boolean a() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized void c() {
        while (!this.a) {
            wait();
        }
    }
}
