package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    transient Object[] a;
    transient Object[] b;
    transient int c;
    private transient int[] d;
    private transient long[] e;
    private transient float f;
    private transient int g;
    /* access modifiers changed from: private */
    public transient int h;
    private transient Set<K> i;
    private transient Set<Entry<K, V>> j;
    private transient Collection<V> k;

    class a extends AbstractSet<Entry<K, V>> {
        a() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a2 = CompactHashMap.this.a(entry.getKey());
                if (a2 != -1 && fbn.a(CompactHashMap.this.b[a2], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new b<Entry<K, V>>() {
                /* access modifiers changed from: 0000 */
                public final /* synthetic */ Object a(int i) {
                    return new d(i);
                }
            };
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a2 = CompactHashMap.this.a(entry.getKey());
                if (a2 != -1 && fbn.a(CompactHashMap.this.b[a2], entry.getValue())) {
                    CompactHashMap.this.a(CompactHashMap.this.a[a2], (int) (CompactHashMap.this.e[a2] >>> 32));
                    return true;
                }
            }
            return false;
        }

        public final int size() {
            return CompactHashMap.this.h;
        }
    }

    abstract class b<T> implements Iterator<T> {
        private int a;
        private int b;
        private int c;

        private b() {
            this.a = CompactHashMap.this.c;
            this.b = CompactHashMap.this.b();
            this.c = -1;
        }

        /* synthetic */ b(CompactHashMap compactHashMap, byte b2) {
            this();
        }

        private void a() {
            if (CompactHashMap.this.c != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract T a(int i);

        public boolean hasNext() {
            return this.b >= 0;
        }

        public T next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                T a2 = a(i);
                this.b = CompactHashMap.this.e(this.b);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            fbp.b(this.c >= 0, "no calls to next() since the last call to remove()");
            this.a++;
            CompactHashMap.this.a(CompactHashMap.this.a[this.c], (int) (CompactHashMap.this.e[this.c] >>> 32));
            this.b = CompactHashMap.this.a(this.b, this.c);
            this.c = -1;
        }
    }

    class c extends AbstractSet<K> {
        c() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new b<K>() {
                /* access modifiers changed from: 0000 */
                public final K a(int i) {
                    return CompactHashMap.this.a[i];
                }
            };
        }

        public final boolean remove(Object obj) {
            int a2 = CompactHashMap.this.a(obj);
            if (a2 == -1) {
                return false;
            }
            CompactHashMap.this.a(CompactHashMap.this.a[a2], (int) (CompactHashMap.this.e[a2] >>> 32));
            return true;
        }

        public final int size() {
            return CompactHashMap.this.h;
        }
    }

    final class d extends fcf<K, V> {
        private final K a;
        private int b;

        d(int i) {
            this.a = CompactHashMap.this.a[i];
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= CompactHashMap.this.size() || !fbn.a(this.a, CompactHashMap.this.a[this.b])) {
                this.b = CompactHashMap.this.a((Object) this.a);
            }
        }

        public final K getKey() {
            return this.a;
        }

        public final V getValue() {
            a();
            if (this.b == -1) {
                return null;
            }
            return CompactHashMap.this.b[this.b];
        }

        public final V setValue(V v) {
            a();
            if (this.b == -1) {
                CompactHashMap.this.put(this.a, v);
                return null;
            }
            V v2 = CompactHashMap.this.b[this.b];
            CompactHashMap.this.b[this.b] = v;
            return v2;
        }
    }

    class e extends AbstractCollection<V> {
        e() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final Iterator<V> iterator() {
            return new b<V>() {
                /* access modifiers changed from: 0000 */
                public final V a(int i) {
                    return CompactHashMap.this.b[i];
                }
            };
        }

        public final int size() {
            return CompactHashMap.this.h;
        }
    }

    CompactHashMap() {
        a(3, 1.0f);
    }

    private CompactHashMap(int i2) {
        this(i2, 1.0f);
    }

    CompactHashMap(int i2, float f2) {
        a(i2, f2);
    }

    /* access modifiers changed from: private */
    public int a(Object obj) {
        int a2 = fdc.a(obj);
        int[] iArr = this.d;
        int i2 = iArr[(iArr.length - 1) & a2];
        while (i2 != -1) {
            long j2 = this.e[i2];
            if (((int) (j2 >>> 32)) == a2 && fbn.a(obj, this.a[i2])) {
                return i2;
            }
            i2 = (int) j2;
        }
        return -1;
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    public static <K, V> CompactHashMap<K, V> a() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> a(int i2) {
        return new CompactHashMap<>(i2);
    }

    /* access modifiers changed from: private */
    public V a(Object obj, int i2) {
        int[] iArr = this.d;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.e[i3] >>> 32)) != i2 || !fbn.a(obj, this.a[i3])) {
                int i5 = (int) this.e[i3];
                if (i5 == -1) {
                    return null;
                }
                int i6 = i5;
                i4 = i3;
                i3 = i6;
            } else {
                V v = this.b[i3];
                if (i4 == -1) {
                    this.d[length] = (int) this.e[i3];
                } else {
                    long[] jArr = this.e;
                    jArr[i4] = a(jArr[i4], (int) jArr[i3]);
                }
                d(i3);
                this.h--;
                this.c++;
                return v;
            }
        }
    }

    private static int[] f(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void g(int i2) {
        if (this.d.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f)) + 1;
        int[] f2 = f(i2);
        long[] jArr = this.e;
        int length = f2.length - 1;
        for (int i4 = 0; i4 < this.h; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & length;
            int i7 = f2[i6];
            f2[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.g = i3;
        this.d = f2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.h);
        for (int i2 = 0; i2 < this.h; i2++) {
            objectOutputStream.writeObject(this.a[i2]);
            objectOutputStream.writeObject(this.b[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2) {
        boolean z = false;
        fbp.a(i2 >= 0, (Object) "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z = true;
        }
        fbp.a(z, (Object) "Illegal load factor");
        int a2 = fdc.a(i2, (double) f2);
        this.d = f(a2);
        this.f = f2;
        this.a = new Object[i2];
        this.b = new Object[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1);
        this.e = jArr;
        this.g = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, K k2, V v, int i3) {
        this.e[i2] = (((long) i3) << 32) | 4294967295L;
        this.a[i2] = k2;
        this.b[i2] = v;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        this.a = Arrays.copyOf(this.a, i2);
        this.b = Arrays.copyOf(this.b, i2);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.e = copyOf;
    }

    public void clear() {
        this.c++;
        Arrays.fill(this.a, 0, this.h, null);
        Arrays.fill(this.b, 0, this.h, null);
        Arrays.fill(this.d, -1);
        Arrays.fill(this.e, -1);
        this.h = 0;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        for (int i2 = 0; i2 < this.h; i2++) {
            if (fbn.a(obj, this.b[i2])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.a;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.b;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.e;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int i3 = (int) (j2 >>> 32);
            int[] iArr = this.d;
            int length = i3 & (iArr.length - 1);
            int i4 = iArr[length];
            if (i4 == size) {
                iArr[length] = i2;
            } else {
                while (true) {
                    long[] jArr2 = this.e;
                    long j3 = jArr2[i4];
                    int i5 = (int) j3;
                    if (i5 == size) {
                        jArr2[i4] = a(j3, i2);
                        return;
                    }
                    i4 = i5;
                }
            }
        } else {
            this.a[i2] = null;
            this.b[i2] = null;
            this.e[i2] = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int e(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.h) {
            return i3;
        }
        return -1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.j = aVar;
        return aVar;
    }

    public V get(Object obj) {
        int a2 = a(obj);
        b(a2);
        if (a2 == -1) {
            return null;
        }
        return this.b[a2];
    }

    public boolean isEmpty() {
        return this.h == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.i = cVar;
        return cVar;
    }

    public V put(K k2, V v) {
        long[] jArr = this.e;
        Object[] objArr = this.a;
        V[] vArr = this.b;
        int a2 = fdc.a((Object) k2);
        int[] iArr = this.d;
        int length = (iArr.length - 1) & a2;
        int i2 = this.h;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (((int) (j2 >>> 32)) != a2 || !fbn.a(k2, objArr[i3])) {
                    int i4 = (int) j2;
                    if (i4 == -1) {
                        jArr[i3] = a(j2, i2);
                        break;
                    }
                    i3 = i4;
                } else {
                    V v2 = vArr[i3];
                    vArr[i3] = v;
                    b(i3);
                    return v2;
                }
            }
        }
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            int length2 = this.e.length;
            if (i6 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i5 = max;
                }
                if (i5 != length2) {
                    c(i5);
                }
            }
            a(i2, k2, v, a2);
            this.h = i6;
            if (i2 >= this.g) {
                g(this.d.length * 2);
            }
            this.c++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public V remove(Object obj) {
        return a(obj, fdc.a(obj));
    }

    public int size() {
        return this.h;
    }

    public Collection<V> values() {
        Collection<V> collection = this.k;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.k = eVar;
        return eVar;
    }
}
