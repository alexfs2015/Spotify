package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import io.netty.handler.ssl.SslProvider;
import java.io.File;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: wuj reason: default package */
public abstract class wuj {
    public static final CertificateFactory g;
    public final boolean h;

    /* renamed from: wuj$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SslProvider.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                io.netty.handler.ssl.SslProvider[] r0 = io.netty.handler.ssl.SslProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.JDK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.OPENSSL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.handler.ssl.SslProvider r1 = io.netty.handler.ssl.SslProvider.OPENSSL_REFCNT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wuj.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        try {
            g = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new IllegalStateException("unable to instance X.509 CertificateFactory", e);
        }
    }

    protected wuj() {
        this(false);
    }

    protected wuj(boolean z) {
        this.h = z;
    }

    private static KeyStore a(X509Certificate[] x509CertificateArr, PrivateKey privateKey, char[] cArr) {
        KeyStore instance = KeyStore.getInstance("JKS");
        instance.load(null, null);
        instance.setKeyEntry("key", privateKey, cArr, x509CertificateArr);
        return instance;
    }

    static PrivateKey a(File file, String str) {
        if (file == null) {
            return null;
        }
        try {
            return a(wue.b(file), str);
        } catch (Exception e) {
            throw new SSLException(e);
        }
    }

    private static PrivateKey a(wnb wnb, String str) {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec;
        byte[] bArr = new byte[wnb.g()];
        wnb.a(bArr).B();
        char[] charArray = str == null ? null : str.toCharArray();
        if (charArray == null) {
            pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        } else {
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(bArr);
            SecretKey generateSecret = SecretKeyFactory.getInstance(encryptedPrivateKeyInfo.getAlgName()).generateSecret(new PBEKeySpec(charArray));
            Cipher instance = Cipher.getInstance(encryptedPrivateKeyInfo.getAlgName());
            instance.init(2, generateSecret, encryptedPrivateKeyInfo.getAlgParameters());
            pKCS8EncodedKeySpec = encryptedPrivateKeyInfo.getKeySpec(instance);
        }
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(pKCS8EncodedKeySpec);
        } catch (InvalidKeySpecException unused) {
            try {
                return KeyFactory.getInstance("DSA").generatePrivate(pKCS8EncodedKeySpec);
            } catch (InvalidKeySpecException unused2) {
                try {
                    return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
                } catch (InvalidKeySpecException e) {
                    throw new InvalidKeySpecException("Neither RSA, DSA nor EC worked", e);
                }
            }
        }
    }

    private static KeyManagerFactory a(X509Certificate[] x509CertificateArr, String str, PrivateKey privateKey, String str2, KeyManagerFactory keyManagerFactory) {
        char[] charArray = str2 == null ? wxg.b : str2.toCharArray();
        KeyStore a = a(x509CertificateArr, privateKey, charArray);
        if (keyManagerFactory == null) {
            keyManagerFactory = KeyManagerFactory.getInstance(str);
        }
        keyManagerFactory.init(a, charArray);
        return keyManagerFactory;
    }

    static KeyManagerFactory a(X509Certificate[] x509CertificateArr, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        String property = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (property == null) {
            property = "SunX509";
        }
        return a(x509CertificateArr, property, privateKey, str, keyManagerFactory);
    }

    static TrustManagerFactory a(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory) {
        KeyStore instance = KeyStore.getInstance("JKS");
        instance.load(null, null);
        int i = 1;
        for (X509Certificate certificateEntry : x509CertificateArr) {
            instance.setCertificateEntry(Integer.toString(i), certificateEntry);
            i++;
        }
        if (trustManagerFactory == null) {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        }
        trustManagerFactory.init(instance);
        return trustManagerFactory;
    }

    public static wuj a(SslProvider sslProvider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        SslProvider b = sslProvider == null ? b() : sslProvider;
        int i = AnonymousClass1.a[b.ordinal()];
        if (i == 1) {
            wtk wtk = new wtk(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2);
            return wtk;
        } else if (i == 2) {
            wtr wtr = new wtr(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2);
            return wtr;
        } else if (i == 3) {
            wug wug = new wug(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2);
            return wug;
        } else {
            throw new Error(b.toString());
        }
    }

    public static wuj a(SslProvider sslProvider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, ClientAuth clientAuth, boolean z) {
        SslProvider b = sslProvider == null ? b() : sslProvider;
        int i = AnonymousClass1.a[b.ordinal()];
        if (i == 1) {
            wtn wtn = new wtn(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2, clientAuth, z);
            return wtn;
        } else if (i == 2) {
            wtz wtz = new wtz(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2, clientAuth, z);
            return wtz;
        } else if (i == 3) {
            wui wui = new wui(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, wtb, applicationProtocolConfig, j, j2, clientAuth, z);
            return wui;
        } else {
            throw new Error(b.toString());
        }
    }

    static X509Certificate[] a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return a(wue.a(file));
        } catch (CertificateException e) {
            throw new SSLException(e);
        }
    }

    private static X509Certificate[] a(wnb[] wnbArr) {
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        X509Certificate[] x509CertificateArr = new X509Certificate[wnbArr.length];
        int i = 0;
        int i2 = 0;
        while (i2 < wnbArr.length) {
            try {
                x509CertificateArr[i2] = (X509Certificate) instance.generateCertificate(new wne(wnbArr[i2]));
                i2++;
            } finally {
                int length = wnbArr.length;
                while (i < length) {
                    wnbArr[i].B();
                    i++;
                }
            }
        }
        return x509CertificateArr;
    }

    private static SslProvider b() {
        return wtp.a() ? SslProvider.OPENSSL : SslProvider.JDK;
    }

    public abstract SSLEngine a(wnc wnc, String str, int i);

    public abstract boolean a();

    public final boolean e() {
        return !a();
    }
}
