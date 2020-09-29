package defpackage;

import com.spotify.core.http.HttpConnection;

/* renamed from: wel reason: default package */
public final class wel implements Comparable<wel> {
    public static final wel a = a(100, "Continue");
    public final int b;
    private final wgw c;
    private final String d;
    private final byte[] e;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((wel) obj).b;
    }

    static {
        a(101, "Switching Protocols");
        a(102, "Processing");
        a(200, "OK");
        a(201, "Created");
        a(202, "Accepted");
        a(203, "Non-Authoritative Information");
        a(204, "No Content");
        a(205, "Reset Content");
        a(206, "Partial Content");
        a(207, "Multi-Status");
        a(300, "Multiple Choices");
        a(HttpConnection.kErrorHttpConnectTimeout, "Moved Permanently");
        a(HttpConnection.kErrorHttpConnectFail, "Found");
        a(HttpConnection.kErrorHttpInvalidUrl, "See Other");
        a(HttpConnection.kErrorHttpBadReply, "Not Modified");
        a(HttpConnection.kErrorHttpBadRange, "Use Proxy");
        a(HttpConnection.kErrorHttpBadTransferEncoding, "Temporary Redirect");
        a(400, "Bad Request");
        a(401, "Unauthorized");
        a(402, "Payment Required");
        a(403, "Forbidden");
        a(404, "Not Found");
        a(405, "Method Not Allowed");
        a(406, "Not Acceptable");
        a(407, "Proxy Authentication Required");
        a(408, "Request Timeout");
        a(409, "Conflict");
        a(410, "Gone");
        a(411, "Length Required");
        a(412, "Precondition Failed");
        a(413, "Request Entity Too Large");
        a(414, "Request-URI Too Long");
        a(415, "Unsupported Media Type");
        a(416, "Requested Range Not Satisfiable");
        a(417, "Expectation Failed");
        a(421, "Misdirected Request");
        a(422, "Unprocessable Entity");
        a(423, "Locked");
        a(424, "Failed Dependency");
        a(425, "Unordered Collection");
        a(426, "Upgrade Required");
        a(428, "Precondition Required");
        a(429, "Too Many Requests");
        a(431, "Request Header Fields Too Large");
        a(500, "Internal Server Error");
        a(501, "Not Implemented");
        a(502, "Bad Gateway");
        a(503, "Service Unavailable");
        a(504, "Gateway Timeout");
        a(505, "HTTP Version Not Supported");
        a(506, "Variant Also Negotiates");
        a(507, "Insufficient Storage");
        a(510, "Not Extended");
        a(511, "Network Authentication Required");
    }

    private static wel a(int i, String str) {
        return new wel(i, str, true);
    }

    public wel(int i, String str) {
        this(i, str, false);
    }

    private wel(int i, String str, boolean z) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("code: ");
            sb.append(i);
            sb.append(" (expected: 0+)");
            throw new IllegalArgumentException(sb.toString());
        } else if (str != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt == 10 || charAt == 13) {
                    StringBuilder sb2 = new StringBuilder("reasonPhrase contains one of the following prohibited characters: \\r\\n: ");
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            this.b = i;
            this.c = new wgw(Integer.toString(i));
            this.d = str;
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(" ");
                sb3.append(str);
                this.e = sb3.toString().getBytes(whb.b);
                return;
            }
            this.e = null;
        } else {
            throw new NullPointerException("reasonPhrase");
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wel) && this.b == ((wel) obj).b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.d.length() + 5);
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.d);
        return sb.toString();
    }

    public final int hashCode() {
        return this.b;
    }
}
