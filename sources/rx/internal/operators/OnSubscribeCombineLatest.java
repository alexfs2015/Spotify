package rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.CompositeException;

public final class OnSubscribeCombineLatest<T, R> implements defpackage.wud.a<R> {
    private wud<? extends T>[] a;
    private Iterable<? extends wud<? extends T>> b;
    private wux<? extends R> c;
    private int d;
    private boolean e;

    static final class LatestCoordinator<T, R> extends AtomicInteger implements wuf, wuk {
        private static Object a = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final wuj<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final wux<? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final Object[] latest;
        final wxz<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final a<T, R>[] subscribers;

        public LatestCoordinator(wuj<? super R> wuj, wux<? extends R> wux, int i, int i2, boolean z) {
            this.actual = wuj;
            this.combiner = wux;
            this.bufferSize = i2;
            this.delayError = z;
            this.latest = new Object[i];
            Arrays.fill(this.latest, a);
            this.subscribers = new a[i];
            this.queue = new wxz<>(i2);
        }

        public final void a(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("n >= required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j != 0) {
                wuz.a(this.requested, j);
                a();
            }
        }

        public final void unsubscribe() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (getAndIncrement() == 0) {
                    a((Queue<?>) this.queue);
                }
            }
        }

        public final boolean isUnsubscribed() {
            return this.cancelled;
        }

        private void a(Queue<?> queue2) {
            queue2.clear();
            for (a<T, R> unsubscribe : this.subscribers) {
                unsubscribe.unsubscribe();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(Object obj, int i) {
            boolean z;
            a<T, R> aVar = this.subscribers[i];
            synchronized (this) {
                int length = this.latest.length;
                Object obj2 = this.latest[i];
                int i2 = this.active;
                if (obj2 == a) {
                    i2++;
                    this.active = i2;
                }
                int i3 = this.complete;
                if (obj == null) {
                    i3++;
                    this.complete = i3;
                } else {
                    this.latest[i] = NotificationLite.e(obj);
                }
                boolean z2 = false;
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == a)) {
                    z2 = true;
                }
                if (z2) {
                    this.done = true;
                } else if (obj != null && z) {
                    this.queue.a(aVar, this.latest.clone());
                } else if (obj == null && this.error.get() != null && (obj2 == a || !this.delayError)) {
                    this.done = true;
                }
            }
            if (z || obj == null) {
                a();
            } else {
                aVar.a(1);
            }
        }

        private void a() {
            long j;
            if (getAndIncrement() == 0) {
                wxz<Object> wxz = this.queue;
                wuj<? super R> wuj = this.actual;
                boolean z = this.delayError;
                AtomicLong atomicLong = this.requested;
                int i = 1;
                do {
                    if (!a(this.done, wxz.isEmpty(), wuj, wxz, z)) {
                        long j2 = atomicLong.get();
                        long j3 = 0;
                        while (true) {
                            if (j3 == j2) {
                                j = j3;
                                break;
                            }
                            boolean z2 = this.done;
                            a aVar = (a) wxz.peek();
                            boolean z3 = aVar == null;
                            a aVar2 = aVar;
                            long j4 = j3;
                            if (!a(z2, z3, wuj, wxz, z)) {
                                if (z3) {
                                    j = j4;
                                    break;
                                }
                                wxz.poll();
                                Object[] objArr = (Object[]) wxz.poll();
                                if (objArr == null) {
                                    this.cancelled = true;
                                    a((Queue<?>) wxz);
                                    wuj.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                    return;
                                }
                                try {
                                    wuj.onNext(this.combiner.a(objArr));
                                    aVar2.a(1);
                                    j3 = j4 + 1;
                                } catch (Throwable th) {
                                    this.cancelled = true;
                                    a((Queue<?>) wxz);
                                    wuj.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                            wuz.b(atomicLong, j);
                        }
                        i = addAndGet(-i);
                    } else {
                        return;
                    }
                } while (i != 0);
            }
        }

        private boolean a(boolean z, boolean z2, wuj<?> wuj, Queue<?> queue2, boolean z3) {
            if (this.cancelled) {
                a(queue2);
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = (Throwable) this.error.get();
                    if (th != null) {
                        a(queue2);
                        wuj.onError(th);
                        return true;
                    } else if (z2) {
                        wuj.onCompleted();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = (Throwable) this.error.get();
                    if (th2 != null) {
                        wuj.onError(th2);
                    } else {
                        wuj.onCompleted();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    static final class a<T, R> extends wuj<T> {
        private LatestCoordinator<T, R> a;
        private int b;
        private boolean c;

        public a(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.a = latestCoordinator;
            this.b = i;
            request((long) latestCoordinator.bufferSize);
        }

        public final void onNext(T t) {
            if (!this.c) {
                this.a.a(NotificationLite.a(t), this.b);
            }
        }

        public final void onError(Throwable th) {
            Throwable th2;
            Throwable th3;
            if (this.c) {
                wzs.a(th);
                return;
            }
            AtomicReference<Throwable> atomicReference = this.a.error;
            do {
                th2 = (Throwable) atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).exceptions);
                    arrayList.add(th);
                    th3 = new CompositeException(arrayList, 0);
                } else {
                    th3 = new CompositeException(Arrays.asList(new Throwable[]{th2, th}), 0);
                }
            } while (!atomicReference.compareAndSet(th2, th3));
            this.c = true;
            this.a.a(null, this.b);
        }

        public final void onCompleted() {
            if (!this.c) {
                this.c = true;
                this.a.a(null, this.b);
            }
        }

        public final void a(long j) {
            request(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void call(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = r9
            wuj r1 = (defpackage.wuj) r1
            wud<? extends T>[] r9 = r8.a
            r6 = 0
            if (r9 != 0) goto L_0x0048
            java.lang.Iterable<? extends wud<? extends T>> r9 = r8.b
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L_0x001e
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            wud[] r0 = new defpackage.wud[r0]
            java.lang.Object[] r9 = r9.toArray(r0)
            wud[] r9 = (defpackage.wud[]) r9
            int r0 = r9.length
            goto L_0x0049
        L_0x001e:
            r0 = 8
            wud[] r0 = new defpackage.wud[r0]
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
        L_0x0027:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r9.next()
            wud r3 = (defpackage.wud) r3
            int r4 = r0.length
            if (r2 != r4) goto L_0x003f
            int r4 = r2 >> 2
            int r4 = r4 + r2
            wud[] r4 = new defpackage.wud[r4]
            java.lang.System.arraycopy(r0, r6, r4, r6, r2)
            r0 = r4
        L_0x003f:
            int r4 = r2 + 1
            r0[r2] = r3
            r2 = r4
            goto L_0x0027
        L_0x0045:
            r9 = r0
            r3 = r2
            goto L_0x004a
        L_0x0048:
            int r0 = r9.length
        L_0x0049:
            r3 = r0
        L_0x004a:
            if (r3 != 0) goto L_0x0050
            r1.onCompleted()
            return
        L_0x0050:
            rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator r7 = new rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator
            wux<? extends R> r2 = r8.c
            int r4 = r8.d
            boolean r5 = r8.e
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            rx.internal.operators.OnSubscribeCombineLatest$a<T, R>[] r0 = r7.subscribers
            int r1 = r0.length
            r2 = 0
        L_0x0060:
            if (r2 >= r1) goto L_0x006c
            rx.internal.operators.OnSubscribeCombineLatest$a r3 = new rx.internal.operators.OnSubscribeCombineLatest$a
            r3.<init>(r7, r2)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x0060
        L_0x006c:
            r7.lazySet(r6)
            wuj<? super R> r2 = r7.actual
            r2.add(r7)
            wuj<? super R> r2 = r7.actual
            r2.setProducer(r7)
        L_0x0079:
            if (r6 >= r1) goto L_0x0089
            boolean r2 = r7.cancelled
            if (r2 != 0) goto L_0x0089
            r2 = r9[r6]
            r3 = r0[r6]
            defpackage.wud.a(r3, r2)
            int r6 = r6 + 1
            goto L_0x0079
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeCombineLatest.call(java.lang.Object):void");
    }

    public OnSubscribeCombineLatest(Iterable<? extends wud<? extends T>> iterable, wux<? extends R> wux) {
        this(null, iterable, wux, wxs.b, false);
    }

    private OnSubscribeCombineLatest(wud<? extends T>[] wudArr, Iterable<? extends wud<? extends T>> iterable, wux<? extends R> wux, int i, boolean z) {
        this.a = null;
        this.b = iterable;
        this.c = wux;
        this.d = i;
        this.e = false;
    }
}
