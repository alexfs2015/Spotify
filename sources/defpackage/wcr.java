package defpackage;

import io.netty.channel.ChannelException;
import io.netty.util.internal.PlatformDependent;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: wcr reason: default package */
public class wcr extends wbm implements wcu {
    private Socket a;
    private volatile boolean b;

    public wcr(wct wct, Socket socket) {
        super(wct);
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

    public final <T> T a(wba<T> wba) {
        if (wba == wba.o) {
            return Integer.valueOf(l());
        }
        if (wba == wba.n) {
            return Integer.valueOf(m());
        }
        if (wba == wba.s) {
            return Boolean.valueOf(q());
        }
        if (wba == wba.m) {
            return Boolean.valueOf(o());
        }
        if (wba == wba.p) {
            return Boolean.valueOf(p());
        }
        if (wba == wba.q) {
            return Integer.valueOf(k());
        }
        if (wba == wba.r) {
            return Integer.valueOf(n());
        }
        if (wba == wba.j) {
            return Boolean.valueOf(this.b);
        }
        return super.a(wba);
    }

    public final <T> boolean a(wba<T> wba, T t) {
        b(wba, t);
        if (wba == wba.o) {
            f(((Integer) t).intValue());
        } else if (wba == wba.n) {
            g(((Integer) t).intValue());
        } else if (wba == wba.s) {
            e(((Boolean) t).booleanValue());
        } else if (wba == wba.m) {
            c(((Boolean) t).booleanValue());
        } else if (wba == wba.p) {
            d(((Boolean) t).booleanValue());
        } else if (wba == wba.q) {
            h(((Integer) t).intValue());
        } else if (wba == wba.r) {
            i(((Integer) t).intValue());
        } else if (wba != wba.j) {
            return super.a(wba, t);
        } else {
            this.b = ((Boolean) t).booleanValue();
        }
        return true;
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

    public final int k() {
        try {
            return this.a.getSoLinger();
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

    private wcu c(boolean z) {
        try {
            this.a.setKeepAlive(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wcu f(int i) {
        try {
            this.a.setReceiveBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wcu d(boolean z) {
        try {
            this.a.setReuseAddress(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wcu g(int i) {
        try {
            this.a.setSendBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wcu h(int i) {
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

    private wcu e(boolean z) {
        try {
            this.a.setTcpNoDelay(z);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    private wcu i(int i) {
        try {
            this.a.setTrafficClass(i);
            return this;
        } catch (SocketException e) {
            throw new ChannelException((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ wao a(wby wby) {
        super.a(wby);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao a(wcj wcj) {
        super.a(wcj);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao e(int i) {
        super.e(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao d(int i) {
        super.d(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao b(boolean z) {
        super.b(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao a(boolean z) {
        super.a(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao a(wcb wcb) {
        super.a(wcb);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao a(vyw vyw) {
        super.a(vyw);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao c(int i) {
        super.c(i);
        return this;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ wao b(int i) {
        super.b(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ wao a(int i) {
        super.a(i);
        return this;
    }
}
