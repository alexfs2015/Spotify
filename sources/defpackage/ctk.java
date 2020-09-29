package defpackage;

/* renamed from: ctk reason: default package */
final /* synthetic */ class ctk implements Runnable {
    private final ctj a;

    ctk(ctj ctj) {
        this.a = ctj;
    }

    public final void run() {
        ctj ctj = this.a;
        ctj.a.I();
        bhk t = ctj.a.t();
        if (t != null) {
            t.m();
        }
        if (ctj.d != null) {
            ctj.d.a();
            ctj.d = null;
        }
    }
}
