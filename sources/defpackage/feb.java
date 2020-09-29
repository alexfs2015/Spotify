package defpackage;

import java.util.Collection;

/* renamed from: feb reason: default package */
public final class feb {
    public static int a(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] a(Collection<? extends Number> collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) fay.a(array[i])).intValue();
        }
        return iArr;
    }

    public static Integer a(String str) {
        Long l;
        String str2 = str;
        if (!((String) fay.a(str)).isEmpty()) {
            int i = 0;
            if (str2.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                int a = a.a(str2.charAt(i));
                if (a >= 0 && a < 10) {
                    long j = (long) (-a);
                    long j2 = (long) 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            int a2 = a.a(str2.charAt(i2));
                            if (a2 < 0 || a2 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            long j5 = (long) a2;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else if (i != 0) {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                    if (l == null && l.longValue() == ((long) l.intValue())) {
                        return Integer.valueOf(l.intValue());
                    }
                    return null;
                }
            }
        }
        l = null;
        if (l == null) {
        }
        return null;
    }
}
