package defpackage;

import okio.ByteString;

/* renamed from: xbq reason: default package */
public final class xbq {
    public static final ByteString a = ByteString.a(":");
    public static final ByteString b = ByteString.a(":status");
    public static final ByteString c = ByteString.a(":method");
    public static final ByteString d = ByteString.a(":path");
    public static final ByteString e = ByteString.a(":scheme");
    public static final ByteString f = ByteString.a(":authority");
    public final ByteString g;
    public final ByteString h;
    final int i;

    /* renamed from: xbq$a */
    interface a {
    }

    public xbq(String str, String str2) {
        this(ByteString.a(str), ByteString.a(str2));
    }

    public xbq(ByteString byteString, String str) {
        this(byteString, ByteString.a(str));
    }

    public xbq(ByteString byteString, ByteString byteString2) {
        this.g = byteString;
        this.h = byteString2;
        this.i = byteString.h() + 32 + byteString2.h();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xbq) {
            xbq xbq = (xbq) obj;
            if (this.g.equals(xbq.g) && this.h.equals(xbq.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return xaq.a("%s: %s", this.g.a(), this.h.a());
    }
}
