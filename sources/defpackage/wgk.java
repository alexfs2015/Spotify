package defpackage;

import io.netty.handler.ssl.util.ThreadLocalInsecureRandom;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: wgk reason: default package */
public final class wgk {
    private static final wjw b = wjx.a(wgk.class);
    private static final Date c = new Date(wjo.a("io.netty.selfSignedCertificate.defaultNotBefore", System.currentTimeMillis() - 31536000000L));
    private static final Date d = new Date(wjo.a("io.netty.selfSignedCertificate.defaultNotAfter", 253402300799000L));
    public final X509Certificate a;
    private final File e;
    private final File f;
    private final PrivateKey g;

    public wgk() {
        this(c, d);
    }

    private wgk(Date date, Date date2) {
        this("example.com", date, date2);
    }

    private wgk(String str, Date date, Date date2) {
        this(str, ThreadLocalInsecureRandom.a(), 1024, date, date2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC, Splitter:B:31:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private wgk(java.lang.String r6, java.security.SecureRandom r7, int r8, java.util.Date r9, java.util.Date r10) {
        /*
            r5 = this;
            java.lang.String r8 = "Failed to close a file: "
            r5.<init>()
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            r1 = 1024(0x400, float:1.435E-42)
            r0.initialize(r1, r7)     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            java.security.KeyPair r0 = r0.generateKeyPair()     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            java.lang.String[] r6 = defpackage.wgj.a(r6, r0, r7, r9, r10)     // Catch:{ all -> 0x0019 }
            goto L_0x0025
        L_0x0019:
            r1 = move-exception
            wjw r2 = b
            java.lang.String r3 = "Failed to generate a self-signed X.509 certificate using sun.security.x509:"
            r2.b(r3, r1)
            java.lang.String[] r6 = defpackage.wgi.a(r6, r0, r7, r9, r10)     // Catch:{ all -> 0x009b }
        L_0x0025:
            java.io.File r7 = new java.io.File
            r9 = 0
            r9 = r6[r9]
            r7.<init>(r9)
            r5.e = r7
            java.io.File r7 = new java.io.File
            r9 = 1
            r6 = r6[r9]
            r7.<init>(r6)
            r5.f = r7
            java.security.PrivateKey r6 = r0.getPrivate()
            r5.g = r6
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            java.io.File r9 = r5.e     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            java.lang.String r6 = "X509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch:{ Exception -> 0x006e }
            java.security.cert.Certificate r6 = r6.generateCertificate(r7)     // Catch:{ Exception -> 0x006e }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ Exception -> 0x006e }
            r5.a = r6     // Catch:{ Exception -> 0x006e }
            r7.close()     // Catch:{ IOException -> 0x0059 }
            return
        L_0x0059:
            r6 = move-exception
            wjw r7 = b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.io.File r8 = r5.e
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.d(r8, r6)
            return
        L_0x006e:
            r6 = move-exception
            goto L_0x0079
        L_0x0070:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x0080
        L_0x0075:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0079:
            java.security.cert.CertificateEncodingException r9 = new java.security.cert.CertificateEncodingException     // Catch:{ all -> 0x007f }
            r9.<init>(r6)     // Catch:{ all -> 0x007f }
            throw r9     // Catch:{ all -> 0x007f }
        L_0x007f:
            r6 = move-exception
        L_0x0080:
            if (r7 == 0) goto L_0x009a
            r7.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x009a
        L_0x0086:
            r7 = move-exception
            wjw r9 = b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.io.File r8 = r5.e
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.d(r8, r7)
        L_0x009a:
            throw r6
        L_0x009b:
            r6 = move-exception
            wjw r7 = b
            java.lang.String r8 = "Failed to generate a self-signed X.509 certificate using Bouncy Castle:"
            r7.b(r8, r6)
            java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
            java.lang.String r7 = "No provider succeeded to generate a self-signed certificate. See debug log for the root cause."
            r6.<init>(r7)
            throw r6
        L_0x00ab:
            r6 = move-exception
            java.lang.Error r7 = new java.lang.Error
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgk.<init>(java.lang.String, java.security.SecureRandom, int, java.util.Date, java.util.Date):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cd, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String[] a(java.lang.String r6, java.security.PrivateKey r7, java.security.cert.X509Certificate r8) {
        /*
            byte[] r7 = r7.getEncoded()
            vyv r7 = defpackage.vzw.a(r7)
            r0 = 1
            vyv r1 = defpackage.wdh.a(r7, r0)     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "-----BEGIN PRIVATE KEY-----\n"
            r2.<init>(r3)     // Catch:{ all -> 0x00db }
            java.nio.charset.Charset r3 = defpackage.whb.b     // Catch:{ all -> 0x00db }
            java.lang.String r3 = r1.a(r3)     // Catch:{ all -> 0x00db }
            r2.append(r3)     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "\n-----END PRIVATE KEY-----\n"
            r2.append(r3)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00db }
            r1.B()     // Catch:{ all -> 0x00e0 }
            r7.B()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "keyutil_"
            r7.<init>(r1)
            r7.append(r6)
            r3 = 95
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = ".key"
            java.io.File r7 = java.io.File.createTempFile(r7, r4)
            r7.deleteOnExit()
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r7)
            java.nio.charset.Charset r5 = defpackage.whb.b     // Catch:{ all -> 0x00d3 }
            byte[] r2 = r2.getBytes(r5)     // Catch:{ all -> 0x00d3 }
            r4.write(r2)     // Catch:{ all -> 0x00d3 }
            r4.close()     // Catch:{ all -> 0x00d3 }
            byte[] r8 = r8.getEncoded()
            vyv r8 = defpackage.vzw.a(r8)
            vyv r2 = defpackage.wdh.a(r8, r0)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "-----BEGIN CERTIFICATE-----\n"
            r4.<init>(r5)     // Catch:{ all -> 0x00c9 }
            java.nio.charset.Charset r5 = defpackage.whb.b     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = r2.a(r5)     // Catch:{ all -> 0x00c9 }
            r4.append(r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "\n-----END CERTIFICATE-----\n"
            r4.append(r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c9 }
            r2.B()     // Catch:{ all -> 0x00ce }
            r8.B()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            r8.append(r6)
            r8.append(r3)
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = ".crt"
            java.io.File r6 = java.io.File.createTempFile(r6, r8)
            r6.deleteOnExit()
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r8.<init>(r6)
            java.nio.charset.Charset r1 = defpackage.whb.b     // Catch:{ all -> 0x00be }
            byte[] r1 = r4.getBytes(r1)     // Catch:{ all -> 0x00be }
            r8.write(r1)     // Catch:{ all -> 0x00be }
            r8.close()     // Catch:{ all -> 0x00be }
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            r1 = 0
            java.lang.String r6 = r6.getPath()
            r8[r1] = r6
            java.lang.String r6 = r7.getPath()
            r8[r0] = r6
            return r8
        L_0x00be:
            r0 = move-exception
            a(r6, r8)
            a(r6)
            a(r7)
            throw r0
        L_0x00c9:
            r6 = move-exception
            r2.B()     // Catch:{ all -> 0x00ce }
            throw r6     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r6 = move-exception
            r8.B()
            throw r6
        L_0x00d3:
            r6 = move-exception
            a(r7, r4)
            a(r7)
            throw r6
        L_0x00db:
            r6 = move-exception
            r1.B()     // Catch:{ all -> 0x00e0 }
            throw r6     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r6 = move-exception
            r7.B()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgk.a(java.lang.String, java.security.PrivateKey, java.security.cert.X509Certificate):java.lang.String[]");
    }

    private static void a(File file) {
        if (!file.delete()) {
            wjw wjw = b;
            StringBuilder sb = new StringBuilder("Failed to delete a file: ");
            sb.append(file);
            wjw.d(sb.toString());
        }
    }

    private static void a(File file, OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e2) {
            wjw wjw = b;
            StringBuilder sb = new StringBuilder("Failed to close a file: ");
            sb.append(file);
            wjw.d(sb.toString(), (Throwable) e2);
        }
    }
}
