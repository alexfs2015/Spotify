package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;
        private final DiscreteDomain<C> domain;

        /* synthetic */ SerializedForm(DiscreteDomain discreteDomain, byte b) {
            this(discreteDomain);
        }

        private SerializedForm(DiscreteDomain<C> discreteDomain) {
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new EmptyContiguousSet(this.domain);
        }
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> a(C c, boolean z) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> a(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> b(C c, boolean z) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final int c(Object obj) {
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    public final boolean contains(Object obj) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ ImmutableSortedSet a(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ ImmutableSortedSet a(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ ImmutableSortedSet b(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    EmptyContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    public final Range<C> Q_() {
        throw new NoSuchElementException();
    }

    public final ImmutableList<C> f() {
        return ImmutableList.d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new SerializedForm(this.domain, 0);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<C> b() {
        return ImmutableSortedSet.a((Comparator<? super E>) fct.b().a());
    }

    public final fdh<C> R_() {
        return a.a;
    }

    public final fdh<C> e() {
        return a.a;
    }

    public final /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return a.a;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return a.a;
    }
}
