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

/* renamed from: qnv reason: default package */
public final class qnv implements FlowableTransformer<gzz, gzz> {
    private final Flowable<fpt> a;
    private final kxz b;
    private final qok c;
    private final qnx d;

    qnv(Flowable<fpt> flowable, kxz kxz, qok qok, qnx qnx) {
        this.a = flowable;
        this.b = kxz;
        this.c = qok;
        this.d = qnx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(Flowable flowable, fpt fpt) {
        return this.c.a(fpt) ? Observable.a((ObservableSource<? extends T1>) this.b.a, (ObservableSource<? extends T2>) flowable.j(), (ObservableSource<? extends T3>) this.d.a(fpt).g($$Lambda$qnv$enVYKjDzypGvqdySAY3r78j334o.INSTANCE).d(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$qnv$oCYGQpz4ZtZd6Ov5RBazmgeDo.INSTANCE).a(BackpressureStrategy.BUFFER) : flowable;
    }

    public static gzz a(gzz gzz, gzz gzz2) {
        boolean z;
        if (gzz2 != null && !gzz2.body().isEmpty()) {
            Iterator it = gzz2.body().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                gzt gzt = (gzt) it.next();
                if ("mo-trending-searches-source".equals(gzt.id()) && !gzt.children().isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return gzz;
        }
        if (gzz == null || gyi.a(gzz)) {
            return hai.builder().a("search-history").b(gzz2.body()).a();
        }
        ArrayList arrayList = new ArrayList(gzz.body());
        arrayList.addAll(0, gzz2.body());
        return gzz.toBuilder().a((List<? extends gzt>) arrayList).a();
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return this.a.b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$qnv$WwJ5wicJ0lEn2H_EdNjSUyUobxc<Object,Object>(this, flowable));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(kxx kxx, gzz gzz, gzz gzz2) {
        return kxx instanceof b ? gzz : a(gzz, gzz2);
    }
}
