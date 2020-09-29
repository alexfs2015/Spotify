package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: cpy reason: default package */
final /* synthetic */ class cpy implements Runnable {
    private final cpu a;
    private final cqi b;

    cpy(cpu cpu, cqi cqi) {
        this.a = cpu;
        this.b = cqi;
    }

    public final void run() {
        Throwable e;
        cpu cpu = this.a;
        try {
            cpu.a(this.b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            cpu.a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            cpu.a(e);
        } catch (Exception e4) {
            e = e4;
            cpu.a(e);
        }
    }
}
