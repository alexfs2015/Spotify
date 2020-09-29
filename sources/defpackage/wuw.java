package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/* renamed from: wuw reason: default package */
public abstract class wuw extends wuz<InetAddress> {
    private volatile wus<InetSocketAddress> b;

    protected wuw(wwc wwc) {
        super(wwc);
    }

    public final wus<InetSocketAddress> a() {
        wus<InetSocketAddress> wus = this.b;
        if (wus == null) {
            synchronized (this) {
                wus = this.b;
                if (wus == null) {
                    wus = new wux<>(this.a, this);
                    this.b = wus;
                }
            }
        }
        return wus;
    }
}
