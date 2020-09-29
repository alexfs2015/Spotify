package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements fdr<E> {
    private transient ImmutableSortedMultiset<E> a;

    static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        SerializedForm(fdr<E> fdr) {
            this.comparator = fdr.comparator();
            int size = fdr.S_().size();
            this.elements = (Object[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (defpackage.fdh.a aVar : fdr.S_()) {
                this.elements[i] = aVar.b();
                this.counts[i] = aVar.a();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            int length = this.elements.length;
            a aVar = new a(this.comparator);
            for (int i = 0; i < length; i++) {
                aVar.a(this.elements[i], this.counts[i]);
            }
            return aVar.b();
        }
    }

    public static class a<E> extends com.google.common.collect.ImmutableMultiset.a<E> {
        private final Comparator<? super E> a;
        private E[] b = ((Object[]) new Object[4]);
        private int[] c = new int[4];
        private int d;
        private boolean e;

        public a(Comparator<? super E> comparator) {
            super(0);
            this.a = (Comparator) fbp.a(comparator);
        }

        private void a(boolean z) {
            int i = this.d;
            if (i != 0) {
                E[] copyOf = Arrays.copyOf(this.b, i);
                Arrays.sort(copyOf, this.a);
                int i2 = 1;
                for (int i3 = 1; i3 < copyOf.length; i3++) {
                    if (this.a.compare(copyOf[i2 - 1], copyOf[i3]) < 0) {
                        copyOf[i2] = copyOf[i3];
                        i2++;
                    }
                }
                Arrays.fill(copyOf, i2, this.d, null);
                if (z) {
                    int i4 = i2 << 2;
                    int i5 = this.d;
                    if (i4 > i5 * 3) {
                        copyOf = Arrays.copyOf(copyOf, feo.a(i5, (i5 / 2) + 1));
                    }
                }
                int[] iArr = new int[copyOf.length];
                for (int i6 = 0; i6 < this.d; i6++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i2, this.b[i6], this.a);
                    int[] iArr2 = this.c;
                    if (iArr2[i6] >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + iArr2[i6];
                    } else {
                        iArr[binarySearch] = iArr2[i6] ^ -1;
                    }
                }
                this.b = copyOf;
                this.c = iArr;
                this.d = i2;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public a<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof fdh) {
                for (defpackage.fdh.a aVar : ((fdh) iterable).S_()) {
                    a(aVar.b(), aVar.a());
                }
            } else {
                for (Object b2 : iterable) {
                    a(b2, 1);
                }
            }
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public a<E> b(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next(), 1);
            }
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public a<E> b(E... eArr) {
            for (E b2 : eArr) {
                a(b2, 1);
            }
            return this;
        }

        private void d() {
            int i = this.d;
            E[] eArr = this.b;
            if (i == eArr.length) {
                a(true);
            } else if (this.e) {
                this.b = Arrays.copyOf(eArr, eArr.length);
            }
            this.e = false;
        }

        public final /* synthetic */ com.google.common.collect.ImmutableMultiset.a a(Object obj) {
            return a(obj, 1);
        }

        public final /* bridge */ /* synthetic */ b b(Object obj) {
            return a(obj, 1);
        }

        /* renamed from: b */
        public final a<E> a(E e2, int i) {
            fbp.a(e2);
            fcl.a(i, "occurrences");
            if (i == 0) {
                return this;
            }
            d();
            E[] eArr = this.b;
            int i2 = this.d;
            eArr[i2] = e2;
            this.c[i2] = i;
            this.d = i2 + 1;
            return this;
        }

        /* renamed from: c */
        public final ImmutableSortedMultiset<E> b() {
            int i;
            a(false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.d;
                if (i2 >= i) {
                    break;
                }
                int[] iArr = this.c;
                if (iArr[i2] > 0) {
                    E[] eArr = this.b;
                    eArr[i3] = eArr[i2];
                    iArr[i3] = iArr[i2];
                    i3++;
                }
                i2++;
            }
            Arrays.fill(this.b, i3, i, null);
            Arrays.fill(this.c, i3, this.d, 0);
            this.d = i3;
            int i4 = this.d;
            if (i4 == 0) {
                return ImmutableSortedMultiset.a(this.a);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.a(this.a, i4, this.b);
            long[] jArr = new long[(this.d + 1)];
            int i5 = 0;
            while (true) {
                int i6 = this.d;
                if (i5 < i6) {
                    int i7 = i5 + 1;
                    jArr[i7] = jArr[i5] + ((long) this.c[i5]);
                    i5 = i7;
                } else {
                    this.e = true;
                    return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, i6);
                }
            }
        }
    }

    ImmutableSortedMultiset() {
    }

    static <E> ImmutableSortedMultiset<E> a(Comparator<? super E> comparator) {
        return fdl.b().equals(comparator) ? RegularImmutableSortedMultiset.a : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> a<E> s() {
        return new a<>(fdl.b());
    }

    /* renamed from: a */
    public abstract ImmutableSortedMultiset<E> d(E e, BoundType boundType);

    /* renamed from: a */
    public abstract ImmutableSortedSet<E> g();

    public final /* synthetic */ fdr a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        fbp.a(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return c(obj, boundType).d(obj2, boundType2);
    }

    /* renamed from: b */
    public ImmutableSortedMultiset<E> m() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.a;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? a(fdl.a(comparator()).a()) : new DescendingImmutableSortedMultiset<>(this);
            this.a = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    /* renamed from: b */
    public abstract ImmutableSortedMultiset<E> c(E e, BoundType boundType);

    public final Comparator<? super E> comparator() {
        return g().comparator();
    }

    @Deprecated
    public final defpackage.fdh.a<E> j() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final defpackage.fdh.a<E> k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
