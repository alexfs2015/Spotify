package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException;
import com.spotify.mobile.android.cosmos.parser.JsonParser;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: gkz reason: default package */
public final class gkz {
    private final RxResolver a;
    private final wug b;
    private final ObjectMapper c;

    public gkz(RxResolver rxResolver, wug wug, rnf rnf) {
        this.a = rxResolver;
        this.b = wug;
        this.c = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final <T extends JacksonModel> gky<T> a(Class<T> cls) {
        return a(cls, this.c);
    }

    public final <T extends JacksonModel> gky<T> a(Class<T> cls, ObjectMapper objectMapper) {
        return new $$Lambda$gkz$sQwqDjEjTJcamn2DvR3hwA8EiY(this, new JsonParser(cls, objectMapper));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(JsonParser jsonParser, Request request) {
        return vun.a((ObservableSource<T>) this.a.resolve(request), BackpressureStrategy.LATEST).a(this.b).f(new $$Lambda$gkz$ITjnb6bCTkhnuaLkaZauTHiaS_w(jsonParser));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JacksonModel a(JsonParser jsonParser, Response response) {
        try {
            return jsonParser.parseResponse(response);
        } catch (ParserException e) {
            throw new RuntimeException(e);
        }
    }
}
