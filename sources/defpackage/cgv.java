package defpackage;

/* renamed from: cgv reason: default package */
final class cgv implements Runnable {
    private final /* synthetic */ cgq a;

    cgv(cgq cgq) {
        this.a = cgq;
    }

    public final void run() {
        if (this.a.m != null) {
            this.a.m.b();
            this.a.m = null;
        }
    }
}
