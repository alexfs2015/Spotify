package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: ewf reason: default package */
final class ewf extends SSLSocket {
    private final SSLSocket a;

    ewf(SSLSocket sSLSocket) {
        this.a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.a.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    public final int getPort() {
        return this.a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.a.getSession();
    }

    public final int getSoLinger() {
        return this.a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.a.isBound();
    }

    public final boolean isClosed() {
        return this.a.isClosed();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            String str = "SSLv3";
            if (Arrays.asList(strArr).contains(str)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove(str);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
        this.a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.a.shutdownOutput();
    }

    public final void startHandshake() {
        this.a.startHandshake();
    }

    public final String toString() {
        return this.a.toString();
    }
}
