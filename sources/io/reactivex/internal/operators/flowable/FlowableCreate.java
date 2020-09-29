package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableCreate<T> extends Flowable<T> {
    private FlowableOnSubscribe<T> b;
    private BackpressureStrategy c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BackpressureStrategy.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.<clinit>():void");
        }
    }

    static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, xfm {
        private static final long serialVersionUID = 7326289992464377023L;
        final xfl<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        BaseEmitter(xfl<? super T> xfl) {
            this.downstream = xfl;
        }

        public final void a() {
            this.serial.bd_();
            e();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
                f();
            }
        }

        public final void a(Cancellable cancellable) {
            DisposableHelper.a((AtomicReference<Disposable>) this.serial, (Disposable) new CancellableDisposable(cancellable));
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                RxJavaPlugins.a(th);
            }
        }

        public final boolean b() {
            return this.serial.b();
        }

        public boolean b(Throwable th) {
            return c(th);
        }

        public void c() {
            d();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public final boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.serial.b()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.bd_();
                return true;
            } catch (Throwable th2) {
                this.serial.bd_();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        public final void d() {
            if (!this.serial.b()) {
                try {
                    this.downstream.c();
                } finally {
                    this.serial.bd_();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void e() {
        }

        /* access modifiers changed from: 0000 */
        public void f() {
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicInteger wip = new AtomicInteger();

        BufferAsyncEmitter(xfl<? super T> xfl, int i) {
            super(xfl);
            this.queue = new SpscLinkedArrayQueue<>(i);
        }

        private void g() {
            if (this.wip.getAndIncrement() == 0) {
                xfl xfl = this.downstream;
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.serial.b()) {
                            spscLinkedArrayQueue.e();
                            return;
                        }
                        boolean z = this.done;
                        Object ba_ = spscLinkedArrayQueue.ba_();
                        boolean z2 = ba_ == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            xfl.b_(ba_);
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.serial.b()) {
                            spscLinkedArrayQueue.e();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean d = spscLinkedArrayQueue.d();
                        if (z3 && d) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.c(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void a(T t) {
            if (!this.done && !this.serial.b()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.queue.a(t);
                    g();
                }
            }
        }

        public final boolean b(Throwable th) {
            if (this.done || this.serial.b()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            g();
            return true;
        }

        public final void c() {
            this.done = true;
            g();
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.e();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            g();
        }
    }

    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        DropAsyncEmitter(xfl<? super T> xfl) {
            super(xfl);
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
        }
    }

    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(xfl<? super T> xfl) {
            super(xfl);
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            a((Throwable) new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        LatestAsyncEmitter(xfl<? super T> xfl) {
            super(xfl);
        }

        private void g() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                xfl xfl = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (this.serial.b()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.done;
                            Object andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (!z2 || !z3) {
                                if (z3) {
                                    break;
                                }
                                xfl.b_(andSet);
                                j2++;
                            } else {
                                Throwable th = this.error;
                                if (th != null) {
                                    c(th);
                                    return;
                                } else {
                                    d();
                                    return;
                                }
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.serial.b()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                c(th2);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.c(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void a(T t) {
            if (!this.done && !this.serial.b()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.queue.set(t);
                    g();
                }
            }
        }

        public final boolean b(Throwable th) {
            if (this.done || this.serial.b()) {
                return false;
            }
            if (th == null) {
                a((Throwable) new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            g();
            return true;
        }

        public final void c() {
            this.done = true;
            g();
        }

        /* access modifiers changed from: 0000 */
        public final void e() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void f() {
            g();
        }
    }

    static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(xfl<? super T> xfl) {
            super(xfl);
        }

        public final void a(T t) {
            long j;
            if (!this.serial.b()) {
                if (t != null) {
                    this.downstream.b_(t);
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        NoOverflowBaseAsyncEmitter(xfl<? super T> xfl) {
            super(xfl);
        }

        public final void a(T t) {
            if (!this.serial.b()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.downstream.b_(t);
                    BackpressureHelper.c(this, 1);
                } else {
                    g();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void g();
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.b = flowableOnSubscribe;
        this.c = backpressureStrategy;
    }

    public final void a(xfl<? super T> xfl) {
        int i = AnonymousClass1.a[this.c.ordinal()];
        BaseEmitter baseEmitter = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new BufferAsyncEmitter(xfl, Flowable.a) : new LatestAsyncEmitter(xfl) : new DropAsyncEmitter(xfl) : new ErrorAsyncEmitter(xfl) : new MissingEmitter(xfl);
        xfl.a(baseEmitter);
        try {
            this.b.subscribe(baseEmitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            baseEmitter.a(th);
        }
    }
}
