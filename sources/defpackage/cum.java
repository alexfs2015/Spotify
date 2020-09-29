package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cum reason: default package */
public final class cum extends ckh {
    private final cvn a;
    private final SSLSocketFactory b;

    public cum() {
        this(0);
    }

    private cum(byte b2) {
        this(0);
    }

    private cum(char c) {
        this.a = null;
        this.b = null;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<drc> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String drc : (List) entry.getValue()) {
                    arrayList.add(new drc((String) entry.getKey(), drc));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, dwv<?> dwv) {
        byte[] a2 = dwv.a();
        if (a2 != null) {
            httpURLConnection.setDoOutput(true);
            String str = "application/x-www-form-urlencoded; charset=";
            String str2 = "UTF-8";
            httpURLConnection.addRequestProperty("Content-Type", str2.length() != 0 ? str.concat(str2) : new String(str));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a2);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        r0.setRequestMethod(r8);
        a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        r0.setRequestMethod(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.csl a(defpackage.dwv<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r2 = r7.b()
            r1.putAll(r2)
            r1.putAll(r8)
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r2)
            int r2 = r7.c()
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            r4.equals(r8)
            java.util.Set r8 = r1.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0046:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.addRequestProperty(r4, r5)
            goto L_0x0046
        L_0x005c:
            int r8 = r7.a
            switch(r8) {
                case -1: goto L_0x0089;
                case 0: goto L_0x0084;
                case 1: goto L_0x007b;
                case 2: goto L_0x0078;
                case 3: goto L_0x0075;
                case 4: goto L_0x0072;
                case 5: goto L_0x006f;
                case 6: goto L_0x006c;
                case 7: goto L_0x0069;
                default: goto L_0x0061;
            }
        L_0x0061:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)
            throw r7
        L_0x0069:
            java.lang.String r8 = "PATCH"
            goto L_0x007d
        L_0x006c:
            java.lang.String r8 = "TRACE"
            goto L_0x0086
        L_0x006f:
            java.lang.String r8 = "OPTIONS"
            goto L_0x0086
        L_0x0072:
            java.lang.String r8 = "HEAD"
            goto L_0x0086
        L_0x0075:
            java.lang.String r8 = "DELETE"
            goto L_0x0086
        L_0x0078:
            java.lang.String r8 = "PUT"
            goto L_0x007d
        L_0x007b:
            java.lang.String r8 = "POST"
        L_0x007d:
            r0.setRequestMethod(r8)
            a(r0, r7)
            goto L_0x0089
        L_0x0084:
            java.lang.String r8 = "GET"
        L_0x0086:
            r0.setRequestMethod(r8)
        L_0x0089:
            int r8 = r0.getResponseCode()
            r1 = -1
            if (r8 == r1) goto L_0x00ca
            int r7 = r7.a
            r1 = 4
            if (r7 == r1) goto L_0x00a6
            r7 = 100
            if (r7 > r8) goto L_0x009d
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L_0x00a6
        L_0x009d:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L_0x00a6
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L_0x00a6
            r2 = 1
        L_0x00a6:
            csl r7 = new csl
            if (r2 != 0) goto L_0x00b6
            java.util.Map r0 = r0.getHeaderFields()
            java.util.List r0 = a(r0)
            r7.<init>(r8, r0)
            return r7
        L_0x00b6:
            java.util.Map r1 = r0.getHeaderFields()
            java.util.List r1 = a(r1)
            int r2 = r0.getContentLength()
            java.io.InputStream r0 = a(r0)
            r7.<init>(r8, r1, r2, r0)
            return r7
        L_0x00ca:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)
            goto L_0x00d3
        L_0x00d2:
            throw r7
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cum.a(dwv, java.util.Map):csl");
    }
}
