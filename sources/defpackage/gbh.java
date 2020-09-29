package defpackage;

/* renamed from: gbh reason: default package */
public final class gbh {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i << 1;
            char[] cArr2 = a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static void a(StringBuilder sb, byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                byte b2 = b & 255;
                sb.append(a[b2 >>> 4]);
                sb.append(a[b2 & 15]);
            }
        }
    }
}
