package defpackage;

import java.net.URL;
import java.util.Map;

/* renamed from: erd reason: default package */
final class erd implements Runnable {
    private final URL a;
    private final byte[] b;
    private final erb c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ era f;

    public erd(era era, String str, URL url, byte[] bArr, Map<String, String> map, erb erb) {
        this.f = era;
        bwx.a(str);
        bwx.a(url);
        bwx.a(erb);
        this.a = url;
        this.b = bArr;
        this.c = erb;
        this.d = str;
        this.e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ff A[SYNTHETIC, Splitter:B:57:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0138 A[SYNTHETIC, Splitter:B:68:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            era r1 = r13.f
            r1.b()
            r1 = 0
            r2 = 0
            era r3 = r13.f     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            java.net.URL r4 = r13.a     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            if (r5 == 0) goto L_0x00f0
            javax.net.ssl.SSLSocketFactory r5 = r3.a     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            if (r5 == 0) goto L_0x0025
            boolean r5 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            if (r5 == 0) goto L_0x0025
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            javax.net.ssl.SSLSocketFactory r3 = r3.a     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r5.setSSLSocketFactory(r3)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
        L_0x0025:
            r3 = r4
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r3.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r4 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r4)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.e     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r5 == 0) goto L_0x0068
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.e     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
        L_0x004c:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r3.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            goto L_0x004c
        L_0x0068:
            byte[] r5 = r13.b     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            if (r5 == 0) goto L_0x00b0
            era r5 = r13.f     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            evi r5 = r5.f()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            byte[] r6 = r13.b     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            byte[] r5 = r5.b(r6)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            era r6 = r13.f     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            eqw r6 = r6.q()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            eqy r6 = r6.k     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r6.a(r7, r8)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r3.setDoOutput(r4)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r4, r6)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            int r4 = r5.length     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r3.connect()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            r4.write(r5)     // Catch:{ IOException -> 0x00ab, all -> 0x00a6 }
            r4.close()     // Catch:{ IOException -> 0x00ab, all -> 0x00a6 }
            goto L_0x00b0
        L_0x00a6:
            r5 = move-exception
            r11 = r2
            r2 = r4
            r4 = r5
            goto L_0x00e9
        L_0x00ab:
            r5 = move-exception
            r10 = r2
            r2 = r4
            r8 = r5
            goto L_0x00ee
        L_0x00b0:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00eb, all -> 0x00e7 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00e2, all -> 0x00de }
            byte[] r10 = defpackage.era.a(r3)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            if (r3 == 0) goto L_0x00c1
            r3.disconnect()
        L_0x00c1:
            era r0 = r13.f
            eru r0 = r0.p()
            erc r1 = new erc
            java.lang.String r6 = r13.d
            erb r7 = r13.c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.a(r1)
            return
        L_0x00d7:
            r1 = move-exception
            r4 = r1
            goto L_0x00fd
        L_0x00da:
            r1 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00e5
        L_0x00de:
            r1 = move-exception
            r4 = r1
            r11 = r2
            goto L_0x00fd
        L_0x00e2:
            r1 = move-exception
            r10 = r2
            r7 = r8
        L_0x00e5:
            r8 = r1
            goto L_0x0136
        L_0x00e7:
            r4 = move-exception
            r11 = r2
        L_0x00e9:
            r8 = 0
            goto L_0x00fd
        L_0x00eb:
            r4 = move-exception
            r10 = r2
            r8 = r4
        L_0x00ee:
            r7 = 0
            goto L_0x0136
        L_0x00f0:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
            throw r3     // Catch:{ IOException -> 0x0131, all -> 0x00f8 }
        L_0x00f8:
            r3 = move-exception
            r11 = r2
            r4 = r3
            r8 = 0
            r3 = r11
        L_0x00fd:
            if (r2 == 0) goto L_0x0115
            r2.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0115
        L_0x0103:
            r1 = move-exception
            era r2 = r13.f
            eqw r2 = r2.q()
            eqy r2 = r2.c
            java.lang.String r5 = r13.d
            java.lang.Object r5 = defpackage.eqw.a(r5)
            r2.a(r0, r5, r1)
        L_0x0115:
            if (r3 == 0) goto L_0x011a
            r3.disconnect()
        L_0x011a:
            era r0 = r13.f
            eru r0 = r0.p()
            erc r1 = new erc
            java.lang.String r6 = r13.d
            erb r7 = r13.c
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.a(r1)
            throw r4
        L_0x0131:
            r3 = move-exception
            r10 = r2
            r8 = r3
            r7 = 0
            r3 = r10
        L_0x0136:
            if (r2 == 0) goto L_0x014e
            r2.close()     // Catch:{ IOException -> 0x013c }
            goto L_0x014e
        L_0x013c:
            r1 = move-exception
            era r2 = r13.f
            eqw r2 = r2.q()
            eqy r2 = r2.c
            java.lang.String r4 = r13.d
            java.lang.Object r4 = defpackage.eqw.a(r4)
            r2.a(r0, r4, r1)
        L_0x014e:
            if (r3 == 0) goto L_0x0153
            r3.disconnect()
        L_0x0153:
            era r0 = r13.f
            eru r0 = r0.p()
            erc r1 = new erc
            java.lang.String r5 = r13.d
            erb r6 = r13.c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erd.run():void");
    }
}
