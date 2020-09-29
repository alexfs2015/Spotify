package defpackage;

/* renamed from: ebt reason: default package */
final /* synthetic */ class ebt implements Runnable {
    private final ebs a;
    private final eam b;

    ebt(ebs ebs, eam eam) {
        this.a = ebs;
        this.b = eam;
    }

    public final void run() {
        ebs ebs = this.a;
        eam eam = this.b;
        ebs.a.b.a(eam);
        eam.a();
    }
}
