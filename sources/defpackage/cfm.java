package defpackage;

/* renamed from: cfm reason: default package */
final class cfm implements Runnable {
    private final /* synthetic */ cpo a;
    private final /* synthetic */ String b;

    cfm(cpo cpo, String str) {
        this.a = cpo;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
