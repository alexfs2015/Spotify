package defpackage;

import defpackage.vyh;
import defpackage.wan;
import java.net.SocketAddress;
import java.util.Map;

/* renamed from: vyi reason: default package */
public abstract class vyi<B extends vyh<B, C>, C extends wan> {
    protected final B a;

    protected vyi(B b) {
        this.a = (vyh) wjk.a(b, "bootstrap");
    }

    public final SocketAddress a() {
        return this.a.c;
    }

    public final wat b() {
        return this.a.f;
    }

    public final wbv c() {
        return this.a.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append('(');
        wbv c = c();
        String str = ", ";
        if (c != null) {
            sb.append("group: ");
            sb.append(wjn.a((Object) c));
            sb.append(str);
        }
        vyl<? extends C> vyl = this.a.b;
        if (vyl != null) {
            sb.append("channelFactory: ");
            sb.append(vyl);
            sb.append(str);
        }
        SocketAddress a2 = a();
        if (a2 != null) {
            sb.append("localAddress: ");
            sb.append(a2);
            sb.append(str);
        }
        Map a3 = vyh.a(this.a.d);
        if (!a3.isEmpty()) {
            sb.append("options: ");
            sb.append(a3);
            sb.append(str);
        }
        Map a4 = vyh.a(this.a.e);
        if (!a4.isEmpty()) {
            sb.append("attrs: ");
            sb.append(a4);
            sb.append(str);
        }
        wat b = b();
        if (b != null) {
            sb.append("handler: ");
            sb.append(b);
            sb.append(str);
        }
        if (sb.charAt(sb.length() - 1) == '(') {
            sb.append(')');
        } else {
            sb.setCharAt(sb.length() - 2, ')');
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
