package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.internal.operators.NeverObservableHolder;
import rx.internal.operators.OnSubscribeAmb;
import rx.internal.operators.OperatorPublish;
import rx.internal.util.ScalarSynchronousObservable;

@Deprecated
/* renamed from: hhv reason: default package */
public final class hhv<T> implements c<T, T> {
    private final int a;
    private final T b;
    private final xil c;

    /* renamed from: hhv$a */
    public static final class a<T> {
        public int a = 800;
        private final T b;
        private final xil c;

        public a(T t, xil xil) {
            this.b = t;
            this.c = xil;
        }

        public final hhv<T> a() {
            return new hhv<>(this.a, this.b, this.c, 0);
        }
    }

    private hhv(int i, T t, xil xil) {
        this.a = i;
        this.b = fbp.a(t);
        this.c = (xil) fbp.a(xil);
    }

    /* synthetic */ hhv(int i, Object obj, xil xil, byte b2) {
        this(i, obj, xil);
    }

    public static <T> a<T> a(T t, xil xil) {
        return new a<>(t, xil);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a() {
        return xii.a((long) this.a, TimeUnit.MILLISECONDS, this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(Throwable th) {
        return th instanceof TimeoutException ? NeverObservableHolder.a() : xii.a(th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(xii xii) {
        return xii.b(OnSubscribeAmb.a(xii.a((xix<? extends xii<U>>) new $$Lambda$hhv$1muju825mH3wy_jQlQkqREHYBmQ<Object>(this), (xiy<? super T, ? extends xii<V>>) $$Lambda$hhv$VCrm19PlPeUXeT2KIqXgFeUjFRE.INSTANCE, null).f($$Lambda$hhv$7hizenSURMIum2H1zRlx7XSKbI8.INSTANCE), xii.b(xii, ScalarSynchronousObservable.d(this.b).b((long) this.a, TimeUnit.MILLISECONDS, this.c))));
    }

    public final /* synthetic */ Object call(Object obj) {
        return OperatorPublish.a((xii) obj, new $$Lambda$hhv$lfdHRi7hNXfjS4DRLcCXQgck4TQ(this), false);
    }
}
