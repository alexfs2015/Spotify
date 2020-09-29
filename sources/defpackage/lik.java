package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: lik reason: default package */
public final class lik implements vua<ObservableTransformer<Response, TokenResponse>> {
    private final wlc<ObjectMapper> a;
    private final wlc<Scheduler> b;

    private lik(wlc<ObjectMapper> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lik a(wlc<ObjectMapper> wlc, wlc<Scheduler> wlc2) {
        return new lik(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ObservableTransformer) vuf.a(JacksonResponseParser.forClass(TokenResponse.class, (ObjectMapper) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
