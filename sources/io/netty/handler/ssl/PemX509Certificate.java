package io.netty.handler.ssl;

import io.netty.util.IllegalReferenceCountException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

public final class PemX509Certificate extends X509Certificate implements wud {
    private static final byte[] a = "-----BEGIN CERTIFICATE-----\n".getBytes(wvh.b);
    private static final byte[] b = "\n-----END CERTIFICATE-----\n".getBytes(wvh.b);
    private final wnb content;

    private static wnb a(wnc wnc, boolean z, int i) {
        return z ? wnc.d(i) : wnc.a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.wnb a(defpackage.wnc r2, boolean r3, java.security.cert.X509Certificate r4, int r5, defpackage.wnb r6) {
        /*
            byte[] r4 = r4.getEncoded()
            wnb r4 = defpackage.woc.a(r4)
            wnb r0 = defpackage.wun.a(r2, r4)     // Catch:{ all -> 0x0039 }
            if (r6 != 0) goto L_0x0020
            byte[] r6 = a     // Catch:{ all -> 0x0034 }
            int r6 = r6.length     // Catch:{ all -> 0x0034 }
            int r1 = r0.g()     // Catch:{ all -> 0x0034 }
            int r6 = r6 + r1
            byte[] r1 = b     // Catch:{ all -> 0x0034 }
            int r1 = r1.length     // Catch:{ all -> 0x0034 }
            int r6 = r6 + r1
            int r6 = r6 * r5
            wnb r6 = a(r2, r3, r6)     // Catch:{ all -> 0x0034 }
        L_0x0020:
            byte[] r2 = a     // Catch:{ all -> 0x0034 }
            r6.b(r2)     // Catch:{ all -> 0x0034 }
            r6.a(r0)     // Catch:{ all -> 0x0034 }
            byte[] r2 = b     // Catch:{ all -> 0x0034 }
            r6.b(r2)     // Catch:{ all -> 0x0034 }
            r0.B()     // Catch:{ all -> 0x0039 }
            r4.B()
            return r6
        L_0x0034:
            r2 = move-exception
            r0.B()     // Catch:{ all -> 0x0039 }
            throw r2     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r2 = move-exception
            r4.B()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.PemX509Certificate.a(wnc, boolean, java.security.cert.X509Certificate, int, wnb):wnb");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wud a(defpackage.wnc r7, boolean r8, java.security.cert.X509Certificate... r9) {
        /*
            if (r9 == 0) goto L_0x0073
            int r8 = r9.length
            if (r8 == 0) goto L_0x0073
            int r8 = r9.length
            r0 = 0
            r1 = 1
            if (r8 != r1) goto L_0x0017
            r8 = r9[r0]
            boolean r2 = r8 instanceof defpackage.wud
            if (r2 == 0) goto L_0x0017
            wud r8 = (defpackage.wud) r8
            wud r7 = r8.c()
            return r7
        L_0x0017:
            r8 = 0
            int r2 = r9.length     // Catch:{ all -> 0x006b }
            r3 = r8
            r8 = 0
        L_0x001b:
            if (r8 >= r2) goto L_0x0063
            r4 = r9[r8]     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x004b
            boolean r5 = r4 instanceof defpackage.wud     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0043
            wud r4 = (defpackage.wud) r4     // Catch:{ all -> 0x0069 }
            int r5 = r9.length     // Catch:{ all -> 0x0069 }
            wnb r4 = r4.a()     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x0039
            int r6 = r4.g()     // Catch:{ all -> 0x0069 }
            int r6 = r6 * r5
            wnb r5 = a(r7, r1, r6)     // Catch:{ all -> 0x0069 }
            goto L_0x003a
        L_0x0039:
            r5 = r3
        L_0x003a:
            wnb r4 = r4.t()     // Catch:{ all -> 0x0069 }
            r5.a(r4)     // Catch:{ all -> 0x0069 }
            r3 = r5
            goto L_0x0048
        L_0x0043:
            int r5 = r9.length     // Catch:{ all -> 0x0069 }
            wnb r3 = a(r7, r1, r4, r5, r3)     // Catch:{ all -> 0x0069 }
        L_0x0048:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x004b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "Null element in chain: "
            r8.<init>(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r9 = java.util.Arrays.toString(r9)     // Catch:{ all -> 0x0069 }
            r8.append(r9)     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0069 }
            r7.<init>(r8)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0063:
            wuf r7 = new wuf     // Catch:{ all -> 0x0069 }
            r7.<init>(r3, r0)     // Catch:{ all -> 0x0069 }
            return r7
        L_0x0069:
            r7 = move-exception
            goto L_0x006d
        L_0x006b:
            r7 = move-exception
            r3 = r8
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            r3.B()
        L_0x0072:
            throw r7
        L_0x0073:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "X.509 certificate chain can't be null or empty"
            r7.<init>(r8)
            goto L_0x007c
        L_0x007b:
            throw r7
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.PemX509Certificate.a(wnc, boolean, java.security.cert.X509Certificate[]):wud");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public PemX509Certificate c() {
        this.content.A();
        return this;
    }

    public final boolean B() {
        return this.content.B();
    }

    public final wnb a() {
        int z = this.content.z();
        if (z > 0) {
            return this.content;
        }
        throw new IllegalReferenceCountException(z);
    }

    public final /* synthetic */ wvo b(Object obj) {
        this.content.b(obj);
        return this;
    }

    public final boolean b() {
        return false;
    }

    public final void checkValidity() {
        throw new UnsupportedOperationException();
    }

    public final void checkValidity(Date date) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PemX509Certificate)) {
            return false;
        }
        return this.content.equals(((PemX509Certificate) obj).content);
    }

    public final int getBasicConstraints() {
        throw new UnsupportedOperationException();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getExtensionValue(String str) {
        throw new UnsupportedOperationException();
    }

    public final Principal getIssuerDN() {
        throw new UnsupportedOperationException();
    }

    public final boolean[] getIssuerUniqueID() {
        throw new UnsupportedOperationException();
    }

    public final boolean[] getKeyUsage() {
        throw new UnsupportedOperationException();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        throw new UnsupportedOperationException();
    }

    public final Date getNotAfter() {
        throw new UnsupportedOperationException();
    }

    public final Date getNotBefore() {
        throw new UnsupportedOperationException();
    }

    public final PublicKey getPublicKey() {
        throw new UnsupportedOperationException();
    }

    public final BigInteger getSerialNumber() {
        throw new UnsupportedOperationException();
    }

    public final String getSigAlgName() {
        throw new UnsupportedOperationException();
    }

    public final String getSigAlgOID() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getSigAlgParams() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getSignature() {
        throw new UnsupportedOperationException();
    }

    public final Principal getSubjectDN() {
        throw new UnsupportedOperationException();
    }

    public final boolean[] getSubjectUniqueID() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getTBSCertificate() {
        throw new UnsupportedOperationException();
    }

    public final int getVersion() {
        throw new UnsupportedOperationException();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    public final String toString() {
        return this.content.a(wvh.a);
    }

    public final void verify(PublicKey publicKey) {
        throw new UnsupportedOperationException();
    }

    public final void verify(PublicKey publicKey, String str) {
        throw new UnsupportedOperationException();
    }

    public final int z() {
        return this.content.z();
    }
}
