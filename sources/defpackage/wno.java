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

/* renamed from: wno reason: default package */
public final class wno implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService p;
    private static /* synthetic */ boolean v = (!wno.class.desiredAssertionStatus());
    final boolean a;
    final b b;
    final Map<Integer, wnq> c = new LinkedHashMap();
    final String d;
    int e;
    int f;
    boolean g;
    final wnt h;
    /* access modifiers changed from: 0000 */
    public boolean i;
    long j;
    wnu k = new wnu();
    final wnu l = new wnu();
    boolean m = false;
    final wnr n;
    final Set<Integer> o = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final ScheduledExecutorService q;
    private final ExecutorService r;
    private long s = 0;
    private Socket t;
    private d u;

    /* renamed from: wno$a */
    public static class a {
        Socket a;
        String b;
        wom c;
        wol d;
        public b e = b.l;
        wnt f = wnt.a;
        boolean g = true;
        public int h;

        public a(boolean z) {
        }

        public final a a(Socket socket, String str, wom wom, wol wol) {
            this.a = socket;
            this.b = str;
            this.c = wom;
            this.d = wol;
            return this;
        }

        public final wno a() {
            return new wno(this);
        }
    }

    /* renamed from: wno$b */
    public static abstract class b {
        public static final b l = new b() {
            public final void a(wnq wnq) {
                wnq.a(ErrorCode.REFUSED_STREAM);
            }
        };

        public void a(wno wno) {
        }

        public abstract void a(wnq wnq);
    }

    /* renamed from: wno$c */
    final class c extends wmj {
        private boolean a;
        private int b;
        private int c;

        c(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", wno.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        public final void b() {
            boolean z;
            wno wno = wno.this;
            boolean z2 = this.a;
            int i = this.b;
            int i2 = this.c;
            if (!z2) {
                synchronized (wno) {
                    z = wno.i;
                    wno.i = true;
                }
                if (z) {
                    wno.b();
                    return;
                }
            }
            try {
                wno.n.a(z2, i, i2);
            } catch (IOException unused) {
                wno.b();
            }
        }
    }

    /* renamed from: wno$d */
    class d extends wmj implements b {
        private wnp b;

        d(wnp wnp) {
            super("OkHttp %s", wno.this.d);
            this.b = wnp;
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
            defpackage.wmk.a((java.io.Closeable) r9.b);
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
                wnp r2 = r9.b     // Catch:{ IOException -> 0x0076 }
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
                java.io.IOException r2 = defpackage.wnm.b(r2, r3)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x001c:
                wom r2 = r2.b     // Catch:{ IOException -> 0x0076 }
                okio.ByteString r3 = defpackage.wnm.a     // Catch:{ IOException -> 0x0076 }
                int r3 = r3.h()     // Catch:{ IOException -> 0x0076 }
                long r6 = (long) r3     // Catch:{ IOException -> 0x0076 }
                okio.ByteString r2 = r2.d(r6)     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Logger r3 = defpackage.wnp.a     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.isLoggable(r6)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0046
                java.util.logging.Logger r3 = defpackage.wnp.a     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r8 = r2.f()     // Catch:{ IOException -> 0x0076 }
                r7[r5] = r8     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = defpackage.wmk.a(r6, r7)     // Catch:{ IOException -> 0x0076 }
                r3.fine(r6)     // Catch:{ IOException -> 0x0076 }
            L_0x0046:
                okio.ByteString r3 = defpackage.wnm.a     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0065
            L_0x004e:
                wnp r2 = r9.b     // Catch:{ IOException -> 0x0076 }
                boolean r2 = r2.a(r5, r9)     // Catch:{ IOException -> 0x0076 }
                if (r2 != 0) goto L_0x004e
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0076 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0076 }
                wno r2 = defpackage.wno.this     // Catch:{ IOException -> 0x005f }
            L_0x005c:
                r2.a(r0, r1)     // Catch:{ IOException -> 0x005f }
            L_0x005f:
                wnp r0 = r9.b
                defpackage.wmk.a(r0)
                return
            L_0x0065:
                java.lang.String r3 = "Expected a connection header but was %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r2 = r2.a()     // Catch:{ IOException -> 0x0076 }
                r4[r5] = r2     // Catch:{ IOException -> 0x0076 }
                java.io.IOException r2 = defpackage.wnm.b(r3, r4)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x0074:
                r2 = move-exception
                goto L_0x007d
            L_0x0076:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                wno r2 = defpackage.wno.this     // Catch:{ IOException -> 0x005f }
                goto L_0x005c
            L_0x007d:
                wno r3 = defpackage.wno.this     // Catch:{ IOException -> 0x0082 }
                r3.a(r0, r1)     // Catch:{ IOException -> 0x0082 }
            L_0x0082:
                wnp r0 = r9.b
                defpackage.wmk.a(r0)
                goto L_0x0089
            L_0x0088:
                throw r2
            L_0x0089:
                goto L_0x0088
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.d.b():void");
        }

        public final void a(boolean z, int i, wom wom, int i2) {
            if (wno.c(i)) {
                wno wno = wno.this;
                wok wok = new wok();
                long j = (long) i2;
                wom.a(j);
                wom.a(wok, j);
                if (wok.b == j) {
                    wno wno2 = wno;
                    AnonymousClass5 r1 = new wmj("OkHttp %s Push Data[%s]", new Object[]{wno.d, Integer.valueOf(i)}, i, wok, i2, z) {
                        private /* synthetic */ int a;
                        private /* synthetic */ wok b;
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
                                wno.this.h.a(this.b, this.c);
                                wno.this.n.a(this.a, ErrorCode.CANCEL);
                                synchronized (wno.this) {
                                    wno.this.o.remove(Integer.valueOf(this.a));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    };
                    wno.a((wmj) r1);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(wok.b);
                sb.append(" != ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            wnq a2 = wno.this.a(i);
            if (a2 == null) {
                wno.this.a(i, ErrorCode.PROTOCOL_ERROR);
                long j2 = (long) i2;
                wno.this.a(j2);
                wom.i(j2);
            } else if (wnq.l || !Thread.holdsLock(a2)) {
                a2.g.a(wom, (long) i2);
                if (z) {
                    a2.e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (defpackage.wnq.l != false) goto L_0x009b;
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
            r4.e.add(defpackage.wmk.b(r15));
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
        public final void a(boolean r13, int r14, java.util.List<defpackage.wnk> r15) {
            /*
                r12 = this;
                boolean r0 = defpackage.wno.c(r14)
                r1 = 0
                r2 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0027
                wno r0 = defpackage.wno.this
                wno$4 r11 = new wno$4     // Catch:{ RejectedExecutionException -> 0x0026 }
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
                wno r0 = defpackage.wno.this
                monitor-enter(r0)
                wno r4 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                wnq r4 = r4.a(r14)     // Catch:{ all -> 0x00c1 }
                if (r4 != 0) goto L_0x0089
                wno r4 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                boolean r4 = r4.g     // Catch:{ all -> 0x00c1 }
                if (r4 == 0) goto L_0x003a
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x003a:
                wno r4 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                int r4 = r4.e     // Catch:{ all -> 0x00c1 }
                if (r14 > r4) goto L_0x0042
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x0042:
                int r4 = r14 % 2
                wno r5 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                int r5 = r5.f     // Catch:{ all -> 0x00c1 }
                int r5 = r5 % r3
                if (r4 != r5) goto L_0x004d
                monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
                return
            L_0x004d:
                wlw r9 = defpackage.wmk.b(r15)     // Catch:{ all -> 0x00c1 }
                wnq r15 = new wnq     // Catch:{ all -> 0x00c1 }
                wno r6 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                r7 = 0
                r4 = r15
                r5 = r14
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c1 }
                wno r13 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                r13.e = r14     // Catch:{ all -> 0x00c1 }
                wno r13 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
                java.util.Map<java.lang.Integer, wnq> r13 = r13.c     // Catch:{ all -> 0x00c1 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c1 }
                r13.put(r4, r15)     // Catch:{ all -> 0x00c1 }
                java.util.concurrent.ExecutorService r13 = defpackage.wno.p     // Catch:{ all -> 0x00c1 }
                wno$d$1 r4 = new wno$d$1     // Catch:{ all -> 0x00c1 }
                java.lang.String r5 = "OkHttp %s stream %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c1 }
                wno r6 = defpackage.wno.this     // Catch:{ all -> 0x00c1 }
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
                boolean r14 = defpackage.wnq.l
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
                java.util.Deque<wlw> r14 = r4.e     // Catch:{ all -> 0x00be }
                wlw r15 = defpackage.wmk.b(r15)     // Catch:{ all -> 0x00be }
                r14.add(r15)     // Catch:{ all -> 0x00be }
                boolean r14 = r4.a()     // Catch:{ all -> 0x00be }
                r4.notifyAll()     // Catch:{ all -> 0x00be }
                monitor-exit(r4)     // Catch:{ all -> 0x00be }
                if (r14 != 0) goto L_0x00b8
                wno r14 = r4.d
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.d.a(boolean, int, java.util.List):void");
        }

        public final void a(int i, ErrorCode errorCode) {
            if (wno.c(i)) {
                wno wno = wno.this;
                wno wno2 = wno;
                AnonymousClass6 r1 = new wmj("OkHttp %s Push Reset[%s]", new Object[]{wno.d, Integer.valueOf(i)}, i, errorCode) {
                    private /* synthetic */ int a;
                    private /* synthetic */ ErrorCode b;

                    {
                        this.a = r4;
                        this.b = r5;
                    }

                    public final void b() {
                        synchronized (wno.this) {
                            wno.this.o.remove(Integer.valueOf(this.a));
                        }
                    }
                };
                wno.a((wmj) r1);
                return;
            }
            wnq b2 = wno.this.b(i);
            if (b2 != null) {
                b2.c(errorCode);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(4:6|(2:8|45)(1:46)|9|4)|44|10|11|12|13|14|(1:23)(4:17|(1:19)|20|(1:22))|24|25) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r11, final defpackage.wnu r12) {
            /*
                r10 = this;
                wno r11 = defpackage.wno.this
                monitor-enter(r11)
                wno r0 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                wnu r0 = r0.l     // Catch:{ all -> 0x00ad }
                int r0 = r0.b()     // Catch:{ all -> 0x00ad }
                wno r1 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                wnu r1 = r1.l     // Catch:{ all -> 0x00ad }
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
                wno r3 = defpackage.wno.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.util.concurrent.ScheduledExecutorService r3 = r3.q     // Catch:{ RejectedExecutionException -> 0x003e }
                wno$d$3 r4 = new wno$d$3     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r5 = "OkHttp %s ACK Settings"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003e }
                wno r7 = defpackage.wno.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r7 = r7.d     // Catch:{ RejectedExecutionException -> 0x003e }
                r6[r2] = r7     // Catch:{ RejectedExecutionException -> 0x003e }
                r4.<init>(r5, r6, r12)     // Catch:{ RejectedExecutionException -> 0x003e }
                r3.execute(r4)     // Catch:{ RejectedExecutionException -> 0x003e }
            L_0x003e:
                wno r12 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                wnu r12 = r12.l     // Catch:{ all -> 0x00ad }
                int r12 = r12.b()     // Catch:{ all -> 0x00ad }
                r3 = -1
                r4 = 0
                r6 = 0
                if (r12 == r3) goto L_0x007e
                if (r12 == r0) goto L_0x007e
                int r12 = r12 - r0
                long r7 = (long) r12     // Catch:{ all -> 0x00ad }
                wno r12 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                boolean r12 = r12.m     // Catch:{ all -> 0x00ad }
                if (r12 != 0) goto L_0x005a
                wno r12 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                r12.m = r1     // Catch:{ all -> 0x00ad }
            L_0x005a:
                wno r12 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, wnq> r12 = r12.c     // Catch:{ all -> 0x00ad }
                boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00ad }
                if (r12 != 0) goto L_0x007f
                wno r12 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, wnq> r12 = r12.c     // Catch:{ all -> 0x00ad }
                java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x00ad }
                wno r0 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
                java.util.Map<java.lang.Integer, wnq> r0 = r0.c     // Catch:{ all -> 0x00ad }
                int r0 = r0.size()     // Catch:{ all -> 0x00ad }
                wnq[] r0 = new defpackage.wnq[r0]     // Catch:{ all -> 0x00ad }
                java.lang.Object[] r12 = r12.toArray(r0)     // Catch:{ all -> 0x00ad }
                r6 = r12
                wnq[] r6 = (defpackage.wnq[]) r6     // Catch:{ all -> 0x00ad }
                goto L_0x007f
            L_0x007e:
                r7 = r4
            L_0x007f:
                java.util.concurrent.ExecutorService r12 = defpackage.wno.p     // Catch:{ all -> 0x00ad }
                wno$d$2 r0 = new wno$d$2     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "OkHttp %s settings"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ad }
                wno r9 = defpackage.wno.this     // Catch:{ all -> 0x00ad }
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.d.a(boolean, wnu):void");
        }

        public final void a(boolean z, int i, int i2) {
            if (z) {
                synchronized (wno.this) {
                    wno.this.i = false;
                    wno.this.notifyAll();
                }
                return;
            }
            try {
                wno.this.q.execute(new c(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void a(int i, ByteString byteString) {
            wnq[] wnqArr;
            synchronized (wno.this) {
                wnqArr = (wnq[]) wno.this.c.values().toArray(new wnq[wno.this.c.size()]);
                wno.this.g = true;
            }
            for (wnq wnq : wnqArr) {
                if (wnq.c > i && wnq.b()) {
                    wnq.c(ErrorCode.REFUSED_STREAM);
                    wno.this.b(wnq.c);
                }
            }
        }

        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (wno.this) {
                    wno.this.j += j;
                    wno.this.notifyAll();
                }
            } else {
                wnq a2 = wno.this.a(i);
                if (a2 != null) {
                    synchronized (a2) {
                        a2.a(j);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = r6;
            r0 = new defpackage.wno.AnonymousClass3(r1, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r6.d, java.lang.Integer.valueOf(r9)}, r9, r10);
            r6.a((defpackage.wmj) r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r9, java.util.List<defpackage.wnk> r10) {
            /*
                r8 = this;
                wno r6 = defpackage.wno.this
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
                wno$3 r7 = new wno$3     // Catch:{ RejectedExecutionException -> 0x003d }
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.d.a(int, java.util.List):void");
        }
    }

    static boolean c(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), wmk.a("OkHttp Http2Connection", true));
        p = threadPoolExecutor;
    }

    wno(a aVar) {
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
        this.q = new ScheduledThreadPoolExecutor(1, wmk.a(wmk.a("OkHttp %s Writer", this.d), false));
        if (aVar2.h != 0) {
            this.q.scheduleAtFixedRate(new c(false, 0, 0), (long) aVar2.h, (long) aVar2.h, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), wmk.a(wmk.a("OkHttp %s Push Observer", this.d), true));
        this.r = threadPoolExecutor;
        this.l.a(7, AudioDriver.SPOTIFY_MAX_VOLUME);
        this.l.a(5, 16384);
        this.j = (long) this.l.b();
        this.t = aVar2.a;
        this.n = new wnr(aVar2.d, this.a);
        this.u = new d(new wnp(aVar2.c, this.a));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized wnq a(int i2) {
        return (wnq) this.c.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized wnq b(int i2) {
        wnq wnq;
        wnq = (wnq) this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return wnq;
    }

    public final synchronized int a() {
        wnu wnu = this.l;
        if ((wnu.a & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return wnu.b[4];
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
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.wnq a(int r10, java.util.List<defpackage.wnk> r11, boolean r12) {
        /*
            r9 = this;
            r10 = r12 ^ 1
            wnr r6 = r9.n
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
            wnq r8 = new wnq     // Catch:{ all -> 0x0061 }
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
            java.util.Map<java.lang.Integer, wnq> r0 = r9.c     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0061 }
            r0.put(r1, r8)     // Catch:{ all -> 0x0061 }
        L_0x004c:
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            wnr r0 = r9.n     // Catch:{ all -> 0x0064 }
            r0.a(r10, r7, r11)     // Catch:{ all -> 0x0064 }
            monitor-exit(r6)     // Catch:{ all -> 0x0064 }
            if (r12 == 0) goto L_0x005a
            wnr r10 = r9.n
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.a(int, java.util.List, boolean):wnq");
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
    public final void a(int r9, boolean r10, defpackage.wok r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            wnr r12 = r8.n
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
            java.util.Map<java.lang.Integer, wnq> r3 = r8.c     // Catch:{ InterruptedException -> 0x0058 }
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
            wnr r3 = r8.n     // Catch:{ all -> 0x0056 }
            int r3 = r3.a     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.j     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.j = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            wnr r4 = r8.n
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wno.a(int, boolean, wok, long):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, ErrorCode errorCode) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.q;
            final int i3 = i2;
            final ErrorCode errorCode2 = errorCode;
            AnonymousClass1 r1 = new wmj("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void b() {
                    try {
                        wno.this.b(i3, errorCode2);
                    } catch (IOException unused) {
                        wno.this.b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, ErrorCode errorCode) {
        this.n.a(i2, errorCode);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, long j2) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.q;
            final int i3 = i2;
            final long j3 = j2;
            AnonymousClass2 r1 = new wmj("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void b() {
                    try {
                        wno.this.n.a(i3, j3);
                    } catch (IOException unused) {
                        wno.this.b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    private void a(ErrorCode errorCode) {
        synchronized (this.n) {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    int i2 = this.e;
                    this.n.a(i2, errorCode, wmk.a);
                }
            }
        }
    }

    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* access modifiers changed from: 0000 */
    public final void a(ErrorCode errorCode, ErrorCode errorCode2) {
        if (v || !Thread.holdsLock(this)) {
            wnq[] wnqArr = null;
            try {
                a(errorCode);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
            synchronized (this) {
                if (!this.c.isEmpty()) {
                    wnqArr = (wnq[]) this.c.values().toArray(new wnq[this.c.size()]);
                    this.c.clear();
                }
            }
            if (wnqArr != null) {
                for (wnq a2 : wnqArr) {
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
    public void b() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            a(errorCode, errorCode);
        } catch (IOException unused) {
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

    public final synchronized boolean c() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(wmj wmj) {
        if (!c()) {
            this.r.execute(wmj);
        }
    }
}
