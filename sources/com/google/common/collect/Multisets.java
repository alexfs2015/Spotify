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
            fbu.a(i, "count");
        }

        public final E b() {
            return this.element;
        }

        public final int a() {
            return this.count;
        }
    }

    public static abstract class a<E> implements defpackage.fcp.a<E> {
        protected a() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof defpackage.fcp.a) {
                defpackage.fcp.a aVar = (defpackage.fcp.a) obj;
                if (a() == aVar.a() && faw.a(b(), aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            Object b = b();
            if (b == null) {
                i = 0;
            } else {
                i = b.hashCode();
            }
            return i ^ a();
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
        /* access modifiers changed from: protected */
        public abstract fcp<E> a();

        protected b() {
        }

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

    public static abstract class c<E> extends c<defpackage.fcp.a<E>> {
        /* access modifiers changed from: protected */
        public abstract fcp<E> a();

        protected c() {
        }

        public boolean contains(Object obj) {
            if (obj instanceof defpackage.fcp.a) {
                defpackage.fcp.a aVar = (defpackage.fcp.a) obj;
                if (aVar.a() > 0 && a().a(aVar.b()) == aVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean remove(Object obj) {
            if (obj instanceof defpackage.fcp.a) {
                defpackage.fcp.a aVar = (defpackage.fcp.a) obj;
                Object b = aVar.b();
                int a = aVar.a();
                if (a != 0) {
                    return a().a(b, a, 0);
                }
            }
            return false;
        }

        public void clear() {
            a().clear();
        }
    }

    static final class d<E> implements Iterator<E> {
        private final fcp<E> a;
        private final Iterator<defpackage.fcp.a<E>> b;
        private defpackage.fcp.a<E> c;
        private int d;
        private int e;
        private boolean f;

        d(fcp<E> fcp, Iterator<defpackage.fcp.a<E>> it) {
            this.a = fcp;
            this.b = it;
        }

        public final boolean hasNext() {
            return this.d > 0 || this.b.hasNext();
        }

        public final E next() {
            if (hasNext()) {
                if (this.d == 0) {
                    this.c = (defpackage.fcp.a) this.b.next();
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
            fay.b(this.f, "no calls to next() since the last call to remove()");
            if (this.e == 1) {
                this.b.remove();
            } else {
                this.a.remove(this.c.b());
            }
            this.e--;
            this.f = false;
        }
    }

    public static <E> defpackage.fcp.a<E> a(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    public static boolean a(fcp<?> fcp, Object obj) {
        if (obj == fcp) {
            return true;
        }
        if (obj instanceof fcp) {
            fcp fcp2 = (fcp) obj;
            if (fcp.size() == fcp2.size() && fcp.S_().size() == fcp2.S_().size()) {
                for (defpackage.fcp.a aVar : fcp2.S_()) {
                    if (fcp.a(aVar.b()) != aVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> boolean a(fcp<E> fcp, Collection<? extends E> collection) {
        fay.a(fcp);
        fay.a(collection);
        if (collection instanceof fcp) {
            return a(fcp, (fcp) collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a((Collection<T>) fcp, collection.iterator());
    }

    private static <E> boolean a(fcp<E> fcp, fcp<? extends E> fcp2) {
        if (fcp2 instanceof AbstractMapBasedMultiset) {
            return a(fcp, (AbstractMapBasedMultiset) fcp2);
        }
        if (fcp2.isEmpty()) {
            return false;
        }
        for (defpackage.fcp.a aVar : fcp2.S_()) {
            fcp.a(aVar.b(), aVar.a());
        }
        return true;
    }

    private static <E> boolean a(fcp<E> fcp, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.a(fcp);
        return true;
    }

    public static boolean b(fcp<?> fcp, Collection<?> collection) {
        if (collection instanceof fcp) {
            collection = ((fcp) collection).d();
        }
        return fcp.d().removeAll(collection);
    }

    public static boolean c(fcp<?> fcp, Collection<?> collection) {
        fay.a(collection);
        if (collection instanceof fcp) {
            collection = ((fcp) collection).d();
        }
        return fcp.d().retainAll(collection);
    }

    public static <E> Iterator<E> a(Iterator<defpackage.fcp.a<E>> it) {
        return new fde<defpackage.fcp.a<E>, E>(it) {
            public final /* synthetic */ Object a(Object obj) {
                return ((defpackage.fcp.a) obj).b();
            }
        };
    }

    public static <E> Iterator<E> a(fcp<E> fcp) {
        return new d(fcp, fcp.S_().iterator());
    }
}
