package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qod reason: default package */
public final class qod implements ObservableTransformer<gzz, gzz> {
    qod() {
    }

    public final ObservableSource<gzz> apply(Observable<gzz> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qod$1fEwfcJuDr9fL7pOcewgUuj0.INSTANCE);
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
                arrayList.add(a(gzt));
            } else {
                arrayList.add(a(gzt).toBuilder().a(a(gzt.children())).a());
            }
        }
        return arrayList;
    }

    private static gzt a(gzt gzt) {
        gzy target = gzt.target();
        if (target == null) {
            return gzt;
        }
        String uri = target.uri();
        if (uri == null) {
            return gzt;
        }
        return gzt.toBuilder().a("click", gvz.a(uri)).a((gzy) null).a();
    }
}
