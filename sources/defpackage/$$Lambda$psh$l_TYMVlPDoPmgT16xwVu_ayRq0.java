package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$psh$l_TYMVlPDo-PmgT16xwVu_ayRq0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$l_TYMVlPDoPmgT16xwVu_ayRq0 implements ObservableTransformer {
    private final /* synthetic */ pqe f$0;

    public /* synthetic */ $$Lambda$psh$l_TYMVlPDoPmgT16xwVu_ayRq0(pqe pqe) {
        this.f$0 = pqe;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$YTMqHn61r_c77rYnRmjGCCLC5Y(this.f$0));
    }
}
