package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] a = new Object[0];

    static abstract class a<E> extends b<E> {
        Object[] a;
        int b = 0;
        boolean c;

        a(int i) {
            fbu.a(i, "initialCapacity");
            this.a = new Object[i];
        }

        private void a(int i) {
            Object[] objArr = this.a;
            if (objArr.length < i) {
                this.a = Arrays.copyOf(objArr, a(objArr.length, i));
                this.c = false;
                return;
            }
            if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
        }

        /* renamed from: a */
        public a<E> b(E e) {
            fay.a(e);
            a(this.b + 1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = e;
            return this;
        }

        public b<E> a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                a(this.b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.b = ((ImmutableCollection) collection).a(this.a, this.b);
                    return this;
                }
            }
            super.a(iterable);
            return this;
        }

        public b<E> a(E... eArr) {
            fcq.a((Object[]) eArr, eArr.length);
            a(this.b + eArr.length);
            System.arraycopy(eArr, 0, this.a, this.b, eArr.length);
            this.b += eArr.length;
            return this;
        }
    }

    public static abstract class b<E> {
        public abstract ImmutableCollection<E> a();

        public abstract b<E> b(E e);

        static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        b() {
        }

        public b<E> a(E... eArr) {
            for (E b : eArr) {
                b(b);
            }
            return this;
        }

        public b<E> a(Iterable<? extends E> iterable) {
            for (Object b : iterable) {
                b(b);
            }
            return this;
        }

        public b<E> a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }
    }

    /* renamed from: R_ */
    public abstract fdh<E> iterator();

    /* access modifiers changed from: 0000 */
    public abstract boolean c();

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: 0000 */
    public Object[] l() {
        return null;
    }

    ImmutableCollection() {
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    public final <T> T[] toArray(T[] tArr) {
        fay.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] l = l();
            if (l != null) {
                return Arrays.copyOfRange(l, n(), o(), tArr.getClass());
            }
            tArr = fcu.a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: 0000 */
    public int n() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public int o() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> f() {
        return isEmpty() ? ImmutableList.d() : ImmutableList.b(toArray());
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        fdh R_ = iterator();
        while (R_.hasNext()) {
            int i2 = i + 1;
            objArr[i] = R_.next();
            i = i2;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
