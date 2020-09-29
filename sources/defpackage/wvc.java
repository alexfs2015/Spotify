package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;

/* renamed from: wvc reason: default package */
public final class wvc implements CharSequence, Comparable<CharSequence> {
    public static final wvk<CharSequence> c = new wvk<CharSequence>() {
        public final /* synthetic */ int a(Object obj) {
            return wvc.c((CharSequence) obj);
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
            return wvc.a((CharSequence) obj, (CharSequence) obj2);
        }
    };
    public static final wvk<CharSequence> d = new wvk<CharSequence>() {
        public final /* synthetic */ int a(Object obj) {
            return wvc.c((CharSequence) obj);
        }

        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            return wvc.b((CharSequence) obj, (CharSequence) obj2);
        }
    };
    private static wvc e = new wvc("");
    public final byte[] a;
    public final int b;
    private final int f;
    private int g;
    private String h;

    public wvc(CharSequence charSequence) {
        this(charSequence, 0, charSequence.length());
    }

    private wvc(CharSequence charSequence, int i, int i2) {
        if (!wxm.a(0, i2, charSequence.length())) {
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

    private wvc(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            this.a = Arrays.copyOfRange(bArr, i, i + i2);
            this.b = 0;
        } else if (!wxm.a(i, i2, bArr.length)) {
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

    private static byte a(byte b2) {
        return b(b2) ? (byte) (b2 + 32) : b2;
    }

    public static byte a(char c2) {
        if (c2 > 255) {
            c2 = '?';
        }
        return (byte) c2;
    }

    private static boolean a(byte b2, byte b3) {
        return b2 == b3 || a(b2) == a(b3);
    }

    private static boolean a(char c2, char c3) {
        return c2 == c3 || b(c2) == b(c3);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        Class<wvc> cls = wvc.class;
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence.getClass() == cls) {
            return ((wvc) charSequence).a(charSequence2);
        }
        if (charSequence2.getClass() == cls) {
            return ((wvc) charSequence2).a(charSequence);
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

    private static char b(char c2) {
        return c(c2) ? (char) (c2 + ' ') : c2;
    }

    public static wvc b(CharSequence charSequence) {
        return charSequence.getClass() == wvc.class ? (wvc) charSequence : new wvc(charSequence);
    }

    private static boolean b(byte b2) {
        return b2 >= 65 && b2 <= 90;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        Class<wvc> cls = wvc.class;
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence.getClass() == cls) {
            return ((wvc) charSequence).d(charSequence2);
        }
        if (charSequence2.getClass() == cls) {
            return ((wvc) charSequence2).d(charSequence);
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

    public static int c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.getClass() == wvc.class ? charSequence.hashCode() : PlatformDependent.a(charSequence);
    }

    private static boolean c(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private boolean d(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence.getClass() == wvc.class) {
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

    public int a(int i, int i2, wvg wvg) {
        int i3 = this.b;
        int i4 = i2 + i3;
        while (i3 < i4) {
            if (!wvg.a(this.a[i3])) {
                return i3 - this.b;
            }
            i3++;
        }
        return -1;
    }

    public final boolean a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence.getClass() == wvc.class) {
            wvc wvc = (wvc) charSequence;
            int i = this.b;
            int i2 = wvc.b;
            while (i < length()) {
                if (!a(this.a[i], wvc.a[i2])) {
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

    public final char charAt(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i);
            sb.append(" must be in the range [0,");
            sb.append(this.f);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return (char) ((PlatformDependent.e() ? PlatformDependent.a(this.a, i + this.b) : this.a[i + this.b]) & 255);
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

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == wvc.class) {
            if (this == obj) {
                return true;
            }
            wvc wvc = (wvc) obj;
            return length() == wvc.length() && hashCode() == wvc.hashCode() && PlatformDependent.a(this.a, this.b, wvc.a, wvc.b, length());
        }
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = PlatformDependent.b(this.a, this.b, this.f);
        }
        return this.g;
    }

    public final int length() {
        return this.f;
    }

    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        int i3 = i2 - i;
        if (!wxm.a(i, i3, length())) {
            return (i == 0 && i2 == length()) ? this : i2 == i ? e : new wvc(this.a, i + this.b, i3, true);
        }
        StringBuilder sb = new StringBuilder("expected: 0 <= start(");
        sb.append(i);
        sb.append(") <= end (");
        sb.append(i2);
        sb.append(") <= length(");
        sb.append(length());
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
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
        } else if (!wxm.a(0, length, length())) {
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
}
