package defpackage;

/* renamed from: fnb reason: default package */
public final class fnb extends fnn {
    private static final char[] a = {'A', 'B', 'C', 'D'};
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', '.'};
    private static final char d = a[0];

    public final boolean[] a(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(str);
            sb.append(d);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a2 = fna.a(a, upperCase);
            boolean a3 = fna.a(a, upperCase2);
            boolean a4 = fna.a(b, upperCase);
            boolean a5 = fna.a(b, upperCase2);
            String str2 = "Invalid start/end guards: ";
            if (a2) {
                if (!a3) {
                    throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
                }
            } else if (a4) {
                if (!a5) {
                    throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
                }
            } else if (a3 || a5) {
                throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d);
                sb2.append(str);
                sb2.append(d);
                str = sb2.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (fna.a(c, str.charAt(i3))) {
                i2 += 10;
            } else {
                StringBuilder sb3 = new StringBuilder("Cannot encode : '");
                sb3.append(str.charAt(i3));
                sb3.append('\'');
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= fna.a.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == fna.a[i6]) {
                    i = fna.b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = i4;
            int i8 = 0;
            boolean z = true;
            while (true) {
                int i9 = 0;
                while (i8 < 7) {
                    zArr[i7] = z;
                    i7++;
                    if (((i >> (6 - i8)) & 1) == 0 || i9 == 1) {
                        z = !z;
                        i8++;
                    } else {
                        i9++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i7] = false;
                i7++;
            }
            i4 = i7;
        }
        return zArr;
    }
}
