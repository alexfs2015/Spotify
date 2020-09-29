package io.reactivex;

public interface FlowableOperator<Downstream, Upstream> {
    wrg<? super Upstream> a(wrg<? super Downstream> wrg);
}
