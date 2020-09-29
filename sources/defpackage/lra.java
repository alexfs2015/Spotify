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

/* renamed from: lra reason: default package */
public final class lra {
    private static final Policy l = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.b("link", Boolean.TRUE)).a()).a()).a();
    public final ltt a;
    public final AssistedCurationLogger b;
    public final String c;
    public final lrl d;
    public final txc e;
    public xag f;
    public String g;
    public String h;
    public final AtomicInteger i = new AtomicInteger(0);
    public final Set<String> j = new HashSet();
    public fpt k;
    private final heg m;
    private final hec n;
    private final uxc o;
    private final uxh p;
    private final hvl q;
    private final lrv r;
    private final rzc s;
    private final lre t;
    private final b u;
    private final lkn v;
    private final rgz w;
    private boolean x;

    /* renamed from: lra$a */
    public static abstract class a {

        /* renamed from: lra$a$a reason: collision with other inner class name */
        public interface C0053a {
            C0053a a(Optional<Boolean> optional);

            C0053a a(String str);

            C0053a a(List<lqy> list);

            C0053a a(Set<String> set);

            C0053a a(boolean z);

            a a();
        }

        public abstract Set<String> a();

        public abstract List<lqy> b();

        public abstract Optional<Boolean> c();

        public abstract String d();

        public abstract boolean e();

        public abstract C0053a f();
    }

    /* renamed from: lra$b */
    public static class b extends rws<a> {
        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
        }

        b(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, rwr rwr, sih sih, rdh rdh) {
            super(aVar, rwr, sih, rdh);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public lra(ltt ltt, AssistedCurationLogger assistedCurationLogger, heg heg, uxc uxc, uxh uxh, hvl hvl, lqj lqj, lrl lrl, lrv lrv, txc txc, rzc rzc, lre lre, rgz rgz, hec hec, b bVar, lkn lkn) {
        this.a = ltt;
        this.b = assistedCurationLogger;
        this.m = heg;
        this.n = hec;
        this.c = lqj.r();
        this.o = uxc;
        this.q = hvl;
        this.p = uxh;
        this.d = lrl;
        this.r = lrv;
        this.e = txc;
        this.s = rzc;
        this.t = lre;
        this.w = rgz;
        this.u = bVar;
        this.v = lkn;
    }

    public final void a() {
        this.a.a(true);
        if (this.f == null) {
            this.f = new xag();
        }
        this.f.a(vun.a((wrf<T>) this.n.a()).a(vun.a(this.m.c())).a((wun<? super T>) new $$Lambda$lra$4Ul1KJv5cNgdYUeWnpPGM1fOOWQ<Object>(this), (wun<Throwable>) $$Lambda$lra$09XRLB2M_MdG42KL1s2e4Kbuarw.INSTANCE));
        this.f.a(wud.a(wuh.a(vun.a((SingleSource<T>) this.o.a(this.c, defpackage.uxc.a.t().d(Optional.b(Boolean.FALSE)).a(Optional.b(l)).a()))).i(new $$Lambda$lra$TDtPQkF2sZ4P6LhoLBF9xzHloQ0(this)).a((c<? super T, ? extends R>) this.u), vun.a((wrf<T>) this.q.a).f($$Lambda$aihsryigh8IbmprELa05RucwrPA.INSTANCE).b(), this.v.a(), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$lra$KDYhO1JKbS9arZJOUQPxaE3hWDY.INSTANCE).a(vun.a(this.m.c())).a((wun<? super T>) new $$Lambda$lra$AlpEokrk5CVDamiec2VoVF7wC4<Object>(this), (wun<Throwable>) $$Lambda$lra$FQ8IkpGAZoS97GLOHp0kDptSqE.INSTANCE));
        this.f.a(vun.a((wrf<T>) this.q.a).c((wut<? super T, Boolean>) $$Lambda$lra$V9JCBuEOO0RSB9pBzm7BNt1iITA.INSTANCE).c().a((wun<? super T>) new $$Lambda$lra$_IX36YlRUr3v6g3qu5jUNjyHDI<Object>(this), (wun<Throwable>) $$Lambda$lra$623hgKDvzF8pKFAvxsDoWe8Jw78.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        this.k = fpt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.h = aVar.d();
        this.j.addAll(aVar.a());
        this.a.a(false);
        ltt ltt = this.a;
        lrv lrv = this.r;
        this.j.size();
        ltt.a(lrv.a());
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        this.s.a(sessionState.currentUserName()).a();
    }

    public void a(lqy lqy, lqv lqv) {
        if (!this.x || !lqv.d()) {
            this.e.b(lqv.c(), lpu.a(lqv, lqy));
        } else {
            this.v.a(lqv.a(), null);
        }
    }

    public final void a(int i2, lqy lqy) {
        String b2 = lqy.b();
        if (!faw.a(this.g, b2)) {
            this.g = b2;
            this.b.a(b2, i2);
        }
    }

    public void a(ArrayList<String> arrayList) {
        this.d.a(this.j);
        ltt ltt = this.a;
        lrv lrv = this.r;
        this.j.size();
        ltt.a(lrv.a());
        if (!this.w.a(this.k)) {
            this.a.c(this.h);
        } else {
            this.a.b(this.h);
        }
        this.t.a(this.k, (String[]) arrayList.toArray(new String[0]), this.c);
        if (this.f == null) {
            this.f = new xag();
        }
        this.f.a(vun.a((ObservableSource<T>) this.o.a(this.c, (List<String>) arrayList).d(), BackpressureStrategy.BUFFER).i(new $$Lambda$lra$gfaTtk1b_T1PvkvWlH8hrWiigpY(this)).a((wun<? super T>) $$Lambda$lra$vSjv8Lh6hUTPE6qqB4sGX3ojvoQ.INSTANCE, (wun<Throwable>) $$Lambda$lra$dqtgv1kv9H6m6NZhxbnU0yJOvxI.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(uza uza) {
        HashSet hashSet = new HashSet();
        for (uzb b2 : (uzb[]) uza.getItems()) {
            uzc b3 = b2.b();
            if (b3 != null) {
                hashSet.add(b3.getUri());
            }
        }
        String a2 = uza.a().a();
        return this.d.a((Set<String>) hashSet, a2).f(new $$Lambda$lra$T_BkPI5WDp6XNDHtywKGE59WZo(a2, hashSet));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(defpackage.uxc.b bVar) {
        if (bVar.a().isEmpty() && !bVar.b().isEmpty()) {
            return ScalarSynchronousObservable.d(Boolean.FALSE);
        }
        return vun.a((CompletableSource) this.p.a(this.c, bVar.a())).b();
    }
}
