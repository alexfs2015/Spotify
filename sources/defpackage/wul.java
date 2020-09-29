package defpackage;

import io.netty.channel.ChannelException;
import io.netty.handler.codec.UnsupportedMessageTypeException;
import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;

/* renamed from: wul reason: default package */
public class wul extends wrc implements wpi {
    private static /* synthetic */ boolean E;
    /* access modifiers changed from: private */
    public static final wyc e;
    private static final Pattern f = Pattern.compile("^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$");
    private static final Pattern g = Pattern.compile("^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$", 2);
    private static final SSLException h;
    /* access modifiers changed from: private */
    public static final SSLException i;
    private static final ClosedChannelException j;
    private int A;
    private boolean B;
    private volatile long C;
    private volatile long D;
    /* access modifiers changed from: private */
    public volatile wpb k;
    private final SSLEngine l;
    private final int m;
    private final Executor n;
    private final ByteBuffer[] o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private wqg v;
    private wws<wot> w;
    private final a x;
    private boolean y;
    private boolean z;

    /* renamed from: wul$6 reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a = new int[HandshakeStatus.values().length];
        static final /* synthetic */ int[] b = new int[Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
        static {
            /*
                javax.net.ssl.SSLEngineResult$Status[] r0 = javax.net.ssl.SSLEngineResult.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                javax.net.ssl.SSLEngineResult$Status r3 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0032 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003c }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0052 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005d }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wul.AnonymousClass6.<clinit>():void");
        }
    }

    /* renamed from: wul$a */
    final class a extends wwa<wot> {
        private a() {
        }

        /* synthetic */ a(wul wul, byte b) {
            this();
        }

        public final wwc a() {
            if (wul.this.k != null) {
                return wul.this.k.d();
            }
            throw new IllegalStateException();
        }

        public final void aT_() {
            if (wul.this.k != null) {
                super.aT_();
            }
        }
    }

    static {
        Class<wul> cls = wul.class;
        E = !cls.desiredAssertionStatus();
        e = wyd.a(cls);
        h = (SSLException) wxv.a(new SSLException("SSLEngine closed already"), cls, "wrap(...)");
        i = (SSLException) wxv.a(new SSLException("handshake timed out"), cls, "handshake(...)");
        j = (ClosedChannelException) wxv.a(new ClosedChannelException(), cls, "channelInactive(...)");
    }

    public wul(SSLEngine sSLEngine, boolean z2) {
        this(sSLEngine, z2, wwn.a);
    }

    @Deprecated
    private wul(SSLEngine sSLEngine, boolean z2, Executor executor) {
        this.o = new ByteBuffer[1];
        this.w = new a(this, 0);
        this.x = new a(this, 0);
        this.C = 10000;
        this.D = 3000;
        if (sSLEngine == null) {
            throw new NullPointerException("engine");
        } else if (executor != null) {
            this.l = sSLEngine;
            this.n = executor;
            this.r = z2;
            this.m = sSLEngine.getSession().getPacketBufferSize();
            boolean z3 = sSLEngine instanceof wtu;
            this.p = z3;
            this.q = !z3;
            defpackage.wrc.a aVar = z3 ? c : b;
            if (aVar != null) {
                this.d = aVar;
                return;
            }
            throw new NullPointerException("cumulator");
        } else {
            throw new NullPointerException("delegatedTaskExecutor");
        }
    }

    private static ByteBuffer a(wnb wnb, int i2, int i3) {
        return wnb.J() == 1 ? wnb.n(i2, i3) : wnb.o(i2, i3);
    }

    private SSLEngineResult a(SSLEngine sSLEngine, wnb wnb, int i2, int i3, wnb wnb2) {
        SSLEngineResult sSLEngineResult;
        int J = wnb.J();
        int d = wnb2.d();
        if (!(sSLEngine instanceof wtu) || J <= 1) {
            sSLEngineResult = sSLEngine.unwrap(a(wnb, i2, i3), a(wnb2, d, wnb2.h()));
        } else {
            wtu wtu = (wtu) sSLEngine;
            try {
                this.o[0] = a(wnb2, d, wnb2.h());
                sSLEngineResult = wtu.a(wnb.p(i2, i3), this.o);
                wnb2.b(sSLEngineResult.bytesProduced() + d);
            } finally {
                this.o[0] = null;
            }
        }
        wnb2.b(d + sSLEngineResult.bytesProduced());
        return sSLEngineResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[SYNTHETIC, Splitter:B:26:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[EDGE_INSN: B:34:0x0072->B:22:0x0072 ?: BREAK  
    EDGE_INSN: B:34:0x0072->B:22:0x0072 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.SSLEngineResult a(defpackage.wnc r8, javax.net.ssl.SSLEngine r9, defpackage.wnb r10, defpackage.wnb r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            int r2 = r10.c()     // Catch:{ all -> 0x0082 }
            int r3 = r10.g()     // Catch:{ all -> 0x0082 }
            boolean r4 = r10.F()     // Catch:{ all -> 0x0082 }
            r5 = 1
            if (r4 != 0) goto L_0x0028
            boolean r4 = r7.p     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0028
        L_0x0016:
            wnb r8 = r8.d(r3)     // Catch:{ all -> 0x0082 }
            r8.a(r10, r2, r3)     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer[] r2 = r7.o     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer r3 = r8.n(r1, r3)     // Catch:{ all -> 0x0026 }
            r2[r1] = r3     // Catch:{ all -> 0x0026 }
            goto L_0x0041
        L_0x0026:
            r9 = move-exception
            goto L_0x0084
        L_0x0028:
            boolean r8 = r10 instanceof defpackage.wnh     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x003c
            int r8 = r10.J()     // Catch:{ all -> 0x0082 }
            if (r8 != r5) goto L_0x003c
            java.nio.ByteBuffer[] r8 = r7.o     // Catch:{ all -> 0x0082 }
            java.nio.ByteBuffer r2 = r10.n(r2, r3)     // Catch:{ all -> 0x0082 }
            r8[r1] = r2     // Catch:{ all -> 0x0082 }
            r2 = r8
            goto L_0x0040
        L_0x003c:
            java.nio.ByteBuffer[] r2 = r10.w()     // Catch:{ all -> 0x0082 }
        L_0x0040:
            r8 = r0
        L_0x0041:
            int r3 = r11.d()     // Catch:{ all -> 0x0026 }
            int r4 = r11.h()     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer r3 = r11.o(r3, r4)     // Catch:{ all -> 0x0026 }
            javax.net.ssl.SSLEngineResult r3 = r9.wrap(r2, r3)     // Catch:{ all -> 0x0026 }
            int r4 = r3.bytesConsumed()     // Catch:{ all -> 0x0026 }
            r10.w(r4)     // Catch:{ all -> 0x0026 }
            int r4 = r11.d()     // Catch:{ all -> 0x0026 }
            int r6 = r3.bytesProduced()     // Catch:{ all -> 0x0026 }
            int r4 = r4 + r6
            r11.b(r4)     // Catch:{ all -> 0x0026 }
            int[] r4 = defpackage.wul.AnonymousClass6.b     // Catch:{ all -> 0x0026 }
            javax.net.ssl.SSLEngineResult$Status r6 = r3.getStatus()     // Catch:{ all -> 0x0026 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0026 }
            r4 = r4[r6]     // Catch:{ all -> 0x0026 }
            if (r4 == r5) goto L_0x007c
            java.nio.ByteBuffer[] r9 = r7.o
            r9[r1] = r0
            if (r8 == 0) goto L_0x007b
            r8.B()
        L_0x007b:
            return r3
        L_0x007c:
            int r3 = r7.m     // Catch:{ all -> 0x0026 }
            r11.d(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x0041
        L_0x0082:
            r9 = move-exception
            r8 = r0
        L_0x0084:
            java.nio.ByteBuffer[] r10 = r7.o
            r10[r1] = r0
            if (r8 == 0) goto L_0x008d
            r8.B()
        L_0x008d:
            goto L_0x008f
        L_0x008e:
            throw r9
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wul.a(wnc, javax.net.ssl.SSLEngine, wnb, wnb):javax.net.ssl.SSLEngineResult");
    }

    private wnb a(wpb wpb, int i2) {
        wnc c = wpb.c();
        return this.p ? c.d(i2) : c.a(i2);
    }

    private void a(wpb wpb, Throwable th, boolean z2) {
        this.l.closeOutbound();
        if (z2) {
            try {
                this.l.closeInbound();
            } catch (SSLException e2) {
                String message = e2.getMessage();
                if (message == null || !message.contains("possible truncation attack")) {
                    e.b("{} SSLEngine.closeInbound() raised an exception.", wpb.a(), e2);
                }
            }
        }
        b(th);
        this.v.a(th);
    }

    private void a(wpb wpb, wnb wnb, wpo wpo, boolean z2, boolean z3) {
        if (wnb == null) {
            wnb = woc.a;
        } else if (!wnb.f()) {
            wnb.B();
            wnb = woc.a;
        }
        if (wpo != null) {
            wpb.a((Object) wnb, wpo);
        } else {
            wpb.a((Object) wnb);
        }
        if (z2) {
            this.y = true;
        }
        if (z3) {
            k(wpb);
        }
    }

    private void a(final wpb wpb, wox wox, final wpo wpo) {
        if (!wpb.a().D()) {
            wpb.b(wpo);
            return;
        }
        final wwy wwy = null;
        if (!wox.isDone() && this.D > 0) {
            wwy = wpb.d().a((Runnable) new Runnable() {
                public final void run() {
                    wul.e.c("{} Last write attempt timed out; force-closing the connection.", (Object) wpb.a());
                    wpb wpb = wpb;
                    wpb.b(wpb.k()).a(new wpp(false, wpo));
                }
            }, this.D, TimeUnit.MILLISECONDS);
        }
        wox.a(new woy() {
            public final /* synthetic */ void operationComplete(wwi wwi) {
                ScheduledFuture scheduledFuture = wwy;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                wpb wpb = wpb;
                wpb.b(wpb.k()).a(new wpp(false, wpo));
            }
        });
    }

    private void a(wpb wpb, wpo wpo, boolean z2) {
        if (wpb.a().D()) {
            this.z = true;
            this.l.closeOutbound();
            wpo k2 = wpb.k();
            try {
                c(wpb, k2);
            } finally {
                a(wpb, (wox) k2, wpo);
            }
        } else if (z2) {
            wpb.a(wpo);
        } else {
            wpb.b(wpo);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r1 == 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r1 == 3) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        if (r1 == 4) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r1 != 5) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
        r6 = true;
        r1 = r11;
        r2 = r12;
        r3 = r9;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        r1 = new java.lang.StringBuilder("Unknown handshake status: ");
        r1.append(r2.getHandshakeStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        r6 = false;
        r1 = r11;
        r2 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.wpb r12, boolean r13) {
        /*
            r11 = this;
            wnc r0 = r12.c()
            r7 = 0
        L_0x0005:
            r3 = r7
            r4 = r3
        L_0x0007:
            r8 = 1
            boolean r1 = r12.r()     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            if (r1 != 0) goto L_0x00a9
            wqg r1 = r11.v     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            java.lang.Object r1 = r1.d()     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            if (r1 == 0) goto L_0x00a9
            wnb r1 = (defpackage.wnb) r1     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            if (r3 != 0) goto L_0x0024
            int r2 = r1.g()     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            wnb r2 = r11.b(r12, r2)     // Catch:{ SSLException -> 0x00af, all -> 0x00ad }
            r9 = r2
            goto L_0x0025
        L_0x0024:
            r9 = r3
        L_0x0025:
            javax.net.ssl.SSLEngine r2 = r11.l     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            javax.net.ssl.SSLEngineResult r2 = r11.a(r0, r2, r1, r9)     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            javax.net.ssl.SSLEngineResult$Status r3 = r2.getStatus()     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            if (r3 != r5) goto L_0x0043
            wqg r0 = r11.v     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            javax.net.ssl.SSLException r1 = h     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            r0.a(r1)     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            r6 = 0
            r1 = r11
            r2 = r12
            r3 = r9
        L_0x003e:
            r5 = r13
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0043:
            boolean r1 = r1.f()     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            if (r1 != 0) goto L_0x0051
            wqg r1 = r11.v     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            wpo r1 = r1.c()     // Catch:{ SSLException -> 0x00a7, all -> 0x00a4 }
            r10 = r1
            goto L_0x0052
        L_0x0051:
            r10 = r7
        L_0x0052:
            int[] r1 = defpackage.wul.AnonymousClass6.a     // Catch:{ SSLException -> 0x00a2 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r2.getHandshakeStatus()     // Catch:{ SSLException -> 0x00a2 }
            int r3 = r3.ordinal()     // Catch:{ SSLException -> 0x00a2 }
            r1 = r1[r3]     // Catch:{ SSLException -> 0x00a2 }
            if (r1 == r8) goto L_0x009b
            r3 = 2
            if (r1 == r3) goto L_0x008a
            r3 = 3
            if (r1 == r3) goto L_0x008d
            r3 = 4
            if (r1 == r3) goto L_0x0090
            r0 = 5
            if (r1 != r0) goto L_0x0072
            r6 = 1
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            goto L_0x003e
        L_0x0072:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x00a2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x00a2 }
            java.lang.String r3 = "Unknown handshake status: "
            r1.<init>(r3)     // Catch:{ SSLException -> 0x00a2 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ SSLException -> 0x00a2 }
            r1.append(r2)     // Catch:{ SSLException -> 0x00a2 }
            java.lang.String r1 = r1.toString()     // Catch:{ SSLException -> 0x00a2 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x00a2 }
            throw r0     // Catch:{ SSLException -> 0x00a2 }
        L_0x008a:
            r11.i()     // Catch:{ SSLException -> 0x00a2 }
        L_0x008d:
            r11.h()     // Catch:{ SSLException -> 0x00a2 }
        L_0x0090:
            r6 = 0
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r13
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ SSLException -> 0x00a2 }
            goto L_0x0005
        L_0x009b:
            r11.g()     // Catch:{ SSLException -> 0x00a2 }
            r3 = r9
            r4 = r10
            goto L_0x0007
        L_0x00a2:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a4:
            r0 = move-exception
            r3 = r9
            goto L_0x00b9
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b1
        L_0x00a9:
            r6 = 0
            r1 = r11
            r2 = r12
            goto L_0x003e
        L_0x00ad:
            r0 = move-exception
            goto L_0x00b9
        L_0x00af:
            r0 = move-exception
            r9 = r3
        L_0x00b1:
            r10 = r4
        L_0x00b2:
            r11.a(r12, r0, r8)     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r3 = r9
            r4 = r10
        L_0x00b9:
            r6 = 0
            r1 = r11
            r2 = r12
            r5 = r13
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x00c2
        L_0x00c1:
            throw r0
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wul.a(wpb, boolean):void");
    }

    private void a(wws<wot> wws) {
        if (this.l.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING) {
            final wws<wot> wws2 = this.w;
            if (E || !wws2.isDone()) {
                wpb wpb = this.k;
                try {
                    this.l.beginHandshake();
                    b(wpb, false);
                    wpb.o();
                } catch (Exception e2) {
                    b((Throwable) e2);
                }
                long j2 = this.C;
                if (j2 > 0 && !wws2.isDone()) {
                    final wwy a2 = wpb.d().a((Runnable) new Runnable() {
                        public final void run() {
                            if (!wws2.isDone()) {
                                wul.this.b((Throwable) wul.i);
                            }
                        }
                    }, j2, TimeUnit.MILLISECONDS);
                    wws2.c((wwk<? extends wwi<? super V>>) new wwj<wot>() {
                        public final void operationComplete(wwi<wot> wwi) {
                            a2.cancel(false);
                        }
                    });
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private boolean a(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!(th instanceof SSLException) && (th instanceof IOException) && this.x.isDone()) {
            if (g.matcher(String.valueOf(th.getMessage()).toLowerCase()).matches()) {
                return true;
            }
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (!className.startsWith("io.netty.") && "read".equals(methodName)) {
                    if (f.matcher(className).matches()) {
                        return true;
                    }
                    try {
                        Class loadClass = PlatformDependent.a(getClass()).loadClass(className);
                        if (!SocketChannel.class.isAssignableFrom(loadClass)) {
                            if (!DatagramChannel.class.isAssignableFrom(loadClass)) {
                                if (PlatformDependent.c() >= 7 && "com.sun.nio.sctp.SctpChannel".equals(loadClass.getSuperclass().getName())) {
                                }
                            }
                        }
                        return true;
                    } catch (ClassNotFoundException unused) {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r3 != javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        k(r18);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(defpackage.wpb r18, defpackage.wnb r19, int r20, int r21) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r0 = r21
            wnb r1 = r7.a(r8, r0)
            r9 = 0
            r10 = 1
            r11 = r0
            r12 = r1
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r20
        L_0x0013:
            boolean r1 = r18.r()     // Catch:{ SSLException -> 0x00dc }
            if (r1 != 0) goto L_0x00bb
            javax.net.ssl.SSLEngine r2 = r7.l     // Catch:{ SSLException -> 0x00dc }
            r1 = r17
            r3 = r19
            r4 = r0
            r5 = r11
            r6 = r12
            javax.net.ssl.SSLEngineResult r1 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ SSLException -> 0x00dc }
            javax.net.ssl.SSLEngineResult$Status r2 = r1.getStatus()     // Catch:{ SSLException -> 0x00dc }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r1.getHandshakeStatus()     // Catch:{ SSLException -> 0x00dc }
            int r4 = r1.bytesProduced()     // Catch:{ SSLException -> 0x00dc }
            int r1 = r1.bytesConsumed()     // Catch:{ SSLException -> 0x00dc }
            int r0 = r0 + r1
            int r11 = r11 - r1
            int[] r5 = defpackage.wul.AnonymousClass6.b     // Catch:{ SSLException -> 0x00dc }
            int r6 = r2.ordinal()     // Catch:{ SSLException -> 0x00dc }
            r5 = r5[r6]     // Catch:{ SSLException -> 0x00dc }
            if (r5 == r10) goto L_0x009c
            r6 = 2
            if (r5 == r6) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r15 = 1
        L_0x0047:
            int[] r5 = defpackage.wul.AnonymousClass6.a     // Catch:{ SSLException -> 0x00dc }
            int r16 = r3.ordinal()     // Catch:{ SSLException -> 0x00dc }
            r5 = r5[r16]     // Catch:{ SSLException -> 0x00dc }
            if (r5 == r10) goto L_0x0089
            if (r5 == r6) goto L_0x0084
            r6 = 3
            if (r5 == r6) goto L_0x0075
            r6 = 4
            if (r5 == r6) goto L_0x0071
            r6 = 5
            if (r5 != r6) goto L_0x005d
            goto L_0x008c
        L_0x005d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x00dc }
            java.lang.String r2 = "unknown handshake status: "
            r1.<init>(r2)     // Catch:{ SSLException -> 0x00dc }
            r1.append(r3)     // Catch:{ SSLException -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ SSLException -> 0x00dc }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x00dc }
            throw r0     // Catch:{ SSLException -> 0x00dc }
        L_0x0071:
            r7.b(r8, r10)     // Catch:{ SSLException -> 0x00dc }
            goto L_0x008c
        L_0x0075:
            boolean r5 = r17.h()     // Catch:{ SSLException -> 0x00dc }
            if (r5 == 0) goto L_0x007d
            r14 = 1
            goto L_0x0013
        L_0x007d:
            boolean r5 = r7.t     // Catch:{ SSLException -> 0x00dc }
            if (r5 == 0) goto L_0x008c
            r7.t = r9     // Catch:{ SSLException -> 0x00dc }
            goto L_0x0087
        L_0x0084:
            r17.i()     // Catch:{ SSLException -> 0x00dc }
        L_0x0087:
            r14 = 1
            goto L_0x008c
        L_0x0089:
            r17.g()     // Catch:{ SSLException -> 0x00dc }
        L_0x008c:
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ SSLException -> 0x00dc }
            if (r2 == r5) goto L_0x0094
            if (r1 != 0) goto L_0x0013
            if (r4 != 0) goto L_0x0013
        L_0x0094:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ SSLException -> 0x00dc }
            if (r3 != r0) goto L_0x00bb
            r17.k(r18)     // Catch:{ SSLException -> 0x00dc }
            goto L_0x00bb
        L_0x009c:
            int r1 = r12.g()     // Catch:{ SSLException -> 0x00dc }
            javax.net.ssl.SSLEngine r2 = r7.l     // Catch:{ SSLException -> 0x00dc }
            javax.net.ssl.SSLSession r2 = r2.getSession()     // Catch:{ SSLException -> 0x00dc }
            int r2 = r2.getApplicationBufferSize()     // Catch:{ SSLException -> 0x00dc }
            int r2 = r2 - r1
            if (r1 <= 0) goto L_0x00b2
            r8.d(r12)     // Catch:{ SSLException -> 0x00dc }
            r13 = 1
            goto L_0x00b5
        L_0x00b2:
            r12.B()     // Catch:{ SSLException -> 0x00dc }
        L_0x00b5:
            wnb r12 = r7.a(r8, r2)     // Catch:{ SSLException -> 0x00dc }
            goto L_0x0013
        L_0x00bb:
            if (r14 == 0) goto L_0x00c0
            r7.a(r8, r10)     // Catch:{ SSLException -> 0x00dc }
        L_0x00c0:
            if (r15 == 0) goto L_0x00cb
            wul$a r0 = r7.x     // Catch:{ SSLException -> 0x00dc }
            wot r1 = r18.a()     // Catch:{ SSLException -> 0x00dc }
            r0.b(r1)     // Catch:{ SSLException -> 0x00dc }
        L_0x00cb:
            boolean r0 = r12.f()
            if (r0 == 0) goto L_0x00d6
            r8.d(r12)
            r13 = 1
            goto L_0x00d9
        L_0x00d6:
            r12.B()
        L_0x00d9:
            return r13
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            r7.a(r8, r0, r10)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00e1:
            boolean r1 = r12.f()
            if (r1 == 0) goto L_0x00eb
            r8.d(r12)
            goto L_0x00ee
        L_0x00eb:
            r12.B()
        L_0x00ee:
            goto L_0x00f0
        L_0x00ef:
            throw r0
        L_0x00f0:
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wul.a(wpb, wnb, int, int):boolean");
    }

    private wnb b(wpb wpb, int i2) {
        return this.q ? a(wpb, this.m) : a(wpb, Math.min(i2 + 2329, this.m));
    }

    /* access modifiers changed from: private */
    public void b(Throwable th) {
        if (this.w.b(th)) {
            wun.a(this.k, th);
        }
    }

    private void b(wpb wpb, boolean z2) {
        wnc c = wpb.c();
        wnb wnb = null;
        while (!wpb.r()) {
            try {
                if (wnb == null) {
                    wnb = b(wpb, 0);
                }
                SSLEngineResult a2 = a(c, this.l, woc.a, wnb);
                if (a2.bytesProduced() > 0) {
                    wpb.a((Object) wnb);
                    if (z2) {
                        this.y = true;
                    }
                    wnb = null;
                }
                int i2 = AnonymousClass6.a[a2.getHandshakeStatus().ordinal()];
                if (i2 == 1) {
                    g();
                } else if (i2 == 2) {
                    i();
                } else if (i2 == 3) {
                    h();
                    if (!z2) {
                        m(wpb);
                    }
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        StringBuilder sb = new StringBuilder("Unknown handshake status: ");
                        sb.append(a2.getHandshakeStatus());
                        throw new IllegalStateException(sb.toString());
                    } else if (!z2) {
                        m(wpb);
                    }
                }
                if (a2.bytesProduced() == 0 || (a2.bytesConsumed() == 0 && a2.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING)) {
                    break;
                }
            } catch (SSLException e2) {
                a(wpb, (Throwable) e2, true);
                l(wpb);
                throw e2;
            } catch (Throwable th) {
                if (wnb != null) {
                    wnb.B();
                }
                throw th;
            }
        }
        if (wnb != null) {
            wnb.B();
        }
    }

    private void c(wpb wpb, wpo wpo) {
        this.v.a((Object) woc.a, wpo);
        d(wpb);
    }

    private void g() {
        if (this.n == wwn.a) {
            while (true) {
                Runnable delegatedTask = this.l.getDelegatedTask();
                if (delegatedTask == null) {
                    break;
                }
                delegatedTask.run();
            }
        } else {
            final ArrayList arrayList = new ArrayList(2);
            while (true) {
                Runnable delegatedTask2 = this.l.getDelegatedTask();
                if (delegatedTask2 == null) {
                    break;
                }
                arrayList.add(delegatedTask2);
            }
            if (!arrayList.isEmpty()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.n.execute(new Runnable() {
                    public final void run() {
                        try {
                            for (Runnable run : arrayList) {
                                run.run();
                            }
                        } catch (Exception e) {
                            wul.this.k.a((Throwable) e);
                        } catch (Throwable th) {
                            countDownLatch.countDown();
                            throw th;
                        }
                        countDownLatch.countDown();
                    }
                });
                boolean z2 = false;
                while (countDownLatch.getCount() != 0) {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private boolean h() {
        if (this.w.isDone()) {
            return false;
        }
        i();
        return true;
    }

    private void i() {
        this.w.b(this.k.a());
        if (e.b()) {
            e.b("{} HANDSHAKEN: {}", this.k.a(), this.l.getSession().getCipherSuite());
        }
        this.k.c(wum.a);
        if (this.u && !this.k.a().B().e()) {
            this.u = false;
            this.k.m();
        }
    }

    private void k(wpb wpb) {
        if (wpb.a().B().e()) {
            return;
        }
        if (!this.B || !this.w.isDone()) {
            wpb.m();
        }
    }

    private void l(wpb wpb) {
        if (this.y) {
            this.y = false;
            wpb.o();
        }
    }

    private void m(wpb wpb) {
        a(wpb, woc.a, 0, 0);
    }

    public final void a(wpb wpb) {
        if (!this.r && this.l.getUseClientMode()) {
            a(null);
        }
        wpb.g();
    }

    public final void a(wpb wpb, Object obj, wpo wpo) {
        if (!(obj instanceof wnb)) {
            wpo.a(new UnsupportedMessageTypeException(obj, wnb.class));
            return;
        }
        this.v.a(obj, wpo);
    }

    public final void a(wpb wpb, Throwable th) {
        if (a(th)) {
            if (e.b()) {
                e.b("{} Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify", wpb.a(), th);
            }
            if (wpb.a().D()) {
                wpb.i();
            }
        } else {
            wpb.a(th);
        }
    }

    public final void a(wpb wpb, SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        wpb.a(socketAddress, socketAddress2, wpo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r10 <= 5) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r10 <= r8) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wpb r13, defpackage.wnb r14, java.util.List<java.lang.Object> r15) {
        /*
            r12 = this;
            int r15 = r14.c()
            int r0 = r14.d()
            int r1 = r12.A
            r2 = 0
            if (r1 <= 0) goto L_0x0017
            int r3 = r0 - r15
            if (r3 >= r1) goto L_0x0012
            return
        L_0x0012:
            int r3 = r15 + r1
            r12.A = r2
            goto L_0x0019
        L_0x0017:
            r3 = r15
            r1 = 0
        L_0x0019:
            r4 = 18713(0x4919, float:2.6222E-41)
            r5 = 1
            if (r1 >= r4) goto L_0x0095
            int r6 = r0 - r3
            r7 = 5
            if (r6 < r7) goto L_0x0095
            short r8 = r14.g(r3)
            switch(r8) {
                case 20: goto L_0x002c;
                case 21: goto L_0x002c;
                case 22: goto L_0x002c;
                case 23: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r8 = 0
            goto L_0x002d
        L_0x002c:
            r8 = 1
        L_0x002d:
            r9 = 3
            if (r8 == 0) goto L_0x0045
            int r10 = r3 + 1
            short r10 = r14.g(r10)
            if (r10 != r9) goto L_0x0042
            int r10 = r3 + 3
            int r10 = r14.l(r10)
            int r10 = r10 + r7
            if (r10 > r7) goto L_0x0046
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            r8 = 0
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            r7 = -1
            if (r8 != 0) goto L_0x0078
            short r8 = r14.g(r3)
            r8 = r8 & 128(0x80, float:1.794E-43)
            r10 = 2
            if (r8 == 0) goto L_0x0054
            r8 = 2
            goto L_0x0055
        L_0x0054:
            r8 = 3
        L_0x0055:
            int r11 = r3 + r8
            int r11 = r11 + r5
            short r11 = r14.g(r11)
            if (r11 == r10) goto L_0x0063
            if (r11 != r9) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r10 = -1
            goto L_0x0078
        L_0x0063:
            if (r8 != r10) goto L_0x006e
            short r9 = r14.h(r3)
            r9 = r9 & 32767(0x7fff, float:4.5916E-41)
            int r9 = r9 + r10
            r10 = r9
            goto L_0x0075
        L_0x006e:
            short r10 = r14.h(r3)
            r10 = r10 & 16383(0x3fff, float:2.2957E-41)
            int r10 = r10 + r9
        L_0x0075:
            if (r10 > r8) goto L_0x0078
            goto L_0x0061
        L_0x0078:
            if (r10 != r7) goto L_0x007c
            r0 = 1
            goto L_0x0096
        L_0x007c:
            boolean r7 = E
            if (r7 != 0) goto L_0x0089
            if (r10 <= 0) goto L_0x0083
            goto L_0x0089
        L_0x0083:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x0089:
            if (r10 <= r6) goto L_0x008e
            r12.A = r10
            goto L_0x0095
        L_0x008e:
            int r6 = r1 + r10
            if (r6 > r4) goto L_0x0095
            int r3 = r3 + r10
            r1 = r6
            goto L_0x0019
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r1 <= 0) goto L_0x00a8
            r14.w(r1)
            boolean r15 = r12.a(r13, r14, r15, r1)
            if (r15 != 0) goto L_0x00a5
            boolean r15 = r12.B
            if (r15 == 0) goto L_0x00a6
        L_0x00a5:
            r2 = 1
        L_0x00a6:
            r12.B = r2
        L_0x00a8:
            if (r0 == 0) goto L_0x00ce
            io.netty.handler.ssl.NotSslRecordException r15 = new io.netty.handler.ssl.NotSslRecordException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "not an SSL/TLS record: "
            r0.<init>(r1)
            java.lang.String r1 = defpackage.wng.a(r14)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            int r0 = r14.g()
            r14.w(r0)
            r12.a(r13, r15, r5)
            r13.a(r15)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wul.a(wpb, wnb, java.util.List):void");
    }

    public final void a(wpb wpb, wpo wpo) {
        a(wpb, wpo, true);
    }

    public final void b(wpb wpb) {
        a(wpb, (Throwable) j, !this.z);
        super.b(wpb);
    }

    public final void b(wpb wpb, wpo wpo) {
        a(wpb, wpo, false);
    }

    public final void c() {
        if (!this.v.a()) {
            this.v.a(new ChannelException("Pending write on removal of SslHandler"));
        }
        SSLEngine sSLEngine = this.l;
        if (sSLEngine instanceof ReferenceCountedOpenSslEngine) {
            ((ReferenceCountedOpenSslEngine) sSLEngine).B();
        }
    }

    public final void c(wpb wpb) {
        if (!this.w.isDone()) {
            this.u = true;
        }
        wpb.m();
    }

    public final void d(wpb wpb) {
        if (!this.r || this.s) {
            if (this.v.a()) {
                this.v.a((Object) woc.a, wpb.k());
            }
            if (!this.w.isDone()) {
                this.t = true;
            }
            try {
                a(wpb, false);
            } catch (Throwable th) {
                this.v.a(th);
                PlatformDependent.a(th);
            } finally {
                wpb.o();
            }
        } else {
            this.s = true;
            this.v.b();
            wpb.o();
        }
    }

    public final void e(wpb wpb) {
        this.k = wpb;
        this.v = new wqg(wpb);
        if (wpb.a().D() && this.l.getUseClientMode()) {
            a(null);
        }
    }

    public final void i(wpb wpb) {
        d();
        l(wpb);
        k(wpb);
        this.B = false;
        wpb.j();
    }
}
