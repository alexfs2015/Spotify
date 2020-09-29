package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class FlowableCombineLatest<T, R> extends Flowable<R> {
    final Function<? super Object[], ? extends R> b;
    private wrf<? extends T>[] c;
    private Iterable<? extends wrf<? extends T>> d = null;
    private int e;
    private boolean f;

    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final wrg<? super R> downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(wrg<? super R> wrg, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = wrg;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i];
            this.queue = new SpscLinkedArrayQueue<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
                b();
            }
        }

        public final void a() {
            this.cancelled = true;
            f();
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i2 = this.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    this.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                    CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber = this.subscribers[i];
                    Object clone = objArr.clone();
                    AtomicReferenceArray<Object> atomicReferenceArray = spscLinkedArrayQueue.c;
                    long j = spscLinkedArrayQueue.a.get();
                    int i3 = spscLinkedArrayQueue.b;
                    long j2 = 2 + j;
                    if (SpscLinkedArrayQueue.a(atomicReferenceArray, SpscLinkedArrayQueue.a(j2, i3)) == null) {
                        int a = SpscLinkedArrayQueue.a(j, i3);
                        SpscLinkedArrayQueue.a(atomicReferenceArray, a + 1, clone);
                        SpscLinkedArrayQueue.a(atomicReferenceArray, a, combineLatestInnerSubscriber);
                        spscLinkedArrayQueue.a(j2);
                    } else {
                        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
                        spscLinkedArrayQueue.c = atomicReferenceArray2;
                        int a2 = SpscLinkedArrayQueue.a(j, i3);
                        SpscLinkedArrayQueue.a(atomicReferenceArray2, a2 + 1, clone);
                        SpscLinkedArrayQueue.a(atomicReferenceArray2, a2, combineLatestInnerSubscriber);
                        SpscLinkedArrayQueue.a(atomicReferenceArray, atomicReferenceArray2);
                        SpscLinkedArrayQueue.a(atomicReferenceArray, a2, SpscLinkedArrayQueue.d);
                        spscLinkedArrayQueue.a(j2);
                    }
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.subscribers[i].a();
            } else {
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.Object[] r0 = r2.latest     // Catch:{ all -> 0x001c }
                r3 = r0[r3]     // Catch:{ all -> 0x001c }
                r1 = 1
                if (r3 == 0) goto L_0x0015
                int r3 = r2.completedSources     // Catch:{ all -> 0x001c }
                int r3 = r3 + r1
                int r0 = r0.length     // Catch:{ all -> 0x001c }
                if (r3 != r0) goto L_0x0011
                r2.done = r1     // Catch:{ all -> 0x001c }
                goto L_0x0017
            L_0x0011:
                r2.completedSources = r3     // Catch:{ all -> 0x001c }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                return
            L_0x0015:
                r2.done = r1     // Catch:{ all -> 0x001c }
            L_0x0017:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                r2.b()
                return
            L_0x001c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator.b(int):void");
        }

        private void g() {
            wrg<? super R> wrg = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i = 1;
            while (!this.cancelled) {
                Throwable th = (Throwable) this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.e();
                    wrg.onError(th);
                    return;
                }
                boolean z = this.done;
                boolean d = spscLinkedArrayQueue.d();
                if (!d) {
                    wrg.b_(null);
                }
                if (!z || !d) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    wrg.c();
                    return;
                }
            }
            spscLinkedArrayQueue.e();
        }

        private void h() {
            wrg<? super R> wrg = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.done;
                    Object bc_ = spscLinkedArrayQueue.bc_();
                    boolean z2 = bc_ == null;
                    if (!a(z, z2, wrg, spscLinkedArrayQueue)) {
                        if (z2) {
                            break;
                        }
                        try {
                            wrg.b_(ObjectHelper.a(this.combiner.apply((Object[]) spscLinkedArrayQueue.bc_()), "The combiner returned a null value"));
                            ((CombineLatestInnerSubscriber) bc_).a();
                            j2++;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            f();
                            ExceptionHelper.a(this.error, th);
                            wrg.onError(ExceptionHelper.a(this.error));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != j || !a(this.done, spscLinkedArrayQueue.d(), wrg, spscLinkedArrayQueue)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    g();
                } else {
                    h();
                }
            }
        }

        private boolean a(boolean z, boolean z2, wrg<?> wrg, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                f();
                spscLinkedArrayQueue.e();
                return true;
            }
            if (z) {
                if (!this.delayErrors) {
                    Throwable a = ExceptionHelper.a(this.error);
                    if (a != null && a != ExceptionHelper.a) {
                        f();
                        spscLinkedArrayQueue.e();
                        wrg.onError(a);
                        return true;
                    } else if (z2) {
                        f();
                        wrg.c();
                        return true;
                    }
                } else if (z2) {
                    f();
                    Throwable a2 = ExceptionHelper.a(this.error);
                    if (a2 == null || a2 == ExceptionHelper.a) {
                        wrg.c();
                    } else {
                        wrg.onError(a2);
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            for (CombineLatestInnerSubscriber<T> a : this.subscribers) {
                SubscriptionHelper.a((AtomicReference<wrh>) a);
            }
        }

        public final int a(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            if (i2 != 0) {
                z = true;
            }
            this.outputFused = z;
            return i2;
        }

        public final R bc_() {
            Object bc_ = this.queue.bc_();
            if (bc_ == null) {
                return null;
            }
            R a = ObjectHelper.a(this.combiner.apply((Object[]) this.queue.bc_()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) bc_).a();
            return a;
        }

        public final void e() {
            this.queue.e();
        }

        public final boolean d() {
            return this.queue.d();
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends AtomicReference<wrh> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.parent = combineLatestCoordinator;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a((AtomicReference<wrh>) this, wrh, (long) this.prefetch);
        }

        public final void b_(T t) {
            this.parent.a(this.index, t);
        }

        public final void onError(Throwable th) {
            CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.parent;
            int i = this.index;
            if (!ExceptionHelper.a(combineLatestCoordinator.error, th)) {
                RxJavaPlugins.a(th);
            } else if (!combineLatestCoordinator.delayErrors) {
                combineLatestCoordinator.f();
                combineLatestCoordinator.done = true;
                combineLatestCoordinator.b();
            } else {
                combineLatestCoordinator.b(i);
            }
        }

        public final void c() {
            this.parent.b(this.index);
        }

        public final void a() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                ((wrh) get()).a((long) i);
                return;
            }
            this.produced = i;
        }
    }

    final class SingletonArrayFunc implements Function<T, R> {
        SingletonArrayFunc() {
        }

        public final R apply(T t) {
            return FlowableCombineLatest.this.b.apply(new Object[]{t});
        }
    }

    public FlowableCombineLatest(wrf<? extends T>[] wrfArr, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.c = wrfArr;
        this.b = function;
        this.e = i;
        this.f = false;
    }

    public final void a(wrg<? super R> wrg) {
        int i;
        wrf<? extends T>[] wrfArr = this.c;
        if (wrfArr == null) {
            wrfArr = new wrf[8];
            Iterable iterable = null;
            try {
                Iterator it = (Iterator) ObjectHelper.a(iterable.iterator(), "The iterator returned is null");
                i = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            wrf<? extends T> wrf = (wrf) ObjectHelper.a(it.next(), "The publisher returned by the iterator is null");
                            if (i == wrfArr.length) {
                                wrf<? extends T>[] wrfArr2 = new wrf[((i >> 2) + i)];
                                System.arraycopy(wrfArr, 0, wrfArr2, 0, i);
                                wrfArr = wrfArr2;
                            }
                            int i2 = i + 1;
                            wrfArr[i] = wrf;
                            i = i2;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            EmptySubscription.a(th, wrg);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        EmptySubscription.a(th2, wrg);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.b(th3);
                EmptySubscription.a(th3, wrg);
                return;
            }
        } else {
            i = wrfArr.length;
        }
        if (i == 0) {
            EmptySubscription.a(wrg);
        } else if (i == 1) {
            wrfArr[0].b(new MapSubscriber(wrg, new SingletonArrayFunc()));
        } else {
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(wrg, this.b, i, this.e, this.f);
            wrg.a(combineLatestCoordinator);
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = combineLatestCoordinator.subscribers;
            for (int i3 = 0; i3 < i && !combineLatestCoordinator.done && !combineLatestCoordinator.cancelled; i3++) {
                wrfArr[i3].b(combineLatestInnerSubscriberArr[i3]);
            }
        }
    }
}
