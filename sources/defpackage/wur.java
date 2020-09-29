package defpackage;

import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;

/* renamed from: wur reason: default package */
public abstract class wur<T extends SocketAddress> implements wus<T> {
    private final wwc a;
    private final wxw b;

    protected wur(wwc wwc, Class<? extends T> cls) {
        this.a = (wwc) wxq.a(wwc, "executor");
        this.b = wxw.a(cls);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, wws<T> wws);

    public final boolean a(SocketAddress socketAddress) {
        return this.b.a((Object) socketAddress);
    }

    public final boolean b(SocketAddress socketAddress) {
        if (a(socketAddress)) {
            return c(socketAddress);
        }
        throw new UnsupportedAddressTypeException();
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(T t);

    public void close() {
    }

    public final wwi<T> d(SocketAddress socketAddress) {
        if (!a((SocketAddress) wxq.a(socketAddress, "address"))) {
            return this.a.a((Throwable) new UnsupportedAddressTypeException());
        }
        if (b(socketAddress)) {
            return this.a.a(socketAddress);
        }
        try {
            wws l = this.a.l();
            a(socketAddress, l);
            return l;
        } catch (Exception e) {
            return this.a.a((Throwable) e);
        }
    }
}
