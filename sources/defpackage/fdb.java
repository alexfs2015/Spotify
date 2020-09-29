package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: fdb reason: default package */
final class fdb {

    /* renamed from: fdb$a */
    static class a<E> extends com.google.common.collect.Multisets.b<E> implements SortedSet<E> {
        final fcz<E> a;

        a(fcz<E> fcz) {
            this.a = fcz;
        }

        public Iterator<E> iterator() {
            return Multisets.a(this.a.S_().iterator());
        }

        public Comparator<? super E> comparator() {
            return this.a.comparator();
        }

        public SortedSet<E> subSet(E e, E e2) {
            return this.a.a(e, BoundType.CLOSED, e2, BoundType.OPEN).g();
        }

        public SortedSet<E> headSet(E e) {
            return this.a.d(e, BoundType.OPEN).g();
        }

        public SortedSet<E> tailSet(E e) {
            return this.a.c(e, BoundType.CLOSED).g();
        }

        public E first() {
            return fdb.a(this.a.h());
        }

        public E last() {
            return fdb.a(this.a.i());
        }

        public final /* bridge */ /* synthetic */ fcp a() {
            return this.a;
        }
    }

    /* renamed from: fdb$b */
    static class b<E> extends a<E> implements NavigableSet<E> {
        b(fcz<E> fcz) {
            super(fcz);
        }

        public final NavigableSet<E> descendingSet() {
            return new b(this.a.m());
        }

        public final Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(this.a.a(e, BoundType.a(z), e2, BoundType.a(z2)));
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return new b(this.a.d(e, BoundType.a(z)));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return new b(this.a.c(e, BoundType.a(z)));
        }

        public final E lower(E e) {
            return fdb.b(this.a.d(e, BoundType.OPEN).i());
        }

        public final E floor(E e) {
            return fdb.b(this.a.d(e, BoundType.CLOSED).i());
        }

        public final E ceiling(E e) {
            return fdb.b(this.a.c(e, BoundType.CLOSED).h());
        }

        public final E higher(E e) {
            return fdb.b(this.a.c(e, BoundType.OPEN).h());
        }

        public final E pollFirst() {
            return fdb.b(this.a.j());
        }

        public final E pollLast() {
            return fdb.b(this.a.k());
        }
    }

    static /* synthetic */ Object a(defpackage.fcp.a aVar) {
        if (aVar != null) {
            return aVar.b();
        }
        throw new NoSuchElementException();
    }

    static /* synthetic */ Object b(defpackage.fcp.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }
}
