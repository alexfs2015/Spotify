package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: evn reason: default package */
final class evn extends SSLSocketFactory {
    private final SSLSocketFactory a;

    evn() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private evn(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a((SSLSocket) this.a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        return a((SSLSocket) this.a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() {
        return a((SSLSocket) this.a.createSocket());
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new evo(sSLSocket);
    }
}
