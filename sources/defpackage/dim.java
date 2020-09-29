package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: dim reason: default package */
public final class dim extends Thread {
    private static final boolean a = cgp.a;
    private final BlockingQueue<dwe<?>> b;
    /* access modifiers changed from: private */
    public final BlockingQueue<dwe<?>> c;
    private final dbq d;
    /* access modifiers changed from: private */
    public final cbt e;
    private volatile boolean f = false;
    private final dkn g;

    public dim(BlockingQueue<dwe<?>> blockingQueue, BlockingQueue<dwe<?>> blockingQueue2, dbq dbq, cbt cbt) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = dbq;
        this.e = cbt;
        this.g = new dkn(this);
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        BlockingQueue<dwe<?>> blockingQueue;
        if (a) {
            cgp.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                dwe dwe = (dwe) this.b.take();
                dwe.b("cache-queue-take");
                dho a2 = this.d.a(dwe.b);
                if (a2 == null) {
                    dwe.b("cache-miss");
                    if (!this.g.b(dwe)) {
                        blockingQueue = this.c;
                    }
                } else if (a2.a()) {
                    dwe.b("cache-hit-expired");
                    dwe.j = a2;
                    if (!this.g.b(dwe)) {
                        blockingQueue = this.c;
                    }
                } else {
                    dwe.b("cache-hit");
                    ecb a3 = dwe.a(new dud(a2.a, a2.g));
                    dwe.b("cache-hit-parsed");
                    if (a2.f < System.currentTimeMillis()) {
                        dwe.b("cache-hit-refresh-needed");
                        dwe.j = a2;
                        a3.d = true;
                        if (!this.g.b(dwe)) {
                            this.e.a(dwe, a3, new djn(this, dwe));
                        }
                    }
                    this.e.a(dwe, a3);
                }
                blockingQueue.put(dwe);
            } catch (InterruptedException unused) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
