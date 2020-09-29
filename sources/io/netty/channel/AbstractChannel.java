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

public abstract class AbstractChannel extends DefaultAttributeMap implements wan {
    /* access modifiers changed from: private */
    public static final wjw c = wjx.a(AbstractChannel.class);
    /* access modifiers changed from: private */
    public static final ClosedChannelException d;
    /* access modifiers changed from: private */
    public static final ClosedChannelException e = ((ClosedChannelException) wjp.a(new ClosedChannelException(), a.class, "ensureOpen(...)"));
    /* access modifiers changed from: private */
    public static final ClosedChannelException f = ((ClosedChannelException) wjp.a(new ClosedChannelException(), a.class, "close(...)"));
    /* access modifiers changed from: private */
    public static final ClosedChannelException g = ((ClosedChannelException) wjp.a(new ClosedChannelException(), a.class, "write(...)"));
    /* access modifiers changed from: private */
    public static final NotYetConnectedException h;
    public final wbo a;
    /* access modifiers changed from: protected */
    public volatile boolean b;
    private final wan i;
    private final ChannelId j;
    private final defpackage.wan.a k;
    /* access modifiers changed from: private */
    public final wci l = new wci(this, false);
    /* access modifiers changed from: private */
    public final b m = new b(this);
    private volatile SocketAddress n;
    private volatile SocketAddress o;
    /* access modifiers changed from: private */
    public volatile wbu p;
    private boolean q;
    private String r;

    static final class AnnotatedConnectException extends ConnectException {
        private static final long serialVersionUID = 3901958112696433556L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        AnnotatedConnectException(ConnectException connectException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(connectException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(connectException.getStackTrace());
        }
    }

    static final class AnnotatedNoRouteToHostException extends NoRouteToHostException {
        private static final long serialVersionUID = -6801433937592080623L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        AnnotatedNoRouteToHostException(NoRouteToHostException noRouteToHostException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(noRouteToHostException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(noRouteToHostException.getStackTrace());
        }
    }

    static final class AnnotatedSocketException extends SocketException {
        private static final long serialVersionUID = 3896743275010454039L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        AnnotatedSocketException(SocketException socketException, SocketAddress socketAddress) {
            StringBuilder sb = new StringBuilder();
            sb.append(socketException.getMessage());
            sb.append(": ");
            sb.append(socketAddress);
            super(sb.toString());
            setStackTrace(socketException.getStackTrace());
        }
    }

    public abstract class a implements defpackage.wan.a {
        private static /* synthetic */ boolean f = (!AbstractChannel.class.desiredAssertionStatus());
        private volatile wbb b = new wbb(AbstractChannel.this);
        private defpackage.wcb.a c;
        private boolean d;
        private boolean e = true;

        /* access modifiers changed from: protected */
        public Executor k() {
            return null;
        }

        protected a() {
        }

        private void m() {
            if (!f && AbstractChannel.this.b && !AbstractChannel.this.p.j()) {
                throw new AssertionError();
            }
        }

        public final defpackage.wcb.a a() {
            if (this.c == null) {
                this.c = AbstractChannel.this.B().d().a();
            }
            return this.c;
        }

        public final wbb b() {
            return this.b;
        }

        public final SocketAddress c() {
            return AbstractChannel.this.o();
        }

        public final SocketAddress d() {
            return AbstractChannel.this.p();
        }

        public final void a(wbu wbu, final wbi wbi) {
            if (AbstractChannel.this.b) {
                wbi.a(new IllegalStateException("registered to an event loop already"));
            } else if (!AbstractChannel.this.a(wbu)) {
                StringBuilder sb = new StringBuilder("incompatible event loop type: ");
                sb.append(wbu.getClass().getName());
                wbi.a(new IllegalStateException(sb.toString()));
            } else {
                AbstractChannel.this.p = wbu;
                if (wbu.j()) {
                    e(wbi);
                    return;
                }
                try {
                    wbu.execute(new Runnable() {
                        public final void run() {
                            a.this.e(wbi);
                        }
                    });
                } catch (Throwable th) {
                    AbstractChannel.c.c("Force-closing a channel whose registration task was not accepted by an event loop: {}", AbstractChannel.this, th);
                    e();
                    AbstractChannel.this.m.ba_();
                    a(wbi, th);
                }
            }
        }

