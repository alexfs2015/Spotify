package defpackage;

/* renamed from: cgr reason: default package */
final class cgr implements Runnable {
    private final /* synthetic */ cla a;
    private final /* synthetic */ cgq b;

    cgr(cgq cgq, cla cla) {
        this.b = cgq;
        this.a = cla;
    }

    public final void run() {
        this.b.h.a(this.a);
        if (this.b.m != null) {
            this.b.m.b();
            this.b.m = null;
        }
    }
}
