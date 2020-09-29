package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qof reason: default package */
public final class qof implements ObservableTransformer<gzz, gzz> {
    qof() {
    }

    public final ObservableSource<gzz> apply(Observable<gzz> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qof$GthzZS_GW23nF4utMsh0h4U800.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static gzz a(gzz gzz) {
        List body = gzz.body();
        if (body.isEmpty()) {
            return gzz;
        }
        return gzz.toBuilder().a(a(body)).a();
    }

    private static List<? extends gzt> a(List<? extends gzt> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (gzt gzt : list) {
            if (gzt.children().isEmpty()) {
                arrayList.add(a(gzt, arrayList.size()));
            } else {
                arrayList.add(a(gzt, arrayList.size()).toBuilder().a(a(gzt.children())).a());
            }
        }
        return arrayList;
    }

    private static gzt a(gzt gzt, int i) {
        if (!gzt.componentId().id().equals("trendingSearch:pillComponent") || gzt.text().title() == null) {
            return gzt;
        }
        return gzt.toBuilder().a("click", haa.builder().a("trendingSearchEvent").a("trendingSearchQuery", gzt.text().title()).a("trendingSearchItemIndex", Integer.valueOf(i)).a()).a((gzy) null).a();
    }
}
