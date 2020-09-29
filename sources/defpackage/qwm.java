package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qwm reason: default package */
public final class qwm implements ObservableTransformer<hcs, hcs> {
    qwm() {
    }

    private static hcm a(hcm hcm) {
        hcr target = hcm.target();
        if (target == null) {
            return hcm;
        }
        String uri = target.uri();
        if (uri == null) {
            return hcm;
        }
        return hcm.toBuilder().a("click", gya.a(uri)).a((hcr) null).a();
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
                arrayList.add(a(hcm));
            } else {
                arrayList.add(a(hcm).toBuilder().a(a(hcm.children())).a());
            }
        }
        return arrayList;
    }

    public final ObservableSource<hcs> apply(Observable<hcs> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qwm$xgyXWe13sJO2XtlvUZX1TglPR5Y.INSTANCE);
    }
}
