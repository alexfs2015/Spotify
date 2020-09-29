package defpackage;

import java.util.Random;

/* renamed from: wpj reason: default package */
public final class wpj {
    private static final Random a = new Random();

    public static String a(int i) {
        return a(10, false, false);
    }

    public static String b(int i) {
        return a(30, true, true);
    }

    private static String a(int i, boolean z, boolean z2) {
        return a(i, 0, 0, z, z2);
    }

    private static String a(int i, int i2, int i3, boolean z, boolean z2) {
        return a(i, 0, 0, z, z2, null, a);
    }

    private static String a(int i, int i2, int i3, boolean z, boolean z2, char[] cArr, Random random) {
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            if (i2 == 0 && i3 == 0) {
                if (z || z2) {
                    i3 = 123;
                    i2 = 32;
                } else {
                    i3 = Integer.MAX_VALUE;
                }
            } else if (i3 <= i2) {
                StringBuilder sb = new StringBuilder("Parameter end (");
                sb.append(i3);
                sb.append(") must be greater than start (");
                sb.append(i2);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
            char[] cArr2 = new char[i];
            int i4 = i3 - i2;
            while (true) {
                int i5 = i - 1;
                if (i == 0) {
                    return new String(cArr2);
                }
                char nextInt = (char) (random.nextInt(i4) + i2);
                if ((z && Character.isLetter(nextInt)) || ((z2 && Character.isDigit(nextInt)) || (!z && !z2))) {
                    if (nextInt < 56320 || nextInt > 57343) {
                        if (nextInt < 55296 || nextInt > 56191) {
                            if (nextInt < 56192 || nextInt > 56319) {
                                cArr2[i5] = nextInt;
                            }
                        } else if (i5 != 0) {
                            cArr2[i5] = (char) (random.nextInt(128) + 56320);
                            i5--;
                            cArr2[i5] = nextInt;
                        }
                        i = i5;
                    } else if (i5 != 0) {
                        cArr2[i5] = nextInt;
                        i = i5 - 1;
                        cArr2[i] = (char) (random.nextInt(128) + 55296);
                    }
                }
                i = i5 + 1;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Requested random string length ");
            sb2.append(i);
            sb2.append(" is less than 0.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
