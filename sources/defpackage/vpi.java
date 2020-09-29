package defpackage;

import com.spotify.http.wg.TokenResponse;
import io.reactivex.Single;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: vpi reason: default package */
public final class vpi implements vph {
    private final jrp a;
    private volatile a b;

    public vpi(jrp jrp) {
        this.a = jrp;
    }

    public final Single<TokenResponse> a() {
        return Single.a((Callable<? extends T>) new $$Lambda$vpi$xm2gvQHcN3mRfpkLC2KgyE7p6Yk<Object>(this));
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

    public final void a(TokenResponse tokenResponse) {
        this.b = new vpl(tokenResponse, this.a.a() + TimeUnit.SECONDS.toMillis((long) tokenResponse.expiresIn));
    }
}
