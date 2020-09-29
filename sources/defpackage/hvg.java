package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.service.session.ServerTime;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: hvg reason: default package */
public final class hvg {
    private final jrp a;
    private final Observable<ServerTime> b;

    hvg(RxResolver rxResolver, jrp jrp, ObjectMapper objectMapper, Scheduler scheduler) {
        this(rxResolver.resolve(new Request(Request.SUB, "sp://orbitsession/v1/server-time")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(ServerTime.class, objectMapper, scheduler)).a(Functions.a()).a(1).a(), jrp);
    }

    private hvg(Observable<ServerTime> observable, jrp jrp) {
        this.b = observable;
        this.a = jrp;
    }

    public final Observable<hvf> a() {
        return this.b.c((Function<? super T, ? extends R>) new $$Lambda$jCieDB4TTQfCpPN5hO3rcdUwKAk<Object,Object>(this));
    }

    /* access modifiers changed from: 0000 */
    public final hvf a(ServerTime serverTime) {
        $$Lambda$hvg$lgAI0ElCos3yKRrMxNZhdLO3DHs r0 = new $$Lambda$hvg$lgAI0ElCos3yKRrMxNZhdLO3DHs(this, serverTime.currentServerTime(), serverTime.currentTimeMillis());
        return r0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(long j, long j2) {
        if (j > 0) {
            return Optional.b(Long.valueOf(j + ((this.a.a() - j2) / 1000)));
        }
        return Optional.e();
    }
}
