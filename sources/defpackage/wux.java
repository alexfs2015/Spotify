package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: wux reason: default package */
public final class wux extends wur<InetSocketAddress> {
    private wuy<InetAddress> a;

    public wux(wwc wwc, wuy<InetAddress> wuy) {
        super(wwc, InetSocketAddress.class);
        this.a = wuy;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(SocketAddress socketAddress, final wws wws) {
        final InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        this.a.a(inetSocketAddress.getHostName()).b(new wwj<InetAddress>() {
            public final void operationComplete(wwi<InetAddress> wwi) {
                if (wwi.g()) {
                    wws.a(new InetSocketAddress((InetAddress) wwi.d(), inetSocketAddress.getPort()));
                } else {
                    wws.c(wwi.f());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean c(SocketAddress socketAddress) {
        return !((InetSocketAddress) socketAddress).isUnresolved();
    }

    public final void close() {
        this.a.close();
    }
}
