package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wst reason: default package */
public final class wst implements Comparable<wst> {
    public static final wst a;
    public static final wst b;
    private static final Pattern e = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");
    final String c;
    final byte[] d;
    private final String f;
    private final int g;
    private final int h;
    private final boolean i;

    static {
        wst wst = new wst("HTTP", 1, 0, false, true);
        a = wst;
        wst wst2 = new wst("HTTP", 1, 1, true, true);
        b = wst2;
    }

    private wst(String str, int i2, int i3, boolean z, boolean z2) {
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
                this.d = this.c.getBytes(wvh.b);
                return;
            }
            throw new IllegalArgumentException("negative minorVersion");
        }
        throw new IllegalArgumentException("empty protocolName");
    }

    private wst(String str, boolean z) {
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

    public static wst a(String str) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                wst wst = "HTTP/1.1".equals(trim) ? b : "HTTP/1.0".equals(trim) ? a : null;
                return wst == null ? new wst(trim, true) : wst;
            }
            throw new IllegalArgumentException("text is empty");
        }
        throw new NullPointerException("text");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wst wst = (wst) obj;
        int compareTo = this.f.compareTo(wst.f);
        if (compareTo != 0) {
            return compareTo;
        }
        int i2 = this.g - wst.g;
        return i2 != 0 ? i2 : this.h - wst.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wst)) {
            return false;
        }
        wst wst = (wst) obj;
        return this.h == wst.h && this.g == wst.g && this.f.equals(wst.f);
    }

    public final int hashCode() {
        return (((this.f.hashCode() * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return this.c;
    }
}
