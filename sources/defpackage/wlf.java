package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: wlf reason: default package */
final class wlf {
    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static X509Certificate[] a(X509Certificate[] x509CertificateArr, wlk wlk) {
        LinkedList linkedList = new LinkedList();
        boolean a = wlk.a(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        boolean z2 = a;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (wlk.a(x509CertificateArr[i])) {
                z2 = true;
            }
            if (!a(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate b = wlk.b(x509CertificateArr[i - 1]);
        if (b != null) {
            linkedList.add(b);
        } else {
            z = z2;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }
}
