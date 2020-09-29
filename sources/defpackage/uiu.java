package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.ParserException;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Collections;

/* renamed from: uiu reason: default package */
public final class uiu {
    private final RxResolver a;
    private final ObjectMapper b;

    public uiu(RxResolver rxResolver, rwl rwl) {
        this.a = rxResolver;
        this.b = rwl.a().a();
    }

    private <T> Observable<T> a(String str, String str2, Class<T> cls) {
        RxResolver rxResolver = this.a;
        StringBuilder sb = new StringBuilder("sp://prefs/v1/");
        sb.append(str2);
        return rxResolver.resolve(new Request(str, sb.toString())).c((Function<? super T, ? extends R>) new $$Lambda$uiu$77bwgUwgg2RRvYEGrIPPKowJCHU<Object,Object>(this, str2, cls));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object a(String str, Class cls, Response response) {
        try {
            return this.b.convertValue(((JsonNode) this.b.readValue(response.getBody(), JsonNode.class)).get(str), cls);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final Observable<Response> a(JacksonModel jacksonModel) {
        try {
            return this.a.resolve(new Request(Request.PUT, "sp://prefs/v1", Collections.emptyMap(), JacksonSerializer.toBytes(jacksonModel)));
        } catch (ParserException e) {
            return Observable.a((Throwable) e);
        }
    }

    public final <T> Observable<T> a(String str, Class<T> cls) {
        return a(Request.GET, str, cls);
    }

    public final <T> Observable<T> b(String str, Class<T> cls) {
        return a(Request.SUB, str, cls);
    }
}
