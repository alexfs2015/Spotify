package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: wmh reason: default package */
public final class wmh {
    public final wlf a;
    public final Proxy b;
    public final InetSocketAddress c;

    public wmh(wlf wlf, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (wlf == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = wlf;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean a() {
        return this.a.h != null && this.b.type() == Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wmh) {
            wmh wmh = (wmh) obj;
            if (wmh.a.equals(this.a) && wmh.b.equals(this.b) && wmh.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
