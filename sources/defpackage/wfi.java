package defpackage;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* renamed from: wfi reason: default package */
final class wfi implements SSLSession {
    private final SSLEngine a;

    wfi(SSLEngine sSLEngine) {
        this.a = sSLEngine;
    }

    public final String getProtocol() {
        return this.a.getSession().getProtocol();
    }

    public final byte[] getId() {
        return this.a.getSession().getId();
    }

    public final SSLSessionContext getSessionContext() {
        return this.a.getSession().getSessionContext();
    }

    public final long getCreationTime() {
        return this.a.getSession().getCreationTime();
    }

    public final long getLastAccessedTime() {
        return this.a.getSession().getLastAccessedTime();
    }

    public final void invalidate() {
        this.a.getSession().invalidate();
    }

    public final boolean isValid() {
        return this.a.getSession().isValid();
    }

    public final void putValue(String str, Object obj) {
        this.a.getSession().putValue(str, obj);
    }

    public final Object getValue(String str) {
        return this.a.getSession().getValue(str);
    }

    public final void removeValue(String str) {
        this.a.getSession().removeValue(str);
    }

    public final String[] getValueNames() {
        return this.a.getSession().getValueNames();
    }

    public final Certificate[] getPeerCertificates() {
        return this.a.getSession().getPeerCertificates();
    }

    public final Certificate[] getLocalCertificates() {
        return this.a.getSession().getLocalCertificates();
    }

    public final X509Certificate[] getPeerCertificateChain() {
        return this.a.getSession().getPeerCertificateChain();
    }

    public final Principal getPeerPrincipal() {
        return this.a.getSession().getPeerPrincipal();
    }

    public final Principal getLocalPrincipal() {
        return this.a.getSession().getLocalPrincipal();
    }

    public final String getCipherSuite() {
        return this.a.getSession().getCipherSuite();
    }

    public final String getPeerHost() {
        return this.a.getSession().getPeerHost();
    }

    public final int getPeerPort() {
        return this.a.getSession().getPeerPort();
    }

    public final int getPacketBufferSize() {
        return this.a.getSession().getPacketBufferSize();
    }

    public final int getApplicationBufferSize() {
        return this.a.getSession().getApplicationBufferSize();
    }
}
