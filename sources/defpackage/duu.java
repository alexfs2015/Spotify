package defpackage;

/* renamed from: duu reason: default package */
final class duu implements Runnable {
    private final /* synthetic */ duh a;
    private final /* synthetic */ dut b;

    duu(dut dut, duh duh) {
        this.b = dut;
        this.a = duh;
    }

    public final void run() {
        dut.a(this.b, this.a);
    }
}
