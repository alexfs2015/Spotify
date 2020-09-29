package defpackage;

/* renamed from: duq reason: default package */
final class duq implements Runnable {
    private final /* synthetic */ dup a;

    duq(dup dup) {
        this.a = dup;
    }

    public final void run() {
        if (this.a.q != null) {
            this.a.q.i();
            this.a.q.h();
            this.a.q.k();
        }
        this.a.q = null;
    }
}
