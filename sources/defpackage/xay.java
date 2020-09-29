package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: xay reason: default package */
public final class xay {
    boolean a;
    boolean b;
    private final List<wzu> c;
    private int d = 0;

    public xay(List<wzu> list) {
        this.c = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.d; i < this.c.size(); i++) {
            if (((wzu) this.c.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final wzu a(SSLSocket sSLSocket) {
        wzu wzu;
        int i = this.d;
        int size = this.c.size();
        while (true) {
            if (i >= size) {
                wzu = null;
                break;
            }
            wzu = (wzu) this.c.get(i);
            if (wzu.a(sSLSocket)) {
                this.d = i + 1;
                break;
            }
            i++;
        }
        if (wzu != null) {
            this.a = b(sSLSocket);
            xao.a.a(wzu, sSLSocket, this.b);
            return wzu;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.b);
        sb.append(", modes=");
        sb.append(this.c);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }
}
