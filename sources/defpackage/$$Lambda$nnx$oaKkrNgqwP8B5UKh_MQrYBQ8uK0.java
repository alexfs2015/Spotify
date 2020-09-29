package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$nnx$oaKkrNgqwP8B5UKh_MQrYBQ8uK0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nnx$oaKkrNgqwP8B5UKh_MQrYBQ8uK0 implements ObservableTransformer {
    private final /* synthetic */ noe f$0;
    private final /* synthetic */ noh f$1;
    private final /* synthetic */ hhm f$2;
    private final /* synthetic */ nit f$3;

    public /* synthetic */ $$Lambda$nnx$oaKkrNgqwP8B5UKh_MQrYBQ8uK0(noe noe, noh noh, hhm hhm, nit nit) {
        this.f$0 = noe;
        this.f$1 = noh;
        this.f$2 = hhm;
        this.f$3 = nit;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$nnx$jZcjpPMl7zV9yyLzKkjRPwJOCc(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
