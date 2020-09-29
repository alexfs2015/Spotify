package defpackage;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* renamed from: wtm reason: default package */
class wtm extends SSLEngine {
    final SSLEngine a;
    private final wto b;

    wtm(SSLEngine sSLEngine) {
        this.a = sSLEngine;
        this.b = new wto(sSLEngine);
    }

    public void beginHandshake() {
        this.a.beginHandshake();
    }

    public void closeInbound() {
        this.a.closeInbound();
    }

    public void closeOutbound() {
        this.a.closeOutbound();
    }

    public Runnable getDelegatedTask() {
        return this.a.getDelegatedTask();
    }

    public boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public SSLSession getHandshakeSession() {
        return this.a.getHandshakeSession();
    }

    public HandshakeStatus getHandshakeStatus() {
        return this.a.getHandshakeStatus();
    }

    public boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    public String getPeerHost() {
        return this.a.getPeerHost();
    }

    public int getPeerPort() {
        return this.a.getPeerPort();
    }

    public SSLParameters getSSLParameters() {
        return this.a.getSSLParameters();
    }

    public /* bridge */ /* synthetic */ SSLSession getSession() {
        return this.b;
    }

    public String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    public boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public boolean isInboundDone() {
        return this.a.isInboundDone();
    }

    public boolean isOutboundDone() {
        return this.a.isOutboundDone();
    }

    public void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.a.setEnabledProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.a.setSSLParameters(sSLParameters);
    }

    public void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    public void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.a.unwrap(byteBuffer, byteBuffer2);
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        return this.a.unwrap(byteBuffer, byteBufferArr);
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.unwrap(byteBuffer, byteBufferArr, i, i2);
    }

    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.a.wrap(byteBuffer, byteBuffer2);
    }

    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        return this.a.wrap(byteBufferArr, i, i2, byteBuffer);
    }

    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer) {
        return this.a.wrap(byteBufferArr, byteBuffer);
    }
}
