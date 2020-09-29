package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    static final ImmutableSortedMultiset<Comparable> a = new RegularImmutableSortedMultiset(fdl.b());
    private static final long[] b = {0};
    private transient RegularImmutableSortedSet<E> c;
    private final transient long[] d;
    private final transient int e;
    private final transient int f;

    RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.c = regularImmutableSortedSet;
        this.d = jArr;
        this.e = i;
        this.f = i2;
    }

    RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.c = ImmutableSortedSet.a(comparator);
        this.d = b;
        this.e = 0;
        this.f = 0;
    }

    private ImmutableSortedMultiset<E> a(int i, int i2) {
        fbp.a(i, i2, this.f);
        return i == i2 ? a(comparator()) : (i == 0 && i2 == this.f) ? this : new RegularImmutableSortedMultiset(this.c.a(i, i2), this.d, this.e + i, i2 - i);
    }

    private int b(int i) {
        long[] jArr = this.d;
        int i2 = this.e;
        return (int) (jArr[(i2 + i) + 1] - jArr[i2 + i]);
    }

    public final int a(Object obj) {
        int c2 = this.c.c(obj);
        if (c2 >= 0) {
            return b(c2);
        }
        return 0;
    }

    /* renamed from: a */
    public final ImmutableSortedMultiset<E> d(E e2, BoundType boundType) {
        return a(0, this.c.e(e2, fbp.a(boundType) == BoundType.CLOSED));
    }

    public final ImmutableSortedSet<E> a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final a<E> a(int i) {
        return Multisets.a(this.c.f().get(i), b(i));
    }

    /* renamed from: b */
    public final ImmutableSortedMultiset<E> c(E e2, BoundType boundType) {
        return a(this.c.f(e2, fbp.a(boundType) == BoundType.CLOSED), this.f);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.e > 0 || this.f < this.d.length - 1;
    }

    public final /* bridge */ /* synthetic */ Set d() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ ImmutableSet e() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ NavigableSet g() {
        return this.c;
    }

    public final a<E> h() {
        if (isEmpty()) {
            return null;
        }
        return a(0);
    }

    public final a<E> i() {
        if (isEmpty()) {
            return null;
        }
        return a(this.f - 1);
    }

    public final int size() {
        long[] jArr = this.d;
        int i = this.e;
        return fev.b(jArr[this.f + i] - jArr[i]);
    }
}
