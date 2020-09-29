package defpackage;

import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.OnSubscribeRange;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: hht reason: default package */
public abstract class hht implements xiy<xii<? extends Throwable>, xii<?>> {
    final long a;
    int b;
    private final int c;

    public hht(int i, long j) {
        this.c = i;
        this.a = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(ho hoVar) {
        this.b = ((Integer) fbp.a(hoVar.b)).intValue();
        return this.b == this.c ? xii.a((Throwable) fbp.a(hoVar.a)) : a();
    }

    /* access modifiers changed from: 0000 */
    public abstract xii<Long> a();

    public /* synthetic */ Object call(Object obj) {
        xii xii;
        xii xii2 = (xii) fbp.a((xii) obj);
        int i = this.c + 1;
        if (i >= 0) {
            if (i == 0) {
                xii = EmptyObservableHolder.a();
            } else if (1 <= (Integer.MAX_VALUE - i) + 1) {
                xii = i == 1 ? ScalarSynchronousObservable.d(Integer.valueOf(1)) : xii.b((a<T>) new OnSubscribeRange<T>(1, (i - 1) + 1));
            } else {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            }
            return xii2.b(xii, (xiz<? super T, ? super T2, ? extends R>) $$Lambda$0OLWjUANQCYgh1dSxOeavQXg_o.INSTANCE).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$hht$_BWR8xjFH6KrIeS8ZbDHmmMBE8<Object,Object>(this));
        }
        throw new IllegalArgumentException("Count can not be negative");
    }
}
