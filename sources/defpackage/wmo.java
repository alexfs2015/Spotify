package defpackage;

import defpackage.wmn;
import defpackage.wot;
import java.net.SocketAddress;
import java.util.Map;

/* renamed from: wmo reason: default package */
public abstract class wmo<B extends wmn<B, C>, C extends wot> {
    protected final B a;

    protected wmo(B b) {
        this.a = (wmn) wxq.a(b, "bootstrap");
    }

    public final SocketAddress a() {
        return this.a.c;
    }

    public final woz b() {
        return this.a.f;
    }

    public final wqb c() {
        return this.a.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a((Object) this));
        sb.append('(');
        wqb c = c();
        String str = ", ";
        if (c != null) {
            sb.append("group: ");
            sb.append(wxt.a((Object) c));
            sb.append(str);
        }
        wmr<? extends C> wmr = this.a.b;
        if (wmr != null) {
            sb.append("channelFactory: ");
            sb.append(wmr);
            sb.append(str);
        }
        SocketAddress a2 = a();
        if (a2 != null) {
            sb.append("localAddress: ");
            sb.append(a2);
            sb.append(str);
        }
        Map a3 = wmn.a(this.a.d);
        if (!a3.isEmpty()) {
            sb.append("options: ");
            sb.append(a3);
            sb.append(str);
        }
        Map a4 = wmn.a(this.a.e);
        if (!a4.isEmpty()) {
            sb.append("attrs: ");
            sb.append(a4);
            sb.append(str);
        }
        woz b = b();
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
