package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Set;

final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    static final class SerializedForm<C extends Comparable> implements Serializable {
        final DiscreteDomain<C> domain;
        final Range<C> range;

        /* synthetic */ SerializedForm(Range range2, DiscreteDomain discreteDomain, byte b) {
            this(range2, discreteDomain);
        }

        private SerializedForm(Range<C> range2, DiscreteDomain<C> discreteDomain) {
            this.range = range2;
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.range, this.domain);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    public final boolean isEmpty() {
        return false;
    }

    RegularContiguousSet(Range<C> range2, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range2;
    }

    private ContiguousSet<C> a(Range<C> range2) {
        Range<C> range3 = this.range;
        return range3.lowerBound.compareTo(range2.upperBound) <= 0 && range2.lowerBound.compareTo(range3.upperBound) <= 0 ? ContiguousSet.a(this.range.a(range2), this.domain) : new EmptyContiguousSet(this.domain);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ContiguousSet<C> b(C c, boolean z) {
        return a(Range.a(c, BoundType.a(z)));
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> a(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return a(Range.a(c, BoundType.a(z), c2, BoundType.a(z2)));
        }
        return new EmptyContiguousSet(this.domain);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ContiguousSet<C> a(C c, boolean z) {
        return a(Range.b(c, BoundType.a(z)));
    }

    /* access modifiers changed from: 0000 */
    public final int c(Object obj) {
        if (contains(obj)) {
            return (int) this.domain.a(first(), (Comparable) obj);
        }
        return -1;
    }

    /* renamed from: R_ */
    public final fdh<C> iterator() {
        return new fbr<C>(first()) {
            private C a = RegularContiguousSet.this.last();

            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                if (RegularContiguousSet.a(comparable, (Comparable) this.a)) {
                    return null;
                }
                return RegularContiguousSet.this.domain.a(comparable);
            }
        };
    }

    /* renamed from: e */
    public final fdh<C> descendingIterator() {
        return new fbr<C>(last()) {
            private C a = RegularContiguousSet.this.first();

            public final /* synthetic */ Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                if (RegularContiguousSet.a(comparable, (Comparable) this.a)) {
                    return null;
                }
                return RegularContiguousSet.this.domain.b(comparable);
            }
        };
    }

    /* renamed from: m */
    public final C first() {
        return this.range.lowerBound.a(this.domain);
    }

    /* renamed from: p */
    public final C last() {
        return this.range.upperBound.b(this.domain);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<C> i() {
        return this.domain.supportsFastOffset ? new ImmutableAsList<C>() {
            /* access modifiers changed from: 0000 */
            public final /* bridge */ /* synthetic */ ImmutableCollection b() {
                return RegularContiguousSet.this;
            }

            public /* synthetic */ Object get(int i) {
                fay.a(i, size(), "index");
                return RegularContiguousSet.this.domain.a(RegularContiguousSet.this.first(), (long) i);
            }
        } : super.i();
    }

    public final int size() {
        long a = this.domain.a(first(), last());
        if (a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a) + 1;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.apply((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean containsAll(Collection<?> collection) {
        return fbv.a((Collection<?>) this, collection);
    }

    public final Range<C> Q_() {
        BoundType boundType = BoundType.CLOSED;
        return Range.a(this.range.lowerBound.a(boundType, this.domain), this.range.upperBound.b(boundType, this.domain));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                if (!first().equals(regularContiguousSet.first()) || !last().equals(regularContiguousSet.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return Sets.a((Set<?>) this);
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new SerializedForm(this.range, this.domain, 0);
    }

    static /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && Range.c(comparable, comparable2) == 0;
    }
}
