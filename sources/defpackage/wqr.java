package defpackage;

import io.netty.channel.AbstractChannel;
import io.netty.channel.ChannelException;
import io.netty.channel.ConnectTimeoutException;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: wqr reason: default package */
public abstract class wqr extends AbstractChannel {
    private static final wyc g;
    private static final ClosedChannelException h;
    private static /* synthetic */ boolean m;
    final SelectableChannel c;
    protected final int d;
    volatile SelectionKey e;
    boolean f;
    private final Runnable i = new Runnable() {
        public final void run() {
            wqr.this.F();
        }
    };
    /* access modifiers changed from: private */
    public wpo j;
    /* access modifiers changed from: private */
    public ScheduledFuture<?> k;
    /* access modifiers changed from: private */
    public SocketAddress l;

    /* renamed from: wqr$a */
    public abstract class a extends io.netty.channel.AbstractChannel.a implements b {
        private static /* synthetic */ boolean c = (!wqr.class.desiredAssertionStatus());

        protected a() {
            super();
        }

        private void a(wpo wpo, boolean z) {
            if (wpo != null) {
                boolean D = wqr.this.D();
                boolean aS_ = wpo.aS_();
                if (!z && D) {
                    wqr.this.a.b();
                }
                if (!aS_) {
                    b(i());
                }
            }
        }

        public final void a(final SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
            if (wpo.aW_() && c(wpo)) {
                try {
                    if (wqr.this.j == null) {
                        boolean D = wqr.this.D();
                        if (wqr.this.a(socketAddress, socketAddress2)) {
                            a(wpo, D);
                        } else {
                            wqr.this.j = wpo;
                            wqr.this.l = socketAddress;
                            int a = wqr.this.B().a();
                            if (a > 0) {
                                wqr.this.k = wqr.this.K().a((Runnable) new Runnable() {
                                    public final void run() {
                                        wpo b2 = wqr.this.j;
                                        StringBuilder sb = new StringBuilder("connection timed out: ");
                                        sb.append(socketAddress);
                                        ConnectTimeoutException connectTimeoutException = new ConnectTimeoutException(sb.toString());
                                        if (b2 != null && b2.b((Throwable) connectTimeoutException)) {
                                            a aVar = a.this;
                                            aVar.b(aVar.i());
                                        }
                                    }
                                }, (long) a, TimeUnit.MILLISECONDS);
                            }
                            wpo.b(new woy() {
                                public final /* synthetic */ void operationComplete(wwi wwi) {
                                    if (((wox) wwi).isCancelled()) {
                                        if (wqr.this.k != null) {
                                            wqr.this.k.cancel(false);
                                        }
                                        wqr.this.j = null;
                                        a aVar = a.this;
                                        aVar.b(aVar.i());
                                    }
                                }
                            });
                        }
                    } else {
                        throw new ConnectionPendingException();
                    }
                } catch (Throwable th) {
                    wpo.b(a(th, socketAddress));
                    j();
                }
            }
        }

        public final void h() {
            SelectionKey L = wqr.this.L();
            if (!(L.isValid() && (L.interestOps() & 4) != 0)) {
                super.h();
            }
        }

