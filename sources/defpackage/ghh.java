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

/* renamed from: ghh reason: default package */
public final class ghh implements gfi {
    private final ghi a;
    private final ghj b;
    private final gfu c;

    public ghh(ghi ghi, ghj ghj, gfu gfu) {
        this.a = ghi;
        this.b = ghj;
        this.c = gfu;
    }

    private gfo a(int i, xgo<PublishEventsResponse> xgo) {
        int i2 = xgo.a.c;
        PublishEventsResponse publishEventsResponse = (PublishEventsResponse) xgo.b();
        boolean z = true;
        if (i2 != 200 || publishEventsResponse == null) {
            new StringBuilder("Recieved error code: ").append(i2);
            return gfo.c().a(true).a();
        }
        a a2 = gfo.c().a(a(i, (List<EventError>) publishEventsResponse.d));
        if (xgo.a.f.a("Spotify-Back-Off") == null) {
            z = false;
        }
        return a2.a(z).a();
    }

    private static <I, T> List<T> a(List<I> list, Function<I, T> function) {
        return ImmutableList.a(fcp.a((Iterable<E>) list).a(function).a());
    }

    private static Set<Integer> a(int i, List<EventError> list) {
        return Sets.a((Set<E>) ContiguousSet.a(Range.b(Integer.valueOf(0), Integer.valueOf(i)), (DiscreteDomain<C>) IntegerDomain.a), (Set<?>) ImmutableSet.a(fcp.a((Iterable<E>) list).a((fbq<? super E>) $$Lambda$ghh$pOgKU6ATvDPyy9aFlXxZy3PhU0w.INSTANCE).a((Function<? super E, T>) $$Lambda$ghh$_8Oizp3cqU_erl6Oe8GinyqT5bk.INSTANCE).a()));
    }

    private PublishEventsRequest c(List<gff> list) {
        ghj ghj = this.b;
        ghj.getClass();
        return (PublishEventsRequest) PublishEventsRequest.k().a(a(list, (Function<I, T>) new $$Lambda$DXQYrtEEzAzyL7AO4aJPhQSARU<I,T>(ghj))).g();
    }

    public final gfo a(List<gff> list) {
        return a(list.size(), this.a.a(c(list)).a());
    }

    public final gfo b(List<gff> list) {
        return a(list.size(), this.a.b(c(list)).a());
    }
}
