package com.moat.analytics.mobile;

import java.io.InputStream;
import java.io.InputStreamReader;

enum ab implements aa {
    instance;

    private String a(InputStream inputStream, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        char[] cArr = new char[i];
        int read = inputStreamReader.read(cArr);
        if (read < 0) {
            i = 0;
        } else if (read <= i) {
            i = read;
        }
        return new String(cArr, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = com.moat.analytics.mobile.base.functional.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.moat.analytics.mobile.base.functional.a<java.lang.String> a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0049 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0049 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ IOException -> 0x0049 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0049 }
            r1 = 0
            r4.setUseCaches(r1)     // Catch:{ IOException -> 0x0049 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r4.setReadTimeout(r1)     // Catch:{ IOException -> 0x0049 }
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0049 }
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch:{ IOException -> 0x0049 }
            r1 = 1
            r4.setDoInput(r1)     // Catch:{ IOException -> 0x0049 }
            r4.connect()     // Catch:{ IOException -> 0x0049 }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x0049 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0033
            com.moat.analytics.mobile.base.functional.a r4 = com.moat.analytics.mobile.base.functional.a.a()     // Catch:{ IOException -> 0x0049 }
            return r4
        L_0x0033:
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ IOException -> 0x0049 }
            r4 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = r3.a(r0, r4)     // Catch:{ IOException -> 0x0049 }
            com.moat.analytics.mobile.base.functional.a r4 = com.moat.analytics.mobile.base.functional.a.a(r4)     // Catch:{ IOException -> 0x0049 }
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r4
        L_0x0047:
            r4 = move-exception
            goto L_0x0053
        L_0x0049:
            com.moat.analytics.mobile.base.functional.a r4 = com.moat.analytics.mobile.base.functional.a.a()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r4
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.ab.a(java.lang.String):com.moat.analytics.mobile.base.functional.a");
    }
}
