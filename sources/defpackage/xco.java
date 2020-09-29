package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: xco reason: default package */
public class xco extends xdh {
    static xco a;
    private static final long c = TimeUnit.SECONDS.toMillis(60);
    private static final long d = TimeUnit.MILLISECONDS.toNanos(c);
    private boolean e;
    private xco f;
    private long g;

    /* renamed from: xco$a */
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
                java.lang.Class<xco> r0 = defpackage.xco.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                xco r1 = defpackage.xco.e()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                xco r2 = defpackage.xco.a     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                defpackage.xco.a = r1     // Catch:{ all -> 0x0019 }
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xco.a.run():void");
        }
    }

    private static synchronized void a(xco xco, long j, boolean z) {
        Class<xco> cls = xco.class;
        synchronized (cls) {
            if (a == null) {
                a = new xco();
                new a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                xco.g = Math.min(j, xco.c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                xco.g = j + nanoTime;
            } else if (z) {
                xco.g = xco.c();
            } else {
                throw new AssertionError();
            }
            long j2 = xco.g - nanoTime;
            xco xco2 = a;
            while (true) {
                if (xco2.f == null) {
                    break;
                } else if (j2 < xco2.f.g - nanoTime) {
                    break;
                } else {
                    xco2 = xco2.f;
                }
            }
            xco.f = xco2.f;
            xco2.f = xco;
            if (xco2 == a) {
                cls.notify();
            }
        }
    }

    private static synchronized boolean a(xco xco) {
        synchronized (xco.class) {
            for (xco xco2 = a; xco2 != null; xco2 = xco2.f) {
                if (xco2.f == xco) {
                    xco2.f = xco.f;
                    xco.f = null;
                    return false;
                }
            }
            return true;
        }
    }

    static xco e() {
        Class<xco> cls = xco.class;
        xco xco = a.f;
        if (xco == null) {
            long nanoTime = System.nanoTime();
            cls.wait(c);
            if (a.f != null || System.nanoTime() - nanoTime < d) {
                return null;
            }
            return a;
        }
        long nanoTime2 = xco.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        a.f = xco.f;
        xco.f = null;
        return xco;
    }

    /* access modifiers changed from: protected */
    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (bg_() && z) {
            throw a((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    public final IOException b(IOException iOException) {
        return !bg_() ? iOException : a(iOException);
    }

    public final void bf_() {
        if (!this.e) {
            long bh_ = bh_();
            boolean bj_ = bj_();
            if (bh_ != 0 || bj_) {
                this.e = true;
                a(this, bh_, bj_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean bg_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }
}
