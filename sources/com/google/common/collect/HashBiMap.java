package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    transient K[] a;
    transient V[] b;
    transient int c;
    transient int d;
    private transient int[] e;
    private transient int[] f;
    private transient int[] g;
    private transient int[] h;
    /* access modifiers changed from: private */
    public transient int i;
    private transient int j;
    private transient int[] k;
    /* access modifiers changed from: private */
    public transient int[] l;
    private transient Set<K> m;
    private transient Set<V> n;
    private transient Set<Entry<K, V>> o;
    /* access modifiers changed from: private */
    public transient BiMap<V, K> p;

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private transient Set<Entry<V, K>> a;
        private final HashBiMap<K, V> forward;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.forward.p = this;
        }

        public void clear() {
            this.forward.clear();
        }

        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        public Set<Entry<V, K>> entrySet() {
            Set<Entry<V, K>> set = this.a;
            if (set != null) {
                return set;
            }
            d dVar = new d(this.forward);
            this.a = dVar;
            return dVar;
        }

        public K forcePut(V v, K k) {
            return this.forward.a(v, k, true);
        }

        public K get(Object obj) {
            HashBiMap<K, V> hashBiMap = this.forward;
            int b = hashBiMap.b(obj);
            if (b == -1) {
                return null;
            }
            return hashBiMap.a[b];
        }

        public BiMap<K, V> inverse() {
            return this.forward;
        }

        public Set<V> keySet() {
            return this.forward.values();
        }

        public K put(V v, K k) {
            return this.forward.a(v, k, false);
        }

        public K remove(Object obj) {
            HashBiMap<K, V> hashBiMap = this.forward;
            int a2 = fdc.a(obj);
            int b = hashBiMap.b(obj, a2);
            if (b == -1) {
                return null;
            }
            K k = hashBiMap.a[b];
            hashBiMap.b(b, a2);
            return k;
        }

        public int size() {
            return this.forward.c;
        }

        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    final class a extends fcf<K, V> {
        private K a;
        private int b;

        a(int i) {
            this.a = HashBiMap.this.a[i];
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i > HashBiMap.this.c || !fbn.a(HashBiMap.this.a[this.b], this.a)) {
                this.b = HashBiMap.this.a((Object) this.a);
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
            return HashBiMap.this.b[this.b];
        }

        public final V setValue(V v) {
            a();
            if (this.b == -1) {
                return HashBiMap.this.put(this.a, v);
            }
            V v2 = HashBiMap.this.b[this.b];
            if (fbn.a(v2, v)) {
                return v;
            }
            HashBiMap.this.a(this.b, v, false);
            return v2;
        }
    }

    static final class b<K, V> extends fcf<V, K> {
        private HashBiMap<K, V> a;
        private V b;
        private int c;

        b(HashBiMap<K, V> hashBiMap, int i) {
            this.a = hashBiMap;
            this.b = hashBiMap.b[i];
            this.c = i;
        }

        private void a() {
            int i = this.c;
            if (i == -1 || i > this.a.c || !fbn.a(this.b, this.a.b[this.c])) {
                this.c = this.a.b((Object) this.b);
            }
        }

        public final V getKey() {
            return this.b;
        }

        public final K getValue() {
            a();
            if (this.c == -1) {
                return null;
            }
            return this.a.a[this.c];
        }

        public final K setValue(K k) {
            a();
            if (this.c == -1) {
                return this.a.a(this.b, k, false);
            }
            K k2 = this.a.a[this.c];
            if (fbn.a(k2, k)) {
                return k;
            }
            this.a.b(this.c, k, false);
            return k2;
        }
    }

    final class c extends g<K, V, Entry<K, V>> {
        c() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object a(int i) {
            return new a(i);
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int a = HashBiMap.this.a(key);
                if (a != -1 && fbn.a(value, HashBiMap.this.b[a])) {
                    return true;
                }
            }
            return false;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int a = fdc.a(key);
                int a2 = HashBiMap.this.a(key, a);
                if (a2 != -1 && fbn.a(value, HashBiMap.this.b[a2])) {
                    HashBiMap.this.a(a2, a);
                    return true;
                }
            }
            return false;
        }
    }

    static class d<K, V> extends g<K, V, Entry<V, K>> {
        d(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object a(int i) {
            return new b(this.a, i);
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int b = this.a.b(key);
                if (b != -1 && fbn.a(this.a.a[b], value)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int a = fdc.a(key);
                int b = this.a.b(key, a);
                if (b != -1 && fbn.a(this.a.a[b], value)) {
                    this.a.b(b, a);
                    return true;
                }
            }
            return false;
        }
    }

    final class e extends g<K, V, K> {
        e() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: 0000 */
        public final K a(int i) {
            return HashBiMap.this.a[i];
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a = fdc.a(obj);
            int a2 = HashBiMap.this.a(obj, a);
            if (a2 == -1) {
                return false;
            }
            HashBiMap.this.a(a2, a);
            return true;
        }
    }

    final class f extends g<K, V, V> {
        f() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: 0000 */
        public final V a(int i) {
            return HashBiMap.this.b[i];
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public final boolean remove(Object obj) {
            int a = fdc.a(obj);
            int b2 = HashBiMap.this.b(obj, a);
            if (b2 == -1) {
                return false;
            }
            HashBiMap.this.b(b2, a);
            return true;
        }
    }

    static abstract class g<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> a;

        g(HashBiMap<K, V> hashBiMap) {
            this.a = hashBiMap;
        }

        /* access modifiers changed from: 0000 */
        public abstract T a(int i);

        public void clear() {
            this.a.clear();
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int a = g.this.a.i;
                private int b = -1;
                private int c = g.this.a.d;
                private int d = g.this.a.c;

                private void a() {
                    if (g.this.a.d != this.c) {
                        throw new ConcurrentModificationException();
                    }
                }

                public final boolean hasNext() {
                    a();
                    return this.a != -2 && this.d > 0;
                }

                public final T next() {
                    if (hasNext()) {
                        T a2 = g.this.a(this.a);
                        this.b = this.a;
                        this.a = g.this.a.l[this.a];
                        this.d--;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }

                public final void remove() {
                    a();
                    fbp.b(this.b != -1, "no calls to next() since the last call to remove()");
                    HashBiMap<K, V> hashBiMap = g.this.a;
                    int i = this.b;
                    hashBiMap.a(i, fdc.a((Object) hashBiMap.a[i]));
                    if (this.a == g.this.a.c) {
                        this.a = this.b;
                    }
                    this.b = -1;
                    this.c = g.this.a.d;
                }
            };
        }

        public int size() {
            return this.a.c;
        }
    }

    private HashBiMap(int i2) {
        a(i2);
    }

    private int a(Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[d(i2)];
        while (i3 != -1) {
            if (fbn.a(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    public static <K, V> HashBiMap<K, V> a() {
        return new HashBiMap<>(16);
    }

    private void a(int i2) {
        fcl.a(i2, "expectedSize");
        int a2 = fdc.a(i2, 1.0d);
        this.c = 0;
        this.a = (Object[]) new Object[i2];
        this.b = (Object[]) new Object[i2];
        this.e = b(a2);
        this.f = b(a2);
        this.g = b(i2);
        this.h = b(i2);
        this.i = -2;
        this.j = -2;
        this.k = b(i2);
        this.l = b(i2);
    }

    private void a(int i2, int i3, int i4) {
        int i5;
        int i6;
        fbp.a(i2 != -1);
        f(i2, i3);
        g(i2, i4);
        c(this.k[i2], this.l[i2]);
        int i7 = this.c - 1;
        if (i7 != i2) {
            int i8 = this.k[i7];
            int i9 = this.l[i7];
            c(i8, i2);
            c(i2, i9);
            K[] kArr = this.a;
            K k2 = kArr[i7];
            V[] vArr = this.b;
            V v = vArr[i7];
            kArr[i2] = k2;
            vArr[i2] = v;
            int d2 = d(fdc.a((Object) k2));
            int[] iArr = this.e;
            if (iArr[d2] == i7) {
                iArr[d2] = i2;
            } else {
                int i10 = iArr[d2];
                int i11 = this.g[i10];
                while (true) {
                    int i12 = i11;
                    i6 = i10;
                    i10 = i12;
                    if (i10 == i7) {
                        break;
                    }
                    i11 = this.g[i10];
                }
                this.g[i6] = i2;
            }
            int[] iArr2 = this.g;
            iArr2[i2] = iArr2[i7];
            iArr2[i7] = -1;
            int d3 = d(fdc.a((Object) v));
            int[] iArr3 = this.f;
            if (iArr3[d3] == i7) {
                iArr3[d3] = i2;
            } else {
                int i13 = iArr3[d3];
                int i14 = this.h[i13];
                while (true) {
                    int i15 = i14;
                    i5 = i13;
                    i13 = i15;
                    if (i13 == i7) {
                        break;
                    }
                    i14 = this.h[i13];
                }
                this.h[i5] = i2;
            }
            int[] iArr4 = this.h;
            iArr4[i2] = iArr4[i7];
            iArr4[i7] = -1;
        }
        K[] kArr2 = this.a;
        int i16 = this.c;
        kArr2[i16 - 1] = null;
        this.b[i16 - 1] = null;
        this.c = i16 - 1;
        this.d++;
    }

    /* access modifiers changed from: private */
    public void a(int i2, V v, boolean z) {
        fbp.a(i2 != -1);
        int a2 = fdc.a((Object) v);
        int b2 = b((Object) v, a2);
        if (b2 != -1) {
            if (z) {
                b(b2, a2);
                if (i2 == this.c) {
                    i2 = b2;
                }
            } else {
                StringBuilder sb = new StringBuilder("Value already present in map: ");
                sb.append(v);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        g(i2, fdc.a((Object) this.b[i2]));
        this.b[i2] = v;
        e(i2, a2);
    }

    private static int[] a(int[] iArr, int i2) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(copyOf, length, i2, -1);
        return copyOf;
    }

    private V b(K k2, V v, boolean z) {
        int a2 = fdc.a((Object) k2);
        int a3 = a((Object) k2, a2);
        if (a3 != -1) {
            V v2 = this.b[a3];
            if (fbn.a(v2, v)) {
                return v;
            }
            a(a3, v, z);
            return v2;
        }
        int a4 = fdc.a((Object) v);
        int b2 = b((Object) v, a4);
        if (!z) {
            fbp.a(b2 == -1, "Value already present: %s", (Object) v);
        } else if (b2 != -1) {
            b(b2, a4);
        }
        c(this.c + 1);
        K[] kArr = this.a;
        int i2 = this.c;
        kArr[i2] = k2;
        this.b[i2] = v;
        d(i2, a2);
        e(this.c, a4);
        c(this.j, this.c);
        c(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    /* access modifiers changed from: private */
    public void b(int i2, K k2, boolean z) {
        int i3;
        int i4;
        fbp.a(i2 != -1);
        int a2 = fdc.a((Object) k2);
        int a3 = a((Object) k2, a2);
        int i5 = this.j;
        if (a3 == -1) {
            i3 = i5;
            i4 = -2;
        } else if (z) {
            i3 = this.k[a3];
            i4 = this.l[a3];
            a(a3, a2);
            if (i2 == this.c) {
                i2 = a3;
            }
        } else {
            StringBuilder sb = new StringBuilder("Key already present in map: ");
            sb.append(k2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 == i2) {
            i3 = this.k[i2];
        } else if (i3 == this.c) {
            i3 = a3;
        }
        if (i4 == i2) {
            a3 = this.l[i2];
        } else if (i4 != this.c) {
            a3 = i4;
        }
        c(this.k[i2], this.l[i2]);
        f(i2, fdc.a((Object) this.a[i2]));
        this.a[i2] = k2;
        d(i2, fdc.a((Object) k2));
        c(i3, i2);
        c(i2, a3);
    }

    private static int[] b(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void c(int i2) {
        int[] iArr = this.g;
        if (iArr.length < i2) {
            int a2 = com.google.common.collect.ImmutableCollection.b.a(iArr.length, i2);
            this.a = Arrays.copyOf(this.a, a2);
            this.b = Arrays.copyOf(this.b, a2);
            this.g = a(this.g, a2);
            this.h = a(this.h, a2);
            this.k = a(this.k, a2);
            this.l = a(this.l, a2);
        }
        if (this.e.length < i2) {
            int a3 = fdc.a(i2, 1.0d);
            this.e = b(a3);
            this.f = b(a3);
            for (int i3 = 0; i3 < this.c; i3++) {
                int d2 = d(fdc.a((Object) this.a[i3]));
                int[] iArr2 = this.g;
                int[] iArr3 = this.e;
                iArr2[i3] = iArr3[d2];
                iArr3[d2] = i3;
                int d3 = d(fdc.a((Object) this.b[i3]));
                int[] iArr4 = this.h;
                int[] iArr5 = this.f;
                iArr4[i3] = iArr5[d3];
                iArr5[d3] = i3;
            }
        }
    }

    private void c(int i2, int i3) {
        if (i2 == -2) {
            this.i = i3;
        } else {
            this.l[i2] = i3;
        }
        if (i3 == -2) {
            this.j = i2;
        } else {
            this.k[i3] = i2;
        }
    }

    private int d(int i2) {
        return i2 & (this.e.length - 1);
    }

    private void d(int i2, int i3) {
        fbp.a(i2 != -1);
        int d2 = d(i3);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i2] = iArr2[d2];
        iArr2[d2] = i2;
    }

    private void e(int i2, int i3) {
        fbp.a(i2 != -1);
        int d2 = d(i3);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i2] = iArr2[d2];
        iArr2[d2] = i2;
    }

    private void f(int i2, int i3) {
        fbp.a(i2 != -1);
        int d2 = d(i3);
        int[] iArr = this.e;
        if (iArr[d2] == i2) {
            int[] iArr2 = this.g;
            iArr[d2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[d2];
        int i5 = this.g[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with key ");
                sb.append(this.a[i2]);
                throw new AssertionError(sb.toString());
            } else if (i4 == i2) {
                int[] iArr3 = this.g;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            } else {
                i5 = this.g[i4];
            }
        }
    }

    private void g(int i2, int i3) {
        fbp.a(i2 != -1);
        int d2 = d(i3);
        int[] iArr = this.f;
        if (iArr[d2] == i2) {
            int[] iArr2 = this.h;
            iArr[d2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[d2];
        int i5 = this.h[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with value ");
                sb.append(this.b[i2]);
                throw new AssertionError(sb.toString());
            } else if (i4 == i2) {
                int[] iArr3 = this.h;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            } else {
                i5 = this.h[i4];
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        a(16);
        fdn.a((Map<K, V>) this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        fdn.a((Map<K, V>) this, objectOutputStream);
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object obj) {
        return a(obj, fdc.a(obj));
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object obj, int i2) {
        return a(obj, i2, this.e, this.g, this.a);
    }

    /* access modifiers changed from: 0000 */
    public final K a(V v, K k2, boolean z) {
        int a2 = fdc.a((Object) v);
        int b2 = b((Object) v, a2);
        if (b2 != -1) {
            K k3 = this.a[b2];
            if (fbn.a(k3, k2)) {
                return k2;
            }
            b(b2, k2, z);
            return k3;
        }
        int i2 = this.j;
        int a3 = fdc.a((Object) k2);
        int a4 = a((Object) k2, a3);
        if (!z) {
            fbp.a(a4 == -1, "Key already present: %s", (Object) k2);
        } else if (a4 != -1) {
            i2 = this.k[a4];
            a(a4, a3);
        }
        c(this.c + 1);
        K[] kArr = this.a;
        int i3 = this.c;
        kArr[i3] = k2;
        this.b[i3] = v;
        d(i3, a3);
        e(this.c, a2);
        int i4 = i2 == -2 ? this.i : this.l[i2];
        c(i2, this.c);
        c(this.c, i4);
        this.c++;
        this.d++;
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3) {
        a(i2, i3, fdc.a((Object) this.b[i2]));
    }

    /* access modifiers changed from: 0000 */
    public final int b(Object obj) {
        return b(obj, fdc.a(obj));
    }

    /* access modifiers changed from: 0000 */
    public final int b(Object obj, int i2) {
        return a(obj, i2, this.f, this.h, this.b);
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, int i3) {
        a(i2, fdc.a((Object) this.a[i2]), i3);
    }

    public final void clear() {
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, null);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.g, 0, this.c, -1);
        Arrays.fill(this.h, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        this.c = 0;
        this.i = -2;
        this.j = -2;
        this.d++;
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) != -1;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.o = cVar;
        return cVar;
    }

    public final V forcePut(K k2, V v) {
        return b(k2, v, true);
    }

    public final V get(Object obj) {
        int a2 = a(obj);
        if (a2 == -1) {
            return null;
        }
        return this.b[a2];
    }

    public final BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.p;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.p = inverse;
        return inverse;
    }

    public final Set<K> keySet() {
        Set<K> set = this.m;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.m = eVar;
        return eVar;
    }

    public final V put(K k2, V v) {
        return b(k2, v, false);
    }

    public final V remove(Object obj) {
        int a2 = fdc.a(obj);
        int a3 = a(obj, a2);
        if (a3 == -1) {
            return null;
        }
        V v = this.b[a3];
        a(a3, a2);
        return v;
    }

    public final int size() {
        return this.c;
    }

    public final Set<V> values() {
        Set<V> set = this.n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.n = fVar;
        return fVar;
    }
}
