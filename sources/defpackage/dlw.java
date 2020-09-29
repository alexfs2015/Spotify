package defpackage;

/* renamed from: dlw reason: default package */
final class dlw implements Runnable {
    private final /* synthetic */ dlv a;

    dlw(dlv dlv) {
        this.a = dlv;
    }

    public final void run() {
        synchronized (this.a.e) {
            if (!this.a.f || !this.a.g) {
                cow.a(3);
            } else {
                this.a.f = false;
                cow.a(3);
                for (dlx a2 : this.a.h) {
                    try {
                        a2.a(false);
                    } catch (Exception e) {
                        cow.a("", e);
                    }
                }
            }
        }
    }
}
