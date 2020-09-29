package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    private long b;
    private long c;
    private TimeUnit d;
    private Scheduler e;
    private Callable<U> f;
    private int g;
    private boolean h;

    static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Disposable, Runnable {
        private Callable<U> f;
        private long g;
        private TimeUnit h;
        private int i;
        private boolean j;
        private Worker k;
        private U l;
        private Disposable m;
        private Disposable n;
        private long o;
        private long p;

        BufferExactBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j2, TimeUnit timeUnit, int i2, boolean z, Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.f = callable;
            this.g = j2;
            this.h = timeUnit;
            this.i = i2;
            this.j = z;
            this.k = worker;
        }

        public final /* synthetic */ void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        public final boolean b() {
            return this.c;
        }

        public final void bd_() {
            if (!this.c) {
                this.c = true;
                this.n.bd_();
                this.k.bd_();
                synchronized (this) {
                    this.l = null;
                }
            }
        }

        public final void onComplete() {
            U u;
            this.k.bd_();
            synchronized (this) {
                u = this.l;
                this.l = null;
            }
            this.b.a(u);
            this.d = true;
            if (e()) {
                QueueDrainHelper.a(this.b, this.a, false, (Disposable) this, (ObservableQueueDrain<T, U>) this);
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.l = null;
            }
            this.a.onError(th);
            this.k.bd_();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.j == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.m.bd_();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.a(r7.f.call(), "The buffer supplied is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.l = r8;
            r7.p++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r7.j == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r0 = r7.k;
            r4 = r7.g;
            r7.m = r0.a(r7, r4, r4, r7.h);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
            io.reactivex.exceptions.Exceptions.b(r8);
            r7.a.onError(r8);
            bd_();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.l     // Catch:{ all -> 0x0066 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0066 }
                int r8 = r0.size()     // Catch:{ all -> 0x0066 }
                int r1 = r7.i     // Catch:{ all -> 0x0066 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                return
            L_0x0014:
                r8 = 0
                r7.l = r8     // Catch:{ all -> 0x0066 }
                long r1 = r7.o     // Catch:{ all -> 0x0066 }
                r3 = 1
                long r1 = r1 + r3
                r7.o = r1     // Catch:{ all -> 0x0066 }
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                boolean r8 = r7.j
                if (r8 == 0) goto L_0x0028
                io.reactivex.disposables.Disposable r8 = r7.m
                r8.bd_()
            L_0x0028:
                r8 = 0
                r7.b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f     // Catch:{ all -> 0x0059 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0059 }
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.a(r8, r0)     // Catch:{ all -> 0x0059 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0059 }
                monitor-enter(r7)
                r7.l = r8     // Catch:{ all -> 0x0056 }
                long r0 = r7.p     // Catch:{ all -> 0x0056 }
                long r0 = r0 + r3
                r7.p = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                boolean r8 = r7.j
                if (r8 == 0) goto L_0x0055
                io.reactivex.Scheduler$Worker r0 = r7.k
                long r4 = r7.g
                java.util.concurrent.TimeUnit r6 = r7.h
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.a(r1, r2, r4, r6)
                r7.m = r8
            L_0x0055:
                return
            L_0x0056:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0056 }
                throw r8
            L_0x0059:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.b(r8)
                io.reactivex.Observer r0 = r7.a
                r0.onError(r8)
                r7.bd_()
                return
            L_0x0066:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0066 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.n, disposable)) {
                this.n = disposable;
                try {
                    this.l = (Collection) ObjectHelper.a(this.f.call(), "The buffer supplied is null");
                    this.a.onSubscribe(this);
                    Worker worker = this.k;
                    long j2 = this.g;
                    this.m = worker.a(this, j2, j2, this.h);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.bd_();
                    EmptyDisposable.a(th, this.a);
                    this.k.bd_();
                }
            }
        }

        public final void run() {
            try {
                U u = (Collection) ObjectHelper.a(this.f.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.l;
                    if (u2 != null) {
                        if (this.o == this.p) {
                            this.l = u;
                            b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                bd_();
                this.a.onError(th);
            }
        }
    }

    static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Disposable, Runnable {
        private Callable<U> f;
        private long g;
        private TimeUnit h;
        private Scheduler i;
        private Disposable j;
        private U k;
        private AtomicReference<Disposable> l = new AtomicReference<>();

        BufferExactUnboundedObserver(Observer<? super U> observer, Callable<U> callable, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.f = callable;
            this.g = j2;
            this.h = timeUnit;
            this.i = scheduler;
        }

        public final /* synthetic */ void a(Observer observer, Object obj) {
            this.a.onNext((Collection) obj);
        }

        public final boolean b() {
            return this.l.get() == DisposableHelper.DISPOSED;
        }

        public final void bd_() {
            DisposableHelper.a(this.l);
            this.j.bd_();
        }

        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.k;
                this.k = null;
            }
            if (u != null) {
                this.b.a(u);
                this.d = true;
                if (e()) {
                    QueueDrainHelper.a(this.b, this.a, false, (Disposable) null, (ObservableQueueDrain<T, U>) this);
                }
            }
            DisposableHelper.a(this.l);
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.k = null;
            }
            this.a.onError(th);
            DisposableHelper.a(this.l);
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.k;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.j, disposable)) {
                this.j = disposable;
                try {
                    this.k = (Collection) ObjectHelper.a(this.f.call(), "The buffer supplied is null");
                    this.a.onSubscribe(this);
                    if (!this.c) {
                        Scheduler scheduler = this.i;
                        long j2 = this.g;
                        Disposable a = scheduler.a(this, j2, j2, this.h);
                        if (!this.l.compareAndSet(null, a)) {
                            a.bd_();
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    bd_();
                    EmptyDisposable.a(th, this.a);
                }
            }
        }

        public final void run() {
            U u;
            try {
                U u2 = (Collection) ObjectHelper.a(this.f.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.k;
                    if (u != null) {
                        this.k = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.a(this.l);
                } else {
                    a(u, false, this);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.a.onError(th);
                bd_();
            }
        }
    }

    static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Disposable, Runnable {
        final Worker f;
        final List<U> g = new LinkedList();
        private Callable<U> h;
        private long i;
        private long j;
        private TimeUnit k;
        private Disposable l;

        final class RemoveFromBuffer implements Runnable {
            private final U a;

            RemoveFromBuffer(U u) {
                this.a = u;
            }

            public final void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.g.remove(this.a);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.b(this.a, false, bufferSkipBoundedObserver.f);
            }
        }

        final class RemoveFromBufferEmit implements Runnable {
            private final U a;

            RemoveFromBufferEmit(U u) {
                this.a = u;
            }

            public final void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.g.remove(this.a);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.b(this.a, false, bufferSkipBoundedObserver.f);
            }
        }

        BufferSkipBoundedObserver(Observer<? super U> observer, Callable<U> callable, long j2, long j3, TimeUnit timeUnit, Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.h = callable;
            this.i = j2;
            this.j = j3;
            this.k = timeUnit;
            this.f = worker;
        }

        private void g() {
            synchronized (this) {
                this.g.clear();
            }
        }

        public final /* synthetic */ void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        public final boolean b() {
            return this.c;
        }

        public final void bd_() {
            if (!this.c) {
                this.c = true;
                g();
                this.l.bd_();
                this.f.bd_();
            }
        }

        public final void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.g);
                this.g.clear();
            }
            for (Collection a : arrayList) {
                this.b.a(a);
            }
            this.d = true;
            if (e()) {
                QueueDrainHelper.a(this.b, this.a, false, (Disposable) this.f, (ObservableQueueDrain<T, U>) this);
            }
        }

        public final void onError(Throwable th) {
            this.d = true;
            g();
            this.a.onError(th);
            this.f.bd_();
        }

        public final void onNext(T t) {
            synchronized (this) {
                for (U add : this.g) {
                    add.add(t);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.l, disposable)) {
                this.l = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.a(this.h.call(), "The buffer supplied is null");
                    this.g.add(collection);
                    this.a.onSubscribe(this);
                    Worker worker = this.f;
                    long j2 = this.j;
                    worker.a(this, j2, j2, this.k);
                    this.f.a(new RemoveFromBufferEmit(collection), this.i, this.k);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.bd_();
                    EmptyDisposable.a(th, this.a);
                    this.f.bd_();
                }
            }
        }

        public final void run() {
            if (!this.c) {
                try {
                    Collection collection = (Collection) ObjectHelper.a(this.h.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.c) {
                            this.g.add(collection);
                            this.f.a(new RemoveFromBuffer(collection), this.i, this.k);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.a.onError(th);
                    bd_();
                }
            }
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = callable;
        this.g = i;
        this.h = z;
    }

    public final void a(Observer<? super U> observer) {
        if (this.b == this.c && this.g == Integer.MAX_VALUE) {
            ObservableSource observableSource = this.a;
            BufferExactUnboundedObserver bufferExactUnboundedObserver = new BufferExactUnboundedObserver(new SerializedObserver(observer), this.f, this.b, this.d, this.e);
            observableSource.subscribe(bufferExactUnboundedObserver);
            return;
        }
        Worker a = this.e.a();
        if (this.b == this.c) {
            ObservableSource observableSource2 = this.a;
            BufferExactBoundedObserver bufferExactBoundedObserver = new BufferExactBoundedObserver(new SerializedObserver(observer), this.f, this.b, this.d, this.g, this.h, a);
            observableSource2.subscribe(bufferExactBoundedObserver);
            return;
        }
        ObservableSource observableSource3 = this.a;
        BufferSkipBoundedObserver bufferSkipBoundedObserver = new BufferSkipBoundedObserver(new SerializedObserver(observer), this.f, this.b, this.c, this.d, a);
        observableSource3.subscribe(bufferSkipBoundedObserver);
    }
}
