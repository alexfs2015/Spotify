package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: lml reason: default package */
public final class lml implements wig<ObservableTransformer<Response, TokenResponse>> {
    private final wzi<ObjectMapper> a;
    private final wzi<Scheduler> b;

    private lml(wzi<ObjectMapper> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lml a(wzi<ObjectMapper> wzi, wzi<Scheduler> wzi2) {
        return new lml(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ObservableTransformer) wil.a(JacksonResponseParser.forClass(TokenResponse.class, (ObjectMapper) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
