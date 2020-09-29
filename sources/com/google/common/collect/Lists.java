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

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (Object[]) fay.a(eArr);
        }

        public int size() {
            return fdw.a(this.rest.length, 1);
        }

        public E get(int i) {
            fay.a(i, size(), "index");
            return i == 0 ? this.first : this.rest[i - 1];
        }
    }

    static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) fay.a(list);
            this.function = (Function) fay.a(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new fdf<F, T>(this.fromList.listIterator(i)) {
                public final T a(F f) {
                    return TransformingRandomAccessList.this.function.apply(f);
                }
            };
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
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
            this.fromList = (List) fay.a(list);
            this.function = (Function) fay.a(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public int size() {
            return this.fromList.size();
        }

        public ListIterator<T> listIterator(int i) {
            return new fdf<F, T>(this.fromList.listIterator(i)) {
                public final T a(F f) {
                    return TransformingSequentialList.this.function.apply(f);
                }
            };
        }
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        fay.a(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        fay.a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> a = a();
        Iterators.a((Collection<T>) a, it);
        return a;
    }

    private static int b(int i) {
        fbu.a(i, "arraySize");
        return feb.a(((long) i) + 5 + ((long) (i / 10)));
    }

    public static <E> ArrayList<E> a(int i) {
        fbu.a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <F, T> List<T> a(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
