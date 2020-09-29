package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.assistedcuration.AssistedCurationLogger;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: luz reason: default package */
public final class luz {
    private static final Policy l = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.b("link", Boolean.TRUE)).a()).a()).a();
    public final lxs a;
    public final AssistedCurationLogger b;
    public final String c;
    public final lvk d;
    public final ujf e;
    public xok f;
    public String g;
    public String h;
    public final AtomicInteger i = new AtomicInteger(0);
    public final Set<String> j = new HashSet();
    public fqn k;
    private final hhc m;
    private final hgy n;
    private final vje o;
    private final vjj p;
    private final hxx q;
    private final lvu r;
    private final siq s;
    private final lvd t;
    private final b u;
    private final lon v;
    private final rqb w;
    private boolean x;

    /* renamed from: luz$a */
    public static abstract class a {

        /* renamed from: luz$a$a reason: collision with other inner class name */
        public interface C0054a {
            C0054a a(Optional<Boolean> optional);

            C0054a a(String str);

            C0054a a(List<lux> list);

            C0054a a(Set<String> set);

            C0054a a(boolean z);

            a a();
        }

        public abstract Set<String> a();

        public abstract List<lux> b();

        public abstract Optional<Boolean> c();

        public abstract String d();

        public abstract boolean e();

        public abstract C0054a f();
    }

    /* renamed from: luz$b */
    public static class b extends sgc<a> {
        b(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, sgb sgb, sso sso, rmf rmf) {
            super(aVar, sgb, sso, rmf);
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
        }
    }

    public luz(lxs lxs, AssistedCurationLogger assistedCurationLogger, hhc hhc, vje vje, vjj vjj, hxx hxx, lui lui, lvk lvk, lvu lvu, ujf ujf, siq siq, lvd lvd, rqb rqb, hgy hgy, b bVar, lon lon) {
        this.a = lxs;
        this.b = assistedCurationLogger;
        this.m = hhc;
        this.n = hgy;
        this.c = lui.r();
        this.o = vje;
        this.q = hxx;
        this.p = vjj;
        this.d = lvk;
        this.r = lvu;
        this.e = ujf;
        this.s = siq;
        this.t = lvd;
        this.w = rqb;
        this.u = bVar;
        this.v = lon;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(defpackage.vje.b bVar) {
        return bVar.a().isEmpty() && !bVar.b().isEmpty() ? ScalarSynchronousObservable.d(Boolean.FALSE) : wit.a((CompletableSource) this.p.a(this.c, bVar.a())).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(vld vld) {
        HashSet hashSet = new HashSet();
        for (vle b2 : (vle[]) vld.getItems()) {
            vlf b3 = b2.b();
            if (b3 != null) {
                hashSet.add(b3.getUri());
            }
        }
        String a2 = vld.a().a();
        return this.d.a((Set<String>) hashSet, a2).e((xiy<? super T, ? extends R>) new $$Lambda$luz$Wr4szvFQoKW4Otpaoff5vRIXf4<Object,Object>(a2, hashSet));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        this.s.a(sessionState.currentUserName()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        this.k = fqn;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.h = aVar.d();
        this.j.addAll(aVar.a());
        this.a.a(false);
        lxs lxs = this.a;
        lvu lvu = this.r;
        this.j.size();
        lxs.a(lvu.a());
        List b2 = aVar.b();
        this.x = aVar.e();
        if (!b2.isEmpty()) {
            this.a.a(b2, this.x);
            this.a.n();
            int size = aVar.b().size();
            if (size > this.i.get()) {
                this.i.set(size);
                this.a.q();
            }
        } else if (((Boolean) aVar.c().a(Boolean.FALSE)).booleanValue()) {
            this.a.l();
        } else {
            this.a.m();
        }
    }

    public final void a() {
        this.a.a(true);
        if (this.f == null) {
            this.f = new xok();
        }
        this.f.a(wit.a((xfk<T>) this.n.a()).a(wit.a(this.m.c())).a((xis<? super T>) new $$Lambda$luz$qy9z19WCboQ0ymMpA0hU1YGQ88o<Object>(this), (xis<Throwable>) $$Lambda$luz$fj1zumrL902oblvBtw1iMkzzFlg.INSTANCE));
        this.f.a(xii.a(xim.a(wit.a((SingleSource<T>) this.o.a(this.c, defpackage.vje.a.t().d(Optional.b(Boolean.FALSE)).a(Optional.b(l)).a()))).h(new $$Lambda$luz$dgiKHzrXjdxWK1wQJui5c20pVQo(this)).a((c<? super T, ? extends R>) this.u), wit.a((xfk<T>) this.q.a).e((xiy<? super T, ? extends R>) $$Lambda$02gp8ebwmA4MuLHDaqFeeJlcWR0.INSTANCE).b(), this.v.a(), (xja<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$luz$dirXYeYatxKrDThyN6GE2Egp0Ro.INSTANCE).a(wit.a(this.m.c())).a((xis<? super T>) new $$Lambda$luz$JiJ2OlJULWi2W1bdeqxZhgH7fwc<Object>(this), (xis<Throwable>) $$Lambda$luz$6qlu8lzgSzR6Bqe6GuKGwW9YWfY.INSTANCE));
        this.f.a(wit.a((xfk<T>) this.q.a).c((xiy<? super T, Boolean>) $$Lambda$luz$6y2M6oCgGZ2FySqDBh6MMiuvJr4.INSTANCE).c().a((xis<? super T>) new $$Lambda$luz$UOf7XUpdzsQz6jw1zRBYuZOknVE<Object>(this), (xis<Throwable>) $$Lambda$luz$d3sgcwbo5LWDG1YPwVFojBqM6mE.INSTANCE));
    }

    public final void a(int i2, lux lux) {
        String b2 = lux.b();
        if (!fbn.a(this.g, b2)) {
            this.g = b2;
            this.b.a(b2, i2);
        }
    }

    public void a(ArrayList<String> arrayList) {
        this.d.a(this.j);
        lxs lxs = this.a;
        lvu lvu = this.r;
        this.j.size();
        lxs.a(lvu.a());
        if (!this.w.a(this.k)) {
            this.a.c(this.h);
        } else {
            this.a.b(this.h);
        }
        this.t.a(this.k, (String[]) arrayList.toArray(new String[0]), this.c);
        if (this.f == null) {
            this.f = new xok();
        }
        this.f.a(wit.a((ObservableSource<T>) this.o.a(this.c, (List<String>) arrayList).d(), BackpressureStrategy.BUFFER).h(new $$Lambda$luz$vaIl1ivsVjmU6xCw3VLq8YBqX5Q(this)).a((xis<? super T>) $$Lambda$luz$X600vonQwCVJ__CEkYzO_sSN4.INSTANCE, (xis<Throwable>) $$Lambda$luz$kELTcVL6kZPxT6XkuYi07TXQpiI.INSTANCE));
    }

    public void a(lux lux, luu luu) {
        if (!this.x || !luu.d()) {
            this.e.b(luu.c(), ltt.a(luu, lux));
        } else {
            this.v.a(luu.a(), null);
        }
    }
}
