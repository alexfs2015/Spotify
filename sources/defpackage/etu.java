package defpackage;

/* renamed from: etu reason: default package */
final class etu implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ eqw b;

    etu(eqw eqw, long j) {
        this.b = eqw;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
