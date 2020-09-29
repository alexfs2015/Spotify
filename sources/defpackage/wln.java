package defpackage;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wln reason: default package */
public final class wln {
    static final Executor a;
    static final /* synthetic */ boolean g = (!wln.class.desiredAssertionStatus());
    final int b;
    final Runnable c;
    final Deque<wmt> d;
    final wmu e;
    boolean f;
    private final long h;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), wmk.a("OkHttp ConnectionPool", true));
        a = threadPoolExecutor;
    }

    public wln() {
        this(5, 5, TimeUnit.MINUTES);
    }

    private wln(int i, long j, TimeUnit timeUnit) {
        this.c = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    wln r0 = defpackage.wln.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.a(r1)
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    wln r2 = defpackage.wln.this
                    monitor-enter(r2)
                    wln r3 = defpackage.wln.this     // Catch:{ InterruptedException -> 0x002b }
                    int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                    r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                    goto L_0x002b
                L_0x0029:
                    r0 = move-exception
                    goto L_0x002d
                L_0x002b:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0000
                L_0x002d:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0030
                L_0x002f:
                    throw r0
                L_0x0030:
                    goto L_0x002f
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wln.AnonymousClass1.run():void");
            }
        };
        this.d = new ArrayDeque();
        this.e = new wmu();
        this.b = 5;
        this.h = timeUnit.toNanos(5);
    }

    /* access modifiers changed from: 0000 */
    public final Socket a(wlf wlf, wmw wmw) {
        if (g || Thread.holdsLock(this)) {
            for (wmt wmt : this.d) {
                if (wmt.a(wlf, null) && wmt.a() && wmt != wmw.b()) {
                    if (!wmw.g && !Thread.holdsLock(wmw.b)) {
                        throw new AssertionError();
                    } else if (wmw.f == null && wmw.e.j.size() == 1) {
                        Reference reference = (Reference) wmw.e.j.get(0);
                        Socket a2 = wmw.a(true, false, false);
                        wmw.e = wmt;
                        wmt.j.add(reference);
                        return a2;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final long a(long j) {
        int size;
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            wmt wmt = null;
            int i = 0;
            int i2 = 0;
            for (wmt wmt2 : this.d) {
                List<Reference<wmw>> list = wmt2.j;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference reference = (Reference) list.get(i3);
                    if (reference.get() != null) {
                        i3++;
                    } else {
                        a aVar = (a) reference;
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(wmt2.a.a.a);
                        sb.append(" was leaked. Did you forget to close a response body?");
                        wob.c().a(sb.toString(), aVar.a);
                        list.remove(i3);
                        wmt2.h = true;
                        if (list.isEmpty()) {
                            wmt2.k = j - this.h;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - wmt2.k;
                    if (j3 > j2) {
                        wmt = wmt2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.h) {
                if (i <= this.b) {
                    if (i > 0) {
                        long j4 = this.h - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.h;
                        return j5;
                    } else {
                        this.f = false;
                        return -1;
                    }
                }
            }
            this.d.remove(wmt);
            wmk.a(wmt.c);
            return 0;
        }
    }
}
