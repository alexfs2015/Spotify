package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: bcl reason: default package */
public final class bcl extends bcb implements HttpDataSource {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> b = new AtomicReference<>();
    private final boolean c;
    private final int d;
    private final int e;
    private final String f;
    private final bec<String> g;
    private final c h;
    private final c i;
    private bcg j;
    private HttpURLConnection k;
    private InputStream l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private long q;

    public bcl(String str, bec<String> bec, int i2, int i3, boolean z, c cVar) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.f = str;
            this.g = null;
            this.i = new c();
            this.d = i2;
            this.e = i3;
            this.c = z;
            this.h = cVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0029
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002b
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.bdu.d(r3, r1)
        L_0x0029:
            r4 = -1
        L_0x002b:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x009b
            java.util.regex.Pattern r1 = a
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x009b
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x0087 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0087 }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x0087 }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0087 }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0061
            r4 = r6
            goto L_0x009b
        L_0x0061:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r8 = "Inconsistent headers ["
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0087 }
            defpackage.bdu.c(r3, r0)     // Catch:{ NumberFormatException -> 0x0087 }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x0087 }
            r4 = r0
            goto L_0x009b
        L_0x0087:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            defpackage.bdu.d(r3, r10)
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcl.a(java.net.HttpURLConnection):long");
    }

    private HttpURLConnection a(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.d);
        httpURLConnection.setReadTimeout(this.e);
        c cVar = this.h;
        if (cVar != null) {
            for (Entry entry : cVar.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.i.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(bcg.b(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private static URL a(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            StringBuilder sb = new StringBuilder("Unsupported protocol redirect: ");
            sb.append(protocol);
            throw new ProtocolException(sb.toString());
        }
        throw new ProtocolException("Null location redirect");
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                bdu.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.k = null;
        }
    }

    public final int a(byte[] bArr, int i2, int i3) {
        try {
            if (this.p != this.n) {
                byte[] bArr2 = (byte[]) b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (this.p != this.n) {
                    int read = this.l.read(bArr2, 0, (int) Math.min(this.n - this.p, (long) bArr2.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.p += (long) read;
                        a(read);
                    } else {
                        throw new EOFException();
                    }
                }
                b.set(bArr2);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.o != -1) {
                long j2 = this.o - this.q;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.l.read(bArr, i2, i3);
            if (read2 != -1) {
                this.q += (long) read2;
                a(read2);
                return read2;
            } else if (this.o == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new HttpDataSourceException(e2, this.j, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bcg r24) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            java.lang.String r13 = "Unable to connect to "
            r11.j = r12
            r14 = 0
            r11.q = r14
            r11.p = r14
            r23.b(r24)
            r10 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0192 }
            android.net.Uri r0 = r12.a     // Catch:{ IOException -> 0x0192 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0192 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0192 }
            int r3 = r12.b     // Catch:{ IOException -> 0x0192 }
            byte[] r4 = r12.c     // Catch:{ IOException -> 0x0192 }
            long r7 = r12.e     // Catch:{ IOException -> 0x0192 }
            long r5 = r12.f     // Catch:{ IOException -> 0x0192 }
            boolean r0 = r12.a(r10)     // Catch:{ IOException -> 0x0192 }
            boolean r1 = r11.c     // Catch:{ IOException -> 0x0192 }
            r9 = 0
            if (r1 != 0) goto L_0x0041
            r16 = 1
            r1 = r23
            r17 = r5
            r5 = r7
            r7 = r17
            r9 = r0
            r14 = 1
            r10 = r16
            java.net.HttpURLConnection r0 = r1.a(r2, r3, r4, r5, r7, r9, r10)     // Catch:{ IOException -> 0x0192 }
            goto L_0x00ac
        L_0x0041:
            r17 = r5
            r14 = 1
            r15 = r2
            r10 = r3
            r16 = r4
            r1 = 0
        L_0x0049:
            int r9 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x017a
            r19 = 0
            r1 = r23
            r2 = r15
            r3 = r10
            r4 = r16
            r5 = r7
            r20 = r7
            r7 = r17
            r22 = r9
            r9 = r0
            r14 = r10
            r10 = r19
            java.net.HttpURLConnection r1 = r1.a(r2, r3, r4, r5, r7, r9, r10)     // Catch:{ IOException -> 0x0192 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0192 }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x0192 }
            r4 = 303(0x12f, float:4.25E-43)
            r5 = 302(0x12e, float:4.23E-43)
            r6 = 301(0x12d, float:4.22E-43)
            r7 = 300(0x12c, float:4.2E-43)
            r8 = 1
            if (r14 == r8) goto L_0x007e
            r8 = 3
            if (r14 != r8) goto L_0x0090
        L_0x007e:
            if (r2 == r7) goto L_0x0168
            if (r2 == r6) goto L_0x0168
            if (r2 == r5) goto L_0x0168
            if (r2 == r4) goto L_0x0168
            r8 = 307(0x133, float:4.3E-43)
            if (r2 == r8) goto L_0x0168
            r8 = 308(0x134, float:4.32E-43)
            if (r2 != r8) goto L_0x0090
            goto L_0x0168
        L_0x0090:
            r8 = 2
            if (r14 != r8) goto L_0x00ab
            if (r2 == r7) goto L_0x009b
            if (r2 == r6) goto L_0x009b
            if (r2 == r5) goto L_0x009b
            if (r2 != r4) goto L_0x00ab
        L_0x009b:
            r1.disconnect()     // Catch:{ IOException -> 0x0192 }
            r16 = 0
            java.net.URL r15 = a(r15, r3)     // Catch:{ IOException -> 0x0192 }
            r7 = r20
            r1 = r22
            r10 = 1
            goto L_0x0177
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            r11.k = r0     // Catch:{ IOException -> 0x0192 }
            java.net.HttpURLConnection r0 = r11.k     // Catch:{ IOException -> 0x014b }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x014b }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x012f
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 <= r2) goto L_0x00be
            goto L_0x012f
        L_0x00be:
            java.net.HttpURLConnection r2 = r11.k
            java.lang.String r2 = r2.getContentType()
            bec<java.lang.String> r3 = r11.g
            if (r3 == 0) goto L_0x00d8
            boolean r3 = r3.evaluate(r2)
            if (r3 == 0) goto L_0x00cf
            goto L_0x00d8
        L_0x00cf:
            r23.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r2, r12)
            throw r0
        L_0x00d8:
            if (r0 != r1) goto L_0x00e5
            long r0 = r12.e
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00e7
            long r14 = r12.e
            goto L_0x00e8
        L_0x00e5:
            r4 = 0
        L_0x00e7:
            r14 = r4
        L_0x00e8:
            r11.n = r14
            r1 = 1
            boolean r0 = r12.a(r1)
            if (r0 != 0) goto L_0x010f
            long r0 = r12.f
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00fe
            long r0 = r12.f
            r11.o = r0
            goto L_0x0113
        L_0x00fe:
            java.net.HttpURLConnection r0 = r11.k
            long r0 = a(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x010c
            long r2 = r11.n
            long r2 = r0 - r2
        L_0x010c:
            r11.o = r2
            goto L_0x0113
        L_0x010f:
            long r0 = r12.f
            r11.o = r0
        L_0x0113:
            java.net.HttpURLConnection r0 = r11.k     // Catch:{ IOException -> 0x0124 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0124 }
            r11.l = r0     // Catch:{ IOException -> 0x0124 }
            r1 = 1
            r11.m = r1
            r23.c(r24)
            long r0 = r11.o
            return r0
        L_0x0124:
            r0 = move-exception
            r23.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r2 = 1
            r1.<init>(r0, r12, r2)
            throw r1
        L_0x012f:
            java.net.HttpURLConnection r1 = r11.k
            java.util.Map r1 = r1.getHeaderFields()
            r23.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            r2.<init>(r0, r1, r12)
            r1 = 416(0x1a0, float:5.83E-43)
            if (r0 != r1) goto L_0x014a
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException
            r6 = 0
            r0.<init>(r6)
            r2.initCause(r0)
        L_0x014a:
            throw r2
        L_0x014b:
            r0 = move-exception
            r23.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            android.net.Uri r3 = r12.a
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            r1.<init>(r2, r0, r12, r3)
            throw r1
        L_0x0168:
            r4 = 0
            r6 = 0
            r1.disconnect()     // Catch:{ IOException -> 0x0192 }
            java.net.URL r15 = a(r15, r3)     // Catch:{ IOException -> 0x0192 }
            r10 = r14
            r7 = r20
            r1 = r22
        L_0x0177:
            r14 = 1
            goto L_0x0049
        L_0x017a:
            r22 = r9
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0192 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0192 }
            java.lang.String r2 = "Too many redirects: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x0192 }
            r2 = r22
            r1.append(r2)     // Catch:{ IOException -> 0x0192 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0192 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0192 }
            throw r0     // Catch:{ IOException -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            android.net.Uri r3 = r12.a
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            r1.<init>(r2, r0, r12, r3)
            goto L_0x01ad
        L_0x01ac:
            throw r1
        L_0x01ad:
            goto L_0x01ac
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcl.a(bcg):long");
    }

    public final Uri a() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.l     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007c
            java.net.HttpURLConnection r2 = r9.k     // Catch:{ all -> 0x008b }
            long r3 = r9.o     // Catch:{ all -> 0x008b }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.o     // Catch:{ all -> 0x008b }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.o     // Catch:{ all -> 0x008b }
            long r7 = r9.q     // Catch:{ all -> 0x008b }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = defpackage.ben.a     // Catch:{ all -> 0x008b }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = defpackage.ben.a     // Catch:{ all -> 0x008b }
            r8 = 20
            if (r7 != r8) goto L_0x006c
        L_0x0024:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            int r3 = r2.read()     // Catch:{ Exception -> 0x006c }
            r4 = -1
            if (r3 != r4) goto L_0x003b
            goto L_0x006c
        L_0x0034:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x003b
            goto L_0x006c
        L_0x003b:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x006c }
            if (r3 == 0) goto L_0x006c
        L_0x0053:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006c }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            java.io.InputStream r2 = r9.l     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r3 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException     // Catch:{ all -> 0x008b }
            bcg r4 = r9.j     // Catch:{ all -> 0x008b }
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch:{ all -> 0x008b }
            throw r3     // Catch:{ all -> 0x008b }
        L_0x007c:
            r9.l = r0
            r9.e()
            boolean r0 = r9.m
            if (r0 == 0) goto L_0x008a
            r9.m = r1
            r9.d()
        L_0x008a:
            return
        L_0x008b:
            r2 = move-exception
            r9.l = r0
            r9.e()
            boolean r0 = r9.m
            if (r0 == 0) goto L_0x009a
            r9.m = r1
            r9.d()
        L_0x009a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcl.c():void");
    }
}
