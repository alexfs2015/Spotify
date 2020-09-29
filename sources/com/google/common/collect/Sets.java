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

    static final class UnmodifiableNavigableSet<E> extends fci<E> implements Serializable, NavigableSet<E> {
        private static final long serialVersionUID = 0;
        private transient UnmodifiableNavigableSet<E> a;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) fay.a(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        public final SortedSet<E> c() {
            return this.unmodifiableDelegate;
        }

        public final E lower(E e) {
            return this.delegate.lower(e);
        }

        public final E floor(E e) {
            return this.delegate.floor(e);
        }

        public final E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        public final E higher(E e) {
            return this.delegate.higher(e);
        }

        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public final E pollLast() {
            throw new UnsupportedOperationException();
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

        public final Iterator<E> descendingIterator() {
            Iterator descendingIterator = this.delegate.descendingIterator();
            fay.a(descendingIterator);
            if (descendingIterator instanceof fdh) {
                return (fdh) descendingIterator;
            }
            return new fdh<T>(descendingIterator) {
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

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.a(this.delegate.subSet(e, z, e2, z2));
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return Sets.a(this.delegate.headSet(e, z));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.a(this.delegate.tailSet(e, z));
        }

        public final /* bridge */ /* synthetic */ Set a() {
            return this.unmodifiableDelegate;
        }

        public final /* bridge */ /* synthetic */ Collection b() {
            return this.unmodifiableDelegate;
        }

        public final /* bridge */ /* synthetic */ Object delegate() {
            return this.unmodifiableDelegate;
        }
    }

    static class a<E> extends defpackage.fbv.a<E> implements Set<E> {
        a(Set<E> set, faz<? super E> faz) {
            super(set, faz);
        }

        public boolean equals(Object obj) {
            return Sets.a((Set<?>) this, obj);
        }

        public int hashCode() {
            return Sets.a((Set<?>) this);
        }
    }

    static class b<E> extends a<E> implements SortedSet<E> {
        b(SortedSet<E> sortedSet, faz<? super E> faz) {
            super(sortedSet, faz);
        }

        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.a).comparator();
        }

        public final SortedSet<E> subSet(E e, E e2) {
            return new b(((SortedSet) this.a).subSet(e, e2), this.b);
        }

        public final SortedSet<E> headSet(E e) {
            return new b(((SortedSet) this.a).headSet(e), this.b);
        }

        public final SortedSet<E> tailSet(E e) {
            return new b(((SortedSet) this.a).tailSet(e), this.b);
        }

        public final E first() {
            return Iterators.d(this.a.iterator(), this.b);
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
    }

    static abstract class c<E> extends AbstractSet<E> {
        c() {
        }

        public boolean removeAll(Collection<?> collection) {
            return Sets.a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) fay.a(collection));
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        /* renamed from: a */
        public abstract fdh<E> iterator();

        /* synthetic */ d(byte b) {
            this();
        }

        private d() {
        }

        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
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

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> HashSet<E> a(E... eArr) {
        HashSet<E> a2 = a(eArr.length);
        Collections.addAll(a2, eArr);
        return a2;
    }

    public static <E> HashSet<E> a(int i) {
        return new HashSet<>(Maps.b(i));
    }

    public static <E> d<E> a(final Set<E> set, final Set<?> set2) {
        fay.a(set, (Object) "set1");
        fay.a(set2, (Object) "set2");
        return new d<E>() {
            /* renamed from: a */
            public final fdh<E> iterator() {
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

            public final int size() {
                int i = 0;
                for (Object contains : set) {
                    if (!set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }

            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }
        };
    }

    public static <E> Set<E> a(Set<E> set, faz<? super E> faz) {
        if (set instanceof SortedSet) {
            return a((SortedSet) set, faz);
        }
        if (!(set instanceof a)) {
            return new a((Set) fay.a(set), (faz) fay.a(faz));
        }
        a aVar = (a) set;
        return new a((Set) aVar.a, Predicates.a(aVar.b, faz));
    }

    private static <E> SortedSet<E> a(SortedSet<E> sortedSet, faz<? super E> faz) {
        if (!(sortedSet instanceof a)) {
            return new b((SortedSet) fay.a(sortedSet), (faz) fay.a(faz));
        }
        a aVar = (a) sortedSet;
        return new b((SortedSet) aVar.a, Predicates.a(aVar.b, faz));
    }

    public static int a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
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

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean a(Set<?> set, Collection<?> collection) {
        fay.a(collection);
        if (collection instanceof fcp) {
            collection = ((fcp) collection).d();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return a(set, collection.iterator());
        }
        return Iterators.a(set.iterator(), collection);
    }
}
