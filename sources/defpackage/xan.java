package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: xan reason: default package */
public final class xan {
    public final wzl a;
    public final Proxy b;
    public final InetSocketAddress c;

    public xan(wzl wzl, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (wzl == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = wzl;
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
        if (obj instanceof xan) {
            xan xan = (xan) obj;
            if (xan.a.equals(this.a) && xan.b.equals(this.b) && xan.c.equals(this.c)) {
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
