package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.video.endvideo.LogParameters;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.Collections;

/* renamed from: jzs reason: default package */
public final class jzs {
    final ObjectMapper a;
    final Scheduler b;
    private final RxResolver c;

    public jzs(RxResolver rxResolver, rnf rnf, Scheduler scheduler) {
        this.c = rxResolver;
        this.a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_NULL).a();
        this.b = scheduler;
    }

    /* access modifiers changed from: 0000 */
    public Observable<Response> a(String str, LogParameters logParameters) {
        try {
            byte[] writeValueAsBytes = this.a.writeValueAsBytes(logParameters);
            return this.c.resolve(new Request(Request.POST, String.format("sp://logging/v3/%s", new Object[]{str}), Collections.emptyMap(), writeValueAsBytes));
        } catch (JsonProcessingException e) {
            throw new AssertionError(e);
        }
    }
}
