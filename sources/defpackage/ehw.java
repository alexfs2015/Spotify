package defpackage;

/* renamed from: ehw reason: default package */
final class ehw implements Runnable {
    private final /* synthetic */ ehs a;
    private final /* synthetic */ eib b;

    ehw(ehs ehs, eib eib) {
        this.a = ehs;
        this.b = eib;
    }

    public final void run() {
        ehs.a(this.a, this.b);
    }
}