        /* access modifiers changed from: private */
        public void e(wbi wbi) {
            try {
                if (wbi.aY_()) {
                    if (c(wbi)) {
                        boolean z = this.e;
                        AbstractChannel.this.q();
                        this.e = false;
                        AbstractChannel.this.b = true;
                        AbstractChannel.this.a.f();
                        d(wbi);
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
                AbstractChannel.this.m.ba_();
                a(wbi, th);
            }
        }

        public final void a(wbi wbi) {
            m();
            if (wbi.aY_()) {
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
                    d(wbi);
                    j();
                } catch (Throwable th) {
                    a(wbi, th);
                    j();
                }
            }
        }

        public final void b(wbi wbi) {
            m();
            a(wbi, AbstractChannel.f, AbstractChannel.f, false);
        }

        /* JADX INFO: finally extract failed */
        private void a(final wbi wbi, Throwable th, ClosedChannelException closedChannelException, boolean z) {
            if (wbi.aY_()) {
                final wbb wbb = this.b;
                if (wbb == null) {
                    if (!(wbi instanceof wci)) {
                        AbstractChannel.this.m.b((wie<? extends wic<? super Void>>) new was() {
                            public final /* synthetic */ void operationComplete(wic wic) {
                                wbi.b();
                            }
                        });
                    }
                } else if (AbstractChannel.this.m.isDone()) {
                    d(wbi);
                } else {
                    final boolean D = AbstractChannel.this.D();
                    this.b = null;
                    Executor k = k();
                    if (k != null) {
                        final wbi wbi2 = wbi;
                        final Throwable th2 = th;
                        final ClosedChannelException closedChannelException2 = closedChannelException;
                        AnonymousClass4 r0 = new Runnable(false) {
                            public final void run() {
                                try {
                                    a.this.f(wbi2);
                                } finally {
                                    a.this.a((Runnable) new Runnable() {
                                        public final void run() {
                                            wbb.a(th2, false);
                                            wbb.a(closedChannelException2);
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
                        f(wbi);
                        wbb.a(th, false);
                        wbb.a(closedChannelException);
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
                        wbb.a(th, false);
                        wbb.a(closedChannelException);
                        throw th3;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(wbi wbi) {
            try {
                AbstractChannel.this.s();
                AbstractChannel.this.m.ba_();
                d(wbi);
            } catch (Throwable th) {
                AbstractChannel.this.m.ba_();
                a(wbi, th);
            }
        }

        /* access modifiers changed from: private */
        public void a(boolean z) {
            a(i(), z && !AbstractChannel.this.D());
        }

        public final void e() {
            m();
            try {
                AbstractChannel.this.s();
            } catch (Exception e2) {
                AbstractChannel.c.d("Failed to close a channel.", (Throwable) e2);
            }
        }

        private void a(final wbi wbi, final boolean z) {
            if (wbi.aY_()) {
                if (!AbstractChannel.this.b) {
                    d(wbi);
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
                                wbo r1 = r1.a
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
                                wbo r0 = r0.a
                                r0.g()
                            L_0x0033:
                                wbi r0 = r2
                                io.netty.channel.AbstractChannel.a.d(r0)
                                return
                            L_0x0039:
                                r1 = move-exception
                                wjw r2 = io.netty.channel.AbstractChannel.c     // Catch:{ all -> 0x005d }
                                java.lang.String r3 = "Unexpected exception occurred while deregistering a channel."
                                r2.d(r3, r1)     // Catch:{ all -> 0x005d }
                                boolean r1 = r3
                                if (r1 == 0) goto L_0x0052
                                io.netty.channel.AbstractChannel$a r1 = io.netty.channel.AbstractChannel.a.this
                                io.netty.channel.AbstractChannel r1 = io.netty.channel.AbstractChannel.this
                                wbo r1 = r1.a
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
                                wbo r2 = r2.a
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
                                wbo r0 = r0.a
                                r0.g()
                            L_0x0089:
                                wbi r0 = r2
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

        public final void a(Object obj, wbi wbi) {
            m();
            wbb wbb = this.b;
            if (wbb == null) {
                a(wbi, (Throwable) AbstractChannel.g);
                whh.a(obj);
                return;
            }
            try {
                Object c2 = AbstractChannel.this.c(obj);
                int a2 = AbstractChannel.this.a.e().a(c2);
                if (a2 < 0) {
                    a2 = 0;
                }
                defpackage.wbb.a a3 = defpackage.wbb.a.a(c2, a2, wbb.a(c2), wbi);
                if (wbb.d == null) {
                    wbb.b = null;
                    wbb.d = a3;
                } else {
                    wbb.d.a = a3;
                    wbb.d = a3;
                }
                if (wbb.c == null) {
                    wbb.c = a3;
                }
                wbb.a((long) a2, false);
            } catch (Throwable th) {
                a(wbi, th);
                whh.a(obj);
            }
        }

        public final void g() {
            int i;
            m();
            wbb wbb = this.b;
            if (wbb != null) {
                defpackage.wbb.a aVar = wbb.c;
                if (aVar != null) {
                    if (wbb.b == null) {
                        wbb.b = aVar;
                    }
                    do {
                        wbb.e++;
                        if (!aVar.e.aY_()) {
                            if (!aVar.j) {
                                aVar.j = true;
                                i = aVar.h;
                                whh.b(aVar.b);
                                aVar.b = vzw.a;
                                aVar.h = 0;
                                aVar.g = 0;
                                aVar.f = 0;
                                aVar.c = null;
                                aVar.d = null;
                            } else {
                                i = 0;
                            }
                            wbb.a((long) i, false, true);
                        }
                        aVar = aVar.a;
                    } while (aVar != null);
                    wbb.c = null;
                }
                h();
            }
        }

        /* access modifiers changed from: protected */
        public void h() {
            if (!this.d) {
                wbb wbb = this.b;
                if (wbb != null && !wbb.c()) {
                    this.d = true;
                    if (!AbstractChannel.this.D()) {
                        try {
                            if (AbstractChannel.this.C()) {
                                wbb.a((Throwable) AbstractChannel.h, true);
                            } else {
                                wbb.a((Throwable) AbstractChannel.d, false);
                            }
                        } finally {
                            this.d = false;
                        }
                    } else {
                        try {
                            AbstractChannel.this.a(wbb);
                        } catch (Throwable th) {
                            if (!(th instanceof IOException) || !AbstractChannel.this.B().f()) {
                                wbb.a(th, true);
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

        public final wbi i() {
            m();
            return AbstractChannel.this.l;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public final boolean c(wbi wbi) {
            if (AbstractChannel.this.C()) {
                return true;
            }
            a(wbi, (Throwable) AbstractChannel.e);
            return false;
        }

        protected static void d(wbi wbi) {
            if (!(wbi instanceof wci) && !wbi.aU_()) {
                AbstractChannel.c.c("Failed to mark a promise as success because it is done already: {}", (Object) wbi);
            }
        }

        private static void a(wbi wbi, Throwable th) {
            if (!(wbi instanceof wci) && !wbi.b(th)) {
                AbstractChannel.c.c("Failed to mark a promise as failure because it's done already: {}", wbi, th);
            }
        }

        /* access modifiers changed from: protected */
        public final void j() {
            if (!AbstractChannel.this.C()) {
                b(i());
            }
        }

        /* access modifiers changed from: private */
        public void a(Runnable runnable) {
            try {
                AbstractChannel.this.e().execute(runnable);
            } catch (RejectedExecutionException e2) {
                AbstractChannel.c.d("Can't invoke task later as EventLoop rejected it", (Throwable) e2);
            }
        }

        protected static Throwable a(Throwable th, SocketAddress socketAddress) {
            if (th instanceof ConnectException) {
                return new AnnotatedConnectException((ConnectException) th, socketAddress);
            }
            if (th instanceof NoRouteToHostException) {
                return new AnnotatedNoRouteToHostException((NoRouteToHostException) th, socketAddress);
            }
            return th instanceof SocketException ? new AnnotatedSocketException((SocketException) th, socketAddress) : th;
        }
    }

    public static final class b extends wbp {
        b(AbstractChannel abstractChannel) {
            super(abstractChannel);
        }

        public final wbi b() {
            throw new IllegalStateException();
        }

        public final wbi a(Throwable th) {
            throw new IllegalStateException();
        }

        public final boolean aU_() {
            throw new IllegalStateException();
        }

        public final boolean b(Throwable th) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final boolean ba_() {
            return super.aU_();
        }

        public final /* synthetic */ wim c(Throwable th) {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(wbb wbb);

    /* access modifiers changed from: protected */
    public abstract boolean a(wbu wbu);

    /* access modifiers changed from: protected */
    public Object c(Object obj) {
        return obj;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* access modifiers changed from: protected */
    public abstract a m();

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

    /* access modifiers changed from: protected */
    public abstract void u();

    public /* synthetic */ int compareTo(Object obj) {
        wan wan = (wan) obj;
        if (this == wan) {
            return 0;
        }
        return this.j.compareTo(wan.a());
    }

    static {
        String str = "flush0()";
        d = (ClosedChannelException) wjp.a(new ClosedChannelException(), a.class, str);
        h = (NotYetConnectedException) wjp.a(new NotYetConnectedException(), a.class, str);
    }

    protected AbstractChannel(wan wan) {
        this.i = wan;
        this.j = DefaultChannelId.b();
        this.k = m();
        this.a = new wbo(this);
    }

    public final ChannelId a() {
        return this.j;
    }

    public final boolean b() {
        wbb b2 = this.k.b();
        if (b2 != null) {
            if (b2.h == 0) {
                return true;
            }
        }
        return false;
    }

    public final wbf c() {
        return this.a;
    }

    public final vyw d() {
        return B().c();
    }

    public wbu e() {
        wbu wbu = this.p;
        if (wbu != null) {
            return wbu;
        }
        throw new IllegalStateException("channel not registered to an event loop");
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

    public final war i() {
        return this.a.b.i();
    }

    public final war a(SocketAddress socketAddress, wbi wbi) {
        return this.a.a(socketAddress, wbi);
    }

    public final war a(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        return this.a.a(socketAddress, socketAddress2, wbi);
    }

    public final war a(wbi wbi) {
        return this.a.a(wbi);
    }

    public final war b(wbi wbi) {
        return this.a.b(wbi);
    }

    public final wan j() {
        this.a.b.m();
        return this;
    }

    public final war a(Object obj) {
        return this.a.a(obj);
    }

    public final war a(Object obj, wbi wbi) {
        return this.a.a(obj, wbi);
    }

    public final war b(Object obj) {
        return this.a.b(obj);
    }

    public final wbi k() {
        return this.a.k();
    }

    public defpackage.wan.a l() {
        return this.k;
    }

    public final int hashCode() {
        return this.j.hashCode();
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

    public final wbi n() {
        return this.a.d;
    }
}
