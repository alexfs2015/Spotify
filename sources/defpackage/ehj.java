package defpackage;

/* renamed from: ehj reason: default package */
final class ehj implements Runnable {
    private final /* synthetic */ ehb a;
    private final /* synthetic */ egu b;

    ehj(ehb ehb, egu egu) {
        this.a = ehb;
        this.b = egu;
    }

    public final void run() {
        ehb.a(this.a, this.b);
    }
}