        /* access modifiers changed from: protected */
        public final void m() {
            SelectionKey L = wqr.this.L();
            if (L.isValid()) {
                int interestOps = L.interestOps();
                if ((wqr.this.d & interestOps) != 0) {
                    L.interestOps(interestOps & (wqr.this.d ^ -1));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            if (defpackage.wqr.c(r5.b) != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
            defpackage.wqr.c(r5.b).cancel(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            defpackage.wqr.a(r5.b, (defpackage.wpo) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
            if (defpackage.wqr.c(r5.b) == null) goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void n() {
            /*
                r5 = this;
                boolean r0 = c
                if (r0 != 0) goto L_0x001b
                wqr r0 = defpackage.wqr.this
                wqs r0 = r0.K()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                boolean r0 = r0.a(r1)
                if (r0 == 0) goto L_0x0015
                goto L_0x001b
            L_0x0015:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x001b:
                r0 = 0
                r1 = 0
                wqr r2 = defpackage.wqr.this     // Catch:{ all -> 0x0048 }
                boolean r2 = r2.D()     // Catch:{ all -> 0x0048 }
                wqr r3 = defpackage.wqr.this     // Catch:{ all -> 0x0048 }
                r3.N()     // Catch:{ all -> 0x0048 }
                wqr r3 = defpackage.wqr.this     // Catch:{ all -> 0x0048 }
                wpo r3 = r3.j     // Catch:{ all -> 0x0048 }
                r5.a(r3, r2)     // Catch:{ all -> 0x0048 }
                wqr r2 = defpackage.wqr.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                if (r2 == 0) goto L_0x0042
            L_0x0039:
                wqr r2 = defpackage.wqr.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                r2.cancel(r0)
            L_0x0042:
                wqr r0 = defpackage.wqr.this
                r0.j = r1
                return
            L_0x0048:
                r2 = move-exception
                wqr r3 = defpackage.wqr.this     // Catch:{ all -> 0x006a }
                wpo r3 = r3.j     // Catch:{ all -> 0x006a }
                wqr r4 = defpackage.wqr.this     // Catch:{ all -> 0x006a }
                java.net.SocketAddress r4 = r4.l     // Catch:{ all -> 0x006a }
                java.lang.Throwable r2 = a(r2, r4)     // Catch:{ all -> 0x006a }
                if (r3 == 0) goto L_0x0061
                r3.b(r2)     // Catch:{ all -> 0x006a }
                r5.j()     // Catch:{ all -> 0x006a }
            L_0x0061:
                wqr r2 = defpackage.wqr.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                if (r2 == 0) goto L_0x0042
                goto L_0x0039
            L_0x006a:
                r2 = move-exception
                wqr r3 = defpackage.wqr.this
                java.util.concurrent.ScheduledFuture r3 = r3.k
                if (r3 == 0) goto L_0x007c
                wqr r3 = defpackage.wqr.this
                java.util.concurrent.ScheduledFuture r3 = r3.k
                r3.cancel(r0)
            L_0x007c:
                wqr r0 = defpackage.wqr.this
                r0.j = r1
                goto L_0x0083
            L_0x0082:
                throw r2
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wqr.a.n():void");
        }

        public final void o() {
            super.h();
        }
    }

    /* renamed from: wqr$b */
    public interface b extends defpackage.wot.a {
        void l();

        void n();

        void o();
    }

    static {
        Class<wqr> cls = wqr.class;
        m = !cls.desiredAssertionStatus();
        g = wyd.a(cls);
        h = (ClosedChannelException) wxv.a(new ClosedChannelException(), cls, "doClose()");
    }

    protected wqr(wot wot, SelectableChannel selectableChannel, int i2) {
        super(wot);
        this.c = selectableChannel;
        this.d = 1;
        try {
            selectableChannel.configureBlocking(false);
        } catch (IOException e2) {
            try {
                selectableChannel.close();
            } catch (IOException e3) {
                if (g.d()) {
                    g.d("Failed to close a partially initialized socket.", (Throwable) e3);
                }
            }
            throw new ChannelException("Failed to enter non-blocking mode.", e2);
        }
    }

    /* access modifiers changed from: private */
    public void F() {
        this.f = false;
        ((a) ((b) super.l())).m();
    }

    public final boolean C() {
        return this.c.isOpen();
    }

    public final b I() {
        return (b) super.l();
    }

    public SelectableChannel J() {
        return this.c;
    }

    public final wqs K() {
        return (wqs) super.e();
    }

    /* access modifiers changed from: protected */
    public final SelectionKey L() {
        if (m || this.e != null) {
            return this.e;
        }
        throw new AssertionError();
    }

    public final void M() {
        if (this.b) {
            wqs wqs = (wqs) super.e();
            if (wqs.j()) {
                F();
            } else {
                wqs.execute(this.i);
            }
        } else {
            this.f = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void N();

    /* access modifiers changed from: protected */
    public abstract boolean a(SocketAddress socketAddress, SocketAddress socketAddress2);

    public final boolean a(wqa wqa) {
        return wqa instanceof wqs;
    }

    public final /* bridge */ /* synthetic */ wqa e() {
        return (wqs) super.e();
    }

    public final /* bridge */ /* synthetic */ defpackage.wot.a l() {
        return (b) super.l();
    }

    public final void q() {
        boolean z = false;
        while (true) {
            try {
                this.e = J().register(((wqs) super.e()).b, 0, this);
                return;
            } catch (CancelledKeyException e2) {
                if (!z) {
                    ((wqs) super.e()).i();
                    z = true;
                } else {
                    throw e2;
                }
            }
        }
    }

    public void s() {
        wpo wpo = this.j;
        if (wpo != null) {
            wpo.b((Throwable) h);
            this.j = null;
        }
        ScheduledFuture<?> scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.k = null;
        }
    }

    public final void t() {
        wqs wqs = (wqs) super.e();
        L().cancel();
        wqs.c++;
        if (wqs.c >= 256) {
            wqs.c = 0;
            wqs.d = true;
        }
    }

    public final void u() {
        SelectionKey selectionKey = this.e;
        if (selectionKey.isValid()) {
            this.f = true;
            int interestOps = selectionKey.interestOps();
            int i2 = this.d;
            if ((interestOps & i2) == 0) {
                selectionKey.interestOps(interestOps | i2);
            }
        }
    }
}
