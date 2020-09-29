package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableZipIterable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: mqm reason: default package */
public final class mqm {

    /* renamed from: mqm$a */
    public static class a<T> {
        public final T a;
        public final long b;

        a(T t, long j) {
            this.a = t;
            this.b = j;
        }
    }

    /* renamed from: mqm$b */
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

    mqm() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Observable observable) {
        $$Lambda$mqm$hKBI9jCyFfB5VzfW2_oEQqQVtrg r0 = $$Lambda$mqm$hKBI9jCyFfB5VzfW2_oEQqQVtrg.INSTANCE;
        $$Lambda$TB3Hi0onVwDZJPNCY1PethcAqoM r1 = $$Lambda$TB3Hi0onVwDZJPNCY1PethcAqoM.INSTANCE;
        ObjectHelper.a(r0, "other is null");
        ObjectHelper.a(r1, "zipper is null");
        return RxJavaPlugins.a((Observable<T>) new ObservableZipIterable<T>(observable, r0, r1));
    }

    public static <T> ObservableTransformer<T, a<T>> a() {
        return $$Lambda$mqm$oUAQW1IUs1OYUpJNrqEZtuV2QFU.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterator b() {
        return new b(0);
    }
}
