package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;

/* renamed from: whg reason: default package */
public final class whg {
    public static final Inet4Address a;
    private static Inet6Address b;
    private static final boolean c = Boolean.getBoolean("java.net.preferIPv4Stack");
    private static final boolean d = Boolean.getBoolean("java.net.preferIPv6Addresses");
    /* access modifiers changed from: private */
    public static final wjw e;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Inet6Address, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.net.InetAddress] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.net.InetAddress] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v9, types: [java.net.InetAddress] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.net.Inet6Address] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r9 = (java.net.InetAddress) r7.nextElement();
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0125, code lost:
        if (r1 == 0) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        if (r9 != 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0134, code lost:
        e.b(r2, (java.lang.Object) r3);
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v3
      assigns: []
      uses: []
      mth insns count: 128
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARNING: Unknown variable types count: 6 */
    static {
        /*
            java.lang.String r0 = "Failed to find the loopback interface"
            java.lang.String r1 = "localhost"
            java.lang.String r2 = "Using hard-coded IPv4 localhost address: {}"
            java.lang.String r3 = "java.net.preferIPv4Stack"
            boolean r3 = java.lang.Boolean.getBoolean(r3)
            c = r3
            java.lang.String r3 = "java.net.preferIPv6Addresses"
            boolean r3 = java.lang.Boolean.getBoolean(r3)
            d = r3
            java.lang.Class<whg> r3 = defpackage.whg.class
            wjw r3 = defpackage.wjx.a(r3)
            e = r3
            boolean r4 = c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "-Djava.net.preferIPv4Stack: {}"
            r3.b(r5, r4)
            wjw r3 = e
            boolean r4 = d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "-Djava.net.preferIPv6Addresses: {}"
            r3.b(r5, r4)
            r3 = 4
            byte[] r3 = new byte[r3]
            r3 = {127, 0, 0, 1} // fill-array
            r4 = 16
            byte[] r4 = new byte[r4]
            r4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            r5 = 0
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r1, r3)     // Catch:{ Exception -> 0x004b }
            java.net.Inet4Address r3 = (java.net.Inet4Address) r3     // Catch:{ Exception -> 0x004b }
            goto L_0x0050
        L_0x004b:
            r3 = move-exception
            io.netty.util.internal.PlatformDependent.a(r3)
            r3 = r5
        L_0x0050:
            a = r3
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1, r4)     // Catch:{ Exception -> 0x0059 }
            java.net.Inet6Address r1 = (java.net.Inet6Address) r1     // Catch:{ Exception -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.a(r1)
            r1 = r5
        L_0x005e:
            b = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Enumeration r6 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x0083 }
        L_0x0069:
            boolean r7 = r6.hasMoreElements()     // Catch:{ SocketException -> 0x0083 }
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r6.nextElement()     // Catch:{ SocketException -> 0x0083 }
            java.net.NetworkInterface r7 = (java.net.NetworkInterface) r7     // Catch:{ SocketException -> 0x0083 }
            java.util.Enumeration r8 = r7.getInetAddresses()     // Catch:{ SocketException -> 0x0083 }
            boolean r8 = r8.hasMoreElements()     // Catch:{ SocketException -> 0x0083 }
            if (r8 == 0) goto L_0x0069
            r4.add(r7)     // Catch:{ SocketException -> 0x0083 }
            goto L_0x0069
        L_0x0083:
            r6 = move-exception
            wjw r7 = e
            java.lang.String r8 = "Failed to retrieve the list of available network interfaces"
            r7.d(r8, r6)
        L_0x008b:
            java.util.Iterator r6 = r4.iterator()
        L_0x008f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            java.net.NetworkInterface r7 = (java.net.NetworkInterface) r7
            java.util.Enumeration r8 = r7.getInetAddresses()
        L_0x009f:
            boolean r9 = r8.hasMoreElements()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r8.nextElement()
            java.net.InetAddress r9 = (java.net.InetAddress) r9
            boolean r10 = r9.isLoopbackAddress()
            if (r10 == 0) goto L_0x009f
            r5 = r7
            goto L_0x00b4
        L_0x00b3:
            r9 = r5
        L_0x00b4:
            if (r5 != 0) goto L_0x00f0
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SocketException -> 0x00ea }
        L_0x00ba:
            boolean r6 = r4.hasNext()     // Catch:{ SocketException -> 0x00ea }
            if (r6 == 0) goto L_0x00e2
            java.lang.Object r6 = r4.next()     // Catch:{ SocketException -> 0x00ea }
            java.net.NetworkInterface r6 = (java.net.NetworkInterface) r6     // Catch:{ SocketException -> 0x00ea }
            boolean r7 = r6.isLoopback()     // Catch:{ SocketException -> 0x00ea }
            if (r7 == 0) goto L_0x00ba
            java.util.Enumeration r7 = r6.getInetAddresses()     // Catch:{ SocketException -> 0x00ea }
            boolean r8 = r7.hasMoreElements()     // Catch:{ SocketException -> 0x00ea }
            if (r8 == 0) goto L_0x00ba
            java.lang.Object r4 = r7.nextElement()     // Catch:{ SocketException -> 0x00df }
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch:{ SocketException -> 0x00df }
            r9 = r4
            r5 = r6
            goto L_0x00e2
        L_0x00df:
            r4 = move-exception
            r5 = r6
            goto L_0x00eb
        L_0x00e2:
            if (r5 != 0) goto L_0x00f0
            wjw r4 = e     // Catch:{ SocketException -> 0x00ea }
            r4.d(r0)     // Catch:{ SocketException -> 0x00ea }
            goto L_0x00f0
        L_0x00ea:
            r4 = move-exception
        L_0x00eb:
            wjw r6 = e
            r6.d(r0, r4)
        L_0x00f0:
            if (r5 == 0) goto L_0x0112
            wjw r0 = e
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = r5.getName()
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = r5.getDisplayName()
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = r9.getHostAddress()
            r1[r2] = r3
            java.lang.String r2 = "Loopback interface: {} ({}, {})"
            r0.a(r2, r1)
            goto L_0x0139
        L_0x0112:
            if (r9 != 0) goto L_0x0139
            java.net.Inet6Address r0 = b     // Catch:{ Exception -> 0x0131, all -> 0x0128 }
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch:{ Exception -> 0x0131, all -> 0x0128 }
            if (r0 == 0) goto L_0x0124
            wjw r0 = e     // Catch:{ Exception -> 0x0131, all -> 0x0128 }
            java.lang.String r4 = "Using hard-coded IPv6 localhost address: {}"
            r0.b(r4, r1)     // Catch:{ Exception -> 0x0131, all -> 0x0128 }
            goto L_0x0125
        L_0x0124:
            r1 = r9
        L_0x0125:
            if (r1 != 0) goto L_0x0139
            goto L_0x0134
        L_0x0128:
            r0 = move-exception
            if (r9 != 0) goto L_0x0130
            wjw r1 = e
            r1.b(r2, r3)
        L_0x0130:
            throw r0
        L_0x0131:
            if (r9 != 0) goto L_0x0139
        L_0x0134:
            wjw r0 = e
            r0.b(r2, r3)
        L_0x0139:
            whg$1 r0 = new whg$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whg.<clinit>():void");
    }

    private whg() {
    }
}
