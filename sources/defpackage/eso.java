package defpackage;

import java.util.concurrent.BlockingQueue;

/* renamed from: eso reason: default package */
final class eso extends Thread {
    private final Object a = new Object();
    private final BlockingQueue<esn<?>> b;
    private final /* synthetic */ esl c;

    public eso(esl esl, String str, BlockingQueue<esn<?>> blockingQueue) {
        this.c = esl;
        bxo.a(str);
        bxo.a(blockingQueue);
        this.b = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.c.q().f.a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        r0 = r5.c.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.c.h.release();
        r5.c.g.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (r5 != r5.c.a) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        r5.c.a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        if (r5 != r5.c.b) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        r5.c.b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        r5.c.q().c.a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            esl r1 = r5.c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.h     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.a(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x00b4 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x00b4 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<esn<?>> r1 = r5.b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00b4 }
            esn r1 = (defpackage.esn) r1     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.a     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x00b4 }
            r1.run()     // Catch:{ all -> 0x00b4 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.a     // Catch:{ all -> 0x00b4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.BlockingQueue<esn<?>> r2 = r5.b     // Catch:{ all -> 0x00b1 }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0053
            esl r2 = r5.c     // Catch:{ all -> 0x00b1 }
            boolean r2 = r2.i     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.a     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.a(r2)     // Catch:{ all -> 0x00b1 }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x00b1 }
            esl r1 = r5.c     // Catch:{ all -> 0x00b4 }
            java.lang.Object r1 = r1.g     // Catch:{ all -> 0x00b4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.BlockingQueue<esn<?>> r2 = r5.b     // Catch:{ all -> 0x00ae }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x00ae }
            if (r2 != 0) goto L_0x00ab
            monitor-exit(r1)     // Catch:{ all -> 0x00ae }
            esl r0 = r5.c
            java.lang.Object r0 = r0.g
            monitor-enter(r0)
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.Semaphore r1 = r1.h     // Catch:{ all -> 0x00a8 }
            r1.release()     // Catch:{ all -> 0x00a8 }
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r1.g     // Catch:{ all -> 0x00a8 }
            r1.notifyAll()     // Catch:{ all -> 0x00a8 }
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            eso r1 = r1.a     // Catch:{ all -> 0x00a8 }
            if (r5 != r1) goto L_0x008b
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            r1.a = null     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x008b:
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            eso r1 = r1.b     // Catch:{ all -> 0x00a8 }
            if (r5 != r1) goto L_0x0099
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            r1.b = null     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x0099:
            esl r1 = r5.c     // Catch:{ all -> 0x00a8 }
            ern r1 = r1.q()     // Catch:{ all -> 0x00a8 }
            erp r1 = r1.c     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r1.a(r2)     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        L_0x00ab:
            monitor-exit(r1)     // Catch:{ all -> 0x00ae }
            goto L_0x001b
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            esl r1 = r5.c
            java.lang.Object r1 = r1.g
            monitor-enter(r1)
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            java.util.concurrent.Semaphore r2 = r2.h     // Catch:{ all -> 0x00f9 }
            r2.release()     // Catch:{ all -> 0x00f9 }
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            java.lang.Object r2 = r2.g     // Catch:{ all -> 0x00f9 }
            r2.notifyAll()     // Catch:{ all -> 0x00f9 }
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            eso r2 = r2.a     // Catch:{ all -> 0x00f9 }
            if (r5 == r2) goto L_0x00f2
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            eso r2 = r2.b     // Catch:{ all -> 0x00f9 }
            if (r5 != r2) goto L_0x00e4
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            r2.b = null     // Catch:{ all -> 0x00f9 }
            goto L_0x00f7
        L_0x00e4:
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            ern r2 = r2.q()     // Catch:{ all -> 0x00f9 }
            erp r2 = r2.c     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r2.a(r3)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f7
        L_0x00f2:
            esl r2 = r5.c     // Catch:{ all -> 0x00f9 }
            r2.a = null     // Catch:{ all -> 0x00f9 }
        L_0x00f7:
            monitor-exit(r1)     // Catch:{ all -> 0x00f9 }
            throw r0
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f9 }
            goto L_0x00fd
        L_0x00fc:
            throw r0
        L_0x00fd:
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eso.run():void");
    }
}
