package com.google.common.collect;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Lists {

    static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) fbp.a(list);
            this.function = (Function) fbp.a(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new fdx<F, T>(this.fromList.listIterator(i)) {
                public final T a(F f) {
                    return TransformingRandomAccessList.this.function.apply(f);
                }
            };
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) fbp.a(list);
            this.function = (Function) fbp.a(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new fdx<F, T>(this.fromList.listIterator(i)) {
                public final T a(F f) {
                    return TransformingSequentialList.this.function.apply(f);
                }
            };
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> a(int i) {
        fcl.a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        fbp.a(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> a = a();
        Iterators.a((Collection<T>) a, it);
        return a;
    }

    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        fbp.a(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <F, T> List<T> a(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    private static int b(int i) {
        fcl.a(i, "arraySize");
        return fev.b(((long) i) + 5 + ((long) (i / 10)));
    }
}
