package defpackage;

/* renamed from: cjf reason: default package */
final class cjf implements Runnable {
    private final /* synthetic */ doy a;
    private final /* synthetic */ ecs b;
    private final /* synthetic */ cje c;

    cjf(cje cje, doy doy, ecs ecs) {
        this.c = cje;
        this.a = doy;
        this.b = ecs;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
