package defpackage;

/* renamed from: etr reason: default package */
final class etr implements Runnable {
    private final /* synthetic */ eto a;
    private final /* synthetic */ etp b;

    etr(etp etp, eto eto) {
        this.b = etp;
        this.a = eto;
    }

    public final void run() {
        etp.a(this.b, this.a, false);
        etp etp = this.b;
        etp.a = null;
        etp.g().a((eto) null);
    }
}
