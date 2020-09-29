package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: dq reason: default package */
public final class dq<E> implements Collection<E>, Set<E> {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    public Object[] a;
    int b;
    private int[] i;
    private du<E, E> j;

    public dq() {
        this(0);
    }

    public dq(int i2) {
        if (i2 == 0) {
            this.i = c;
            this.a = d;
        } else {
            b(i2);
        }
        this.b = 0;
    }

    private int a() {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a2 = dr.a(this.i, i2, 0);
        if (a2 < 0 || this.a[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.i[i3] == 0) {
            if (this.a[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.i[i4] == 0) {
            if (this.a[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private int a(Object obj, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int a2 = dr.a(this.i, i3, i2);
        if (a2 < 0 || obj.equals(this.a[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.i[i4] == i2) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.i[i5] == i2) {
            if (obj.equals(this.a[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        Class<dq> cls = dq.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    private void b(int i2) {
        Class<dq> cls = dq.class;
        if (i2 == 8) {
            synchronized (cls) {
                if (g != null) {
                    Object[] objArr = g;
                    this.a = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.a = objArr2;
                    e = (Object[]) objArr2[0];
                    this.i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i2];
        this.a = new Object[i2];
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final E a(int i2) {
        E[] eArr = this.a;
        E e2 = eArr[i2];
        int i3 = this.b;
        if (i3 <= 1) {
            a(this.i, eArr, i3);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else {
            int[] iArr = this.i;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                this.b--;
                int i5 = this.b;
                if (i2 < i5) {
                    int[] iArr2 = this.i;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.a;
                    System.arraycopy(objArr, i6, objArr, i2, this.b - i2);
                }
                this.a[this.b] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.i;
                Object[] objArr2 = this.a;
                b(i4);
                this.b--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.i, 0, i2);
                    System.arraycopy(objArr2, 0, this.a, 0, i2);
                }
                int i7 = this.b;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.i, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.a, i2, this.b - i2);
                }
            }
        }
        return e2;
    }

    public final boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.b;
        if (i5 >= this.i.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(i6);
            int[] iArr2 = this.i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            a(iArr, objArr, this.b);
        }
        int i7 = this.b;
        if (i4 < i7) {
            int[] iArr3 = this.i;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i4, objArr2, i8, this.b - i4);
        }
        this.i[i4] = i2;
        this.a[i4] = e2;
        this.b++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.b + collection.size();
        int[] iArr = this.i;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.a;
            b(size);
            int i2 = this.b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            a(iArr, objArr, this.b);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        int i2 = this.b;
        if (i2 != 0) {
            a(this.i, this.a, i2);
            this.i = c;
            this.a = d;
            this.b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.b) {
                try {
                    if (!set.contains(this.a[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.j == null) {
            this.j = new du<E, E>() {
                /* access modifiers changed from: protected */
                public final int a() {
                    return dq.this.b;
                }

                /* access modifiers changed from: protected */
                public final int a(Object obj) {
                    return dq.this.a(obj);
                }

                /* access modifiers changed from: protected */
                public final Object a(int i, int i2) {
                    return dq.this.a[i];
                }

                /* access modifiers changed from: protected */
                public final E a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void a(int i) {
                    dq.this.a(i);
                }

                /* access modifiers changed from: protected */
                public final void a(E e, E e2) {
                    dq.this.add(e);
                }

                /* access modifiers changed from: protected */
                public final int b(Object obj) {
                    return dq.this.a(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<E, E> b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void c() {
                    dq.this.clear();
                }
            };
        }
        return this.j.d().iterator();
    }

    public final boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        a(a2);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.a[i2])) {
                a(i2);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        int i2 = this.b;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.a, 0, objArr, 0, i2);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, tArr, 0, this.b);
        int length = tArr.length;
        int i2 = this.b;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.a[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
