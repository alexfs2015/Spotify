package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: cqe reason: default package */
final /* synthetic */ class cqe implements Runnable {
    private final cqt a;
    private final cqi b;

    cqe(cqt cqt, cqi cqi) {
        this.a = cqt;
        this.b = cqi;
    }

    public final void run() {
        Throwable e;
        cqt cqt = this.a;
        try {
            cqt.b(this.b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            cqt.a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            cqt.a(e);
        } catch (Exception e4) {
            cqt.a(e4);
        }
    }
}
