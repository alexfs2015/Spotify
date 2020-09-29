package defpackage;

import com.spotify.http.wg.TokenResponse;
import io.reactivex.Single;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: wcj reason: default package */
public final class wcj implements wci {
    private final jtz a;
    private volatile a b;

    public wcj(jtz jtz) {
        this.a = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TokenResponse b() {
        if (this.b != null) {
            if (!(this.a.a() >= this.b.b())) {
                return this.b.a();
            }
        }
        throw new IllegalStateException("No token found in cache");
    }

    public final Single<TokenResponse> a() {
        return Single.a((Callable<? extends T>) new $$Lambda$wcj$hlVroLu_KrjryENifOCpNcqBk7c<Object>(this));
    }

    public final void a(TokenResponse tokenResponse) {
        this.b = new wcm(tokenResponse, this.a.a() + TimeUnit.SECONDS.toMillis((long) tokenResponse.expiresIn));
    }
}
