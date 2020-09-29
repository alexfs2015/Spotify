package defpackage;

import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;

/* renamed from: wgl reason: default package */
public abstract class wgl<T extends SocketAddress> implements wgm<T> {
    private final whw a;
    private final wjq b;

    /* access modifiers changed from: protected */
    public abstract void a(T t, wim<T> wim);

    /* access modifiers changed from: protected */
    public abstract boolean c(T t);

    public void close() {
    }

    protected wgl(whw whw, Class<? extends T> cls) {
        this.a = (whw) wjk.a(whw, "executor");
        this.b = wjq.a(cls);
    }

    public final boolean a(SocketAddress socketAddress) {
        return this.b.a((Object) socketAddress);
    }

    public final boolean b(SocketAddress socketAddress) {
        if (a(socketAddress)) {
            return c(socketAddress);
        }
        throw new UnsupportedAddressTypeException();
    }

    public final wic<T> d(SocketAddress socketAddress) {
        if (!a((SocketAddress) wjk.a(socketAddress, "address"))) {
            return this.a.a((Throwable) new UnsupportedAddressTypeException());
        }
        if (b(socketAddress)) {
            return this.a.a(socketAddress);
        }
        try {
            wim l = this.a.l();
            a(socketAddress, l);
            return l;
        } catch (Exception e) {
            return this.a.a((Throwable) e);
        }
    }
}
