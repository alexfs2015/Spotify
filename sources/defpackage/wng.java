package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: wng reason: default package */
public final class wng implements wly {
    public volatile wmw a;
    public Object b;
    public volatile boolean c;
    private final wmb d;
    private final boolean e;

    public wng(wmb wmb, boolean z) {
        this.d = wmb;
        this.e = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wmd] */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r14v1, types: [wmg, wmz, wme, wmt] */
    /* JADX WARNING: type inference failed for: r4v4, types: [wmd] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r15v1, types: [wmd] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r4v25, types: [wmd] */
    /* JADX WARNING: type inference failed for: r7v12, types: [wme] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v15, types: [wme] */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r4v33, types: [wmd] */
    /* JADX WARNING: type inference failed for: r4v40, types: [wmd] */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        if (r8.equals("HEAD") == false) goto L_0x0156;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v1, types: [wmg, wmz, wme, wmt]
      assigns: []
      uses: [?[OBJECT, ARRAY], wmz, wmt, wme, wmg]
      mth insns count: 238
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0159 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e3 A[Catch:{ IOException -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wmf a(defpackage.wly.a r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "PROPFIND"
            wmd r0 = r18.a()
            r3 = r18
            wnd r3 = (defpackage.wnd) r3
            wlj r10 = r3.e
            wlt r11 = r3.f
            wmw r12 = new wmw
            wmb r4 = r1.d
            wln r5 = r4.u
            wlx r4 = r0.a
            wlf r6 = r1.a(r4)
            java.lang.Object r9 = r1.b
            r4 = r12
            r7 = r10
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r1.a = r12
            r13 = 0
            r14 = 0
            r4 = r0
            r5 = r14
            r6 = 0
        L_0x002b:
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x0216
            r7 = 1
            wmf r0 = r3.a(r4, r12, r14, r14)     // Catch:{ RouteException -> 0x01fd, IOException -> 0x01ec, all -> 0x01e9 }
            if (r5 == 0) goto L_0x0059
            wmf$a r0 = r0.b()
            wmf$a r4 = r5.b()
            r4.g = r14
            wmf r4 = r4.a()
            if (r4 == 0) goto L_0x0053
            wmg r5 = r4.g
            if (r5 != 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "priorResponse.body != null"
            r0.<init>(r2)
            throw r0
        L_0x0053:
            r0.j = r4
            wmf r0 = r0.a()
        L_0x0059:
            wmh r4 = r12.a     // Catch:{ IOException -> 0x01e4 }
            if (r0 == 0) goto L_0x01de
            int r5 = r0.c     // Catch:{ IOException -> 0x01e4 }
            wmd r8 = r0.a     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r8 = r8.b     // Catch:{ IOException -> 0x01e4 }
            r9 = 307(0x133, float:4.3E-43)
            java.lang.String r15 = "GET"
            if (r5 == r9) goto L_0x00cf
            r9 = 308(0x134, float:4.32E-43)
            if (r5 == r9) goto L_0x00cf
            r9 = 401(0x191, float:5.62E-43)
            if (r5 == r9) goto L_0x0156
            r9 = 503(0x1f7, float:7.05E-43)
            if (r5 == r9) goto L_0x00b7
            r9 = 407(0x197, float:5.7E-43)
            if (r5 == r9) goto L_0x00a3
            r4 = 408(0x198, float:5.72E-43)
            if (r5 == r4) goto L_0x0082
            switch(r5) {
                case 300: goto L_0x00dd;
                case 301: goto L_0x00dd;
                case 302: goto L_0x00dd;
                case 303: goto L_0x00dd;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0156
        L_0x0082:
            wmb r5 = r1.d     // Catch:{ IOException -> 0x01e4 }
            boolean r5 = r5.y     // Catch:{ IOException -> 0x01e4 }
            if (r5 == 0) goto L_0x0156
            wmd r5 = r0.a     // Catch:{ IOException -> 0x01e4 }
            wme r5 = r5.d     // Catch:{ IOException -> 0x01e4 }
            boolean r5 = r5 instanceof defpackage.wni     // Catch:{ IOException -> 0x01e4 }
            if (r5 != 0) goto L_0x0156
            wmf r5 = r0.j     // Catch:{ IOException -> 0x01e4 }
            if (r5 == 0) goto L_0x009a
            wmf r5 = r0.j     // Catch:{ IOException -> 0x01e4 }
            int r5 = r5.c     // Catch:{ IOException -> 0x01e4 }
            if (r5 == r4) goto L_0x0156
        L_0x009a:
            int r4 = a(r0, r13)     // Catch:{ IOException -> 0x01e4 }
            if (r4 > 0) goto L_0x0156
            wmd r4 = r0.a     // Catch:{ IOException -> 0x01e4 }
            goto L_0x00cc
        L_0x00a3:
            java.net.Proxy r4 = r4.b     // Catch:{ IOException -> 0x01e4 }
            java.net.Proxy$Type r4 = r4.type()     // Catch:{ IOException -> 0x01e4 }
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x01e4 }
            if (r4 != r5) goto L_0x00af
            goto L_0x0156
        L_0x00af:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r2)     // Catch:{ IOException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e4 }
        L_0x00b7:
            wmf r4 = r0.j     // Catch:{ IOException -> 0x01e4 }
            if (r4 == 0) goto L_0x00c1
            wmf r4 = r0.j     // Catch:{ IOException -> 0x01e4 }
            int r4 = r4.c     // Catch:{ IOException -> 0x01e4 }
            if (r4 == r9) goto L_0x0156
        L_0x00c1:
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r4 = a(r0, r4)     // Catch:{ IOException -> 0x01e4 }
            if (r4 != 0) goto L_0x0156
            wmd r4 = r0.a     // Catch:{ IOException -> 0x01e4 }
        L_0x00cc:
            r15 = r4
            goto L_0x0157
        L_0x00cf:
            boolean r4 = r8.equals(r15)     // Catch:{ IOException -> 0x01e4 }
            if (r4 != 0) goto L_0x00dd
            java.lang.String r4 = "HEAD"
            boolean r4 = r8.equals(r4)     // Catch:{ IOException -> 0x01e4 }
            if (r4 == 0) goto L_0x0156
        L_0x00dd:
            wmb r4 = r1.d     // Catch:{ IOException -> 0x01e4 }
            boolean r4 = r4.x     // Catch:{ IOException -> 0x01e4 }
            if (r4 == 0) goto L_0x0156
            java.lang.String r4 = "Location"
            java.lang.String r4 = r0.a(r4)     // Catch:{ IOException -> 0x01e4 }
            if (r4 == 0) goto L_0x0156
            wmd r5 = r0.a     // Catch:{ IOException -> 0x01e4 }
            wlx r5 = r5.a     // Catch:{ IOException -> 0x01e4 }
            wlx r4 = r5.c(r4)     // Catch:{ IOException -> 0x01e4 }
            if (r4 == 0) goto L_0x0156
            java.lang.String r5 = r4.a     // Catch:{ IOException -> 0x01e4 }
            wmd r9 = r0.a     // Catch:{ IOException -> 0x01e4 }
            wlx r9 = r9.a     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r9 = r9.a     // Catch:{ IOException -> 0x01e4 }
            boolean r5 = r5.equals(r9)     // Catch:{ IOException -> 0x01e4 }
            if (r5 != 0) goto L_0x0109
            wmb r5 = r1.d     // Catch:{ IOException -> 0x01e4 }
            boolean r5 = r5.w     // Catch:{ IOException -> 0x01e4 }
            if (r5 == 0) goto L_0x0156
        L_0x0109:
            wmd r5 = r0.a     // Catch:{ IOException -> 0x01e4 }
            wmd$a r5 = r5.a()     // Catch:{ IOException -> 0x01e4 }
            boolean r9 = defpackage.wnc.c(r8)     // Catch:{ IOException -> 0x01e4 }
            if (r9 == 0) goto L_0x0141
            boolean r9 = r8.equals(r2)     // Catch:{ IOException -> 0x01e4 }
            boolean r16 = r8.equals(r2)     // Catch:{ IOException -> 0x01e4 }
            r7 = r16 ^ 1
            if (r7 == 0) goto L_0x0125
            r5.a(r15, r14)     // Catch:{ IOException -> 0x01e4 }
            goto L_0x0130
        L_0x0125:
            if (r9 == 0) goto L_0x012c
            wmd r7 = r0.a     // Catch:{ IOException -> 0x01e4 }
            wme r7 = r7.d     // Catch:{ IOException -> 0x01e4 }
            goto L_0x012d
        L_0x012c:
            r7 = r14
        L_0x012d:
            r5.a(r8, r7)     // Catch:{ IOException -> 0x01e4 }
        L_0x0130:
            if (r9 != 0) goto L_0x0141
            java.lang.String r7 = "Transfer-Encoding"
            r5.b(r7)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r7 = "Content-Length"
            r5.b(r7)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r7 = "Content-Type"
            r5.b(r7)     // Catch:{ IOException -> 0x01e4 }
        L_0x0141:
            boolean r7 = a(r0, r4)     // Catch:{ IOException -> 0x01e4 }
            if (r7 != 0) goto L_0x014c
            java.lang.String r7 = "Authorization"
            r5.b(r7)     // Catch:{ IOException -> 0x01e4 }
        L_0x014c:
            wmd$a r4 = r5.a(r4)     // Catch:{ IOException -> 0x01e4 }
            wmd r4 = r4.a()     // Catch:{ IOException -> 0x01e4 }
            goto L_0x00cc
        L_0x0156:
            r15 = r14
        L_0x0157:
            if (r15 != 0) goto L_0x015d
            r12.c()
            return r0
        L_0x015d:
            wmg r4 = r0.g
            defpackage.wmk.a(r4)
            int r9 = r6 + 1
            r4 = 20
            if (r9 > r4) goto L_0x01c6
            wme r4 = r15.d
            boolean r4 = r4 instanceof defpackage.wni
            if (r4 != 0) goto L_0x01b9
            wlx r4 = r15.a
            boolean r4 = a(r0, r4)
            if (r4 != 0) goto L_0x0195
            r12.c()
            wmw r12 = new wmw
            wmb r4 = r1.d
            wln r5 = r4.u
            wlx r4 = r15.a
            wlf r6 = r1.a(r4)
            java.lang.Object r8 = r1.b
            r4 = r12
            r7 = r10
            r16 = r8
            r8 = r11
            r14 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r1.a = r12
            goto L_0x019c
        L_0x0195:
            r14 = r9
            wmz r4 = r12.a()
            if (r4 != 0) goto L_0x01a0
        L_0x019c:
            r5 = r0
            r6 = r14
            r4 = r15
            goto L_0x0207
        L_0x01a0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Closing the body of "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01b9:
            r12.c()
            java.net.HttpRetryException r2 = new java.net.HttpRetryException
            int r0 = r0.c
            java.lang.String r3 = "Cannot retry streamed HTTP body"
            r2.<init>(r3, r0)
            throw r2
        L_0x01c6:
            r14 = r9
            r12.c()
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Too many follow-up requests: "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01de:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01e4 }
            r0.<init>()     // Catch:{ IOException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            r12.c()
            throw r0
        L_0x01e9:
            r0 = move-exception
            r2 = r14
            goto L_0x020f
        L_0x01ec:
            r0 = move-exception
            r8 = r0
            boolean r0 = r8 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x01f4
            goto L_0x01f5
        L_0x01f4:
            r7 = 0
        L_0x01f5:
            boolean r0 = r1.a(r8, r12, r7, r4)     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01fc
            goto L_0x0207
        L_0x01fc:
            throw r8     // Catch:{ all -> 0x020d }
        L_0x01fd:
            r0 = move-exception
            r7 = r0
            java.io.IOException r0 = r7.lastException     // Catch:{ all -> 0x020d }
            boolean r0 = r1.a(r0, r12, r13, r4)     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x020a
        L_0x0207:
            r14 = 0
            goto L_0x002b
        L_0x020a:
            java.io.IOException r0 = r7.firstException     // Catch:{ all -> 0x020d }
            throw r0     // Catch:{ all -> 0x020d }
        L_0x020d:
            r0 = move-exception
            r2 = 0
        L_0x020f:
            r12.a(r2)
            r12.c()
            throw r0
        L_0x0216:
            r12.c()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            goto L_0x0222
        L_0x0221:
            throw r0
        L_0x0222:
            goto L_0x0221
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wng.a(wly$a):wmf");
    }

    private wlf a(wlx wlx) {
        wll wll;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        wlx wlx2 = wlx;
        if (wlx.c()) {
            SSLSocketFactory sSLSocketFactory2 = this.d.o;
            hostnameVerifier = this.d.q;
            sSLSocketFactory = sSLSocketFactory2;
            wll = this.d.r;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            wll = null;
        }
        wlf wlf = new wlf(wlx2.b, wlx2.c, this.d.v, this.d.n, sSLSocketFactory, hostnameVerifier, wll, this.d.s, this.d.d, this.d.e, this.d.f, this.d.j);
        return wlf;
    }

    private boolean a(IOException iOException, wmw wmw, boolean z, wmd wmd) {
        wmw.a(iOException);
        if (!this.d.y) {
            return false;
        }
        if ((!z || !(wmd.d instanceof wni)) && a(iOException, z) && wmw.f()) {
            return true;
        }
        return false;
    }

    private static boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private static int a(wmf wmf, int i) {
        String a2 = wmf.a("Retry-After", null);
        if (a2 == null) {
            return i;
        }
        if (a2.matches("\\d+")) {
            return Integer.valueOf(a2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static boolean a(wmf wmf, wlx wlx) {
        wlx wlx2 = wmf.a.a;
        return wlx2.b.equals(wlx.b) && wlx2.c == wlx.c && wlx2.a.equals(wlx.a);
    }
}
