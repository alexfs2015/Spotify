package io.netty.handler.ssl;

import io.netty.util.IllegalReferenceCountException;
import java.security.PrivateKey;

public final class PemPrivateKey extends wvb implements PrivateKey, wud {
    private static final byte[] a = "-----BEGIN PRIVATE KEY-----\n".getBytes(wvh.b);
    private static final byte[] b = "\n-----END PRIVATE KEY-----\n".getBytes(wvh.b);
    private final wnb content;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wud a(defpackage.wnc r2, boolean r3, java.security.PrivateKey r4) {
        /*
            boolean r3 = r4 instanceof defpackage.wud
            if (r3 == 0) goto L_0x000b
            wud r4 = (defpackage.wud) r4
            wud r2 = r4.c()
            return r2
        L_0x000b:
            byte[] r3 = r4.getEncoded()
            wnb r3 = defpackage.woc.a(r3)
            wnb r4 = defpackage.wun.a(r2, r3)     // Catch:{ all -> 0x004b }
            byte[] r0 = a     // Catch:{ all -> 0x0046 }
            int r0 = r0.length     // Catch:{ all -> 0x0046 }
            int r1 = r4.g()     // Catch:{ all -> 0x0046 }
            int r0 = r0 + r1
            byte[] r1 = b     // Catch:{ all -> 0x0046 }
            int r1 = r1.length     // Catch:{ all -> 0x0046 }
            int r0 = r0 + r1
            wnb r2 = r2.d(r0)     // Catch:{ all -> 0x0046 }
            byte[] r0 = a     // Catch:{ all -> 0x0041 }
            r2.b(r0)     // Catch:{ all -> 0x0041 }
            r2.a(r4)     // Catch:{ all -> 0x0041 }
            byte[] r0 = b     // Catch:{ all -> 0x0041 }
            r2.b(r0)     // Catch:{ all -> 0x0041 }
            wuf r0 = new wuf     // Catch:{ all -> 0x0041 }
            r1 = 1
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0041 }
            defpackage.wun.b(r4)     // Catch:{ all -> 0x004b }
            defpackage.wun.b(r3)
            return r0
        L_0x0041:
            r0 = move-exception
            defpackage.wun.b(r2)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            defpackage.wun.b(r4)     // Catch:{ all -> 0x004b }
            throw r2     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            defpackage.wun.b(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.PemPrivateKey.a(wnc, boolean, java.security.PrivateKey):wud");
    }

    public final wnb a() {
        int z = z();
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
        return true;
    }

    public final /* synthetic */ wud c() {
        return (PemPrivateKey) super.e();
    }

    public final void d() {
        wun.b(this.content);
    }

    public final void destroy() {
        int z = z();
        if (z > 0) {
            super.a(z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("decrement");
        sb.append(": ");
        sb.append(z);
        sb.append(" (expected: > 0)");
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ wvo e() {
        return (PemPrivateKey) super.e();
    }

    public final String getAlgorithm() {
        throw new UnsupportedOperationException();
    }

    public final byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final boolean isDestroyed() {
        return z() == 0;
    }
}
