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

/* renamed from: gju reason: default package */
public final class gju implements WebgateTokenProvider {
    private final a a;
    private final b b;

    /* renamed from: gju$a */
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
        public final synchronized void a() {
            this.b = Optional.e();
        }

        /* access modifiers changed from: 0000 */
        public final synchronized Optional<TokenResponse> b(int i) {
            Optional<TokenResponse> a2;
            a2 = this.a.a(i, true);
            this.b = a2;
            return a2;
        }
    }

    /* renamed from: gju$b */
    static class b {
        final PublishSubject<gcl> a = PublishSubject.a();
        private final RxResolver b;
        private final ObservableTransformer<Response, TokenResponse> c;
        private final Scheduler d;

        b(RxResolver rxResolver, Scheduler scheduler, ObservableTransformer<Response, TokenResponse> observableTransformer) {
            this.b = rxResolver;
            this.d = scheduler;
            this.c = observableTransformer;
        }

        private Observable<Optional<TokenResponse>> b(int i, boolean z) {
            Object[] objArr = new Object[1];
            objArr[0] = z ? "true" : "false";
            return this.b.resolve(new Request(Request.GET, String.format("sp://webgate/v1/token?renew=%s", objArr))).a(this.c).c((Function<? super T, ? extends R>) $$Lambda$o9rADL2_nr1F3w24_dfXELjJnzk.INSTANCE).g((ObservableSource<U>) this.a).a(0).g($$Lambda$gju$b$IWHrSUGL28ThbQ6A0qXOhXBphGY.INSTANCE).c((Consumer<? super Throwable>) $$Lambda$gju$b$mftzkTJbSrjnKPRYrND6e2FSVBY.INSTANCE).a((long) i, TimeUnit.MILLISECONDS, this.d, (SingleSource<? extends T>) Single.b(Optional.e())).d();
        }

        /* access modifiers changed from: 0000 */
        public final Optional<TokenResponse> a(int i, boolean z) {
            return (Optional) b(i, z).e();
        }
    }

    gju(b bVar) {
        this.b = bVar;
        this.a = new a(bVar);
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

    public final String a(int i) {
        return a(this.a.a(i));
    }

    public final void a() {
        this.b.a.onNext(gcl.a());
        this.a.a();
    }

    public final String b(int i) {
        return a(this.a.b(i));
    }
}
