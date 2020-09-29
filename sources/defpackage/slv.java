package defpackage;

import com.spotify.searchview.proto.MainViewResponse;

/* renamed from: slv reason: default package */
public final class slv extends smc {
    private final String a;
    private final MainViewResponse b;

    public slv(String str, MainViewResponse mainViewResponse) {
        if (str != null) {
            this.a = str;
            if (mainViewResponse != null) {
                this.b = mainViewResponse;
                return;
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null requestId");
    }

    public final String a() {
        return this.a;
    }

    public final MainViewResponse b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smc) {
            smc smc = (smc) obj;
            return this.a.equals(smc.a()) && this.b.equals(smc.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResponse{requestId=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
