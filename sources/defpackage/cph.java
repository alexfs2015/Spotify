package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: cph reason: default package */
final /* synthetic */ class cph implements Runnable {
    private final cpd a;
    private final cpr b;

    cph(cpd cpd, cpr cpr) {
        this.a = cpd;
        this.b = cpr;
    }

    public final void run() {
        Throwable e;
        cpd cpd = this.a;
        try {
            cpd.a(this.b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            cpd.a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            cpd.a(e);
        } catch (Exception e4) {
            e = e4;
            cpd.a(e);
        }
    }
}
