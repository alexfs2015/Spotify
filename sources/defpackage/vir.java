package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;

/* renamed from: vir reason: default package */
public final class vir<T> implements SingleTransformer<T, T> {
    private final viq<T> a;

    public vir(int i, int i2, long j) {
        this.a = new viq<>(30, 4, 500);
    }

    public vir() {
        this.a = new viq<>();
    }

    public final SingleSource<T> a(Single<T> single) {
        return single.d().a((ObservableTransformer<? super T, ? extends R>) this.a).h();
    }
}
