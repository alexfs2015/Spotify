package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function6;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class Functions {
    public static final Runnable a = new EmptyRunnable();
    public static final Action b = new EmptyAction();
    public static final Consumer<Throwable> c = new OnErrorMissingConsumer();
    public static final LongConsumer d = new EmptyLongConsumer();
    private static Function<Object, Object> e = new Identity();
    private static Consumer<Object> f = new EmptyConsumer();
    private static Predicate<Object> g = new TruePredicate();

    static final class Array2Func<T1, T2, R> implements Function<Object[], R> {
        private BiFunction<? super T1, ? super T2, ? extends R> a;

        Array2Func(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.a = biFunction;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.a.apply(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {
        private Function3<T1, T2, T3, R> a;

        Array3Func(Function3<T1, T2, T3, R> function3) {
            this.a = function3;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 3) {
                return this.a.apply(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder sb = new StringBuilder("Array of size 3 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {
        private Function4<T1, T2, T3, T4, R> a;

        Array4Func(Function4<T1, T2, T3, T4, R> function4) {
            this.a = function4;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 4) {
                return this.a.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder sb = new StringBuilder("Array of size 4 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {
        private Function6<T1, T2, T3, T4, T5, T6, R> a;

        Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.a = function6;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 6) {
                return this.a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            StringBuilder sb = new StringBuilder("Array of size 6 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static final class ArrayListCapacityCallable<T> implements Callable<List<T>> {
        private int a;

        ArrayListCapacityCallable(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object call() {
            return new ArrayList(this.a);
        }
    }

    static final class CastToClass<T, U> implements Function<T, U> {
        private Class<U> a;

        CastToClass(Class<U> cls) {
            this.a = cls;
        }

        public final U apply(T t) {
            return this.a.cast(t);
        }
    }

    static final class ClassFilter<T, U> implements Predicate<T> {
        private Class<U> a;

        ClassFilter(Class<U> cls) {
            this.a = cls;
        }

        public final boolean test(T t) {
            return this.a.isInstance(t);
        }
    }

    static final class EmptyAction implements Action {
        EmptyAction() {
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    static final class EmptyConsumer implements Consumer<Object> {
        EmptyConsumer() {
        }

        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    static final class EmptyLongConsumer implements LongConsumer {
        EmptyLongConsumer() {
        }
    }

    static final class EmptyRunnable implements Runnable {
        EmptyRunnable() {
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    static final class ErrorConsumer implements Consumer<Throwable> {
        ErrorConsumer() {
        }

        public final /* synthetic */ void accept(Object obj) {
            RxJavaPlugins.a((Throwable) obj);
        }
    }

    static final class FalsePredicate implements Predicate<Object> {
        FalsePredicate() {
        }

        public final boolean test(Object obj) {
            return false;
        }
    }

    enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE
    }

    static final class Identity implements Function<Object, Object> {
        Identity() {
        }

        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    static final class JustValue<T, U> implements Function<T, U>, Callable<U> {
        private U a;

        JustValue(U u) {
            this.a = u;
        }

        public final U apply(T t) {
            return this.a;
        }

        public final U call() {
            return this.a;
        }
    }

    static final class MaxRequestSubscription implements Consumer<xfm> {
        MaxRequestSubscription() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((xfm) obj).a(Long.MAX_VALUE);
        }
    }

    static final class NaturalObjectComparator implements Comparator<Object> {
        NaturalObjectComparator() {
        }

        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class NullCallable implements Callable<Object> {
        NullCallable() {
        }

        public final Object call() {
            return null;
        }
    }

    static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        OnErrorMissingConsumer() {
        }

        public final /* synthetic */ void accept(Object obj) {
            RxJavaPlugins.a((Throwable) new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    static final class TruePredicate implements Predicate<Object> {
        TruePredicate() {
        }

        public final boolean test(Object obj) {
            return true;
        }
    }

    static {
        new ErrorConsumer();
        new FalsePredicate();
        new NullCallable();
        new NaturalObjectComparator();
        new MaxRequestSubscription();
    }

    public static <T> Function<T, T> a() {
        return e;
    }

    public static <T1, T2, R> Function<Object[], R> a(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.a(biFunction, "f is null");
        return new Array2Func(biFunction);
    }

    public static <T1, T2, T3, R> Function<Object[], R> a(Function3<T1, T2, T3, R> function3) {
        ObjectHelper.a(function3, "f is null");
        return new Array3Func(function3);
    }

    public static <T1, T2, T3, T4, R> Function<Object[], R> a(Function4<T1, T2, T3, T4, R> function4) {
        ObjectHelper.a(function4, "f is null");
        return new Array4Func(function4);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> a(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        ObjectHelper.a(function6, "f is null");
        return new Array6Func(function6);
    }

    public static <T, U> Function<T, U> a(Class<U> cls) {
        return new CastToClass(cls);
    }

    public static <T> Callable<List<T>> a(int i) {
        return new ArrayListCapacityCallable(i);
    }

    public static <T> Callable<T> a(T t) {
        return new JustValue(t);
    }

    public static <T> Consumer<T> b() {
        return f;
    }

    public static <T, U> Function<T, U> b(U u) {
        return new JustValue(u);
    }

    public static <T, U> Predicate<T> b(Class<U> cls) {
        return new ClassFilter(cls);
    }

    public static <T> Predicate<T> c() {
        return g;
    }

    public static <T> Callable<Set<T>> d() {
        return HashSetCallable.INSTANCE;
    }
}
