package defpackage;

/* renamed from: fdl reason: default package */
public abstract class fdl extends fdj {
    /* access modifiers changed from: protected */
    public abstract char[] a(int i);

    protected fdl() {
    }

    public String a(String str) {
        fay.a(str);
        int length = str.length();
        int a = a((CharSequence) str, 0, length);
        if (a == length) {
            return str;
        }
        return a(str, a);
    }

    /* access modifiers changed from: protected */
    public int a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int b = b(charSequence, i, i2);
            if (b < 0 || a(b) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(b) ? 2 : 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final String a(String str, int i) {
        int i2;
        int length = str.length();
        char[] a = fdk.a();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int b = b(str, i, length);
            if (b >= 0) {
                char[] a2 = a(b);
                int i5 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                if (a2 != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = a2.length + i7;
                    if (a.length < length2) {
                        a = a(a, i4, length2 + (length - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, a, i4);
                        i4 = i7;
                    }
                    if (a2.length > 0) {
                        System.arraycopy(a2, 0, a, i4, a2.length);
                        i4 += a2.length;
                    }
                    i3 = i5;
                }
                i = a((CharSequence) str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            i2 = i8 + i4;
            if (a.length < i2) {
                a = a(a, i4, i2);
            }
            str.getChars(i3, length, a, i4);
        } else {
            i2 = i4;
        }
        return new String(a, 0, i2);
    }

    private static int b(CharSequence charSequence, int i, int i2) {
        fay.a(charSequence);
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            String str = "'";
            String str2 = " in '";
            String str3 = " at index ";
            String str4 = "' with value ";
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append(str4);
                sb.append(charAt);
                sb.append(str3);
                sb.append(i3 - 1);
                sb.append(str2);
                sb.append(charSequence);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append(str4);
                sb2.append(charAt2);
                sb2.append(str3);
                sb2.append(i3);
                sb2.append(str2);
                sb2.append(charSequence);
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static char[] a(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }
}
