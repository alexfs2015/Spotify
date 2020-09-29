package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: fdt reason: default package */
final class fdt {

    /* renamed from: fdt$a */
    static class a<E> extends com.google.common.collect.Multisets.b<E> implements SortedSet<E> {
        final fdr<E> a;

        a(fdr<E> fdr) {
            this.a = fdr;
        }

        public final /* bridge */ /* synthetic */ fdh a() {
            return this.a;
        }

        public Comparator<? super E> comparator() {
            return this.a.comparator();
        }

        public E first() {
            return fdt.a(this.a.h());
        }

        public SortedSet<E> headSet(E e) {
            return this.a.d(e, BoundType.OPEN).g();
        }

        public Iterator<E> iterator() {
            return Multisets.a(this.a.S_().iterator());
        }

        public E last() {
            return fdt.a(this.a.i());
        }

        public SortedSet<E> subSet(E e, E e2) {
            return this.a.a(e, BoundType.CLOSED, e2, BoundType.OPEN).g();
        }

        public SortedSet<E> tailSet(E e) {
            return this.a.c(e, BoundType.CLOSED).g();
        }
    }

    /* renamed from: fdt$b */
    static class b<E> extends a<E> implements NavigableSet<E> {
        b(fdr<E> fdr) {
            super(fdr);
        }

        public final E ceiling(E e) {
            return fdt.b(this.a.c(e, BoundType.CLOSED).h());
        }

        public final Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<E> descendingSet() {
            return new b(this.a.m());
        }

        public final E floor(E e) {
            return fdt.b(this.a.d(e, BoundType.CLOSED).i());
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return new b(this.a.d(e, BoundType.a(z)));
        }

        public final E higher(E e) {
            return fdt.b(this.a.c(e, BoundType.OPEN).h());
        }

        public final E lower(E e) {
            return fdt.b(this.a.d(e, BoundType.OPEN).i());
        }

        public final E pollFirst() {
            return fdt.b(this.a.j());
        }

        public final E pollLast() {
            return fdt.b(this.a.k());
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(this.a.a(e, BoundType.a(z), e2, BoundType.a(z2)));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return new b(this.a.c(e, BoundType.a(z)));
        }
    }

    static /* synthetic */ Object a(defpackage.fdh.a aVar) {
        if (aVar != null) {
            return aVar.b();
        }
        throw new NoSuchElementException();
    }

    static /* synthetic */ Object b(defpackage.fdh.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }
}
