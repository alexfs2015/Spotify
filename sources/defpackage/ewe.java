package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ewe reason: default package */
final class ewe extends SSLSocketFactory {
    private final SSLSocketFactory a;

    ewe() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private ewe(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new ewf(sSLSocket);
    }

    public final Socket createSocket() {
        return a((SSLSocket) this.a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return a((SSLSocket) this.a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a((SSLSocket) this.a.createSocket(inetAddress, i, inetAddress2, i2));
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
}
