package com.google.common.collect;

final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> a;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.a = immutableSortedMultiset;
    }

    public final int a(Object obj) {
        return this.a.a(obj);
    }

    public final a<E> h() {
        return this.a.i();
    }

    public final a<E> i() {
        return this.a.h();
    }

    public final int size() {
        return this.a.size();
    }

    /* renamed from: a */
    public final ImmutableSortedSet<E> g() {
        return this.a.g().descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final a<E> a(int i) {
        return (a) this.a.S_().f().e().get(i);
    }

    public final ImmutableSortedMultiset<E> b() {
        return this.a;
    }

    /* renamed from: a */
    public final ImmutableSortedMultiset<E> d(E e, BoundType boundType) {
        return this.a.c(e, boundType).m();
    }

    /* renamed from: b */
    public final ImmutableSortedMultiset<E> c(E e, BoundType boundType) {
        return this.a.d(e, boundType).m();
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.a.c();
    }

    public final /* bridge */ /* synthetic */ fcz m() {
        return this.a;
    }
}
