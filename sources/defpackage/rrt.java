package defpackage;

import java.util.List;

/* renamed from: rrt reason: default package */
final class rrt extends rry {
    private final List<rrz> a;
    private final int b;
    private final String c;
    private final String d;

    rrt(List<rrz> list, int i, String str, String str2) {
        if (list != null) {
            this.a = list;
            this.b = i;
            this.c = str;
            this.d = str2;
            return;
        }
        throw new NullPointerException("Null stories");
    }

    public final List<rrz> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesResponse{stories=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", after=");
        sb.append(this.c);
        sb.append(", nextUrl=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rry) {
            rry rry = (rry) obj;
            if (this.a.equals(rry.a()) && this.b == rry.b()) {
                String str = this.c;
                if (str != null ? str.equals(rry.c()) : rry.c() == null) {
                    String str2 = this.d;
                    return str2 != null ? str2.equals(rry.d()) : rry.d() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
