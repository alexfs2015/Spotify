package defpackage;

import java.net.SocketAddress;

/* renamed from: vyk reason: default package */
public final class vyk extends vyi<vyj, wan> {
    vyk(vyj vyj) {
        super(vyj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.setLength(sb.length() - 1);
        sb.append(", resolver: ");
        sb.append(((vyj) this.a).h);
        SocketAddress socketAddress = ((vyj) this.a).i;
        if (socketAddress != null) {
            sb.append(", remoteAddress: ");
            sb.append(socketAddress);
        }
        sb.append(')');
        return sb.toString();
    }
}
