package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: cqa reason: default package */
final /* synthetic */ class cqa implements Runnable {
    private final cqt a;
    private final cps b;
    private final cqi c;

    cqa(cqt cqt, cps cps, cqi cqi) {
        this.a = cqt;
        this.b = cps;
        this.c = cqi;
    }

    public final void run() {
        cqt cqt = this.a;
        cps cps = this.b;
        cqi cqi = this.c;
        if (!cqt.isCancelled()) {
            try {
                cpx.a(cps.a(cqi.get()), cqt);
            } catch (CancellationException unused) {
                cqt.cancel(true);
            } catch (ExecutionException e) {
                cqt.a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                cqt.a(e2);
            } catch (Exception e3) {
                cqt.a(e3);
            }
        }
    }
}
