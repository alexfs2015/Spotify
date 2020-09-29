package defpackage;

/* renamed from: crp reason: default package */
final class crp implements Runnable {
    private final /* synthetic */ crf a;

    crp(crf crf) {
        this.a = crf;
    }

    public final void run() {
        if (this.a.a != null) {
            this.a.a.d();
        }
    }
}
