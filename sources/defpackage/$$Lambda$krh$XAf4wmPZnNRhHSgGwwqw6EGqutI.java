package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$krh$XAf4wmPZnNRhHSgGwwqw6EGqutI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$XAf4wmPZnNRhHSgGwwqw6EGqutI implements ObservableTransformer {
    private final /* synthetic */ wca f$0;
    private final /* synthetic */ Flowable f$1;
    private final /* synthetic */ ObjectMapper f$2;

    public /* synthetic */ $$Lambda$krh$XAf4wmPZnNRhHSgGwwqw6EGqutI(wca wca, Flowable flowable, ObjectMapper objectMapper) {
        this.f$0 = wca;
        this.f$1 = flowable;
        this.f$2 = objectMapper;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$krh$sdNhq0XKcalHKUgiRY0_l_lNKIA(this.f$0, this.f$1, this.f$2));
    }
}
