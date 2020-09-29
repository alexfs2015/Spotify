package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vim reason: default package */
public final class vim<T> implements FlowableTransformer<T, T> {
    private final List<FlowableTransformer<T, T>> a;

    /* renamed from: vim$a */
    public static class a<T> {
        public final List<FlowableTransformer<T, T>> a = new ArrayList(10);

        public final a<T> a(FlowableTransformer<T, T> flowableTransformer) {
            this.a.add(flowableTransformer);
            return this;
        }
    }

    private vim(List<FlowableTransformer<T, T>> list) {
        this.a = list;
    }

    public static <T> vim<T> a(List<FlowableTransformer<T, T>> list) {
        return new vim<>(Lists.a((Iterable<? extends E>) list));
    }

    public final /* synthetic */ wrf apply(Flowable flowable) {
        for (FlowableTransformer a2 : this.a) {
            flowable = flowable.a(a2);
        }
        return flowable;
    }
}
