package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hpv reason: default package */
public final class hpv implements hpx {
    private final hqy a;
    private final Scheduler b;
    private final CompositeDisposable c = new CompositeDisposable();
    private final BehaviorSubject<Boolean> d = BehaviorSubject.a();
    private final BehaviorSubject<Boolean> e = BehaviorSubject.a(Boolean.TRUE);
    private final Set<hrw> f;
    private final lbi g;
    private final Map<String, hth> h = new HashMap(10);

    public hpv(hqy hqy, Scheduler scheduler, Set<hrw> set, lbi lbi) {
        this.a = hqy;
        this.b = scheduler;
        this.f = set;
        this.g = lbi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(hth hth, huo huo, Boolean bool) {
        return hth.a(huo, ((Boolean) this.e.j()).booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(huq huq, huo huo, Throwable th) {
        huq.a(Collections.emptyList());
        Logger.e(th, "error loading data for browser params, %s", huo);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(huq huq, String str, huo huo, long j, long j2, List list) {
        huq.a(list);
        hqy hqy = this.a;
        String b2 = huo.b();
        hqy.a(str, "get_item", "get_item", b2, (byte[]) null);
        Logger.a("LogHelper.logGetItems uri: %s page: %d index: %d", b2, Long.valueOf(j), Long.valueOf(j2));
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.c;
        Observable a2 = this.g.a();
        BehaviorSubject<Boolean> behaviorSubject = this.e;
        behaviorSubject.getClass();
        compositeDisposable.a(a2.b((Consumer<? super T>) new $$Lambda$IjiAOkWhxS5xOonf6ETUmd2fHU<Object>(behaviorSubject)).i());
        this.d.onNext(Boolean.TRUE);
    }

    public final void a(huo huo, huq huq, long j, long j2, String str) {
        hrw hrw;
        huo huo2 = huo;
        huq huq2 = huq;
        hth hth = (hth) this.h.get(huo.toString());
        if (hth == null) {
            Iterator it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hrw = null;
                    break;
                }
                hrw = (hrw) it.next();
                if (hrw.a(huo2)) {
                    break;
                }
            }
            if (hrw != null) {
                hth = hrw.a();
                this.h.put(huo.toString(), hth);
            }
        }
        if (hth == null) {
            huq2.a(Collections.emptyList());
            Logger.e("could not find a loader for browser params, %s", huo2);
            return;
        }
        CompositeDisposable compositeDisposable = this.c;
        Observable a2 = this.d.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).c(1).j(new $$Lambda$hpv$uE_tTW5R7SCw84onhT0_e9yLO3U(this, hth, huo2)).a(this.b);
        $$Lambda$hpv$hJtrE5IID0OwWhcRHMTfqiYuuek r0 = new $$Lambda$hpv$hJtrE5IID0OwWhcRHMTfqiYuuek(this, huq, str, huo, j, j2);
        compositeDisposable.a(a2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$hpv$ySda4LpggqZi33Rw0cvQrF8U19g<Object>(huq2, huo2)));
    }

    public final void b() {
        this.c.c();
        this.d.onNext(Boolean.FALSE);
    }
}
