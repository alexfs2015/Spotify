package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Multisets {

    static class ImmutableEntry<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            fcl.a(i, "count");
        }

        public final int a() {
            return this.count;
        }

        public final E b() {
            return this.element;
        }
    }

    public static abstract class a<E> implements defpackage.fdh.a<E> {
        protected a() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof defpackage.fdh.a) {
                defpackage.fdh.a aVar = (defpackage.fdh.a) obj;
                if (a() == aVar.a() && fbn.a(b(), aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object b = b();
            return (b == null ? 0 : b.hashCode()) ^ a();
        }

        public String toString() {
            String valueOf = String.valueOf(b());
            int a = a();
            if (a == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(a);
            return sb.toString();
        }
    }

    public static abstract class b<E> extends c<E> {
        protected b() {
        }

        /* access modifiers changed from: protected */
        public abstract fdh<E> a();

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return a().containsAll(collection);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean remove(Object obj) {
            return a().b(obj, Integer.MAX_VALUE) > 0;
        }

        public int size() {
            return a().S_().size();
        }
    }

    public static abstract class c<E> extends c<defpackage.fdh.a<E>> {
        protected c() {
        }

        /* access modifiers changed from: protected */
        public abstract fdh<E> a();

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof defpackage.fdh.a) {
                defpackage.fdh.a aVar = (defpackage.fdh.a) obj;
                if (aVar.a() > 0 && a().a(aVar.b()) == aVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean remove(Object obj) {
            if (obj instanceof defpackage.fdh.a) {
                defpackage.fdh.a aVar = (defpackage.fdh.a) obj;
                Object b = aVar.b();
                int a = aVar.a();
                if (a != 0) {
                    return a().a(b, a, 0);
                }
            }
            return false;
        }
    }

    static final class d<E> implements Iterator<E> {
        private final fdh<E> a;
        private final Iterator<defpackage.fdh.a<E>> b;
        private defpackage.fdh.a<E> c;
        private int d;
        private int e;
        private boolean f;

        d(fdh<E> fdh, Iterator<defpackage.fdh.a<E>> it) {
            this.a = fdh;
            this.b = it;
        }

        public final boolean hasNext() {
            return this.d > 0 || this.b.hasNext();
        }

        public final E next() {
            if (hasNext()) {
                if (this.d == 0) {
                    this.c = (defpackage.fdh.a) this.b.next();
                    int a2 = this.c.a();
                    this.d = a2;
                    this.e = a2;
                }
                this.d--;
                this.f = true;
                return this.c.b();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            fbp.b(this.f, "no calls to next() since the last call to remove()");
            if (this.e == 1) {
                this.b.remove();
            } else {
                this.a.remove(this.c.b());
            }
            this.e--;
            this.f = false;
        }
    }

    public static <E> defpackage.fdh.a<E> a(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    public static <E> Iterator<E> a(fdh<E> fdh) {
        return new d(fdh, fdh.S_().iterator());
    }

    public static <E> Iterator<E> a(Iterator<defpackage.fdh.a<E>> it) {
        return new fdw<defpackage.fdh.a<E>, E>(it) {
            public final /* synthetic */ Object a(Object obj) {
                return ((defpackage.fdh.a) obj).b();
            }
        };
    }

    private static <E> boolean a(fdh<E> fdh, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.a(fdh);
        return true;
    }

    private static <E> boolean a(fdh<E> fdh, fdh<? extends E> fdh2) {
        if (fdh2 instanceof AbstractMapBasedMultiset) {
            return a(fdh, (AbstractMapBasedMultiset) fdh2);
        }
        if (fdh2.isEmpty()) {
            return false;
        }
        for (defpackage.fdh.a aVar : fdh2.S_()) {
            fdh.a(aVar.b(), aVar.a());
        }
        return true;
    }

    public static boolean a(fdh<?> fdh, Object obj) {
        if (obj == fdh) {
            return true;
        }
        if (obj instanceof fdh) {
            fdh fdh2 = (fdh) obj;
            if (fdh.size() == fdh2.size() && fdh.S_().size() == fdh2.S_().size()) {
                for (defpackage.fdh.a aVar : fdh2.S_()) {
                    if (fdh.a(aVar.b()) != aVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> boolean a(fdh<E> fdh, Collection<? extends E> collection) {
        fbp.a(fdh);
        fbp.a(collection);
        if (collection instanceof fdh) {
            return a(fdh, (fdh) collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a((Collection<T>) fdh, collection.iterator());
    }

    public static boolean b(fdh<?> fdh, Collection<?> collection) {
        if (collection instanceof fdh) {
            collection = ((fdh) collection).d();
        }
        return fdh.d().removeAll(collection);
    }

    public static boolean c(fdh<?> fdh, Collection<?> collection) {
        fbp.a(collection);
        if (collection instanceof fdh) {
            collection = ((fdh) collection).d();
        }
        return fdh.d().retainAll(collection);
    }
}
