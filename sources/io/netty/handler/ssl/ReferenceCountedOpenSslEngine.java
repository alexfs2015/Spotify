package io.netty.handler.ssl;

import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.AlgorithmConstraints;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import org.apache.tomcat.jni.Buffer;
import org.apache.tomcat.jni.SSL;

public class ReferenceCountedOpenSslEngine extends SSLEngine implements whi {
    private static /* synthetic */ boolean U;
    private static final wjw a;
    private static final SSLException b;
    private static final SSLException c;
    private static final SSLException d;
    private static final SSLException e;
    private static final Class<?> f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Method j;
    private static final Method k;
    private static final ResourceLeakDetector<ReferenceCountedOpenSslEngine> l;
    private static final AtomicIntegerFieldUpdater<ReferenceCountedOpenSslEngine> m;
    private static final long n = Buffer.address(vzw.a.v());
    private static final SSLEngineResult o = new SSLEngineResult(Status.OK, HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult p = new SSLEngineResult(Status.CLOSED, HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult q = new SSLEngineResult(Status.OK, HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult r = new SSLEngineResult(Status.CLOSED, HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult s = new SSLEngineResult(Status.CLOSED, HandshakeStatus.NOT_HANDSHAKING, 0, 0);
    private final wgv A = new wgv() {
        public final whi b(Object obj) {
            if (ReferenceCountedOpenSslEngine.this.z != null) {
                ReferenceCountedOpenSslEngine.this.z.a(obj);
            }
            return ReferenceCountedOpenSslEngine.this;
        }

        public final void d() {
            ReferenceCountedOpenSslEngine.this.b();
            if (ReferenceCountedOpenSslEngine.this.z != null) {
                ReferenceCountedOpenSslEngine.this.z.b();
            }
        }
    };
    private volatile ClientAuth B = ClientAuth.NONE;
    /* access modifiers changed from: private */
    public volatile long C = -1;
    private String D;
    private Object E;
    private List<?> F;
    private boolean G;
    private boolean H;
    private boolean I;
    /* access modifiers changed from: private */
    public final boolean J;
    private final vyw K;
    private final wfp L;
    /* access modifiers changed from: private */
    public final wfk M;
    private final boolean N;
    private final a O;
    /* access modifiers changed from: private */
    public final Certificate[] P;
    private final ByteBuffer[] Q = new ByteBuffer[1];
    private final ByteBuffer[] R = new ByteBuffer[1];
    private final wfs S;
    private SSLHandshakeException T;
    /* access modifiers changed from: private */
    public long t;
    private long u;
    private boolean v;
    /* access modifiers changed from: private */
    public HandshakeState w = HandshakeState.NOT_STARTED;
    private boolean x;
    private volatile int y;
    /* access modifiers changed from: private */
    public final whj z;

    /* renamed from: io.netty.handler.ssl.ReferenceCountedOpenSslEngine$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[HandshakeState.values().length];
        static final /* synthetic */ int[] b = new int[ClientAuth.values().length];
        static final /* synthetic */ int[] c = new int[Protocol.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r4 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = c     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r5 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                io.netty.handler.ssl.ClientAuth[] r4 = io.netty.handler.ssl.ClientAuth.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                b = r4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0048 }
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.NONE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0052 }
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.REQUIRE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x005c }
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.OPTIONAL     // Catch:{ NoSuchFieldError -> 0x005c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x006f }
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r5 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0079 }
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass2.<clinit>():void");
        }
    }

    enum HandshakeState {
        NOT_STARTED,
        STARTED_IMPLICITLY,
        STARTED_EXPLICITLY,
        FINISHED
    }

    final class a implements SSLSession {
        private static /* synthetic */ boolean j = (!ReferenceCountedOpenSslEngine.class.desiredAssertionStatus());
        private final wfv a;
        private X509Certificate[] b;
        private String c;
        private String d;
        private Certificate[] e;
        private String f;
        private byte[] g;
        private long h;
        private Map<String, Object> i;

        public final int getApplicationBufferSize() {
            return 16384;
        }

        public final int getPacketBufferSize() {
            return 18713;
        }

        a(wfv wfv) {
            this.a = wfv;
        }

        public final byte[] getId() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.g == null) {
                    byte[] bArr = wja.a;
                    return bArr;
                }
                byte[] bArr2 = (byte[]) this.g.clone();
                return bArr2;
            }
        }

        public final SSLSessionContext getSessionContext() {
            return this.a;
        }

        public final long getCreationTime() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.h == 0 && !ReferenceCountedOpenSslEngine.this.g()) {
                    this.h = SSL.getTime(ReferenceCountedOpenSslEngine.this.t) * 1000;
                }
            }
            return this.h;
        }

        public final long getLastAccessedTime() {
            long d2 = ReferenceCountedOpenSslEngine.this.C;
            return d2 == -1 ? getCreationTime() : d2;
        }

        public final void invalidate() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.g()) {
                    SSL.setTimeout(ReferenceCountedOpenSslEngine.this.t, 0);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isValid() {
            /*
                r9 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.this
                monitor-enter(r0)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.this     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.g()     // Catch:{ all -> 0x0034 }
                r2 = 0
                if (r1 != 0) goto L_0x0032
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0034 }
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.this     // Catch:{ all -> 0x0034 }
                long r5 = r1.t     // Catch:{ all -> 0x0034 }
                long r5 = org.apache.tomcat.jni.SSL.getTimeout(r5)     // Catch:{ all -> 0x0034 }
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                long r3 = r3 - r5
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.this     // Catch:{ all -> 0x0034 }
                long r5 = r1.t     // Catch:{ all -> 0x0034 }
                long r5 = org.apache.tomcat.jni.SSL.getTime(r5)     // Catch:{ all -> 0x0034 }
                long r5 = r5 * r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x0030
                r2 = 1
            L_0x0030:
                monitor-exit(r0)     // Catch:{ all -> 0x0034 }
                return r2
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x0034 }
                return r2
            L_0x0034:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0034 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.a.isValid():boolean");
        }

        public final void putValue(String str, Object obj) {
            if (str == null) {
                throw new NullPointerException("name");
            } else if (obj != null) {
                Map map = this.i;
                if (map == null) {
                    map = new HashMap(2);
                    this.i = map;
                }
                Object put = map.put(str, obj);
                if (obj instanceof SSLSessionBindingListener) {
                    ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
                }
                a(put, str);
            } else {
                throw new NullPointerException("value");
            }
        }

        public final Object getValue(String str) {
            if (str != null) {
                Map<String, Object> map = this.i;
                if (map == null) {
                    return null;
                }
                return map.get(str);
            }
            throw new NullPointerException("name");
        }

        public final void removeValue(String str) {
            if (str != null) {
                Map<String, Object> map = this.i;
                if (map != null) {
                    a(map.remove(str), str);
                    return;
                }
                return;
            }
            throw new NullPointerException("name");
        }

        public final String[] getValueNames() {
            Map<String, Object> map = this.i;
            if (map == null || map.isEmpty()) {
                return wja.e;
            }
            return (String[]) map.keySet().toArray(new String[map.size()]);
        }

        private void a(Object obj, String str) {
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueUnbound(new SSLSessionBindingEvent(this, str));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.g()) {
                    this.g = SSL.getSessionId(ReferenceCountedOpenSslEngine.this.t);
                    this.f = ReferenceCountedOpenSslEngine.this.b(SSL.getCipherForSSL(ReferenceCountedOpenSslEngine.this.t));
                    this.c = SSL.getVersion(ReferenceCountedOpenSslEngine.this.t);
                    b();
                    c();
                    ReferenceCountedOpenSslEngine.this.w = HandshakeState.FINISHED;
                } else {
                    throw new SSLException("Already closed");
                }
            }
        }

        private void b() {
            byte[][] peerCertChain = SSL.getPeerCertChain(ReferenceCountedOpenSslEngine.this.t);
            byte[] peerCertificate = !ReferenceCountedOpenSslEngine.this.J ? SSL.getPeerCertificate(ReferenceCountedOpenSslEngine.this.t) : null;
            int i2 = 0;
            if (peerCertChain == null || peerCertChain.length == 0) {
                if (peerCertificate == null || peerCertificate.length == 0) {
                    this.e = wja.f;
                    this.b = wja.g;
                    return;
                }
                this.e = new Certificate[1];
                this.b = new X509Certificate[1];
                this.e[0] = new OpenSslX509Certificate(peerCertificate);
                this.b[0] = new wfr(peerCertificate);
            } else if (peerCertificate == null || peerCertificate.length == 0) {
                this.e = new Certificate[peerCertChain.length];
                this.b = new X509Certificate[peerCertChain.length];
                while (i2 < peerCertChain.length) {
                    byte[] bArr = peerCertChain[i2];
                    this.e[i2] = new OpenSslX509Certificate(bArr);
                    this.b[i2] = new wfr(bArr);
                    i2++;
                }
            } else {
                int length = peerCertificate.length + 1;
                this.e = new Certificate[length];
                this.b = new X509Certificate[length];
                this.e[0] = new OpenSslX509Certificate(peerCertificate);
                this.b[0] = new wfr(peerCertificate);
                int i3 = 1;
                while (i2 < peerCertChain.length) {
                    byte[] bArr2 = peerCertChain[i2];
                    this.e[i3] = new OpenSslX509Certificate(bArr2);
                    this.b[i3] = new wfr(bArr2);
                    i2++;
                    i3++;
                }
            }
        }

        private void c() {
            SelectedListenerFailureBehavior d2 = ReferenceCountedOpenSslEngine.this.M.d();
            List a2 = ReferenceCountedOpenSslEngine.this.M.a();
            int i2 = AnonymousClass2.c[ReferenceCountedOpenSslEngine.this.M.b().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    String alpnSelected = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.t);
                    if (alpnSelected != null) {
                        this.d = a(a2, d2, alpnSelected);
                    }
                } else if (i2 == 3) {
                    String nextProtoNegotiated = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.t);
                    if (nextProtoNegotiated != null) {
                        this.d = a(a2, d2, nextProtoNegotiated);
                    }
                } else if (i2 == 4) {
                    String alpnSelected2 = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.t);
                    if (alpnSelected2 == null) {
                        alpnSelected2 = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.t);
                    }
                    if (alpnSelected2 != null) {
                        this.d = a(a2, d2, alpnSelected2);
                    }
                } else {
                    throw new Error();
                }
            }
        }

        private static String a(List<String> list, SelectedListenerFailureBehavior selectedListenerFailureBehavior, String str) {
            if (selectedListenerFailureBehavior == SelectedListenerFailureBehavior.ACCEPT) {
                return str;
            }
            int size = list.size();
            if (!j && size <= 0) {
                throw new AssertionError();
            } else if (list.contains(str)) {
                return str;
            } else {
                if (selectedListenerFailureBehavior == SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL) {
                    return (String) list.get(size - 1);
                }
                StringBuilder sb = new StringBuilder("unknown protocol ");
                sb.append(str);
                throw new SSLException(sb.toString());
            }
        }

        public final Certificate[] getPeerCertificates() {
            Certificate[] certificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.e == null || this.e.length == 0) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                certificateArr = (Certificate[]) this.e.clone();
            }
            return certificateArr;
        }

        public final Certificate[] getLocalCertificates() {
            if (ReferenceCountedOpenSslEngine.this.P == null) {
                return null;
            }
            return (Certificate[]) ReferenceCountedOpenSslEngine.this.P.clone();
        }

        public final X509Certificate[] getPeerCertificateChain() {
            X509Certificate[] x509CertificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.b == null || this.b.length == 0) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                x509CertificateArr = (X509Certificate[]) this.b.clone();
            }
            return x509CertificateArr;
        }

        public final Principal getPeerPrincipal() {
            return ((java.security.cert.X509Certificate) getPeerCertificates()[0]).getSubjectX500Principal();
        }

        public final Principal getLocalPrincipal() {
            Certificate[] g2 = ReferenceCountedOpenSslEngine.this.P;
            if (g2 == null || g2.length == 0) {
                return null;
            }
            return ((java.security.cert.X509Certificate) g2[0]).getIssuerX500Principal();
        }

        public final String getCipherSuite() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.f == null) {
                    String str = "SSL_NULL_WITH_NULL_NULL";
                    return str;
                }
                String str2 = this.f;
                return str2;
            }
        }

        public final String getProtocol() {
            String str = this.c;
            if (str == null) {
                synchronized (ReferenceCountedOpenSslEngine.this) {
                    str = !ReferenceCountedOpenSslEngine.this.g() ? SSL.getVersion(ReferenceCountedOpenSslEngine.this.t) : "";
                }
            }
            return str;
        }

        public final String getPeerHost() {
            return ReferenceCountedOpenSslEngine.this.getPeerHost();
        }

        public final int getPeerPort() {
            return ReferenceCountedOpenSslEngine.this.getPeerPort();
        }
    }

    public final Runnable getDelegatedTask() {
        return null;
    }

    public final boolean getEnableSessionCreation() {
        return false;
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<ReferenceCountedOpenSslEngine> cls = ReferenceCountedOpenSslEngine.class;
        U = !cls.desiredAssertionStatus();
        a = wjx.a(cls);
        String str = "engine closed";
        String str2 = "beginHandshake()";
        b = (SSLException) wjp.a(new SSLException(str), cls, str2);
        c = (SSLException) wjp.a(new SSLException(str), cls, "handshake()");
        d = (SSLException) wjp.a(new SSLException("renegotiation unsupported"), cls, str2);
        e = (SSLException) wjp.a(new SSLException("encrypted packet oversized"), cls, "unwrap(...)");
        l = whk.a().a(cls);
        AtomicIntegerFieldUpdater<ReferenceCountedOpenSslEngine> b2 = PlatformDependent.b(cls, "destroyed");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "y");
        }
        m = b2;
        Class<?> cls2 = null;
        if (PlatformDependent.c() >= 8) {
            try {
                method5 = SSLParameters.class.getDeclaredMethod("getUseCipherSuitesOrder", new Class[0]);
                SSLParameters sSLParameters = new SSLParameters();
                method5.invoke(sSLParameters, new Object[0]);
                method3 = SSLParameters.class.getDeclaredMethod("setUseCipherSuitesOrder", new Class[]{Boolean.TYPE});
                method3.invoke(sSLParameters, new Object[]{Boolean.TRUE});
            } catch (Throwable unused) {
                method5 = null;
                method3 = null;
            }
            try {
                Class<?> cls3 = Class.forName("javax.net.ssl.SNIHostName", false, PlatformDependent.a(cls));
                Object newInstance = cls3.getConstructor(new Class[]{String.class}).newInstance(new Object[]{"netty.io"});
                method2 = cls3.getDeclaredMethod("getAsciiName", new Class[0]);
                method2.invoke(newInstance, new Object[0]);
                method4 = SSLParameters.class.getDeclaredMethod("getServerNames", new Class[0]);
                method = SSLParameters.class.getDeclaredMethod("setServerNames", new Class[]{List.class});
                SSLParameters sSLParameters2 = new SSLParameters();
                method4.invoke(sSLParameters2, new Object[0]);
                method.invoke(sSLParameters2, new Object[]{Collections.emptyList()});
                cls2 = cls3;
            } catch (Throwable unused2) {
                method4 = null;
                method2 = null;
            }
        } else {
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = method2;
        }
        j = method5;
        k = method3;
        f = cls2;
        i = method2;
        g = method4;
        h = method;
    }

    public ReferenceCountedOpenSslEngine(wgb wgb, vyw vyw, String str, int i2, boolean z2) {
        super(str, i2);
        wfj.b();
        this.z = z2 ? l.a(this) : null;
        this.K = (vyw) wjk.a(vyw, "alloc");
        this.M = wgb.b;
        this.t = SSL.newSSL(wgb.a, !wgb.a());
        this.O = new a(wgb.b());
        this.u = SSL.makeNetworkBIO(this.t);
        this.J = wgb.a();
        this.L = wgb.e;
        this.N = wgb.f;
        this.P = wgb.c;
        a(this.J ? ClientAuth.NONE : wgb.d);
        if (this.J && str != null) {
            SSL.setTlsExtHostName(this.t, str);
        }
        this.S = wgb.c();
    }

    public final int z() {
        return this.A.z();
    }

    public final whi b(Object obj) {
        this.A.b(obj);
        return this;
    }

    public final boolean B() {
        return this.A.B();
    }

    public final synchronized SSLSession getHandshakeSession() {
        int i2 = AnonymousClass2.a[this.w.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return null;
        }
        return this.O;
    }

    public final synchronized long a() {
        return this.t;
    }

    public final synchronized void b() {
        if (m.compareAndSet(this, 0, 1)) {
            this.L.a(this.t);
            SSL.freeSSL(this.t);
            SSL.freeBIO(this.u);
            this.u = 0;
            this.t = 0;
            this.I = true;
            this.H = true;
            this.G = true;
        }
        SSL.clearError();
    }

    private int a(ByteBuffer byteBuffer) {
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int min = Math.min(limit - position, 16384);
        if (byteBuffer.isDirect()) {
            i2 = SSL.writeToSSL(this.t, Buffer.address(byteBuffer) + ((long) position), min);
            if (i2 > 0) {
                byteBuffer.position(position + i2);
            }
        } else {
            vyv d2 = this.K.d(min);
            try {
                long a2 = wfj.a(d2);
                byteBuffer.limit(position + min);
                d2.b(0, byteBuffer);
                byteBuffer.limit(limit);
                i2 = SSL.writeToSSL(this.t, a2, min);
                if (i2 > 0) {
                    byteBuffer.position(position + i2);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                d2.B();
            }
        }
        return i2;
    }

    private int b(ByteBuffer byteBuffer) {
        int i2;
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        if (byteBuffer.isDirect()) {
            i2 = SSL.writeToBIO(this.u, Buffer.address(byteBuffer) + ((long) position), remaining);
            if (i2 >= 0) {
                byteBuffer.position(position + i2);
            }
        } else {
            vyv d2 = this.K.d(remaining);
            try {
                long a2 = wfj.a(d2);
                d2.b(0, byteBuffer);
                i2 = SSL.writeToBIO(this.u, a2, remaining);
                if (i2 >= 0) {
                    byteBuffer.position(position + i2);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                d2.B();
            }
        }
        return i2;
    }

    /* JADX INFO: finally extract failed */
    private int c(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int readFromSSL = SSL.readFromSSL(this.t, Buffer.address(byteBuffer) + ((long) position), byteBuffer.limit() - position);
            if (readFromSSL <= 0) {
                return readFromSSL;
            }
            byteBuffer.position(position + readFromSSL);
            return readFromSSL;
        }
        int position2 = byteBuffer.position();
        int limit = byteBuffer.limit();
        int min = Math.min(18713, limit - position2);
        vyv d2 = this.K.d(min);
        try {
            int readFromSSL2 = SSL.readFromSSL(this.t, wfj.a(d2), min);
            if (readFromSSL2 > 0) {
                byteBuffer.limit(position2 + readFromSSL2);
                d2.a(0, byteBuffer);
                byteBuffer.limit(limit);
            }
            d2.B();
            return readFromSSL2;
        } catch (Throwable th) {
            d2.B();
            throw th;
        }
    }

    private int a(ByteBuffer byteBuffer, int i2) {
        int i3;
        if (!byteBuffer.isDirect() || byteBuffer.remaining() < i2) {
            vyv d2 = this.K.d(i2);
            try {
                i3 = SSL.readFromBIO(this.u, wfj.a(d2), i2);
                if (i3 > 0) {
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + i3);
                    d2.a(0, byteBuffer);
                    byteBuffer.limit(limit);
                    return i3;
                }
                d2.B();
            } finally {
                d2.B();
            }
        } else {
            int position = byteBuffer.position();
            i3 = SSL.readFromBIO(this.u, Buffer.address(byteBuffer) + ((long) position), i2);
            if (i3 > 0) {
                byteBuffer.position(position + i3);
                return i3;
            }
        }
        return i3;
    }

    private SSLEngineResult a(ByteBuffer byteBuffer, int i2, int i3, HandshakeStatus handshakeStatus) {
        int pendingWrittenBytesInBIO = SSL.pendingWrittenBytesInBIO(this.u);
        if (pendingWrittenBytesInBIO <= 0) {
            return null;
        }
        if (byteBuffer.remaining() < pendingWrittenBytesInBIO) {
            Status status = Status.BUFFER_OVERFLOW;
            if (handshakeStatus != HandshakeStatus.FINISHED) {
                handshakeStatus = b(pendingWrittenBytesInBIO);
            }
            return new SSLEngineResult(status, a(handshakeStatus), i2, i3);
        }
        int a2 = a(byteBuffer, pendingWrittenBytesInBIO);
        if (a2 <= 0) {
            SSL.clearError();
        } else {
            i3 += a2;
            pendingWrittenBytesInBIO -= a2;
        }
        if (this.H) {
            b();
        }
        Status e2 = e();
        if (handshakeStatus != HandshakeStatus.FINISHED) {
            handshakeStatus = b(pendingWrittenBytesInBIO);
        }
        return new SSLEngineResult(e2, a(handshakeStatus), i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a0, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b4, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r8, int r9, int r10, java.nio.ByteBuffer r11) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x011c
            if (r11 == 0) goto L_0x0114
            int r0 = r8.length
            if (r9 >= r0) goto L_0x00ea
            int r0 = r9 + r10
            int r1 = r8.length
            if (r0 > r1) goto L_0x00ea
            boolean r10 = r11.isReadOnly()
            if (r10 != 0) goto L_0x00e4
            monitor-enter(r7)
            boolean r10 = r7.g()     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x001d
            javax.net.ssl.SSLEngineResult r8 = s     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x001d:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00e1 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = r7.w     // Catch:{ all -> 0x00e1 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch:{ all -> 0x00e1 }
            if (r1 == r2) goto L_0x0043
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r10 = r7.w     // Catch:{ all -> 0x00e1 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch:{ all -> 0x00e1 }
            if (r10 == r1) goto L_0x002f
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r10 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY     // Catch:{ all -> 0x00e1 }
            r7.w = r10     // Catch:{ all -> 0x00e1 }
        L_0x002f:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = r7.d()     // Catch:{ all -> 0x00e1 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x00e1 }
            if (r10 != r1) goto L_0x003b
            javax.net.ssl.SSLEngineResult r8 = o     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x003b:
            boolean r1 = r7.I     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0043
            javax.net.ssl.SSLEngineResult r8 = p     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x0043:
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0046:
            if (r9 >= r0) goto L_0x00d1
            r4 = r8[r9]     // Catch:{ all -> 0x00e1 }
            if (r4 == 0) goto L_0x00b8
        L_0x004c:
            boolean r5 = r4.hasRemaining()     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x00b5
            int r5 = r7.a(r4)     // Catch:{ all -> 0x00e1 }
            if (r5 <= 0) goto L_0x006e
            int r2 = r2 + r5
            javax.net.ssl.SSLEngineResult r5 = r7.a(r11, r2, r3, r10)     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x004c
            javax.net.ssl.SSLEngineResult$Status r3 = r5.getStatus()     // Catch:{ all -> 0x00e1 }
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x00e1 }
            if (r3 == r6) goto L_0x0069
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r5
        L_0x0069:
            int r3 = r5.bytesProduced()     // Catch:{ all -> 0x00e1 }
            goto L_0x004c
        L_0x006e:
            long r8 = r7.t     // Catch:{ all -> 0x00e1 }
            int r8 = org.apache.tomcat.jni.SSL.getError(r8, r5)     // Catch:{ all -> 0x00e1 }
            r9 = 2
            if (r8 == r9) goto L_0x00a1
            r9 = 3
            if (r8 == r9) goto L_0x0096
            r9 = 6
            if (r8 != r9) goto L_0x008f
            boolean r8 = r7.x     // Catch:{ all -> 0x00e1 }
            if (r8 != 0) goto L_0x0084
            r7.c()     // Catch:{ all -> 0x00e1 }
        L_0x0084:
            javax.net.ssl.SSLEngineResult r8 = r7.a(r11, r2, r3, r10)     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            javax.net.ssl.SSLEngineResult r8 = s     // Catch:{ all -> 0x00e1 }
        L_0x008d:
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x008f:
            java.lang.String r8 = "SSL_write"
            javax.net.ssl.SSLException r8 = r7.a(r8)     // Catch:{ all -> 0x00e1 }
            throw r8     // Catch:{ all -> 0x00e1 }
        L_0x0096:
            javax.net.ssl.SSLEngineResult r8 = r7.a(r11, r2, r3, r10)     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            javax.net.ssl.SSLEngineResult r8 = r     // Catch:{ all -> 0x00e1 }
        L_0x009f:
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00a1:
            javax.net.ssl.SSLEngineResult r8 = r7.a(r11, r2, r3, r10)     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x00a8
            goto L_0x00b3
        L_0x00a8:
            javax.net.ssl.SSLEngineResult r8 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x00e1 }
            javax.net.ssl.SSLEngineResult$Status r9 = r7.e()     // Catch:{ all -> 0x00e1 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x00e1 }
            r8.<init>(r9, r10, r2, r3)     // Catch:{ all -> 0x00e1 }
        L_0x00b3:
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00b5:
            int r9 = r9 + 1
            goto L_0x0046
        L_0x00b8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            java.lang.String r11 = "srcs["
            r10.<init>(r11)     // Catch:{ all -> 0x00e1 }
            r10.append(r9)     // Catch:{ all -> 0x00e1 }
            java.lang.String r9 = "] is null"
            r10.append(r9)     // Catch:{ all -> 0x00e1 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00e1 }
            r8.<init>(r9)     // Catch:{ all -> 0x00e1 }
            throw r8     // Catch:{ all -> 0x00e1 }
        L_0x00d1:
            if (r2 != 0) goto L_0x00db
            javax.net.ssl.SSLEngineResult r8 = r7.a(r11, r1, r3, r10)     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x00db
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00db:
            javax.net.ssl.SSLEngineResult r8 = r7.a(r2, r3, r10)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00e1:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e1 }
            throw r8
        L_0x00e4:
            java.nio.ReadOnlyBufferException r8 = new java.nio.ReadOnlyBufferException
            r8.<init>()
            throw r8
        L_0x00ea:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "offset: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = ", length: "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = " (expected: offset <= offset + length <= srcs.length ("
            r0.append(r9)
            int r8 = r8.length
            r0.append(r8)
            java.lang.String r8 = "))"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r11.<init>(r8)
            throw r11
        L_0x0114:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "dst is null"
            r8.<init>(r9)
            throw r8
        L_0x011c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "srcs is null"
            r8.<init>(r9)
            goto L_0x0125
        L_0x0124:
            throw r8
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer):javax.net.ssl.SSLEngineResult");
    }

    private SSLException a(String str) {
        return a(str, SSL.getLastError());
    }

    private SSLException a(String str, String str2) {
        if (a.b()) {
            a.b("{} failed: OpenSSL error: {}", str, str2);
        }
        b();
        if (this.w == HandshakeState.FINISHED) {
            return new SSLException(str2);
        }
        return new SSLHandshakeException(str2);
    }

    private SSLEngineResult a(ByteBuffer[] byteBufferArr, int i2, int i3, ByteBuffer[] byteBufferArr2, int i4, int i5) {
        int i6;
        int i7;
        ByteBuffer[] byteBufferArr3 = byteBufferArr;
        int i8 = i3;
        ByteBuffer[] byteBufferArr4 = byteBufferArr2;
        int i9 = i4;
        int i10 = i5;
        if (byteBufferArr3 != null) {
            if (byteBufferArr3.length > 0) {
                int i11 = i8 + 0;
                if (i11 <= byteBufferArr3.length) {
                    if (byteBufferArr4 != null) {
                        if (i9 < byteBufferArr4.length) {
                            int i12 = i9 + i10;
                            if (i12 <= byteBufferArr4.length) {
                                int i13 = i9;
                                long j2 = 0;
                                while (i13 < i12) {
                                    ByteBuffer byteBuffer = byteBufferArr4[i13];
                                    if (byteBuffer == null) {
                                        StringBuilder sb = new StringBuilder("dsts[");
                                        sb.append(i13);
                                        sb.append("] is null");
                                        throw new IllegalArgumentException(sb.toString());
                                    } else if (!byteBuffer.isReadOnly()) {
                                        j2 += (long) byteBuffer.remaining();
                                        i13++;
                                    } else {
                                        throw new ReadOnlyBufferException();
                                    }
                                }
                                long j3 = 0;
                                int i14 = 0;
                                while (i14 < i11) {
                                    ByteBuffer byteBuffer2 = byteBufferArr3[i14];
                                    if (byteBuffer2 != null) {
                                        j3 += (long) byteBuffer2.remaining();
                                        i14++;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("srcs[");
                                        sb2.append(i14);
                                        sb2.append("] is null");
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                }
                                synchronized (this) {
                                    if (g()) {
                                        SSLEngineResult sSLEngineResult = s;
                                        return sSLEngineResult;
                                    } else if (j3 <= 18713) {
                                        HandshakeStatus handshakeStatus = HandshakeStatus.NOT_HANDSHAKING;
                                        if (this.w != HandshakeState.FINISHED) {
                                            if (this.w != HandshakeState.STARTED_EXPLICITLY) {
                                                this.w = HandshakeState.STARTED_IMPLICITLY;
                                            }
                                            handshakeStatus = d();
                                            if (handshakeStatus == HandshakeStatus.NEED_WRAP) {
                                                SSLEngineResult sSLEngineResult2 = q;
                                                return sSLEngineResult2;
                                            } else if (this.I) {
                                                SSLEngineResult sSLEngineResult3 = r;
                                                return sSLEngineResult3;
                                            }
                                        }
                                        if (i11 > 0) {
                                            int i15 = i2;
                                            i6 = 0;
                                            while (true) {
                                                ByteBuffer byteBuffer3 = byteBufferArr3[i15];
                                                int remaining = byteBuffer3.remaining();
                                                if (remaining != 0) {
                                                    int b2 = b(byteBuffer3);
                                                    if (b2 <= 0) {
                                                        SSL.clearError();
                                                        break;
                                                    }
                                                    i6 += b2;
                                                    if (b2 != remaining) {
                                                        break;
                                                    }
                                                }
                                                i15++;
                                                if (i15 >= i11) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            i6 = 0;
                                        }
                                        if (j2 > 0) {
                                            i7 = 0;
                                            while (i9 < i12) {
                                                ByteBuffer byteBuffer4 = byteBufferArr4[i9];
                                                if (byteBuffer4.hasRemaining()) {
                                                    int c2 = c(byteBuffer4);
                                                    if (this.N) {
                                                        if (SSL.getHandshakeCount(this.t) > 1) {
                                                            b();
                                                            throw new SSLHandshakeException("remote-initiated renegotation not allowed");
                                                        }
                                                    }
                                                    if (c2 > 0) {
                                                        i7 += c2;
                                                        if (byteBuffer4.hasRemaining()) {
                                                            SSLEngineResult a2 = a(i6, i7, handshakeStatus);
                                                            return a2;
                                                        }
                                                    } else {
                                                        int error = SSL.getError(this.t, c2);
                                                        if (!(error == 2 || error == 3)) {
                                                            if (error != 6) {
                                                                SSLEngineResult a3 = a(SSL.getLastErrorNumber(), i6, i7);
                                                                return a3;
                                                            } else if (!this.x) {
                                                                c();
                                                            }
                                                        }
                                                        SSLEngineResult a4 = a(i6, i7, handshakeStatus);
                                                        return a4;
                                                    }
                                                }
                                                i9++;
                                            }
                                        } else {
                                            if (SSL.readFromSSL(this.t, n, 0) <= 0) {
                                                int lastErrorNumber = SSL.getLastErrorNumber();
                                                if (wfj.a((long) lastErrorNumber)) {
                                                    SSLEngineResult a5 = a(lastErrorNumber, i6, 0);
                                                    return a5;
                                                }
                                            }
                                            i7 = 0;
                                        }
                                        if ((this.w == HandshakeState.FINISHED ? SSL.pendingReadableBytesInSSL(this.t) : 0) > 0) {
                                            Status status = Status.BUFFER_OVERFLOW;
                                            if (handshakeStatus != HandshakeStatus.FINISHED) {
                                                handshakeStatus = getHandshakeStatus();
                                            }
                                            SSLEngineResult sSLEngineResult4 = new SSLEngineResult(status, a(handshakeStatus), i6, i7);
                                            return sSLEngineResult4;
                                        }
                                        if (!this.x && (SSL.getShutdown(this.t) & 2) == 2) {
                                            c();
                                        }
                                        SSLEngineResult a6 = a(i6, i7, handshakeStatus);
                                        return a6;
                                    } else {
                                        this.G = true;
                                        this.H = true;
                                        this.I = true;
                                        b();
                                        throw e;
                                    }
                                }
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("offset: ");
                        sb3.append(i9);
                        sb3.append(", length: ");
                        sb3.append(i10);
                        sb3.append(" (expected: offset <= offset + length <= dsts.length (");
                        sb3.append(byteBufferArr4.length);
                        sb3.append("))");
                        throw new IndexOutOfBoundsException(sb3.toString());
                    }
                    throw new IllegalArgumentException("dsts is null");
                }
            }
            StringBuilder sb4 = new StringBuilder("offset: ");
            sb4.append(0);
            sb4.append(", length: ");
            sb4.append(i8);
            sb4.append(" (expected: offset <= offset + length <= srcs.length (");
            sb4.append(byteBufferArr3.length);
            sb4.append("))");
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        throw new NullPointerException("srcs");
    }

    private SSLEngineResult a(int i2, int i3, int i4) {
        String errorString = SSL.getErrorString((long) i2);
        if (SSL.pendingWrittenBytesInBIO(this.u) > 0) {
            if (this.T == null && this.w != HandshakeState.FINISHED) {
                this.T = new SSLHandshakeException(errorString);
            }
            return new SSLEngineResult(Status.OK, HandshakeStatus.NEED_WRAP, i3, i4);
        }
        throw a("SSL_read", errorString);
    }

    private SSLEngineResult a(int i2, int i3, HandshakeStatus handshakeStatus) {
        Status e2 = e();
        if (handshakeStatus != HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatus();
        }
        return new SSLEngineResult(e2, a(handshakeStatus), i2, i3);
    }

    private void c() {
        this.x = true;
        closeOutbound();
        closeInbound();
    }

    public final SSLEngineResult a(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return a(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    private ByteBuffer[] d(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.Q;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i2, int i3) {
        SSLEngineResult a2;
        try {
            a2 = a(d(byteBuffer), 0, 1, byteBufferArr, i2, i3);
            this.Q[0] = null;
        } catch (Throwable th) {
            this.Q[0] = null;
            throw th;
        }
        return a2;
    }

    public final synchronized SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult wrap;
        try {
            wrap = wrap(d(byteBuffer), byteBuffer2);
            this.Q[0] = null;
        } catch (Throwable th) {
            this.Q[0] = null;
            throw th;
        }
        return wrap;
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult a2;
        try {
            ByteBuffer[] d2 = d(byteBuffer);
            this.R[0] = byteBuffer2;
            a2 = a(d2, this.R);
            this.Q[0] = null;
            this.R[0] = null;
        } catch (Throwable th) {
            this.Q[0] = null;
            this.R[0] = null;
            throw th;
        }
        return a2;
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        SSLEngineResult a2;
        try {
            a2 = a(d(byteBuffer), byteBufferArr);
            this.Q[0] = null;
        } catch (Throwable th) {
            this.Q[0] = null;
            throw th;
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void closeInbound() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.G     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            r2.G = r0     // Catch:{ all -> 0x0024 }
            r2.I = r0     // Catch:{ all -> 0x0024 }
            r2.b()     // Catch:{ all -> 0x0024 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.w     // Catch:{ all -> 0x0024 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch:{ all -> 0x0024 }
            if (r0 == r1) goto L_0x0022
            boolean r0 = r2.x     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Inbound closed before receiving peer's close_notify: possible truncation attack?"
            r0.<init>(r1)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.closeInbound():void");
    }

    public final synchronized boolean isInboundDone() {
        return this.G || this.I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void closeOutbound() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.H     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r0 = 1
            r3.H = r0     // Catch:{ all -> 0x0054 }
            r3.I = r0     // Catch:{ all -> 0x0054 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = r3.w     // Catch:{ all -> 0x0054 }
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch:{ all -> 0x0054 }
            if (r1 == r2) goto L_0x004f
            boolean r1 = r3.g()     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x004f
            long r1 = r3.t     // Catch:{ all -> 0x0054 }
            int r1 = org.apache.tomcat.jni.SSL.getShutdown(r1)     // Catch:{ all -> 0x0054 }
            r1 = r1 & r0
            if (r1 == r0) goto L_0x004d
            long r0 = r3.t     // Catch:{ all -> 0x0054 }
            int r0 = org.apache.tomcat.jni.SSL.shutdownSSL(r0)     // Catch:{ all -> 0x0054 }
            if (r0 >= 0) goto L_0x004d
            long r1 = r3.t     // Catch:{ all -> 0x0054 }
            int r0 = org.apache.tomcat.jni.SSL.getError(r1, r0)     // Catch:{ all -> 0x0054 }
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0036;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x0052;
                case 5: goto L_0x0036;
                case 6: goto L_0x0052;
                case 7: goto L_0x0052;
                case 8: goto L_0x0052;
                default: goto L_0x0032;
            }     // Catch:{ all -> 0x0054 }
        L_0x0032:
            org.apache.tomcat.jni.SSL.clearError()     // Catch:{ all -> 0x0054 }
            goto L_0x004d
        L_0x0036:
            wjw r0 = a     // Catch:{ all -> 0x0054 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0049
            wjw r0 = a     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "SSL_shutdown failed: OpenSSL error: {}"
            java.lang.String r2 = org.apache.tomcat.jni.SSL.getLastError()     // Catch:{ all -> 0x0054 }
            r0.b(r1, r2)     // Catch:{ all -> 0x0054 }
        L_0x0049:
            r3.b()     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            monitor-exit(r3)
            return
        L_0x004f:
            r3.b()     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r3)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.closeOutbound():void");
    }

    public final synchronized boolean isOutboundDone() {
        return this.H;
    }

    public final String[] getSupportedCipherSuites() {
        Set<String> set = wfj.a;
        return (String[]) set.toArray(new String[set.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r1 >= r0.length) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        r2 = b(r0[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        r0[r1] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return defpackage.wja.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] getEnabledCipherSuites() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.g()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002a
            long r0 = r3.t     // Catch:{ all -> 0x002e }
            java.lang.String[] r0 = org.apache.tomcat.jni.SSL.getCiphers(r0)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0013
            java.lang.String[] r0 = defpackage.wja.e
            return r0
        L_0x0013:
            monitor-enter(r3)
            r1 = 0
        L_0x0015:
            int r2 = r0.length     // Catch:{ all -> 0x0027 }
            if (r1 >= r2) goto L_0x0025
            r2 = r0[r1]     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = r3.b(r2)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0022
            r0[r1] = r2     // Catch:{ all -> 0x0027 }
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            java.lang.String[] r0 = defpackage.wja.e     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            goto L_0x0032
        L_0x0031:
            throw r0
        L_0x0032:
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.getEnabledCipherSuites():java.lang.String[]");
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        wjk.a(strArr, "cipherSuites");
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            if (str == null) {
                break;
            }
            String a2 = weu.a(str);
            if (a2 == null) {
                a2 = str;
            }
            if (wfj.a(a2)) {
                sb.append(a2);
                sb.append(':');
                i2++;
            } else {
                StringBuilder sb2 = new StringBuilder("unsupported cipher suite: ");
                sb2.append(str);
                sb2.append('(');
                sb2.append(a2);
                sb2.append(')');
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
            String sb3 = sb.toString();
            synchronized (this) {
                if (!g()) {
                    try {
                        SSL.setCipherSuites(this.t, sb3);
                    } catch (Exception e2) {
                        StringBuilder sb4 = new StringBuilder("failed to enable cipher suites: ");
                        sb4.append(sb3);
                        throw new IllegalStateException(sb4.toString(), e2);
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("failed to enable cipher suites: ");
                    sb5.append(sb3);
                    throw new IllegalStateException(sb5.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("empty cipher suites");
    }

    public final String[] getSupportedProtocols() {
        Set<String> set = wfj.b;
        return (String[]) set.toArray(new String[set.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if ((268435456 & r1) != 0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0.add("TLSv1.1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if ((134217728 & r1) != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r0.add("TLSv1.2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if ((16777216 & r1) != 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0.add("SSLv2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if ((r1 & 33554432) != 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r0.add("SSLv3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return (java.lang.String[]) r0.toArray(new java.lang.String[r0.size()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((67108864 & r1) != 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0.add("TLSv1");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] getEnabledProtocols() {
        /*
            r3 = this;
            wjc r0 = defpackage.wjc.b()
            r1 = 8
            java.util.ArrayList r0 = r0.a(r1)
            java.lang.String r1 = "SSLv2Hello"
            r0.add(r1)
            monitor-enter(r3)
            boolean r1 = r3.g()     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x005c
            long r1 = r3.t     // Catch:{ all -> 0x0067 }
            int r1 = org.apache.tomcat.jni.SSL.getOptions(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r1
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = "TLSv1"
            r0.add(r2)
        L_0x0027:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = "TLSv1.1"
            r0.add(r2)
        L_0x0031:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r1
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = "TLSv1.2"
            r0.add(r2)
        L_0x003b:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "SSLv2"
            r0.add(r2)
        L_0x0045:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = "SSLv3"
            r0.add(r1)
        L_0x004f:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x005c:
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.getEnabledProtocols():java.lang.String[]");
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (i3 < length) {
                String str = strArr[i3];
                if (wfj.b.contains(str)) {
                    if (str.equals("SSLv2")) {
                        z2 = true;
                    } else if (str.equals("SSLv3")) {
                        z3 = true;
                    } else if (str.equals("TLSv1")) {
                        z4 = true;
                    } else if (str.equals("TLSv1.1")) {
                        z5 = true;
                    } else if (str.equals("TLSv1.2")) {
                        z6 = true;
                    }
                    i3++;
                } else {
                    StringBuilder sb = new StringBuilder("Protocol ");
                    sb.append(str);
                    sb.append(" is not supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            synchronized (this) {
                if (!g()) {
                    SSL.setOptions(this.t, 4095);
                    SSL.clearOptions(this.t, 520093696);
                    if (!z2) {
                        i2 = 16777216;
                    }
                    if (!z3) {
                        i2 |= 33554432;
                    }
                    if (!z4) {
                        i2 |= 67108864;
                    }
                    if (!z5) {
                        i2 |= 268435456;
                    }
                    if (!z6) {
                        i2 |= 134217728;
                    }
                    SSL.setOptions(this.t, i2);
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to enable protocols: ");
                    sb2.append(Arrays.asList(strArr));
                    throw new IllegalStateException(sb2.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final SSLSession getSession() {
        return this.O;
    }

    public final synchronized void beginHandshake() {
        int i2 = AnonymousClass2.a[this.w.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    a(b);
                    this.w = HandshakeState.STARTED_EXPLICITLY;
                    return;
                } else if (i2 != 4) {
                    throw new Error();
                } else {
                    return;
                }
            } else if (this.J) {
                throw d;
            } else if (SSL.renegotiate(this.t) == 1 && SSL.doHandshake(this.t) == 1) {
                SSL.setState(this.t, 8192);
                this.C = System.currentTimeMillis();
            } else {
                throw a("renegotiation failed");
            }
        }
        this.w = HandshakeState.STARTED_EXPLICITLY;
        d();
    }

    private void a(SSLException sSLException) {
        if (this.I || g()) {
            throw sSLException;
        }
    }

    private static HandshakeStatus a(int i2) {
        return i2 > 0 ? HandshakeStatus.NEED_WRAP : HandshakeStatus.NEED_UNWRAP;
    }

    private HandshakeStatus d() {
        if (this.w == HandshakeState.FINISHED) {
            return HandshakeStatus.FINISHED;
        }
        a(c);
        SSLHandshakeException sSLHandshakeException = this.T;
        if (sSLHandshakeException == null) {
            this.L.a(this);
            if (this.C == -1) {
                this.C = System.currentTimeMillis();
            }
            if (!this.v) {
                wfs wfs = this.S;
                if (wfs != null) {
                    this.v = true;
                    wfs.a(this);
                }
            }
            int doHandshake = SSL.doHandshake(this.t);
            if (doHandshake <= 0) {
                SSLHandshakeException sSLHandshakeException2 = this.T;
                if (sSLHandshakeException2 == null) {
                    int error = SSL.getError(this.t, doHandshake);
                    if (error == 2 || error == 3) {
                        return a(SSL.pendingWrittenBytesInBIO(this.u));
                    }
                    throw a("SSL_do_handshake");
                }
                this.T = null;
                b();
                throw sSLHandshakeException2;
            }
            this.O.a();
            this.L.a(this.t);
            return HandshakeStatus.FINISHED;
        } else if (SSL.pendingWrittenBytesInBIO(this.u) > 0) {
            return HandshakeStatus.NEED_WRAP;
        } else {
            this.T = null;
            b();
            throw sSLHandshakeException;
        }
    }

    private Status e() {
        return this.I ? Status.CLOSED : Status.OK;
    }

    private HandshakeStatus a(HandshakeStatus handshakeStatus) {
        return (handshakeStatus != HandshakeStatus.NOT_HANDSHAKING || this.w == HandshakeState.FINISHED) ? handshakeStatus : d();
    }

    public final synchronized HandshakeStatus getHandshakeStatus() {
        if (f()) {
            return a(SSL.pendingWrittenBytesInBIO(this.u));
        }
        return HandshakeStatus.NOT_HANDSHAKING;
    }

    private HandshakeStatus b(int i2) {
        return f() ? a(i2) : HandshakeStatus.NOT_HANDSHAKING;
    }

    private boolean f() {
        return this.w != HandshakeState.NOT_STARTED && !g() && (this.w != HandshakeState.FINISHED || this.I);
    }

    /* access modifiers changed from: private */
    public String b(String str) {
        if (str == null) {
            return null;
        }
        return weu.a(str, c(SSL.getVersion(this.t)));
    }

    private static String c(String str) {
        char c2 = 0;
        if (!(str == null || str.length() == 0)) {
            c2 = str.charAt(0);
        }
        if (c2 != 'S') {
            return c2 != 'T' ? "UNKNOWN" : "TLS";
        }
        return "SSL";
    }

    public final void setUseClientMode(boolean z2) {
        if (z2 != this.J) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean getUseClientMode() {
        return this.J;
    }

    public final void setNeedClientAuth(boolean z2) {
        a(z2 ? ClientAuth.REQUIRE : ClientAuth.NONE);
    }

    public final boolean getNeedClientAuth() {
        return this.B == ClientAuth.REQUIRE;
    }

    public final void setWantClientAuth(boolean z2) {
        a(z2 ? ClientAuth.OPTIONAL : ClientAuth.NONE);
    }

    public final boolean getWantClientAuth() {
        return this.B == ClientAuth.OPTIONAL;
    }

    private void a(ClientAuth clientAuth) {
        if (!this.J) {
            synchronized (this) {
                if (this.B != clientAuth) {
                    int i2 = AnonymousClass2.b[clientAuth.ordinal()];
                    if (i2 == 1) {
                        SSL.setVerify(this.t, 0, 10);
                    } else if (i2 == 2) {
                        SSL.setVerify(this.t, 2, 10);
                    } else if (i2 == 3) {
                        SSL.setVerify(this.t, 1, 10);
                    } else {
                        throw new Error(clientAuth.toString());
                    }
                    this.B = clientAuth;
                }
            }
        }
    }

    public final void setEnableSessionCreation(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException();
        }
    }

    public final synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        sSLParameters = super.getSSLParameters();
        int c2 = PlatformDependent.c();
        if (c2 >= 7) {
            sSLParameters.setEndpointIdentificationAlgorithm(this.D);
            sSLParameters.setAlgorithmConstraints((AlgorithmConstraints) this.E);
            if (c2 >= 8) {
                boolean z2 = true;
                if (!(h == null || this.F == null)) {
                    try {
                        h.invoke(sSLParameters, new Object[]{this.F});
                    } catch (IllegalAccessException e2) {
                        throw new Error(e2);
                    } catch (InvocationTargetException e3) {
                        throw new Error(e3);
                    } catch (IllegalAccessException e4) {
                        throw new Error(e4);
                    } catch (InvocationTargetException e5) {
                        throw new Error(e5);
                    }
                }
                if (k != null && !g()) {
                    Method method = k;
                    Object[] objArr = new Object[1];
                    if ((SSL.getOptions(this.t) & 4194304) == 0) {
                        z2 = false;
                    }
                    objArr[0] = Boolean.valueOf(z2);
                    method.invoke(sSLParameters, objArr);
                }
            }
        }
        return sSLParameters;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setSSLParameters(javax.net.ssl.SSLParameters r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            super.setSSLParameters(r9)     // Catch:{ all -> 0x00e6 }
            int r0 = io.netty.util.internal.PlatformDependent.c()     // Catch:{ all -> 0x00e6 }
            r1 = 7
            if (r0 < r1) goto L_0x00e4
            java.lang.String r1 = r9.getEndpointIdentificationAlgorithm()     // Catch:{ all -> 0x00e6 }
            r8.D = r1     // Catch:{ all -> 0x00e6 }
            java.security.AlgorithmConstraints r1 = r9.getAlgorithmConstraints()     // Catch:{ all -> 0x00e6 }
            r8.E = r1     // Catch:{ all -> 0x00e6 }
            r1 = 8
            if (r0 < r1) goto L_0x00e4
            java.lang.Class<?> r0 = f     // Catch:{ all -> 0x00e6 }
            r1 = 0
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r8.J     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r8.g()     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00ad
            boolean r0 = U     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x0039
            java.lang.reflect.Method r0 = g     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0033
            goto L_0x0039
        L_0x0033:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x00e6 }
            r9.<init>()     // Catch:{ all -> 0x00e6 }
            throw r9     // Catch:{ all -> 0x00e6 }
        L_0x0039:
            boolean r0 = U     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x0048
            java.lang.reflect.Method r0 = i     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x00e6 }
            r9.<init>()     // Catch:{ all -> 0x00e6 }
            throw r9     // Catch:{ all -> 0x00e6 }
        L_0x0048:
            java.lang.reflect.Method r0 = g     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Object r0 = r0.invoke(r9, r2)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            if (r0 == 0) goto L_0x009c
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
        L_0x0058:
            boolean r3 = r2.hasNext()     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r2.next()     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Class<?> r4 = f     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            boolean r4 = r4.isInstance(r3)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            if (r4 == 0) goto L_0x007a
            long r4 = r8.t     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.reflect.Method r6 = i     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Object r3 = r6.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            org.apache.tomcat.jni.SSL.setTlsExtHostName(r4, r3)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            goto L_0x0058
        L_0x007a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.String r1 = "Only "
            r0.<init>(r1)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.Class<?> r1 = f     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.String r1 = r1.getName()     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            r0.append(r1)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.String r1 = " instances are supported, but found: "
            r0.append(r1)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            r0.append(r3)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            r9.<init>(r0)     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            throw r9     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
        L_0x009c:
            r8.F = r0     // Catch:{ IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x009f }
            goto L_0x00ad
        L_0x009f:
            r9 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x00e6 }
            r0.<init>(r9)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00a6:
            r9 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x00e6 }
            r0.<init>(r9)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00ad:
            java.lang.reflect.Method r0 = j     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r8.g()     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00e4
            java.lang.reflect.Method r0 = j     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            java.lang.Object r9 = r0.invoke(r9, r1)     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            boolean r9 = r9.booleanValue()     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r9 == 0) goto L_0x00cf
            long r1 = r8.t     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            org.apache.tomcat.jni.SSL.setOptions(r1, r0)     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            goto L_0x00e4
        L_0x00cf:
            long r1 = r8.t     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            org.apache.tomcat.jni.SSL.clearOptions(r1, r0)     // Catch:{ IllegalAccessException -> 0x00dd, InvocationTargetException -> 0x00d6 }
            monitor-exit(r8)
            return
        L_0x00d6:
            r9 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x00e6 }
            r0.<init>(r9)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00dd:
            r9 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x00e6 }
            r0.<init>(r9)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r8)
            return
        L_0x00e6:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00ea
        L_0x00e9:
            throw r9
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.setSSLParameters(javax.net.ssl.SSLParameters):void");
    }

    /* access modifiers changed from: private */
    public boolean g() {
        return this.y != 0;
    }
}
