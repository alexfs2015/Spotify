package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;

/* renamed from: wgm reason: default package */
public interface wgm<T extends SocketAddress> extends Closeable {
    boolean a(SocketAddress socketAddress);

    boolean b(SocketAddress socketAddress);

    void close();

    wic<T> d(SocketAddress socketAddress);
}
