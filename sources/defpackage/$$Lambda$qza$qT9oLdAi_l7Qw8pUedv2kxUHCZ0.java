package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qza$qT9oLdAi_l7Qw8pUedv2kxUHCZ0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$qT9oLdAi_l7Qw8pUedv2kxUHCZ0 implements ObservableTransformer {
    private final /* synthetic */ qzc f$0;

    public /* synthetic */ $$Lambda$qza$qT9oLdAi_l7Qw8pUedv2kxUHCZ0(qzc qzc) {
        this.f$0 = qzc;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$qza$M8lHkbJRB_zIbzLDt3NV1Btkdps(this.f$0)).c((Function<? super T, ? extends R>) $$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$qza$7H3qGtvDBl0KjDrDr2lOXyq5sk.INSTANCE);
    }
}
