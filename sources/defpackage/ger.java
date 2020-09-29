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

/* renamed from: ger reason: default package */
public final class ger implements gee {
    private static long a = TimeUnit.MINUTES.toMillis(5);
    private final gfp b;
    private final b c;
    private final a d;
    private final gds e;
    private final defpackage.gee.a f;
    private AtomicLong g = new AtomicLong(0);

    /* renamed from: ger$a */
    static class a implements Function<EventSenderStats, gdu> {
        private final gfh a;
        private final gfm b;
        private final gey c;

        a(gey gey, gfh gfh, gfm gfm) {
            this.c = gey;
            this.a = gfh;
            this.b = gfm;
        }

        /* renamed from: a */
        public final gdu apply(EventSenderStats eventSenderStats) {
            String str = "EventSenderStats";
            long a2 = gep.a(this.b, str);
            this.b.a(new gfl(str, 1 + a2));
            return new a().a(-100).a(str).a((Iterable<Pair<String, ByteString>>) fbx.a((Iterable<E>) this.c.a()).a((com.google.common.base.Function<? super E, T>) $$Lambda$ger$a$gLLkP2raHFZvMW_TGdqTMbU8o4.INSTANCE).b((E[]) new Pair[]{Pair.create("message", ByteString.a(eventSenderStats.b()))})).a(ByteString.a(this.a.a())).b(a2).a();
        }
    }

    /* renamed from: ger$b */
    static class b implements Function<List<gfo>, EventSenderStats> {
        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }

        b() {
        }

        public static EventSenderStats a(List<gfo> list) {
            com.spotify.messages.EventSenderStats.a k = EventSenderStats.k();
            for (gfo gfo : list) {
                if (gfo.b != null) {
                    k.b(gfo.a, gfo.b.longValue());
                } else {
                    k.b(gfo.a, gfo.c.longValue());
                }
                k.a(gfo.a, gfo.d.longValue());
                k.c(gfo.a, gfo.c.longValue());
            }
            return (EventSenderStats) k.g();
        }
    }

    ger(gfp gfp, gfh gfh, gfm gfm, gey gey, gds gds, defpackage.gee.a aVar) {
        this.b = gfp;
        this.e = gds;
        this.f = aVar;
        this.c = new b();
        this.d = new a(gey, gfh, gfm);
    }

    public final List<gdu> a() {
        if (this.e.a() - this.g.get() < a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.d.apply(b.a(ImmutableList.a(fbx.a((Iterable<E>) this.b.a()).a((faz<? super E>) $$Lambda$ger$_0Zd9OpWpJuRj8sRzDpjsdOlDSU.INSTANCE).a()))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(gfo gfo) {
        return !gfo.a.equals("EventSenderStats");
    }

    public final void a(Set<Long> set) {
        if (set.size() > 0) {
            this.g.set(this.e.a());
        }
    }

    public final defpackage.gee.a b() {
        return this.f;
    }
}
