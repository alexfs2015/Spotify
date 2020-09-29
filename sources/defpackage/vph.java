package defpackage;

import com.spotify.http.wg.TokenResponse;
import io.reactivex.Single;

/* renamed from: vph reason: default package */
public interface vph {

    /* renamed from: vph$a */
    public static abstract class a {
        public abstract TokenResponse a();

        /* access modifiers changed from: 0000 */
        public abstract long b();
    }

    Single<TokenResponse> a();

    void a(TokenResponse tokenResponse);
}
