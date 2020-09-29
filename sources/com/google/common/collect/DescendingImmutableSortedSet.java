package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private final ImmutableSortedSet<E> forward;

    DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(fdl.a(immutableSortedSet.comparator()).a());
        this.forward = immutableSortedSet;
    }

    public final fdz<E> R_() {
        return this.forward.descendingIterator();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> a(E e, boolean z) {
        return this.forward.headSet(e, z).descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> a(E e, boolean z, E e2, boolean z2) {
        return this.forward.subSet(e2, z2, e, z).descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> b() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> b(E e, boolean z) {
        return this.forward.tailSet(e, z).descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final int c(Object obj) {
        int c = this.forward.c(obj);
        return c == -1 ? c : (size() - 1) - c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.forward.c();
    }

    public final E ceiling(E e) {
        return this.forward.floor(e);
    }

    public final boolean contains(Object obj) {
        return this.forward.contains(obj);
    }

    public final ImmutableSortedSet<E> d() {
        return this.forward;
    }

    public final /* synthetic */ Iterator descendingIterator() {
        return this.forward.iterator();
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return this.forward;
    }

    public final fdz<E> e() {
        return this.forward.iterator();
    }

    public final E floor(E e) {
        return this.forward.ceiling(e);
    }

    public final E higher(E e) {
        return this.forward.lower(e);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.forward.descendingIterator();
    }

    public final E lower(E e) {
        return this.forward.higher(e);
    }

    public final int size() {
        return this.forward.size();
    }
}
