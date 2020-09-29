package defpackage;

/* renamed from: cdr reason: default package */
final class cdr implements Runnable {
    private final /* synthetic */ cdq a;

    cdr(cdq cdq) {
        this.a = cdq;
    }

    public final void run() {
        this.a.s_();
    }
}
