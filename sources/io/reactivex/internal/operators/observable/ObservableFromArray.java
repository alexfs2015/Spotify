package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class ObservableFromArray<T> extends Observable<T> {
    private T[] a;

    static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        final Observer<? super T> a;
        final T[] b;
        boolean c;
        private int d;
        private volatile boolean e;

        FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.a = observer;
            this.b = tArr;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.c = true;
            return 1;
        }

        public final boolean b() {
            return this.e;
        }

        public final T ba_() {
            int i = this.d;
            T[] tArr = this.b;
            if (i == tArr.length) {
                return null;
            }
            this.d = i + 1;
            return ObjectHelper.a(tArr[i], "The array element is null");
        }

        public final void bd_() {
            this.e = true;
        }

        public final boolean d() {
            return this.d == this.b.length;
        }

        public final void e() {
            this.d = this.b.length;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.a = tArr;
    }

    public final void a(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.a);
        observer.onSubscribe(fromArrayDisposable);
        if (!fromArrayDisposable.c) {
            T[] tArr = fromArrayDisposable.b;
            int length = tArr.length;
            for (int i = 0; i < length && !fromArrayDisposable.b(); i++) {
                T t = tArr[i];
                if (t == null) {
                    Observer<? super T> observer2 = fromArrayDisposable.a;
                    StringBuilder sb = new StringBuilder("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    observer2.onError(new NullPointerException(sb.toString()));
                    return;
                }
                fromArrayDisposable.a.onNext(t);
            }
            if (!fromArrayDisposable.b()) {
                fromArrayDisposable.a.onComplete();
            }
        }
    }
}
