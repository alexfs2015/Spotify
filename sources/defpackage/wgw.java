package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;

/* renamed from: wgw reason: default package */
public final class wgw implements CharSequence, Comparable<CharSequence> {
    public static final whe<CharSequence> c = new whe<CharSequence>() {
        public final /* synthetic */ int a(Object obj) {
            return wgw.c((CharSequence) obj);
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
            return wgw.a((CharSequence) obj, (CharSequence) obj2);
        }
    };
    public static final whe<CharSequence> d = new whe<CharSequence>() {
        public final /* synthetic */ int a(Object obj) {
            return wgw.c((CharSequence) obj);
        }

        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            return wgw.b((CharSequence) obj, (CharSequence) obj2);
        }
    };
    private static wgw e = new wgw("");
    public final byte[] a;
    public final int b;
    private final int f;
    private int g;
    private String h;

    public static byte a(char c2) {
        if (c2 > 255) {
            c2 = '?';
        }
        return (byte) c2;
    }

    private static boolean b(byte b2) {
        return b2 >= 65 && b2 <= 90;
    }

    private static boolean c(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public final /* synthetic */ int compareTo(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int i = 0;
        if (this == charSequence) {
            return 0;
        }
        int length = length();
        int length2 = charSequence.length();
        int min = Math.min(length, length2);
        int i2 = this.b;
        while (i < min) {
            int charAt = ((char) (this.a[i2] & 255)) - charSequence.charAt(i);
            if (charAt != 0) {
                return charAt;
            }
            i++;
            i2++;
        }
        return length - length2;
    }

    private wgw(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            this.a = Arrays.copyOfRange(bArr, i, i + i2);
            this.b = 0;
        } else if (!wjg.a(i, i2, bArr.length)) {
            this.a = bArr;
            this.b = i;
        } else {
            StringBuilder sb = new StringBuilder("expected: 0 <= start(");
            sb.append(i);
            sb.append(") <= start + length(");
            sb.append(i2);
            sb.append(") <= value.length(");
            sb.append(bArr.length);
            sb.append(')');
            throw new IndexOutOfBoundsException(sb.toString());
        }
        this.f = i2;
    }

    public wgw(CharSequence charSequence) {
        this(charSequence, 0, charSequence.length());
    }

    private wgw(CharSequence charSequence, int i, int i2) {
        if (!wjg.a(0, i2, charSequence.length())) {
            this.a = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                this.a[i3] = a(charSequence.charAt(i4));
                i3++;
                i4++;
            }
            this.b = 0;
            this.f = i2;
            return;
        }
        StringBuilder sb = new StringBuilder("expected: 0 <= start(");
        sb.append(0);
        sb.append(") <= start + length(");
        sb.append(i2);
        sb.append(") <= value.length(");
        sb.append(charSequence.length());
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int a(int i, int i2, wha wha) {
        int i3 = this.b;
        int i4 = i2 + i3;
        while (i3 < i4) {
            if (!wha.a(this.a[i3])) {
                return i3 - this.b;
            }
            i3++;
        }
        return -1;
    }

    public final int length() {
        return this.f;
    }

    public final boolean a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence.getClass() == wgw.class) {
            wgw wgw = (wgw) charSequence;
            int i = this.b;
            int i2 = wgw.b;
            while (i < length()) {
                if (!a(this.a[i], wgw.a[i2])) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
        int i3 = this.b;
        int i4 = 0;
        while (i3 < length()) {
            if (!a((char) (this.a[i3] & 255), charSequence.charAt(i4))) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    private boolean d(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence.getClass() == wgw.class) {
            return equals(charSequence);
        }
        int i = this.b;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (((char) (this.a[i] & 255)) != charSequence.charAt(i2)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = PlatformDependent.b(this.a, this.b, this.f);
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == wgw.class) {
            if (this == obj) {
                return true;
            }
            wgw wgw = (wgw) obj;
            return length() == wgw.length() && hashCode() == wgw.hashCode() && PlatformDependent.a(this.a, this.b, wgw.a, wgw.b, length());
        }
    }

    public final String toString() {
        String str;
        String str2 = this.h;
        if (str2 != null) {
            return str2;
        }
        int length = length() - 0;
        if (length == 0) {
            str = "";
        } else if (!wjg.a(0, length, length())) {
            str = new String(this.a, 0, this.b + 0, length);
        } else {
            StringBuilder sb = new StringBuilder("expected: 0 <= start(");
            sb.append(0);
            sb.append(") <= srcIdx + length(");
            sb.append(length);
            sb.append(") <= srcLen(");
            sb.append(length());
            sb.append(')');
            throw new IndexOutOfBoundsException(sb.toString());
        }
        this.h = str;
        return this.h;
    }

    public static wgw b(CharSequence charSequence) {
        return charSequence.getClass() == wgw.class ? (wgw) charSequence : new wgw(charSequence);
    }

    public static int c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        if (charSequence.getClass() == wgw.class) {
            return charSequence.hashCode();
        }
        return PlatformDependent.a(charSequence);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        Class<wgw> cls = wgw.class;
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence.getClass() == cls) {
            return ((wgw) charSequence).a(charSequence2);
        }
        if (charSequence2.getClass() == cls) {
            return ((wgw) charSequence2).a(charSequence);
        }
        if (charSequence.length() != charSequence2.length()) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            if (!a(charSequence.charAt(i), charSequence2.charAt(i2))) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        Class<wgw> cls = wgw.class;
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence.getClass() == cls) {
            return ((wgw) charSequence).d(charSequence2);
        }
        if (charSequence2.getClass() == cls) {
            return ((wgw) charSequence2).d(charSequence);
        }
        if (charSequence.length() != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte b2, byte b3) {
        return b2 == b3 || a(b2) == a(b3);
    }

    private static boolean a(char c2, char c3) {
        return c2 == c3 || b(c2) == b(c3);
    }

    private static byte a(byte b2) {
        return b(b2) ? (byte) (b2 + 32) : b2;
    }

    private static char b(char c2) {
        return c(c2) ? (char) (c2 + ' ') : c2;
    }

    public final char charAt(int i) {
        byte b2;
        if (i < 0 || i >= this.f) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i);
            sb.append(" must be in the range [0,");
            sb.append(this.f);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (PlatformDependent.e()) {
            b2 = PlatformDependent.a(this.a, i + this.b);
        } else {
            b2 = this.a[i + this.b];
        }
        return (char) (b2 & 255);
    }

    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        int i3 = i2 - i;
        if (wjg.a(i, i3, length())) {
            StringBuilder sb = new StringBuilder("expected: 0 <= start(");
            sb.append(i);
            sb.append(") <= end (");
            sb.append(i2);
            sb.append(") <= length(");
            sb.append(length());
            sb.append(')');
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0 && i2 == length()) {
            return this;
        } else {
            if (i2 == i) {
                return e;
            }
            return new wgw(this.a, i + this.b, i3, true);
        }
    }
}
