package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vvr reason: default package */
public final class vvr<T> implements FlowableTransformer<T, T> {
    private final List<FlowableTransformer<T, T>> a;

    /* renamed from: vvr$a */
    public static class a<T> {
        public final List<FlowableTransformer<T, T>> a = new ArrayList(10);

        public final a<T> a(FlowableTransformer<T, T> flowableTransformer) {
            this.a.add(flowableTransformer);
            return this;
        }
    }

    private vvr(List<FlowableTransformer<T, T>> list) {
        this.a = list;
    }

    public static <T> vvr<T> a(List<FlowableTransformer<T, T>> list) {
        return new vvr<>(Lists.a((Iterable<? extends E>) list));
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        for (FlowableTransformer a2 : this.a) {
            flowable = flowable.a(a2);
        }
        return flowable;
    }
}