package defpackage;

/* renamed from: cmx reason: default package */
final /* synthetic */ class cmx implements Runnable {
    private final cmw a;

    cmx(cmw cmw) {
        this.a = cmw;
    }

    public final void run() {
        cmw cmw = this.a;
        cmw.f = 4;
        cmw.a();
    }
}
