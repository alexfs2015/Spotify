package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: koc reason: default package */
public class koc implements koe {
    private static final xfo a = xfp.a(koc.class);
    private final ExecutorService b;

    public koc(ExecutorService executorService) {
        this.b = executorService;
    }

    public final void a(Runnable runnable) {
        this.b.submit(runnable);
    }

    public void dispose() {
        try {
            List shutdownNow = this.b.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                a.c("Disposing ExecutorServiceWorkRunner with {} outstanding tasks.", (Object) Integer.valueOf(shutdownNow.size()));
            }
            if (!this.b.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                a.e("ExecutorService shutdown timed out; there are still tasks executing");
            }
        } catch (InterruptedException e) {
            a.e("Timeout when disposing work runner", e);
        }
    }
}
