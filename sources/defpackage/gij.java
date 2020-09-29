package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.http.wg.WebgateTokenProvider.WebgateTokenException;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* renamed from: gij reason: default package */
public final class gij implements WebgateTokenProvider {
    private final a a;
    private final b b;

    /* renamed from: gij$a */
    static class a {
        private final b a;
        private Optional<TokenResponse> b = Optional.e();

        a(b bVar) {
            this.a = bVar;
        }

        /* access modifiers changed from: 0000 */
        public final synchronized Optional<TokenResponse> a(int i) {
            if (!this.b.b() || ((TokenResponse) this.b.c()).accessToken == null) {
                Optional<TokenResponse> a2 = this.a.a(i, false);
                this.b = a2;
                return a2;
            }
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public final synchronized Optional<TokenResponse> b(int i) {
            Optional<TokenResponse> a2;
            a2 = this.a.a(i, true);
            this.b = a2;
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public final synchronized void a() {
            this.b = Optional.e();
        }
    }

    /* renamed from: gij$b */
    static class b {
        final PublishSubject<gbn> a = PublishSubject.a();
        private final RxResolver b;
        private final ObservableTransformer<Response, TokenResponse> c;
        private final Scheduler d;

        b(RxResolver rxResolver, Scheduler scheduler, ObservableTransformer<Response, TokenResponse> observableTransformer) {
            this.b = rxResolver;
            this.d = scheduler;
            this.c = observableTransformer;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<TokenResponse> a(int i, boolean z) {
            return (Optional) b(i, z).e();
        }

        private Observable<Optional<TokenResponse>> b(int i, boolean z) {
            Object[] objArr = new Object[1];
            objArr[0] = z ? "true" : "false";
            return this.b.resolve(new Request(Request.GET, String.format("sp://webgate/v1/token?renew=%s", objArr))).a(this.c).c((Function<? super T, ? extends R>) $$Lambda$o9rADL2_nr1F3w24_dfXELjJnzk.INSTANCE).g((ObservableSource<U>) this.a).a(0).g($$Lambda$gij$b$ptvO9Tw44FuYD0HqUFogJZYT8ZU.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$gij$b$IZ2KwKPj6dA8KyvxK1l8fBRImI.INSTANCE).a((long) i, TimeUnit.MILLISECONDS, this.d, (SingleSource<? extends T>) Single.b(Optional.e())).d();
        }
    }

    gij(b bVar) {
        this.b = bVar;
        this.a = new a(bVar);
    }

    public final String a(int i) {
        return a(this.a.a(i));
    }

    public final String b(int i) {
        return a(this.a.b(i));
    }

    public final void a() {
        this.b.a.onNext(gbn.a());
        this.a.a();
    }

    private static String a(Optional<TokenResponse> optional) {
        if (optional.b()) {
            TokenResponse tokenResponse = (TokenResponse) optional.c();
            if (tokenResponse.errorCode > 0) {
                Logger.e("sp://webgate/v1/token responded with an error: %d, %s", Integer.valueOf(tokenResponse.errorCode), tokenResponse.errorDescription);
            } else if (tokenResponse.accessToken != null) {
                return tokenResponse.accessToken;
            }
        }
        throw new WebgateTokenException();
    }
}
