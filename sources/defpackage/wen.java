package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wen reason: default package */
public final class wen implements Comparable<wen> {
    public static final wen a;
    public static final wen b;
    private static final Pattern e = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");
    final String c;
    final byte[] d;
    private final String f;
    private final int g;
    private final int h;
    private final boolean i;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wen wen = (wen) obj;
        int compareTo = this.f.compareTo(wen.f);
        if (compareTo != 0) {
            return compareTo;
        }
        int i2 = this.g - wen.g;
        if (i2 != 0) {
            return i2;
        }
        return this.h - wen.h;
    }

    static {
        wen wen = new wen("HTTP", 1, 0, false, true);
        a = wen;
        wen wen2 = new wen("HTTP", 1, 1, true, true);
        b = wen2;
    }

    public static wen a(String str) {
        wen wen;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if ("HTTP/1.1".equals(trim)) {
                    wen = b;
                } else if ("HTTP/1.0".equals(trim)) {
                    wen = a;
                } else {
                    wen = null;
                }
                return wen == null ? new wen(trim, true) : wen;
            }
            throw new IllegalArgumentException("text is empty");
        }
        throw new NullPointerException("text");
    }

    private wen(String str, boolean z) {
        if (str != null) {
            String upperCase = str.trim().toUpperCase();
            if (!upperCase.isEmpty()) {
                Matcher matcher = e.matcher(upperCase);
                if (matcher.matches()) {
                    this.f = matcher.group(1);
                    this.g = Integer.parseInt(matcher.group(2));
                    this.h = Integer.parseInt(matcher.group(3));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f);
                    sb.append('/');
                    sb.append(this.g);
                    sb.append('.');
                    sb.append(this.h);
                    this.c = sb.toString();
                    this.i = true;
                    this.d = null;
                    return;
                }
                StringBuilder sb2 = new StringBuilder("invalid version format: ");
                sb2.append(upperCase);
                throw new IllegalArgumentException(sb2.toString());
            }
            throw new IllegalArgumentException("empty text");
        }
        throw new NullPointerException("text");
    }

    private wen(String str, int i2, int i3, boolean z, boolean z2) {
        String upperCase = str.trim().toUpperCase();
        if (!upperCase.isEmpty()) {
            for (int i4 = 0; i4 < upperCase.length(); i4++) {
                if (Character.isISOControl(upperCase.charAt(i4)) || Character.isWhitespace(upperCase.charAt(i4))) {
                    throw new IllegalArgumentException("invalid character in protocolName");
                }
            }
            if (i3 >= 0) {
                this.f = upperCase;
                this.g = 1;
                this.h = i3;
                StringBuilder sb = new StringBuilder();
                sb.append(upperCase);
                sb.append('/');
                sb.append(1);
                sb.append('.');
                sb.append(i3);
                this.c = sb.toString();
                this.i = z;
                this.d = this.c.getBytes(whb.b);
                return;
            }
            throw new IllegalArgumentException("negative minorVersion");
        }
        throw new IllegalArgumentException("empty protocolName");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wen)) {
            return false;
        }
        wen wen = (wen) obj;
        if (this.h == wen.h && this.g == wen.g && this.f.equals(wen.f)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.c;
    }

    public final int hashCode() {
        return (((this.f.hashCode() * 31) + this.g) * 31) + this.h;
    }
}
