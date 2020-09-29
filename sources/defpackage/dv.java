package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: dv reason: default package */
public class dv<K, V> {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    Object[] a;
    int b;
    private int[] g;

    public dv() {
        this.g = dr.a;
        this.a = dr.c;
        this.b = 0;
    }

    public dv(int i) {
        if (i == 0) {
            this.g = dr.a;
            this.a = dr.c;
        } else {
            e(i);
        }
        this.b = 0;
    }

    public dv(dv<K, V> dvVar) {
        this();
        if (dvVar != null) {
            int i = dvVar.b;
            a(this.b + i);
            if (this.b != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(dvVar.b(i2), dvVar.c(i2));
                }
            } else if (i > 0) {
                System.arraycopy(dvVar.g, 0, this.g, 0, i);
                System.arraycopy(dvVar.a, 0, this.a, 0, i << 1);
                this.b = i;
            }
        }
    }

    private int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int a2 = a(this.g, i, 0);
        if (a2 < 0 || this.a[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.g[i2] == 0) {
            if (this.a[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a2 - 1;
        while (i3 >= 0 && this.g[i3] == 0) {
            if (this.a[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    private int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.g, i2, i);
        if (a2 < 0 || obj.equals(this.a[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.g[i3] == i) {
            if (obj.equals(this.a[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.g[i4] == i) {
            if (obj.equals(this.a[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return dr.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        Class<dv> cls = dv.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    private void e(int i) {
        Class<dv> cls = dv.class;
        if (i == 8) {
            synchronized (cls) {
                if (e != null) {
                    Object[] objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (c != null) {
                    Object[] objArr2 = c;
                    this.a = objArr2;
                    c = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.a = new Object[(i << 1)];
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.a;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.g;
        if (iArr.length < i) {
            Object[] objArr = this.a;
            e(i);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: 0000 */
    public final int b(Object obj) {
        int i = this.b << 1;
        Object[] objArr = this.a;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final K b(int i) {
        return this.a[i << 1];
    }

    public final V c(int i) {
        return this.a[(i << 1) + 1];
    }

    public void clear() {
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            this.g = dr.a;
            this.a = dr.c;
            this.b = 0;
            a(iArr, objArr, i);
        }
        if (this.b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final V d(int i) {
        int i2;
        V[] vArr = this.a;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.b;
        if (i4 <= 1) {
            a(this.g, (Object[]) vArr, i4);
            this.g = dr.a;
            this.a = dr.c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.g;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.g;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.a;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.a;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.g;
                Object[] objArr3 = this.a;
                e(i5);
                if (i4 == this.b) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.g, 0, i);
                        System.arraycopy(objArr3, 0, this.a, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.g, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.a, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.b) {
            this.b = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dv) {
            dv dvVar = (dv) obj;
            if (size() != dvVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.b) {
                try {
                    Object b2 = b(i);
                    Object c2 = c(i);
                    Object obj2 = dvVar.get(b2);
                    if (c2 == null) {
                        if (obj2 != null || !dvVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.b) {
                try {
                    Object b3 = b(i2);
                    Object c3 = c(i2);
                    Object obj3 = map.get(b3);
                    if (c3 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!c3.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? this.a[(a2 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.b <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.b;
        if (k == null) {
            i2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.a;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.g.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.g;
            Object[] objArr = this.a;
            e(i6);
            if (i3 == this.b) {
                int[] iArr2 = this.g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.a, 0, objArr.length);
                }
                a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.g;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.b - i5) << 1);
        }
        int i8 = this.b;
        if (i3 == i8) {
            int[] iArr4 = this.g;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.a;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.b = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return d(a2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 >= 0) {
            Object c2 = c(a2);
            if (obj2 == c2 || (obj2 != null && obj2.equals(c2))) {
                d(a2);
                return true;
            }
        }
        return false;
    }

    public V replace(K k, V v) {
        int a2 = a((Object) k);
        if (a2 >= 0) {
            return a(a2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a2 = a((Object) k);
        if (a2 >= 0) {
            V c2 = c(a2);
            if (c2 == v || (v != null && v.equals(c2))) {
                a(a2, v2);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.b;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 28);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b2 = b(i);
            String str = "(this Map)";
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
