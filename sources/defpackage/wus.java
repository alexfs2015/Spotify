package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;

/* renamed from: wus reason: default package */
public interface wus<T extends SocketAddress> extends Closeable {
    boolean a(SocketAddress socketAddress);

    boolean b(SocketAddress socketAddress);

    void close();

    wwi<T> d(SocketAddress socketAddress);
}
