package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;

/* renamed from: hxx reason: default package */
public class hxx {
    public final Flowable<SessionState> a = Observable.a((ObservableOnSubscribe<T>) this.b).a(BackpressureStrategy.LATEST);
    public final vve<SessionState> b;

    public hxx(RxResolver rxResolver, rwl rwl, Scheduler scheduler, Scheduler scheduler2) {
        this.b = new vve<>(hxx.class.getSimpleName(), rxResolver.resolve(new Request(Request.SUB, "sp://orbitsession/v1/state")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(SessionState.class, rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), scheduler)).a(Functions.a()).a(1).a().a(scheduler2));
    }
}
