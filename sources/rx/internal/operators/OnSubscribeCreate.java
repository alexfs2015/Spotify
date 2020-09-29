package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.exceptions.MissingBackpressureException;
import rx.internal.subscriptions.CancellableSubscription;

public final class OnSubscribeCreate<T> implements a<T> {
    private wun<Emitter<T>> a;
    private BackpressureMode b;

    /* renamed from: rx.internal.operators.OnSubscribeCreate$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BackpressureMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                rx.Emitter$BackpressureMode[] r0 = rx.Emitter.BackpressureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.DROP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                rx.Emitter$BackpressureMode r1 = rx.Emitter.BackpressureMode.LATEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeCreate.AnonymousClass1.<clinit>():void");
        }
    }

    static abstract class BaseEmitter<T> extends AtomicLong implements Emitter<T>, wuf, wuk {
        private static final long serialVersionUID = 7326289992464377023L;
        final wuj<? super T> actual;
        final xai serial = new xai();

        /* access modifiers changed from: 0000 */
        public void a() {
        }

        /* access modifiers changed from: 0000 */
        public void b() {
        }

        public BaseEmitter(wuj<? super T> wuj) {
            this.actual = wuj;
        }

        public void onCompleted() {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onCompleted();
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onError(th);
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        public final void unsubscribe() {
            this.serial.unsubscribe();
            a();
        }

        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        public final void a(long j) {
            if (wuz.a(j)) {
                wuz.a((AtomicLong) this, j);
                b();
            }
        }

        public final void a(wuk wuk) {
            this.serial.a(wuk);
        }

        public final void a(wur wur) {
            a((wuk) new CancellableSubscription(wur));
        }
    }

    static final class BufferEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferEmitter(wuj<? super T> wuj, int i) {
            super(wuj);
            this.queue = wzh.a() ? new wzb<>(i) : new wyb<>(i);
            this.wip = new AtomicInteger();
        }

        public final void onNext(T t) {
            this.queue.offer(NotificationLite.a(t));
            c();
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            c();
        }

        public final void onCompleted() {
            this.done = true;
            c();
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            c();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        private void c() {
            if (this.wip.getAndIncrement() == 0) {
                wuj wuj = this.actual;
                Queue<Object> queue2 = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (wuj.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        }
                        boolean z = this.done;
                        Object poll = queue2.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            wuj.onNext(NotificationLite.e(poll));
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (wuj.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = queue2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        wuz.b(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static final class DropEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* access modifiers changed from: 0000 */
        public final void c() {
        }

        public DropEmitter(wuj<? super T> wuj) {
            super(wuj);
        }
    }

    static final class ErrorEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean done;

        public ErrorEmitter(wuj<? super T> wuj) {
            super(wuj);
        }

        public final void onNext(T t) {
            if (!this.done) {
                super.onNext(t);
            }
        }

        public final void onCompleted() {
            if (!this.done) {
                this.done = true;
                super.onCompleted();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                wzs.a(th);
                return;
            }
            this.done = true;
            super.onError(th);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    static final class LatestEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<Object> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        public LatestEmitter(wuj<? super T> wuj) {
            super(wuj);
        }

        public final void onNext(T t) {
            this.queue.set(NotificationLite.a(t));
            c();
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            c();
        }

        public final void onCompleted() {
            this.done = true;
            c();
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            c();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        private void c() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                wuj wuj = this.actual;
                AtomicReference<Object> atomicReference = this.queue;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (wuj.isUnsubscribed()) {
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
                                wuj.onNext(NotificationLite.e(andSet));
                                j2++;
                            } else {
                                Throwable th = this.error;
                                if (th != null) {
                                    super.onError(th);
                                    return;
                                } else {
                                    super.onCompleted();
                                    return;
                                }
                            }
                        }
                    }
                    if (j2 == j) {
                        if (wuj.isUnsubscribed()) {
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
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        wuz.b(this, j2);
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    static abstract class NoOverflowBaseEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* access modifiers changed from: 0000 */
        public abstract void c();

        public NoOverflowBaseEmitter(wuj<? super T> wuj) {
            super(wuj);
        }

        public void onNext(T t) {
            if (!this.actual.isUnsubscribed()) {
                if (get() != 0) {
                    this.actual.onNext(t);
                    wuz.b(this, 1);
                    return;
                }
                c();
            }
        }
    }

    static final class NoneEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(wuj<? super T> wuj) {
            super(wuj);
        }

        public final void onNext(T t) {
            long j;
            if (!this.actual.isUnsubscribed()) {
                this.actual.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        break;
                    }
                } while (!compareAndSet(j, j - 1));
            }
        }
    }

    public final /* synthetic */ void call(Object obj) {
        BaseEmitter baseEmitter;
        wuj wuj = (wuj) obj;
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i == 1) {
            baseEmitter = new NoneEmitter(wuj);
        } else if (i == 2) {
            baseEmitter = new ErrorEmitter(wuj);
        } else if (i == 3) {
            baseEmitter = new DropEmitter(wuj);
        } else if (i != 4) {
            baseEmitter = new BufferEmitter(wuj, wxs.b);
        } else {
            baseEmitter = new LatestEmitter(wuj);
        }
        wuj.add(baseEmitter);
        wuj.setProducer(baseEmitter);
        this.a.call(baseEmitter);
    }

    public OnSubscribeCreate(wun<Emitter<T>> wun, BackpressureMode backpressureMode) {
        this.a = wun;
        this.b = backpressureMode;
    }
}
