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

/* renamed from: wcl reason: default package */
public abstract class wcl extends AbstractChannel {
    private static final wjw g;
    private static final ClosedChannelException h;
    private static /* synthetic */ boolean m;
    final SelectableChannel c;
    protected final int d;
    volatile SelectionKey e;
    boolean f;
    private final Runnable i = new Runnable() {
        public final void run() {
            wcl.this.F();
        }
    };
    /* access modifiers changed from: private */
    public wbi j;
    /* access modifiers changed from: private */
    public ScheduledFuture<?> k;
    /* access modifiers changed from: private */
    public SocketAddress l;

    /* renamed from: wcl$a */
    public abstract class a extends io.netty.channel.AbstractChannel.a implements b {
        private static /* synthetic */ boolean c = (!wcl.class.desiredAssertionStatus());

        protected a() {
            super();
        }

        /* access modifiers changed from: protected */
        public final void m() {
            SelectionKey L = wcl.this.L();
            if (L.isValid()) {
                int interestOps = L.interestOps();
                if ((wcl.this.d & interestOps) != 0) {
                    L.interestOps(interestOps & (wcl.this.d ^ -1));
                }
            }
        }

        public final void a(final SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
            if (wbi.aY_() && c(wbi)) {
                try {
                    if (wcl.this.j == null) {
                        boolean D = wcl.this.D();
                        if (wcl.this.a(socketAddress, socketAddress2)) {
                            a(wbi, D);
                        } else {
                            wcl.this.j = wbi;
                            wcl.this.l = socketAddress;
                            int a = wcl.this.B().a();
                            if (a > 0) {
                                wcl.this.k = wcl.this.K().a((Runnable) new Runnable() {
                                    public final void run() {
                                        wbi b2 = wcl.this.j;
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
                            wbi.b(new was() {
                                public final /* synthetic */ void operationComplete(wic wic) {
                                    if (((war) wic).isCancelled()) {
                                        if (wcl.this.k != null) {
                                            wcl.this.k.cancel(false);
                                        }
                                        wcl.this.j = null;
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
                    wbi.b(a(th, socketAddress));
                    j();
                }
            }
        }

        private void a(wbi wbi, boolean z) {
            if (wbi != null) {
                boolean D = wcl.this.D();
                boolean aU_ = wbi.aU_();
                if (!z && D) {
                    wcl.this.a.b();
                }
                if (!aU_) {
                    b(i());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            if (defpackage.wcl.c(r5.b) != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
            defpackage.wcl.c(r5.b).cancel(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            defpackage.wcl.a(r5.b, (defpackage.wbi) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
            if (defpackage.wcl.c(r5.b) == null) goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void n() {
            /*
                r5 = this;
                boolean r0 = c
                if (r0 != 0) goto L_0x001b
                wcl r0 = defpackage.wcl.this
                wcm r0 = r0.K()
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
                wcl r2 = defpackage.wcl.this     // Catch:{ all -> 0x0048 }
                boolean r2 = r2.D()     // Catch:{ all -> 0x0048 }
                wcl r3 = defpackage.wcl.this     // Catch:{ all -> 0x0048 }
                r3.N()     // Catch:{ all -> 0x0048 }
                wcl r3 = defpackage.wcl.this     // Catch:{ all -> 0x0048 }
                wbi r3 = r3.j     // Catch:{ all -> 0x0048 }
                r5.a(r3, r2)     // Catch:{ all -> 0x0048 }
                wcl r2 = defpackage.wcl.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                if (r2 == 0) goto L_0x0042
            L_0x0039:
                wcl r2 = defpackage.wcl.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                r2.cancel(r0)
            L_0x0042:
                wcl r0 = defpackage.wcl.this
                r0.j = r1
                return
            L_0x0048:
                r2 = move-exception
                wcl r3 = defpackage.wcl.this     // Catch:{ all -> 0x006a }
                wbi r3 = r3.j     // Catch:{ all -> 0x006a }
                wcl r4 = defpackage.wcl.this     // Catch:{ all -> 0x006a }
                java.net.SocketAddress r4 = r4.l     // Catch:{ all -> 0x006a }
                java.lang.Throwable r2 = a(r2, r4)     // Catch:{ all -> 0x006a }
                if (r3 == 0) goto L_0x0061
                r3.b(r2)     // Catch:{ all -> 0x006a }
                r5.j()     // Catch:{ all -> 0x006a }
            L_0x0061:
                wcl r2 = defpackage.wcl.this
                java.util.concurrent.ScheduledFuture r2 = r2.k
                if (r2 == 0) goto L_0x0042
                goto L_0x0039
            L_0x006a:
                r2 = move-exception
                wcl r3 = defpackage.wcl.this
                java.util.concurrent.ScheduledFuture r3 = r3.k
                if (r3 == 0) goto L_0x007c
                wcl r3 = defpackage.wcl.this
                java.util.concurrent.ScheduledFuture r3 = r3.k
                r3.cancel(r0)
            L_0x007c:
                wcl r0 = defpackage.wcl.this
                r0.j = r1
                goto L_0x0083
            L_0x0082:
                throw r2
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wcl.a.n():void");
        }

        public final void o() {
            super.h();
        }

        public final void h() {
            SelectionKey L = wcl.this.L();
            if (!(L.isValid() && (L.interestOps() & 4) != 0)) {
                super.h();
            }
        }
    }

    /* renamed from: wcl$b */
    public interface b extends defpackage.wan.a {
        void l();

        void n();

        void o();
    }

    /* access modifiers changed from: protected */
    public abstract void N();

    /* access modifiers changed from: protected */
    public abstract boolean a(SocketAddress socketAddress, SocketAddress socketAddress2);

    static {
        Class<wcl> cls = wcl.class;
        m = !cls.desiredAssertionStatus();
        g = wjx.a(cls);
        h = (ClosedChannelException) wjp.a(new ClosedChannelException(), cls, "doClose()");
    }

    protected wcl(wan wan, SelectableChannel selectableChannel, int i2) {
        super(wan);
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

    public final boolean C() {
        return this.c.isOpen();
    }

    public final b I() {
        return (b) super.l();
    }

    public SelectableChannel J() {
        return this.c;
    }

    public final wcm K() {
        return (wcm) super.e();
    }

    /* access modifiers changed from: protected */
    public final SelectionKey L() {
        if (m || this.e != null) {
            return this.e;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public void F() {
        this.f = false;
        ((a) ((b) super.l())).m();
    }

    public final boolean a(wbu wbu) {
        return wbu instanceof wcm;
    }

    public final void q() {
        boolean z = false;
        while (true) {
            try {
                this.e = J().register(((wcm) super.e()).b, 0, this);
                return;
            } catch (CancelledKeyException e2) {
                if (!z) {
                    ((wcm) super.e()).i();
                    z = true;
                } else {
                    throw e2;
                }
            }
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

    public void s() {
        wbi wbi = this.j;
        if (wbi != null) {
            wbi.b((Throwable) h);
            this.j = null;
        }
        ScheduledFuture<?> scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.k = null;
        }
    }

    public final void M() {
        if (this.b) {
            wcm wcm = (wcm) super.e();
            if (wcm.j()) {
                F();
            } else {
                wcm.execute(this.i);
            }
        } else {
            this.f = false;
        }
    }

    public final void t() {
        wcm wcm = (wcm) super.e();
        L().cancel();
        wcm.c++;
        if (wcm.c >= 256) {
            wcm.c = 0;
            wcm.d = true;
        }
    }

    public final /* bridge */ /* synthetic */ defpackage.wan.a l() {
        return (b) super.l();
    }

    public final /* bridge */ /* synthetic */ wbu e() {
        return (wcm) super.e();
    }
}
