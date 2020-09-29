package defpackage;

/* renamed from: dtx reason: default package */
final class dtx implements Runnable {
    private final /* synthetic */ dtv a;

    dtx(dtv dtv) {
        this.a = dtv;
    }

    public final void run() {
        if (this.a.h != null) {
            this.a.h.i();
            this.a.h.h();
        }
        this.a.h = null;
    }
}
