package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.sso.bakery.Cookie;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: jen reason: default package */
public final class jen {
    private final RxResolver a;
    private final ObservableTransformer<Response, Cookie> b;
    private final Scheduler c;

    public jen(RxResolver rxResolver, ObjectMapper objectMapper, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = JacksonResponseParser.forClass(Cookie.class, objectMapper, scheduler);
        this.c = scheduler;
    }

    public final Observable<HttpCookie> a() {
        Observable resolve = this.a.resolve(new Request(Request.GET, "hm://bakery/accountscookie"));
        vio vio = new vio(5, 5, 1000, this.c);
        return resolve.a((ObservableTransformer<? super T, ? extends R>) vio).a(this.b).c((Function<? super T, ? extends R>) $$Lambda$jen$8_tS_lWmm0WPfQRcNmEDF_aXC7U.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static HttpCookie a(Cookie cookie) {
        HttpCookie httpCookie = new HttpCookie(cookie.name, cookie.value);
        httpCookie.setDomain(cookie.domain);
        httpCookie.setMaxAge((long) cookie.maxAge);
        httpCookie.setSecure(cookie.secure);
        return httpCookie;
    }
}
