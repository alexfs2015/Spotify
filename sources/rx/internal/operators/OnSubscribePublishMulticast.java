package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;

public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements defpackage.wud.a<T>, wue<T>, wuk {
    private static PublishProducer<?>[] a = new PublishProducer[0];
    private static PublishProducer<?>[] b = new PublishProducer[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final a<T> parent;
    final int prefetch;
    volatile wuf producer;
    final Queue<T> queue;
    volatile PublishProducer<T>[] subscribers;

    static final class PublishProducer<T> extends AtomicLong implements wuf, wuk {
        private static final long serialVersionUID = 960704844171597367L;
        final wuj<? super T> actual;
        final AtomicBoolean once = new AtomicBoolean();
        final OnSubscribePublishMulticast<T> parent;

        public PublishProducer(wuj<? super T> wuj, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.actual = wuj;
            this.parent = onSubscribePublishMulticast;
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0) {
                wuz.a((AtomicLong) this, j);
                this.parent.a();
            }
        }

        public final boolean isUnsubscribed() {
            return this.once.get();
        }

        public final void unsubscribe() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this);
            }
        }
    }

    static final class a<T> extends wuj<T> {
        private OnSubscribePublishMulticast<T> a;

        public a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.a = onSubscribePublishMulticast;
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onCompleted() {
            this.a.onCompleted();
        }

        public final void setProducer(wuf wuf) {
            OnSubscribePublishMulticast<T> onSubscribePublishMulticast = this.a;
            onSubscribePublishMulticast.producer = wuf;
            wuf.a((long) onSubscribePublishMulticast.prefetch);
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        PublishProducer publishProducer = new PublishProducer(wuj, this);
        wuj.add(publishProducer);
        wuj.setProducer(publishProducer);
        if (!b(publishProducer)) {
            Throwable th = this.error;
            if (th != null) {
                wuj.onError(th);
            } else {
                wuj.onCompleted();
            }
        } else if (publishProducer.isUnsubscribed()) {
            a(publishProducer);
        } else {
            a();
        }
    }

    public OnSubscribePublishMulticast(int i, boolean z) {
        if (i > 0) {
            this.prefetch = i;
            this.delayError = z;
            if (wzh.a()) {
                this.queue = new wyt(i);
            } else {
                this.queue = new wxy(i);
            }
            this.subscribers = (PublishProducer[]) a;
            this.parent = new a<>(this);
            return;
        }
        StringBuilder sb = new StringBuilder("prefetch > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onNext(T t) {
        if (!this.queue.offer(t)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        a();
    }

    public final void onError(Throwable th) {
        this.error = th;
        this.done = true;
        a();
    }

    public final void onCompleted() {
        this.done = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (getAndIncrement() == 0) {
            Queue<T> queue2 = this.queue;
            int i = 0;
            do {
                PublishProducer<T>[] publishProducerArr = this.subscribers;
                int length = publishProducerArr.length;
                long j = Long.MAX_VALUE;
                for (PublishProducer<T> publishProducer : publishProducerArr) {
                    j = Math.min(j, publishProducer.get());
                }
                if (length != 0) {
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        Object poll = queue2.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2)) {
                            if (z2) {
                                break;
                            }
                            for (PublishProducer<T> publishProducer2 : publishProducerArr) {
                                publishProducer2.actual.onNext(poll);
                            }
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && a(this.done, queue2.isEmpty())) {
                        return;
                    }
                    if (j2 != 0) {
                        wuf wuf = this.producer;
                        if (wuf != null) {
                            wuf.a(j2);
                        }
                        for (PublishProducer<T> b2 : publishProducerArr) {
                            wuz.b(b2, j2);
                        }
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    private boolean a(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            if (!this.delayError) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    PublishProducer[] b2 = b();
                    int length = b2.length;
                    while (i < length) {
                        b2[i].actual.onError(th);
                        i++;
                    }
                    return true;
                } else if (z2) {
                    PublishProducer[] b3 = b();
                    int length2 = b3.length;
                    while (i < length2) {
                        b3[i].actual.onCompleted();
                        i++;
                    }
                    return true;
                }
            } else if (z2) {
                PublishProducer[] b4 = b();
                Throwable th2 = this.error;
                if (th2 != null) {
                    int length3 = b4.length;
                    while (i < length3) {
                        b4[i].actual.onError(th2);
                        i++;
                    }
                } else {
                    int length4 = b4.length;
                    while (i < length4) {
                        b4[i].actual.onCompleted();
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private PublishProducer<T>[] b() {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        if (publishProducerArr != b) {
            synchronized (this) {
                publishProducerArr = this.subscribers;
                if (publishProducerArr != b) {
                    this.subscribers = (PublishProducer[]) b;
                }
            }
        }
        return publishProducerArr;
    }

    private boolean b(PublishProducer<T> publishProducer) {
        if (this.subscribers == b) {
            return false;
        }
        synchronized (this) {
            PublishProducer<T>[] publishProducerArr = this.subscribers;
            if (publishProducerArr == b) {
                return false;
            }
            int length = publishProducerArr.length;
            PublishProducer<T>[] publishProducerArr2 = new PublishProducer[(length + 1)];
            System.arraycopy(publishProducerArr, 0, publishProducerArr2, 0, length);
            publishProducerArr2[length] = publishProducer;
            this.subscribers = publishProducerArr2;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(rx.internal.operators.OnSubscribePublishMulticast.PublishProducer<T> r7) {
        /*
            r6 = this;
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<T>[] r0 = r6.subscribers
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<?>[] r1 = b
            if (r0 == r1) goto L_0x004a
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<?>[] r1 = a
            if (r0 != r1) goto L_0x000b
            goto L_0x004a
        L_0x000b:
            monitor-enter(r6)
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<T>[] r0 = r6.subscribers     // Catch:{ all -> 0x0047 }
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<?>[] r1 = b     // Catch:{ all -> 0x0047 }
            if (r0 == r1) goto L_0x0045
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<?>[] r1 = a     // Catch:{ all -> 0x0047 }
            if (r0 != r1) goto L_0x0017
            goto L_0x0045
        L_0x0017:
            r1 = -1
            int r2 = r0.length     // Catch:{ all -> 0x0047 }
            r3 = 0
            r4 = 0
        L_0x001b:
            if (r4 >= r2) goto L_0x0026
            r5 = r0[r4]     // Catch:{ all -> 0x0047 }
            if (r5 != r7) goto L_0x0023
            r1 = r4
            goto L_0x0026
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0026:
            if (r1 >= 0) goto L_0x002a
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            return
        L_0x002a:
            r7 = 1
            if (r2 != r7) goto L_0x0032
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer<?>[] r7 = a     // Catch:{ all -> 0x0047 }
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer[] r7 = (rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[]) r7     // Catch:{ all -> 0x0047 }
            goto L_0x0041
        L_0x0032:
            int r4 = r2 + -1
            rx.internal.operators.OnSubscribePublishMulticast$PublishProducer[] r4 = new rx.internal.operators.OnSubscribePublishMulticast.PublishProducer[r4]     // Catch:{ all -> 0x0047 }
            java.lang.System.arraycopy(r0, r3, r4, r3, r1)     // Catch:{ all -> 0x0047 }
            int r3 = r1 + 1
            int r2 = r2 - r1
            int r2 = r2 - r7
            java.lang.System.arraycopy(r0, r3, r4, r1, r2)     // Catch:{ all -> 0x0047 }
            r7 = r4
        L_0x0041:
            r6.subscribers = r7     // Catch:{ all -> 0x0047 }
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            return
        L_0x0045:
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            throw r7
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribePublishMulticast.a(rx.internal.operators.OnSubscribePublishMulticast$PublishProducer):void");
    }

    public final void unsubscribe() {
        this.parent.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }
}
