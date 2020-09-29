package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.tomcat.jni.Buffer;

/* renamed from: wtp reason: default package */
public final class wtp {
    public static final Set<String> a;
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(h)));
    private static final wyc c;
    private static final Throwable d;
    private static final Set<String> e;
    private static final Set<String> f;
    private static final boolean g;
    private static final String[] h = {"SSLv2Hello", "SSLv2", "SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
    private static /* synthetic */ boolean i;

    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        c.b("KeyManagerFactory not supported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fe, code lost:
        r5 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x02e9 */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0309 A[Catch:{ all -> 0x030d, Exception -> 0x0315 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:135:0x02f0=Splitter:B:135:0x02f0, B:144:0x0302=Splitter:B:144:0x0302} */
    static {
        /*
            java.lang.String r0 = "netty-tcnative-"
            java.lang.String r1 = "aix"
            java.lang.String r2 = ""
            java.lang.String r3 = " will be unavailable."
            java.lang.Class<wtp> r4 = defpackage.wtp.class
            boolean r5 = r4.desiredAssertionStatus()
            r6 = 1
            r5 = r5 ^ r6
            i = r5
            wyc r5 = defpackage.wyd.a(r4)
            c = r5
            r5 = 6
            java.lang.String[] r5 = new java.lang.String[r5]
            r7 = 0
            java.lang.String r8 = "SSLv2Hello"
            r5[r7] = r8
            java.lang.String r8 = "SSLv2"
            r5[r6] = r8
            r8 = 2
            java.lang.String r9 = "SSLv3"
            r5[r8] = r9
            r8 = 3
            java.lang.String r9 = "TLSv1"
            r5[r8] = r9
            r9 = 4
            java.lang.String r10 = "TLSv1.1"
            r5[r9] = r10
            r9 = 5
            java.lang.String r10 = "TLSv1.2"
            r5[r9] = r10
            h = r5
            java.util.HashSet r5 = new java.util.HashSet
            java.lang.String[] r10 = h
            java.util.List r10 = java.util.Arrays.asList(r10)
            r5.<init>(r10)
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r5)
            b = r5
            r5 = 0
            java.lang.String r10 = "org.apache.tomcat.jni.SSL"
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.Class.forName(r10, r7, r4)     // Catch:{ ClassNotFoundException -> 0x0057 }
            r4 = r5
            goto L_0x0074
        L_0x0057:
            r4 = move-exception
            wyc r10 = c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "netty-tcnative not in the classpath; "
            r11.<init>(r12)
            java.lang.Class<wtu> r12 = defpackage.wtu.class
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.b(r11)
        L_0x0074:
            if (r4 != 0) goto L_0x024b
            java.lang.String r10 = "os.name"
            java.lang.String r10 = defpackage.wxu.a(r10, r2)     // Catch:{ all -> 0x01f8 }
            java.lang.String r10 = b(r10)     // Catch:{ all -> 0x01f8 }
            boolean r11 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r12 = "osx"
            java.lang.String r13 = "os400"
            java.lang.String r14 = "hpux"
            java.lang.String r15 = "linux"
            if (r11 == 0) goto L_0x0090
            goto L_0x010c
        L_0x0090:
            boolean r1 = r10.startsWith(r14)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x0099
            r1 = r14
            goto L_0x010c
        L_0x0099:
            boolean r1 = r10.startsWith(r13)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00b1
            int r1 = r10.length()     // Catch:{ all -> 0x01f8 }
            if (r1 <= r9) goto L_0x00af
            char r1 = r10.charAt(r9)     // Catch:{ all -> 0x01f8 }
            boolean r1 = java.lang.Character.isDigit(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 != 0) goto L_0x00b1
        L_0x00af:
            r1 = r13
            goto L_0x010c
        L_0x00b1:
            boolean r1 = r10.startsWith(r15)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00b9
            r1 = r15
            goto L_0x010c
        L_0x00b9:
            java.lang.String r1 = "macosx"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 != 0) goto L_0x010b
            boolean r1 = r10.startsWith(r12)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00c8
            goto L_0x010b
        L_0x00c8:
            java.lang.String r1 = "freebsd"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00d3
            java.lang.String r1 = "freebsd"
            goto L_0x010c
        L_0x00d3:
            java.lang.String r1 = "openbsd"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = "openbsd"
            goto L_0x010c
        L_0x00de:
            java.lang.String r1 = "netbsd"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "netbsd"
            goto L_0x010c
        L_0x00e9:
            java.lang.String r1 = "solaris"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 != 0) goto L_0x0108
            java.lang.String r1 = "sunos"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x00fa
            goto L_0x0108
        L_0x00fa:
            java.lang.String r1 = "windows"
            boolean r1 = r10.startsWith(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x0105
            java.lang.String r1 = "windows"
            goto L_0x010c
        L_0x0105:
            java.lang.String r1 = "unknown"
            goto L_0x010c
        L_0x0108:
            java.lang.String r1 = "sunos"
            goto L_0x010c
        L_0x010b:
            r1 = r12
        L_0x010c:
            java.lang.String r9 = "os.arch"
            java.lang.String r2 = defpackage.wxu.a(r9, r2)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = b(r2)     // Catch:{ all -> 0x01f8 }
            java.lang.String r9 = "^(x8664|amd64|ia32e|em64t|x64)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0122
            java.lang.String r2 = "x86_64"
            goto L_0x019f
        L_0x0122:
            java.lang.String r9 = "^(x8632|x86|i[3-6]86|ia32|x32)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x012e
            java.lang.String r2 = "x86_32"
            goto L_0x019f
        L_0x012e:
            java.lang.String r9 = "^(ia64|itanium64)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x013a
            java.lang.String r2 = "itanium_64"
            goto L_0x019f
        L_0x013a:
            java.lang.String r9 = "^(sparc|sparc32)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0145
            java.lang.String r2 = "sparc_32"
            goto L_0x019f
        L_0x0145:
            java.lang.String r9 = "^(sparcv9|sparc64)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0150
            java.lang.String r2 = "sparc_64"
            goto L_0x019f
        L_0x0150:
            java.lang.String r9 = "^(arm|arm32)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x015b
            java.lang.String r2 = "arm_32"
            goto L_0x019f
        L_0x015b:
            java.lang.String r9 = "aarch64"
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0166
            java.lang.String r2 = "aarch_64"
            goto L_0x019f
        L_0x0166:
            java.lang.String r9 = "^(ppc|ppc32)$"
            boolean r9 = r2.matches(r9)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0171
            java.lang.String r2 = "ppc_32"
            goto L_0x019f
        L_0x0171:
            java.lang.String r9 = "ppc64"
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x017c
            java.lang.String r2 = "ppc_64"
            goto L_0x019f
        L_0x017c:
            java.lang.String r9 = "ppc64le"
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0187
            java.lang.String r2 = "ppcle_64"
            goto L_0x019f
        L_0x0187:
            java.lang.String r9 = "s390"
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x01f8 }
            if (r9 == 0) goto L_0x0192
            java.lang.String r2 = "s390_32"
            goto L_0x019f
        L_0x0192:
            java.lang.String r9 = "s390x"
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x01f8 }
            if (r2 == 0) goto L_0x019d
            java.lang.String r2 = "s390_64"
            goto L_0x019f
        L_0x019d:
            java.lang.String r2 = "unknown"
        L_0x019f:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch:{ all -> 0x01f8 }
            r9.<init>(r8)     // Catch:{ all -> 0x01f8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f8 }
            r8.<init>(r0)     // Catch:{ all -> 0x01f8 }
            r8.append(r1)     // Catch:{ all -> 0x01f8 }
            r10 = 45
            r8.append(r10)     // Catch:{ all -> 0x01f8 }
            r8.append(r2)     // Catch:{ all -> 0x01f8 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x01f8 }
            r9.add(r8)     // Catch:{ all -> 0x01f8 }
            boolean r8 = r15.equalsIgnoreCase(r1)     // Catch:{ all -> 0x01f8 }
            if (r8 == 0) goto L_0x01dd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f8 }
            r8.<init>(r0)     // Catch:{ all -> 0x01f8 }
            r8.append(r1)     // Catch:{ all -> 0x01f8 }
            r0 = 45
            r8.append(r0)     // Catch:{ all -> 0x01f8 }
            r8.append(r2)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "-fedora"
            r8.append(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01f8 }
            r9.add(r0)     // Catch:{ all -> 0x01f8 }
        L_0x01dd:
            java.lang.String r0 = "netty-tcnative"
            r9.add(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Class<org.apache.tomcat.jni.SSL> r0 = org.apache.tomcat.jni.SSL.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x01f8 }
            int r1 = r9.size()     // Catch:{ all -> 0x01f8 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r1 = r9.toArray(r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x01f8 }
            defpackage.wxn.a(r0, r1)     // Catch:{ all -> 0x01f8 }
            goto L_0x021d
        L_0x01f8:
            r0 = move-exception
            r4 = r0
            wyc r0 = c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to load netty-tcnative; "
            r1.<init>(r2)
            java.lang.Class<wtu> r2 = defpackage.wtu.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " will be unavailable, unless the application has already loaded the symbols by some other means. "
            r1.append(r2)
            java.lang.String r2 = "See http://netty.io/wiki/forked-tomcat-native.html for more information."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.b(r1, r4)
        L_0x021d:
            java.lang.String r0 = "provided"
            org.apache.tomcat.jni.Library.initialize(r0)     // Catch:{ all -> 0x0226 }
            org.apache.tomcat.jni.SSL.initialize(r5)     // Catch:{ all -> 0x0226 }
            goto L_0x024c
        L_0x0226:
            r0 = move-exception
            if (r4 != 0) goto L_0x022b
            r5 = r0
            goto L_0x022c
        L_0x022b:
            r5 = r4
        L_0x022c:
            wyc r1 = c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to initialize netty-tcnative; "
            r2.<init>(r4)
            java.lang.Class<wtu> r4 = defpackage.wtu.class
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " will be unavailable. See http://netty.io/wiki/forked-tomcat-native.html for more information."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.b(r2, r0)
            goto L_0x024c
        L_0x024b:
            r5 = r4
        L_0x024c:
            if (r5 != 0) goto L_0x0282
            wtp$2 r0 = new wtp$2
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0282
            wyc r0 = c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "incompatible tcnative in the classpath; "
            r1.<init>(r2)
            java.lang.Class<wtu> r2 = defpackage.wtu.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.b(r1)
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "incompatible tcnative in the classpath"
            r5.<init>(r0)
        L_0x0282:
            d = r5
            if (r5 != 0) goto L_0x03a4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r1 = 0
            long r3 = org.apache.tomcat.jni.Pool.create(r1)
            r5 = 31
            long r8 = org.apache.tomcat.jni.SSLContext.make(r3, r5, r6)     // Catch:{ Exception -> 0x0315 }
            r5 = 4095(0xfff, float:5.738E-42)
            org.apache.tomcat.jni.SSLContext.setOptions(r8, r5)     // Catch:{ all -> 0x030d }
            java.lang.String r5 = "ALL"
            org.apache.tomcat.jni.SSLContext.setCipherSuite(r8, r5)     // Catch:{ all -> 0x030d }
            long r10 = org.apache.tomcat.jni.SSL.newSSL(r8, r6)     // Catch:{ all -> 0x030d }
            java.lang.String[] r5 = org.apache.tomcat.jni.SSL.getCiphers(r10)     // Catch:{ all -> 0x0300 }
            int r12 = r5.length     // Catch:{ all -> 0x0300 }
            r13 = 0
        L_0x02ad:
            if (r13 >= r12) goto L_0x02c5
            r14 = r5[r13]     // Catch:{ all -> 0x0300 }
            if (r14 == 0) goto L_0x02c2
            int r15 = r14.length()     // Catch:{ all -> 0x0300 }
            if (r15 == 0) goto L_0x02c2
            boolean r15 = r0.contains(r14)     // Catch:{ all -> 0x0300 }
            if (r15 != 0) goto L_0x02c2
            r0.add(r14)     // Catch:{ all -> 0x0300 }
        L_0x02c2:
            int r13 = r13 + 1
            goto L_0x02ad
        L_0x02c5:
            wuq r5 = new wuq     // Catch:{ all -> 0x02e8 }
            r5.<init>()     // Catch:{ all -> 0x02e8 }
            java.security.cert.X509Certificate[] r12 = new java.security.cert.X509Certificate[r6]     // Catch:{ all -> 0x02e8 }
            java.security.cert.X509Certificate r5 = r5.a     // Catch:{ all -> 0x02e8 }
            r12[r7] = r5     // Catch:{ all -> 0x02e8 }
            long r12 = defpackage.wts.a(r12)     // Catch:{ all -> 0x02e8 }
            org.apache.tomcat.jni.SSL.setCertificateChainBio(r10, r12, r7)     // Catch:{ all -> 0x02e9 }
            wtp$1 r5 = new wtp$1     // Catch:{ all -> 0x02e9 }
            r5.<init>()     // Catch:{ all -> 0x02e9 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ all -> 0x02e9 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x02e9 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x02e9 }
            r7 = r5
            goto L_0x02f0
        L_0x02e8:
            r12 = r1
        L_0x02e9:
            wyc r5 = c     // Catch:{ all -> 0x02fe }
            java.lang.String r14 = "KeyManagerFactory not supported."
            r5.b(r14)     // Catch:{ all -> 0x02fe }
        L_0x02f0:
            org.apache.tomcat.jni.SSL.freeSSL(r10)     // Catch:{ all -> 0x030d }
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x02fa
            org.apache.tomcat.jni.SSL.freeBIO(r12)     // Catch:{ all -> 0x030d }
        L_0x02fa:
            org.apache.tomcat.jni.SSLContext.free(r8)     // Catch:{ Exception -> 0x0315 }
            goto L_0x031d
        L_0x02fe:
            r5 = move-exception
            goto L_0x0302
        L_0x0300:
            r5 = move-exception
            r12 = r1
        L_0x0302:
            org.apache.tomcat.jni.SSL.freeSSL(r10)     // Catch:{ all -> 0x030d }
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x030c
            org.apache.tomcat.jni.SSL.freeBIO(r12)     // Catch:{ all -> 0x030d }
        L_0x030c:
            throw r5     // Catch:{ all -> 0x030d }
        L_0x030d:
            r1 = move-exception
            org.apache.tomcat.jni.SSLContext.free(r8)     // Catch:{ Exception -> 0x0315 }
            throw r1     // Catch:{ Exception -> 0x0315 }
        L_0x0312:
            r0 = move-exception
            goto L_0x03a0
        L_0x0315:
            r1 = move-exception
            wyc r2 = c     // Catch:{ all -> 0x0312 }
            java.lang.String r5 = "Failed to get the list of available OpenSSL cipher suites."
            r2.d(r5, r1)     // Catch:{ all -> 0x0312 }
        L_0x031d:
            org.apache.tomcat.jni.Pool.destroy(r3)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            e = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<java.lang.String> r1 = e
            int r1 = r1.size()
            int r1 = r1 << r6
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = e
            java.util.Iterator r1 = r1.iterator()
        L_0x0338:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0357
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "TLS"
            java.lang.String r3 = defpackage.wta.a(r2, r3)
            r0.add(r3)
            java.lang.String r3 = "SSL"
            java.lang.String r2 = defpackage.wta.a(r2, r3)
            r0.add(r2)
            goto L_0x0338
        L_0x0357:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            f = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<java.lang.String> r1 = e
            int r1 = r1.size()
            java.util.Set<java.lang.String> r2 = f
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = e
            java.util.Iterator r1 = r1.iterator()
        L_0x0375:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0385
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L_0x0375
        L_0x0385:
            java.util.Set<java.lang.String> r1 = f
            java.util.Iterator r1 = r1.iterator()
        L_0x038b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x039b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L_0x038b
        L_0x039b:
            a = r0
            g = r7
            return
        L_0x03a0:
            org.apache.tomcat.jni.Pool.destroy(r3)
            throw r0
        L_0x03a4:
            java.util.Set r0 = java.util.Collections.emptySet()
            e = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            f = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            a = r0
            g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtp.<clinit>():void");
    }

    private wtp() {
    }

    public static long a(wnb wnb) {
        if (i || wnb.F()) {
            return wnb.I() ? wnb.L() : Buffer.address(wnb.v());
        }
        throw new AssertionError();
    }

    static void a(wvo wvo) {
        if (wvo.z() > 0) {
            wvn.b(wvo);
        }
    }

    public static boolean a() {
        return d == null;
    }

    public static boolean a(long j) {
        return j != 0;
    }

    public static boolean a(String str) {
        String a2 = wta.a(str);
        if (a2 != null) {
            str = a2;
        }
        return e.contains(str);
    }

    private static String b(String str) {
        return str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    public static void b() {
        if (d != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(d));
        }
    }

    @Deprecated
    public static Set<String> c() {
        return e;
    }

    static boolean d() {
        return g;
    }
}
