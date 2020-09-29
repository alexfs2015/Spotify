package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ReplaySubject<T> extends Subject<T> {
    private static ReplayDisposable[] c = new ReplayDisposable[0];
    private static ReplayDisposable[] d = new ReplayDisposable[0];
    private ReplayBuffer<T> a;
    private AtomicReference<ReplayDisposable<T>[]> b = new AtomicReference<>(c);
    private boolean e;

    static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    interface ReplayBuffer<T> {
        void a(ReplayDisposable<T> replayDisposable);

        void a(T t);

        void b(Object obj);

        boolean compareAndSet(Object obj, Object obj2);
    }

    static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final Observer<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }

        public final boolean b() {
            return this.cancelled;
        }

        public final void bd_() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.a(this);
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        SizeBoundReplayBuffer(int i) {
            this.maxSize = ObjectHelper.a(i, "maxSize");
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        public final void a(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                Observer<? super T> observer = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    Node<Object> node2 = (Node) node.get();
                    if (node2 != null) {
                        T t = node2.value;
                        if (!this.done || node2.get() != null) {
                            observer.onNext(t);
                            node = node2;
                        } else {
                            if (NotificationLite.b(t)) {
                                observer.onComplete();
                            } else {
                                observer.onError(NotificationLite.e(t));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                    } else if (node.get() == null) {
                        replayDisposable.index = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                replayDisposable.index = null;
            }
        }

        public final void a(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = (Node) this.head.get();
            }
        }

        public final void b(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            Node<Object> node3 = this.head;
            if (node3.value != null) {
                Node<Object> node4 = new Node<>(null);
                node4.lazySet(node3.get());
                this.head = node4;
            }
            this.done = true;
        }
    }

    static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            this.buffer = new ArrayList(ObjectHelper.a(i, "capacityHint"));
        }

        public final void a(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                Observer<? super T> observer = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    replayDisposable.index = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!replayDisposable.cancelled) {
                    int i3 = this.size;
                    while (i3 != i) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.done) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.size;
                                if (i4 == i3) {
                                    if (NotificationLite.b(obj)) {
                                        observer.onComplete();
                                    } else {
                                        observer.onError(NotificationLite.e(obj));
                                    }
                                    replayDisposable.index = null;
                                    replayDisposable.cancelled = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        observer.onNext(obj);
                        i++;
                    }
                    if (i == this.size) {
                        replayDisposable.index = Integer.valueOf(i);
                        i2 = replayDisposable.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }

        public final void a(T t) {
            this.buffer.add(t);
            this.size++;
        }

        public final void b(Object obj) {
            this.buffer.add(obj);
            this.size++;
            this.done = true;
        }
    }

    private ReplaySubject(ReplayBuffer<T> replayBuffer) {
        this.a = replayBuffer;
    }

    private ReplayDisposable<T>[] a(Object obj) {
        return this.a.compareAndSet(null, obj) ? (ReplayDisposable[]) this.b.getAndSet(d) : d;
    }

    public static <T> ReplaySubject<T> c(int i) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(1));
    }

    public static <T> ReplaySubject<T> d(int i) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(1));
    }

    public final void a(Observer<? super T> observer) {
        boolean z;
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        if (!replayDisposable.cancelled) {
            while (true) {
                ReplayDisposable[] replayDisposableArr = (ReplayDisposable[]) this.b.get();
                z = false;
                if (replayDisposableArr != d) {
                    int length = replayDisposableArr.length;
                    ReplayDisposable[] replayDisposableArr2 = new ReplayDisposable[(length + 1)];
                    System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                    replayDisposableArr2[length] = replayDisposable;
                    if (this.b.compareAndSet(replayDisposableArr, replayDisposableArr2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z || !replayDisposable.cancelled) {
                this.a.a(replayDisposable);
            } else {
                a(replayDisposable);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = (ReplayDisposable[]) this.b.get();
            if (replayDisposableArr != d && replayDisposableArr != c) {
                int length = replayDisposableArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (replayDisposableArr[i2] == replayDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        replayDisposableArr2 = c;
                    } else {
                        ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[(length - 1)];
                        System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                        System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                        replayDisposableArr2 = replayDisposableArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.b.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    public final void onComplete() {
        if (!this.e) {
            this.e = true;
            Object a2 = NotificationLite.a();
            ReplayBuffer<T> replayBuffer = this.a;
            replayBuffer.b(a2);
            for (ReplayDisposable a3 : a(a2)) {
                replayBuffer.a(a3);
            }
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e) {
            RxJavaPlugins.a(th);
            return;
        }
        this.e = true;
        Object a2 = NotificationLite.a(th);
        ReplayBuffer<T> replayBuffer = this.a;
        replayBuffer.b(a2);
        for (ReplayDisposable a3 : a(a2)) {
            replayBuffer.a(a3);
        }
    }

    public final void onNext(T t) {
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.e) {
            ReplayBuffer<T> replayBuffer = this.a;
            replayBuffer.a(t);
            for (ReplayDisposable a2 : (ReplayDisposable[]) this.b.get()) {
                replayBuffer.a(a2);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.e) {
            disposable.bd_();
        }
    }
}
