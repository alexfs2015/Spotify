package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.util.Date;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: wtx reason: default package */
public final class wtx extends X509Certificate {
    private final byte[] a;
    private X509Certificate b;

    public wtx(byte[] bArr) {
        this.a = bArr;
    }

    private X509Certificate a() {
        X509Certificate x509Certificate = this.b;
        if (x509Certificate != null) {
            return x509Certificate;
        }
        try {
            X509Certificate instance = X509Certificate.getInstance(this.a);
            this.b = instance;
            return instance;
        } catch (CertificateException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void checkValidity() {
        a().checkValidity();
    }

    public final void checkValidity(Date date) {
        a().checkValidity(date);
    }

    public final byte[] getEncoded() {
        return (byte[]) this.a.clone();
    }

    public final Principal getIssuerDN() {
        return a().getIssuerDN();
    }

    public final Date getNotAfter() {
        return a().getNotAfter();
    }

    public final Date getNotBefore() {
        return a().getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return a().getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return a().getSerialNumber();
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

    public final Principal getSubjectDN() {
        return a().getSubjectDN();
    }

    public final int getVersion() {
        return a().getVersion();
    }

    public final String toString() {
        return a().toString();
    }

    public final void verify(PublicKey publicKey) {
        a().verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) {
        a().verify(publicKey, str);
    }
}
