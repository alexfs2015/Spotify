package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public final class Sets {

    static final class UnmodifiableNavigableSet<E> extends fda<E> implements Serializable, NavigableSet<E> {
        private static final long serialVersionUID = 0;
        private transient UnmodifiableNavigableSet<E> a;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) fbp.a(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        public final /* bridge */ /* synthetic */ Set a() {
            return this.unmodifiableDelegate;
        }

        public final /* bridge */ /* synthetic */ Collection b() {
            return this.unmodifiableDelegate;
        }

        public final SortedSet<E> c() {
            return this.unmodifiableDelegate;
        }

        public final E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        public final /* bridge */ /* synthetic */ Object delegate() {
            return this.unmodifiableDelegate;
        }

        public final Iterator<E> descendingIterator() {
            Iterator descendingIterator = this.delegate.descendingIterator();
            fbp.a(descendingIterator);
            return descendingIterator instanceof fdz ? (fdz) descendingIterator : new fdz<T>(descendingIterator) {
                private /* synthetic */ Iterator a;

                {
                    this.a = r1;
                }

                public final boolean hasNext() {
                    return this.a.hasNext();
                }

                public final T next() {
                    return this.a.next();
                }
            };
        }

        public final NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.a;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.a = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.a = this;
            return unmodifiableNavigableSet2;
        }

        public final E floor(E e) {
            return this.delegate.floor(e);
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return Sets.a(this.delegate.headSet(e, z));
        }

        public final E higher(E e) {
            return this.delegate.higher(e);
        }

        public final E lower(E e) {
            return this.delegate.lower(e);
        }

        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.a(this.delegate.subSet(e, z, e2, z2));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.a(this.delegate.tailSet(e, z));
        }
    }

    static class a<E> extends defpackage.fcm.a<E> implements Set<E> {
        a(Set<E> set, fbq<? super E> fbq) {
            super(set, fbq);
        }

        public boolean equals(Object obj) {
            return Sets.a((Set<?>) this, obj);
        }

        public int hashCode() {
            return Sets.a((Set<?>) this);
        }
    }

    static class b<E> extends a<E> implements SortedSet<E> {
        b(SortedSet<E> sortedSet, fbq<? super E> fbq) {
            super(sortedSet, fbq);
        }

        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.a).comparator();
        }

        public final E first() {
            return Iterators.d(this.a.iterator(), this.b);
        }

        public final SortedSet<E> headSet(E e) {
            return new b(((SortedSet) this.a).headSet(e), this.b);
        }

        public final E last() {
            SortedSet sortedSet = (SortedSet) this.a;
            while (true) {
                E last = sortedSet.last();
                if (this.b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public final SortedSet<E> subSet(E e, E e2) {
            return new b(((SortedSet) this.a).subSet(e, e2), this.b);
        }

        public final SortedSet<E> tailSet(E e) {
            return new b(((SortedSet) this.a).tailSet(e), this.b);
        }
    }

    static abstract class c<E> extends AbstractSet<E> {
        c() {
        }

        public boolean removeAll(Collection<?> collection) {
            return Sets.a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) fbp.a(collection));
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: a */
        public abstract fdz<E> iterator();

        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static int a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    public static <E> d<E> a(final Set<E> set, final Set<?> set2) {
        fbp.a(set, (Object) "set1");
        fbp.a(set2, (Object) "set2");
        return new d<E>() {
            /* renamed from: a */
            public final fdz<E> iterator() {
                return new AbstractIterator<E>() {
                    private Iterator<E> a = set.iterator();

                    /* access modifiers changed from: protected */
                    public final E a() {
                        while (this.a.hasNext()) {
                            E next = this.a.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return b();
                    }
                };
            }

            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            public final int size() {
                int i = 0;
                for (Object contains : set) {
                    if (!set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static <E> HashSet<E> a(int i) {
        return new HashSet<>(Maps.b(i));
    }

    public static <E> HashSet<E> a(E... eArr) {
        HashSet<E> a2 = a(eArr.length);
        Collections.addAll(a2, eArr);
        return a2;
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    public static <E> Set<E> a(Set<E> set, fbq<? super E> fbq) {
        if (set instanceof SortedSet) {
            return a((SortedSet) set, fbq);
        }
        if (!(set instanceof a)) {
            return new a((Set) fbp.a(set), (fbq) fbp.a(fbq));
        }
        a aVar = (a) set;
        return new a((Set) aVar.a, Predicates.a(aVar.b, fbq));
    }

    private static <E> SortedSet<E> a(SortedSet<E> sortedSet, fbq<? super E> fbq) {
        if (!(sortedSet instanceof a)) {
            return new b((SortedSet) fbp.a(sortedSet), (fbq) fbp.a(fbq));
        }
        a aVar = (a) sortedSet;
        return new b((SortedSet) aVar.a, Predicates.a(aVar.b, fbq));
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public static boolean a(Set<?> set, Collection<?> collection) {
        fbp.a(collection);
        if (collection instanceof fdh) {
            collection = ((fdh) collection).d();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? a(set, collection.iterator()) : Iterators.a(set.iterator(), collection);
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
