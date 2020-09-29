package defpackage;

import java.net.InetAddress;

/* renamed from: wxl reason: default package */
public final class wxl {
    private static final byte[] a = {-1};
    private static final wyc b = wyd.a(wxl.class);

    private wxl() {
    }

    private static int a(InetAddress inetAddress) {
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            return 0;
        }
        if (inetAddress.isMulticastAddress()) {
            return 1;
        }
        if (inetAddress.isLinkLocalAddress()) {
            return 2;
        }
        return inetAddress.isSiteLocalAddress() ? 3 : 4;
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        boolean z;
        if (bArr2 == null || bArr2.length < 6) {
            return 1;
        }
        int length = bArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            byte b2 = bArr2[i];
            if (b2 != 0 && b2 != 1) {
                z = false;
                break;
            }
            i++;
        }
        if (!z && (bArr2[0] & 1) == 0) {
            return (bArr[0] & 2) == 0 ? (bArr2[0] & 2) == 0 ? 0 : 1 : (bArr2[0] & 2) == 0 ? -1 : 0;
        }
        return 1;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(24);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x:", new Object[]{Integer.valueOf(b2 & 255)}));
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r0.length < r5.length) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a() {
        /*
            byte[] r0 = a
            java.net.Inet4Address r1 = defpackage.wvm.a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x0033 }
        L_0x000d:
            boolean r4 = r3.hasMoreElements()     // Catch:{ SocketException -> 0x0033 }
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.nextElement()     // Catch:{ SocketException -> 0x0033 }
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch:{ SocketException -> 0x0033 }
            java.util.Enumeration r5 = r4.getInetAddresses()     // Catch:{ SocketException -> 0x0033 }
            boolean r6 = r5.hasMoreElements()     // Catch:{ SocketException -> 0x0033 }
            if (r6 == 0) goto L_0x000d
            java.lang.Object r5 = r5.nextElement()     // Catch:{ SocketException -> 0x0033 }
            java.net.InetAddress r5 = (java.net.InetAddress) r5     // Catch:{ SocketException -> 0x0033 }
            boolean r6 = r5.isLoopbackAddress()     // Catch:{ SocketException -> 0x0033 }
            if (r6 != 0) goto L_0x000d
            r2.put(r4, r5)     // Catch:{ SocketException -> 0x0033 }
            goto L_0x000d
        L_0x0033:
            r3 = move-exception
            wyc r4 = b
            java.lang.String r5 = "Failed to retrieve the list of available network interfaces"
            r4.d(r5, r3)
        L_0x003b:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0043:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0092
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5
            java.lang.Object r3 = r3.getValue()
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r6 = r5.isVirtual()
            if (r6 != 0) goto L_0x0043
            byte[] r5 = r5.getHardwareAddress()     // Catch:{ SocketException -> 0x0089 }
            int r6 = a(r0, r5)
            r7 = 1
            if (r6 >= 0) goto L_0x006e
            goto L_0x0084
        L_0x006e:
            if (r6 != 0) goto L_0x0083
            int r6 = a(r1)
            int r8 = a(r3)
            int r6 = r6 - r8
            if (r6 >= 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            if (r6 != 0) goto L_0x0083
            int r6 = r0.length
            int r8 = r5.length
            if (r6 >= r8) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            if (r7 == 0) goto L_0x0043
            r1 = r3
            r0 = r5
            goto L_0x0043
        L_0x0089:
            r3 = move-exception
            wyc r4 = b
            java.lang.String r6 = "Failed to get the hardware address of a network interface: {}"
            r4.b(r6, r5, r3)
            goto L_0x0043
        L_0x0092:
            byte[] r1 = a
            if (r0 != r1) goto L_0x0098
            r0 = 0
            return r0
        L_0x0098:
            int r1 = r0.length
            r2 = 6
            r3 = 8
            if (r1 == r2) goto L_0x00a3
            byte[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L_0x00b5
        L_0x00a3:
            byte[] r1 = new byte[r3]
            r2 = 3
            java.lang.System.arraycopy(r0, r4, r1, r4, r2)
            r3 = -1
            r1[r2] = r3
            r3 = 4
            r4 = -2
            r1[r3] = r4
            r3 = 5
            java.lang.System.arraycopy(r0, r2, r1, r3, r2)
            r0 = r1
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxl.a():byte[]");
    }
}
