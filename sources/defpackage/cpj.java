package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: cpj reason: default package */
final /* synthetic */ class cpj implements Runnable {
    private final cqc a;
    private final cpb b;
    private final cpr c;

    cpj(cqc cqc, cpb cpb, cpr cpr) {
        this.a = cqc;
        this.b = cpb;
        this.c = cpr;
    }

    public final void run() {
        cqc cqc = this.a;
        cpb cpb = this.b;
        cpr cpr = this.c;
        if (!cqc.isCancelled()) {
            try {
                cpg.a(cpb.a(cpr.get()), cqc);
            } catch (CancellationException unused) {
                cqc.cancel(true);
            } catch (ExecutionException e) {
                cqc.a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                cqc.a(e2);
            } catch (Exception e3) {
                cqc.a(e3);
            }
        }
    }
}
