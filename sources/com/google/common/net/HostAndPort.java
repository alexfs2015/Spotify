package com.google.common.net;

import java.io.Serializable;
import java.util.Arrays;

public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    public final String host;
    private final int port;

    private static boolean a(int i) {
        return i >= 0 && i <= 65535;
    }

    private HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    private boolean b() {
        return this.port >= 0;
    }

    public final int a() {
        fay.b(b());
        return this.port;
    }

    public static HostAndPort a(String str, int i) {
        fay.a(a(i), "Port out of range: %s", i);
        HostAndPort a = a(str);
        fay.a(!a.b(), "Host has a port: %s", (Object) str);
        return new HostAndPort(a.host, i, a.hasBracketlessColons);
    }

    public static HostAndPort a(String str) {
        String str2;
        String str3;
        String[] strArr;
        fay.a(str);
        int i = -1;
        boolean z = false;
        if (str.startsWith("[")) {
            fay.a(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", (Object) str);
            int indexOf = str.indexOf(58);
            int lastIndexOf = str.lastIndexOf(93);
            fay.a(indexOf >= 0 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", (Object) str);
            String substring = str.substring(1, lastIndexOf);
            int i2 = lastIndexOf + 1;
            if (i2 == str.length()) {
                strArr = new String[]{substring, ""};
            } else {
                fay.a(str.charAt(i2) == ':', "Only a colon may follow a close bracket: %s", (Object) str);
                int i3 = lastIndexOf + 2;
                for (int i4 = i3; i4 < str.length(); i4++) {
                    fay.a(Character.isDigit(str.charAt(i4)), "Port must be numeric: %s", (Object) str);
                }
                strArr = new String[]{substring, str.substring(i3)};
            }
            str3 = strArr[0];
            str2 = strArr[1];
        } else {
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0) {
                int i5 = indexOf2 + 1;
                if (str.indexOf(58, i5) == -1) {
                    str3 = str.substring(0, indexOf2);
                    str2 = str.substring(i5);
                }
            }
            if (indexOf2 >= 0) {
                z = true;
            }
            str2 = null;
            str3 = str;
        }
        if (!fax.a(str2)) {
            fay.a(!str2.startsWith("+"), "Unparseable port number: %s", (Object) str);
            try {
                i = Integer.parseInt(str2);
                fay.a(a(i), "Port number out of range: %s", (Object) str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder("Unparseable port number: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new HostAndPort(str3, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            return faw.a(this.host, hostAndPort.host) && this.port == hostAndPort.port;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.host, Integer.valueOf(this.port)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (b()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }
}
