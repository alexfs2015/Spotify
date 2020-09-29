package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: djd reason: default package */
public final class djd extends Thread {
    private static final boolean a = chg.a;
    private final BlockingQueue<dwv<?>> b;
    /* access modifiers changed from: private */
    public final BlockingQueue<dwv<?>> c;
    private final dch d;
    /* access modifiers changed from: private */
    public final cck e;
    private volatile boolean f = false;
    private final dle g;

    public djd(BlockingQueue<dwv<?>> blockingQueue, BlockingQueue<dwv<?>> blockingQueue2, dch dch, cck cck) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = dch;
        this.e = cck;
        this.g = new dle(this);
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        BlockingQueue<dwv<?>> blockingQueue;
        if (a) {
            chg.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                dwv dwv = (dwv) this.b.take();
                dwv.b("cache-queue-take");
                dif a2 = this.d.a(dwv.b);
                if (a2 == null) {
                    dwv.b("cache-miss");
                    if (!this.g.b(dwv)) {
                        blockingQueue = this.c;
                    }
                } else if (a2.a()) {
                    dwv.b("cache-hit-expired");
                    dwv.j = a2;
                    if (!this.g.b(dwv)) {
                        blockingQueue = this.c;
                    }
                } else {
                    dwv.b("cache-hit");
                    ecs a3 = dwv.a(new duu(a2.a, a2.g));
                    dwv.b("cache-hit-parsed");
                    if (a2.f < System.currentTimeMillis()) {
                        dwv.b("cache-hit-refresh-needed");
                        dwv.j = a2;
                        a3.d = true;
                        if (!this.g.b(dwv)) {
                            this.e.a(dwv, a3, new dke(this, dwv));
                        }
                    }
                    this.e.a(dwv, a3);
                }
                blockingQueue.put(dwv);
            } catch (InterruptedException unused) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
