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

        public final p<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, fbl<Object, Object> fbl) {
            return this;
        }

        public final void a(Object obj) {
        }

        public final fbl<Object, Object> b() {
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

        public final Iterator<Object> iterator() {
            return ImmutableSet.h().iterator();
        }
    };
    final Segment<K, V>[] b;
    final fas<Object> c;
    final fas<Object> d;
    final Strength e;
    final long f;
    final fbm<K, V> g;
    final long h;
    final Queue<RemovalNotification<K, V>> i;
    final fbf j;
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
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new l(k, i, fbl);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new j(k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                a(fbl, a);
                return a;
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new n(k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                b(fbl, a);
                return a;
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new k(k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                a(fbl, a);
                b(fbl, a);
                return a;
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new t(segment.keyReferenceQueue, k, i, fbl);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new r(segment.keyReferenceQueue, k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                a(fbl, a);
                return a;
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new v(segment.keyReferenceQueue, k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                b(fbl, a);
                return a;
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i, fbl<K, V> fbl) {
                return new s(segment.keyReferenceQueue, k, i, fbl);
            }

            /* access modifiers changed from: 0000 */
            public final <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
                fbl<K, V> a = super.a(segment, fbl, fbl2);
                a(fbl, a);
                b(fbl, a);
                return a;
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract <K, V> fbl<K, V> a(Segment<K, V> segment, K k, int i2, fbl<K, V> fbl);

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

        /* access modifiers changed from: 0000 */
        public <K, V> fbl<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, fbl<K, V> fbl2) {
            return a(segment, fbl.d(), fbl.c(), fbl2);
        }

        static <K, V> void a(fbl<K, V> fbl, fbl<K, V> fbl2) {
            fbl2.a(fbl.e());
            LocalCache.a(fbl.g(), fbl2);
            LocalCache.a(fbl2, fbl.f());
            LocalCache.b(fbl);
        }

        static <K, V> void b(fbl<K, V> fbl, fbl<K, V> fbl2) {
            fbl2.b(fbl.h());
            LocalCache.b(fbl.j(), fbl2);
            LocalCache.b(fbl2, fbl.i());
            LocalCache.c(fbl);
        }
    }

    enum NullEntry implements fbl<Object, Object> {
        INSTANCE;

        public final p<Object, Object> a() {
            return null;
        }

        public final void a(long j) {
        }

        public final void a(p<Object, Object> pVar) {
        }

        public final void a(fbl<Object, Object> fbl) {
        }

        public final fbl<Object, Object> b() {
            return null;
        }

        public final void b(long j) {
        }

        public final void b(fbl<Object, Object> fbl) {
        }

        public final int c() {
            return 0;
        }

        public final void c(fbl<Object, Object> fbl) {
        }

        public final Object d() {
            return null;
        }

        public final void d(fbl<Object, Object> fbl) {
        }

        public final long e() {
            return 0;
        }

        public final fbl<Object, Object> f() {
            return this;
        }

        public final fbl<Object, Object> g() {
            return this;
        }

        public final long h() {
            return 0;
        }

        public final fbl<Object, Object> i() {
            return this;
        }

        public final fbl<Object, Object> j() {
            return this;
        }
    }

    static class Segment<K, V> extends ReentrantLock {
        final Queue<fbl<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount;
        final Queue<fbl<K, V>> recencyQueue;
        final defpackage.fbg.b statsCounter;
        volatile AtomicReferenceArray<fbl<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<fbl<K, V>> writeQueue;

        private static AtomicReferenceArray<fbl<K, V>> a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        private fbl<K, V> a(K k, int i, fbl<K, V> fbl) {
            return this.map.k.a(this, fay.a(k), i, fbl);
        }

        private fbl<K, V> a(fbl<K, V> fbl, fbl<K, V> fbl2) {
            if (fbl.d() == null) {
                return null;
            }
            p a = fbl.a();
            Object obj = a.get();
            if (obj == null && a.d()) {
                return null;
            }
            fbl<K, V> a2 = this.map.k.a(this, fbl, fbl2);
            a2.a(a.a(this.valueReferenceQueue, obj, a2));
            return a2;
        }

        private void a(fbl<K, V> fbl, K k, V v, long j) {
            p a = fbl.a();
            int a2 = this.map.g.a();
            boolean z = true;
            fay.b(a2 >= 0, "Weights must be non-negative");
            fbl.a(this.map.e.a(this, fbl, v, a2));
            g();
            this.totalWeight += (long) a2;
            if (this.map.b()) {
                fbl.a(j);
            }
            LocalCache<K, V> localCache = this.map;
            if (!localCache.a() && !localCache.c()) {
                z = false;
            }
            if (z) {
                fbl.b(j);
            }
            this.accessQueue.add(fbl);
            this.writeQueue.add(fbl);
            a.a(v);
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
                fbf r0 = r0.j     // Catch:{ all -> 0x006c }
                long r2 = r0.a()     // Catch:{ all -> 0x006c }
                fbl r9 = r8.a(r9, r10, r2)     // Catch:{ all -> 0x006c }
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
                java.util.Queue<fbl<K, V>> r1 = r8.recencyQueue     // Catch:{ all -> 0x006c }
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
        public final V a(K r4, int r5, com.google.common.cache.LocalCache.h<K, V> r6, defpackage.fek<V> r7) {
            /*
                r3 = this;
                java.lang.Object r7 = defpackage.fen.a(r7)     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0023
                fbg$b r0 = r3.statsCounter     // Catch:{ all -> 0x0021 }
                long r1 = r6.e()     // Catch:{ all -> 0x0021 }
                r0.a(r1)     // Catch:{ all -> 0x0021 }
                r3.a((K) r4, r5, r6, (V) r7)     // Catch:{ all -> 0x0021 }
                if (r7 != 0) goto L_0x0020
                fbg$b r0 = r3.statsCounter
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
                fbg$b r7 = r3.statsCounter
                long r1 = r6.e()
                r7.b(r1)
                r3.a((K) r4, r5, r6)
            L_0x004c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.a(java.lang.Object, int, com.google.common.cache.LocalCache$h, fek):java.lang.Object");
        }

        private V a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            final h a = a(k, i, true);
            if (a == null) {
                return null;
            }
            fek a2 = a.a(k, cacheLoader);
            final K k2 = k;
            final int i2 = i;
            final fek fek = a2;
            AnonymousClass1 r0 = new Runnable() {
                public final void run() {
                    try {
                        Segment.this.a(k2, i2, a, fek);
                    } catch (Throwable th) {
                        LocalCache.a.log(Level.WARNING, "Exception thrown during refresh", th);
                        a.a(th);
                    }
                }
            };
            a2.addListener(r0, DirectExecutor.INSTANCE);
            if (a2.isDone()) {
                try {
                    return fen.a(a2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX INFO: finally extract failed */
        private h<K, V> a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fbl2 = fbl2.b();
                    } else {
                        p a2 = fbl2.a();
                        if (!a2.c()) {
                            if (!z || a - fbl2.h() >= this.map.h) {
                                this.modCount++;
                                h<K, V> hVar = new h<>(a2);
                                fbl2.a((p<K, V>) hVar);
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
                fbl a3 = a(k, i, fbl);
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
                    this.map.a((fbl) poll);
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

        private void a(fbl<K, V> fbl, long j) {
            if (this.map.b()) {
                fbl.a(j);
            }
            this.accessQueue.add(fbl);
        }

        private void g() {
            while (true) {
                fbl fbl = (fbl) this.recencyQueue.poll();
                if (fbl == null) {
                    return;
                }
                if (this.accessQueue.contains(fbl)) {
                    this.accessQueue.add(fbl);
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

        private void c(long j) {
            fbl fbl;
            fbl fbl2;
            g();
            do {
                fbl = (fbl) this.writeQueue.peek();
                if (fbl == null || !this.map.a(fbl, j)) {
                    do {
                        fbl2 = (fbl) this.accessQueue.peek();
                        if (fbl2 == null || !this.map.a(fbl2, j)) {
                            return;
                        }
                    } while (a(fbl2, fbl2.c(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(fbl, fbl.c(), RemovalCause.EXPIRED));
            throw new AssertionError();
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

        private void a(fbl<K, V> fbl) {
            if (this.map.f >= 0) {
                g();
                if (((long) fbl.a().a()) <= this.maxSegmentWeight || a(fbl, fbl.c(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        fbl h = h();
                        if (!a(h, h.c(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        private fbl<K, V> h() {
            for (fbl<K, V> fbl : this.accessQueue) {
                if (fbl.a().a() > 0) {
                    return fbl;
                }
            }
            throw new AssertionError();
        }

        private fbl<K, V> a(Object obj, int i, long j) {
            fbl<K, V> d = d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.map.a(d, j)) {
                return d;
            }
            a(j);
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    fbl a = a(obj, i, this.map.j.a());
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
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fbl2 = fbl2.b();
                    } else {
                        p a2 = fbl2.a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (a2.d()) {
                                a(k, v2, a2.a(), RemovalCause.COLLECTED);
                                a(fbl2, k, v, a);
                                i2 = this.count;
                            } else {
                                a(fbl2, k, v, a);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            a(fbl2);
                            return null;
                        } else if (z) {
                            a(fbl2, a);
                            unlock();
                            c();
                            return v2;
                        } else {
                            this.modCount++;
                            a(k, v2, a2.a(), RemovalCause.REPLACED);
                            a(fbl2, k, v, a);
                            a(fbl2);
                            unlock();
                            c();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                fbl a3 = a(k, i, fbl);
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

        private void i() {
            AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<fbl<K, V>> a = a(length << 1);
                this.threshold = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    fbl fbl = (fbl) atomicReferenceArray.get(i2);
                    if (fbl != null) {
                        fbl b = fbl.b();
                        int c = fbl.c() & length2;
                        if (b == null) {
                            a.set(c, fbl);
                        } else {
                            fbl fbl2 = fbl;
                            while (b != null) {
                                int c2 = b.c() & length2;
                                if (c2 != c) {
                                    fbl2 = b;
                                    c = c2;
                                }
                                b = b.b();
                            }
                            a.set(c, fbl2);
                            while (fbl != fbl2) {
                                int c3 = fbl.c() & length2;
                                fbl a2 = a(fbl, (fbl) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    b(fbl);
                                    i--;
                                }
                                fbl = fbl.b();
                            }
                        }
                    }
                }
                this.table = a;
                this.count = i;
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
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i2 || d == null || !this.map.c.a(k2, d)) {
                        V v3 = v;
                        fbl2 = fbl2.b();
                    } else {
                        p a2 = fbl2.a();
                        Object obj = a2.get();
                        if (obj == null) {
                            if (a2.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                int i4 = this.count - 1;
                                atomicReferenceArray.set(length, a(fbl, fbl2, d, i, obj, a2, RemovalCause.COLLECTED));
                                this.count = i4;
                            }
                            return false;
                        } else if (this.map.d.a(v, obj)) {
                            this.modCount++;
                            a(k2, (V) obj, a2.a(), RemovalCause.REPLACED);
                            a(fbl2, k, v2, a);
                            a(fbl2);
                            unlock();
                            c();
                            return true;
                        } else {
                            a(fbl2, a);
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
        public final V a(K k, int i, V v) {
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.map.j.a();
                b(a);
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i2 || d == null || !this.map.c.a(k2, d)) {
                        fbl2 = fbl2.b();
                    } else {
                        p a2 = fbl2.a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.d()) {
                                int i3 = this.count;
                                this.modCount++;
                                int i4 = this.count - 1;
                                atomicReferenceArray.set(length, a(fbl, fbl2, d, i, v2, a2, RemovalCause.COLLECTED));
                                this.count = i4;
                            }
                            return null;
                        }
                        this.modCount++;
                        a(k2, v2, a2.a(), RemovalCause.REPLACED);
                        a(fbl2, k, v, a);
                        a(fbl2);
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
        public final V c(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                b(this.map.j.a());
                int i2 = this.count;
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(obj, d)) {
                        fbl2 = fbl2.b();
                    } else {
                        p a = fbl2.a();
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
                        atomicReferenceArray.set(length, a(fbl, fbl2, d, i, v, a, removalCause2));
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
        public final boolean b(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                b(this.map.j.a());
                int i2 = this.count;
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(obj, d)) {
                        fbl2 = fbl2.b();
                    } else {
                        p a = fbl2.a();
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
                        atomicReferenceArray.set(length, a(fbl, fbl2, d, i, obj3, a, removalCause));
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

        private boolean a(K k, int i, h<K, V> hVar, V v) {
            lock();
            long a = this.map.j.a();
            b(a);
            int i2 = this.count + 1;
            if (i2 > this.threshold) {
                i();
                i2 = this.count + 1;
            }
            AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
            int length = i & (atomicReferenceArray.length() - 1);
            fbl fbl = (fbl) atomicReferenceArray.get(length);
            fbl fbl2 = fbl;
            while (fbl2 != null) {
                Object d = fbl2.d();
                if (fbl2.c() != i || d == null || !this.map.c.a(k, d)) {
                    try {
                        fbl2 = fbl2.b();
                    } catch (Throwable th) {
                        unlock();
                        c();
                        throw th;
                    }
                } else {
                    p<Object, Object> a2 = fbl2.a();
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
                    a(fbl2, k, v, a);
                    this.count = i2;
                    a(fbl2);
                    unlock();
                    c();
                    return true;
                }
            }
            this.modCount++;
            fbl a3 = a(k, i, fbl);
            a(a3, k, v, a);
            atomicReferenceArray.set(length, a3);
            this.count = i2;
            a(a3);
            unlock();
            c();
            return true;
        }

        private fbl<K, V> a(fbl<K, V> fbl, fbl<K, V> fbl2, K k, int i, V v, p<K, V> pVar, RemovalCause removalCause) {
            a(k, v, pVar.a(), removalCause);
            this.writeQueue.remove(fbl2);
            this.accessQueue.remove(fbl2);
            if (!pVar.c()) {
                return b(fbl, fbl2);
            }
            pVar.a(null);
            return fbl;
        }

        private fbl<K, V> b(fbl<K, V> fbl, fbl<K, V> fbl2) {
            int i = this.count;
            fbl<K, V> b = fbl2.b();
            while (fbl != fbl2) {
                fbl<K, V> a = a(fbl, b);
                if (a != null) {
                    b = a;
                } else {
                    b(fbl);
                    i--;
                }
                fbl = fbl.b();
            }
            this.count = i;
            return b;
        }

        private void b(fbl<K, V> fbl) {
            Object d = fbl.d();
            fbl.c();
            a((K) d, (V) fbl.a().get(), fbl.a().a(), RemovalCause.COLLECTED);
            this.writeQueue.remove(fbl);
            this.accessQueue.remove(fbl);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(fbl<K, V> fbl, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl<K, V> fbl2 = (fbl) atomicReferenceArray.get(length);
                for (fbl<K, V> fbl3 = fbl2; fbl3 != null; fbl3 = fbl3.b()) {
                    if (fbl3 == fbl) {
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fbl2, fbl3, fbl3.d(), i, fbl3.a().get(), fbl3.a(), RemovalCause.COLLECTED));
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
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fbl2 = fbl2.b();
                    } else if (fbl2.a() == pVar) {
                        this.modCount++;
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, a(fbl, fbl2, d, i, pVar.get(), pVar, RemovalCause.COLLECTED));
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

        private boolean a(K k, int i, h<K, V> hVar) {
            lock();
            try {
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                fbl fbl = (fbl) atomicReferenceArray.get(length);
                fbl fbl2 = fbl;
                while (fbl2 != null) {
                    Object d = fbl2.d();
                    if (fbl2.c() != i || d == null || !this.map.c.a(k, d)) {
                        fbl2 = fbl2.b();
                    } else if (fbl2.a() == hVar) {
                        if (hVar.d()) {
                            fbl2.a(hVar.a);
                        } else {
                            atomicReferenceArray.set(length, b(fbl, fbl2));
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

        private boolean a(fbl<K, V> fbl, int i, RemovalCause removalCause) {
            int i2 = this.count;
            AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            fbl<K, V> fbl2 = (fbl) atomicReferenceArray.get(length);
            for (fbl<K, V> fbl3 = fbl2; fbl3 != null; fbl3 = fbl3.b()) {
                if (fbl3 == fbl) {
                    this.modCount++;
                    int i3 = this.count - 1;
                    atomicReferenceArray.set(length, a(fbl2, fbl3, fbl3.d(), i, fbl3.a().get(), fbl3.a(), removalCause));
                    this.count = i3;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        private void j() {
            b(this.map.j.a());
            c();
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
        public final void c() {
            if (!isHeldByCurrentThread()) {
                this.map.h();
            }
        }

        private fbl<K, V> d(Object obj, int i) {
            AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.table;
            for (fbl<K, V> fbl = (fbl) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); fbl != null; fbl = fbl.b()) {
                if (fbl.c() == i) {
                    Object d = fbl.d();
                    if (d == null) {
                        a();
                    } else if (this.map.c.a(obj, d)) {
                        return fbl;
                    }
                }
            }
            return null;
        }
    }

    public enum Strength {
        STRONG {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, V v, int i) {
                return i == 1 ? new m(v) : new x(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, V v, int i) {
                return i == 1 ? new i(segment.valueReferenceQueue, v, fbl) : new w(segment.valueReferenceQueue, v, fbl, i);
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            public final <K, V> p<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, V v, int i) {
                return i == 1 ? new u(segment.valueReferenceQueue, v, fbl) : new y(segment.valueReferenceQueue, v, fbl, i);
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract <K, V> p<K, V> a(Segment<K, V> segment, fbl<K, V> fbl, V v, int i);
    }

    abstract class a<T> extends AbstractSet<T> {
        final ConcurrentMap<?, ?> a;

        a(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public int size() {
            return this.a.size();
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public void clear() {
            this.a.clear();
        }

        public Object[] toArray() {
            return LocalCache.a((Collection) this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return LocalCache.a((Collection) this).toArray(eArr);
        }
    }

    static abstract class b<K, V> implements fbl<K, V> {
        b() {
        }

        public p<K, V> a() {
            throw new UnsupportedOperationException();
        }

        public void a(p<K, V> pVar) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> b() {
            throw new UnsupportedOperationException();
        }

        public int c() {
            throw new UnsupportedOperationException();
        }

        public K d() {
            throw new UnsupportedOperationException();
        }

        public long e() {
            throw new UnsupportedOperationException();
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public void a(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> g() {
            throw new UnsupportedOperationException();
        }

        public void b(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> i() {
            throw new UnsupportedOperationException();
        }

        public void c(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> j() {
            throw new UnsupportedOperationException();
        }

        public void d(fbl<K, V> fbl) {
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

        public final Iterator<Entry<K, V>> iterator() {
            return new c();
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
            if (obj2 == null || !LocalCache.this.d.a(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !LocalCache.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }
    }

    abstract class e<T> implements Iterator<T> {
        private int a;
        private int b = -1;
        private Segment<K, V> c;
        private AtomicReferenceArray<fbl<K, V>> d;
        private fbl<K, V> e;
        private z f;
        private z g;

        e() {
            this.a = LocalCache.this.b.length - 1;
            b();
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
            fbl<K, V> fbl = this.e;
            if (fbl != null) {
                while (true) {
                    this.e = fbl.b();
                    fbl<K, V> fbl2 = this.e;
                    if (fbl2 == null) {
                        break;
                    } else if (a(fbl2)) {
                        return true;
                    } else {
                        fbl = this.e;
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
                AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = this.d;
                this.b = i - 1;
                fbl<K, V> fbl = (fbl) atomicReferenceArray.get(i);
                this.e = fbl;
                if (fbl == null || (!a(this.e) && !c())) {
                }
            }
            return true;
        }

        /* JADX INFO: finally extract failed */
        private boolean a(fbl<K, V> fbl) {
            try {
                long a2 = LocalCache.this.j.a();
                Object d2 = fbl.d();
                LocalCache localCache = LocalCache.this;
                Object obj = null;
                if (fbl.d() != null) {
                    Object obj2 = fbl.a().get();
                    if (obj2 != null) {
                        if (!localCache.a(fbl, a2)) {
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

        public boolean hasNext() {
            return this.f != null;
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

        public void remove() {
            fay.b(this.g != null);
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

        public final Iterator<K> iterator() {
            return new f();
        }

        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }
    }

    static class h<K, V> implements p<K, V> {
        volatile p<K, V> a;
        private SettableFuture<V> b;
        private fbb c;

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return this;
        }

        public final fbl<K, V> b() {
            return null;
        }

        public final boolean c() {
            return true;
        }

        public h() {
            this(LocalCache.f());
        }

        public h(p<K, V> pVar) {
            this.b = SettableFuture.create();
            this.c = new fbb();
            this.a = pVar;
        }

        public final boolean d() {
            return this.a.d();
        }

        public final int a() {
            return this.a.a();
        }

        public final boolean b(V v) {
            return this.b.set(v);
        }

        public final boolean a(Throwable th) {
            return this.b.setException(th);
        }

        public final void a(V v) {
            if (v != null) {
                b(v);
            } else {
                this.a = LocalCache.f();
            }
        }

        public final fek<V> a(K k, CacheLoader<? super K, V> cacheLoader) {
            fek<V> fek;
            try {
                fbb fbb = this.c;
                fay.b(!fbb.b, "This stopwatch is already running.");
                fbb.b = true;
                fbb.c = fbb.a.a();
                Object obj = this.a.get();
                if (obj == null) {
                    Object a2 = cacheLoader.a();
                    return b(a2) ? this.b : feg.a(a2);
                }
                fay.a(k);
                fay.a(obj);
                fek a3 = feg.a(cacheLoader.a());
                if (a3 == null) {
                    return feg.a(null);
                }
                return fee.a(a3, new Function<V, V>() {
                    public final V apply(V v) {
                        h.this.b(v);
                        return v;
                    }
                }, DirectExecutor.INSTANCE);
            } catch (Throwable th) {
                if (a(th)) {
                    fek = this.b;
                } else {
                    fay.a(th);
                    fek = new defpackage.fej.a<>(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return fek;
            }
        }

        public final long e() {
            return TimeUnit.NANOSECONDS.convert(this.c.a(), TimeUnit.NANOSECONDS);
        }

        public final V get() {
            return this.a.get();
        }
    }

    static class i<K, V> extends SoftReference<V> implements p<K, V> {
        private fbl<K, V> a;

        public int a() {
            return 1;
        }

        public final void a(V v) {
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        i(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            super(v, referenceQueue);
            this.a = fbl;
        }

        public final fbl<K, V> b() {
            return this.a;
        }

        public p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return new i(referenceQueue, v, fbl);
        }
    }

    static final class j<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();

        j(K k, int i, fbl<K, V> fbl) {
            super(k, i, fbl);
        }

        public final long e() {
            return this.a;
        }

        public final void a(long j) {
            this.a = j;
        }

        public final fbl<K, V> f() {
            return this.b;
        }

        public final void a(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> g() {
            return this.c;
        }

        public final void b(fbl<K, V> fbl) {
            this.c = fbl;
        }
    }

    static final class k<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();
        private volatile long d = Long.MAX_VALUE;
        private fbl<K, V> e = LocalCache.g();
        private fbl<K, V> f = LocalCache.g();

        k(K k, int i, fbl<K, V> fbl) {
            super(k, i, fbl);
        }

        public final long e() {
            return this.a;
        }

        public final void a(long j) {
            this.a = j;
        }

        public final fbl<K, V> f() {
            return this.b;
        }

        public final void a(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> g() {
            return this.c;
        }

        public final void b(fbl<K, V> fbl) {
            this.c = fbl;
        }

        public final long h() {
            return this.d;
        }

        public final void b(long j) {
            this.d = j;
        }

        public final fbl<K, V> i() {
            return this.e;
        }

        public final void c(fbl<K, V> fbl) {
            this.e = fbl;
        }

        public final fbl<K, V> j() {
            return this.f;
        }

        public final void d(fbl<K, V> fbl) {
            this.f = fbl;
        }
    }

    static class l<K, V> extends b<K, V> {
        private K a;
        private int b;
        private fbl<K, V> c;
        private volatile p<K, V> d = LocalCache.f();

        l(K k, int i, fbl<K, V> fbl) {
            this.a = k;
            this.b = i;
            this.c = fbl;
        }

        public final K d() {
            return this.a;
        }

        public final p<K, V> a() {
            return this.d;
        }

        public final void a(p<K, V> pVar) {
            this.d = pVar;
        }

        public final int c() {
            return this.b;
        }

        public final fbl<K, V> b() {
            return this.c;
        }
    }

    static class m<K, V> implements p<K, V> {
        private V a;

        public int a() {
            return 1;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return this;
        }

        public final void a(V v) {
        }

        public final fbl<K, V> b() {
            return null;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        m(V v) {
            this.a = v;
        }

        public V get() {
            return this.a;
        }
    }

    static final class n<K, V> extends l<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();

        n(K k, int i, fbl<K, V> fbl) {
            super(k, i, fbl);
        }

        public final long h() {
            return this.a;
        }

        public final void b(long j) {
            this.a = j;
        }

        public final fbl<K, V> i() {
            return this.b;
        }

        public final void c(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> j() {
            return this.c;
        }

        public final void d(fbl<K, V> fbl) {
            this.c = fbl;
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

        p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl);

        void a(V v);

        fbl<K, V> b();

        boolean c();

        boolean d();

        V get();
    }

    final class q extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> a;

        q(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        public final int size() {
            return this.a.size();
        }

        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        public final void clear() {
            this.a.clear();
        }

        public final Iterator<V> iterator() {
            return new o();
        }

        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
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
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();

        r(ReferenceQueue<K> referenceQueue, K k, int i, fbl<K, V> fbl) {
            super(referenceQueue, k, i, fbl);
        }

        public final long e() {
            return this.a;
        }

        public final void a(long j) {
            this.a = j;
        }

        public final fbl<K, V> f() {
            return this.b;
        }

        public final void a(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> g() {
            return this.c;
        }

        public final void b(fbl<K, V> fbl) {
            this.c = fbl;
        }
    }

    static final class s<K, V> extends t<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();
        private volatile long d = Long.MAX_VALUE;
        private fbl<K, V> e = LocalCache.g();
        private fbl<K, V> f = LocalCache.g();

        s(ReferenceQueue<K> referenceQueue, K k, int i, fbl<K, V> fbl) {
            super(referenceQueue, k, i, fbl);
        }

        public final long e() {
            return this.a;
        }

        public final void a(long j) {
            this.a = j;
        }

        public final fbl<K, V> f() {
            return this.b;
        }

        public final void a(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> g() {
            return this.c;
        }

        public final void b(fbl<K, V> fbl) {
            this.c = fbl;
        }

        public final long h() {
            return this.d;
        }

        public final void b(long j) {
            this.d = j;
        }

        public final fbl<K, V> i() {
            return this.e;
        }

        public final void c(fbl<K, V> fbl) {
            this.e = fbl;
        }

        public final fbl<K, V> j() {
            return this.f;
        }

        public final void d(fbl<K, V> fbl) {
            this.f = fbl;
        }
    }

    static class t<K, V> extends WeakReference<K> implements fbl<K, V> {
        private int a;
        private fbl<K, V> b;
        private volatile p<K, V> c = LocalCache.f();

        t(ReferenceQueue<K> referenceQueue, K k, int i, fbl<K, V> fbl) {
            super(k, referenceQueue);
            this.a = i;
            this.b = fbl;
        }

        public final K d() {
            return get();
        }

        public long e() {
            throw new UnsupportedOperationException();
        }

        public void a(long j) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public void a(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> g() {
            throw new UnsupportedOperationException();
        }

        public void b(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public void b(long j) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> i() {
            throw new UnsupportedOperationException();
        }

        public void c(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public fbl<K, V> j() {
            throw new UnsupportedOperationException();
        }

        public void d(fbl<K, V> fbl) {
            throw new UnsupportedOperationException();
        }

        public final p<K, V> a() {
            return this.c;
        }

        public final void a(p<K, V> pVar) {
            this.c = pVar;
        }

        public final int c() {
            return this.a;
        }

        public final fbl<K, V> b() {
            return this.b;
        }
    }

    static class u<K, V> extends WeakReference<V> implements p<K, V> {
        private fbl<K, V> a;

        public int a() {
            return 1;
        }

        public final void a(V v) {
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return true;
        }

        u(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            super(v, referenceQueue);
            this.a = fbl;
        }

        public final fbl<K, V> b() {
            return this.a;
        }

        public p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return new u(referenceQueue, v, fbl);
        }
    }

    static final class v<K, V> extends t<K, V> {
        private volatile long a = Long.MAX_VALUE;
        private fbl<K, V> b = LocalCache.g();
        private fbl<K, V> c = LocalCache.g();

        v(ReferenceQueue<K> referenceQueue, K k, int i, fbl<K, V> fbl) {
            super(referenceQueue, k, i, fbl);
        }

        public final long h() {
            return this.a;
        }

        public final void b(long j) {
            this.a = j;
        }

        public final fbl<K, V> i() {
            return this.b;
        }

        public final void c(fbl<K, V> fbl) {
            this.b = fbl;
        }

        public final fbl<K, V> j() {
            return this.c;
        }

        public final void d(fbl<K, V> fbl) {
            this.c = fbl;
        }
    }

    static final class w<K, V> extends i<K, V> {
        private int a;

        w(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl, int i) {
            super(referenceQueue, v, fbl);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return new w(referenceQueue, v, fbl, this.a);
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

        y(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl, int i) {
            super(referenceQueue, v, fbl);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public final p<K, V> a(ReferenceQueue<V> referenceQueue, V v, fbl<K, V> fbl) {
            return new y(referenceQueue, v, fbl, this.a);
        }
    }

    final class z implements Entry<K, V> {
        private K a;
        private V b;

        z(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final K getKey() {
            return this.a;
        }

        public final V getValue() {
            return this.b;
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

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.s > 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.r > 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.h > 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.q != Strength.STRONG;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.e != Strength.STRONG;
    }

    static <K, V> p<K, V> f() {
        return m;
    }

    static <K, V> fbl<K, V> g() {
        return NullEntry.INSTANCE;
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

    /* access modifiers changed from: 0000 */
    public final void a(p<K, V> pVar) {
        fbl b2 = pVar.b();
        int c2 = b2.c();
        a(c2).a(b2.d(), c2, pVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a(fbl<K, V> fbl) {
        int c2 = fbl.c();
        a(c2).a(fbl, c2);
    }

    private Segment<K, V> a(int i2) {
        return this.b[(i2 >>> this.p) & this.o];
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(fbl<K, V> fbl, long j2) {
        fay.a(fbl);
        if (b() && j2 - fbl.e() >= this.r) {
            return true;
        }
        if (!a() || j2 - fbl.h() < this.s) {
            return false;
        }
        return true;
    }

    static <K, V> void a(fbl<K, V> fbl, fbl<K, V> fbl2) {
        fbl.a(fbl2);
        fbl2.b(fbl);
    }

    static <K, V> void b(fbl<K, V> fbl, fbl<K, V> fbl2) {
        fbl.c(fbl2);
        fbl2.d(fbl);
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
            fbf r3 = r0.j
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
            java.util.concurrent.atomic.AtomicReferenceArray<fbl<K, V>> r14 = r10.table
            r15 = 0
        L_0x0025:
            int r2 = r14.length()
            if (r15 >= r2) goto L_0x007f
            java.lang.Object r2 = r14.get(r15)
            fbl r2 = (defpackage.fbl) r2
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
            fas<java.lang.Object> r3 = r0.d
            boolean r3 = r3.a(r1, r5)
            if (r3 == 0) goto L_0x006f
            r1 = 1
            return r1
        L_0x006f:
            fbl r2 = r2.b()
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

    public V put(K k2, V v2) {
        fay.a(k2);
        fay.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, false);
    }

    public V putIfAbsent(K k2, V v2) {
        fay.a(k2);
        fay.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
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

    public boolean replace(K k2, V v2, V v3) {
        fay.a(k2);
        fay.a(v3);
        if (v2 == null) {
            return false;
        }
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2, v3);
    }

    public V replace(K k2, V v2) {
        fay.a(k2);
        fay.a(v2);
        int a2 = a((Object) k2);
        return a(a2).a(k2, a2, v2);
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
                    AtomicReferenceArray<fbl<K, V>> atomicReferenceArray = segment.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (fbl fbl = (fbl) atomicReferenceArray.get(i3); fbl != null; fbl = fbl.b()) {
                            if (fbl.a().d()) {
                                Object d2 = fbl.d();
                                Object obj = fbl.a().get();
                                if (d2 != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        fbl.c();
                                        segment.a(d2, obj, fbl.a().a(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                fbl.c();
                                segment.a(d2, obj, fbl.a().a(), removalCause);
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

    public Set<K> keySet() {
        Set<K> set = this.t;
        if (set != null) {
            return set;
        }
        g gVar = new g(this);
        this.t = gVar;
        return gVar;
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

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.v;
        if (set != null) {
            return set;
        }
        d dVar = new d(this);
        this.v = dVar;
        return dVar;
    }

    static <K, V> void b(fbl<K, V> fbl) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        fbl.a((fbl<K, V>) nullEntry);
        fbl.b((fbl<K, V>) nullEntry);
    }

    static <K, V> void c(fbl<K, V> fbl) {
        NullEntry nullEntry = NullEntry.INSTANCE;
        fbl.c(nullEntry);
        fbl.d(nullEntry);
    }

    public int size() {
        long j2 = 0;
        for (Segment<K, V> segment : this.b) {
            j2 += (long) Math.max(0, segment.count);
        }
        return feb.a(j2);
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }
}
