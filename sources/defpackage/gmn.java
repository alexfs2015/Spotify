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

/* renamed from: gmn reason: default package */
public final class gmn {
    private final RxResolver a;
    private final xil b;
    private final ObjectMapper c;

    public gmn(RxResolver rxResolver, xil xil, rwl rwl) {
        this.a = rxResolver;
        this.b = xil;
        this.c = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JacksonModel a(JsonParser jsonParser, Response response) {
        try {
            return jsonParser.parseResponse(response);
        } catch (ParserException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(JsonParser jsonParser, Request request) {
        return wit.a((ObservableSource<T>) this.a.resolve(request), BackpressureStrategy.LATEST).a(this.b).e((xiy<? super T, ? extends R>) new $$Lambda$gmn$1yyvIpk67sJq2wLS72Fmu8VxWI<Object,Object>(jsonParser));
    }

    public final <T extends JacksonModel> gmm<T> a(Class<T> cls) {
        return a(cls, this.c);
    }

    public final <T extends JacksonModel> gmm<T> a(Class<T> cls, ObjectMapper objectMapper) {
        return new $$Lambda$gmn$jcGhqxe9I0PqqEJGqzQmZrS3mCA(this, new JsonParser(cls, objectMapper));
    }
}
