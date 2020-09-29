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

/* renamed from: hvl reason: default package */
public class hvl {
    public final Flowable<SessionState> a = Observable.a((ObservableOnSubscribe<T>) this.b).a(BackpressureStrategy.LATEST);
    public final vhz<SessionState> b;

    public hvl(RxResolver rxResolver, rnf rnf, Scheduler scheduler, Scheduler scheduler2) {
        this.b = new vhz<>(hvl.class.getSimpleName(), rxResolver.resolve(new Request(Request.SUB, "sp://orbitsession/v1/state")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(SessionState.class, rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), scheduler)).a(Functions.a()).a(1).a().a(scheduler2));
    }
}
