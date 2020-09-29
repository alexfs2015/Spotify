package io.reactivex;

public interface FlowableTransformer<Upstream, Downstream> {
    xfk<Downstream> apply(Flowable<Upstream> flowable);
}
