package defpackage;

import java.util.Map;

/* renamed from: jxj reason: default package */
final class jxj extends jya {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final Map<String, String> e;

    jxj(String str, boolean z, boolean z2, String str2, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            if (str2 != null) {
                this.d = str2;
                if (map != null) {
                    this.e = map;
                    return;
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null mediaUrl");
        }
        throw new NullPointerException("Null sessionId");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Map<String, String> e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackIdentity{sessionId=");
        sb.append(this.a);
        sb.append(", isAudioOnlyAllowed=");
        sb.append(this.b);
        sb.append(", isRoyaltyMedia=");
        sb.append(this.c);
        sb.append(", mediaUrl=");
        sb.append(this.d);
        sb.append(", metadata=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jya) {
            jya jya = (jya) obj;
            return this.a.equals(jya.a()) && this.b == jya.b() && this.c == jya.c() && this.d.equals(jya.d()) && this.e.equals(jya.e());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
