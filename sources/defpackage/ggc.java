package defpackage;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
import com.spotify.messages.EventSenderStats;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ggc reason: default package */
public final class ggc implements gfp {
    private static long a = TimeUnit.MINUTES.toMillis(5);
    private final gha b;
    private final b c;
    private final a d;
    private final gfd e;
    private final defpackage.gfp.a f;
    private AtomicLong g = new AtomicLong(0);

    /* renamed from: ggc$a */
    static class a implements Function<EventSenderStats, gff> {
        private final ggs a;
        private final ggx b;
        private final ggj c;

        a(ggj ggj, ggs ggs, ggx ggx) {
            this.c = ggj;
            this.a = ggs;
            this.b = ggx;
        }

        /* renamed from: a */
        public final gff apply(EventSenderStats eventSenderStats) {
            String str = "EventSenderStats";
            long a2 = gga.a(this.b, str);
            this.b.a(new ggw(str, 1 + a2));
            return new a().a(-100).a(str).a((Iterable<Pair<String, ByteString>>) fcp.a((Iterable<E>) this.c.a()).a((com.google.common.base.Function<? super E, T>) $$Lambda$ggc$a$DuzwUF9PbByqBhAads19dGNac8U.INSTANCE).b((E[]) new Pair[]{Pair.create("message", ByteString.a(eventSenderStats.b()))})).a(ByteString.a(this.a.a())).b(a2).a();
        }
    }

    /* renamed from: ggc$b */
    static class b implements Function<List<ggz>, EventSenderStats> {
        b() {
        }

        public static EventSenderStats a(List<ggz> list) {
            com.spotify.messages.EventSenderStats.a k = EventSenderStats.k();
            for (ggz ggz : list) {
                if (ggz.b != null) {
                    k.b(ggz.a, ggz.b.longValue());
                } else {
                    k.b(ggz.a, ggz.c.longValue());
                }
                k.a(ggz.a, ggz.d.longValue());
                k.c(ggz.a, ggz.c.longValue());
            }
            return (EventSenderStats) k.g();
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    ggc(gha gha, ggs ggs, ggx ggx, ggj ggj, gfd gfd, defpackage.gfp.a aVar) {
        this.b = gha;
        this.e = gfd;
        this.f = aVar;
        this.c = new b();
        this.d = new a(ggj, ggs, ggx);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ggz ggz) {
        return !ggz.a.equals("EventSenderStats");
    }

    public final List<gff> a() {
        if (this.e.a() - this.g.get() < a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.d.apply(b.a(ImmutableList.a(fcp.a((Iterable<E>) this.b.a()).a((fbq<? super E>) $$Lambda$ggc$YoMEAJugIERsJmxU20bCwlY9Cg8.INSTANCE).a()))));
    }

    public final void a(Set<Long> set) {
        if (set.size() > 0) {
            this.g.set(this.e.a());
        }
    }

    public final defpackage.gfp.a b() {
        return this.f;
    }
}
