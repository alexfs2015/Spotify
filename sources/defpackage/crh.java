package defpackage;

/* renamed from: crh reason: default package */
final class crh implements Runnable {
    private final /* synthetic */ crf a;

    crh(crf crf) {
        this.a = crf;
    }

    public final void run() {
        if (this.a.a != null) {
            this.a.a.b();
        }
    }
}
