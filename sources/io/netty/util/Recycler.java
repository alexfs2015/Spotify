package io.netty.util;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Recycler<T> {
    private static final wjw a = wjx.a(Recycler.class);
    private static final b b = new b() {
        public final void a(Object obj) {
        }
    };
    /* access modifiers changed from: private */
    public static final AtomicInteger c;
    /* access modifiers changed from: private */
    public static final int d;
    private static final int e;
    /* access modifiers changed from: private */
    public static final int f = Math.min(e, 256);
    private static final int g = Math.max(2, wjo.a("io.netty.recycler.maxSharedCapacityFactor", 2));
    private static final int h = Math.max(0, wjo.a("io.netty.recycler.maxDelayedQueuesPerThread", Runtime.getRuntime().availableProcessors() << 1));
    /* access modifiers changed from: private */
    public static final int i = wjg.b(Math.max(wjo.a("io.netty.recycler.linkCapacity", 16), 16));
    private static final int j = wjg.b(wjo.a("io.netty.recycler.ratio", 8));
    /* access modifiers changed from: private */
    public static final wia<Map<c<?>, WeakOrderQueue>> p = new wia<Map<c<?>, WeakOrderQueue>>() {
        public final /* synthetic */ Object a() {
            return new WeakHashMap();
        }
    };
    /* access modifiers changed from: private */
    public final int k;
    /* access modifiers changed from: private */
    public final int l;
    /* access modifiers changed from: private */
    public final int m;
    /* access modifiers changed from: private */
    public final int n;
    private final wia<c<T>> o;

    static final class WeakOrderQueue {
        static final WeakOrderQueue a = new WeakOrderQueue();
        private static /* synthetic */ boolean h = (!Recycler.class.desiredAssertionStatus());
        Link b;
        final int c;
        final AtomicInteger d;
        private Link e;
        /* access modifiers changed from: private */
        public WeakOrderQueue f;
        /* access modifiers changed from: private */
        public final WeakReference<Thread> g;

        static final class Link extends AtomicInteger {
            /* access modifiers changed from: private */
            public final a<?>[] elements;
            /* access modifiers changed from: private */
            public Link next;
            /* access modifiers changed from: private */
            public int readIndex;

            private Link() {
                this.elements = new a[Recycler.i];
            }

            /* synthetic */ Link(byte b) {
                this();
            }
        }

        private WeakOrderQueue() {
            this.c = Recycler.c.getAndIncrement();
            this.g = null;
            this.d = null;
        }

        private WeakOrderQueue(c<?> cVar, Thread thread) {
            this.c = Recycler.c.getAndIncrement();
            Link link = new Link(0);
            this.b = link;
            this.e = link;
            this.g = new WeakReference<>(thread);
            synchronized (cVar) {
                this.f = cVar.i;
                cVar.i = this;
            }
            this.d = cVar.b;
        }

        static WeakOrderQueue a(c<?> cVar, Thread thread) {
            if (a(cVar.b, Recycler.i)) {
                return new WeakOrderQueue(cVar, thread);
            }
            return null;
        }

        static boolean a(AtomicInteger atomicInteger, int i) {
            int i2;
            if (h || i >= 0) {
                do {
                    i2 = atomicInteger.get();
                    if (i2 < i) {
                        return false;
                    }
                } while (!atomicInteger.compareAndSet(i2, i2 - i));
                return true;
            }
            throw new AssertionError();
        }

        private void a(int i) {
            if (h || i >= 0) {
                this.d.addAndGet(i);
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(c<?> cVar) {
            Link link = this.e;
            if (link == null) {
                return false;
            }
            if (link.readIndex == Recycler.i) {
                if (link.next == null) {
                    return false;
                }
                link = link.next;
                this.e = link;
            }
            int b2 = link.readIndex;
            int i = link.get();
            int i2 = i - b2;
            if (i2 == 0) {
                return false;
            }
            int i3 = cVar.f;
            int i4 = i2 + i3;
            if (i4 > cVar.e.length) {
                i = Math.min((cVar.a(i4) + b2) - i3, i);
            }
            if (b2 == i) {
                return false;
            }
            a<?>[] a2 = link.elements;
            a<?>[] aVarArr = cVar.e;
            while (b2 < i) {
                a<?> aVar = a2[b2];
                if (aVar.b == 0) {
                    aVar.b = aVar.a;
                } else if (aVar.b != aVar.a) {
                    throw new IllegalStateException("recycled already");
                }
                a2[b2] = null;
                if (!cVar.a(aVar)) {
                    aVar.d = cVar;
                    int i5 = i3 + 1;
                    aVarArr[i3] = aVar;
                    i3 = i5;
                }
                b2++;
            }
            if (i == Recycler.i && link.next != null) {
                a(Recycler.i);
                this.e = link.next;
            }
            link.readIndex = i;
            if (cVar.f == i3) {
                return false;
            }
            cVar.f = i3;
            return true;
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            try {
                super.finalize();
            } finally {
                for (Link link = this.e; link != null; link = link.next) {
                    a(Recycler.i);
                }
            }
        }
    }

    static final class a<T> implements b<T> {
        int a;
        int b;
        boolean c;
        c<?> d;
        Object e;

        a(c<?> cVar) {
            this.d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
            if (r2 != io.netty.util.Recycler.WeakOrderQueue.a) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.e
                if (r5 != r0) goto L_0x00c0
                io.netty.util.Recycler$c<?> r5 = r4.d
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Thread r1 = r5.a
                if (r1 != r0) goto L_0x0053
                int r0 = r4.b
                int r1 = r4.a
                r0 = r0 | r1
                if (r0 != 0) goto L_0x004b
                int r0 = io.netty.util.Recycler.d
                r4.a = r0
                r4.b = r0
                int r0 = r5.f
                int r1 = r5.d
                if (r0 >= r1) goto L_0x00bf
                boolean r1 = r5.a(r4)
                if (r1 == 0) goto L_0x002b
                goto L_0x00bf
            L_0x002b:
                io.netty.util.Recycler$a<?>[] r1 = r5.e
                int r1 = r1.length
                if (r0 != r1) goto L_0x0042
                io.netty.util.Recycler$a<?>[] r1 = r5.e
                int r2 = r0 << 1
                int r3 = r5.d
                int r2 = java.lang.Math.min(r2, r3)
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                io.netty.util.Recycler$a[] r1 = (io.netty.util.Recycler.a[]) r1
                r5.e = r1
            L_0x0042:
                io.netty.util.Recycler$a<?>[] r1 = r5.e
                r1[r0] = r4
                int r0 = r0 + 1
                r5.f = r0
                return
            L_0x004b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "recycled already"
                r5.<init>(r0)
                throw r5
            L_0x0053:
                wia r1 = io.netty.util.Recycler.p
                wjc r2 = defpackage.wjc.b()
                java.lang.Object r1 = r1.a(r2)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r2 = r1.get(r5)
                io.netty.util.Recycler$WeakOrderQueue r2 = (io.netty.util.Recycler.WeakOrderQueue) r2
                if (r2 != 0) goto L_0x0081
                int r2 = r1.size()
                int r3 = r5.c
                if (r2 < r3) goto L_0x0077
                io.netty.util.Recycler$WeakOrderQueue r0 = io.netty.util.Recycler.WeakOrderQueue.a
                r1.put(r5, r0)
                return
            L_0x0077:
                io.netty.util.Recycler$WeakOrderQueue r2 = io.netty.util.Recycler.WeakOrderQueue.a(r5, r0)
                if (r2 == 0) goto L_0x00bf
                r1.put(r5, r2)
                goto L_0x0085
            L_0x0081:
                io.netty.util.Recycler$WeakOrderQueue r5 = io.netty.util.Recycler.WeakOrderQueue.a
                if (r2 == r5) goto L_0x00bf
            L_0x0085:
                int r5 = r2.c
                r4.a = r5
                io.netty.util.Recycler$WeakOrderQueue$Link r5 = r2.b
                int r0 = r5.get()
                int r1 = io.netty.util.Recycler.i
                if (r0 != r1) goto L_0x00b1
                java.util.concurrent.atomic.AtomicInteger r0 = r2.d
                int r1 = io.netty.util.Recycler.i
                boolean r0 = io.netty.util.Recycler.WeakOrderQueue.a(r0, r1)
                if (r0 == 0) goto L_0x00bf
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = new io.netty.util.Recycler$WeakOrderQueue$Link
                r1 = 0
                r0.<init>(r1)
                io.netty.util.Recycler$WeakOrderQueue$Link r5 = r5.next = r0
                r2.b = r5
                int r0 = r5.get()
            L_0x00b1:
                io.netty.util.Recycler$a[] r1 = r5.elements
                r1[r0] = r4
                r1 = 0
                r4.d = r1
                int r0 = r0 + 1
                r5.lazySet(r0)
            L_0x00bf:
                return
            L_0x00c0:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "object does not belong to handle"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.Recycler.a.a(java.lang.Object):void");
        }
    }

    public interface b<T> {
        void a(T t);
    }

    static final class c<T> {
        final Thread a;
        final AtomicInteger b;
        final int c;
        final int d;
        a<?>[] e;
        int f;
        WeakOrderQueue g;
        WeakOrderQueue h;
        volatile WeakOrderQueue i;
        private Recycler<T> j;
        private final int k;
        private int l = -1;

        c(Recycler<T> recycler, Thread thread, int i2, int i3, int i4, int i5) {
            this.j = recycler;
            this.a = thread;
            this.d = i2;
            this.b = new AtomicInteger(Math.max(i2 / i3, Recycler.i));
            this.e = new a[Math.min(Recycler.f, i2)];
            this.k = i4;
            this.c = i5;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i2) {
            int length = this.e.length;
            int i3 = this.d;
            do {
                length <<= 1;
                if (length >= i2) {
                    break;
                }
            } while (length < i3);
            int min = Math.min(length, i3);
            a<?>[] aVarArr = this.e;
            if (min != aVarArr.length) {
                this.e = (a[]) Arrays.copyOf(aVarArr, min);
            }
            return min;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(a<?> aVar) {
            if (!aVar.c) {
                int i2 = this.l + 1;
                this.l = i2;
                if ((i2 & this.k) != 0) {
                    return true;
                }
                aVar.c = true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(b<T> bVar);

    static {
        AtomicInteger atomicInteger = new AtomicInteger(Integer.MIN_VALUE);
        c = atomicInteger;
        d = atomicInteger.getAndIncrement();
        int i2 = 32768;
        int a2 = wjo.a("io.netty.recycler.maxCapacityPerThread", wjo.a("io.netty.recycler.maxCapacity", 32768));
        if (a2 >= 0) {
            i2 = a2;
        }
        e = i2;
        if (a.b()) {
            int i3 = e;
            if (i3 == 0) {
                a.b("-Dio.netty.recycler.maxCapacityPerThread: disabled");
                a.b("-Dio.netty.recycler.maxSharedCapacityFactor: disabled");
                a.b("-Dio.netty.recycler.linkCapacity: disabled");
                a.b("-Dio.netty.recycler.ratio: disabled");
            } else {
                a.b("-Dio.netty.recycler.maxCapacityPerThread: {}", (Object) Integer.valueOf(i3));
                a.b("-Dio.netty.recycler.maxSharedCapacityFactor: {}", (Object) Integer.valueOf(g));
                a.b("-Dio.netty.recycler.linkCapacity: {}", (Object) Integer.valueOf(i));
                a.b("-Dio.netty.recycler.ratio: {}", (Object) Integer.valueOf(j));
            }
        }
    }

    protected Recycler() {
        this(e);
    }

    private Recycler(int i2) {
        this(i2, g);
    }

    private Recycler(int i2, int i3) {
        this(i2, i3, j, h);
    }

    private Recycler(int i2, int i3, int i4, int i5) {
        this.o = new wia<c<T>>() {
            public final /* synthetic */ Object a() {
                c cVar = new c(Recycler.this, Thread.currentThread(), Recycler.this.k, Recycler.this.l, Recycler.this.m, Recycler.this.n);
                return cVar;
            }
        };
        this.m = wjg.b(i4) - 1;
        if (i2 <= 0) {
            this.k = 0;
            this.l = 1;
            this.n = 0;
            return;
        }
        this.k = i2;
        this.l = Math.max(1, i3);
        this.n = Math.max(0, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a() {
        /*
            r10 = this;
            int r0 = r10.k
            if (r0 != 0) goto L_0x000b
            io.netty.util.Recycler$b r0 = b
            java.lang.Object r0 = r10.a(r0)
            return r0
        L_0x000b:
            wia<io.netty.util.Recycler$c<T>> r0 = r10.o
            wjc r1 = defpackage.wjc.b()
            java.lang.Object r0 = r0.a(r1)
            io.netty.util.Recycler$c r0 = (io.netty.util.Recycler.c) r0
            int r1 = r0.f
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x007e
            io.netty.util.Recycler$WeakOrderQueue r1 = r0.g
            r4 = 1
            if (r1 != 0) goto L_0x0028
            io.netty.util.Recycler$WeakOrderQueue r1 = r0.i
            if (r1 != 0) goto L_0x0028
            r6 = 0
            goto L_0x006f
        L_0x0028:
            io.netty.util.Recycler$WeakOrderQueue r5 = r0.h
            r6 = 0
        L_0x002b:
            boolean r7 = r1.a(r0)
            if (r7 == 0) goto L_0x0033
            r6 = 1
            goto L_0x006b
        L_0x0033:
            io.netty.util.Recycler$WeakOrderQueue r7 = r1.f
            java.lang.ref.WeakReference r8 = r1.g
            java.lang.Object r8 = r8.get()
            if (r8 != 0) goto L_0x0062
            io.netty.util.Recycler$WeakOrderQueue$Link r8 = r1.b
            int r8 = r8.readIndex
            io.netty.util.Recycler$WeakOrderQueue$Link r9 = r1.b
            int r9 = r9.get()
            if (r8 == r9) goto L_0x0051
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 == 0) goto L_0x005c
        L_0x0054:
            boolean r8 = r1.a(r0)
            if (r8 == 0) goto L_0x005c
            r6 = 1
            goto L_0x0054
        L_0x005c:
            if (r5 == 0) goto L_0x0063
            r5.f = r7
            goto L_0x0063
        L_0x0062:
            r5 = r1
        L_0x0063:
            if (r7 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r1 = r7
            goto L_0x002b
        L_0x006a:
            r1 = r7
        L_0x006b:
            r0.h = r5
            r0.g = r1
        L_0x006f:
            if (r6 == 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r0.h = r2
            io.netty.util.Recycler$WeakOrderQueue r1 = r0.i
            r0.g = r1
            r4 = 0
        L_0x0079:
            if (r4 != 0) goto L_0x007c
            goto L_0x0095
        L_0x007c:
            int r1 = r0.f
        L_0x007e:
            int r1 = r1 + -1
            io.netty.util.Recycler$a<?>[] r4 = r0.e
            r4 = r4[r1]
            io.netty.util.Recycler$a<?>[] r5 = r0.e
            r5[r1] = r2
            int r2 = r4.a
            int r5 = r4.b
            if (r2 != r5) goto L_0x00a5
            r4.b = r3
            r4.a = r3
            r0.f = r1
            r2 = r4
        L_0x0095:
            if (r2 != 0) goto L_0x00a2
            io.netty.util.Recycler$a r2 = new io.netty.util.Recycler$a
            r2.<init>(r0)
            java.lang.Object r0 = r10.a(r2)
            r2.e = r0
        L_0x00a2:
            java.lang.Object r0 = r2.e
            return r0
        L_0x00a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "recycled multiple times"
            r0.<init>(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.Recycler.a():java.lang.Object");
    }
}
