package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: fbv reason: default package */
public final class fbv {

    /* renamed from: fbv$a */
    public static class a<E> extends AbstractCollection<E> {
        public final Collection<E> a;
        public final faz<? super E> b;

        protected a(Collection<E> collection, faz<? super E> faz) {
            this.a = collection;
            this.b = faz;
        }

        public boolean add(E e) {
            fay.a(this.b.apply(e));
            return this.a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                fay.a(this.b.apply(apply));
            }
            return this.a.addAll(collection);
        }

        public void clear() {
            fcl.a((Iterable<T>) this.a, this.b);
        }

        public boolean contains(Object obj) {
            if (fbv.a(this.a, obj)) {
                return this.b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return fbv.a((Collection<?>) this, collection);
        }

        public boolean isEmpty() {
            return !fcl.c(this.a, this.b);
        }

        public Iterator<E> iterator() {
            return Iterators.b(this.a.iterator(), this.b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator it = this.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator it = this.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            int i = 0;
            for (E apply : this.a) {
                if (this.b.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public Object[] toArray() {
            return Lists.a(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return Lists.a(iterator()).toArray(tArr);
        }
    }

    /* renamed from: fbv$b */
    static class b<F, T> extends AbstractCollection<T> {
        private Collection<F> a;
        private Function<? super F, ? extends T> b;

        b(Collection<F> collection, Function<? super F, ? extends T> function) {
            this.a = (Collection) fay.a(collection);
            this.b = (Function) fay.a(function);
        }

        public final void clear() {
            this.a.clear();
        }

        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        public final Iterator<T> iterator() {
            return Iterators.a(this.a.iterator(), this.b);
        }

        public final int size() {
            return this.a.size();
        }
    }

    public static boolean a(Collection<?> collection, Object obj) {
        fay.a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <F, T> Collection<T> a(Collection<F> collection, Function<? super F, T> function) {
        return new b(collection, function);
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder a(int i) {
        fbu.a(i, "size");
        return new StringBuilder((int) Math.min(((long) i) << 3, 1073741824));
    }
}
