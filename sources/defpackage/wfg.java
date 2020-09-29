package defpackage;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* renamed from: wfg reason: default package */
class wfg extends SSLEngine {
    final SSLEngine a;
    private final wfi b;

    wfg(SSLEngine sSLEngine) {
        this.a = sSLEngine;
        this.b = new wfi(sSLEngine);
    }

    public void closeInbound() {
        this.a.closeInbound();
    }

    public void closeOutbound() {
        this.a.closeOutbound();
    }

    public String getPeerHost() {
        return this.a.getPeerHost();
    }

    public int getPeerPort() {
        return this.a.getPeerPort();
    }

    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.a.wrap(byteBuffer, byteBuffer2);
    }

    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer) {
        return this.a.wrap(byteBufferArr, byteBuffer);
    }

    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        return this.a.wrap(byteBufferArr, i, i2, byteBuffer);
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

    public Runnable getDelegatedTask() {
        return this.a.getDelegatedTask();
    }

    public boolean isInboundDone() {
        return this.a.isInboundDone();
    }

    public boolean isOutboundDone() {
        return this.a.isOutboundDone();
    }

    public String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    public String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    public String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public void setEnabledProtocols(String[] strArr) {
        this.a.setEnabledProtocols(strArr);
    }

    public SSLSession getHandshakeSession() {
        return this.a.getHandshakeSession();
    }

    public void beginHandshake() {
        this.a.beginHandshake();
    }

    public HandshakeStatus getHandshakeStatus() {
        return this.a.getHandshakeStatus();
    }

    public void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    public boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
    }

    public boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    public void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    public boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    public boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public SSLParameters getSSLParameters() {
        return this.a.getSSLParameters();
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.a.setSSLParameters(sSLParameters);
    }

    public /* bridge */ /* synthetic */ SSLSession getSession() {
        return this.b;
    }
}
