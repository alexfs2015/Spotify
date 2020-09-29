package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qwe reason: default package */
public final class qwe implements FlowableTransformer<hcs, hcs> {
    private final Flowable<fqn> a;
    private final lbi b;
    private final qwt c;
    private final qwg d;

    qwe(Flowable<fqn> flowable, lbi lbi, qwt qwt, qwg qwg) {
        this.a = flowable;
        this.b = lbi;
        this.c = qwt;
        this.d = qwg;
    }

    public static hcs a(hcs hcs, hcs hcs2) {
        boolean z;
        if (hcs2 != null && !hcs2.body().isEmpty()) {
            Iterator it = hcs2.body().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hcm hcm = (hcm) it.next();
                if ("mo-trending-searches-source".equals(hcm.id()) && !hcm.children().isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return hcs;
        }
        if (hcs == null || hbb.a(hcs)) {
            return hdb.builder().a("search-history").b(hcs2.body()).a();
        }
        ArrayList arrayList = new ArrayList(hcs.body());
        arrayList.addAll(0, hcs2.body());
        return hcs.toBuilder().a((List<? extends hcm>) arrayList).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(lbg lbg, hcs hcs, hcs hcs2) {
        return lbg instanceof b ? hcs : a(hcs, hcs2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(Flowable flowable, fqn fqn) {
        return this.c.a(fqn) ? Observable.a((ObservableSource<? extends T1>) this.b.a, (ObservableSource<? extends T2>) flowable.j(), (ObservableSource<? extends T3>) this.d.a(fqn).g($$Lambda$qwe$zMiY5IbGojU1pxfBq8fzmOFw8ZI.INSTANCE).d(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$qwe$wYp9z3DuZtHlfv8yA7JTBb0ME8k.INSTANCE).a(BackpressureStrategy.BUFFER) : flowable;
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return this.a.b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$qwe$KYhmie7fwjZ7AoGbS8ZtZnf_rVg<Object,Object>(this, flowable));
    }
}
