package defpackage;

/* renamed from: cdp reason: default package */
final class cdp implements Runnable {
    private final /* synthetic */ cqc a;
    private final /* synthetic */ String b;
    private final /* synthetic */ cdm c;

    cdp(cdm cdm, cqc cqc, String str) {
        this.c = cdm;
        this.a = cqc;
        this.b = str;
    }

    public final void run() {
        this.a.b((dwk) this.c.b.M().get(this.b));
    }
}
