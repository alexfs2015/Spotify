package defpackage;

import io.netty.channel.ChannelException;
import io.netty.util.internal.PlatformDependent;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: wqx reason: default package */
public class wqx extends wps implements wra {
    private Socket a;
    private volatile boolean b;

    public wqx(wqz wqz, Socket socket) {
        super(wqz);
        if (socket != null) {
            this.a = socket;
            if (PlatformDependent.d()) {
                try {
                    e(true);
                } catch (Exception unused) {
                }
            }
        } else {
            throw new NullPointerException("javaSocket");
        }
    }

    private wra c(boolean z) {
        try {
            this.a.setKeepAlive(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wra d(boolean z) {
        try {
            this.a.setReuseAddress(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wra e(boolean z) {
        try {
            this.a.setTcpNoDelay(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wra f(int i) {
        try {
            this.a.setReceiveBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wra g(int i) {
        try {
            this.a.setSendBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wra h(int i) {
        if (i < 0) {
            try {
                this.a.setSoLinger(false, 0);
            } catch (SocketException e) {
                throw new ChannelException((Throwable) e);
            }
        } else {
            this.a.setSoLinger(true, i);
        }
        return this;
    }

    private wra i(int i) {
        try {
            this.a.setTrafficClass(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private int l() {
        try {
            return this.a.getReceiveBufferSize();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private int m() {
        try {
            return this.a.getSendBufferSize();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private int n() {
        try {
            return this.a.getTrafficClass();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private boolean o() {
        try {
            return this.a.getKeepAlive();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private boolean p() {
        try {
            return this.a.getReuseAddress();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private boolean q() {
        try {
            return this.a.getTcpNoDelay();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    public final <T> T a(wpg<T> wpg) {
        return wpg == wpg.o ? Integer.valueOf(l()) : wpg == wpg.n ? Integer.valueOf(m()) : wpg == wpg.s ? Boolean.valueOf(q()) : wpg == wpg.m ? Boolean.valueOf(o()) : wpg == wpg.p ? Boolean.valueOf(p()) : wpg == wpg.q ? Integer.valueOf(k()) : wpg == wpg.r ? Integer.valueOf(n()) : wpg == wpg.j ? Boolean.valueOf(this.b) : super.a(wpg);
    }

    public final /* bridge */ /* synthetic */ wou a(int i) {
        super.a(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou a(wnc wnc) {
        super.a(wnc);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou a(wqe wqe) {
        super.a(wqe);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou a(wqh wqh) {
        super.a(wqh);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou a(wqp wqp) {
        super.a(wqp);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou a(boolean z) {
        super.a(z);
        return this;
    }

    public final <T> boolean a(wpg<T> wpg, T t) {
        b(wpg, t);
        if (wpg == wpg.o) {
            f(((Integer) t).intValue());
        } else if (wpg == wpg.n) {
            g(((Integer) t).intValue());
        } else if (wpg == wpg.s) {
            e(((Boolean) t).booleanValue());
        } else if (wpg == wpg.m) {
            c(((Boolean) t).booleanValue());
        } else if (wpg == wpg.p) {
            d(((Boolean) t).booleanValue());
        } else if (wpg == wpg.q) {
            h(((Integer) t).intValue());
        } else if (wpg == wpg.r) {
            i(((Integer) t).intValue());
        } else if (wpg != wpg.j) {
            return super.a(wpg, t);
        } else {
            this.b = ((Boolean) t).booleanValue();
        }
        return true;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ wou b(int i) {
        super.b(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou b(boolean z) {
        super.b(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou c(int i) {
        super.c(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou d(int i) {
        super.d(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wou e(int i) {
        super.e(i);
        return this;
    }

    public final int k() {
        try {
            return this.a.getSoLinger();
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }
}
