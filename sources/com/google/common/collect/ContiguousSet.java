package com.google.common.collect;

import java.lang.Comparable;
import java.util.NoSuchElementException;

public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(fdl.b());
        this.domain = discreteDomain;
    }

    public static <C extends Comparable> ContiguousSet<C> a(Range<C> range, DiscreteDomain<C> discreteDomain) {
        fbp.a(range);
        fbp.a(discreteDomain);
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ContiguousSet<C> headSet(C c) {
        return b((C) (Comparable) fbp.a(c), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ContiguousSet<C> subSet(C c, C c2) {
        fbp.a(c);
        fbp.a(c2);
        fbp.a(comparator().compare(c, c2) <= 0);
        return a(c, true, c2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ContiguousSet<C> tailSet(C c) {
        return a((C) (Comparable) fbp.a(c), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        fbp.a(c);
        fbp.a(c2);
        fbp.a(comparator().compare(c, c2) <= 0);
        return a(c, z, c2, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public ContiguousSet<C> headSet(C c, boolean z) {
        return b((C) (Comparable) fbp.a(c), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public ContiguousSet<C> tailSet(C c, boolean z) {
        return a((C) (Comparable) fbp.a(c), z);
    }

    public abstract Range<C> Q_();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ContiguousSet<C> b(C c, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract ContiguousSet<C> a(C c, boolean z, C c2, boolean z2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract ContiguousSet<C> a(C c, boolean z);

    /* access modifiers changed from: 0000 */
    public ImmutableSortedSet<C> b() {
        return new DescendingImmutableSortedSet(this);
    }

    public String toString() {
        return Q_().toString();
    }
}
