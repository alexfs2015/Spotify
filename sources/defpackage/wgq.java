package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/* renamed from: wgq reason: default package */
public abstract class wgq extends wgt<InetAddress> {
    private volatile wgm<InetSocketAddress> b;

    protected wgq(whw whw) {
        super(whw);
    }

    public final wgm<InetSocketAddress> a() {
        wgm<InetSocketAddress> wgm = this.b;
        if (wgm == null) {
            synchronized (this) {
                wgm = this.b;
                if (wgm == null) {
                    wgm = new wgr<>(this.a, this);
                    this.b = wgm;
                }
            }
        }
        return wgm;
    }
}
