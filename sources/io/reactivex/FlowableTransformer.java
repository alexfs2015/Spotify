package io.reactivex;

public interface FlowableTransformer<Upstream, Downstream> {
    wrf<Downstream> apply(Flowable<Upstream> flowable);
}
