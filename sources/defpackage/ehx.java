package defpackage;

/* renamed from: ehx reason: default package */
final class ehx implements Runnable {
    private final /* synthetic */ ehs a;
    private final /* synthetic */ int b;

    ehx(ehs ehs, int i) {
        this.a = ehs;
        this.b = i;
    }

    public final void run() {
        this.a.p.a(this.b);
    }
}
