package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;
import io.netty.handler.ssl.ClientAuth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* renamed from: wtl reason: default package */
public class wtl extends wuj {
    private static final wyc a = wyd.a(wtl.class);
    private static String[] b;
    private static List<String> c;
    private static Set<String> d;
    private final String[] e;
    private final List<String> f = Collections.unmodifiableList(Arrays.asList(this.e));
    private final wtf i;
    private final ClientAuth j;
    private final SSLContext k;
    private final boolean l;

    /* renamed from: wtl$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ClientAuth.values().length];
        static final /* synthetic */ int[] b = new int[SelectorFailureBehavior.values().length];
        static final /* synthetic */ int[] c = new int[SelectedListenerFailureBehavior.values().length];
        static final /* synthetic */ int[] d = new int[Protocol.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                d = r0
                r0 = 1
                int[] r1 = d     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = d     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = d     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                c = r2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x003d }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x0047 }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.FATAL_ALERT     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r2 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                b = r2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x005a }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.FATAL_ALERT     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0064 }
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                io.netty.handler.ssl.ClientAuth[] r2 = io.netty.handler.ssl.ClientAuth.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0077 }
                io.netty.handler.ssl.ClientAuth r3 = io.netty.handler.ssl.ClientAuth.OPTIONAL     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0081 }
                io.netty.handler.ssl.ClientAuth r2 = io.netty.handler.ssl.ClientAuth.REQUIRE     // Catch:{ NoSuchFieldError -> 0x0081 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wtl.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        String[] enabledCipherSuites;
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, null, null);
            SSLEngine createSSLEngine = instance.createSSLEngine();
            String[] supportedProtocols = createSSLEngine.getSupportedProtocols();
            HashSet hashSet = new HashSet(supportedProtocols.length);
            for (String add : supportedProtocols) {
                hashSet.add(add);
            }
            ArrayList arrayList = new ArrayList();
            a((Set<String>) hashSet, (List<String>) arrayList, "TLSv1.2", "TLSv1.1", "TLSv1");
            if (!arrayList.isEmpty()) {
                b = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else {
                b = createSSLEngine.getEnabledProtocols();
            }
            String[] supportedCipherSuites = createSSLEngine.getSupportedCipherSuites();
            d = new HashSet(supportedCipherSuites.length);
            for (String add2 : supportedCipherSuites) {
                d.add(add2);
            }
            ArrayList arrayList2 = new ArrayList();
            a(d, (List<String>) arrayList2, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA");
            if (arrayList2.isEmpty()) {
                for (String str : createSSLEngine.getEnabledCipherSuites()) {
                    if (!str.contains("_RC4_")) {
                        arrayList2.add(str);
                    }
                }
            }
            c = Collections.unmodifiableList(arrayList2);
            if (a.b()) {
                a.b("Default protocols (JDK): {} ", (Object) Arrays.asList(b));
                a.b("Default cipher suites (JDK): {}", (Object) c);
            }
        } catch (Exception e2) {
            throw new Error("failed to initialize the default SSL context", e2);
        }
    }

    wtl(SSLContext sSLContext, boolean z, Iterable<String> iterable, wtb wtb, wtf wtf, ClientAuth clientAuth, boolean z2) {
        super(z2);
        this.i = (wtf) wxq.a(wtf, "apn");
        this.j = (ClientAuth) wxq.a(clientAuth, "clientAuth");
        this.e = ((wtb) wxq.a(wtb, "cipherFilter")).a(iterable, c, d);
        this.k = (SSLContext) wxq.a(sSLContext, "sslContext");
        this.l = z;
    }

    static wtf a(ApplicationProtocolConfig applicationProtocolConfig, boolean z) {
        if (applicationProtocolConfig == null) {
            return wth.a;
        }
        int i2 = AnonymousClass1.d[applicationProtocolConfig.b.ordinal()];
        if (i2 == 1) {
            return wth.a;
        }
        String str = " failure behavior";
        String str2 = "JDK provider does not support ";
        if (i2 != 2) {
            if (i2 != 3) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(applicationProtocolConfig.b);
                sb.append(" protocol");
                throw new UnsupportedOperationException(sb.toString());
            } else if (z) {
                int i3 = AnonymousClass1.c[applicationProtocolConfig.d.ordinal()];
                if (i3 == 1) {
                    return new wti(false, applicationProtocolConfig.a);
                }
                if (i3 == 2) {
                    return new wti(true, applicationProtocolConfig.a);
                }
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(applicationProtocolConfig.d);
                sb2.append(str);
                throw new UnsupportedOperationException(sb2.toString());
            } else {
                int i4 = AnonymousClass1.b[applicationProtocolConfig.c.ordinal()];
                if (i4 == 1) {
                    return new wti(true, applicationProtocolConfig.a);
                }
                if (i4 == 2) {
                    return new wti(false, applicationProtocolConfig.a);
                }
                StringBuilder sb3 = new StringBuilder(str2);
                sb3.append(applicationProtocolConfig.c);
                sb3.append(str);
                throw new UnsupportedOperationException(sb3.toString());
            }
        } else if (z) {
            int i5 = AnonymousClass1.b[applicationProtocolConfig.c.ordinal()];
            if (i5 == 1) {
                return new wtd(true, applicationProtocolConfig.a);
            }
            if (i5 == 2) {
                return new wtd(false, applicationProtocolConfig.a);
            }
            StringBuilder sb4 = new StringBuilder(str2);
            sb4.append(applicationProtocolConfig.c);
            sb4.append(str);
            throw new UnsupportedOperationException(sb4.toString());
        } else {
            int i6 = AnonymousClass1.c[applicationProtocolConfig.d.ordinal()];
            if (i6 == 1) {
                return new wtd(false, applicationProtocolConfig.a);
            }
            if (i6 == 2) {
                return new wtd(true, applicationProtocolConfig.a);
            }
            StringBuilder sb5 = new StringBuilder(str2);
            sb5.append(applicationProtocolConfig.d);
            sb5.append(str);
            throw new UnsupportedOperationException(sb5.toString());
        }
    }

    private static void a(Set<String> set, List<String> list, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                list.add(str);
            }
        }
    }

    public final SSLEngine a(wnc wnc, String str, int i2) {
        SSLEngine createSSLEngine = this.k.createSSLEngine(str, i2);
        createSSLEngine.setEnabledCipherSuites(this.e);
        createSSLEngine.setEnabledProtocols(b);
        createSSLEngine.setUseClientMode(this.l);
        if (e()) {
            int i3 = AnonymousClass1.a[this.j.ordinal()];
            if (i3 == 1) {
                createSSLEngine.setWantClientAuth(true);
            } else if (i3 == 2) {
                createSSLEngine.setNeedClientAuth(true);
            }
        }
        return this.i.b().a(createSSLEngine, this.i, e());
    }

    public final boolean a() {
        return this.l;
    }
}
