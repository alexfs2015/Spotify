package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableReplay<T> extends ConnectableObservable<T> implements ResettableConnectable {
    private static BufferSupplier e = new UnBoundedFactory();
    private ObservableSource<T> a;
    private AtomicReference<ReplayObserver<T>> b;
    private BufferSupplier<T> c;
    private ObservableSource<T> d;

    static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        Node tail;

        BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        private void a(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        private void c() {
            Node node = (Node) get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public final void a() {
            a(new Node(NotificationLite.a()));
            c();
        }

        public final void a(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                int i = 1;
                do {
                    Node node = (Node) innerDisposable.index;
                    if (node == null) {
                        node = (Node) get();
                        innerDisposable.index = node;
                    }
                    while (!innerDisposable.b()) {
                        Node node2 = (Node) node.get();
                        if (node2 == null) {
                            innerDisposable.index = node;
                            i = innerDisposable.addAndGet(-i);
                        } else if (NotificationLite.a(node2.value, innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        } else {
                            node = node2;
                        }
                    }
                    innerDisposable.index = null;
                    return;
                } while (i != 0);
            }
        }

        public final void a(T t) {
            a(new Node(NotificationLite.a(t)));
            b();
        }

        public final void a(Throwable th) {
            a(new Node(NotificationLite.a(th)));
            c();
        }

        /* access modifiers changed from: 0000 */
        public abstract void b();
    }

    interface BufferSupplier<T> {
        ReplayBuffer<T> a();
    }

    static final class InnerDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final Observer<? super T> child;
        Object index;
        final ReplayObserver<T> parent;

        InnerDisposable(ReplayObserver<T> replayObserver, Observer<? super T> observer) {
            this.parent = replayObserver;
            this.child = observer;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.a(this);
                this.index = null;
            }
        }
    }

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        Node(Object obj) {
            this.value = obj;
        }
    }

    interface ReplayBuffer<T> {
        void a();

        void a(InnerDisposable<T> innerDisposable);

        void a(T t);

        void a(Throwable th);
    }

    static final class ReplayBufferSupplier<T> implements BufferSupplier<T> {
        private final int a;

        ReplayBufferSupplier(int i) {
            this.a = i;
        }

        public final ReplayBuffer<T> a() {
            return new SizeBoundReplayBuffer(this.a);
        }
    }

    static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        static final InnerDisposable[] a = new InnerDisposable[0];
        private static InnerDisposable[] b = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final ReplayBuffer<T> buffer;
        boolean done;
        final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(b);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        ReplayObserver(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        private void c() {
            for (InnerDisposable a2 : (InnerDisposable[]) this.observers.get()) {
                this.buffer.a(a2);
            }
        }

        private void d() {
            for (InnerDisposable a2 : (InnerDisposable[]) this.observers.getAndSet(a)) {
                this.buffer.a(a2);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.observers.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerDisposableArr[i2].equals(innerDisposable)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerDisposableArr2 = b;
                        } else {
                            InnerDisposable[] innerDisposableArr3 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                            innerDisposableArr2 = innerDisposableArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        public final boolean b() {
            return this.observers.get() == a;
        }

        public final void bd_() {
            this.observers.set(a);
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.a();
                d();
            }
        }

        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.a(th);
                d();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                this.buffer.a(t);
                c();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                c();
            }
        }
    }

    static final class ReplaySource<T> implements ObservableSource<T> {
        private final AtomicReference<ReplayObserver<T>> a;
        private final BufferSupplier<T> b;

        ReplaySource(AtomicReference<ReplayObserver<T>> atomicReference, BufferSupplier<T> bufferSupplier) {
            this.a = atomicReference;
            this.b = bufferSupplier;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(io.reactivex.Observer<? super T> r6) {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r0 = r5.a
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r0 = (io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver) r0
                if (r0 != 0) goto L_0x001f
                io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier<T> r0 = r5.b
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer r0 = r0.a()
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r1 = new io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r0 = r5.a
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0000
                r0 = r1
            L_0x001f:
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable r1 = new io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable
                r1.<init>(r0, r6)
                r6.onSubscribe(r1)
            L_0x0027:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r6 = r0.observers
                java.lang.Object r6 = r6.get()
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r6 = (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]) r6
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r2 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.a
                if (r6 != r2) goto L_0x0034
                goto L_0x0047
            L_0x0034:
                int r2 = r6.length
                int r3 = r2 + 1
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r3 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[r3]
                r4 = 0
                java.lang.System.arraycopy(r6, r4, r3, r4, r2)
                r3[r2] = r1
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r2 = r0.observers
                boolean r6 = r2.compareAndSet(r6, r3)
                if (r6 == 0) goto L_0x0027
            L_0x0047:
                boolean r6 = r1.b()
                if (r6 == 0) goto L_0x0051
                r0.a(r1)
                return
            L_0x0051:
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r6 = r0.buffer
                r6.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.ReplaySource.subscribe(io.reactivex.Observer):void");
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (this.size > this.limit) {
                Node node = (Node) ((Node) get()).get();
                this.size--;
                set(node);
            }
        }
    }

    static final class UnBoundedFactory implements BufferSupplier<Object> {
        UnBoundedFactory() {
        }

        public final ReplayBuffer<Object> a() {
            return new UnboundedReplayBuffer(16);
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(16);
        }

        public final void a() {
            add(NotificationLite.a());
            this.size++;
        }

        public final void a(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = innerDisposable.child;
                int i = 1;
                while (!innerDisposable.b()) {
                    int i2 = this.size;
                    Integer num = (Integer) innerDisposable.index;
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!NotificationLite.a(get(intValue), observer) && !innerDisposable.b()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    innerDisposable.index = Integer.valueOf(intValue);
                    i = innerDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public final void a(T t) {
            add(NotificationLite.a(t));
            this.size++;
        }

        public final void a(Throwable th) {
            add(NotificationLite.a(th));
            this.size++;
        }
    }

    private ObservableReplay(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<ReplayObserver<T>> atomicReference, BufferSupplier<T> bufferSupplier) {
        this.d = observableSource;
        this.a = observableSource2;
        this.b = atomicReference;
        this.c = bufferSupplier;
    }

    public static <T> ConnectableObservable<T> a(ObservableSource<T> observableSource, int i) {
        return i == Integer.MAX_VALUE ? a(observableSource, e) : a(observableSource, (BufferSupplier<T>) new ReplayBufferSupplier<T>(i));
    }

    private static <T> ConnectableObservable<T> a(ObservableSource<T> observableSource, BufferSupplier<T> bufferSupplier) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.a((ConnectableObservable<T>) new ObservableReplay<T>(new ReplaySource(atomicReference, bufferSupplier), observableSource, atomicReference, bufferSupplier));
    }

    public final void a(Observer<? super T> observer) {
        this.d.subscribe(observer);
    }

    public final void a(Disposable disposable) {
        this.b.compareAndSet((ReplayObserver) disposable, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r0 = r4.b
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r0 = (io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0024
        L_0x0010:
            io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier<T> r1 = r4.c
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer r1 = r1.a()
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r2 = new io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r1 = r4.b
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = r2
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            r5.accept(r0)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0043
            io.reactivex.ObservableSource<T> r5 = r4.a
            r5.subscribe(r0)
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            if (r1 == 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.shouldConnect
            r0.compareAndSet(r2, r3)
        L_0x004c:
            io.reactivex.exceptions.Exceptions.b(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.a(r5)
            goto L_0x0055
        L_0x0054:
            throw r5
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.e(io.reactivex.functions.Consumer):void");
    }
}
