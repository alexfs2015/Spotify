package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cek reason: default package */
final class cek implements Runnable {
    private final /* synthetic */ AtomicInteger a;
    private final /* synthetic */ int b;
    private final /* synthetic */ cqt c;
    private final /* synthetic */ List d;

    cek(AtomicInteger atomicInteger, int i, cqt cqt, List list) {
        this.a = atomicInteger;
        this.b = i;
        this.c = cqt;
        this.d = list;
    }

    public final void run() {
        if (this.a.incrementAndGet() >= this.b) {
            try {
                this.c.b(ced.a(this.d));
            } catch (InterruptedException | ExecutionException unused) {
                cpn.a(5);
            }
        }
    }
}
