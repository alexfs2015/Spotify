package defpackage;

import java.net.SocketAddress;

/* renamed from: wmq reason: default package */
public final class wmq extends wmo<wmp, wot> {
    wmq(wmp wmp) {
        super(wmp);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.setLength(sb.length() - 1);
        sb.append(", resolver: ");
        sb.append(((wmp) this.a).h);
        SocketAddress socketAddress = ((wmp) this.a).i;
        if (socketAddress != null) {
            sb.append(", remoteAddress: ");
            sb.append(socketAddress);
        }
        sb.append(')');
        return sb.toString();
    }
}
