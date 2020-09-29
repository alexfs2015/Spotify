package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;

/* renamed from: vvw reason: default package */
public final class vvw<T> implements SingleTransformer<T, T> {
    private final vvv<T> a;

    public vvw() {
        this.a = new vvv<>();
    }

    public vvw(int i, int i2, long j) {
        this.a = new vvv<>(30, 4, 500);
    }

    public final SingleSource<T> apply(Single<T> single) {
        return single.d().a((ObservableTransformer<? super T, ? extends R>) this.a).h();
    }
}
