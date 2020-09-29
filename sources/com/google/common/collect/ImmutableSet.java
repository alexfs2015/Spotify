package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private transient ImmutableList<E> a;

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return ImmutableSet.a((E[]) this.elements);
        }
    }

    public static class a<E> extends a<E> {
        private Object[] d;

        public a() {
            super(4);
        }

        /* renamed from: b */
        public a<E> a(Iterable<? extends E> iterable) {
            fbp.a(iterable);
            super.a(iterable);
            return this;
        }

        /* renamed from: b */
        public a<E> a(Iterator<? extends E> it) {
            fbp.a(it);
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }

        /* renamed from: b */
        public a<E> a(E... eArr) {
            super.a(eArr);
            return this;
        }

        /* renamed from: b */
        public ImmutableSet<E> a() {
            int i = this.b;
            if (i == 0) {
                return ImmutableSet.h();
            }
            if (i == 1) {
                return ImmutableSet.d(this.a[0]);
            }
            ImmutableSet<E> a = ImmutableSet.b(this.b, this.a);
            this.b = a.size();
            this.c = true;
            this.d = null;
            return a;
        }

        /* renamed from: c */
        public a<E> b(E e) {
            fbp.a(e);
            this.d = null;
            super.b(e);
            return this;
        }
    }

    ImmutableSet() {
    }

    public static <E> ImmutableSet<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.a;
        }
        Object next = it.next();
        return !it.hasNext() ? d(next) : new a().b(next).a(it).a();
    }

    public static <E> ImmutableSet<E> a(E e, E e2, E e3) {
        return b(3, e, e2, e3);
    }

    public static <E> ImmutableSet<E> a(E e, E e2, E e3, E e4) {
        return b(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> a(E e, E e2, E e3, E e4, E e5) {
        return b(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        fbp.a(eArr.length <= 2147483641, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return b(objArr.length, objArr);
    }

    public static <E> ImmutableSet<E> a(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.c()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return b(array.length, array);
    }

    public static <E> ImmutableSet<E> a(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? b(eArr.length, (Object[]) eArr.clone()) : d(eArr[0]) : RegularImmutableSet.a;
    }

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int b(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            fbp.a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    /* access modifiers changed from: private */
    public static <E> ImmutableSet<E> b(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return d(objArr[0]);
            }
            int b = b(i);
            Object[] objArr2 = new Object[b];
            int i2 = b - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a2 = fdi.a(objArr[i5], i5);
                int hashCode = a2.hashCode();
                int a3 = fdc.a(hashCode);
                while (true) {
                    int i6 = a3 & i2;
                    Object obj = objArr2[i6];
                    if (obj != null) {
                        if (obj.equals(a2)) {
                            break;
                        }
                        a3++;
                    } else {
                        int i7 = i4 + 1;
                        objArr[i4] = a2;
                        objArr2[i6] = a2;
                        i3 += hashCode;
                        i4 = i7;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, null);
            if (i4 == 1) {
                return new SingletonImmutableSet(objArr[0], i3);
            }
            if (b(i4) < b / 2) {
                i = i4;
            } else {
                if (a(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                RegularImmutableSet regularImmutableSet = new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
                return regularImmutableSet;
            }
        }
        return RegularImmutableSet.a;
    }

    public static <E> ImmutableSet<E> b(E e, E e2) {
        return b(2, e, e2);
    }

    public static <E> ImmutableSet<E> d(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> h() {
        return RegularImmutableSet.a;
    }

    public static <E> a<E> j() {
        return new a<>();
    }

    /* renamed from: R_ */
    public abstract fdz<E> iterator();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !g() || !((ImmutableSet) obj).g() || hashCode() == obj.hashCode()) {
            return Sets.a((Set<?>) this, obj);
        }
        return false;
    }

    public ImmutableList<E> f() {
        ImmutableList<E> immutableList = this.a;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> i = i();
        this.a = i;
        return i;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return false;
    }

    public int hashCode() {
        return Sets.a((Set<?>) this);
    }

    /* access modifiers changed from: 0000 */
    public ImmutableList<E> i() {
        return ImmutableList.b(toArray());
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
