package defpackage;

/* renamed from: dst reason: default package */
final class dst implements Runnable {
    private final /* synthetic */ dss a;

    dst(dss dss) {
        this.a = dss;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|25|28|29|(0)(0)|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        defpackage.cow.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        defpackage.cow.a(5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0096 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[SYNTHETIC, Splitter:B:31:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[SYNTHETIC, Splitter:B:36:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            dss r0 = r7.a
        L_0x0002:
            r1 = 5
            java.util.concurrent.BlockingQueue<dtc> r2 = r0.a     // Catch:{ InterruptedException -> 0x00c0 }
            java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x00c0 }
            dtc r2 = (defpackage.dtc) r2     // Catch:{ InterruptedException -> 0x00c0 }
            java.lang.String r3 = r2.b()     // Catch:{ InterruptedException -> 0x00c0 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0002
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r0.b
            java.util.Map r2 = r2.c()
            java.util.Map r2 = r0.a(r4, r2)
            java.lang.String r4 = r0.c
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.net.Uri$Builder r4 = r4.buildUpon()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r4.appendQueryParameter(r6, r5)
            goto L_0x0031
        L_0x004d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            java.lang.String r4 = "&it="
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x00b4
            java.io.File r3 = r0.g
            if (r3 == 0) goto L_0x00af
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0096 }
            r6 = 1
            r5.<init>(r3, r6)     // Catch:{ IOException -> 0x0096 }
            byte[] r2 = r2.getBytes()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r5.write(r2)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r2 = 10
            r5.write(r2)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r5.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0002
        L_0x008a:
            defpackage.cow.a(r1)
            goto L_0x0002
        L_0x008f:
            r0 = move-exception
            r4 = r5
            goto L_0x00a5
        L_0x0092:
            r4 = r5
            goto L_0x0096
        L_0x0094:
            r0 = move-exception
            goto L_0x00a5
        L_0x0096:
            defpackage.cow.a(r1)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0002
            r4.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x0002
        L_0x00a0:
            defpackage.cow.a(r1)
            goto L_0x0002
        L_0x00a5:
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch:{ IOException -> 0x00ab }
            goto L_0x00ae
        L_0x00ab:
            defpackage.cow.a(r1)
        L_0x00ae:
            throw r0
        L_0x00af:
            defpackage.cow.a(r1)
            goto L_0x0002
        L_0x00b4:
            defpackage.bjl.e()
            android.content.Context r1 = r0.d
            java.lang.String r3 = r0.e
            defpackage.cmd.a(r1, r3, r2)
            goto L_0x0002
        L_0x00c0:
            defpackage.cow.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dst.run():void");
    }
}
