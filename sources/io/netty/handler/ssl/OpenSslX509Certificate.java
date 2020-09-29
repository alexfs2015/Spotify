package io.netty.handler.ssl;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

final class OpenSslX509Certificate extends X509Certificate {
    private final byte[] bytes;
    private X509Certificate wrapped;

    public OpenSslX509Certificate(byte[] bArr) {
        this.bytes = bArr;
    }

    public final void checkValidity() {
        a().checkValidity();
    }

    public final void checkValidity(Date date) {
        a().checkValidity(date);
    }

    public final int getVersion() {
        return a().getVersion();
    }

    public final BigInteger getSerialNumber() {
        return a().getSerialNumber();
    }

    public final Principal getIssuerDN() {
        return a().getIssuerDN();
    }

    public final Principal getSubjectDN() {
        return a().getSubjectDN();
    }

    public final Date getNotBefore() {
        return a().getNotBefore();
    }

    public final Date getNotAfter() {
        return a().getNotAfter();
    }

    public final byte[] getTBSCertificate() {
        return a().getTBSCertificate();
    }

    public final byte[] getSignature() {
        return a().getSignature();
    }

    public final String getSigAlgName() {
        return a().getSigAlgName();
    }

    public final String getSigAlgOID() {
        return a().getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return a().getSigAlgParams();
    }

    public final boolean[] getIssuerUniqueID() {
        return a().getIssuerUniqueID();
    }

    public final boolean[] getSubjectUniqueID() {
        return a().getSubjectUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return a().getKeyUsage();
    }

    public final int getBasicConstraints() {
        return a().getBasicConstraints();
    }

    public final byte[] getEncoded() {
        return (byte[]) this.bytes.clone();
    }

    public final void verify(PublicKey publicKey) {
        a().verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) {
        a().verify(publicKey, str);
    }

    public final String toString() {
        return a().toString();
    }

    public final PublicKey getPublicKey() {
        return a().getPublicKey();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return a().hasUnsupportedCriticalExtension();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return a().getCriticalExtensionOIDs();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return a().getNonCriticalExtensionOIDs();
    }

    public final byte[] getExtensionValue(String str) {
        return a().getExtensionValue(str);
    }

    private X509Certificate a() {
        X509Certificate x509Certificate = this.wrapped;
        if (x509Certificate != null) {
            return x509Certificate;
        }
        try {
            X509Certificate x509Certificate2 = (X509Certificate) wgd.g.generateCertificate(new ByteArrayInputStream(this.bytes));
            this.wrapped = x509Certificate2;
            return x509Certificate2;
        } catch (CertificateException e) {
            throw new IllegalStateException(e);
        }
    }
}
