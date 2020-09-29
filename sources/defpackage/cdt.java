package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cdt reason: default package */
final class cdt implements Runnable {
    private final /* synthetic */ AtomicInteger a;
    private final /* synthetic */ int b;
    private final /* synthetic */ cqc c;
    private final /* synthetic */ List d;

    cdt(AtomicInteger atomicInteger, int i, cqc cqc, List list) {
        this.a = atomicInteger;
        this.b = i;
        this.c = cqc;
        this.d = list;
    }

    public final void run() {
        if (this.a.incrementAndGet() >= this.b) {
            try {
                this.c.b(cdm.a(this.d));
            } catch (InterruptedException | ExecutionException unused) {
                cow.a(5);
            }
        }
    }
}
