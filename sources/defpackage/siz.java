package defpackage;

import com.spotify.searchview.proto.MainViewResponse;

/* renamed from: siz reason: default package */
final class siz extends sjh {
    private final String a;
    private final String b;
    private final MainViewResponse c;

    siz(String str, String str2, MainViewResponse mainViewResponse) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (mainViewResponse != null) {
                    this.c = mainViewResponse;
                    return;
                }
                throw new NullPointerException("Null result");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final MainViewResponse c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjh) {
            sjh sjh = (sjh) obj;
            return this.a.equals(sjh.a()) && this.b.equals(sjh.b()) && this.c.equals(sjh.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchMainResponse{requestId=");
        sb.append(this.a);
        sb.append(", query=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
