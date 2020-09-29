package defpackage;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Date;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

/* renamed from: wuo reason: default package */
final class wuo {
    private static final Provider a = new BouncyCastleProvider();

    static String[] a(String str, KeyPair keyPair, SecureRandom secureRandom, Date date, Date date2) {
        PrivateKey privateKey = keyPair.getPrivate();
        StringBuilder sb = new StringBuilder("CN=");
        sb.append(str);
        X500Name x500Name = new X500Name(sb.toString());
        JcaX509v3CertificateBuilder jcaX509v3CertificateBuilder = new JcaX509v3CertificateBuilder(x500Name, new BigInteger(64, secureRandom), date, date2, x500Name, keyPair.getPublic());
        X509Certificate certificate = new JcaX509CertificateConverter().setProvider(a).getCertificate(jcaX509v3CertificateBuilder.build(new JcaContentSignerBuilder("SHA256WithRSAEncryption").build(privateKey)));
        certificate.verify(keyPair.getPublic());
        return wuq.a(str, privateKey, certificate);
    }
}