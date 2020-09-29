package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Logger a = Logger.getLogger(LocalCache.class.getName());
    static final p<Object, Object> m = new p<Object, Object>() {
        public final int a() {
            return 0;
        }

        public final p<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, fcc<Object, Object> fcc) {
            return this;
        }

        public final void a(Object obj) {
        }

        public final fcc<Object, Object> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return false;
        }

        public final Object get() {
            return null;
        }
    };
    static final Queue<?> n = new AbstractQueue<Object>() {
        public final Iterator<Object> iterator() {
            return ImmutableSet.h().iterator();
        }

        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }
    };
    final Segment<K, V>[] b;
    final fbj<Object> c;
    final fbj<Object> d;
    final Strength e;
    final long f;
    final fcd<K, V> g;
    final long h;
    final Queue<RemovalNotification<K, V>> i;
    final fbw j;
    final EntryFactory k;
    final CacheLoader<? super K, V> l;
    private int o;
    private int p;
    private Strength q;
    private long r;
    private long s;
    private Set<K> t;
    private Collection<V> u;
    private Set<Entry<K, V>> v;

    enum EntryFactory {
        STRONG {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new l(k, i, fcc);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                a(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new j(k, i, fcc);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                b(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new n(k, i, fcc);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                a(fcc, a);
                b(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new k(k, i, fcc);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new t(segment.keyReferenceQueue, k, i, fcc);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                a(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new r(segment.keyReferenceQueue, k, i, fcc);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                b(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new v(segment.keyReferenceQueue, k, i, fcc);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
                fcc<K, V> a = super.a(segment, fcc, fcc2);
                a(fcc, a);
                b(fcc, a);
                return a;
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i, fcc<K, V> fcc) {
                return new s(segment.keyReferenceQueue, k, i, fcc);
            }
        };

        static {
            EntryFactory entryFactory;
            EntryFactory entryFactory2;
            EntryFactory entryFactory3;
            EntryFactory entryFactory4;
            EntryFactory entryFactory5;
            EntryFactory entryFactory6;
            EntryFactory entryFactory7;
            EntryFactory entryFactory8;
            EntryFactory[] entryFactoryArr = {entryFactory, entryFactory2, entryFactory3, entryFactory4, entryFactory5, entryFactory6, entryFactory7, entryFactory8};
        }

        static <K, V> void a(fcc<K, V> fcc, fcc<K, V> fcc2) {
            fcc2.a(fcc.e());
            LocalCache.a(fcc.g(), fcc2);
            LocalCache.a(fcc2, fcc.f());
            LocalCache.b(fcc);
        }

        static <K, V> void b(fcc<K, V> fcc, fcc<K, V> fcc2) {
            fcc2.b(fcc.h());
            LocalCache.b(fcc.j(), fcc2);
            LocalCache.b(fcc2, fcc.i());
            LocalCache.c(fcc);
        }

        /* access modifiers changed from: 0000 */
        public <K, V> fcc<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, fcc<K, V> fcc2) {
            return a(segment, fcc.d(), fcc.c(), fcc2);
        }

        /* access modifiers changed from: 0000 */
        public abstract <K, V> fcc<K, V> a(Segment<K, V> segment, K k, int i2, fcc<K, V> fcc);
    }

    enum NullEntry implements fcc<Object, Object> {
        INSTANCE;

        public final p<Object, Object> a() {
            return null;
        }

        public final void a(long j) {
        }

        public final void a(p<Object, Object> pVar) {
        }

        public final void a(fcc<Object, Object> fcc) {
        }

        public final fcc<Object, Object> b() {
            return null;
        }

        public final void b(long j) {
        }

        public final void b(fcc<Object, Object> fcc) {
        }

        public final int c() {
            return 0;
        }

        public final void c(fcc<Object, Object> fcc) {
        }

        public final Object d() {
            return null;
        }

        public final void d(fcc<Object, Object> fcc) {
        }

        public final long e() {
            return 0;
        }

        public final fcc<Object, Object> f() {
            return this;
        }

        public final fcc<Object, Object> g() {
            return this;
        }

        public final long h() {
            return 0;
        }

        public final fcc<Object, Object> i() {
            return this;
        }

        public final fcc<Object, Object> j() {
            return this;
        }
    }

    static class Segment<K, V> extends ReentrantLock {
        final Queue<fcc<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount;
        final Queue<fcc<K, V>> recencyQueue;
        final defpackage.fbx.b statsCounter;
        volatile AtomicReferenceArray<fcc<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<fcc<K, V>> writeQueue;

        /* JADX INFO: finally extract failed */
        private h<K, V> a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fcc2 = fcc2.b();
                    } else {
                        p a2 = fcc2.a();
                        if (!a2.c()) {
                            if (!z || a - fcc2.h() >= this.map.h) {
                                this.modCount++;
                                h<K, V> hVar = new h<>(a2);
                                fcc2.a((p<K, V>) hVar);
                                unlock();
                                c();
                                return hVar;
                            }
                        }
                        unlock();
                        c();
                        return null;
                    }
                }
                this.modCount++;
                h<K, V> hVar2 = new h<>();
                fcc a3 = a(k, i, fcc);
                a3.a((p<K, V>) hVar2);
                atomicReferenceArray.set(length, a3);
                unlock();
                c();
                return hVar2;
            } catch (Throwable th) {
                unlock();
                c();
                throw th;
            }
        }

        private fcc<K, V> a(fcc<K, V> fcc, fcc<K, V> fcc2) {
            if (fcc.d() == null) {
                return null;
            }
            p a = fcc.a();
            Object obj = a.get();
            if (obj == null && a.d()) {
                return null;
            }
            fcc<K, V> a2 = this.map.k.a(this, fcc, fcc2);
            a2.a(a.a(this.valueReferenceQueue, obj, a2));
            return a2;
        }

        private fcc<K, V> a(fcc<K, V> fcc, fcc<K, V> fcc2, K k, int i, V v, p<K, V> pVar, RemovalCause removalCause) {
            a(k, v, pVar.a(), removalCause);
            this.writeQueue.remove(fcc2);
            this.accessQueue.remove(fcc2);
            if (!pVar.c()) {
                return b(fcc, fcc2);
            }
            pVar.a(null);
            return fcc;
        }

        private fcc<K, V> a(Object obj, int i, long j) {
            fcc<K, V> d = d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.map.a(d, j)) {
                return d;
            }
            a(j);
            return null;
        }

        private fcc<K, V> a(K k, int i, fcc<K, V> fcc) {
            return this.map.k.a(this, fbp.a(k), i, fcc);
        }

        private V a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            final h a = a(k, i, true);
            if (a == null) {
                return null;
            }
            ffe a2 = a.a(k, cacheLoader);
            final K k2 = k;
            final int i2 = i;
            final ffe ffe = a2;
            AnonymousClass1 r0 = new Runnable() {
                public final void run() {
                    try {
                        Segment.this.a(k2, i2, a, ffe);
                    } catch (Throwable th) {
                        LocalCache.a.log(Level.WARNING, "Exception thrown during refresh", th);
                        a.a(th);
                    }
                }
            };
            a2.addListener(r0, DirectExecutor.INSTANCE);
            if (a2.isDone()) {
                try {
                    return ffh.a(a2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private static AtomicReferenceArray<fcc<K, V>> a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        private void a(fcc<K, V> fcc) {
            if (this.map.f >= 0) {
                g();
                if (((long) fcc.a().a()) <= this.maxSegmentWeight || a(fcc, fcc.c(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        fcc h = h();
                        if (!a(h, h.c(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        private void a(fcc<K, V> fcc, long j) {
            if (this.map.b()) {
                fcc.a(j);
            }
            this.accessQueue.add(fcc);
        }

        private void a(fcc<K, V> fcc, K k, V v, long j) {
            p a = fcc.a();
            int a2 = this.map.g.a();
            boolean z = true;
            fbp.b(a2 >= 0, "Weights must be non-negative");
            fcc.a(this.map.e.a(this, fcc, v, a2));
            g();
            this.totalWeight += (long) a2;
            if (this.map.b()) {
                fcc.a(j);
            }
            LocalCache<K, V> localCache = this.map;
            if (!localCache.a() && !localCache.c()) {
                z = false;
            }
            if (z) {
                fcc.b(j);
            }
            this.accessQueue.add(fcc);
            this.writeQueue.add(fcc);
            a.a(v);
        }

        private boolean a(fcc<K, V> fcc, int i, RemovalCause removalCause) {
            int i2 = this.count;
            AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            fcc<K, V> fcc2 = (fcc) atomicReferenceArray.get(length);
            for (fcc<K, V> fcc3 = fcc2; fcc3 != null; fcc3 = fcc3.b()) {
                if (fcc3 == fcc) {
                    this.modCount++;
                    int i3 = this.count - 1;
                    atomicReferenceArray.set(length, a(fcc2, fcc3, fcc3.d(), i, fcc3.a().get(), fcc3.a(), removalCause));
                    this.count = i3;
                    return true;
                }
            }
            return false;
        }

        private boolean a(K k, int i, h<K, V> hVar) {
            lock();
            try {
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fcc2 = fcc2.b();
                    } else if (fcc2.a() == hVar) {
                        if (hVar.d()) {
                            fcc2.a(hVar.a);
                        } else {
                            atomicReferenceArray.set(length, b(fcc, fcc2));
                        }
                        return true;
                    } else {
                        unlock();
                        c();
                        return false;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        private boolean a(K k, int i, h<K, V> hVar, V v) {
            lock();
            long a = this.map.j.a();
            b(a);
            int i2 = this.count + 1;
            if (i2 > this.threshold) {
                i();
                i2 = this.count + 1;
            }
            AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
            int length = i & (atomicReferenceArray.length() - 1);
            fcc fcc = (fcc) atomicReferenceArray.get(length);
            fcc fcc2 = fcc;
            while (fcc2 != null) {
                Object d = fcc2.d();
                if (fcc2.c() != i || d == null || !this.map.c.a(k, d)) {
                    try {
                        fcc2 = fcc2.b();
                    } catch (Throwable th) {
                        unlock();
                        c();
                        throw th;
                    }
                } else {
                    p<Object, Object> a2 = fcc2.a();
                    Object obj = a2.get();
                    if (hVar != a2) {
                        if (obj != null || a2 == LocalCache.m) {
                            a(k, v, 0, RemovalCause.REPLACED);
                            unlock();
                            c();
                            return false;
                        }
                    }
                    this.modCount++;
                    if (hVar.d()) {
                        a(k, (V) obj, hVar.a(), obj == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                        i2--;
                    }
                    a(fcc2, k, v, a);
                    this.count = i2;
                    a(fcc2);
                    unlock();
                    c();
                    return true;
                }
            }
            this.modCount++;
            fcc a3 = a(k, i, fcc);
            a(a3, k, v, a);
            atomicReferenceArray.set(length, a3);
            this.count = i2;
            a(a3);
            unlock();
            c();
            return true;
        }

        private fcc<K, V> b(fcc<K, V> fcc, fcc<K, V> fcc2) {
            int i = this.count;
            fcc<K, V> b = fcc2.b();
            while (fcc != fcc2) {
                fcc<K, V> a = a(fcc, b);
                if (a != null) {
                    b = a;
                } else {
                    b(fcc);
                    i--;
                }
                fcc = fcc.b();
            }
            this.count = i;
            return b;
        }

        private void b(fcc<K, V> fcc) {
            Object d = fcc.d();
            fcc.c();
            a((K) d, (V) fcc.a().get(), fcc.a().a(), RemovalCause.COLLECTED);
            this.writeQueue.remove(fcc);
            this.accessQueue.remove(fcc);
        }

        private void c(long j) {
            fcc fcc;
            fcc fcc2;
            g();
            do {
                fcc = (fcc) this.writeQueue.peek();
                if (fcc == null || !this.map.a(fcc, j)) {
                    do {
                        fcc2 = (fcc) this.accessQueue.peek();
                        if (fcc2 == null || !this.map.a(fcc2, j)) {
                            return;
                        }
                    } while (a(fcc2, fcc2.c(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(fcc, fcc.c(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        private fcc<K, V> d(Object obj, int i) {
            AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
            for (fcc<K, V> fcc = (fcc) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); fcc != null; fcc = fcc.b()) {
                if (fcc.c() == i) {
                    Object d = fcc.d();
                    if (d == null) {
                        a();
                    } else if (this.map.c.a(obj, d)) {
                        return fcc;
                    }
                }
            }
            return null;
        }

        private void d() {
            if (this.map.d()) {
                e();
            }
            if (this.map.e()) {
                f();
            }
        }

        private void e() {
            int i = 0;
            do {
                Reference poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((fcc) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        private void f() {
            int i = 0;
            do {
                Reference poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.a((p) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        private void g() {
            while (true) {
                fcc fcc = (fcc) this.recencyQueue.poll();
                if (fcc == null) {
                    return;
                }
                if (this.accessQueue.contains(fcc)) {
                    this.accessQueue.add(fcc);
                }
            }
        }

        private fcc<K, V> h() {
            for (fcc<K, V> fcc : this.accessQueue) {
                if (fcc.a().a() > 0) {
                    return fcc;
                }
            }
            throw new AssertionError();
        }

        private void i() {
            AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<fcc<K, V>> a = a(length << 1);
                this.threshold = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    fcc fcc = (fcc) atomicReferenceArray.get(i2);
                    if (fcc != null) {
                        fcc b = fcc.b();
                        int c = fcc.c() & length2;
                        if (b == null) {
                            a.set(c, fcc);
                        } else {
                            fcc fcc2 = fcc;
                            while (b != null) {
                                int c2 = b.c() & length2;
                                if (c2 != c) {
                                    fcc2 = b;
                                    c = c2;
                                }
                                b = b.b();
                            }
                            a.set(c, fcc2);
                            while (fcc != fcc2) {
                                int c3 = fcc.c() & length2;
                                fcc a2 = a(fcc, (fcc) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    b(fcc);
                                    i--;
                                }
                                fcc = fcc.b();
                            }
                        }
                    }
                }
                this.table = a;
                this.count = i;
            }
        }

        private void j() {
            b(this.map.j.a());
            c();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            if (r9 != null) goto L_0x0061;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V a(java.lang.Object r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.count     // Catch:{ all -> 0x006c }
                r1 = 0
                if (r0 == 0) goto L_0x0068
                com.google.common.cache.LocalCache<K, V> r0 = r8.map     // Catch:{ all -> 0x006c }
                fbw r0 = r0.j     // Catch:{ all -> 0x006c }
                long r2 = r0.a()     // Catch:{ all -> 0x006c }
                fcc r9 = r8.a(r9, r10, r2)     // Catch:{ all -> 0x006c }
                if (r9 != 0) goto L_0x0017
                r8.b()
                return r1
            L_0x0017:
                com.google.common.cache.LocalCache$p r0 = r9.a()     // Catch:{ all -> 0x006c }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006c }
                if (r0 == 0) goto L_0x0065
                com.google.common.cache.LocalCache<K, V> r1 = r8.map     // Catch:{ all -> 0x006c }
                boolean r1 = r1.b()     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x002c
                r9.a(r2)     // Catch:{ all -> 0x006c }
            L_0x002c:
                java.util.Queue<fcc<K, V>> r1 = r8.recencyQueue     // Catch:{ all -> 0x006c }
                r1.add(r9)     // Catch:{ all -> 0x006c }
                java.lang.Object r1 = r9.d()     // Catch:{ all -> 0x006c }
                com.google.common.cache.LocalCache<K, V> r4 = r8.map     // Catch:{ all -> 0x006c }
                com.google.common.cache.CacheLoader<? super K, V> r4 = r4.l     // Catch:{ all -> 0x006c }
                com.google.common.cache.LocalCache<K, V> r5 = r8.map     // Catch:{ all -> 0x006c }
                boolean r5 = r5.c()     // Catch:{ all -> 0x006c }
                if (r5 == 0) goto L_0x0060
                long r5 = r9.h()     // Catch:{ all -> 0x006c }
                long r2 = r2 - r5
                com.google.common.cache.LocalCache<K, V> r5 = r8.map     // Catch:{ all -> 0x006c }
                long r5 = r5.h     // Catch:{ all -> 0x006c }
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x0060
                com.google.common.cache.LocalCache$p r9 = r9.a()     // Catch:{ all -> 0x006c }
                boolean r9 = r9.c()     // Catch:{ all -> 0x006c }
                if (r9 != 0) goto L_0x0060
                r9 = 1
                java.lang.Object r9 = r8.a((K) r1, r10, r4, r9)     // Catch:{ all -> 0x006c }
                if (r9 == 0) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r9 = r0
            L_0x0061:
                r8.b()
                return r9
            L_0x0065:
                r8.a()     // Catch:{ all -> 0x006c }
            L_0x0068:
                r8.b()
                return r1
            L_0x006c:
                r9 = move-exception
                r8.b()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.a(java.lang.Object, int):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final V a(K r4, int r5, com.google.common.cache.LocalCache.h<K, V> r6, defpackage.ffe<V> r7) {
            /*
                r3 = this;
                java.lang.Object r7 = defpackage.ffh.a(r7)     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0023
                fbx$b r0 = r3.statsCounter     // Catch:{ all -> 0x0021 }
                long r1 = r6.e()     // Catch:{ all -> 0x0021 }
                r0.a(r1)     // Catch:{ all -> 0x0021 }
                r3.a((K) r4, r5, r6, (V) r7)     // Catch:{ all -> 0x0021 }
                if (r7 != 0) goto L_0x0020
                fbx$b r0 = r3.statsCounter
                long r1 = r6.e()
                r0.b(r1)
                r3.a((K) r4, r5, r6)
            L_0x0020:
                return r7
            L_0x0021:
                r0 = move-exception
                goto L_0x003e
            L_0x0023:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x0021 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.<init>(r2)     // Catch:{ all -> 0x0021 }
                r1.append(r4)     // Catch:{ all -> 0x0021 }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x0021 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0021 }
                r0.<init>(r1)     // Catch:{ all -> 0x0021 }
                throw r0     // Catch:{ all -> 0x0021 }
            L_0x003c:
                r0 = move-exception
                r7 = 0
            L_0x003e:
                if (r7 != 0) goto L_0x004c
                fbx$b r7 = r3.statsCounter
                long r1 = r6.e()
                r7.b(r1)
                r3.a((K) r4, r5, r6)
            L_0x004c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.a(java.lang.Object, int, com.google.common.cache.LocalCache$h, ffe):java.lang.Object");
        }

        /* access modifiers changed from: 0000 */
        public final V a(K k, int i, V v) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i2 || d == null || !this.map.c.a(k2, d)) {
                        fcc2 = fcc2.b();
                    } else {
                        p a2 = fcc2.a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                int i4 = this.count - 1;
                                atomicReferenceArray.set(length, a(fcc, fcc2, d, i, v2, a2, RemovalCause.COLLECTED));
                                this.count = i4;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, a2.a(), RemovalCause.REPLACED);
                        a(fcc2, k, v, a);
                        a(fcc2);
                        unlock();
                        c();
                        return v2;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final V a(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                if (this.count + 1 > this.threshold) {
                    i();
                    int i3 = this.count;
                }
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fcc2 = fcc2.b();
                    } else {
                        p a2 = fcc2.a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (a2.d()) {
                                a(k, v2, a2.a(), RemovalCause.COLLECTED);
                                a(fcc2, k, v, a);
                                i2 = this.count;
                            } else {
                                a(fcc2, k, v, a);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            a(fcc2);
                            return null;
                        } else if (z) {
                            a(fcc2, a);
                            unlock();
                            c();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k, v2, a2.a(), RemovalCause.REPLACED);
                            a(fcc2, k, v, a);
                            a(fcc2);
                            unlock();
                            c();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                fcc a3 = a(k, i, fcc);
                a(a3, k, v, a);
                atomicReferenceArray.set(length, a3);
                this.count++;
                a(a3);
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (tryLock()) {
                try {
                    d();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(long j) {
            if (tryLock()) {
                try {
                    c(j);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(K k, V v, int i, RemovalCause removalCause) {
            this.totalWeight -= (long) i;
            if (removalCause.a()) {
                this.statsCounter.a();
            }
            if (this.map.i != LocalCache.n) {
                this.map.i.offer(RemovalNotification.a(k, v, removalCause));
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fcc<K, V> fcc, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc<K, V> fcc2 = (fcc) atomicReferenceArray.get(length);
                for (fcc<K, V> fcc3 = fcc2; fcc3 != null; fcc3 = fcc3.b()) {
                    if (fcc3 == fcc) {
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fcc2, fcc3, fcc3.d(), i, fcc3.a().get(), fcc3.a(), RemovalCause.COLLECTED));
                        this.count = i3;
                        return true;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(K k, int i, p<K, V> pVar) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fcc2 = fcc2.b();
                    } else if (fcc2.a() == pVar) {
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fcc, fcc2, d, i, pVar.get(), pVar, RemovalCause.COLLECTED));
                        this.count = i3;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            c();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    c();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(K k, int i, V v, V v2) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i2 || d == null || !this.map.c.a(k2, d)) {
                        V v3 = v;
                        fcc2 = fcc2.b();
                    } else {
                        p a2 = fcc2.a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                int i4 = this.count - 1;
                                atomicReferenceArray.set(length, a(fcc, fcc2, d, i, obj, a2, RemovalCause.COLLECTED));
                                this.count = i4;
                            }
                            return false;
                        } else if (this.map.d.a(v, obj)) {
                            this.modCount++;
                            a(k2, (V) obj, a2.a(), RemovalCause.REPLACED);
                            a(fcc2, k, v2, a);
                            a(fcc2);
                            unlock();
                            c();
                            return true;
                        } else {
                            a(fcc2, a);
                            unlock();
                            c();
                            return false;
                        }
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            if (tryLock()) {
                try {
                    d();
                    c(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    fcc a = a(obj, i, this.map.j.a());
                    if (a == null) {
                        return false;
                    }
                    if (a.a().get() != null) {
                        z = true;
                    }
                    b();
                    return z;
                }
                b();
                return false;
            } finally {
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                b(this.map.j.a());
                int i2 = this.count;
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(obj, d)) {
                        fcc2 = fcc2.b();
                    } else {
                        p a = fcc2.a();
                        Object obj3 = a.get();
                        if (this.map.d.a(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 != null || !a.d()) {
                            unlock();
                            c();
                            return false;
                        } else {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fcc, fcc2, d, i, obj3, a, removalCause));
                        this.count = i3;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                c();
                return false;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final V c(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                b(this.map.j.a());
                int i2 = this.count;
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fcc fcc = (fcc) atomicReferenceArray.get(length);
                fcc fcc2 = fcc;
                while (fcc2 != null) {
                    Object d = fcc2.d();
                    if (fcc2.c() != i || d == null || !this.map.c.a(obj, d)) {
                        fcc2 = fcc2.b();
                    } else {
                        p a = fcc2.a();
                        V v = a.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (a.d()) {
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            unlock();
                            c();
                            return null;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fcc, fcc2, d, i, v, a, removalCause2));
                        this.count = i3;
                        return v;
                    }
                }
                unlock();
                c();
                return null;
            } finally {
                unlock();
                c();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            if (!isHeldByCurrentThread()) {
                this.map.h();
            }
        }
    }

    public enum Strength {
        STRONG {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, V v, int i) {
                return i == 1 ? new m(v) : new x(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, V v, int i) {
                return i == 1 ? new i(segment.valueReferenceQueue, v, fcc) : new w(segment.valueReferenceQueue, v, fcc, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, V v, int i) {
                return i == 1 ? new u(segment.valueReferenceQueue, v, fcc) : new y(segment.valueReferenceQueue, v, fcc, i);
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract <K, V> p<K, V> a(Segment<K, V> segment, fcc<K, V> fcc, V v, int i);
    }

    abstract class a<T> extends AbstractSet<T> {
        final ConcurrentMap<?, ?> a;

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public int size() {
            return this.a.size();
        }

        public Object[] toArray() {
            return LocalCache.a((Collection) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.a((Collection) this).toArray(eArr);
        }
    }

    static abstract class b<K, V> implements fcc<K, V> {
        b() {
        }

        public p<K, V> a() {
            throw new UnsupportedOperationException();
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public void a(p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        public void a(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> b() {
            throw new UnsupportedOperationException();
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public void b(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public int c() {
            throw new UnsupportedOperationException();
        }

        public void c(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public K d() {
            throw new UnsupportedOperationException();
        }

        public void d(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public long e() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> g() {
            throw new UnsupportedOperationException();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> i() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> j() {
            throw new UnsupportedOperationException();
        }
    }

    final class c extends e<Entry<K, V>> {
        c() {
            super();
        }

        public final /* synthetic */ Object next() {
            return a();
        }
    }

    final class d extends a<Entry<K, V>> {
        d(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = LocalCache.this.get(key);
            return obj2 != null && LocalCache.this.d.a(entry.getValue(), obj2);
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new c();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            return key != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    abstract class e<T> implements Iterator<T> {
        private int a;
        private int b = -1;
        private Segment<K, V> c;
        private AtomicReferenceArray<fcc<K, V>> d;
        private fcc<K, V> e;
        private z f;
        private z g;

        e() {
            this.a = LocalCache.this.b.length - 1;
            b();
        }

        /* JADX INFO: finally extract failed */
        private boolean a(fcc<K, V> fcc) {
            try {
                long a2 = LocalCache.this.j.a();
                Object d2 = fcc.d();
                LocalCache localCache = LocalCache.this;
                Object obj = null;
                if (fcc.d() != null) {
                    Object obj2 = fcc.a().get();
                    if (obj2 != null) {
                        if (!localCache.a(fcc, a2)) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.f = new z<>(d2, obj);
                    this.c.b();
                    return true;
                }
                this.c.b();
                return false;
            } catch (Throwable th) {
                this.c.b();
                throw th;
            }
        }

        private void b() {
            this.f = null;
            if (!c() && !d()) {
                while (this.a >= 0) {
                    Segment<K, V>[] segmentArr = LocalCache.this.b;
                    int i = this.a;
                    this.a = i - 1;
                    this.c = segmentArr[i];
                    if (this.c.count != 0) {
                        this.d = this.c.table;
                        this.b = this.d.length() - 1;
                        if (d()) {
                            break;
                        }
                    }
                }
            }
        }

        private boolean c() {
            fcc<K, V> fcc = this.e;
            if (fcc != null) {
                while (true) {
                    this.e = fcc.b();
                    fcc<K, V> fcc2 = this.e;
                    if (fcc2 == null) {
                        break;
                    } else if (a(fcc2)) {
                        return true;
                    } else {
                        fcc = this.e;
                    }
                }
            }
            return false;
        }

        private boolean d() {
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = this.d;
                this.b = i - 1;
                fcc<K, V> fcc = (fcc) atomicReferenceArray.get(i);
                this.e = fcc;
                if (fcc == null || (!a(this.e) && !c())) {
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final z a() {
            z zVar = this.f;
            if (zVar != null) {
                this.g = zVar;
                b();
                return this.g;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f != null;
        }

        public void remove() {
            fbp.b(this.g != null);
            LocalCache.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    final class f extends e<K> {
        f() {
            super();
        }

        public final K next() {
            return a().getKey();
        }
    }

    final class g extends a<K> {
        g(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new f();
        }

        public final boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }
    }

    static class h<K, V> implements p<K, V> {
        volatile p<K, V> a;
        private SettableFuture<V> b;
        private fbs c;

        public h() {
            this(LocalCache.f());
        }

        public h(p<K, V> pVar) {
            this.b = SettableFuture.create();
            this.c = new fbs();
            this.a = pVar;
        }

        public final int a() {
            return this.a.a();
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return this;
        }

        public final ffe<V> a(K k, CacheLoader<? super K, V> cacheLoader) {
            ffe<V> ffe;
            try {
                fbs fbs = this.c;
                fbp.b(!fbs.b, "This stopwatch is already running.");
                fbs.b = true;
                fbs.c = fbs.a.a();
                Object obj = this.a.get();
                if (obj == null) {
                    Object a2 = cacheLoader.a();
                    return b(a2) ? this.b : ffa.a(a2);
                }
                fbp.a(k);
                fbp.a(obj);
                ffe a3 = ffa.a(cacheLoader.a());
                return a3 == null ? ffa.a(null) : fey.a(a3, new Function<V, V>() {
                    public final V apply(V v) {
                        h.this.b(v);
                        return v;
                    }
                }, DirectExecutor.INSTANCE);
            } catch (Throwable th) {
                if (a(th)) {
                    ffe = this.b;
                } else {
                    fbp.a(th);
                    ffe = new defpackage.ffd.a<>(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return ffe;
            }
        }

        public final void a(V v) {
            if (v != null) {
                b(v);
            } else {
                this.a = LocalCache.f();
            }
        }

        public final boolean a(Throwable th) {
            return this.b.setException(th);
        }

        public final fcc<K, V> b() {
            return null;
        }

        public final boolean b(V v) {
            return this.b.set(v);
        }

        public final boolean c() {
            return true;
        }

        public final boolean d() {
            return this.a.d();
        }

        public final long e() {
            return TimeUnit.NANOSECONDS.convert(this.c.a(), TimeUnit.NANOSECONDS);
        }

        public final V get() {
            return this.a.get();
        }
    }

    static class i<K, V> extends SoftReference<V> implements p<K, V> {
        private fcc<K, V> a;

        i(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            super(v, referenceQueue);
            this.a = fcc;
        }

        public int a() {
            return 1;
        }

        public p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return new i(referenceQueue, v, fcc);
        }

        public final void a(V v) {
        }

        public final fcc<K, V> b() {
            return this.a;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }
    }

    static final class j<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();

        j(K k, int i, fcc<K, V> fcc) {
            super(k, i, fcc);
        }

        public final void a(long j) {
            this.a = j;
        }

        public final void a(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void b(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final long e() {
            return this.a;
        }

        public final fcc<K, V> f() {
            return this.b;
        }

        public final fcc<K, V> g() {
            return this.c;
        }
    }

    static final class k<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();
        private volatile long d = Long.MAX_VALUE;
        private fcc<K, V> e = LocalCache.g();
        private fcc<K, V> f = LocalCache.g();

        k(K k, int i, fcc<K, V> fcc) {
            super(k, i, fcc);
        }

        public final void a(long j) {
            this.a = j;
        }

        public final void a(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void b(long j) {
            this.d = j;
        }

        public final void b(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final void c(fcc<K, V> fcc) {
            this.e = fcc;
        }

        public final void d(fcc<K, V> fcc) {
            this.f = fcc;
        }

        public final long e() {
            return this.a;
        }

        public final fcc<K, V> f() {
            return this.b;
        }

        public final fcc<K, V> g() {
            return this.c;
        }

        public final long h() {
            return this.d;
        }

        public final fcc<K, V> i() {
            return this.e;
        }

        public final fcc<K, V> j() {
            return this.f;
        }
    }

    static class l<K, V> extends b<K, V> {
        private K a;
        private int b;
        private fcc<K, V> c;
        private volatile p<K, V> d = LocalCache.f();

        l(K k, int i, fcc<K, V> fcc) {
            this.a = k;
            this.b = i;
            this.c = fcc;
        }

        public final p<K, V> a() {
            return this.d;
        }

        public final void a(p<K, V> pVar) {
            this.d = pVar;
        }

        public final fcc<K, V> b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public final K d() {
            return this.a;
        }
    }

    static class m<K, V> implements p<K, V> {
        private V a;

        m(V v) {
            this.a = v;
        }

        public int a() {
            return 1;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return this;
        }

        public final void a(V v) {
        }

        public final fcc<K, V> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        public V get() {
            return this.a;
        }
    }

    static final class n<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();

        n(K k, int i, fcc<K, V> fcc) {
            super(k, i, fcc);
        }

        public final void b(long j) {
            this.a = j;
        }

        public final void c(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void d(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final long h() {
            return this.a;
        }

        public final fcc<K, V> i() {
            return this.b;
        }

        public final fcc<K, V> j() {
            return this.c;
        }
    }

    final class o extends e<V> {
        o() {
            super();
        }

        public final V next() {
            return a().getValue();
        }
    }

    public interface p<K, V> {
        int a();

        p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc);

        void a(V v);

        fcc<K, V> b();

        boolean c();

        boolean d();

        V get();
    }

    final class q extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> a;

        q(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public final void clear() {
            this.a.clear();
        }

        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new o();
        }

        public final int size() {
            return this.a.size();
        }

        public final Object[] toArray() {
            return LocalCache.a((Collection) this).toArray();
        }

        public final <E> E[] toArray(E[] eArr) {
            return LocalCache.a((Collection) this).toArray(eArr);
        }
    }

    static final class r<K, V> extends t<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();

        r(ReferenceQueue<K> referenceQueue, K k, int i, fcc<K, V> fcc) {
            super(referenceQueue, k, i, fcc);
        }

        public final void a(long j) {
            this.a = j;
        }

        public final void a(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void b(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final long e() {
            return this.a;
        }

        public final fcc<K, V> f() {
            return this.b;
        }

        public final fcc<K, V> g() {
            return this.c;
        }
    }

    static final class s<K, V> extends t<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();
        private volatile long d = Long.MAX_VALUE;
        private fcc<K, V> e = LocalCache.g();
        private fcc<K, V> f = LocalCache.g();

        s(ReferenceQueue<K> referenceQueue, K k, int i, fcc<K, V> fcc) {
            super(referenceQueue, k, i, fcc);
        }

        public final void a(long j) {
            this.a = j;
        }

        public final void a(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void b(long j) {
            this.d = j;
        }

        public final void b(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final void c(fcc<K, V> fcc) {
            this.e = fcc;
        }

        public final void d(fcc<K, V> fcc) {
            this.f = fcc;
        }

        public final long e() {
            return this.a;
        }

        public final fcc<K, V> f() {
            return this.b;
        }

        public final fcc<K, V> g() {
            return this.c;
        }

        public final long h() {
            return this.d;
        }

        public final fcc<K, V> i() {
            return this.e;
        }

        public final fcc<K, V> j() {
            return this.f;
        }
    }

    static class t<K, V> extends WeakReference<K> implements fcc<K, V> {
        private int a;
        private fcc<K, V> b;
        private volatile p<K, V> c = LocalCache.f();

        t(ReferenceQueue<K> referenceQueue, K k, int i, fcc<K, V> fcc) {
            super(k, referenceQueue);
            this.a = i;
            this.b = fcc;
        }

        public final p<K, V> a() {
            return this.c;
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public final void a(p<K, V> pVar) {
            this.c = pVar;
        }

        public void a(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public final fcc<K, V> b() {
            return this.b;
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public void b(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public final int c() {
            return this.a;
        }

        public void c(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public final K d() {
            return get();
        }

        public void d(fcc<K, V> fcc) {
            throw new UnsupportedOperationException();
        }

        public long e() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> g() {
            throw new UnsupportedOperationException();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> i() {
            throw new UnsupportedOperationException();
        }

        public fcc<K, V> j() {
            throw new UnsupportedOperationException();
        }
    }

    static class u<K, V> extends WeakReference<V> implements p<K, V> {
        private fcc<K, V> a;

        u(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            super(v, referenceQueue);
            this.a = fcc;
        }

        public int a() {
            return 1;
        }

        public p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return new u(referenceQueue, v, fcc);
        }

        public final void a(V v) {
        }

        public final fcc<K, V> b() {
            return this.a;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }
    }

    static final class v<K, V> extends t<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fcc<K, V> b = LocalCache.g();
        private fcc<K, V> c = LocalCache.g();

        v(ReferenceQueue<K> referenceQueue, K k, int i, fcc<K, V> fcc) {
            super(referenceQueue, k, i, fcc);
        }

        public final void b(long j) {
            this.a = j;
        }

        public final void c(fcc<K, V> fcc) {
            this.b = fcc;
        }

        public final void d(fcc<K, V> fcc) {
            this.c = fcc;
        }

        public final long h() {
            return this.a;
        }

        public final fcc<K, V> i() {
            return this.b;
        }

        public final fcc<K, V> j() {
            return this.c;
        }
    }

    static final class w<K, V> extends i<K, V> {
        private int a;

        w(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc, int i) {
            super(referenceQueue, v, fcc);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return new w(referenceQueue, v, fcc, this.a);
        }
    }

    static final class x<K, V> extends m<K, V> {
        private int a;

        x(V v, int i) {
            super(v);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }
    }

    static final class y<K, V> extends u<K, V> {
        private int a;

        y(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc, int i) {
            super(referenceQueue, v, fcc);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fcc<K, V> fcc) {
            return new y(referenceQueue, v, fcc, this.a);
        }
    }

    final class z implements Entry<K, V> {
        private K a;
        private V b;

        z(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                    return true;
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
            V put = LocalCache.this.put(this.a, v);
            this.b = v;
            return put;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    private int a(Object obj) {
        int a2 = this.c.a(obj);
        int i2 = a2 + ((a2 << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    private Segment<K, V> a(int i2) {
        return this.b[(i2 >>> this.p) & this.o];
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V> void a(fcc<K, V> fcc, fcc<K, V> fcc2) {
        fcc.a(fcc2);
        fcc2.b(fcc);
    }

    static <K, V> void b(fcc<K, V> fcc) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        fcc.a((fcc<K, V>) nullEntry);
        fcc.b((fcc<K, V>) nullEntry);
    }

    static <K, V> void b(fcc<K, V> fcc, fcc<K, V> fcc2) {
        fcc.c(fcc2);
        fcc2.d(fcc);
    }

    static <K, V> void c(fcc<K, V> fcc) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        fcc.c(nullEntry);
        fcc.d(nullEntry);
    }

    static <K, V> p<K, V> f() {
        return m;
    }

    static <K, V> fcc<K, V> g() {
        return NullEntry.INSTANCE;
    }

    /* access modifiers changed from: 0000 */
    public final void a(p<K, V> pVar) {
        fcc b2 = pVar.b();
        int c2 = b2.c();
        a(c2).a(b2.d(), c2, pVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a(fcc<K, V> fcc) {
        int c2 = fcc.c();
        a(c2).a(fcc, c2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.s > 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(fcc<K, V> fcc, long j2) {
        fbp.a(fcc);
        if (!b() || j2 - fcc.e() < this.r) {
            return a() && j2 - fcc.h() >= this.s;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.r > 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.h > 0;
    }

    public void clear() {
        RemovalCause removalCause;
        Segment<K, V>[] segmentArr = this.b;
        int length = segmentArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Segment<K, V> segment = segmentArr[i2];
            if (segment.count != 0) {
                segment.lock();
                try {
                    segment.b(segment.map.j.a());
                    AtomicReferenceArray<fcc<K, V>> atomicReferenceArray = segment.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (fcc fcc = (fcc) atomicReferenceArray.get(i3); fcc != null; fcc = fcc.b()) {
                            if (fcc.a().d()) {
                                Object d2 = fcc.d();
                                Object obj = fcc.a().get();
                                if (d2 != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        fcc.c();
                                        segment.a(d2, obj, fcc.a().a(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                fcc.c();
                                segment.a(d2, obj, fcc.a().a(), removalCause);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (segment.map.d()) {
                        do {
                        } while (segment.keyReferenceQueue.poll() != null);
                    }
                    if (segment.map.e()) {
                        do {
                        } while (segment.valueReferenceQueue.poll() != null);
                    }
                    segment.writeQueue.clear();
                    segment.accessQueue.clear();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                    segment.c();
                }
            }
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006f A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            fbw r3 = r0.j
            long r3 = r3.a()
            com.google.common.cache.LocalCache$Segment<K, V>[] r5 = r0.b
            r6 = -1
            r7 = r6
            r6 = 0
        L_0x0014:
            r9 = 3
            if (r6 >= r9) goto L_0x009f
            r9 = 0
            int r11 = r5.length
            r12 = r9
            r9 = 0
        L_0x001c:
            if (r9 >= r11) goto L_0x008d
            r10 = r5[r9]
            int r14 = r10.count
            java.util.concurrent.atomic.AtomicReferenceArray<fcc<K, V>> r14 = r10.table
            r15 = 0
        L_0x0025:
            int r2 = r14.length()
            if (r15 >= r2) goto L_0x007f
            java.lang.Object r2 = r14.get(r15)
            fcc r2 = (defpackage.fcc) r2
        L_0x0031:
            if (r2 == 0) goto L_0x0078
            java.lang.Object r16 = r2.d()
            r17 = 0
            if (r16 != 0) goto L_0x0043
            r10.a()
        L_0x003e:
            r18 = r5
        L_0x0040:
            r5 = r17
            goto L_0x0061
        L_0x0043:
            com.google.common.cache.LocalCache$p r16 = r2.a()
            java.lang.Object r16 = r16.get()
            if (r16 != 0) goto L_0x0051
            r10.a()
            goto L_0x003e
        L_0x0051:
            r18 = r5
            com.google.common.cache.LocalCache<K, V> r5 = r10.map
            boolean r5 = r5.a(r2, r3)
            if (r5 == 0) goto L_0x005f
            r10.a(r3)
            goto L_0x0040
        L_0x005f:
            r5 = r16
        L_0x0061:
            r16 = r3
            if (r5 == 0) goto L_0x006f
            fbj<java.lang.Object> r3 = r0.d
            boolean r3 = r3.a(r1, r5)
            if (r3 == 0) goto L_0x006f
            r1 = 1
            return r1
        L_0x006f:
            fcc r2 = r2.b()
            r3 = r16
            r5 = r18
            goto L_0x0031
        L_0x0078:
            r16 = r3
            r18 = r5
            int r15 = r15 + 1
            goto L_0x0025
        L_0x007f:
            r16 = r3
            r18 = r5
            int r2 = r10.modCount
            long r2 = (long) r2
            long r12 = r12 + r2
            int r9 = r9 + 1
            r3 = r16
            r2 = 0
            goto L_0x001c
        L_0x008d:
            r16 = r3
            r18 = r5
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x009f
            int r6 = r6 + 1
            r7 = r12
            r3 = r16
            r5 = r18
            r2 = 0
            goto L_0x0014
        L_0x009f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.containsValue(java.lang.Object):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.q != Strength.STRONG;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.e != Strength.STRONG;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.v;
        if (set != null) {
            return set;
        }
        d dVar = new d(this);
        this.v = dVar;
        return dVar;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).a(obj, a2);
    }

    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        do {
        } while (((RemovalNotification) this.i.poll()) != null);
    }

    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.b;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j2 += (long) segmentArr[i2].modCount;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < segmentArr.length; i3++) {
                if (segmentArr[i3].count != 0) {
                    return false;
                }
                j2 -= (long) segmentArr[i3].modCount;
            }
            if (j2 != 0) {
                return false;
            }
        }
        return true;
    }

    public Set<K> keySet() {
        Set<K> set = this.t;
        if (set != null) {
            return set;
        }
        g gVar = new g(this);
        this.t = gVar;
        return gVar;
    }

    public V put(K k2, V v2) {
        fbp.a(k2);
        fbp.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k2, V v2) {
        fbp.a(k2);
        fbp.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).c(obj, a2);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        return a(a2).b(obj, a2, obj2);
    }

    public V replace(K k2, V v2) {
        fbp.a(k2);
        fbp.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2);
    }

    public boolean replace(K k2, V v2, V v3) {
        fbp.a(k2);
        fbp.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }

    public int size() {
        long j2 = 0;
        for (Segment<K, V> segment : this.b) {
            j2 += (long) Math.max(0, segment.count);
        }
        return fev.b(j2);
    }

    public Collection<V> values() {
        Collection<V> collection = this.u;
        if (collection != null) {
            return collection;
        }
        q qVar = new q(this);
        this.u = qVar;
        return qVar;
    }
}
