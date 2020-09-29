package io.netty.channel;

import io.netty.util.DefaultAttributeMap;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class AbstractChannel extends DefaultAttributeMap implements wot {
    /* access modifiers changed from: private */
    public static final wyc c = wyd.a(AbstractChannel.class);
    /* access modifiers changed from: private */
    public static final ClosedChannelException d;
    /* access modifiers changed from: private */
    public static final ClosedChannelException e = ((ClosedChannelException) wxv.a(new ClosedChannelException(), a.class, "ensureOpen(...)"));
    /* access modifiers changed from: private */
    public static final ClosedChannelException f = ((ClosedChannelException) wxv.a(new ClosedChannelException(), a.class, "close(...)"));
    /* access modifiers changed from: private */
    public static final ClosedChannelException g = ((ClosedChannelException) wxv.a(new ClosedChannelException(), a.class, "write(...)"));
    /* access modifiers changed from: private */
    public static final NotYetConnectedException h;
    public final wpu a;
    /* access modifiers changed from: protected */
    public volatile boolean b;
    private final wot i;
    private final ChannelId j;
    private final defpackage.wot.a k;
    /* access modifiers changed from: private */
    public final wqo l = new wqo(this, false);
    /* access modifiers changed from: private */
    public final b m = new b(this);
    private volatile SocketAddress n;
    private volatile SocketAddress o;
    /* access modifiers changed from: private */
    public volatile wqa p;
    private boolean q;
    private String r;

    static final class AnnotatedConnectException extends ConnectException {
        private static final long serialVersionUID = 3901958112696433556L;

        AnnotatedConnectException(ConnectException connectException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(connectException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(connectException.getStackTrace());
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    static final class AnnotatedNoRouteToHostException extends NoRouteToHostException {
        private static final long serialVersionUID = -6801433937592080623L;

        AnnotatedNoRouteToHostException(NoRouteToHostException noRouteToHostException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(noRouteToHostException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(noRouteToHostException.getStackTrace());
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    static final class AnnotatedSocketException extends SocketException {
        private static final long serialVersionUID = 3896743275010454039L;

        AnnotatedSocketException(SocketException socketException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(socketException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(socketException.getStackTrace());
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public abstract class a implements defpackage.wot.a {
        private static /* synthetic */ boolean f = (!AbstractChannel.class.desiredAssertionStatus());
        private volatile wph b = new wph(AbstractChannel.this);
        private defpackage.wqh.a c;
        private boolean d;
        private boolean e = true;

        protected a() {
        }

        protected static Throwable a(Throwable th, SocketAddress socketAddress) {
            return th instanceof ConnectException ? new AnnotatedConnectException((ConnectException) th, socketAddress) : th instanceof NoRouteToHostException ? new AnnotatedNoRouteToHostException((NoRouteToHostException) th, socketAddress) : th instanceof SocketException ? new AnnotatedSocketException((SocketException) th, socketAddress) : th;
        }

        /* access modifiers changed from: private */
        public void a(Runnable runnable) {
            try {
                AbstractChannel.this.e().execute(runnable);
            } catch (RejectedExecutionException e2) {
                AbstractChannel.c.d("Can't invoke task later as EventLoop rejected it", (Throwable) e2);
            }
        }

        private static void a(wpo wpo, Throwable th) {
            if (!(wpo instanceof wqo) && !wpo.b(th)) {
                AbstractChannel.c.c("Failed to mark a promise as failure because it's done already: {}", wpo, th);
            }
        }

        /* JADX INFO: finally extract failed */
        private void a(final wpo wpo, Throwable th, ClosedChannelException closedChannelException, boolean z) {
            if (wpo.aW_()) {
                final wph wph = this.b;
                if (wph == null) {
                    if (!(wpo instanceof wqo)) {
                        AbstractChannel.this.m.b((wwk<? extends wwi<? super Void>>) new woy() {
                            public final /* synthetic */ void operationComplete(wwi wwi) {
                                wpo.b();
                            }
                        });
                    }
                } else if (AbstractChannel.this.m.isDone()) {
                    d(wpo);
                } else {
                    final boolean D = AbstractChannel.this.D();
                    this.b = null;
                    Executor k = k();
                    if (k != null) {
                        final wpo wpo2 = wpo;
                        final Throwable th2 = th;
                        final ClosedChannelException closedChannelException2 = closedChannelException;
                        AnonymousClass4 r0 = new Runnable(false) {
                            public final void run() {
                                try {
                                    a.this.f(wpo2);
                                } finally {
                                    a.this.a((Runnable) new Runnable() {
                                        public final void run() {
                                            wph.a(th2, false);
                                            wph.a(closedChannelException2);
                                            a.this.a(D);
                                        }
                                    });
                                }
                            }
                        };
                        k.execute(r0);
                        return;
                    }
                    try {
                        f(wpo);
                        wph.a(th, false);
                        wph.a(closedChannelException);
                        if (this.d) {
                            a((Runnable) new Runnable() {
                                public final void run() {
                                    a.this.a(D);
                                }
                            });
                        } else {
                            a(D);
                        }
                    } catch (Throwable th3) {
                        wph.a(th, false);
                        wph.a(closedChannelException);
                        throw th3;
                    }
                }
            }
        }

        private void a(final wpo wpo, final boolean z) {
            if (wpo.aW_()) {
                if (!AbstractChannel.this.b) {
                    d(wpo);
                } else {
                    a((Runnable) new Runnable() {
                        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
                            if (io.netty.channel.AbstractChannel.a(r4.c.a) == false) goto L_0x0033;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
                            if (io.netty.channel.AbstractChannel.a(r4.c.a) != false) goto L_0x0021;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
                            io.netty.channel.AbstractChannel.a(r4.c.a, false);
                            io.netty.channel.AbstractChannel.d(r4.c.a).g();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
                            io.netty.channel.AbstractChannel.a.d(r2);
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r4 = this;
                                r0 = 0
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this     // Catch:{ all -> 0x0039 }
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this     // Catch:{ all -> 0x0039 }
                                r1.t()     // Catch:{ all -> 0x0039 }
                                boolean r1 = r3
                                if (r1 == 0) goto L_0x0017
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                wpu r1 = r1.a
                                r1.h()
                            L_0x0017:
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                boolean r1 = r1.b
                                if (r1 == 0) goto L_0x0033
                            L_0x0021:
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                r1.b = r0
                                io.netty.channel.AbstractChannel$a r0 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r0 = io.netty.channel.AbstractChannel.this
                                wpu r0 = r0.a
                                r0.g()
                            L_0x0033:
                                wpo r0 = r2
                                io.netty.channel.AbstractChannel.a.d(r0)
                                return
                            L_0x0039:
                                r1 = move-exception
                                wyc r2 = io.netty.channel.AbstractChannel.c     // Catch:{ all -> 0x005d }
                                java.lang.String r3 = "Unexpected exception occurred while deregistering a channel."
                                r2.d(r3, r1)     // Catch:{ all -> 0x005d }
                                boolean r1 = r3
                                if (r1 == 0) goto L_0x0052
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                wpu r1 = r1.a
                                r1.h()
                            L_0x0052:
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                boolean r1 = r1.b
                                if (r1 == 0) goto L_0x0033
                                goto L_0x0021
                            L_0x005d:
                                r1 = move-exception
                                boolean r2 = r3
                                if (r2 == 0) goto L_0x006d
                                io.netty.channel.AbstractChannel$a r2 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r2 = io.netty.channel.AbstractChannel.this
                                wpu r2 = r2.a
                                r2.h()
                            L_0x006d:
                                io.netty.channel.AbstractChannel$a r2 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r2 = io.netty.channel.AbstractChannel.this
                                boolean r2 = r2.b
                                if (r2 == 0) goto L_0x0089
                                io.netty.channel.AbstractChannel$a r2 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r2 = io.netty.channel.AbstractChannel.this
                                r2.b = r0
                                io.netty.channel.AbstractChannel$a r0 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r0 = io.netty.channel.AbstractChannel.this
                                wpu r0 = r0.a
                                r0.g()
                            L_0x0089:
                                wpo r0 = r2
                                io.netty.channel.AbstractChannel.a.d(r0)
                                goto L_0x0090
                            L_0x008f:
                                throw r1
                            L_0x0090:
                                goto L_0x008f
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.netty.channel.AbstractChannel.a.AnonymousClass6.run():void");
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: private */
        public void a(boolean z) {
            a(i(), z && !AbstractChannel.this.D());
        }

        protected static void d(wpo wpo) {
            if (!(wpo instanceof wqo) && !wpo.aS_()) {
                AbstractChannel.c.c("Failed to mark a promise as success because it is done already: {}", (Object) wpo);
            }
        }

        /* access modifiers changed from: private */
        public void e(wpo wpo) {
            try {
                if (wpo.aW_()) {
                    if (c(wpo)) {
                        boolean z = this.e;
                        AbstractChannel.this.q();
                        this.e = false;
                        AbstractChannel.this.b = true;
                        AbstractChannel.this.a.f();
                        d(wpo);
                        AbstractChannel.this.a.a();
                        if (AbstractChannel.this.D()) {
                            if (z) {
                                AbstractChannel.this.a.b();
                            } else if (AbstractChannel.this.B().e()) {
                                f();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                e();
                AbstractChannel.this.m.aY_();
                a(wpo, th);
            }
        }

        /* access modifiers changed from: private */
        public void f(wpo wpo) {
            try {
                AbstractChannel.this.s();
                AbstractChannel.this.m.aY_();
                d(wpo);
            } catch (Throwable th) {
                AbstractChannel.this.m.aY_();
                a(wpo, th);
            }
        }

        private void m() {
            if (!f && AbstractChannel.this.b && !AbstractChannel.this.p.j()) {
                throw new AssertionError();
            }
        }

        public final defpackage.wqh.a a() {
            if (this.c == null) {
                this.c = AbstractChannel.this.B().d().a();
            }
            return this.c;
        }

        public final void a(Object obj, wpo wpo) {
            m();
            wph wph = this.b;
            if (wph == null) {
                a(wpo, (Throwable) AbstractChannel.g);
                wvn.a(obj);
                return;
            }
            try {
                Object c2 = AbstractChannel.this.c(obj);
                int a2 = AbstractChannel.this.a.e().a(c2);
                if (a2 < 0) {
                    a2 = 0;
                }
                defpackage.wph.a a3 = defpackage.wph.a.a(c2, a2, wph.a(c2), wpo);
                if (wph.d == null) {
                    wph.b = null;
                    wph.d = a3;
                } else {
                    wph.d.a = a3;
                    wph.d = a3;
                }
                if (wph.c == null) {
                    wph.c = a3;
                }
                wph.a((long) a2, false);
            } catch (Throwable th) {
                a(wpo, th);
                wvn.a(obj);
            }
        }

        public final void a(wpo wpo) {
            m();
            if (wpo.aW_()) {
                boolean D = AbstractChannel.this.D();
                try {
                    AbstractChannel.this.r();
                    if (D && !AbstractChannel.this.D()) {
                        a((Runnable) new Runnable() {
                            public final void run() {
                                AbstractChannel.this.a.h();
                            }
                        });
                    }
                    d(wpo);
                    j();
                } catch (Throwable th) {
                    a(wpo, th);
                    j();
                }
            }
        }

        public final void a(wqa wqa, final wpo wpo) {
            if (AbstractChannel.this.b) {
                wpo.a(new IllegalStateException("registered to an event loop already"));
            } else if (!AbstractChannel.this.a(wqa)) {
                StringBuilder sb = new StringBuilder("incompatible event loop type: ");
                sb.append(wqa.getClass().getName());
                wpo.a(new IllegalStateException(sb.toString()));
            } else {
                AbstractChannel.this.p = wqa;
                if (wqa.j()) {
                    e(wpo);
                    return;
                }
                try {
                    wqa.execute(new Runnable() {
                        public final void run() {
                            a.this.e(wpo);
                        }
                    });
                } catch (Throwable th) {
                    AbstractChannel.c.c("Force-closing a channel whose registration task was not accepted by an event loop: {}", AbstractChannel.this, th);
                    e();
                    AbstractChannel.this.m.aY_();
                    a(wpo, th);
                }
            }
        }

        public final wph b() {
            return this.b;
        }

        public final void b(wpo wpo) {
            m();
            a(wpo, AbstractChannel.f, AbstractChannel.f, false);
        }

        public final SocketAddress c() {
            return AbstractChannel.this.o();
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public final boolean c(wpo wpo) {
            if (AbstractChannel.this.C()) {
                return true;
            }
            a(wpo, (Throwable) AbstractChannel.e);
            return false;
        }

        public final SocketAddress d() {
            return AbstractChannel.this.p();
        }

        public final void e() {
            m();
            try {
                AbstractChannel.this.s();
            } catch (Exception e2) {
                AbstractChannel.c.d("Failed to close a channel.", (Throwable) e2);
            }
        }

        public final void f() {
            m();
            if (AbstractChannel.this.D()) {
                try {
                    AbstractChannel.this.u();
                } catch (Exception e2) {
                    a((Runnable) new Runnable() {
                        public final void run() {
                            AbstractChannel.this.a.a((Throwable) e2);
                        }
                    });
                    b(i());
                }
            }
        }

        public final void g() {
            int i;
            m();
            wph wph = this.b;
            if (wph != null) {
                defpackage.wph.a aVar = wph.c;
                if (aVar != null) {
                    if (wph.b == null) {
                        wph.b = aVar;
                    }
                    do {
                        wph.e++;
                        if (!aVar.e.aW_()) {
                            if (!aVar.j) {
                                aVar.j = true;
                                i = aVar.h;
                                wvn.b(aVar.b);
                                aVar.b = woc.a;
                                aVar.h = 0;
                                aVar.g = 0;
                                aVar.f = 0;
                                aVar.c = null;
                                aVar.d = null;
                            } else {
                                i = 0;
                            }
                            wph.a((long) i, false, true);
                        }
                        aVar = aVar.a;
                    } while (aVar != null);
                    wph.c = null;
                }
                h();
            }
        }

        /* access modifiers changed from: protected */
        public void h() {
            if (!this.d) {
                wph wph = this.b;
                if (wph != null && !wph.c()) {
                    this.d = true;
                    if (!AbstractChannel.this.D()) {
                        try {
                            if (AbstractChannel.this.C()) {
                                wph.a((Throwable) AbstractChannel.h, true);
                            } else {
                                wph.a((Throwable) AbstractChannel.d, false);
                            }
                        } finally {
                            this.d = false;
                        }
                    } else {
                        try {
                            AbstractChannel.this.a(wph);
                        } catch (Throwable th) {
                            if (!(th instanceof IOException) || !AbstractChannel.this.B().f()) {
                                wph.a(th, true);
                            } else {
                                a(i(), th, AbstractChannel.d, false);
                            }
                        } finally {
                            this.d = false;
                        }
                    }
                }
            }
        }

        public final wpo i() {
            m();
            return AbstractChannel.this.l;
        }

        /* access modifiers changed from: protected */
        public final void j() {
            if (!AbstractChannel.this.C()) {
                b(i());
            }
        }

        /* access modifiers changed from: protected */
        public Executor k() {
            return null;
        }
    }

    public static final class b extends wpv {
        b(AbstractChannel abstractChannel) {
            super(abstractChannel);
        }

        public final wpo a(Throwable th) {
            throw new IllegalStateException();
        }

        public final boolean aS_() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final boolean aY_() {
            return super.aS_();
        }

        public final wpo b() {
            throw new IllegalStateException();
        }

        public final boolean b(Throwable th) {
            throw new IllegalStateException();
        }

        public final /* synthetic */ wws c(Throwable th) {
            throw new IllegalStateException();
        }
    }

    static {
        String str = "flush0()";
        d = (ClosedChannelException) wxv.a(new ClosedChannelException(), a.class, str);
        h = (NotYetConnectedException) wxv.a(new NotYetConnectedException(), a.class, str);
    }

    protected AbstractChannel(wot wot) {
        this.i = wot;
        this.j = DefaultChannelId.b();
        this.k = m();
        this.a = new wpu(this);
    }

    public final ChannelId a() {
        return this.j;
    }

    public final wox a(Object obj) {
        return this.a.a(obj);
    }

    public final wox a(Object obj, wpo wpo) {
        return this.a.a(obj, wpo);
    }

    public final wox a(SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        return this.a.a(socketAddress, socketAddress2, wpo);
    }

    public final wox a(SocketAddress socketAddress, wpo wpo) {
        return this.a.a(socketAddress, wpo);
    }

    public final wox a(wpo wpo) {
        return this.a.a(wpo);
    }

    /* access modifiers changed from: protected */
    public abstract void a(wph wph);

    /* access modifiers changed from: protected */
    public abstract boolean a(wqa wqa);

    public final wox b(Object obj) {
        return this.a.b(obj);
    }

    public final wox b(wpo wpo) {
        return this.a.b(wpo);
    }

    public final boolean b() {
        wph b2 = this.k.b();
        if (b2 != null) {
            if (b2.h == 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object c(Object obj) {
        return obj;
    }

    public final wpl c() {
        return this.a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        wot wot = (wot) obj;
        if (this == wot) {
            return 0;
        }
        return this.j.compareTo(wot.a());
    }

    public final wnc d() {
        return B().c();
    }

    public wqa e() {
        wqa wqa = this.p;
        if (wqa != null) {
            return wqa;
        }
        throw new IllegalStateException("channel not registered to an event loop");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public SocketAddress f() {
        SocketAddress socketAddress = this.n;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress c2 = l().c();
            this.n = c2;
            return c2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public SocketAddress g() {
        SocketAddress socketAddress = this.o;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress d2 = l().d();
            this.o = d2;
            return d2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final wox i() {
        return this.a.b.i();
    }

    public final wot j() {
        this.a.b.m();
        return this;
    }

    public final wpo k() {
        return this.a.k();
    }

    public defpackage.wot.a l() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public abstract a m();

    public final wpo n() {
        return this.a.d;
    }

    /* access modifiers changed from: protected */
    public abstract SocketAddress o();

    /* access modifiers changed from: protected */
    public abstract SocketAddress p();

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public abstract void r();

    /* access modifiers changed from: protected */
    public abstract void s();

    /* access modifiers changed from: protected */
    public void t() {
    }

    public String toString() {
        boolean D = D();
        if (this.q == D) {
            String str = this.r;
            if (str != null) {
                return str;
            }
        }
        SocketAddress g2 = g();
        SocketAddress f2 = f();
        String str2 = ", L:";
        String str3 = "[id: 0x";
        if (g2 != null) {
            StringBuilder sb = new StringBuilder(96);
            sb.append(str3);
            sb.append(this.j.a());
            sb.append(str2);
            sb.append(f2);
            sb.append(D ? " - " : " ! ");
            sb.append("R:");
            sb.append(g2);
            sb.append(']');
            this.r = sb.toString();
        } else if (f2 != null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(str3);
            sb2.append(this.j.a());
            sb2.append(str2);
            sb2.append(f2);
            sb2.append(']');
            this.r = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder(16);
            sb3.append(str3);
            sb3.append(this.j.a());
            sb3.append(']');
            this.r = sb3.toString();
        }
        this.q = D;
        return this.r;
    }

    /* access modifiers changed from: protected */
    public abstract void u();
}
