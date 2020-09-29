package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ghr reason: default package */
public final class ghr extends SSLSocketFactory {
    private static final String[] a = {"TLSv1.2"};
    private SSLSocketFactory b;

    public ghr(SSLSocketFactory sSLSocketFactory) {
        this.b = sSLSocketFactory;
    }

    public final String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a(this.b.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) {
        return a(this.b.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a(this.b.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a(this.b.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a(this.b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private static Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(a);
        }
        return socket;
    }
}
