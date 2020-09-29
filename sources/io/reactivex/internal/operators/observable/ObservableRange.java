package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class ObservableRange extends Observable<Integer> {
    private final int a;
    private final long b;

    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(Observer<? super Integer> observer, long j, long j2) {
            this.downstream = observer;
            this.index = j;
            this.end = j2;
        }

        public final boolean d() {
            return this.index == this.end;
        }

        public final void e() {
            this.index = this.end;
            lazySet(1);
        }

        public final void bf_() {
            set(1);
        }

        public final boolean b() {
            return get() != 0;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        public final /* synthetic */ Object bc_() {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRange(int i, int i2) {
        this.a = i;
        this.b = ((long) i) + ((long) i2);
    }

    public final void a(Observer<? super Integer> observer) {
        RangeDisposable rangeDisposable = new RangeDisposable(observer, (long) this.a, this.b);
        observer.onSubscribe(rangeDisposable);
        if (!rangeDisposable.fused) {
            Observer<? super Integer> observer2 = rangeDisposable.downstream;
            long j = rangeDisposable.end;
            for (long j2 = rangeDisposable.index; j2 != j && rangeDisposable.get() == 0; j2++) {
                observer2.onNext(Integer.valueOf((int) j2));
            }
            if (rangeDisposable.get() == 0) {
                rangeDisposable.lazySet(1);
                observer2.onComplete();
            }
        }
    }
}
