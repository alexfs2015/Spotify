package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qwo reason: default package */
public final class qwo implements ObservableTransformer<hcs, hcs> {
    qwo() {
    }

    private static hcm a(hcm hcm, int i) {
        if (!hcm.componentId().id().equals("trendingSearch:pillComponent") || hcm.text().title() == null) {
            return hcm;
        }
        return hcm.toBuilder().a("click", hct.builder().a("trendingSearchEvent").a("trendingSearchQuery", hcm.text().title()).a("trendingSearchItemIndex", Integer.valueOf(i)).a()).a((hcr) null).a();
    }

    /* access modifiers changed from: private */
    public static hcs a(hcs hcs) {
        List body = hcs.body();
        return body.isEmpty() ? hcs : hcs.toBuilder().a(a(body)).a();
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (hcm hcm : list) {
            if (hcm.children().isEmpty()) {
                arrayList.add(a(hcm, arrayList.size()));
            } else {
                arrayList.add(a(hcm, arrayList.size()).toBuilder().a(a(hcm.children())).a());
            }
        }
        return arrayList;
    }

    public final ObservableSource<hcs> apply(Observable<hcs> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qwo$C9f4yaBTxOcZgMzmfLB_5VYuUqM.INSTANCE);
    }
}
