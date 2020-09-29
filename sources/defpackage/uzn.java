package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.playlist.ondemand.proto.SetRequest;
import com.spotify.playlist.ondemand.proto.TemporaryRequest;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: uzn reason: default package */
public final class uzn implements uzi {
    private static final long a = TimeUnit.HOURS.toMillis(1);
    private Set<a> b;
    private Optional<b> c = Optional.e();
    private final jrp d;
    private final uzj e;
    private final Scheduler f;

    /* renamed from: uzn$a */
    static class a {
        final SpotifyUri a;

        public a(String str) {
            this.a = new SpotifyUri(str);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.a(this.a);
        }
    }

    /* renamed from: uzn$b */
    static class b {
        final a a;
        final long b;

        public b(a aVar, long j) {
            this.a = aVar;
            this.b = j;
        }
    }

    public uzn(jrp jrp, uzj uzj, Scheduler scheduler) {
        this.d = jrp;
        this.e = uzj;
        this.f = scheduler;
    }

    public final boolean a() {
        Set<a> set = this.b;
        return set == null || set.isEmpty();
    }

    @Deprecated
    public final Optional<Boolean> b(String str) {
        if (this.c.b()) {
            b bVar = (b) this.c.c();
            if (new a(str).equals(bVar.a) && bVar.b > this.d.c()) {
                return Optional.b(Boolean.TRUE);
            }
        }
        Set<a> set = this.b;
        if (set == null) {
            return Optional.e();
        }
        return Optional.b(Boolean.valueOf(set.contains(new a(str))));
    }

    public final Set<String> b() {
        Set<a> set = this.b;
        if (set == null) {
            return ImmutableSet.h();
        }
        return ImmutableSet.a(fbx.a((Iterable<E>) set).a((Function<? super E, T>) $$Lambda$uzn$WjN8ca1jto57dCJk2jh2q09XnEY.INSTANCE).a());
    }

    public final Completable a(Set<String> set) {
        return this.e.a((SetRequest) SetRequest.k().a(Lists.a((Iterable<? extends E>) set)).g()).a(this.f).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$uzn$dCSgrSlQg6HA3hVSKMLa2P4BGY<Object>(this, set)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource b(Set set) {
        this.b = ImmutableSet.a(fbx.a((Iterable<E>) set).a((Function<? super E, T>) $$Lambda$jVeuoqfVGdNra7GyXnqZMGuxuDE.INSTANCE).a());
        this.c = Optional.e();
        return Completable.a();
    }

    public final Completable a(String str) {
        return this.e.a((TemporaryRequest) TemporaryRequest.k().a(str).a(a / 1000).g()).a(this.f).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$uzn$MyodmsnfQjaI99wh6K76JLVNb18<Object>(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource c(String str) {
        this.c = Optional.b(new b(new a(str), this.d.c() + a));
        return Completable.a();
    }
}
