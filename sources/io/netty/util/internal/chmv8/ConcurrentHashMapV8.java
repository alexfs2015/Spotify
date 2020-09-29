package io.netty.util.internal.chmv8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

public class ConcurrentHashMapV8<K, V> implements Serializable, ConcurrentMap<K, V> {
    private static int b = Runtime.getRuntime().availableProcessors();
    private static AtomicInteger m = new AtomicInteger();
    private static final Unsafe n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("segments", Segment[].class), new ObjectStreamField("segmentMask", Integer.TYPE), new ObjectStreamField("segmentShift", Integer.TYPE)};
    private static final long serialVersionUID = 7249069246763182397L;
    private static final long t;
    private static final long u;
    private static final int v;
    volatile transient g<K, V>[] a;
    private volatile transient g<K, V>[] c;
    private volatile transient long d;
    private volatile transient int e;
    private volatile transient int f;
    private volatile transient int g;
    private volatile transient int h;
    private volatile transient b[] i;
    private transient KeySetView<K, V> j;
    private transient ValuesView<K, V> k;
    private transient EntrySetView<K, V> l;

    static abstract class CollectionView<K, V, E> implements Serializable, Collection<E> {
        private static final long serialVersionUID = 7249069246763182397L;
        final ConcurrentHashMapV8<K, V> map;

        CollectionView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            this.map = concurrentHashMapV8;
        }

        public final void clear() {
            this.map.clear();
        }

        public abstract boolean contains(Object obj);

        public final boolean containsAll(Collection<?> collection) {
            if (collection != this) {
                for (Object next : collection) {
                    if (next != null) {
                        if (!contains(next)) {
                        }
                    }
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        public abstract Iterator<E> iterator();

        public final boolean removeAll(Collection<?> collection) {
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final int size() {
            return this.map.size();
        }

        public final Object[] toArray() {
            long a = this.map.a();
            String str = "Required array size too large";
            if (a <= 2147483639) {
                int i = (int) a;
                Object[] objArr = new Object[i];
                int i2 = 0;
                Iterator it = iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i2 == i) {
                        int i3 = 2147483639;
                        if (i < 2147483639) {
                            if (i < 1073741819) {
                                i3 = (i >>> 1) + 1 + i;
                            }
                            objArr = Arrays.copyOf(objArr, i3);
                            i = i3;
                        } else {
                            throw new OutOfMemoryError(str);
                        }
                    }
                    int i4 = i2 + 1;
                    objArr[i2] = next;
                    i2 = i4;
                }
                return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
            }
            throw new OutOfMemoryError(str);
        }

        public final <T> T[] toArray(T[] tArr) {
            long a = this.map.a();
            String str = "Required array size too large";
            if (a <= 2147483639) {
                int i = (int) a;
                T[] tArr2 = tArr.length >= i ? tArr : (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
                int length = tArr2.length;
                int i2 = 0;
                Iterator it = iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    if (i2 == length) {
                        int i3 = 2147483639;
                        if (length < 2147483639) {
                            if (length < 1073741819) {
                                i3 = (length >>> 1) + 1 + length;
                            }
                            tArr2 = Arrays.copyOf(tArr2, i3);
                            length = i3;
                        } else {
                            throw new OutOfMemoryError(str);
                        }
                    }
                    int i4 = i2 + 1;
                    tArr2[i2] = next;
                    i2 = i4;
                }
                if (tArr != tArr2 || i2 >= length) {
                    return i2 == length ? tArr2 : Arrays.copyOf(tArr2, i2);
                }
                tArr2[i2] = null;
                return tArr2;
            }
            throw new OutOfMemoryError(str);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(',');
                    sb.append(' ');
                }
            }
            sb.append(']');
            return sb.toString();
        }
    }

    static final class EntrySetView<K, V> extends CollectionView<K, V, Entry<K, V>> implements Serializable, Set<Entry<K, V>> {
        private static final long serialVersionUID = 2249069246763182397L;

        EntrySetView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(concurrentHashMapV8);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            return this.map.a(entry.getKey(), entry.getValue(), false) == null;
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            boolean z = false;
            for (Entry a : collection) {
                if (add(a)) {
                    z = true;
                }
            }
            return z;
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    Object obj2 = this.map.get(key);
                    if (obj2 != null) {
                        Object value = entry.getValue();
                        if (value != null && (value == obj2 || value.equals(obj2))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set == this || (containsAll(set) && set.containsAll(this))) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            g<K, V>[] gVarArr = this.map.a;
            int i = 0;
            if (gVarArr != null) {
                h hVar = new h(gVarArr, gVarArr.length, 0, gVarArr.length);
                while (true) {
                    g a = hVar.a();
                    if (a == null) {
                        break;
                    }
                    i += a.hashCode();
                }
            }
            return i;
        }

        public final Iterator<Entry<K, V>> iterator() {
            ConcurrentHashMapV8 concurrentHashMapV8 = this.map;
            g<K, V>[] gVarArr = concurrentHashMapV8.a;
            int length = gVarArr == null ? 0 : gVarArr.length;
            c cVar = new c(gVarArr, length, 0, length, concurrentHashMapV8);
            return cVar;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    Object value = entry.getValue();
                    if (value != null && this.map.remove(key, value)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class KeySetView<K, V> extends CollectionView<K, V, K> implements Serializable, Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        private final V value = null;

        KeySetView(ConcurrentHashMapV8<K, V> concurrentHashMapV8, V v) {
            super(concurrentHashMapV8);
        }

        public boolean add(K k) {
            V v = this.value;
            if (v != null) {
                return this.map.a(k, v, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            V v = this.value;
            if (v != null) {
                boolean z = false;
                for (Object a : collection) {
                    if (this.map.a(a, v, true) == null) {
                        z = true;
                    }
                }
                return z;
            }
            throw new UnsupportedOperationException();
        }

        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set == this || (containsAll(set) && set.containsAll(this))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().hashCode();
            }
            return i;
        }

        public Iterator<K> iterator() {
            ConcurrentHashMapV8 concurrentHashMapV8 = this.map;
            g<K, V>[] gVarArr = concurrentHashMapV8.a;
            int length = gVarArr == null ? 0 : gVarArr.length;
            e eVar = new e(gVarArr, length, 0, length, concurrentHashMapV8);
            return eVar;
        }

        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }
    }

    static class Segment<K, V> extends ReentrantLock implements Serializable {
        private static final long serialVersionUID = 2249069246763182397L;
        final float loadFactor = 0.75f;

        Segment(float f) {
        }
    }

    static final class ValuesView<K, V> extends CollectionView<K, V, V> implements Serializable, Collection<V> {
        private static final long serialVersionUID = 2249069246763182397L;

        ValuesView(ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(concurrentHashMapV8);
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        public final Iterator<V> iterator() {
            ConcurrentHashMapV8 concurrentHashMapV8 = this.map;
            g<K, V>[] gVarArr = concurrentHashMapV8.a;
            int length = gVarArr == null ? 0 : gVarArr.length;
            k kVar = new k(gVarArr, length, 0, length, concurrentHashMapV8);
            return kVar;
        }

        public final boolean remove(Object obj) {
            if (obj != null) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (obj.equals(it.next())) {
                        it.remove();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static class a<K, V> extends h<K, V> {
        final ConcurrentHashMapV8<K, V> a;
        g<K, V> b;

        a(g<K, V>[] gVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(gVarArr, i, i2, i3);
            this.a = concurrentHashMapV8;
            a();
        }

        public final boolean hasMoreElements() {
            return this.c != null;
        }

        public final boolean hasNext() {
            return this.c != null;
        }

        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar != null) {
                this.b = null;
                this.a.a((Object) gVar.c, null, (Object) null);
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class b {
        volatile long a;

        b(long j) {
            this.a = j;
        }
    }

    static final class c<K, V> extends a<K, V> implements Iterator<Entry<K, V>> {
        c(g<K, V>[] gVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(gVarArr, i, 0, i3, concurrentHashMapV8);
        }

        public final /* synthetic */ Object next() {
            g gVar = this.c;
            if (gVar != null) {
                K k = gVar.c;
                V v = gVar.d;
                this.b = gVar;
                a();
                return new f(k, v, this.a);
            }
            throw new NoSuchElementException();
        }
    }

    static final class d<K, V> extends g<K, V> {
        final g<K, V>[] a;

        d(g<K, V>[] gVarArr) {
            super(-1, null, null, null);
            this.a = gVarArr;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
            if ((r0 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.d) == false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
            r0 = ((io.netty.util.internal.chmv8.ConcurrentHashMapV8.d) r0).a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            return r0.a(r5, r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V> a(int r5, java.lang.Object r6) {
            /*
                r4 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r0 = r4.a
            L_0x0002:
                r1 = 0
                if (r6 == 0) goto L_0x0039
                if (r0 == 0) goto L_0x0039
                int r2 = r0.length
                if (r2 == 0) goto L_0x0039
                int r2 = r2 + -1
                r2 = r2 & r5
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r2)
                if (r0 != 0) goto L_0x0014
                goto L_0x0039
            L_0x0014:
                int r2 = r0.b
                if (r2 != r5) goto L_0x0025
                K r3 = r0.c
                if (r3 == r6) goto L_0x0024
                if (r3 == 0) goto L_0x0025
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x0025
            L_0x0024:
                return r0
            L_0x0025:
                if (r2 >= 0) goto L_0x0035
                boolean r1 = r0 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.d
                if (r1 == 0) goto L_0x0030
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$d r0 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.d) r0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r0 = r0.a
                goto L_0x0002
            L_0x0030:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r5 = r0.a(r5, r6)
                return r5
            L_0x0035:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r0 = r0.e
                if (r0 != 0) goto L_0x0014
            L_0x0039:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.d.a(int, java.lang.Object):io.netty.util.internal.chmv8.ConcurrentHashMapV8$g");
        }
    }

    static final class e<K, V> extends a<K, V> implements Enumeration<K>, Iterator<K> {
        e(g<K, V>[] gVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(gVarArr, i, 0, i3, concurrentHashMapV8);
        }

        public final K next() {
            g gVar = this.c;
            if (gVar != null) {
                K k = gVar.c;
                this.b = gVar;
                a();
                return k;
            }
            throw new NoSuchElementException();
        }

        public final K nextElement() {
            return next();
        }
    }

    static final class f<K, V> implements Entry<K, V> {
        private K a;
        private V b;
        private ConcurrentHashMapV8<K, V> c;

        f(K k, V v, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            this.a = k;
            this.b = v;
            this.c = concurrentHashMapV8;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                K key = entry.getKey();
                if (key != null) {
                    V value = entry.getValue();
                    if (value != null) {
                        K k = this.a;
                        if (key == k || key.equals(k)) {
                            V v = this.b;
                            if (value == v || value.equals(v)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final K getKey() {
            return this.a;
        }

        public final V getValue() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public final V setValue(V v) {
            if (v != null) {
                V v2 = this.b;
                this.b = v;
                this.c.put(this.a, v);
                return v2;
            }
            throw new NullPointerException();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("=");
            sb.append(this.b);
            return sb.toString();
        }
    }

    static class g<K, V> implements Entry<K, V> {
        final int b;
        final K c;
        volatile V d;
        volatile g<K, V> e;

        g(int i, K k, V v, g<K, V> gVar) {
            this.b = i;
            this.c = k;
            this.d = v;
            this.e = gVar;
        }

        /* access modifiers changed from: 0000 */
        public g<K, V> a(int i, Object obj) {
            if (obj != null) {
                g gVar = this;
                do {
                    if (gVar.b == i) {
                        K k = gVar.c;
                        if (k == obj || (k != null && obj.equals(k))) {
                            return gVar;
                        }
                    }
                    gVar = gVar.e;
                } while (gVar != null);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                K key = entry.getKey();
                if (key != null) {
                    V value = entry.getValue();
                    if (value != null) {
                        K k = this.c;
                        if (key == k || key.equals(k)) {
                            V v = this.d;
                            if (value == v || value.equals(v)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final K getKey() {
            return this.c;
        }

        public final V getValue() {
            return this.d;
        }

        public final int hashCode() {
            return this.c.hashCode() ^ this.d.hashCode();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("=");
            sb.append(this.d);
            return sb.toString();
        }
    }

    static class h<K, V> {
        private g<K, V>[] a;
        private int b;
        g<K, V> c = null;
        private int d;
        private int e;
        private int f;

        h(g<K, V>[] gVarArr, int i, int i2, int i3) {
            this.a = gVarArr;
            this.f = i;
            this.b = i2;
            this.d = i2;
            this.e = i3;
        }

        /* access modifiers changed from: 0000 */
        public final g<K, V> a() {
            g<K, V> gVar;
            g<K, V> gVar2 = this.c;
            if (gVar2 != null) {
                gVar2 = gVar2.e;
            }
            while (gVar == null) {
                if (this.d < this.e) {
                    g<K, V>[] gVarArr = this.a;
                    if (gVarArr != null) {
                        int length = gVarArr.length;
                        int i = this.b;
                        if (length > i && i >= 0) {
                            gVar = ConcurrentHashMapV8.a(gVarArr, i);
                            if (gVar != null && gVar.b < 0) {
                                if (gVar instanceof d) {
                                    this.a = ((d) gVar).a;
                                    gVar = null;
                                } else {
                                    gVar = gVar instanceof i ? ((i) gVar).f : null;
                                }
                            }
                            int i2 = this.b + this.f;
                            this.b = i2;
                            if (i2 >= length) {
                                int i3 = this.d + 1;
                                this.d = i3;
                                this.b = i3;
                            }
                        }
                    }
                }
                this.c = null;
                return null;
            }
            this.c = gVar;
            return gVar;
        }
    }

    static final class i<K, V> extends g<K, V> {
        private static final Unsafe h;
        private static final long i;
        private static /* synthetic */ boolean j = (!ConcurrentHashMapV8.class.desiredAssertionStatus());
        j<K, V> a;
        volatile j<K, V> f;
        private volatile int g;

        static {
            try {
                h = ConcurrentHashMapV8.e();
                i = h.objectFieldOffset(i.class.getDeclaredField("lockState"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        i(j<K, V> jVar) {
            int i2;
            super(-2, null, null, null);
            this.f = jVar;
            j<K, V> jVar2 = null;
            while (jVar != null) {
                j<K, V> jVar3 = (j) jVar.e;
                jVar.g = null;
                jVar.f = null;
                if (jVar2 == null) {
                    jVar.a = null;
                    jVar.i = false;
                } else {
                    Object obj = jVar.c;
                    int i3 = jVar.b;
                    Class cls = null;
                    j<K, V> jVar4 = jVar2;
                    while (true) {
                        int i4 = jVar4.b;
                        if (i4 > i3) {
                            i2 = -1;
                        } else if (i4 < i3) {
                            i2 = 1;
                        } else {
                            if (cls == null) {
                                cls = ConcurrentHashMapV8.a(obj);
                                if (cls == null) {
                                    i2 = 0;
                                }
                            }
                            i2 = ConcurrentHashMapV8.a(cls, obj, jVar4.c);
                        }
                        j<K, V> jVar5 = i2 <= 0 ? jVar4.f : jVar4.g;
                        if (jVar5 == null) {
                            break;
                        }
                        jVar4 = jVar5;
                    }
                    jVar.a = jVar4;
                    if (i2 <= 0) {
                        jVar4.f = jVar;
                    } else {
                        jVar4.g = jVar;
                    }
                    jVar = c(jVar2, jVar);
                }
                jVar2 = jVar;
                jVar = jVar3;
            }
            this.a = jVar2;
        }

        private static <K, V> j<K, V> a(j<K, V> jVar, j<K, V> jVar2) {
            if (jVar2 != null) {
                j<K, V> jVar3 = jVar2.g;
                if (jVar3 != null) {
                    j<K, V> jVar4 = jVar3.f;
                    jVar2.g = jVar4;
                    if (jVar4 != null) {
                        jVar4.a = jVar2;
                    }
                    j<K, V> jVar5 = jVar2.a;
                    jVar3.a = jVar5;
                    if (jVar5 == null) {
                        jVar3.i = false;
                        jVar = jVar3;
                    } else if (jVar5.f == jVar2) {
                        jVar5.f = jVar3;
                    } else {
                        jVar5.g = jVar3;
                    }
                    jVar3.f = jVar2;
                    jVar2.a = jVar3;
                }
            }
            return jVar;
        }

        private final void a() {
            if (!h.compareAndSwapInt(this, i, 0, 1)) {
                do {
                    int i2 = this.g;
                } while (!h.compareAndSwapInt(this, i, 0, 1));
            }
        }

        private static <K, V> j<K, V> b(j<K, V> jVar, j<K, V> jVar2) {
            if (jVar2 != null) {
                j<K, V> jVar3 = jVar2.f;
                if (jVar3 != null) {
                    j<K, V> jVar4 = jVar3.g;
                    jVar2.f = jVar4;
                    if (jVar4 != null) {
                        jVar4.a = jVar2;
                    }
                    j<K, V> jVar5 = jVar2.a;
                    jVar3.a = jVar5;
                    if (jVar5 == null) {
                        jVar3.i = false;
                        jVar = jVar3;
                    } else if (jVar5.g == jVar2) {
                        jVar5.g = jVar3;
                    } else {
                        jVar5.f = jVar3;
                    }
                    jVar3.g = jVar2;
                    jVar2.a = jVar3;
                }
            }
            return jVar;
        }

        private static <K, V> boolean b(j<K, V> jVar) {
            j<K, V> jVar2 = jVar.a;
            j<K, V> jVar3 = jVar.f;
            j<K, V> jVar4 = jVar.g;
            j<K, V> jVar5 = jVar.h;
            j jVar6 = (j) jVar.e;
            if (jVar5 != null && jVar5.e != jVar) {
                return false;
            }
            if (jVar6 != null && jVar6.h != jVar) {
                return false;
            }
            if (jVar2 != null && jVar != jVar2.f && jVar != jVar2.g) {
                return false;
            }
            if (jVar3 != null && (jVar3.a != jVar || jVar3.b > jVar.b)) {
                return false;
            }
            if (jVar4 != null && (jVar4.a != jVar || jVar4.b < jVar.b)) {
                return false;
            }
            if (jVar.i && jVar3 != null && jVar3.i && jVar4 != null && jVar4.i) {
                return false;
            }
            if (jVar3 == null || b(jVar3)) {
                return jVar4 == null || b(jVar4);
            }
            return false;
        }

        private static <K, V> j<K, V> c(j<K, V> jVar, j<K, V> jVar2) {
            j<K, V> jVar3;
            j<K, V> jVar4;
            jVar2.i = true;
            while (true) {
                j<K, V> jVar5 = jVar2.a;
                if (jVar5 != null) {
                    if (!jVar5.i) {
                        break;
                    }
                    j<K, V> jVar6 = jVar5.a;
                    if (jVar6 == null) {
                        break;
                    }
                    j<K, V> jVar7 = jVar6.f;
                    if (jVar5 == jVar7) {
                        j<K, V> jVar8 = jVar6.g;
                        if (jVar8 == null || !jVar8.i) {
                            if (jVar2 == jVar5.g) {
                                jVar = a(jVar, jVar5);
                                jVar4 = jVar5.a;
                                jVar6 = jVar4 == null ? null : jVar4.a;
                            } else {
                                j<K, V> jVar9 = jVar5;
                                jVar5 = jVar2;
                                jVar4 = jVar9;
                            }
                            if (jVar4 != null) {
                                jVar4.i = false;
                                if (jVar6 != null) {
                                    jVar6.i = true;
                                    jVar = b(jVar, jVar6);
                                }
                            }
                            jVar2 = jVar5;
                        } else {
                            jVar8.i = false;
                            jVar5.i = false;
                            jVar6.i = true;
                        }
                    } else if (jVar7 == null || !jVar7.i) {
                        if (jVar2 == jVar5.f) {
                            jVar = b(jVar, jVar5);
                            jVar3 = jVar5.a;
                            jVar6 = jVar3 == null ? null : jVar3.a;
                        } else {
                            j<K, V> jVar10 = jVar5;
                            jVar5 = jVar2;
                            jVar3 = jVar10;
                        }
                        if (jVar3 != null) {
                            jVar3.i = false;
                            if (jVar6 != null) {
                                jVar6.i = true;
                                jVar = a(jVar, jVar6);
                            }
                        }
                        jVar2 = jVar5;
                    } else {
                        jVar7.i = false;
                        jVar5.i = false;
                        jVar6.i = true;
                    }
                    jVar2 = jVar6;
                } else {
                    jVar2.i = false;
                    return jVar2;
                }
            }
            return jVar;
        }

        /* access modifiers changed from: 0000 */
        public final g<K, V> a(int i2, Object obj) {
            j jVar = null;
            if (obj != null) {
                g gVar = this.f;
                while (gVar != null) {
                    int i3 = this.g;
                    if (h.compareAndSwapInt(this, i, 0, 4)) {
                        try {
                            j<K, V> jVar2 = this.a;
                            if (jVar2 != null) {
                                jVar = jVar2.a(i2, obj, null);
                            }
                            do {
                            } while (!h.compareAndSwapInt(this, i, this.g, -4));
                            return jVar;
                        } catch (Throwable th) {
                            do {
                            } while (!h.compareAndSwapInt(this, i, this.g, -4));
                            throw th;
                        }
                    } else {
                        gVar = gVar.e;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
            if (r2 != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
            if (j != false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
            if (b(r12.a) == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x009c, code lost:
            return null;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00a1 A[LOOP:0: B:1:0x0004->B:53:0x00a1, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x005a A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final io.netty.util.internal.chmv8.ConcurrentHashMapV8.j<K, V> a(int r13, K r14, V r15) {
            /*
                r12 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r12.a
                r1 = 0
                r2 = r1
            L_0x0004:
                if (r0 != 0) goto L_0x0017
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r0 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$j
                r7 = 0
                r8 = 0
                r3 = r0
                r4 = r13
                r5 = r14
                r6 = r15
                r3.<init>(r4, r5, r6, r7, r8)
                r12.a = r0
                r12.f = r0
                goto L_0x0089
            L_0x0017:
                int r3 = r0.b
                r4 = -1
                r8 = 1
                if (r3 <= r13) goto L_0x001f
            L_0x001d:
                r9 = -1
                goto L_0x0051
            L_0x001f:
                if (r3 >= r13) goto L_0x0023
            L_0x0021:
                r9 = 1
                goto L_0x0051
            L_0x0023:
                java.lang.Object r3 = r0.c
                if (r3 == r14) goto L_0x00a4
                if (r3 == 0) goto L_0x0031
                boolean r5 = r14.equals(r3)
                if (r5 == 0) goto L_0x0031
                goto L_0x00a4
            L_0x0031:
                if (r2 != 0) goto L_0x0039
                java.lang.Class r2 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(r14)
                if (r2 == 0) goto L_0x003f
            L_0x0039:
                int r3 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(r2, r14, r3)
                if (r3 != 0) goto L_0x0050
            L_0x003f:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.f
                if (r3 != 0) goto L_0x0044
                goto L_0x0021
            L_0x0044:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.g
                if (r3 == 0) goto L_0x001d
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r3 = r3.a(r13, r14, r2)
                if (r3 != 0) goto L_0x004f
                goto L_0x001d
            L_0x004f:
                return r3
            L_0x0050:
                r9 = r3
            L_0x0051:
                if (r9 >= 0) goto L_0x0056
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.f
                goto L_0x0058
            L_0x0056:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.g
            L_0x0058:
                if (r3 != 0) goto L_0x00a1
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r10 = r12.f
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r11 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$j
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r10
                r7 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                r12.f = r11
                if (r10 == 0) goto L_0x006d
                r10.h = r11
            L_0x006d:
                if (r9 >= 0) goto L_0x0072
                r0.f = r11
                goto L_0x0074
            L_0x0072:
                r0.g = r11
            L_0x0074:
                boolean r13 = r0.i
                if (r13 != 0) goto L_0x007b
                r11.i = r8
                goto L_0x0089
            L_0x007b:
                r12.a()
                r13 = 0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r14 = r12.a     // Catch:{ all -> 0x009d }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r14 = c(r14, r11)     // Catch:{ all -> 0x009d }
                r12.a = r14     // Catch:{ all -> 0x009d }
                r12.g = r13
            L_0x0089:
                boolean r13 = j
                if (r13 != 0) goto L_0x009c
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r13 = r12.a
                boolean r13 = b(r13)
                if (r13 == 0) goto L_0x0096
                goto L_0x009c
            L_0x0096:
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x009c:
                return r1
            L_0x009d:
                r14 = move-exception
                r12.g = r13
                throw r14
            L_0x00a1:
                r0 = r3
                goto L_0x0004
            L_0x00a4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.i.a(int, java.lang.Object, java.lang.Object):io.netty.util.internal.chmv8.ConcurrentHashMapV8$j");
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0194 A[Catch:{ all -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00ab A[Catch:{ all -> 0x01bd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(io.netty.util.internal.chmv8.ConcurrentHashMapV8.j<K, V> r12) {
            /*
                r11 = this;
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r0 = r12.e
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r0 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.j) r0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r1 = r12.h
                if (r1 != 0) goto L_0x000b
                r11.f = r0
                goto L_0x000d
            L_0x000b:
                r1.e = r0
            L_0x000d:
                if (r0 == 0) goto L_0x0011
                r0.h = r1
            L_0x0011:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r11.f
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x001a
                r11.a = r2
                return r1
            L_0x001a:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r11.a
                if (r0 == 0) goto L_0x01c1
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.g
                if (r3 == 0) goto L_0x01c1
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r0.f
                if (r3 == 0) goto L_0x01c1
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r3 = r3.f
                if (r3 != 0) goto L_0x002c
                goto L_0x01c1
            L_0x002c:
                r11.a()
                r3 = 0
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r4 = r12.f     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r5 = r12.g     // Catch:{ all -> 0x01bd }
                if (r4 == 0) goto L_0x0084
                if (r5 == 0) goto L_0x0084
                r6 = r5
            L_0x0039:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.f     // Catch:{ all -> 0x01bd }
                if (r7 == 0) goto L_0x003f
                r6 = r7
                goto L_0x0039
            L_0x003f:
                boolean r7 = r6.i     // Catch:{ all -> 0x01bd }
                boolean r8 = r12.i     // Catch:{ all -> 0x01bd }
                r6.i = r8     // Catch:{ all -> 0x01bd }
                r12.i = r7     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.g     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r8 = r12.a     // Catch:{ all -> 0x01bd }
                if (r6 != r5) goto L_0x0052
                r12.a = r6     // Catch:{ all -> 0x01bd }
                r6.g = r12     // Catch:{ all -> 0x01bd }
                goto L_0x0065
            L_0x0052:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r9 = r6.a     // Catch:{ all -> 0x01bd }
                r12.a = r9     // Catch:{ all -> 0x01bd }
                if (r9 == 0) goto L_0x0061
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r10 = r9.f     // Catch:{ all -> 0x01bd }
                if (r6 != r10) goto L_0x005f
                r9.f = r12     // Catch:{ all -> 0x01bd }
                goto L_0x0061
            L_0x005f:
                r9.g = r12     // Catch:{ all -> 0x01bd }
            L_0x0061:
                r6.g = r5     // Catch:{ all -> 0x01bd }
                r5.a = r6     // Catch:{ all -> 0x01bd }
            L_0x0065:
                r12.f = r2     // Catch:{ all -> 0x01bd }
                r6.f = r4     // Catch:{ all -> 0x01bd }
                r4.a = r6     // Catch:{ all -> 0x01bd }
                r12.g = r7     // Catch:{ all -> 0x01bd }
                if (r7 == 0) goto L_0x0071
                r7.a = r12     // Catch:{ all -> 0x01bd }
            L_0x0071:
                r6.a = r8     // Catch:{ all -> 0x01bd }
                if (r8 != 0) goto L_0x0077
                r0 = r6
                goto L_0x0080
            L_0x0077:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r4 = r8.f     // Catch:{ all -> 0x01bd }
                if (r12 != r4) goto L_0x007e
                r8.f = r6     // Catch:{ all -> 0x01bd }
                goto L_0x0080
            L_0x007e:
                r8.g = r6     // Catch:{ all -> 0x01bd }
            L_0x0080:
                if (r7 == 0) goto L_0x008b
                r4 = r7
                goto L_0x008c
            L_0x0084:
                if (r4 == 0) goto L_0x0087
                goto L_0x008c
            L_0x0087:
                if (r5 == 0) goto L_0x008b
                r4 = r5
                goto L_0x008c
            L_0x008b:
                r4 = r12
            L_0x008c:
                if (r4 == r12) goto L_0x00a5
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r5 = r12.a     // Catch:{ all -> 0x01bd }
                r4.a = r5     // Catch:{ all -> 0x01bd }
                if (r5 != 0) goto L_0x0096
                r0 = r4
                goto L_0x009f
            L_0x0096:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r5.f     // Catch:{ all -> 0x01bd }
                if (r12 != r6) goto L_0x009d
                r5.f = r4     // Catch:{ all -> 0x01bd }
                goto L_0x009f
            L_0x009d:
                r5.g = r4     // Catch:{ all -> 0x01bd }
            L_0x009f:
                r12.a = r2     // Catch:{ all -> 0x01bd }
                r12.g = r2     // Catch:{ all -> 0x01bd }
                r12.f = r2     // Catch:{ all -> 0x01bd }
            L_0x00a5:
                boolean r5 = r12.i     // Catch:{ all -> 0x01bd }
                if (r5 == 0) goto L_0x00ab
                goto L_0x0190
            L_0x00ab:
                r5 = r0
                r0 = r4
            L_0x00ad:
                if (r0 == 0) goto L_0x018f
                if (r0 != r5) goto L_0x00b3
                goto L_0x018f
            L_0x00b3:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r0.a     // Catch:{ all -> 0x01bd }
                if (r6 != 0) goto L_0x00bb
                r0.i = r3     // Catch:{ all -> 0x01bd }
                goto L_0x0190
            L_0x00bb:
                boolean r7 = r0.i     // Catch:{ all -> 0x01bd }
                if (r7 == 0) goto L_0x00c3
                r0.i = r3     // Catch:{ all -> 0x01bd }
                goto L_0x018f
            L_0x00c3:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.f     // Catch:{ all -> 0x01bd }
                if (r7 != r0) goto L_0x012b
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.g     // Catch:{ all -> 0x01bd }
                if (r7 == 0) goto L_0x00df
                boolean r8 = r7.i     // Catch:{ all -> 0x01bd }
                if (r8 == 0) goto L_0x00df
                r7.i = r3     // Catch:{ all -> 0x01bd }
                r6.i = r1     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r5 = a(r5, r6)     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r0.a     // Catch:{ all -> 0x01bd }
                if (r6 != 0) goto L_0x00dd
                r7 = r2
                goto L_0x00df
            L_0x00dd:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.g     // Catch:{ all -> 0x01bd }
            L_0x00df:
                if (r7 != 0) goto L_0x00e3
                goto L_0x018c
            L_0x00e3:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r8 = r7.f     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r9 = r7.g     // Catch:{ all -> 0x01bd }
                if (r9 == 0) goto L_0x00ed
                boolean r10 = r9.i     // Catch:{ all -> 0x01bd }
                if (r10 != 0) goto L_0x00f4
            L_0x00ed:
                if (r8 == 0) goto L_0x0127
                boolean r10 = r8.i     // Catch:{ all -> 0x01bd }
                if (r10 != 0) goto L_0x00f4
                goto L_0x0127
            L_0x00f4:
                if (r9 == 0) goto L_0x00fa
                boolean r9 = r9.i     // Catch:{ all -> 0x01bd }
                if (r9 != 0) goto L_0x010d
            L_0x00fa:
                if (r8 == 0) goto L_0x00fe
                r8.i = r3     // Catch:{ all -> 0x01bd }
            L_0x00fe:
                r7.i = r1     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r5 = b(r5, r7)     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r0.a     // Catch:{ all -> 0x01bd }
                if (r6 != 0) goto L_0x010a
                r7 = r2
                goto L_0x010d
            L_0x010a:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r6.g     // Catch:{ all -> 0x01bd }
                r7 = r0
            L_0x010d:
                if (r7 == 0) goto L_0x011d
                if (r6 != 0) goto L_0x0113
                r0 = 0
                goto L_0x0115
            L_0x0113:
                boolean r0 = r6.i     // Catch:{ all -> 0x01bd }
            L_0x0115:
                r7.i = r0     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r7.g     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x011d
                r0.i = r3     // Catch:{ all -> 0x01bd }
            L_0x011d:
                if (r6 == 0) goto L_0x0187
                r6.i = r3     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r0 = a(r5, r6)     // Catch:{ all -> 0x01bd }
                goto L_0x0186
            L_0x0127:
                r7.i = r1     // Catch:{ all -> 0x01bd }
                goto L_0x018c
            L_0x012b:
                if (r7 == 0) goto L_0x0141
                boolean r8 = r7.i     // Catch:{ all -> 0x01bd }
                if (r8 == 0) goto L_0x0141
                r7.i = r3     // Catch:{ all -> 0x01bd }
                r6.i = r1     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r5 = b(r5, r6)     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r0.a     // Catch:{ all -> 0x01bd }
                if (r6 != 0) goto L_0x013f
                r7 = r2
                goto L_0x0141
            L_0x013f:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r6.f     // Catch:{ all -> 0x01bd }
            L_0x0141:
                if (r7 != 0) goto L_0x0144
                goto L_0x018c
            L_0x0144:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r8 = r7.f     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r9 = r7.g     // Catch:{ all -> 0x01bd }
                if (r8 == 0) goto L_0x014e
                boolean r10 = r8.i     // Catch:{ all -> 0x01bd }
                if (r10 != 0) goto L_0x0155
            L_0x014e:
                if (r9 == 0) goto L_0x018a
                boolean r10 = r9.i     // Catch:{ all -> 0x01bd }
                if (r10 != 0) goto L_0x0155
                goto L_0x018a
            L_0x0155:
                if (r8 == 0) goto L_0x015b
                boolean r8 = r8.i     // Catch:{ all -> 0x01bd }
                if (r8 != 0) goto L_0x016e
            L_0x015b:
                if (r9 == 0) goto L_0x015f
                r9.i = r3     // Catch:{ all -> 0x01bd }
            L_0x015f:
                r7.i = r1     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r5 = a(r5, r7)     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r0.a     // Catch:{ all -> 0x01bd }
                if (r6 != 0) goto L_0x016b
                r7 = r2
                goto L_0x016e
            L_0x016b:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r6.f     // Catch:{ all -> 0x01bd }
                r7 = r0
            L_0x016e:
                if (r7 == 0) goto L_0x017e
                if (r6 != 0) goto L_0x0174
                r0 = 0
                goto L_0x0176
            L_0x0174:
                boolean r0 = r6.i     // Catch:{ all -> 0x01bd }
            L_0x0176:
                r7.i = r0     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r7.f     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x017e
                r0.i = r3     // Catch:{ all -> 0x01bd }
            L_0x017e:
                if (r6 == 0) goto L_0x0187
                r6.i = r3     // Catch:{ all -> 0x01bd }
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r0 = b(r5, r6)     // Catch:{ all -> 0x01bd }
            L_0x0186:
                r5 = r0
            L_0x0187:
                r0 = r5
                goto L_0x00ad
            L_0x018a:
                r7.i = r1     // Catch:{ all -> 0x01bd }
            L_0x018c:
                r0 = r6
                goto L_0x00ad
            L_0x018f:
                r0 = r5
            L_0x0190:
                r11.a = r0     // Catch:{ all -> 0x01bd }
                if (r12 != r4) goto L_0x01a7
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r0 = r12.a     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x01a7
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r1 = r0.f     // Catch:{ all -> 0x01bd }
                if (r12 != r1) goto L_0x019f
                r0.f = r2     // Catch:{ all -> 0x01bd }
                goto L_0x01a5
            L_0x019f:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r1 = r0.g     // Catch:{ all -> 0x01bd }
                if (r12 != r1) goto L_0x01a5
                r0.g = r2     // Catch:{ all -> 0x01bd }
            L_0x01a5:
                r12.a = r2     // Catch:{ all -> 0x01bd }
            L_0x01a7:
                r11.g = r3
                boolean r12 = j
                if (r12 != 0) goto L_0x01bc
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r12 = r11.a
                boolean r12 = b(r12)
                if (r12 == 0) goto L_0x01b6
                goto L_0x01bc
            L_0x01b6:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            L_0x01bc:
                return r3
            L_0x01bd:
                r12 = move-exception
                r11.g = r3
                throw r12
            L_0x01c1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.i.a(io.netty.util.internal.chmv8.ConcurrentHashMapV8$j):boolean");
        }
    }

    static final class j<K, V> extends g<K, V> {
        j<K, V> a;
        j<K, V> f;
        j<K, V> g;
        j<K, V> h;
        boolean i;

        j(int i2, K k, V v, g<K, V> gVar, j<K, V> jVar) {
            super(i2, k, v, gVar);
            this.a = jVar;
        }

        /* access modifiers changed from: 0000 */
        public final g<K, V> a(int i2, Object obj) {
            return a(i2, obj, null);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
            if (r0 != null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final io.netty.util.internal.chmv8.ConcurrentHashMapV8.j<K, V> a(int r6, java.lang.Object r7, java.lang.Class<?> r8) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x0047
                r0 = r8
                r8 = r5
            L_0x0004:
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r1 = r8.f
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r2 = r8.g
                int r3 = r8.b
                if (r3 <= r6) goto L_0x000e
            L_0x000c:
                r8 = r1
                goto L_0x0043
            L_0x000e:
                if (r3 >= r6) goto L_0x0012
            L_0x0010:
                r8 = r2
                goto L_0x0043
            L_0x0012:
                java.lang.Object r3 = r8.c
                if (r3 == r7) goto L_0x0046
                if (r3 == 0) goto L_0x001f
                boolean r4 = r7.equals(r3)
                if (r4 == 0) goto L_0x001f
                goto L_0x0046
            L_0x001f:
                if (r1 != 0) goto L_0x0023
                if (r2 == 0) goto L_0x0047
            L_0x0023:
                if (r0 != 0) goto L_0x002b
                java.lang.Class r0 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(r7)
                if (r0 == 0) goto L_0x0036
            L_0x002b:
                int r8 = io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(r0, r7, r3)
                if (r8 == 0) goto L_0x0036
                if (r8 >= 0) goto L_0x0034
                goto L_0x000c
            L_0x0034:
                r1 = r2
                goto L_0x000c
            L_0x0036:
                if (r1 != 0) goto L_0x0039
                goto L_0x0010
            L_0x0039:
                if (r2 == 0) goto L_0x000c
                io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r8 = r2.a(r6, r7, r0)
                if (r8 != 0) goto L_0x0042
                goto L_0x000c
            L_0x0042:
                return r8
            L_0x0043:
                if (r8 != 0) goto L_0x0004
                goto L_0x0047
            L_0x0046:
                return r8
            L_0x0047:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.j.a(int, java.lang.Object, java.lang.Class):io.netty.util.internal.chmv8.ConcurrentHashMapV8$j");
        }
    }

    static final class k<K, V> extends a<K, V> implements Enumeration<V>, Iterator<V> {
        k(g<K, V>[] gVarArr, int i, int i2, int i3, ConcurrentHashMapV8<K, V> concurrentHashMapV8) {
            super(gVarArr, i, 0, i3, concurrentHashMapV8);
        }

        public final V next() {
            g gVar = this.c;
            if (gVar != null) {
                V v = gVar.d;
                this.b = gVar;
                a();
                return v;
            }
            throw new NoSuchElementException();
        }

        public final V nextElement() {
            return next();
        }
    }

    static {
        try {
            n = e();
            Class<ConcurrentHashMapV8> cls = ConcurrentHashMapV8.class;
            o = n.objectFieldOffset(cls.getDeclaredField("sizeCtl"));
            p = n.objectFieldOffset(cls.getDeclaredField("transferIndex"));
            q = n.objectFieldOffset(cls.getDeclaredField("transferOrigin"));
            r = n.objectFieldOffset(cls.getDeclaredField("baseCount"));
            s = n.objectFieldOffset(cls.getDeclaredField("cellsBusy"));
            t = n.objectFieldOffset(b.class.getDeclaredField("value"));
            Class<g[]> cls2 = g[].class;
            u = (long) n.arrayBaseOffset(cls2);
            int arrayIndexScale = n.arrayIndexScale(cls2);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                v = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    private static int a(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static int a(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    private static <K, V> g<K, V> a(g<K, V> gVar) {
        g<K, V> gVar2 = null;
        g<K, V> gVar3 = null;
        while (gVar != null) {
            g<K, V> gVar4 = new g<>(gVar.b, gVar.c, gVar.d, null);
            if (gVar3 == null) {
                gVar2 = gVar4;
            } else {
                gVar3.e = gVar4;
            }
            gVar = gVar.e;
            gVar3 = gVar4;
        }
        return gVar2;
    }

    static final <K, V> g<K, V> a(g<K, V>[] gVarArr, int i2) {
        return (g) n.getObjectVolatile(gVarArr, (((long) i2) << v) + u);
    }

    static Class<?> a(Object obj) {
        if (obj instanceof Comparable) {
            Class<String> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class) {
                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                            if (actualTypeArguments != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                                return cls;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.compareAndSwapLong(r19, r2, r4, r11) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(long r20, int r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r22
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r10 = r8.i
            if (r10 != 0) goto L_0x0019
            sun.misc.Unsafe r0 = n
            long r2 = r
            long r4 = r8.d
            long r11 = r4 + r20
            r1 = r19
            r6 = r11
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0047
        L_0x0019:
            wxi r1 = defpackage.wxi.b()
            wxh r4 = r1.g
            r0 = 1
            if (r4 == 0) goto L_0x0091
            if (r10 == 0) goto L_0x0091
            int r2 = r10.length
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0091
            int r3 = r4.a
            r2 = r2 & r3
            r12 = r10[r2]
            if (r12 == 0) goto L_0x0091
            sun.misc.Unsafe r11 = n
            long r13 = t
            long r2 = r12.a
            long r17 = r2 + r20
            r15 = r2
            boolean r2 = r11.compareAndSwapLong(r12, r13, r15, r17)
            if (r2 != 0) goto L_0x0040
            r5 = r2
            goto L_0x0092
        L_0x0040:
            if (r9 > r0) goto L_0x0043
            return
        L_0x0043:
            long r11 = r19.d()
        L_0x0047:
            if (r9 < 0) goto L_0x0090
        L_0x0049:
            int r4 = r8.e
            long r0 = (long) r4
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0090
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r6 = r8.a
            if (r6 == 0) goto L_0x0090
            int r0 = r6.length
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r1) goto L_0x0090
            if (r4 >= 0) goto L_0x007a
            r0 = -1
            if (r4 == r0) goto L_0x0090
            int r0 = r8.f
            int r1 = r8.g
            if (r0 <= r1) goto L_0x0090
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r7 = r8.c
            if (r7 == 0) goto L_0x0090
            sun.misc.Unsafe r0 = n
            long r2 = o
            int r5 = r4 + -1
            r1 = r19
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L_0x008b
            r8.a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r6, (io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r7)
            goto L_0x008b
        L_0x007a:
            sun.misc.Unsafe r0 = n
            long r2 = o
            r5 = -2
            r1 = r19
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L_0x008b
            r0 = 0
            r8.a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r6, (io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0)
        L_0x008b:
            long r11 = r19.d()
            goto L_0x0049
        L_0x0090:
            return
        L_0x0091:
            r5 = 1
        L_0x0092:
            r0 = r19
            r2 = r20
            r0.a(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(long, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r9.i != r7) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        r1 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8.b[(r8 << 1)];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (r2 >= r8) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        r9.i = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010f A[EDGE_INSN: B:78:0x010f->B:74:0x010f ?: BREAK  
    EDGE_INSN: B:78:0x010f->B:74:0x010f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0029 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.wxi r26, long r27, defpackage.wxh r29, boolean r30) {
        /*
            r25 = this;
            r9 = r25
            r10 = r27
            r0 = r29
            r12 = 1
            if (r0 != 0) goto L_0x0021
            wxh r0 = new wxh
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = m
            r2 = 1640531527(0x61c88647, float:4.6237806E20)
            int r1 = r1.addAndGet(r2)
            if (r1 != 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            r0.a = r1
            r2 = r26
            r2.g = r0
            goto L_0x0023
        L_0x0021:
            int r1 = r0.a
        L_0x0023:
            r13 = 0
            r15 = r30
            r14 = r1
        L_0x0027:
            r16 = 0
        L_0x0029:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r7 = r9.i
            if (r7 == 0) goto L_0x00ca
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00ca
            int r1 = r8 + -1
            r1 = r1 & r14
            r1 = r7[r1]
            if (r1 != 0) goto L_0x006e
            int r1 = r9.h
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b r7 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$b
            r7.<init>(r10)
            int r1 = r9.h
            sun.misc.Unsafe r1 = n
            long r3 = s
            r5 = 0
            r6 = 1
            r2 = r25
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x006b
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = r9.i     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0060
            int r2 = r1.length     // Catch:{ all -> 0x0067 }
            if (r2 <= 0) goto L_0x0060
            int r2 = r2 + -1
            r2 = r2 & r14
            r3 = r1[r2]     // Catch:{ all -> 0x0067 }
            if (r3 != 0) goto L_0x0060
            r1[r2] = r7     // Catch:{ all -> 0x0067 }
            r1 = 1
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            r9.h = r13
            if (r1 == 0) goto L_0x0029
            goto L_0x010f
        L_0x0067:
            r0 = move-exception
            r9.h = r13
            throw r0
        L_0x006b:
            r16 = 0
            goto L_0x00be
        L_0x006e:
            if (r15 != 0) goto L_0x0072
            r15 = 1
            goto L_0x00be
        L_0x0072:
            sun.misc.Unsafe r17 = n
            long r19 = t
            long r2 = r1.a
            long r23 = r2 + r10
            r18 = r1
            r21 = r2
            boolean r1 = r17.compareAndSwapLong(r18, r19, r21, r23)
            if (r1 != 0) goto L_0x010f
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = r9.i
            if (r1 != r7) goto L_0x006b
            int r1 = b
            if (r8 < r1) goto L_0x008d
            goto L_0x006b
        L_0x008d:
            if (r16 != 0) goto L_0x0092
            r16 = 1
            goto L_0x00be
        L_0x0092:
            int r1 = r9.h
            sun.misc.Unsafe r1 = n
            long r3 = s
            r5 = 0
            r6 = 1
            r2 = r25
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00be
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = r9.i     // Catch:{ all -> 0x00ba }
            if (r1 != r7) goto L_0x00b6
            int r1 = r8 << 1
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8.b[r1]     // Catch:{ all -> 0x00ba }
            r2 = 0
        L_0x00ab:
            if (r2 >= r8) goto L_0x00b4
            r3 = r7[r2]     // Catch:{ all -> 0x00ba }
            r1[r2] = r3     // Catch:{ all -> 0x00ba }
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00b4:
            r9.i = r1     // Catch:{ all -> 0x00ba }
        L_0x00b6:
            r9.h = r13
            goto L_0x0027
        L_0x00ba:
            r0 = move-exception
            r9.h = r13
            throw r0
        L_0x00be:
            int r1 = r14 << 13
            r1 = r1 ^ r14
            int r2 = r1 >>> 17
            r1 = r1 ^ r2
            int r2 = r1 << 5
            r14 = r1 ^ r2
            goto L_0x0029
        L_0x00ca:
            int r1 = r9.h
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = r9.i
            if (r1 != r7) goto L_0x00fd
            sun.misc.Unsafe r1 = n
            long r3 = s
            r5 = 0
            r6 = 1
            r2 = r25
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00fd
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = r9.i     // Catch:{ all -> 0x00f9 }
            if (r1 != r7) goto L_0x00f2
            r1 = 2
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b[] r1 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8.b[r1]     // Catch:{ all -> 0x00f9 }
            r2 = r14 & 1
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$b r3 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$b     // Catch:{ all -> 0x00f9 }
            r3.<init>(r10)     // Catch:{ all -> 0x00f9 }
            r1[r2] = r3     // Catch:{ all -> 0x00f9 }
            r9.i = r1     // Catch:{ all -> 0x00f9 }
            r1 = 1
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            r9.h = r13
            if (r1 != 0) goto L_0x010f
            goto L_0x0029
        L_0x00f9:
            r0 = move-exception
            r9.h = r13
            throw r0
        L_0x00fd:
            sun.misc.Unsafe r1 = n
            long r3 = r
            long r5 = r9.d
            long r7 = r5 + r10
            r2 = r25
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x010f
            goto L_0x0029
        L_0x010f:
            r0.a = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(wxi, long, wxh, boolean):void");
    }

    private static <K, V> void a(g<K, V>[] gVarArr, int i2, g<K, V> gVar) {
        n.putObjectVolatile(gVarArr, (((long) i2) << v) + u, gVar);
    }

    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r5v7, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$g] */
    /* JADX WARNING: type inference failed for: r0v8, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$g] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$i] */
    /* JADX WARNING: type inference failed for: r0v12, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$g] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$i] */
    /* JADX WARNING: type inference failed for: r5v10, types: [io.netty.util.internal.chmv8.ConcurrentHashMapV8$g] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[] r31, io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[] r32) {
        /*
            r30 = this;
            r7 = r30
            r0 = r31
            int r8 = r0.length
            int r1 = b
            r9 = 1
            if (r1 <= r9) goto L_0x000f
            int r2 = r8 >>> 3
            int r1 = r2 / r1
            goto L_0x0010
        L_0x000f:
            r1 = r8
        L_0x0010:
            r2 = 16
            if (r1 >= r2) goto L_0x0017
            r10 = 16
            goto L_0x0018
        L_0x0017:
            r10 = r1
        L_0x0018:
            if (r32 != 0) goto L_0x0058
            int r1 = r8 << 1
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[] r1 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8.g[r1]     // Catch:{ all -> 0x0052 }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[] r1 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.g[]) r1     // Catch:{ all -> 0x0052 }
            r7.c = r1
            r7.g = r8
            r7.f = r8
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$d r2 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$d
            r2.<init>(r0)
            r3 = r8
        L_0x002c:
            if (r3 <= 0) goto L_0x0050
            if (r3 <= r10) goto L_0x0033
            int r4 = r3 - r10
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            r5 = r4
        L_0x0035:
            if (r5 >= r3) goto L_0x003c
            r1[r5] = r2
            int r5 = r5 + 1
            goto L_0x0035
        L_0x003c:
            int r5 = r8 + r4
        L_0x003e:
            int r6 = r8 + r3
            if (r5 >= r6) goto L_0x0047
            r1[r5] = r2
            int r5 = r5 + 1
            goto L_0x003e
        L_0x0047:
            sun.misc.Unsafe r3 = n
            long r5 = q
            r3.putOrderedInt(r7, r5, r4)
            r3 = r4
            goto L_0x002c
        L_0x0050:
            r12 = r1
            goto L_0x005a
        L_0x0052:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.e = r0
            return
        L_0x0058:
            r12 = r32
        L_0x005a:
            int r13 = r12.length
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$d r14 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$d
            r14.<init>(r12)
            r15 = -1
            r1 = 0
            r6 = 0
            r16 = 1
            r17 = 0
        L_0x0067:
            if (r16 == 0) goto L_0x00ac
            int r5 = r1 + -1
            if (r5 >= r6) goto L_0x00a1
            if (r17 == 0) goto L_0x0070
            goto L_0x00a1
        L_0x0070:
            int r3 = r7.f
            int r1 = r7.g
            if (r3 > r1) goto L_0x0078
            r1 = -1
            goto L_0x00a9
        L_0x0078:
            sun.misc.Unsafe r1 = n
            long r18 = p
            if (r3 <= r10) goto L_0x0083
            int r2 = r3 - r10
            r20 = r2
            goto L_0x0085
        L_0x0083:
            r20 = 0
        L_0x0085:
            r2 = r30
            r21 = r3
            r3 = r18
            r18 = r5
            r5 = r21
            r19 = r6
            r6 = r20
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x009e
            int r1 = r21 + -1
            r6 = r20
            goto L_0x00a9
        L_0x009e:
            r1 = r18
            goto L_0x00cc
        L_0x00a1:
            r18 = r5
            r19 = r6
            r1 = r18
            r6 = r19
        L_0x00a9:
            r16 = 0
            goto L_0x0067
        L_0x00ac:
            r19 = r6
            r2 = 0
            if (r1 < 0) goto L_0x01d5
            if (r1 >= r8) goto L_0x01d5
            int r3 = r1 + r8
            if (r3 < r13) goto L_0x00b9
            goto L_0x01d5
        L_0x00b9:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r4 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r1)
            if (r4 != 0) goto L_0x00cf
            boolean r4 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r1, r2, r14)
            if (r4 == 0) goto L_0x00cc
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r1, r2)
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r3, r2)
            goto L_0x00d3
        L_0x00cc:
            r6 = r19
            goto L_0x0067
        L_0x00cf:
            int r5 = r4.b
            if (r5 != r15) goto L_0x00d8
        L_0x00d3:
            r6 = r19
            r16 = 1
            goto L_0x0067
        L_0x00d8:
            monitor-enter(r4)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r6 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r1)     // Catch:{ all -> 0x01d2 }
            if (r6 != r4) goto L_0x01bf
            if (r5 < 0) goto L_0x0133
            r5 = r5 & r8
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r6 = r4.e     // Catch:{ all -> 0x01d2 }
            r11 = r4
        L_0x00e5:
            if (r6 == 0) goto L_0x00f2
            int r15 = r6.b     // Catch:{ all -> 0x01d2 }
            r15 = r15 & r8
            if (r15 == r5) goto L_0x00ee
            r11 = r6
            r5 = r15
        L_0x00ee:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r6 = r6.e     // Catch:{ all -> 0x01d2 }
            r15 = -1
            goto L_0x00e5
        L_0x00f2:
            if (r5 != 0) goto L_0x00f6
            r5 = r11
            goto L_0x00f8
        L_0x00f6:
            r5 = r2
            r2 = r11
        L_0x00f8:
            r6 = r2
            r2 = r4
        L_0x00fa:
            if (r2 == r11) goto L_0x0121
            int r15 = r2.b     // Catch:{ all -> 0x01d2 }
            K r9 = r2.c     // Catch:{ all -> 0x01d2 }
            r21 = r10
            V r10 = r2.d     // Catch:{ all -> 0x01d2 }
            r16 = r15 & r8
            if (r16 != 0) goto L_0x0111
            r16 = r11
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r11 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$g     // Catch:{ all -> 0x01d2 }
            r11.<init>(r15, r9, r10, r5)     // Catch:{ all -> 0x01d2 }
            r5 = r11
            goto L_0x0119
        L_0x0111:
            r16 = r11
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r11 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$g     // Catch:{ all -> 0x01d2 }
            r11.<init>(r15, r9, r10, r6)     // Catch:{ all -> 0x01d2 }
            r6 = r11
        L_0x0119:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r2 = r2.e     // Catch:{ all -> 0x01d2 }
            r11 = r16
            r10 = r21
            r9 = 1
            goto L_0x00fa
        L_0x0121:
            r21 = r10
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r1, r5)     // Catch:{ all -> 0x01d2 }
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r3, r6)     // Catch:{ all -> 0x01d2 }
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r1, r14)     // Catch:{ all -> 0x01d2 }
            r28 = r13
            r7 = r14
        L_0x012f:
            r16 = 1
            goto L_0x01c4
        L_0x0133:
            r21 = r10
            boolean r5 = r4 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.i     // Catch:{ all -> 0x01d2 }
            if (r5 == 0) goto L_0x01c1
            r5 = r4
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$i r5 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.i) r5     // Catch:{ all -> 0x01d2 }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r6 = r5.f     // Catch:{ all -> 0x01d2 }
            r10 = r2
            r11 = r10
            r15 = r11
            r16 = r5
            r9 = 0
            r5 = r15
            r2 = 0
        L_0x0146:
            if (r6 == 0) goto L_0x0189
            r28 = r13
            int r13 = r6.b     // Catch:{ all -> 0x01d2 }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r7 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$j     // Catch:{ all -> 0x01d2 }
            K r0 = r6.c     // Catch:{ all -> 0x01d2 }
            r29 = r14
            V r14 = r6.d     // Catch:{ all -> 0x01d2 }
            r26 = 0
            r27 = 0
            r22 = r7
            r23 = r13
            r24 = r0
            r25 = r14
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x01d2 }
            r0 = r13 & r8
            if (r0 != 0) goto L_0x0173
            r7.h = r5     // Catch:{ all -> 0x01d2 }
            if (r5 != 0) goto L_0x016d
            r10 = r7
            goto L_0x016f
        L_0x016d:
            r5.e = r7     // Catch:{ all -> 0x01d2 }
        L_0x016f:
            int r2 = r2 + 1
            r5 = r7
            goto L_0x017e
        L_0x0173:
            r7.h = r15     // Catch:{ all -> 0x01d2 }
            if (r15 != 0) goto L_0x0179
            r11 = r7
            goto L_0x017b
        L_0x0179:
            r15.e = r7     // Catch:{ all -> 0x01d2 }
        L_0x017b:
            int r9 = r9 + 1
            r15 = r7
        L_0x017e:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r6 = r6.e     // Catch:{ all -> 0x01d2 }
            r7 = r30
            r0 = r31
            r13 = r28
            r14 = r29
            goto L_0x0146
        L_0x0189:
            r28 = r13
            r29 = r14
            r0 = 6
            if (r2 > r0) goto L_0x0195
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r5 = a(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x019f
        L_0x0195:
            if (r9 == 0) goto L_0x019d
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$i r5 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$i     // Catch:{ all -> 0x01d2 }
            r5.<init>(r10)     // Catch:{ all -> 0x01d2 }
            goto L_0x019f
        L_0x019d:
            r5 = r16
        L_0x019f:
            if (r9 > r0) goto L_0x01a6
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r0 = a(r11)     // Catch:{ all -> 0x01d2 }
            goto L_0x01b0
        L_0x01a6:
            if (r2 == 0) goto L_0x01ae
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$i r0 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$i     // Catch:{ all -> 0x01d2 }
            r0.<init>(r11)     // Catch:{ all -> 0x01d2 }
            goto L_0x01b0
        L_0x01ae:
            r0 = r16
        L_0x01b0:
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r1, r5)     // Catch:{ all -> 0x01d2 }
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r12, r3, r0)     // Catch:{ all -> 0x01d2 }
            r0 = r31
            r7 = r29
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r0, r1, r7)     // Catch:{ all -> 0x01d2 }
            goto L_0x012f
        L_0x01bf:
            r21 = r10
        L_0x01c1:
            r28 = r13
            r7 = r14
        L_0x01c4:
            monitor-exit(r4)     // Catch:{ all -> 0x01d2 }
            r9 = 1
            r15 = -1
            r14 = r7
            r6 = r19
            r10 = r21
            r13 = r28
            r7 = r30
            goto L_0x0067
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d2 }
            throw r0
        L_0x01d5:
            r21 = r10
            r28 = r13
            r7 = r14
            if (r17 == 0) goto L_0x01eb
            r9 = r30
            r9.c = r2
            r9.a = r12
            int r0 = r8 << 1
            r10 = 1
            int r1 = r8 >>> 1
            int r0 = r0 - r1
            r9.e = r0
            return
        L_0x01eb:
            r10 = 1
            r9 = r30
        L_0x01ee:
            sun.misc.Unsafe r1 = n
            long r3 = o
            int r5 = r9.e
            int r11 = r5 + 1
            r2 = r30
            r6 = r11
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x01ee
            r1 = -1
            if (r11 == r1) goto L_0x0203
            return
        L_0x0203:
            r14 = r7
            r1 = r8
            r7 = r9
            r6 = r19
            r10 = r21
            r13 = r28
            r9 = 1
            r15 = -1
            r16 = 1
            r17 = 1
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[], io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[]):void");
    }

    private static <K, V> boolean a(g<K, V>[] gVarArr, int i2, g<K, V> gVar, g<K, V> gVar2) {
        return n.compareAndSwapObject(gVarArr, (((long) i2) << v) + u, null, gVar2);
    }

    private g<K, V>[] a(g<K, V>[] gVarArr, g<K, V> gVar) {
        if (gVar instanceof d) {
            g<K, V>[] gVarArr2 = ((d) gVar).a;
            if (gVarArr2 != null) {
                if (gVarArr2 == this.c && gVarArr == this.a && this.f > this.g) {
                    int i2 = this.e;
                    if (i2 < -1) {
                        if (n.compareAndSwapInt(this, o, i2, i2 - 1)) {
                            a(gVarArr, gVarArr2);
                        }
                    }
                }
                return gVarArr2;
            }
        }
        return this.a;
    }

    private static final int b(int i2) {
        int i3 = i2 - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 0) {
            return 1;
        }
        if (i8 >= 1073741824) {
            return 1073741824;
        }
        return i8 + 1;
    }

    private final void b(g<K, V>[] gVarArr, int i2) {
        if (gVarArr != null) {
            j jVar = null;
            if (gVarArr.length >= 64) {
                g a2 = a(gVarArr, i2);
                if (a2 != null && a2.b >= 0) {
                    synchronized (a2) {
                        if (a(gVarArr, i2) == a2) {
                            g gVar = a2;
                            j jVar2 = null;
                            while (gVar != null) {
                                j jVar3 = new j(gVar.b, gVar.c, gVar.d, null, null);
                                jVar3.h = jVar2;
                                if (jVar2 == null) {
                                    jVar = jVar3;
                                } else {
                                    jVar2.e = jVar3;
                                }
                                gVar = gVar.e;
                                jVar2 = jVar3;
                            }
                            a(gVarArr, i2, (g<K, V>) new i<K,V>(jVar));
                        }
                    }
                }
            } else if (gVarArr == this.a) {
                int i3 = this.e;
                if (i3 >= 0) {
                    if (n.compareAndSwapInt(this, o, i3, -2)) {
                        a(gVarArr, (g<K, V>[]) null);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final g<K, V>[] c() {
        while (true) {
            g<K, V>[] gVarArr = this.a;
            if (gVarArr != null && gVarArr.length != 0) {
                return gVarArr;
            }
            int i2 = this.e;
            if (i2 < 0) {
                Thread.yield();
            } else {
                if (n.compareAndSwapInt(this, o, i2, -1)) {
                    try {
                        g<K, V>[] gVarArr2 = this.a;
                        if (gVarArr2 == null || gVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            g<K, V>[] gVarArr3 = (g[]) new g[i3];
                            this.a = gVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            gVarArr2 = gVarArr3;
                        }
                        this.e = i2;
                        return gVarArr2;
                    } catch (Throwable th) {
                        this.e = i2;
                        throw th;
                    }
                }
            }
        }
    }

    private long d() {
        b[] bVarArr = this.i;
        long j2 = this.d;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    j2 += bVar.a;
                }
            }
        }
        return j2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new io.netty.util.internal.chmv8.ConcurrentHashMapV8.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe e() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$1 r0 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.e():sun.misc.Unsafe");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        int i2;
        boolean z;
        long j3;
        this.e = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        g gVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject != null && readObject2 != null) {
                j5++;
                gVar = new g(a(readObject.hashCode()), readObject, readObject2, gVar);
            }
        }
        if (j5 == 0) {
            this.e = 0;
            return;
        }
        if (j5 >= 536870912) {
            i2 = 1073741824;
        } else {
            int i3 = (int) j5;
            i2 = b(i3 + (i3 >>> 1) + 1);
        }
        g<K, V>[] gVarArr = (g[]) new g[i2];
        int i4 = i2 - 1;
        while (gVar != null) {
            g<K, V> gVar2 = gVar.e;
            int i5 = gVar.b;
            int i6 = i5 & i4;
            g<K, V> a2 = a(gVarArr, i6);
            if (a2 == null) {
                z = true;
            } else {
                K k2 = gVar.c;
                if (a2.b >= 0) {
                    g<K, V> gVar3 = a2;
                    int i7 = 0;
                    while (true) {
                        if (gVar3 == null) {
                            z = true;
                            break;
                        }
                        if (gVar3.b == i5) {
                            K k3 = gVar3.c;
                            if (k3 == k2 || (k3 != null && k2.equals(k3))) {
                                z = false;
                            }
                        }
                        i7++;
                        gVar3 = gVar3.e;
                    }
                    z = false;
                    if (z && i7 >= 8) {
                        j4++;
                        gVar.e = a2;
                        g gVar4 = gVar;
                        j jVar = null;
                        j jVar2 = null;
                        while (gVar4 != null) {
                            long j6 = j4;
                            j jVar3 = new j(gVar4.b, gVar4.c, gVar4.d, null, null);
                            jVar3.h = jVar2;
                            if (jVar2 == null) {
                                jVar = jVar3;
                            } else {
                                jVar2.e = jVar3;
                            }
                            gVar4 = gVar4.e;
                            jVar2 = jVar3;
                            j4 = j6;
                        }
                        long j7 = j4;
                        a(gVarArr, i6, (g<K, V>) new i<K,V>(jVar));
                    }
                } else if (((i) a2).a(i5, k2, gVar.d) == null) {
                    j4 += j2;
                }
                z = false;
            }
            if (z) {
                j3 = 1;
                j4++;
                gVar.e = a2;
                a(gVarArr, i6, gVar);
            } else {
                j3 = 1;
            }
            j2 = j3;
            gVar = gVar2;
        }
        this.a = gVarArr;
        this.e = i2 - (i2 >>> 2);
        this.d = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Segment[] segmentArr = new Segment[16];
        for (int i2 = 0; i2 < 16; i2++) {
            segmentArr[i2] = new Segment(0.75f);
        }
        objectOutputStream.putFields().put("segments", segmentArr);
        objectOutputStream.putFields().put("segmentShift", 28);
        objectOutputStream.putFields().put("segmentMask", 15);
        objectOutputStream.writeFields();
        g<K, V>[] gVarArr = this.a;
        if (gVarArr != null) {
            h hVar = new h(gVarArr, gVarArr.length, 0, gVarArr.length);
            while (true) {
                g a2 = hVar.a();
                if (a2 == null) {
                    break;
                }
                objectOutputStream.writeObject(a2.c);
                objectOutputStream.writeObject(a2.d);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    public final long a() {
        long d2 = d();
        if (d2 < 0) {
            return 0;
        }
        return d2;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b1, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(java.lang.Object r13, V r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = a(r0)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r1 = r12.a
        L_0x000a:
            r2 = 0
            if (r1 == 0) goto L_0x00b1
            int r3 = r1.length
            if (r3 == 0) goto L_0x00b1
            int r3 = r3 + -1
            r3 = r3 & r0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r4 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r3)
            if (r4 == 0) goto L_0x00b1
            int r5 = r4.b
            r6 = -1
            if (r5 != r6) goto L_0x0023
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[] r1 = r12.a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r4)
            goto L_0x000a
        L_0x0023:
            r7 = 0
            monitor-enter(r4)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r8 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r3)     // Catch:{ all -> 0x00ae }
            r9 = 1
            if (r8 != r4) goto L_0x009f
            if (r5 < 0) goto L_0x0069
            r7 = r2
            r5 = r4
        L_0x0030:
            int r8 = r5.b     // Catch:{ all -> 0x00ae }
            if (r8 != r0) goto L_0x0060
            K r8 = r5.c     // Catch:{ all -> 0x00ae }
            if (r8 == r13) goto L_0x0040
            if (r8 == 0) goto L_0x0060
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x0060
        L_0x0040:
            V r8 = r5.d     // Catch:{ all -> 0x00ae }
            if (r15 == 0) goto L_0x004e
            if (r15 == r8) goto L_0x004e
            if (r8 == 0) goto L_0x009d
            boolean r10 = r15.equals(r8)     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x009d
        L_0x004e:
            if (r14 == 0) goto L_0x0053
            r5.d = r14     // Catch:{ all -> 0x00ae }
            goto L_0x00a1
        L_0x0053:
            if (r7 == 0) goto L_0x005a
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r3 = r5.e     // Catch:{ all -> 0x00ae }
            r7.e = r3     // Catch:{ all -> 0x00ae }
            goto L_0x00a1
        L_0x005a:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r5 = r5.e     // Catch:{ all -> 0x00ae }
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r3, r5)     // Catch:{ all -> 0x00ae }
            goto L_0x00a1
        L_0x0060:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r7 = r5.e     // Catch:{ all -> 0x00ae }
            if (r7 != 0) goto L_0x0065
            goto L_0x009d
        L_0x0065:
            r11 = r7
            r7 = r5
            r5 = r11
            goto L_0x0030
        L_0x0069:
            boolean r5 = r4 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.i     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x009f
            r5 = r4
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$i r5 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.i) r5     // Catch:{ all -> 0x00ae }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r7 = r5.a     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x009d
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r7 = r7.a(r0, r13, r2)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x009d
            java.lang.Object r8 = r7.d     // Catch:{ all -> 0x00ae }
            if (r15 == 0) goto L_0x0088
            if (r15 == r8) goto L_0x0088
            if (r8 == 0) goto L_0x009d
            boolean r10 = r15.equals(r8)     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x009d
        L_0x0088:
            if (r14 == 0) goto L_0x008d
            r7.d = r14     // Catch:{ all -> 0x00ae }
            goto L_0x00a1
        L_0x008d:
            boolean r7 = r5.a(r7)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x00a1
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j<K, V> r5 = r5.f     // Catch:{ all -> 0x00ae }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r5 = a(r5)     // Catch:{ all -> 0x00ae }
            a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r3, r5)     // Catch:{ all -> 0x00ae }
            goto L_0x00a1
        L_0x009d:
            r8 = r2
            goto L_0x00a1
        L_0x009f:
            r8 = r2
            r9 = 0
        L_0x00a1:
            monitor-exit(r4)     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x000a
            if (r8 == 0) goto L_0x00b1
            if (r14 != 0) goto L_0x00ad
            r13 = -1
            r12.a(r13, r6)
        L_0x00ad:
            return r8
        L_0x00ae:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ae }
            throw r13
        L_0x00b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r11 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r1.d = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        a(1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0094, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x009e
            if (r10 == 0) goto L_0x009e
            int r0 = r9.hashCode()
            int r0 = a(r0)
            r1 = 0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r2 = r8.a
        L_0x000f:
            if (r2 == 0) goto L_0x0098
            int r3 = r2.length
            if (r3 != 0) goto L_0x0016
            goto L_0x0098
        L_0x0016:
            int r3 = r3 + -1
            r3 = r3 & r0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r4 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r2, r3)
            r5 = 0
            if (r4 != 0) goto L_0x002d
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r4 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$g
            r4.<init>(r0, r9, r10, r5)
            boolean r3 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r2, r3, r5, r4)
            if (r3 == 0) goto L_0x000f
            goto L_0x008f
        L_0x002d:
            int r6 = r4.b
            r7 = -1
            if (r6 != r7) goto L_0x0037
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[] r2 = r8.a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r2, r4)
            goto L_0x000f
        L_0x0037:
            monitor-enter(r4)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r7 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r2, r3)     // Catch:{ all -> 0x0095 }
            if (r7 != r4) goto L_0x0081
            if (r6 < 0) goto L_0x006c
            r1 = 1
            r1 = r4
            r6 = 1
        L_0x0043:
            int r7 = r1.b     // Catch:{ all -> 0x0095 }
            if (r7 != r0) goto L_0x005b
            K r7 = r1.c     // Catch:{ all -> 0x0095 }
            if (r7 == r9) goto L_0x0053
            if (r7 == 0) goto L_0x005b
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0095 }
            if (r7 == 0) goto L_0x005b
        L_0x0053:
            V r7 = r1.d     // Catch:{ all -> 0x0095 }
            if (r11 != 0) goto L_0x0059
            r1.d = r10     // Catch:{ all -> 0x0095 }
        L_0x0059:
            r1 = r6
            goto L_0x0082
        L_0x005b:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r7 = r1.e     // Catch:{ all -> 0x0095 }
            if (r7 != 0) goto L_0x0068
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r7 = new io.netty.util.internal.chmv8.ConcurrentHashMapV8$g     // Catch:{ all -> 0x0095 }
            r7.<init>(r0, r9, r10, r5)     // Catch:{ all -> 0x0095 }
            r1.e = r7     // Catch:{ all -> 0x0095 }
            r7 = r5
            goto L_0x0059
        L_0x0068:
            int r6 = r6 + 1
            r1 = r7
            goto L_0x0043
        L_0x006c:
            boolean r6 = r4 instanceof io.netty.util.internal.chmv8.ConcurrentHashMapV8.i     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0081
            r1 = 2
            r6 = r4
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$i r6 = (io.netty.util.internal.chmv8.ConcurrentHashMapV8.i) r6     // Catch:{ all -> 0x0095 }
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$j r6 = r6.a(r0, r9, r10)     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0081
            V r7 = r6.d     // Catch:{ all -> 0x0095 }
            if (r11 != 0) goto L_0x0082
            r6.d = r10     // Catch:{ all -> 0x0095 }
            goto L_0x0082
        L_0x0081:
            r7 = r5
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x000f
            r9 = 8
            if (r1 < r9) goto L_0x008c
            r8.b(r2, r3)
        L_0x008c:
            if (r7 == 0) goto L_0x008f
            return r7
        L_0x008f:
            r9 = 1
            r8.a(r9, r1)
            return r5
        L_0x0095:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0095 }
            throw r9
        L_0x0098:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g[] r2 = r8.c()
            goto L_0x000f
        L_0x009e:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>()
            goto L_0x00a5
        L_0x00a4:
            throw r9
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.a(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public void clear() {
        g<K, V>[] gVarArr = this.a;
        long j2 = 0;
        loop0:
        while (true) {
            int i2 = 0;
            while (gVarArr != null && i2 < gVarArr.length) {
                g a2 = a(gVarArr, i2);
                if (a2 == null) {
                    i2++;
                } else {
                    int i3 = a2.b;
                    if (i3 == -1) {
                        gVarArr = a(gVarArr, a2);
                    } else {
                        synchronized (a2) {
                            if (a(gVarArr, i2) == a2) {
                                g gVar = i3 >= 0 ? a2 : a2 instanceof i ? ((i) a2).f : null;
                                while (gVar != null) {
                                    j2--;
                                    gVar = gVar.e;
                                }
                                int i4 = i2 + 1;
                                a(gVarArr, i2, null);
                                i2 = i4;
                            }
                        }
                    }
                }
            }
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        if (obj != null) {
            g<K, V>[] gVarArr = this.a;
            if (gVarArr != null) {
                h hVar = new h(gVarArr, gVarArr.length, 0, gVarArr.length);
                while (true) {
                    g a2 = hVar.a();
                    if (a2 == null) {
                        break;
                    }
                    V v2 = a2.d;
                    if (v2 == obj || (v2 != null && obj.equals(v2))) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new NullPointerException();
    }

    public Set<Entry<K, V>> entrySet() {
        EntrySetView<K, V> entrySetView = this.l;
        if (entrySetView != null) {
            return entrySetView;
        }
        EntrySetView<K, V> entrySetView2 = new EntrySetView<>(this);
        this.l = entrySetView2;
        return entrySetView2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            g<K, V>[] gVarArr = this.a;
            int length = gVarArr == null ? 0 : gVarArr.length;
            h hVar = new h(gVarArr, length, 0, length);
            while (true) {
                g a2 = hVar.a();
                if (a2 != null) {
                    V v2 = a2.d;
                    V v3 = map.get(a2.c);
                    if (v3 == null || (v3 != v2 && !v3.equals(v2))) {
                        return false;
                    }
                } else {
                    for (Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (key != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                Object obj2 = get(key);
                                if (obj2 != null && (value == obj2 || value.equals(obj2))) {
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        return r1.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = a(r0)
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V>[] r1 = r4.a
            r2 = 0
            if (r1 == 0) goto L_0x004f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004f
            int r3 = r3 + -1
            r3 = r3 & r0
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r1 = a((io.netty.util.internal.chmv8.ConcurrentHashMapV8.g<K, V>[]) r1, r3)
            if (r1 == 0) goto L_0x004f
            int r3 = r1.b
            if (r3 != r0) goto L_0x002c
            K r3 = r1.c
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0038
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0038
        L_0x0029:
            V r5 = r1.d
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0038
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g r5 = r1.a(r0, r5)
            if (r5 == 0) goto L_0x0037
            V r5 = r5.d
            return r5
        L_0x0037:
            return r2
        L_0x0038:
            io.netty.util.internal.chmv8.ConcurrentHashMapV8$g<K, V> r1 = r1.e
            if (r1 == 0) goto L_0x004f
            int r3 = r1.b
            if (r3 != r0) goto L_0x0038
            K r3 = r1.c
            if (r3 == r5) goto L_0x004c
            if (r3 == 0) goto L_0x0038
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0038
        L_0x004c:
            V r5 = r1.d
            return r5
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.ConcurrentHashMapV8.get(java.lang.Object):java.lang.Object");
    }

    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 == null ? v2 : v3;
    }

    public int hashCode() {
        g<K, V>[] gVarArr = this.a;
        int i2 = 0;
        if (gVarArr != null) {
            h hVar = new h(gVarArr, gVarArr.length, 0, gVarArr.length);
            while (true) {
                g a2 = hVar.a();
                if (a2 == null) {
                    break;
                }
                i2 += a2.d.hashCode() ^ a2.c.hashCode();
            }
        }
        return i2;
    }

    public boolean isEmpty() {
        return d() <= 0;
    }

    public /* synthetic */ Set keySet() {
        KeySetView<K, V> keySetView = this.j;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView<K, V> keySetView2 = new KeySetView<>(this, null);
        this.j = keySetView2;
        return keySetView2;
    }

    public V put(K k2, V v2) {
        return a(k2, v2, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        int b2 = size >= 536870912 ? 1073741824 : b(size + (size >>> 1) + 1);
        while (true) {
            int i2 = this.e;
            if (i2 < 0) {
                break;
            }
            g<K, V>[] gVarArr = this.a;
            if (gVarArr != null) {
                int length = gVarArr.length;
                if (length != 0) {
                    if (b2 <= i2 || length >= 1073741824) {
                        break;
                    } else if (gVarArr == this.a) {
                        if (n.compareAndSwapInt(this, o, i2, -2)) {
                            a(gVarArr, (g<K, V>[]) null);
                        }
                    }
                }
            }
            int i3 = i2 > b2 ? i2 : b2;
            if (n.compareAndSwapInt(this, o, i2, -1)) {
                try {
                    if (this.a == gVarArr) {
                        this.a = (g[]) new g[i3];
                        i2 = i3 - (i3 >>> 2);
                    }
                } finally {
                    this.e = i2;
                }
            }
        }
        for (Entry entry : map.entrySet()) {
            a((K) entry.getKey(), (V) entry.getValue(), false);
        }
    }

    public V putIfAbsent(K k2, V v2) {
        return a(k2, v2, true);
    }

    public V remove(Object obj) {
        return a(obj, (V) null, (Object) null);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            return (obj2 == null || a(obj, (V) null, obj2) == null) ? false : true;
        }
        throw new NullPointerException();
    }

    public V replace(K k2, V v2) {
        if (k2 != null && v2 != null) {
            return a((Object) k2, v2, (Object) null);
        }
        throw new NullPointerException();
    }

    public boolean replace(K k2, V v2, V v3) {
        if (k2 != null && v2 != null && v3 != null) {
            return a((Object) k2, v3, (Object) v2) != null;
        }
        throw new NullPointerException();
    }

    public int size() {
        long d2 = d();
        if (d2 < 0) {
            return 0;
        }
        if (d2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) d2;
    }

    public String toString() {
        g<K, V>[] gVarArr = this.a;
        int length = gVarArr == null ? 0 : gVarArr.length;
        h hVar = new h(gVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        g a2 = hVar.a();
        if (a2 != null) {
            while (true) {
                String str = a2.c;
                String str2 = a2.d;
                String str3 = "(this Map)";
                if (str == this) {
                    str = str3;
                }
                sb.append(str);
                sb.append('=');
                if (str2 == this) {
                    str2 = str3;
                }
                sb.append(str2);
                a2 = hVar.a();
                if (a2 == null) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Collection<V> values() {
        ValuesView<K, V> valuesView = this.k;
        if (valuesView != null) {
            return valuesView;
        }
        ValuesView<K, V> valuesView2 = new ValuesView<>(this);
        this.k = valuesView2;
        return valuesView2;
    }
}
