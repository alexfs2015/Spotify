package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Iterators {

    enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            fay.b(false, "no calls to next() since the last call to remove()");
        }
    }

    static final class a<T> extends fbn<T> {
        static final fdi<Object> a = new a(new Object[0], 0, 0, 0);
        private final T[] b;
        private final int c = 0;

        private a(T[] tArr, int i, int i2, int i3) {
            super(0, 0);
            this.b = tArr;
        }

        public final T a(int i) {
            return this.b[this.c + i];
        }
    }

    static class b<T> implements Iterator<T> {
        private Iterator<? extends T> a;
        private Iterator<? extends T> b = a.a;
        private Iterator<? extends Iterator<? extends T>> c;
        private Deque<Iterator<? extends Iterator<? extends T>>> d;

        b(Iterator<? extends Iterator<? extends T>> it) {
            this.c = (Iterator) fay.a(it);
        }

        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (!((Iterator) fay.a(this.b)).hasNext()) {
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it2 = this.c;
                    if (it2 != null && it2.hasNext()) {
                        it = this.c;
                        break;
                    }
                    Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                    if (deque == null || deque.isEmpty()) {
                        it = null;
                    } else {
                        this.c = (Iterator) this.d.removeFirst();
                    }
                }
                it = null;
                this.c = it;
                Iterator<? extends Iterator<? extends T>> it3 = this.c;
                if (it3 == null) {
                    return false;
                }
                this.b = (Iterator) it3.next();
                Iterator<? extends T> it4 = this.b;
                if (it4 instanceof b) {
                    b bVar = (b) it4;
                    this.b = bVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (bVar.d != null) {
                        while (!bVar.d.isEmpty()) {
                            this.d.addFirst(bVar.d.removeLast());
                        }
                    }
                    this.c = bVar.c;
                }
            }
            return true;
        }

        public final T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.b;
                this.a = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            fay.b(this.a != null, "no calls to next() since the last call to remove()");
            this.a.remove();
            this.a = null;
        }
    }

    public static boolean a(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        fay.a(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean a(Iterator<T> it, faz<? super T> faz) {
        fay.a(faz);
        boolean z = false;
        while (it.hasNext()) {
            if (faz.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        fay.a(collection);
        fay.a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <T> Iterator<T> a(Iterator<? extends Iterator<? extends T>> it) {
        return new b(it);
    }

    public static <T> fdh<T> b(final Iterator<T> it, final faz<? super T> faz) {
        fay.a(it);
        fay.a(faz);
        return new AbstractIterator<T>() {
            /* access modifiers changed from: protected */
            public final T a() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (faz.apply(next)) {
                        return next;
                    }
                }
                return b();
            }
        };
    }

    public static <T> boolean c(Iterator<T> it, faz<? super T> faz) {
        return f(it, faz) != -1;
    }

    public static <T> T d(Iterator<T> it, faz<? super T> faz) {
        fay.a(it);
        fay.a(faz);
        while (it.hasNext()) {
            T next = it.next();
            if (faz.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> Optional<T> e(Iterator<T> it, faz<? super T> faz) {
        fay.a(it);
        fay.a(faz);
        while (it.hasNext()) {
            Object next = it.next();
            if (faz.apply(next)) {
                return Optional.b(next);
            }
        }
        return Optional.e();
    }

    public static <T> int f(Iterator<T> it, faz<? super T> faz) {
        fay.a(faz, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (faz.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, final Function<? super F, ? extends T> function) {
        fay.a(function);
        return new fde<F, T>(it) {
            public final T a(F f) {
                return function.apply(f);
            }
        };
    }

    public static <T> T b(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static int a(Iterator<?> it, int i) {
        fay.a(it);
        int i2 = 0;
        fay.a(i >= 0, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    static <T> T b(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static void c(Iterator<?> it) {
        fay.a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
