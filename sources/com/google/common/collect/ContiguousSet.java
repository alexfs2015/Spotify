package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;

public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    public abstract Range<C> Q_();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ContiguousSet<C> b(C c, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract ContiguousSet<C> a(C c, boolean z, C c2, boolean z2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract ContiguousSet<C> a(C c, boolean z);

    public static <C extends Comparable> ContiguousSet<C> a(Range<C> range, DiscreteDomain<C> discreteDomain) {
        fay.a(range);
        fay.a(discreteDomain);
        try {
            Range<C> a = !range.b() ? range.a(Range.b(discreteDomain.a())) : range;
            if (!range.c()) {
                a = a.a(Range.a(discreteDomain.b()));
            }
            return a.d() || Range.c(range.lowerBound.a(discreteDomain), range.upperBound.b(discreteDomain)) > 0 ? new EmptyContiguousSet(discreteDomain) : new RegularContiguousSet(a, discreteDomain);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(fct.b());
        this.domain = discreteDomain;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ContiguousSet<C> headSet(C c) {
        return b((C) (Comparable) fay.a(c), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public ContiguousSet<C> headSet(C c, boolean z) {
        return b((C) (Comparable) fay.a(c), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ContiguousSet<C> subSet(C c, C c2) {
        fay.a(c);
        fay.a(c2);
        fay.a(comparator().compare(c, c2) <= 0);
        return a(c, true, c2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        fay.a(c);
        fay.a(c2);
        fay.a(comparator().compare(c, c2) <= 0);
        return a(c, z, c2, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ContiguousSet<C> tailSet(C c) {
        return a((C) (Comparable) fay.a(c), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public ContiguousSet<C> tailSet(C c, boolean z) {
        return a((C) (Comparable) fay.a(c), z);
    }

    /* access modifiers changed from: 0000 */
    public ImmutableSortedSet<C> b() {
        return new DescendingImmutableSortedSet(this);
    }

    public String toString() {
        return Q_().toString();
    }
}
