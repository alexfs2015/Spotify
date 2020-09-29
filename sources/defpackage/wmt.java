package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: wmt reason: default package */
public final class wmt extends b {
    public final wmh a;
    public Socket b;
    public Socket c;
    public wlv d;
    wno e;
    wom f;
    wol g;
    public boolean h;
    public int i;
    public final List<Reference<wmw>> j = new ArrayList();
    public long k = Long.MAX_VALUE;
    private final wln m;
    private Protocol n;
    private int o = 1;

    public wmt(wln wln, wmh wmh) {
        this.m = wln;
        this.a = wmh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        if ((r0.getCause() instanceof java.security.cert.CertificateException) != false) goto L_0x015c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0161 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0161 A[EDGE_INSN: B:84:0x0161->B:78:0x0161 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r14, int r15, int r16, int r17, boolean r18, defpackage.wlj r19, defpackage.wlt r20) {
        /*
            r13 = this;
            r7 = r13
            r8 = r17
            okhttp3.Protocol r0 = r7.n
            if (r0 != 0) goto L_0x016f
            wmh r0 = r7.a
            wlf r0 = r0.a
            java.util.List<wlo> r0 = r0.e
            wms r9 = new wms
            r9.<init>(r0)
            wmh r1 = r7.a
            wlf r1 = r1.a
            javax.net.ssl.SSLSocketFactory r1 = r1.h
            if (r1 != 0) goto L_0x0060
            wlo r1 = defpackage.wlo.c
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0053
            wmh r0 = r7.a
            wlf r0 = r0.a
            wlx r0 = r0.a
            java.lang.String r0 = r0.b
            wob r1 = defpackage.wob.c()
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L_0x0035
            goto L_0x006e
        L_0x0035:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0053:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0060:
            wmh r0 = r7.a
            wlf r0 = r0.a
            java.util.List<okhttp3.Protocol> r0 = r0.d
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0162
        L_0x006e:
            r10 = 0
            r11 = r10
        L_0x0070:
            wmh r0 = r7.a     // Catch:{ IOException -> 0x0101 }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x0101 }
            if (r0 == 0) goto L_0x0090
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r19
            r6 = r20
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x0101 }
            java.net.Socket r0 = r7.b     // Catch:{ IOException -> 0x0101 }
            if (r0 != 0) goto L_0x0089
            goto L_0x00d0
        L_0x0089:
            r1 = r14
            r2 = r15
            r3 = r19
            r4 = r20
            goto L_0x0099
        L_0x0090:
            r1 = r14
            r2 = r15
            r3 = r19
            r4 = r20
            r13.a(r14, r15, r3, r4)     // Catch:{ IOException -> 0x00ff }
        L_0x0099:
            wmh r0 = r7.a     // Catch:{ IOException -> 0x00ff }
            wlf r0 = r0.a     // Catch:{ IOException -> 0x00ff }
            javax.net.ssl.SSLSocketFactory r0 = r0.h     // Catch:{ IOException -> 0x00ff }
            if (r0 != 0) goto L_0x00c4
            wmh r0 = r7.a     // Catch:{ IOException -> 0x00ff }
            wlf r0 = r0.a     // Catch:{ IOException -> 0x00ff }
            java.util.List<okhttp3.Protocol> r0 = r0.d     // Catch:{ IOException -> 0x00ff }
            okhttp3.Protocol r5 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE     // Catch:{ IOException -> 0x00ff }
            boolean r0 = r0.contains(r5)     // Catch:{ IOException -> 0x00ff }
            if (r0 == 0) goto L_0x00bb
            java.net.Socket r0 = r7.b     // Catch:{ IOException -> 0x00ff }
            r7.c = r0     // Catch:{ IOException -> 0x00ff }
            okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE     // Catch:{ IOException -> 0x00ff }
            r7.n = r0     // Catch:{ IOException -> 0x00ff }
            r13.a(r8)     // Catch:{ IOException -> 0x00ff }
            goto L_0x00d0
        L_0x00bb:
            java.net.Socket r0 = r7.b     // Catch:{ IOException -> 0x00ff }
            r7.c = r0     // Catch:{ IOException -> 0x00ff }
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1     // Catch:{ IOException -> 0x00ff }
            r7.n = r0     // Catch:{ IOException -> 0x00ff }
            goto L_0x00d0
        L_0x00c4:
            r13.a(r9)     // Catch:{ IOException -> 0x00ff }
            okhttp3.Protocol r0 = r7.n     // Catch:{ IOException -> 0x00ff }
            okhttp3.Protocol r5 = okhttp3.Protocol.HTTP_2     // Catch:{ IOException -> 0x00ff }
            if (r0 != r5) goto L_0x00d0
            r13.a(r8)     // Catch:{ IOException -> 0x00ff }
        L_0x00d0:
            wmh r0 = r7.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00ea
            java.net.Socket r0 = r7.b
            if (r0 == 0) goto L_0x00dd
            goto L_0x00ea
        L_0x00dd:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00ea:
            wno r0 = r7.e
            if (r0 == 0) goto L_0x00fe
            wln r1 = r7.m
            monitor-enter(r1)
            wno r0 = r7.e     // Catch:{ all -> 0x00fb }
            int r0 = r0.a()     // Catch:{ all -> 0x00fb }
            r7.o = r0     // Catch:{ all -> 0x00fb }
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            return
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            throw r0
        L_0x00fe:
            return
        L_0x00ff:
            r0 = move-exception
            goto L_0x0108
        L_0x0101:
            r0 = move-exception
            r1 = r14
            r2 = r15
            r3 = r19
            r4 = r20
        L_0x0108:
            java.net.Socket r5 = r7.c
            defpackage.wmk.a(r5)
            java.net.Socket r5 = r7.b
            defpackage.wmk.a(r5)
            r7.c = r10
            r7.b = r10
            r7.f = r10
            r7.g = r10
            r7.d = r10
            r7.n = r10
            r7.e = r10
            if (r11 != 0) goto L_0x0129
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            r5.<init>(r0)
            r11 = r5
            goto L_0x0130
        L_0x0129:
            java.io.IOException r5 = r11.firstException
            defpackage.wmk.a(r5, r0)
            r11.lastException = r0
        L_0x0130:
            if (r18 == 0) goto L_0x0161
            r5 = 1
            r9.b = r5
            boolean r6 = r9.a
            if (r6 == 0) goto L_0x015c
            boolean r6 = r0 instanceof java.net.ProtocolException
            if (r6 != 0) goto L_0x015c
            boolean r6 = r0 instanceof java.io.InterruptedIOException
            if (r6 != 0) goto L_0x015c
            boolean r6 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L_0x014d
            java.lang.Throwable r12 = r0.getCause()
            boolean r12 = r12 instanceof java.security.cert.CertificateException
            if (r12 != 0) goto L_0x015c
        L_0x014d:
            boolean r12 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r12 != 0) goto L_0x015c
            if (r6 != 0) goto L_0x015d
            boolean r6 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r6 != 0) goto L_0x015d
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r5 = 0
        L_0x015d:
            if (r5 == 0) goto L_0x0161
            goto L_0x0070
        L_0x0161:
            throw r11
        L_0x0162:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x016f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0178
        L_0x0177:
            throw r0
        L_0x0178:
            goto L_0x0177
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmt.a(int, int, int, int, boolean, wlj, wlt):void");
    }

    private void a(int i2, int i3, wlj wlj, wlt wlt) {
        Socket socket;
        Proxy proxy = this.a.b;
        wlf wlf = this.a.a;
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.HTTP) {
            socket = wlf.c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        wlt.a();
        this.b.setSoTimeout(i3);
        try {
            wob.c().a(this.b, this.a.c, i2);
            try {
                this.f = wou.a(wou.b(this.b));
                this.g = wou.a(wou.a(this.b));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.a.c);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void a(int i2) {
        this.c.setSoTimeout(0);
        a a2 = new a(true).a(this.c, this.a.a.a.b, this.f, this.g);
        a2.e = this;
        a2.h = i2;
        this.e = a2.a();
        this.e.a(true);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105 A[Catch:{ all -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010b A[Catch:{ all -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.wms r8) {
        /*
            r7 = this;
            wmh r0 = r7.a
            wlf r0 = r0.a
            javax.net.ssl.SSLSocketFactory r1 = r0.h
            r2 = 0
            java.net.Socket r3 = r7.b     // Catch:{ AssertionError -> 0x00fe }
            wlx r4 = r0.a     // Catch:{ AssertionError -> 0x00fe }
            java.lang.String r4 = r4.b     // Catch:{ AssertionError -> 0x00fe }
            wlx r5 = r0.a     // Catch:{ AssertionError -> 0x00fe }
            int r5 = r5.c     // Catch:{ AssertionError -> 0x00fe }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x00fe }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x00fe }
            wlo r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            boolean r3 = r8.e     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            if (r3 == 0) goto L_0x002d
            wob r3 = defpackage.wob.c()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlx r4 = r0.a     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r4 = r4.b     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.util.List<okhttp3.Protocol> r5 = r0.d     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r3.a(r1, r4, r5)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
        L_0x002d:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlv r4 = defpackage.wlv.a(r3)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            javax.net.ssl.HostnameVerifier r5 = r0.i     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlx r6 = r0.a     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r6 = r6.b     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            if (r3 != 0) goto L_0x00ae
            java.util.List<java.security.cert.Certificate> r8 = r4.c     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x0093
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r4.<init>(r3)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlx r0 = r0.a     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r0.b     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = defpackage.wll.a(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.util.List r8 = defpackage.wog.a(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            throw r2     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
        L_0x0093:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r2.<init>(r3)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlx r0 = r0.a     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r0.b     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            throw r8     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
        L_0x00ae:
            wll r3 = r0.j     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wlx r0 = r0.a     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r0.b     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.util.List<java.security.cert.Certificate> r5 = r4.c     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            boolean r8 = r8.e     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            if (r8 == 0) goto L_0x00c5
            wob r8 = defpackage.wob.c()     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.lang.String r2 = r8.a(r1)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
        L_0x00c5:
            r7.c = r1     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.net.Socket r8 = r7.c     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wpa r8 = defpackage.wou.b(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wom r8 = defpackage.wou.a(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r7.f = r8     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            java.net.Socket r8 = r7.c     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            woz r8 = defpackage.wou.a(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            wol r8 = defpackage.wou.a(r8)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r7.g = r8     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            r7.d = r4     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            if (r2 == 0) goto L_0x00e8
            okhttp3.Protocol r8 = okhttp3.Protocol.a(r2)     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            goto L_0x00ea
        L_0x00e8:
            okhttp3.Protocol r8 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
        L_0x00ea:
            r7.n = r8     // Catch:{ AssertionError -> 0x00f8, all -> 0x00f6 }
            if (r1 == 0) goto L_0x00f5
            wob r8 = defpackage.wob.c()
            r8.b(r1)
        L_0x00f5:
            return
        L_0x00f6:
            r8 = move-exception
            goto L_0x010c
        L_0x00f8:
            r8 = move-exception
            r2 = r1
            goto L_0x00ff
        L_0x00fb:
            r8 = move-exception
            r1 = r2
            goto L_0x010c
        L_0x00fe:
            r8 = move-exception
        L_0x00ff:
            boolean r0 = defpackage.wmk.a(r8)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x010b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00fb }
            r0.<init>(r8)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x010b:
            throw r8     // Catch:{ all -> 0x00fb }
        L_0x010c:
            if (r1 == 0) goto L_0x0115
            wob r0 = defpackage.wob.c()
            r0.b(r1)
        L_0x0115:
            defpackage.wmk.a(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmt.a(wms):void");
    }

    public final boolean a(wlf wlf, wmh wmh) {
        if (this.j.size() >= this.o || this.h || !wmi.a.a(this.a.a, wlf)) {
            return false;
        }
        if (wlf.a.b.equals(this.a.a.a.b)) {
            return true;
        }
        if (this.e == null || wmh == null || wmh.b.type() != Type.DIRECT || this.a.b.type() != Type.DIRECT || !this.a.c.equals(wmh.c) || wmh.a.i != wog.a || !a(wlf.a)) {
            return false;
        }
        try {
            wlf.j.a(wlf.a.b, this.d.c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean a(boolean z) {
        int soTimeout;
        if (this.c.isClosed() || this.c.isInputShutdown() || this.c.isOutputShutdown()) {
            return false;
        }
        wno wno = this.e;
        if (wno == null) {
            if (z) {
                try {
                    soTimeout = this.c.getSoTimeout();
                    this.c.setSoTimeout(1);
                    if (this.f.c()) {
                        this.c.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.c.setSoTimeout(soTimeout);
                    return true;
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                    return false;
                } catch (Throwable th) {
                    this.c.setSoTimeout(soTimeout);
                    throw th;
                }
            }
            return true;
        } else if (!wno.c()) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(wnq wnq) {
        wnq.a(ErrorCode.REFUSED_STREAM);
    }

    public final void a(wno wno) {
        synchronized (this.m) {
            this.o = wno.a();
        }
    }

    public final boolean a() {
        return this.e != null;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.a.a.a.b);
        sb.append(":");
        sb.append(this.a.a.a.c);
        sb.append(", proxy=");
        sb.append(this.a.b);
        sb.append(" hostAddress=");
        sb.append(this.a.c);
        sb.append(" cipherSuite=");
        wlv wlv = this.d;
        if (wlv != null) {
            obj = wlv.b;
        } else {
            obj = IdHelperAndroid.NO_ID_AVAILABLE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }

    private void a(int i2, int i3, int i4, wlj wlj, wlt wlt) {
        wmd a2 = new a().a(this.a.a.a).a("CONNECT", (wme) null).a("Host", wmk.a(this.a.a.a, true)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", "okhttp/3.12.3").a();
        a aVar = new a();
        aVar.a = a2;
        aVar.b = Protocol.HTTP_1_1;
        aVar.c = 407;
        aVar.d = "Preemptive Authenticate";
        aVar.g = wmk.c;
        aVar.k = -1;
        aVar.l = -1;
        aVar.f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar.a();
        wlx wlx = a2.a;
        a(i2, i3, wlj, wlt);
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(wmk.a(wlx, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        wnj wnj = new wnj(null, null, this.f, this.g);
        this.f.a().a((long) i3, TimeUnit.MILLISECONDS);
        this.g.a().a((long) i4, TimeUnit.MILLISECONDS);
        wnj.a(a2.c, sb2);
        wnj.b();
        a a3 = wnj.a(false);
        a3.a = a2;
        wmf a4 = a3.a();
        long a5 = wnb.a(a4);
        if (a5 == -1) {
            a5 = 0;
        }
        wpa a6 = wnj.a(a5);
        wmk.b(a6, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        a6.close();
        int i5 = a4.c;
        if (i5 != 200) {
            if (i5 != 407) {
                StringBuilder sb3 = new StringBuilder("Unexpected response code for CONNECT: ");
                sb3.append(a4.c);
                throw new IOException(sb3.toString());
            }
            throw new IOException("Failed to authenticate with proxy");
        } else if (!this.f.b().c() || !this.g.b().c()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final boolean a(wlx wlx) {
        if (wlx.c != this.a.a.a.c) {
            return false;
        }
        if (wlx.b.equals(this.a.a.a.b)) {
            return true;
        }
        if (this.d == null || !wog.a.a(wlx.b, (X509Certificate) this.d.c.get(0))) {
            return false;
        }
        return true;
    }
}
