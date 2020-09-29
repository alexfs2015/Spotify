package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: wgr reason: default package */
public final class wgr extends wgl<InetSocketAddress> {
    private wgs<InetAddress> a;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(SocketAddress socketAddress, final wim wim) {
        final InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        this.a.a(inetSocketAddress.getHostName()).b(new wid<InetAddress>() {
            public final void operationComplete(wic<InetAddress> wic) {
                if (wic.g()) {
                    wim.a(new InetSocketAddress((InetAddress) wic.d(), inetSocketAddress.getPort()));
                } else {
                    wim.c(wic.f());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean c(SocketAddress socketAddress) {
        return !((InetSocketAddress) socketAddress).isUnresolved();
    }

    public wgr(whw whw, wgs<InetAddress> wgs) {
        super(whw, InetSocketAddress.class);
        this.a = wgs;
    }

    public final void close() {
        this.a.close();
    }
}
