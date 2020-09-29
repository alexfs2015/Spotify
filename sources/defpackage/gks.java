package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.libs.connect.volume.VolumeState;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Predicate;

/* renamed from: gks reason: default package */
final class gks implements gkr {
    private final RxResolver a;
    private final ObjectMapper b;
    private final Scheduler c;

    public gks(RxResolver rxResolver, ObjectMapper objectMapper, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = objectMapper;
        this.c = scheduler;
    }

    public final Completable a(Float f) {
        try {
            return this.a.resolveCompletable(RequestBuilder.put("sp://playback/v1/volume", new VolumeState(false, f)).build());
        } catch (Exception e) {
            return Completable.a((Throwable) e);
        }
    }

    public final Observable<VolumeState> a() {
        return this.a.resolve(RequestBuilder.subscribe("sp://playback/v1/volume").build()).a((Predicate<? super T>) $$Lambda$gks$lcWOW31kMiCRHf2zx5_wy0Om6s.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(VolumeState.class, this.b, this.c));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Response response) {
        return response.getBody().length > 0;
    }
}
