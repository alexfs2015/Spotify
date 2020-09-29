package defpackage;

/* renamed from: dmn reason: default package */
final class dmn implements Runnable {
    private final /* synthetic */ dmm a;

    dmn(dmm dmm) {
        this.a = dmm;
    }

    public final void run() {
        synchronized (this.a.e) {
            if (!this.a.f || !this.a.g) {
                cpn.a(3);
            } else {
                this.a.f = false;
                cpn.a(3);
                for (dmo a2 : this.a.h) {
                    try {
                        a2.a(false);
                    } catch (Exception e) {
                        cpn.a("", e);
                    }
                }
            }
        }
    }
}
