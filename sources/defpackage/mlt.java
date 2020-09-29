package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableZipIterable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: mlt reason: default package */
public final class mlt {

    /* renamed from: mlt$a */
    public static class a<T> {
        public final T a;
        public final long b;

        a(T t, long j) {
            this.a = t;
            this.b = j;
        }
    }

    /* renamed from: mlt$b */
    static class b implements Iterator<Long> {
        private long a;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final boolean hasNext() {
            return this.a < Long.MAX_VALUE;
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                long j = this.a;
                this.a = 1 + j;
                return Long.valueOf(j);
            }
            throw new NoSuchElementException();
        }
    }

    mlt() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Observable observable) {
        $$Lambda$mlt$6k8X9n6oigEVwslOcQBPv68epo r0 = $$Lambda$mlt$6k8X9n6oigEVwslOcQBPv68epo.INSTANCE;
        $$Lambda$npi1ePXglUg4MYOynRWky0JBA4Y r1 = $$Lambda$npi1ePXglUg4MYOynRWky0JBA4Y.INSTANCE;
        ObjectHelper.a(r0, "other is null");
        ObjectHelper.a(r1, "zipper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableZipIterable<T>(observable, r0, r1));
    }

    public static <T> ObservableTransformer<T, a<T>> a() {
        return $$Lambda$mlt$Xv9MkFdfrwJrNFmxnyCM5RVbM7Q.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterator b() {
        return new b(0);
    }
}
