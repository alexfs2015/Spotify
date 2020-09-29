package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* renamed from: xbu reason: default package */
public final class xbu implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService p;
    private static /* synthetic */ boolean v = (!xbu.class.desiredAssertionStatus());
    final boolean a;
    final b b;
    final Map<Integer, xbw> c = new LinkedHashMap();
    final String d;
    int e;
    int f;
    boolean g;
    final xbz h;
    /* access modifiers changed from: 0000 */
    public boolean i;
    long j;
    xca k = new xca();
    final xca l = new xca();
    boolean m = false;
    final xbx n;
    final Set<Integer> o = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final ScheduledExecutorService q;
    private final ExecutorService r;
    private long s = 0;
    private Socket t;
    private d u;

    /* renamed from: xbu$a */
    public static class a {
        Socket a;
        String b;
        xcs c;
        xcr d;
        public b e = b.l;
        xbz f = xbz.a;
        boolean g = true;
        public int h;

        public a(boolean z) {
        }

        public final a a(Socket socket, String str, xcs xcs, xcr xcr) {
            this.a = socket;
            this.b = str;
            this.c = xcs;
            this.d = xcr;
            return this;
        }

        public final xbu a() {
            return new xbu(this);
        }
    }

    /* renamed from: xbu$b */
    public static abstract class b {
        public static final b l = new b() {
            public final void a(xbw xbw) {
                xbw.a(ErrorCode.REFUSED_STREAM);
            }
        };

        public void a(xbu xbu) {
        }

        public abstract void a(xbw xbw);
    }

    /* renamed from: xbu$c */
    final class c extends xap {
        private boolean a;
        private int b;
        private int c;

        c(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", xbu.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        public final void b() {
            boolean z;
            xbu xbu = xbu.this;
            boolean z2 = this.a;
            int i = this.b;
            int i2 = this.c;
            if (!z2) {
                synchronized (xbu) {
                    z = xbu.i;
                    xbu.i = true;
                }
                if (z) {
                    xbu.b();
                    return;
                }
            }
            try {
                xbu.n.a(z2, i, i2);
            } catch (IOException unused) {
                xbu.b();
            }
        }
    }

    /* renamed from: xbu$d */
    class d extends xap implements b {
        private xbv b;

        d(xbv xbv) {
            super("OkHttp %s", xbu.this.d);
            this.b = xbv;
        }

        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (xbu.this) {
                    xbu.this.j += j;
                    xbu.this.notifyAll();
                }
            } else {
                xbw a2 = xbu.this.a(i);
                if (a2 != null) {
                    synchronized (a2) {
                        a2.a(j);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = r6;
            r0 = new defpackage.xbu.AnonymousClass3(r1, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r6.d, java.lang.Integer.valueOf(r9)}, r9, r10);
            r6.a((defpackage.xap) r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r9, java.util.List<defpackage.xbq> r10) {
            /*
                r8 = this;
                xbu r6 = defpackage.xbu.this
                monitor-enter(r6)
                java.util.Set<java.lang.Integer> r0 = r6.o     // Catch:{ all -> 0x003e }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003e }
                boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0016
                okhttp3.internal.http2.ErrorCode r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x003e }
                r6.a(r9, r10)     // Catch:{ all -> 0x003e }
                monitor-exit(r6)     // Catch:{ all -> 0x003e }
                return
            L_0x0016:
                java.util.Set<java.lang.Integer> r0 = r6.o     // Catch:{ all -> 0x003e }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003e }
                r0.add(r1)     // Catch:{ all -> 0x003e }
                monitor-exit(r6)     // Catch:{ all -> 0x003e }
                xbu$3 r7 = new xbu$3     // Catch:{ RejectedExecutionException -> 0x003d }
                java.lang.String r2 = "OkHttp %s Push Request[%s]"
                r0 = 2
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x003d }
                r0 = 0
                java.lang.String r1 = r6.d     // Catch:{ RejectedExecutionException -> 0x003d }
                r3[r0] = r1     // Catch:{ RejectedExecutionException -> 0x003d }
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003d }
                r3[r0] = r1     // Catch:{ RejectedExecutionException -> 0x003d }
                r0 = r7
                r1 = r6
                r4 = r9
                r5 = r10
                r0.<init>(r2, r3, r4, r5)     // Catch:{ RejectedExecutionException -> 0x003d }
                r6.a(r7)     // Catch:{ RejectedExecutionException -> 0x003d }
            L_0x003d:
                return
            L_0x003e:
                r9 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x003e }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.d.a(int, java.util.List):void");
        }

        public final void a(int i, ErrorCode errorCode) {
            if (xbu.c(i)) {
                xbu xbu = xbu.this;
                xbu xbu2 = xbu;
                AnonymousClass6 r1 = new xap("OkHttp %s Push Reset[%s]", new Object[]{xbu.d, Integer.valueOf(i)}, i, errorCode) {
                    private /* synthetic */ int a;
                    private /* synthetic */ ErrorCode b;

                    {
                        this.a = r4;
                        this.b = r5;
                    }

                    public final void b() {
                        synchronized (xbu.this) {
                            xbu.this.o.remove(Integer.valueOf(this.a));
                        }
                    }
                };
                xbu.a((xap) r1);
                return;
            }
            xbw b2 = xbu.this.b(i);
            if (b2 != null) {
                b2.c(errorCode);
            }
        }

        public final void a(int i, ByteString byteString) {
            xbw[] xbwArr;
            synchronized (xbu.this) {
                xbwArr = (xbw[]) xbu.this.c.values().toArray(new xbw[xbu.this.c.size()]);
                xbu.this.g = true;
            }
            for (xbw xbw : xbwArr) {
                if (xbw.c > i && xbw.b()) {
                    xbw.c(ErrorCode.REFUSED_STREAM);
                    xbu.this.b(xbw.c);
                }
            }
        }

        public final void a(boolean z, int i, int i2) {
            if (z) {
                synchronized (xbu.this) {
                    xbu.this.i = false;
                    xbu.this.notifyAll();
                }
                return;
            }
            try {
                xbu.this.q.execute(new c(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (defpackage.xbw.l != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
            if (java.lang.Thread.holdsLock(r4) != false) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r4.f = true;
            r4.e.add(defpackage.xaq.b(r15));
            r14 = r4.a();
            r4.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
            if (r14 != false) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
            r4.d.b(r4.c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
            if (r13 == false) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
            r4.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r13, int r14, java.util.List<defpackage.xbq> r15) {
            /*
                r12 = this;
                boolean r0 = defpackage.xbu.c(r14)
                r1 = 0
                r2 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0027
                xbu r0 = defpackage.xbu.this
                xbu$4 r11 = new xbu$4     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r6 = "OkHttp %s Push Headers[%s]"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r3 = r0.d     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r1] = r3     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r2] = r1     // Catch:{ RejectedExecutionException -> 0x0026 }
                r4 = r11
                r5 = r0
                r8 = r14
                r9 = r15
                r10 = r13
                r4.<init>(r6, r7, r8, r9, r10)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r0.a(r11)     // Catch:{ RejectedExecutionException -> 0x0026 }
            L_0x0026:
                return
            L_0x0027:
                xbu r0 = defpackage.xbu.this
                monitor-enter(r0)
                xbu r4 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                xbw r4 = r4.a(r14)     // Catch:{ all -> 0x00c1 }
                if (r4 != 0) goto L_0x0089
                xbu r4 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                boolean r4 = r4.g     // Catch:{ all -> 0x00c1 }
                if (r4 == 0) goto L_0x003a
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x003a:
                xbu r4 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                int r4 = r4.e     // Catch:{ all -> 0x00c1 }
                if (r14 > r4) goto L_0x0042
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x0042:
                int r4 = r14 % 2
                xbu r5 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                int r5 = r5.f     // Catch:{ all -> 0x00c1 }
                int r5 = r5 % r3
                if (r4 != r5) goto L_0x004d
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x004d:
                xac r9 = defpackage.xaq.b(r15)     // Catch:{ all -> 0x00c1 }
                xbw r15 = new xbw     // Catch:{ all -> 0x00c1 }
                xbu r6 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                r7 = 0
                r4 = r15
                r5 = r14
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c1 }
                xbu r13 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                r13.e = r14     // Catch:{ all -> 0x00c1 }
                xbu r13 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                java.util.Map<java.lang.Integer, xbw> r13 = r13.c     // Catch:{ all -> 0x00c1 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c1 }
                r13.put(r4, r15)     // Catch:{ all -> 0x00c1 }
                java.util.concurrent.ExecutorService r13 = defpackage.xbu.p     // Catch:{ all -> 0x00c1 }
                xbu$d$1 r4 = new xbu$d$1     // Catch:{ all -> 0x00c1 }
                java.lang.String r5 = "OkHttp %s stream %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c1 }
                xbu r6 = defpackage.xbu.this     // Catch:{ all -> 0x00c1 }
                java.lang.String r6 = r6.d     // Catch:{ all -> 0x00c1 }
                r3[r1] = r6     // Catch:{ all -> 0x00c1 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c1 }
                r3[r2] = r14     // Catch:{ all -> 0x00c1 }
                r4.<init>(r5, r3, r15)     // Catch:{ all -> 0x00c1 }
                r13.execute(r4)     // Catch:{ all -> 0x00c1 }
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x0089:
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                boolean r14 = defpackage.xbw.l
                if (r14 != 0) goto L_0x009b
                boolean r14 = java.lang.Thread.holdsLock(r4)
                if (r14 != 0) goto L_0x0095
                goto L_0x009b
            L_0x0095:
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x009b:
                monitor-enter(r4)
                r4.f = r2     // Catch:{ all -> 0x00be }
                java.util.Deque<xac> r14 = r4.e     // Catch:{ all -> 0x00be }
                xac r15 = defpackage.xaq.b(r15)     // Catch:{ all -> 0x00be }
                r14.add(r15)     // Catch:{ all -> 0x00be }
                boolean r14 = r4.a()     // Catch:{ all -> 0x00be }
                r4.notifyAll()     // Catch:{ all -> 0x00be }
                monitor-exit(r4)     // Catch:{ all -> 0x00be }
                if (r14 != 0) goto L_0x00b8
                xbu r14 = r4.d
                int r15 = r4.c
                r14.b(r15)
            L_0x00b8:
                if (r13 == 0) goto L_0x00bd
                r4.e()
            L_0x00bd:
                return
            L_0x00be:
                r13 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00be }
                throw r13
            L_0x00c1:
                r13 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.d.a(boolean, int, java.util.List):void");
        }

        public final void a(boolean z, int i, xcs xcs, int i2) {
            if (xbu.c(i)) {
                xbu xbu = xbu.this;
                xcq xcq = new xcq();
                long j = (long) i2;
                xcs.a(j);
                xcs.a(xcq, j);
                if (xcq.b == j) {
                    xbu xbu2 = xbu;
                    AnonymousClass5 r1 = new xap("OkHttp %s Push Data[%s]", new Object[]{xbu.d, Integer.valueOf(i)}, i, xcq, i2, z) {
                        private /* synthetic */ int a;
                        private /* synthetic */ xcq b;
                        private /* synthetic */ int c;
                        private /* synthetic */ boolean d;

                        {
                            this.a = r4;
                            this.b = r5;
                            this.c = r6;
                            this.d = r7;
                        }

                        public final void b() {
                            try {
                                xbu.this.h.a(this.b, this.c);
                                xbu.this.n.a(this.a, ErrorCode.CANCEL);
                                synchronized (xbu.this) {
                                    xbu.this.o.remove(Integer.valueOf(this.a));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    };
                    xbu.a((xap) r1);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(xcq.b);
                sb.append(" != ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            xbw a2 = xbu.this.a(i);
            if (a2 == null) {
                xbu.this.a(i, ErrorCode.PROTOCOL_ERROR);
                long j2 = (long) i2;
                xbu.this.a(j2);
                xcs.i(j2);
            } else if (xbw.l || !Thread.holdsLock(a2)) {
                a2.g.a(xcs, (long) i2);
                if (z) {
                    a2.e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(4:6|(2:8|45)(1:46)|9|4)|44|10|11|12|13|14|(1:23)(4:17|(1:19)|20|(1:22))|24|25) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r11, final defpackage.xca r12) {
            /*
                r10 = this;
                xbu r11 = defpackage.xbu.this
                monitor-enter(r11)
                xbu r0 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                xca r0 = r0.l     // Catch:{ all -> 0x00ad }
                int r0 = r0.b()     // Catch:{ all -> 0x00ad }
                xbu r1 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                xca r1 = r1.l     // Catch:{ all -> 0x00ad }
                r2 = 0
                r3 = 0
            L_0x0011:
                r4 = 10
                if (r3 >= r4) goto L_0x0025
                boolean r4 = r12.a(r3)     // Catch:{ all -> 0x00ad }
                if (r4 == 0) goto L_0x0022
                int[] r4 = r12.b     // Catch:{ all -> 0x00ad }
                r4 = r4[r3]     // Catch:{ all -> 0x00ad }
                r1.a(r3, r4)     // Catch:{ all -> 0x00ad }
            L_0x0022:
                int r3 = r3 + 1
                goto L_0x0011
            L_0x0025:
                r1 = 1
                xbu r3 = defpackage.xbu.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.util.concurrent.ScheduledExecutorService r3 = r3.q     // Catch:{ RejectedExecutionException -> 0x003e }
                xbu$d$3 r4 = new xbu$d$3     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r5 = "OkHttp %s ACK Settings"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003e }
                xbu r7 = defpackage.xbu.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r7 = r7.d     // Catch:{ RejectedExecutionException -> 0x003e }
                r6[r2] = r7     // Catch:{ RejectedExecutionException -> 0x003e }
                r4.<init>(r5, r6, r12)     // Catch:{ RejectedExecutionException -> 0x003e }
                r3.execute(r4)     // Catch:{ RejectedExecutionException -> 0x003e }
            L_0x003e:
                xbu r12 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                xca r12 = r12.l     // Catch:{ all -> 0x00ad }
                int r12 = r12.b()     // Catch:{ all -> 0x00ad }
                r3 = -1
                r4 = 0
                r6 = 0
                if (r12 == r3) goto L_0x007e
                if (r12 == r0) goto L_0x007e
                int r12 = r12 - r0
                long r7 = (long) r12     // Catch:{ all -> 0x00ad }
                xbu r12 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                boolean r12 = r12.m     // Catch:{ all -> 0x00ad }
                if (r12 != 0) goto L_0x005a
                xbu r12 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                r12.m = r1     // Catch:{ all -> 0x00ad }
            L_0x005a:
                xbu r12 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, xbw> r12 = r12.c     // Catch:{ all -> 0x00ad }
                boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00ad }
                if (r12 != 0) goto L_0x007f
                xbu r12 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, xbw> r12 = r12.c     // Catch:{ all -> 0x00ad }
                java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x00ad }
                xbu r0 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, xbw> r0 = r0.c     // Catch:{ all -> 0x00ad }
                int r0 = r0.size()     // Catch:{ all -> 0x00ad }
                xbw[] r0 = new defpackage.xbw[r0]     // Catch:{ all -> 0x00ad }
                java.lang.Object[] r12 = r12.toArray(r0)     // Catch:{ all -> 0x00ad }
                r6 = r12
                xbw[] r6 = (defpackage.xbw[]) r6     // Catch:{ all -> 0x00ad }
                goto L_0x007f
            L_0x007e:
                r7 = r4
            L_0x007f:
                java.util.concurrent.ExecutorService r12 = defpackage.xbu.p     // Catch:{ all -> 0x00ad }
                xbu$d$2 r0 = new xbu$d$2     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "OkHttp %s settings"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ad }
                xbu r9 = defpackage.xbu.this     // Catch:{ all -> 0x00ad }
                java.lang.String r9 = r9.d     // Catch:{ all -> 0x00ad }
                r1[r2] = r9     // Catch:{ all -> 0x00ad }
                r0.<init>(r3, r1)     // Catch:{ all -> 0x00ad }
                r12.execute(r0)     // Catch:{ all -> 0x00ad }
                monitor-exit(r11)     // Catch:{ all -> 0x00ad }
                if (r6 == 0) goto L_0x00ac
                int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r11 == 0) goto L_0x00ac
                int r11 = r6.length
            L_0x009d:
                if (r2 >= r11) goto L_0x00ac
                r12 = r6[r2]
                monitor-enter(r12)
                r12.a(r7)     // Catch:{ all -> 0x00a9 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
                int r2 = r2 + 1
                goto L_0x009d
            L_0x00a9:
                r11 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
                throw r11
            L_0x00ac:
                return
            L_0x00ad:
                r12 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00ad }
                goto L_0x00b1
            L_0x00b0:
                throw r12
            L_0x00b1:
                goto L_0x00b0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.d.a(boolean, xca):void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:28|29|30|31) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r9.a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r9.a.a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            defpackage.xaq.a((java.io.Closeable) r9.b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0076 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r9 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                xbv r2 = r9.b     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r2.c     // Catch:{ IOException -> 0x0076 }
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x001c
                boolean r2 = r2.a(r4, r9)     // Catch:{ IOException -> 0x0076 }
                if (r2 == 0) goto L_0x0013
                goto L_0x004e
            L_0x0013:
                java.lang.String r2 = "Required SETTINGS preface not received"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0076 }
                java.io.IOException r2 = defpackage.xbs.b(r2, r3)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x001c:
                xcs r2 = r2.b     // Catch:{ IOException -> 0x0076 }
                okio.ByteString r3 = defpackage.xbs.a     // Catch:{ IOException -> 0x0076 }
                int r3 = r3.h()     // Catch:{ IOException -> 0x0076 }
                long r6 = (long) r3     // Catch:{ IOException -> 0x0076 }
                okio.ByteString r2 = r2.d(r6)     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Logger r3 = defpackage.xbv.a     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.isLoggable(r6)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0046
                java.util.logging.Logger r3 = defpackage.xbv.a     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r8 = r2.f()     // Catch:{ IOException -> 0x0076 }
                r7[r5] = r8     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = defpackage.xaq.a(r6, r7)     // Catch:{ IOException -> 0x0076 }
                r3.fine(r6)     // Catch:{ IOException -> 0x0076 }
            L_0x0046:
                okio.ByteString r3 = defpackage.xbs.a     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0065
            L_0x004e:
                xbv r2 = r9.b     // Catch:{ IOException -> 0x0076 }
                boolean r2 = r2.a(r5, r9)     // Catch:{ IOException -> 0x0076 }
                if (r2 != 0) goto L_0x004e
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0076 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0076 }
                xbu r2 = defpackage.xbu.this     // Catch:{ IOException -> 0x005f }
            L_0x005c:
                r2.a(r0, r1)     // Catch:{ IOException -> 0x005f }
            L_0x005f:
                xbv r0 = r9.b
                defpackage.xaq.a(r0)
                return
            L_0x0065:
                java.lang.String r3 = "Expected a connection header but was %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r2 = r2.a()     // Catch:{ IOException -> 0x0076 }
                r4[r5] = r2     // Catch:{ IOException -> 0x0076 }
                java.io.IOException r2 = defpackage.xbs.b(r3, r4)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x0074:
                r2 = move-exception
                goto L_0x007d
            L_0x0076:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                xbu r2 = defpackage.xbu.this     // Catch:{ IOException -> 0x005f }
                goto L_0x005c
            L_0x007d:
                xbu r3 = defpackage.xbu.this     // Catch:{ IOException -> 0x0082 }
                r3.a(r0, r1)     // Catch:{ IOException -> 0x0082 }
            L_0x0082:
                xbv r0 = r9.b
                defpackage.xaq.a(r0)
                goto L_0x0089
            L_0x0088:
                throw r2
            L_0x0089:
                goto L_0x0088
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.d.b():void");
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), xaq.a("OkHttp Http2Connection", true));
        p = threadPoolExecutor;
    }

    xbu(a aVar) {
        a aVar2 = aVar;
        this.h = aVar2.f;
        this.a = aVar2.g;
        this.b = aVar2.e;
        this.f = aVar2.g ? 1 : 2;
        if (aVar2.g) {
            this.f += 2;
        }
        if (aVar2.g) {
            this.k.a(7, 16777216);
        }
        this.d = aVar2.b;
        this.q = new ScheduledThreadPoolExecutor(1, xaq.a(xaq.a("OkHttp %s Writer", this.d), false));
        if (aVar2.h != 0) {
            this.q.scheduleAtFixedRate(new c(false, 0, 0), (long) aVar2.h, (long) aVar2.h, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), xaq.a(xaq.a("OkHttp %s Push Observer", this.d), true));
        this.r = threadPoolExecutor;
        this.l.a(7, AudioDriver.SPOTIFY_MAX_VOLUME);
        this.l.a(5, 16384);
        this.j = (long) this.l.b();
        this.t = aVar2.a;
        this.n = new xbx(aVar2.d, this.a);
        this.u = new d(new xbv(aVar2.c, this.a));
    }

    private void a(ErrorCode errorCode) {
        synchronized (this.n) {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    int i2 = this.e;
                    this.n.a(i2, errorCode, xaq.a);
                }
            }
        }
    }

    static boolean c(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized int a() {
        xca xca = this.l;
        if ((xca.a & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return xca.b[4];
    }

    /* access modifiers changed from: 0000 */
    public final synchronized xbw a(int i2) {
        return (xbw) this.c.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.xbw a(int r10, java.util.List<defpackage.xbq> r11, boolean r12) {
        /*
            r9 = this;
            r10 = r12 ^ 1
            xbx r6 = r9.n
            monitor-enter(r6)
            monitor-enter(r9)     // Catch:{ all -> 0x0064 }
            int r0 = r9.f     // Catch:{ all -> 0x0061 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0061 }
            r9.a(r0)     // Catch:{ all -> 0x0061 }
        L_0x0012:
            boolean r0 = r9.g     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x005b
            int r7 = r9.f     // Catch:{ all -> 0x0061 }
            int r0 = r9.f     // Catch:{ all -> 0x0061 }
            int r0 = r0 + 2
            r9.f = r0     // Catch:{ all -> 0x0061 }
            xbw r8 = new xbw     // Catch:{ all -> 0x0061 }
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x003c
            long r0 = r9.j     // Catch:{ all -> 0x0061 }
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x003c
            long r0 = r8.b     // Catch:{ all -> 0x0061 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r12 = 0
            goto L_0x003d
        L_0x003c:
            r12 = 1
        L_0x003d:
            boolean r0 = r8.a()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, xbw> r0 = r9.c     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0061 }
            r0.put(r1, r8)     // Catch:{ all -> 0x0061 }
        L_0x004c:
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            xbx r0 = r9.n     // Catch:{ all -> 0x0064 }
            r0.a(r10, r7, r11)     // Catch:{ all -> 0x0064 }
            monitor-exit(r6)     // Catch:{ all -> 0x0064 }
            if (r12 == 0) goto L_0x005a
            xbx r10 = r9.n
            r10.b()
        L_0x005a:
            return r8
        L_0x005b:
            okhttp3.internal.http2.ConnectionShutdownException r10 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0061 }
            r10.<init>()     // Catch:{ all -> 0x0061 }
            throw r10     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r10     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r10 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0064 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.a(int, java.util.List, boolean):xbw");
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, long j2) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.q;
            final int i3 = i2;
            final long j3 = j2;
            AnonymousClass2 r1 = new xap("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void b() {
                    try {
                        xbu.this.n.a(i3, j3);
                    } catch (IOException unused) {
                        xbu.this.b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, ErrorCode errorCode) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.q;
            final int i3 = i2;
            final ErrorCode errorCode2 = errorCode;
            AnonymousClass1 r1 = new xap("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void b() {
                    try {
                        xbu.this.b(i3, errorCode2);
                    } catch (IOException unused) {
                        xbu.this.b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.j), r8.n.a);
        r6 = (long) r3;
        r8.j -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, boolean r10, defpackage.xcq r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            xbx r12 = r8.n
            r12.a(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.j     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, xbw> r3 = r8.c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = r8.j     // Catch:{ all -> 0x0056 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            xbx r3 = r8.n     // Catch:{ all -> 0x0056 }
            int r3 = r3.a     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.j     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.j = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            xbx r4 = r8.n
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.a(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbu.a(int, boolean, xcq, long):void");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(long j2) {
        this.s += j2;
        if (this.s >= ((long) (this.k.b() / 2))) {
            a(0, this.s);
            this.s = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ErrorCode errorCode, ErrorCode errorCode2) {
        if (v || !Thread.holdsLock(this)) {
            xbw[] xbwArr = null;
            try {
                a(errorCode);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
            synchronized (this) {
                if (!this.c.isEmpty()) {
                    xbwArr = (xbw[]) this.c.values().toArray(new xbw[this.c.size()]);
                    this.c.clear();
                }
            }
            if (xbwArr != null) {
                for (xbw a2 : xbwArr) {
                    try {
                        a2.a(errorCode2);
                    } catch (IOException e3) {
                        if (e != null) {
                            e = e3;
                        }
                    }
                }
            }
            try {
                this.n.close();
            } catch (IOException e4) {
                if (e == null) {
                    e = e4;
                }
            }
            try {
                this.t.close();
            } catch (IOException e5) {
                e = e5;
            }
            this.q.shutdown();
            this.r.shutdown();
            if (e != null) {
                throw e;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(xap xap) {
        if (!c()) {
            this.r.execute(xap);
        }
    }

    public final void a(boolean z) {
        this.n.a();
        this.n.b(this.k);
        int b2 = this.k.b();
        if (b2 != 65535) {
            this.n.a(0, (long) (b2 - AudioDriver.SPOTIFY_MAX_VOLUME));
        }
        new Thread(this.u).start();
    }

    /* access modifiers changed from: 0000 */
    public final synchronized xbw b(int i2) {
        xbw xbw;
        xbw = (xbw) this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return xbw;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            a(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, ErrorCode errorCode) {
        this.n.a(i2, errorCode);
    }

    public final synchronized boolean c() {
        return this.g;
    }

    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }
}
