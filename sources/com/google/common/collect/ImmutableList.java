package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final fdi<Object> a = new b(RegularImmutableList.a, 0);

    static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> a;

        public /* synthetic */ Iterator iterator() {
            return ImmutableList.super.R_();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.a = immutableList;
        }

        private int b(int i) {
            return (size() - 1) - i;
        }

        public final ImmutableList<E> e() {
            return this.a;
        }

        public boolean contains(Object obj) {
            return this.a.contains(obj);
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return b(lastIndexOf);
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.a.indexOf(obj);
            if (indexOf >= 0) {
                return b(indexOf);
            }
            return -1;
        }

        /* renamed from: a */
        public final ImmutableList<E> subList(int i, int i2) {
            fay.a(i, i2, size());
            return this.a.subList(size() - i2, size() - i).e();
        }

        public E get(int i) {
            fay.a(i, size(), "index");
            return this.a.get(b(i));
        }

        public int size() {
            return this.a.size();
        }

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return this.a.c();
        }

        public /* synthetic */ ListIterator listIterator() {
            return listIterator(0);
        }
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return ImmutableList.a((E[]) this.elements);
        }
    }

    class SubList extends ImmutableList<E> {
        private transient int a;
        private transient int b;

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return true;
        }

        public /* synthetic */ Iterator iterator() {
            return ImmutableList.super.R_();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        SubList(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int size() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public final Object[] l() {
            return ImmutableList.this.l();
        }

        /* access modifiers changed from: 0000 */
        public final int n() {
            return ImmutableList.this.n() + this.a;
        }

        /* access modifiers changed from: 0000 */
        public final int o() {
            return ImmutableList.this.n() + this.a + this.b;
        }

        public E get(int i) {
            fay.a(i, this.b, "index");
            return ImmutableList.this.get(i + this.a);
        }

        /* renamed from: a */
        public final ImmutableList<E> subList(int i, int i2) {
            fay.a(i, i2, this.b);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.a;
            return immutableList.subList(i + i3, i2 + i3);
        }

        public /* synthetic */ ListIterator listIterator() {
            return listIterator(0);
        }
    }

    public static final class a<E> extends a<E> {
        public a() {
            this(4);
        }

        private a(int i) {
            super(4);
        }

        public final a<E> c(E e) {
            super.b(e);
            return this;
        }

        public final a<E> b(E... eArr) {
            super.a(eArr);
            return this;
        }

        public final a<E> b(Iterable<? extends E> iterable) {
            super.a(iterable);
            return this;
        }

        public final a<E> b(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        /* renamed from: b */
        public final ImmutableList<E> a() {
            this.c = true;
            return ImmutableList.b(this.a, this.b);
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.b a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.b a(Object[] objArr) {
            super.a((E[]) objArr);
            return this;
        }

        public final /* bridge */ /* synthetic */ a a(Object obj) {
            super.b(obj);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.b a(Iterator it) {
            super.a(it);
            return this;
        }

        public final /* synthetic */ com.google.common.collect.ImmutableCollection.b b(Object obj) {
            super.b(obj);
            return this;
        }
    }

    static class b<E> extends fbn<E> {
        private final ImmutableList<E> a;

        b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.a = immutableList;
        }

        public final E a(int i) {
            return this.a.get(i);
        }
    }

    public final ImmutableList<E> f() {
        return this;
    }

    public static <E> ImmutableList<E> d() {
        return RegularImmutableList.a;
    }

    @SafeVarargs
    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        fay.a(true, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[25];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, 13);
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(Iterable<? extends E> iterable) {
        fay.a(iterable);
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableList.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a((E) next);
        }
        return new a().c(next).b(it).a();
    }

    public static <E> ImmutableList<E> a(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> f = ((ImmutableCollection) collection).f();
            if (f.c()) {
                Object[] array = f.toArray();
                f = b(array, array.length);
            }
            return f;
        }
        Object[] array2 = collection.toArray();
        Object[] a2 = fcq.a(array2, array2.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return RegularImmutableList.a;
        }
        Object[] objArr = (Object[]) eArr.clone();
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        fay.a(comparator);
        Object[] array = fcl.a(iterable).toArray();
        fcq.a(array, array.length);
        Arrays.sort(array, comparator);
        return b(array, array.length);
    }

    static <E> ImmutableList<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    ImmutableList() {
    }

    /* renamed from: a */
    public final fdi<E> listIterator(int i) {
        fay.b(i, size(), "index");
        if (isEmpty()) {
            return a;
        }
        return new b(this, i);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    public ImmutableList<E> subList(int i, int i2) {
        fay.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return RegularImmutableList.a;
        }
        return new SubList(i, i3);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ImmutableList<E> e() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> a<E> g() {
        return new a<>();
    }

    public static <E> ImmutableList<E> a(E e) {
        Object[] objArr = {e};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2) {
        Object[] objArr = {e, e2};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3) {
        Object[] objArr = {e, e2, e3};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4) {
        Object[] objArr = {e, e2, e3, e4};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    public static <E> ImmutableList<E> a(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        Object[] a2 = fcq.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    static <E> ImmutableList<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return RegularImmutableList.a;
        }
        return new RegularImmutableList(objArr, i);
    }

    public final fdh<E> R_() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == fay.a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (faw.a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!faw.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
