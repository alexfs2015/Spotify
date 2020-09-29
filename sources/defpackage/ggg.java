package defpackage;

/* renamed from: ggg reason: default package */
final class ggg {
    private gfu a;

    public ggg(gfu gfu) {
        this.a = gfu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r5.a.a((java.lang.Throwable) r2, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[SYNTHETIC, Splitter:B:18:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[SYNTHETIC, Splitter:B:24:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing BufferedReader."
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/sys/kernel/random/boot_id"
            r1.<init>(r2)
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002a }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x002a }
            r4.<init>(r1)     // Catch:{ Exception -> 0x002a }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r3.close()     // Catch:{ Exception -> 0x001c }
            goto L_0x0022
        L_0x001c:
            r2 = move-exception
            gfu r3 = r5.a
            r3.a(r2, r0)
        L_0x0022:
            return r1
        L_0x0023:
            r1 = move-exception
            r2 = r3
            goto L_0x003f
        L_0x0026:
            r2 = r3
            goto L_0x002a
        L_0x0028:
            r1 = move-exception
            goto L_0x003f
        L_0x002a:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ Exception -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r2 = move-exception
            gfu r3 = r5.a
            r3.a(r2, r0)
        L_0x003e:
            return r1
        L_0x003f:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r2 = move-exception
            gfu r3 = r5.a
            r3.a(r2, r0)
        L_0x004b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggg.a():java.lang.String");
    }
}
