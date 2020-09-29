package defpackage;

/* renamed from: cmh reason: default package */
final class cmh implements Runnable {
    private final /* synthetic */ cmg a;

    cmh(cmg cmg) {
        this.a = cmg;
    }

    public final void run() {
        this.a.j = Thread.currentThread();
        this.a.a();
    }
}
