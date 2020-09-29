package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: cpn reason: default package */
final /* synthetic */ class cpn implements Runnable {
    private final cqc a;
    private final cpr b;

    cpn(cqc cqc, cpr cpr) {
        this.a = cqc;
        this.b = cpr;
    }

    public final void run() {
        Throwable e;
        cqc cqc = this.a;
        try {
            cqc.b(this.b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            cqc.a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            cqc.a(e);
        } catch (Exception e4) {
            cqc.a(e4);
        }
    }
}
