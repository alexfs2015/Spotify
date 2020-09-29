package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    static final RegularImmutableSortedSet<Comparable> b = new RegularImmutableSortedSet<>(ImmutableList.d(), fdl.b());
    final transient ImmutableList<E> c;

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.c = immutableList;
    }

    public final fdz<E> R_() {
        return this.c.R_();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        return this.c.a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> a(E e, boolean z) {
        return a(f(e, z), size());
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> a(E e, boolean z, E e2, boolean z2) {
        return a(e, z).b(e2, z2);
    }

    /* access modifiers changed from: 0000 */
    public final RegularImmutableSortedSet<E> a(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i < i2 ? new RegularImmutableSortedSet<>(this.c.subList(i, i2), this.a) : a(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> b() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? a(reverseOrder) : new RegularImmutableSortedSet(this.c.e(), reverseOrder);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> b(E e, boolean z) {
        return a(0, e(e, z));
    }

    /* access modifiers changed from: 0000 */
    public final int c(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.c, obj, this.a);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.c.c();
    }

    public final E ceiling(E e) {
        int f = f(e, true);
        if (f == size()) {
            return null;
        }
        return this.c.get(f);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.c, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof fdh) {
            collection = ((fdh) collection).d();
        }
        if (!fdq.a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        fdz R_ = this.c.R_();
        Iterator it = collection.iterator();
        if (!R_.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = R_.next();
        while (true) {
            try {
                int c2 = c(next2, next);
                if (c2 < 0) {
                    if (!R_.hasNext()) {
                        return false;
                    }
                    next2 = R_.next();
                } else if (c2 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (c2 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int e(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.c, fbp.a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    /* renamed from: e */
    public final fdz<E> descendingIterator() {
        return this.c.e().R_();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!fdq.a(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            fdz R_ = this.c.R_();
            while (R_.hasNext()) {
                Object next = R_.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (c(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int f(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.c, fbp.a(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : binarySearch ^ -1;
    }

    public final ImmutableList<E> f() {
        return this.c;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.c.get(0);
        }
        throw new NoSuchElementException();
    }

    public final E floor(E e) {
        int e2 = e(e, true) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.c.get(e2);
    }

    public final E higher(E e) {
        int f = f(e, false);
        if (f == size()) {
            return null;
        }
        return this.c.get(f);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.c.R_();
    }

    /* access modifiers changed from: 0000 */
    public final Object[] l() {
        return this.c.l();
    }

    public final E last() {
        if (!isEmpty()) {
            return this.c.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final E lower(E e) {
        int e2 = e(e, false) - 1;
        if (e2 == -1) {
            return null;
        }
        return this.c.get(e2);
    }

    /* access modifiers changed from: 0000 */
    public final int n() {
        return this.c.n();
    }

    /* access modifiers changed from: 0000 */
    public final int o() {
        return this.c.o();
    }

    public final int size() {
        return this.c.size();
    }
}
