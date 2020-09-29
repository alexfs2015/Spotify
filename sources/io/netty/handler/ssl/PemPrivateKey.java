package io.netty.handler.ssl;

import io.netty.util.IllegalReferenceCountException;
import java.security.PrivateKey;

public final class PemPrivateKey extends wgv implements PrivateKey, wfx {
    private static final byte[] a = "-----BEGIN PRIVATE KEY-----\n".getBytes(whb.b);
    private static final byte[] b = "\n-----END PRIVATE KEY-----\n".getBytes(whb.b);
    private final vyv content;

    public final boolean b() {
        return true;
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wfx a(defpackage.vyw r2, boolean r3, java.security.PrivateKey r4) {
        /*
            boolean r3 = r4 instanceof defpackage.wfx
            if (r3 == 0) goto L_0x000b
            wfx r4 = (defpackage.wfx) r4
            wfx r2 = r4.c()
            return r2
        L_0x000b:
            byte[] r3 = r4.getEncoded()
            vyv r3 = defpackage.vzw.a(r3)
            vyv r4 = defpackage.wgh.a(r2, r3)     // Catch:{ all -> 0x004b }
            byte[] r0 = a     // Catch:{ all -> 0x0046 }
            int r0 = r0.length     // Catch:{ all -> 0x0046 }
            int r1 = r4.g()     // Catch:{ all -> 0x0046 }
            int r0 = r0 + r1
            byte[] r1 = b     // Catch:{ all -> 0x0046 }
            int r1 = r1.length     // Catch:{ all -> 0x0046 }
            int r0 = r0 + r1
            vyv r2 = r2.d(r0)     // Catch:{ all -> 0x0046 }
            byte[] r0 = a     // Catch:{ all -> 0x0041 }
            r2.b(r0)     // Catch:{ all -> 0x0041 }
            r2.a(r4)     // Catch:{ all -> 0x0041 }
            byte[] r0 = b     // Catch:{ all -> 0x0041 }
            r2.b(r0)     // Catch:{ all -> 0x0041 }
            wfz r0 = new wfz     // Catch:{ all -> 0x0041 }
            r1 = 1
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0041 }
            defpackage.wgh.b(r4)     // Catch:{ all -> 0x004b }
            defpackage.wgh.b(r3)
            return r0
        L_0x0041:
            r0 = move-exception
            defpackage.wgh.b(r2)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            defpackage.wgh.b(r4)     // Catch:{ all -> 0x004b }
            throw r2     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            defpackage.wgh.b(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.PemPrivateKey.a(vyw, boolean, java.security.PrivateKey):wfx");
    }

    public final vyv a() {
        int z = z();
        if (z > 0) {
            return this.content;
        }
        throw new IllegalReferenceCountException(z);
    }

    public final void d() {
        wgh.b(this.content);
    }

    public final byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    public final String getAlgorithm() {
        throw new UnsupportedOperationException();
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

    public final boolean isDestroyed() {
        return z() == 0;
    }

    public final /* bridge */ /* synthetic */ whi e() {
        return (PemPrivateKey) super.e();
    }

    public final /* synthetic */ whi b(Object obj) {
        this.content.b(obj);
        return this;
    }

    public final /* synthetic */ wfx c() {
        return (PemPrivateKey) super.e();
    }
}
