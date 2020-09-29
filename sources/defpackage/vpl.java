package defpackage;

import com.spotify.http.wg.TokenResponse;

/* renamed from: vpl reason: default package */
final class vpl extends a {
    private final TokenResponse a;
    private final long b;

    vpl(TokenResponse tokenResponse, long j) {
        if (tokenResponse != null) {
            this.a = tokenResponse;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null token");
    }

    public final TokenResponse a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final long b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimedTokenResponse{token=");
        sb.append(this.a);
        sb.append(", expiryTimeMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b();
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }
}
