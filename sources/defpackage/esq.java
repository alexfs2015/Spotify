package defpackage;

/* renamed from: esq reason: default package */
final class esq implements Runnable {
    private final /* synthetic */ ets a;
    private final /* synthetic */ esp b;

    esq(esp esp, ets ets) {
        this.b = esp;
        this.a = ets;
    }

    public final void run() {
        esp.a(this.b, this.a);
        this.b.a();
    }
}
