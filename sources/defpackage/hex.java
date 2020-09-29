package defpackage;

import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.OnSubscribeRange;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: hex reason: default package */
public abstract class hex implements wut<wud<? extends Throwable>, wud<?>> {
    final long a;
    int b;
    private final int c;

    /* access modifiers changed from: 0000 */
    public abstract wud<Long> a();

    public /* synthetic */ Object call(Object obj) {
        wud wud;
        wud wud2 = (wud) fay.a((wud) obj);
        int i = this.c + 1;
        if (i >= 0) {
            if (i == 0) {
                wud = EmptyObservableHolder.a();
            } else if (1 > (Integer.MAX_VALUE - i) + 1) {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            } else if (i == 1) {
                wud = ScalarSynchronousObservable.d(Integer.valueOf(1));
            } else {
                wud = wud.b((a<T>) new OnSubscribeRange<T>(1, (i - 1) + 1));
            }
            return wud2.b(wud, (wuu<? super T, ? super T2, ? extends R>) $$Lambda$rFuidqFrXq4jm77ta57zBaVaFw.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$hex$8BOiVtXOYO_uFiDYx53UQsmWhs<Object,Object>(this));
        }
        throw new IllegalArgumentException("Count can not be negative");
    }

    public hex(int i, long j) {
        this.c = i;
        this.a = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(ho hoVar) {
        this.b = ((Integer) fay.a(hoVar.b)).intValue();
        if (this.b == this.c) {
            return wud.a((Throwable) fay.a(hoVar.a));
        }
        return a();
    }
}
