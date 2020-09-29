package defpackage;

/* renamed from: bjr reason: default package */
final /* synthetic */ class bjr implements Runnable {
    private final bjb a;

    private bjr(bjb bjb) {
        this.a = bjb;
    }

    static Runnable a(bjb bjb) {
        return new bjr(bjb);
    }

    public final void run() {
        this.a.c();
    }
}
