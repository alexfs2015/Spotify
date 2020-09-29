package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;
import io.netty.handler.ssl.ClientAuth;
import io.netty.handler.ssl.PemPrivateKey;
import io.netty.handler.ssl.PemX509Certificate;
import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.tomcat.jni.CertificateVerifier;
import org.apache.tomcat.jni.Pool;
import org.apache.tomcat.jni.SSL;
import org.apache.tomcat.jni.SSLContext;

/* renamed from: wgb reason: default package */
public abstract class wgb extends wgd implements whi {
    private static final wjw i;
    private static final boolean j = ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
        public final /* synthetic */ Object run() {
            return Boolean.valueOf(wjo.a("jdk.tls.rejectClientInitiatedRenegotiation", false));
        }
    })).booleanValue();
    private static final List<String> k;
    private static final Integer l;
    private static final ResourceLeakDetector<wgb> m;
    private static wfk u = new wfk() {
        public final Protocol b() {
            return Protocol.NONE;
        }

        public final List<String> a() {
            return Collections.emptyList();
        }

        public final SelectorFailureBehavior c() {
            return SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL;
        }

        public final SelectedListenerFailureBehavior d() {
            return SelectedListenerFailureBehavior.ACCEPT;
        }
    };
    public volatile long a;
    public final wfk b;
    public final Certificate[] c;
    public final ClientAuth d;
    public final wfp e;
    public volatile boolean f;
    private long n;
    private final List<String> o;
    private final long p;
    private final long q;
    private final int r;
    /* access modifiers changed from: private */
    public final whj s;
    private final wgv t;

    /* renamed from: wgb$5 reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[Protocol.values().length];
        static final /* synthetic */ int[] b = new int[SelectorFailureBehavior.values().length];
        static final /* synthetic */ int[] c = new int[SelectedListenerFailureBehavior.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        static {
            /*
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                b = r2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0032 }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x003c }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x004f }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch:{ NoSuchFieldError -> 0x004f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0059 }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0064 }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006f }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: wgb$a */
    static abstract class a implements CertificateVerifier {
        private final wfp a;

        a(wfp wfp) {
            this.a = wfp;
        }
    }

    /* renamed from: wgb$b */
    static final class b implements wfp {
        private final Map<Long, ReferenceCountedOpenSslEngine> a;

        private b() {
            this.a = PlatformDependent.j();
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final ReferenceCountedOpenSslEngine a(long j) {
            return (ReferenceCountedOpenSslEngine) this.a.remove(Long.valueOf(j));
        }

        public final void a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine) {
            this.a.put(Long.valueOf(referenceCountedOpenSslEngine.a()), referenceCountedOpenSslEngine);
        }
    }

    public abstract wfv b();

    public abstract wfs c();

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = i;
        r3 = new java.lang.StringBuilder("ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: ");
        r3.append(r1);
        r2.b(r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0092 */
    static {
        /*
            java.lang.Class<wgb> r0 = defpackage.wgb.class
            wjw r1 = defpackage.wjx.a(r0)
            i = r1
            wgb$1 r1 = new wgb$1
            r1.<init>()
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            j = r1
            whk r1 = defpackage.whk.a()
            io.netty.util.ResourceLeakDetector r0 = r1.a(r0)
            m = r0
            wgb$3 r0 = new wgb$3
            r0.<init>()
            u = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 8
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "ECDHE-ECDSA-AES256-GCM-SHA384"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "ECDHE-ECDSA-AES128-GCM-SHA256"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "ECDHE-RSA-AES128-GCM-SHA256"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "ECDHE-RSA-AES128-SHA"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "ECDHE-RSA-AES256-SHA"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "AES128-GCM-SHA256"
            r1[r2] = r3
            r2 = 6
            java.lang.String r3 = "AES128-SHA"
            r1[r2] = r3
            r2 = 7
            java.lang.String r3 = "AES256-SHA"
            r1[r2] = r3
            java.util.Collections.addAll(r0, r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            k = r1
            wjw r1 = i
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x007f
            wjw r1 = i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Default cipher suite (OpenSSL): "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.b(r0)
        L_0x007f:
            r0 = 0
            wgb$4 r1 = new wgb$4     // Catch:{ all -> 0x00a5 }
            r1.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0092 }
            goto L_0x00a5
        L_0x0092:
            wjw r2 = i     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = "ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: "
            r3.<init>(r4)     // Catch:{ all -> 0x00a5 }
            r3.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00a5 }
            r2.b(r1)     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.<clinit>():void");
    }

    wgb(Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j2, long j3, int i2, Certificate[] certificateArr, ClientAuth clientAuth, boolean z, boolean z2) {
        this(iterable, wev, a(applicationProtocolConfig), j2, j3, i2, certificateArr, clientAuth, z, z2);
    }

    wgb(Iterable<String> iterable, wev wev, wfk wfk, long j2, long j3, int i2, Certificate[] certificateArr, ClientAuth clientAuth, boolean z, boolean z2) {
        Certificate[] certificateArr2;
        long j4 = j2;
        long j5 = j3;
        int i3 = i2;
        super(z);
        this.t = new wgv() {
            public final whi b(Object obj) {
                if (wgb.this.s != null) {
                    wgb.this.s.a(obj);
                }
                return wgb.this;
            }

            public final void d() {
                wgb.this.d();
                if (wgb.this.s != null) {
                    wgb.this.s.b();
                }
            }
        };
        int i4 = 0;
        this.e = new b(0);
        wfj.b();
        if (i3 == 1 || i3 == 0) {
            ArrayList arrayList = null;
            this.s = z2 ? m.a(this) : null;
            this.r = i3;
            this.d = e() ? (ClientAuth) wjk.a(clientAuth, "clientAuth") : ClientAuth.NONE;
            if (i3 == 1) {
                this.f = j;
            }
            if (certificateArr == null) {
                certificateArr2 = null;
            } else {
                certificateArr2 = (Certificate[]) certificateArr.clone();
            }
            this.c = certificateArr2;
            if (iterable != null) {
                arrayList = new ArrayList();
                for (String str : iterable) {
                    if (str == null) {
                        break;
                    }
                    String a2 = weu.a(str);
                    if (a2 != null) {
                        str = a2;
                    }
                    arrayList.add(str);
                }
            }
            this.o = Arrays.asList(((wev) wjk.a(wev, "cipherFilter")).a(arrayList, k, wfj.c()));
            this.b = (wfk) wjk.a(wfk, "apn");
            this.n = Pool.create(0);
            try {
                synchronized (wgb.class) {
                    try {
                        this.a = SSLContext.make(this.n, 31, i3);
                        SSLContext.setOptions(this.a, 4095);
                        SSLContext.setOptions(this.a, 16777216);
                        SSLContext.setOptions(this.a, 33554432);
                        SSLContext.setOptions(this.a, 4194304);
                        SSLContext.setOptions(this.a, 524288);
                        SSLContext.setOptions(this.a, 1048576);
                        SSLContext.setOptions(this.a, 65536);
                        SSLContext.setOptions(this.a, 16384);
                        SSLContext.setMode(this.a, SSLContext.getMode(this.a) | 2);
                        if (l != null) {
                            SSLContext.setTmpDHLength(this.a, l.intValue());
                        }
                        SSLContext.setCipherSuite(this.a, weu.a((Iterable<String>) this.o));
                        List a3 = wfk.a();
                        if (!a3.isEmpty()) {
                            String[] strArr = (String[]) a3.toArray(new String[a3.size()]);
                            int i5 = AnonymousClass5.b[wfk.c().ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i4 = 1;
                                } else {
                                    throw new Error();
                                }
                            }
                            int i6 = AnonymousClass5.a[wfk.b().ordinal()];
                            if (i6 == 1) {
                                SSLContext.setNpnProtos(this.a, strArr, i4);
                            } else if (i6 == 2) {
                                SSLContext.setAlpnProtos(this.a, strArr, i4);
                            } else if (i6 == 3) {
                                SSLContext.setNpnProtos(this.a, strArr, i4);
                                SSLContext.setAlpnProtos(this.a, strArr, i4);
                            } else {
                                throw new Error();
                            }
                        }
                        if (j4 > 0) {
                            this.p = j4;
                            SSLContext.setSessionCacheSize(this.a, j4);
                        } else {
                            long sessionCacheSize = SSLContext.setSessionCacheSize(this.a, 20480);
                            this.p = sessionCacheSize;
                            SSLContext.setSessionCacheSize(this.a, sessionCacheSize);
                        }
                        if (j5 > 0) {
                            this.q = j5;
                            SSLContext.setSessionCacheTimeout(this.a, j5);
                        } else {
                            long sessionCacheTimeout = SSLContext.setSessionCacheTimeout(this.a, 300);
                            this.q = sessionCacheTimeout;
                            SSLContext.setSessionCacheTimeout(this.a, sessionCacheTimeout);
                        }
                    } catch (Exception e2) {
                        throw new SSLException("failed to create an SSL_CTX", e2);
                    } catch (SSLException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        StringBuilder sb = new StringBuilder("failed to set cipher suite: ");
                        sb.append(this.o);
                        throw new SSLException(sb.toString(), e4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                B();
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("mode most be either SSL.SSL_MODE_SERVER or SSL.SSL_MODE_CLIENT");
        }
    }

    public final boolean a() {
        return this.r == 0;
    }

    public final SSLEngine a(vyw vyw, String str, int i2) {
        return b(vyw, str, i2);
    }

    /* access modifiers changed from: 0000 */
    public SSLEngine b(vyw vyw, String str, int i2) {
        ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine = new ReferenceCountedOpenSslEngine(this, vyw, str, i2, true);
        return referenceCountedOpenSslEngine;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        synchronized (wgb.class) {
            if (this.a != 0) {
                SSLContext.free(this.a);
                this.a = 0;
            }
            if (this.n != 0) {
                Pool.destroy(this.n);
                this.n = 0;
            }
        }
    }

    protected static X509TrustManager a(TrustManager[] trustManagerArr) {
        for (X509TrustManager x509TrustManager : trustManagerArr) {
            if (x509TrustManager instanceof X509TrustManager) {
                return x509TrustManager;
            }
        }
        throw new IllegalStateException("no X509TrustManager found");
    }

    protected static X509KeyManager a(KeyManager[] keyManagerArr) {
        for (X509KeyManager x509KeyManager : keyManagerArr) {
            if (x509KeyManager instanceof X509KeyManager) {
                return x509KeyManager;
            }
        }
        throw new IllegalStateException("no X509KeyManager found");
    }

    static wfk a(ApplicationProtocolConfig applicationProtocolConfig) {
        if (applicationProtocolConfig == null) {
            return u;
        }
        int i2 = AnonymousClass5.a[applicationProtocolConfig.b.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            int i3 = AnonymousClass5.c[applicationProtocolConfig.d.ordinal()];
            String str = " behavior";
            String str2 = "OpenSSL provider does not support ";
            if (i3 == 1 || i3 == 2) {
                int i4 = AnonymousClass5.b[applicationProtocolConfig.c.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    return new wfn(applicationProtocolConfig);
                }
                StringBuilder sb = new StringBuilder(str2);
                sb.append(applicationProtocolConfig.c);
                sb.append(str);
                throw new UnsupportedOperationException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(applicationProtocolConfig.d);
            sb2.append(str);
            throw new UnsupportedOperationException(sb2.toString());
        } else if (i2 == 4) {
            return u;
        } else {
            throw new Error();
        }
    }

    static boolean a(X509TrustManager x509TrustManager) {
        return PlatformDependent.c() >= 7 && (x509TrustManager instanceof X509ExtendedTrustManager);
    }

    static boolean a(X509KeyManager x509KeyManager) {
        return PlatformDependent.c() >= 7 && (x509KeyManager instanceof X509ExtendedKeyManager);
    }

    public final int z() {
        return this.t.z();
    }

    public final whi b(Object obj) {
        this.t.b(obj);
        return this;
    }

    public final boolean B() {
        return this.t.B();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(long r17, java.security.cert.X509Certificate[] r19, java.security.PrivateKey r20, java.lang.String r21) {
        /*
            r1 = 0
            r3 = 0
            vyw r0 = defpackage.vyw.a     // Catch:{ SSLException -> 0x007c, Exception -> 0x0071, all -> 0x006d }
            r4 = 1
            r5 = r19
            wfx r3 = io.netty.handler.ssl.PemX509Certificate.a(r0, r4, r5)     // Catch:{ SSLException -> 0x007c, Exception -> 0x0071, all -> 0x006d }
            vyw r0 = defpackage.vyw.a     // Catch:{ SSLException -> 0x007c, Exception -> 0x0071, all -> 0x006d }
            wfx r5 = r3.c()     // Catch:{ SSLException -> 0x007c, Exception -> 0x0071, all -> 0x006d }
            long r13 = a(r0, r5)     // Catch:{ SSLException -> 0x007c, Exception -> 0x0071, all -> 0x006d }
            vyw r0 = defpackage.vyw.a     // Catch:{ SSLException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            wfx r5 = r3.c()     // Catch:{ SSLException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            long r10 = a(r0, r5)     // Catch:{ SSLException -> 0x006a, Exception -> 0x0067, all -> 0x0064 }
            if (r20 == 0) goto L_0x0035
            long r1 = a(r20)     // Catch:{ SSLException -> 0x0030, Exception -> 0x002b, all -> 0x0027 }
            goto L_0x0035
        L_0x0027:
            r0 = move-exception
            r4 = r10
            goto L_0x0084
        L_0x002b:
            r0 = move-exception
            r4 = r1
            r1 = r10
            goto L_0x0074
        L_0x0030:
            r0 = move-exception
            r4 = r1
            r1 = r10
            goto L_0x007f
        L_0x0035:
            if (r21 != 0) goto L_0x003b
            java.lang.String r0 = ""
            r12 = r0
            goto L_0x003d
        L_0x003b:
            r12 = r21
        L_0x003d:
            r6 = r17
            r8 = r13
            r4 = r10
            r10 = r1
            org.apache.tomcat.jni.SSLContext.setCertificateBio(r6, r8, r10, r12)     // Catch:{ SSLException -> 0x005f, Exception -> 0x005a, all -> 0x0058 }
            r0 = 1
            org.apache.tomcat.jni.SSLContext.setCertificateChainBio(r6, r4, r0)     // Catch:{ SSLException -> 0x005f, Exception -> 0x005a, all -> 0x0058 }
            a(r1)
            a(r13)
            a(r4)
            if (r3 == 0) goto L_0x0057
            r3.B()
        L_0x0057:
            return
        L_0x0058:
            r0 = move-exception
            goto L_0x0084
        L_0x005a:
            r0 = move-exception
            r15 = r1
            r1 = r4
            r4 = r15
            goto L_0x0074
        L_0x005f:
            r0 = move-exception
            r15 = r1
            r1 = r4
            r4 = r15
            goto L_0x007f
        L_0x0064:
            r0 = move-exception
            r4 = r1
            goto L_0x0084
        L_0x0067:
            r0 = move-exception
            r4 = r1
            goto L_0x0074
        L_0x006a:
            r0 = move-exception
            r4 = r1
            goto L_0x007f
        L_0x006d:
            r0 = move-exception
            r4 = r1
            r13 = r4
            goto L_0x0084
        L_0x0071:
            r0 = move-exception
            r4 = r1
            r13 = r4
        L_0x0074:
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = "failed to set certificate and key"
            r6.<init>(r7, r0)     // Catch:{ all -> 0x0080 }
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r0 = move-exception
            r4 = r1
            r13 = r4
        L_0x007f:
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            r15 = r1
            r1 = r4
            r4 = r15
        L_0x0084:
            a(r1)
            a(r13)
            a(r4)
            if (r3 == 0) goto L_0x0092
            r3.B()
        L_0x0092:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.a(long, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String):void");
    }

    static void a(long j2) {
        if (j2 != 0) {
            SSL.freeBIO(j2);
        }
    }

    static long a(PrivateKey privateKey) {
        if (privateKey == null) {
            return 0;
        }
        vyw vyw = vyw.a;
        wfx a2 = PemPrivateKey.a(vyw, true, privateKey);
        try {
            return a(vyw, a2.c());
        } finally {
            a2.B();
        }
    }

    static long a(X509Certificate... x509CertificateArr) {
        vyw vyw = vyw.a;
        wfx a2 = PemX509Certificate.a(vyw, true, x509CertificateArr);
        try {
            return a(vyw, a2.c());
        } finally {
            a2.B();
        }
    }

    static long a(vyw vyw, wfx wfx) {
        vyv d2;
        try {
            vyv a2 = wfx.a();
            if (a2.F()) {
                long a3 = a(a2.u());
                wfx.B();
                return a3;
            }
            d2 = vyw.d(a2.g());
            d2.a(a2, a2.c(), a2.g());
            long a4 = a(d2.u());
            if (wfx.b()) {
                wgh.a(d2);
            }
            d2.B();
            wfx.B();
            return a4;
        } catch (Throwable th) {
            wfx.B();
            throw th;
        }
    }

    private static long a(vyv vyv) {
        try {
            long newMemBIO = SSL.newMemBIO();
            int g = vyv.g();
            if (SSL.writeToBIO(newMemBIO, wfj.a(vyv) + ((long) vyv.c()), g) == g) {
                return newMemBIO;
            }
            SSL.freeBIO(newMemBIO);
            throw new IllegalStateException("Could not write data to memory BIO");
        } finally {
            vyv.B();
        }
    }
}
