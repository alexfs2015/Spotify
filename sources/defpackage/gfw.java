package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.DiscreteDomain.IntegerDomain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import com.spotify.eventsender.gabo.PublishEventsResponse.EventError;
import java.util.List;
import java.util.Set;

/* renamed from: gfw reason: default package */
public final class gfw implements gdx {
    private final gfx a;
    private final gfy b;
    private final gej c;

    public gfw(gfx gfx, gfy gfy, gej gej) {
        this.a = gfx;
        this.b = gfy;
        this.c = gej;
    }

    public final ged a(List<gdu> list) {
        return a(list.size(), this.a.a(c(list)).a());
    }

    public final ged b(List<gdu> list) {
        return a(list.size(), this.a.b(c(list)).a());
    }

    private static Set<Integer> a(int i, List<EventError> list) {
        return Sets.a((Set<E>) ContiguousSet.a(Range.b(Integer.valueOf(0), Integer.valueOf(i)), (DiscreteDomain<C>) IntegerDomain.a), (Set<?>) ImmutableSet.a(fbx.a((Iterable<E>) list).a((faz<? super E>) $$Lambda$gfw$pZ1JN7L2Z4_ADxbCp2Q7LF5f3vs.INSTANCE).a((Function<? super E, T>) $$Lambda$gfw$z5Cu2yIvJaJhLPkcCPMEZ68hvM.INSTANCE).a()));
    }

    private PublishEventsRequest c(List<gdu> list) {
        gfy gfy = this.b;
        gfy.getClass();
        return (PublishEventsRequest) PublishEventsRequest.k().a(a(list, (Function<I, T>) new $$Lambda$6BIxkDhJe5ulnVL9wyKt0FCExTs<I,T>(gfy))).g();
    }

    private static <I, T> List<T> a(List<I> list, Function<I, T> function) {
        return ImmutableList.a(fbx.a((Iterable<E>) list).a(function).a());
    }

    private ged a(int i, wsj<PublishEventsResponse> wsj) {
        int i2 = wsj.a.c;
        PublishEventsResponse publishEventsResponse = (PublishEventsResponse) wsj.b();
        boolean z = true;
        if (i2 != 200 || publishEventsResponse == null) {
            new StringBuilder("Recieved error code: ").append(i2);
            return ged.c().a(true).a();
        }
        a a2 = ged.c().a(a(i, (List<EventError>) publishEventsResponse.d));
        if (wsj.a.f.a("Spotify-Back-Off") == null) {
            z = false;
        }
        return a2.a(z).a();
    }
}
