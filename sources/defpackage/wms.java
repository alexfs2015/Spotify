package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: wms reason: default package */
public final class wms {
    boolean a;
    boolean b;
    private final List<wlo> c;
    private int d = 0;

    public wms(List<wlo> list) {
        this.c = list;
    }

    public final wlo a(SSLSocket sSLSocket) {
        wlo wlo;
        int i = this.d;
        int size = this.c.size();
        while (true) {
            if (i >= size) {
                wlo = null;
                break;
            }
            wlo = (wlo) this.c.get(i);
            if (wlo.a(sSLSocket)) {
                this.d = i + 1;
                break;
            }
            i++;
        }
        if (wlo != null) {
            this.a = b(sSLSocket);
            wmi.a.a(wlo, sSLSocket, this.b);
            return wlo;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.b);
        sb.append(", modes=");
        sb.append(this.c);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.d; i < this.c.size(); i++) {
            if (((wlo) this.c.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
