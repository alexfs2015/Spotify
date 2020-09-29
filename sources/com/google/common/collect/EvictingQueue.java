package com.google.common.collect;

import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class EvictingQueue<E> extends fcx<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        fbp.a(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> a(int i) {
        return new EvictingQueue<>(3);
    }

    public final Queue<E> a() {
        return this.delegate;
    }

    public final boolean add(E e) {
        fbp.a(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return a(collection);
        }
        clear();
        int i = size - this.maxSize;
        fbp.a(collection);
        fbp.a(i >= 0, (Object) "number to skip cannot be negative");
        AnonymousClass4 r1 = new fcp<T>(collection, i) {
            private /* synthetic */ Iterable a;
            private /* synthetic */ int b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final Iterator<T> iterator() {
                Iterable iterable = this.a;
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
                }
                final Iterator it = iterable.iterator();
                Iterators.a(it, this.b);
                return new Iterator<T>() {
                    private boolean a = true;

                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    public final T next() {
                        T next = it.next();
                        this.a = false;
                        return next;
                    }

                    public final void remove() {
                        fbp.b(!this.a, "no calls to next() since the last call to remove()");
                        it.remove();
                    }
                };
            }
        };
        return r1 instanceof Collection ? addAll((Collection) r1) : Iterators.a((Collection<T>) this, ((Iterable) fbp.a(r1)).iterator());
    }

    public final /* bridge */ /* synthetic */ Collection b() {
        return this.delegate;
    }

    public final boolean contains(Object obj) {
        return this.delegate.contains(fbp.a(obj));
    }

    public final /* bridge */ /* synthetic */ Object delegate() {
        return this.delegate;
    }

    public final boolean offer(E e) {
        return add(e);
    }

    public final boolean remove(Object obj) {
        return this.delegate.remove(fbp.a(obj));
    }
}
