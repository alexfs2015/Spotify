package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: woi reason: default package */
public class woi extends wpb {
    static woi a;
    private static final long c = TimeUnit.SECONDS.toMillis(60);
    private static final long d = TimeUnit.MILLISECONDS.toNanos(c);
    private boolean e;
    private woi f;
    private long g;

    /* renamed from: woi$a */
    static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<woi> r0 = defpackage.woi.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                woi r1 = defpackage.woi.e()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                woi r2 = defpackage.woi.a     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                defpackage.woi.a = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.a()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.woi.a.run():void");
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void bh_() {
        if (!this.e) {
            long bj_ = bj_();
            boolean bl_ = bl_();
            if (bj_ != 0 || bl_) {
                this.e = true;
                a(this, bj_, bl_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    private static synchronized void a(woi woi, long j, boolean z) {
        Class<woi> cls = woi.class;
        synchronized (cls) {
            if (a == null) {
                a = new woi();
                new a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                woi.g = Math.min(j, woi.c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                woi.g = j + nanoTime;
            } else if (z) {
                woi.g = woi.c();
            } else {
                throw new AssertionError();
            }
            long j2 = woi.g - nanoTime;
            woi woi2 = a;
            while (true) {
                if (woi2.f == null) {
                    break;
                } else if (j2 < woi2.f.g - nanoTime) {
                    break;
                } else {
                    woi2 = woi2.f;
                }
            }
            woi.f = woi2.f;
            woi2.f = woi;
            if (woi2 == a) {
                cls.notify();
            }
        }
    }

    public final boolean bi_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    private static synchronized boolean a(woi woi) {
        synchronized (woi.class) {
            for (woi woi2 = a; woi2 != null; woi2 = woi2.f) {
                if (woi2.f == woi) {
                    woi2.f = woi.f;
                    woi.f = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (bi_() && z) {
            throw a((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    public final IOException b(IOException iOException) {
        if (!bi_()) {
            return iOException;
        }
        return a(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static woi e() {
        Class<woi> cls = woi.class;
        woi woi = a.f;
        if (woi == null) {
            long nanoTime = System.nanoTime();
            cls.wait(c);
            if (a.f != null || System.nanoTime() - nanoTime < d) {
                return null;
            }
            return a;
        }
        long nanoTime2 = woi.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        a.f = woi.f;
        woi.f = null;
        return woi;
    }
}
