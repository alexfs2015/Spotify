package io.reactivex;

public interface SingleTransformer<Upstream, Downstream> {
    SingleSource<Downstream> a(Single<Upstream> single);
}
