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

/* renamed from: hxs reason: default package */
public final class hxs {
    private final jtz a;
    private final Observable<ServerTime> b;

    hxs(RxResolver rxResolver, jtz jtz, ObjectMapper objectMapper, Scheduler scheduler) {
        this(rxResolver.resolve(new Request(Request.SUB, "sp://orbitsession/v1/server-time")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(ServerTime.class, objectMapper, scheduler)).a(Functions.a()).a(1).a(), jtz);
    }

    private hxs(Observable<ServerTime> observable, jtz jtz) {
        this.b = observable;
        this.a = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(long j, long j2) {
        return j > 0 ? Optional.b(Long.valueOf(j + ((this.a.a() - j2) / 1000))) : Optional.e();
    }

    /* access modifiers changed from: 0000 */
    public final hxr a(ServerTime serverTime) {
        $$Lambda$hxs$AkKfd7Ln0sowInysgohXPnuWZnU r0 = new $$Lambda$hxs$AkKfd7Ln0sowInysgohXPnuWZnU(this, serverTime.currentServerTime(), serverTime.currentTimeMillis());
        return r0;
    }

    public final Observable<hxr> a() {
        return this.b.c((Function<? super T, ? extends R>) new $$Lambda$6w21VIij_6xSG7bDDr38uUzfMt8<Object,Object>(this));
    }
}
