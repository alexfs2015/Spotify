package defpackage;

import okio.ByteString;

/* renamed from: wnk reason: default package */
public final class wnk {
    public static final ByteString a = ByteString.a(":");
    public static final ByteString b = ByteString.a(":status");
    public static final ByteString c = ByteString.a(":method");
    public static final ByteString d = ByteString.a(":path");
    public static final ByteString e = ByteString.a(":scheme");
    public static final ByteString f = ByteString.a(":authority");
    public final ByteString g;
    public final ByteString h;
    final int i;

    /* renamed from: wnk$a */
    interface a {
    }

    public wnk(String str, String str2) {
        this(ByteString.a(str), ByteString.a(str2));
    }

    public wnk(ByteString byteString, String str) {
        this(byteString, ByteString.a(str));
    }

    public wnk(ByteString byteString, ByteString byteString2) {
        this.g = byteString;
        this.h = byteString2;
        this.i = byteString.h() + 32 + byteString2.h();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wnk) {
            wnk wnk = (wnk) obj;
            if (this.g.equals(wnk.g) && this.h.equals(wnk.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return wmk.a("%s: %s", this.g.a(), this.h.a());
    }
}
