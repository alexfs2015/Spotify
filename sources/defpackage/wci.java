package defpackage;

import com.spotify.http.wg.TokenResponse;
import io.reactivex.Single;

/* renamed from: wci reason: default package */
public interface wci {

    /* renamed from: wci$a */
    public static abstract class a {
        public abstract TokenResponse a();

        /* access modifiers changed from: 0000 */
        public abstract long b();
    }

    Single<TokenResponse> a();

    void a(TokenResponse tokenResponse);
}
