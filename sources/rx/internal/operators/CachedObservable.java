package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class CachedObservable<T> extends wud<T> {
    private final a<T> a;

    static final class CachedSubscribe<T> extends AtomicBoolean implements defpackage.wud.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final a<T> state;

        public final /* synthetic */ void call(Object obj) {
            wuj wuj = (wuj) obj;
            ReplayProducer<?> replayProducer = new ReplayProducer<>(wuj, this.state);
            a<T> aVar = this.state;
            synchronized (aVar.b) {
                ReplayProducer<?>[] replayProducerArr = aVar.c;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[(length + 1)];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                aVar.c = replayProducerArr2;
            }
            wuj.add(replayProducer);
            wuj.setProducer(replayProducer);
            if (!get() && compareAndSet(false, true)) {
                a<T> aVar2 = this.state;
                AnonymousClass1 r1 = new wuj<T>() {
                    public final void onNext(T t) {
                        a.this.onNext(t);
                    }

                    public final void onError(Throwable th) {
                        a.this.onError(th);
                    }

                    public final void onCompleted() {
                        a.this.onCompleted();
                    }
                };
                aVar2.b.a(r1);
                aVar2.a.a((wuj<? super T>) r1);
                aVar2.e = true;
            }
        }

        public CachedSubscribe(a<T> aVar) {
            this.state = aVar;
        }
    }

    static final class ReplayProducer<T> extends AtomicLong implements wuf, wuk {
        private static final long serialVersionUID = -2557562030197141021L;
        final wuj<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final a<T> state;

        public ReplayProducer(wuj<? super T> wuj, a<T> aVar) {
            this.child = wuj;
            this.state = aVar;
        }

        public final void a(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 >= 0) {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j2, j3));
            a();
        }

        public final boolean isUnsubscribed() {
            return get() < 0;
        }

        public final void unsubscribe() {
            if (get() >= 0 && getAndSet(-1) >= 0) {
                a<T> aVar = this.state;
                synchronized (aVar.b) {
                    ReplayProducer<?>[] replayProducerArr = aVar.c;
                    int length = replayProducerArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (replayProducerArr[i2].equals(this)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVar.c = a.d;
                            return;
                        }
                        ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[(length - 1)];
                        System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                        System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                        aVar.c = replayProducerArr2;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x00e4, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2 = r15.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
            r3 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            if (r3 >= 0) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
            r7 = r15.state.g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
            if (r7 == 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            r8 = r15.currentBuffer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
            if (r8 != null) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
            r8 = r15.state.f;
            r15.currentBuffer = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
            r9 = r8.length - 1;
            r10 = r15.index;
            r11 = r15.currentIndexInBuffer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
            if (r3 != 0) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
            r3 = r8[r11];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
            if (rx.internal.operators.NotificationLite.b(r3) == false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            r2.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            r1 = r2;
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
            if (rx.internal.operators.NotificationLite.c(r3) == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
            r2.onError(rx.internal.operators.NotificationLite.f(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
            if (r3 <= 0) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x005f, code lost:
            if (r10 >= r7) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0063, code lost:
            if (r3 <= 0) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
            if (r2.isUnsubscribed() == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x006c, code lost:
            if (r11 != r9) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x006e, code lost:
            r8 = (java.lang.Object[]) r8[r9];
            r11 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0073, code lost:
            r13 = r8[r11];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0079, code lost:
            if (rx.internal.operators.NotificationLite.a(r2, r13) == false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x007e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x007f, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0080, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0082, code lost:
            r11 = r11 + 1;
            r10 = r10 + 1;
            r3 = r3 - 1;
            r12 = r12 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008c, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x008d, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            defpackage.wul.b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00a0, code lost:
            r2.onError(rx.exceptions.OnErrorThrowable.a(r3, rx.internal.operators.NotificationLite.e(r13)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ab, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ac, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b2, code lost:
            if (r2.isUnsubscribed() == false) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b4, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x00b5, code lost:
            r15.index = r10;
            r15.currentIndexInBuffer = r11;
            r15.currentBuffer = r8;
            addAndGet(-((long) r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c0, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x00c3, code lost:
            if (r15.missed != false) goto L_0x00c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00c5, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x00c8, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            r15.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x00cb, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ce, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x00cf, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d2, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x00d3, code lost:
            r4 = r1;
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x00d6, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x00d8, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x00d9, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x00da, code lost:
            if (r4 == false) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x00dc, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x00dc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r15 = this;
                monitor-enter(r15)
                boolean r0 = r15.emitting     // Catch:{ all -> 0x00e5 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r15.missed = r1     // Catch:{ all -> 0x00e5 }
                monitor-exit(r15)     // Catch:{ all -> 0x00e5 }
                return
            L_0x000a:
                r15.emitting = r1     // Catch:{ all -> 0x00e5 }
                monitor-exit(r15)     // Catch:{ all -> 0x00e5 }
                r0 = 0
                wuj<? super T> r2 = r15.child     // Catch:{ all -> 0x00d8 }
            L_0x0010:
                long r3 = r15.get()     // Catch:{ all -> 0x00d8 }
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x001b
                return
            L_0x001b:
                rx.internal.operators.CachedObservable$a<T> r7 = r15.state     // Catch:{ all -> 0x00d8 }
                int r7 = r7.g     // Catch:{ all -> 0x00d8 }
                if (r7 == 0) goto L_0x00c0
                java.lang.Object[] r8 = r15.currentBuffer     // Catch:{ all -> 0x00d8 }
                if (r8 != 0) goto L_0x002b
                rx.internal.operators.CachedObservable$a<T> r8 = r15.state     // Catch:{ all -> 0x00d8 }
                java.lang.Object[] r8 = r8.f     // Catch:{ all -> 0x00d8 }
                r15.currentBuffer = r8     // Catch:{ all -> 0x00d8 }
            L_0x002b:
                int r9 = r8.length     // Catch:{ all -> 0x00d8 }
                int r9 = r9 - r1
                int r10 = r15.index     // Catch:{ all -> 0x00d8 }
                int r11 = r15.currentIndexInBuffer     // Catch:{ all -> 0x00d8 }
                int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r3 = r8[r11]     // Catch:{ all -> 0x00d8 }
                boolean r4 = rx.internal.operators.NotificationLite.b(r3)     // Catch:{ all -> 0x00d8 }
                if (r4 == 0) goto L_0x0049
                r2.onCompleted()     // Catch:{ all -> 0x00d8 }
                r15.unsubscribe()     // Catch:{ all -> 0x0044 }
                return
            L_0x0044:
                r2 = move-exception
                r1 = r2
                r4 = 1
                goto L_0x00da
            L_0x0049:
                boolean r4 = rx.internal.operators.NotificationLite.c(r3)     // Catch:{ all -> 0x00d8 }
                if (r4 == 0) goto L_0x00c0
                java.lang.Throwable r3 = rx.internal.operators.NotificationLite.f(r3)     // Catch:{ all -> 0x00d8 }
                r2.onError(r3)     // Catch:{ all -> 0x00d8 }
                r15.unsubscribe()     // Catch:{ all -> 0x0044 }
                return
            L_0x005a:
                int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r12 <= 0) goto L_0x00c0
                r12 = 0
            L_0x005f:
                if (r10 >= r7) goto L_0x00ae
                int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r13 <= 0) goto L_0x00ae
                boolean r13 = r2.isUnsubscribed()     // Catch:{ all -> 0x00d8 }
                if (r13 == 0) goto L_0x006c
                return
            L_0x006c:
                if (r11 != r9) goto L_0x0073
                r8 = r8[r9]     // Catch:{ all -> 0x00d8 }
                java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x00d8 }
                r11 = 0
            L_0x0073:
                r13 = r8[r11]     // Catch:{ all -> 0x00d8 }
                boolean r14 = rx.internal.operators.NotificationLite.a(r2, r13)     // Catch:{ all -> 0x008c }
                if (r14 == 0) goto L_0x0082
                r15.unsubscribe()     // Catch:{ all -> 0x007f }
                return
            L_0x007f:
                r3 = move-exception
                r4 = 1
                goto L_0x008e
            L_0x0082:
                int r11 = r11 + 1
                int r10 = r10 + 1
                r13 = 1
                long r3 = r3 - r13
                int r12 = r12 + 1
                goto L_0x005f
            L_0x008c:
                r3 = move-exception
                r4 = 0
            L_0x008e:
                defpackage.wul.b(r3)     // Catch:{ all -> 0x00ac }
                r15.unsubscribe()     // Catch:{ all -> 0x0044 }
                boolean r4 = rx.internal.operators.NotificationLite.c(r13)     // Catch:{ all -> 0x0044 }
                if (r4 != 0) goto L_0x00ab
                boolean r4 = rx.internal.operators.NotificationLite.b(r13)     // Catch:{ all -> 0x0044 }
                if (r4 != 0) goto L_0x00ab
                java.lang.Object r4 = rx.internal.operators.NotificationLite.e(r13)     // Catch:{ all -> 0x0044 }
                java.lang.Throwable r3 = rx.exceptions.OnErrorThrowable.a(r3, r4)     // Catch:{ all -> 0x0044 }
                r2.onError(r3)     // Catch:{ all -> 0x0044 }
            L_0x00ab:
                return
            L_0x00ac:
                r1 = move-exception
                goto L_0x00da
            L_0x00ae:
                boolean r3 = r2.isUnsubscribed()     // Catch:{ all -> 0x00d8 }
                if (r3 == 0) goto L_0x00b5
                return
            L_0x00b5:
                r15.index = r10     // Catch:{ all -> 0x00d8 }
                r15.currentIndexInBuffer = r11     // Catch:{ all -> 0x00d8 }
                r15.currentBuffer = r8     // Catch:{ all -> 0x00d8 }
                long r3 = (long) r12     // Catch:{ all -> 0x00d8 }
                long r3 = -r3
                r15.addAndGet(r3)     // Catch:{ all -> 0x00d8 }
            L_0x00c0:
                monitor-enter(r15)     // Catch:{ all -> 0x00d8 }
                boolean r3 = r15.missed     // Catch:{ all -> 0x00ce }
                if (r3 != 0) goto L_0x00c9
                r15.emitting = r0     // Catch:{ all -> 0x00ce }
                monitor-exit(r15)     // Catch:{ all -> 0x00d6 }
                return
            L_0x00c9:
                r15.missed = r0     // Catch:{ all -> 0x00ce }
                monitor-exit(r15)     // Catch:{ all -> 0x00ce }
                goto L_0x0010
            L_0x00ce:
                r2 = move-exception
                r1 = 0
            L_0x00d0:
                monitor-exit(r15)     // Catch:{ all -> 0x00d6 }
                throw r2     // Catch:{ all -> 0x00d2 }
            L_0x00d2:
                r2 = move-exception
                r4 = r1
                r1 = r2
                goto L_0x00da
            L_0x00d6:
                r2 = move-exception
                goto L_0x00d0
            L_0x00d8:
                r1 = move-exception
                r4 = 0
            L_0x00da:
                if (r4 != 0) goto L_0x00e4
                monitor-enter(r15)
                r15.emitting = r0     // Catch:{ all -> 0x00e1 }
                monitor-exit(r15)     // Catch:{ all -> 0x00e1 }
                goto L_0x00e4
            L_0x00e1:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x00e1 }
                throw r0
            L_0x00e4:
                throw r1
            L_0x00e5:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x00e5 }
                goto L_0x00e9
            L_0x00e8:
                throw r0
            L_0x00e9:
                goto L_0x00e8
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.CachedObservable.ReplayProducer.a():void");
        }
    }

    static final class a<T> extends wxo implements wue<T> {
        static final ReplayProducer<?>[] d = new ReplayProducer[0];
        final wud<? extends T> a;
        final xai b = new xai();
        volatile ReplayProducer<?>[] c = d;
        volatile boolean e;
        private boolean h;

        public a(wud<? extends T> wud, int i) {
            super(i);
            this.a = wud;
        }

        public final void onNext(T t) {
            if (!this.h) {
                a(NotificationLite.a(t));
                a();
            }
        }

        public final void onError(Throwable th) {
            if (!this.h) {
                this.h = true;
                a(NotificationLite.a(th));
                this.b.unsubscribe();
                a();
            }
        }

        public final void onCompleted() {
            if (!this.h) {
                this.h = true;
                a(NotificationLite.a());
                this.b.unsubscribe();
                a();
            }
        }

        private void a() {
            for (ReplayProducer<?> a2 : this.c) {
                a2.a();
            }
        }
    }

    public static <T> CachedObservable<T> a(wud<? extends T> wud, int i) {
        if (i > 0) {
            a aVar = new a(wud, i);
            return new CachedObservable<>(new CachedSubscribe(aVar), aVar);
        }
        throw new IllegalArgumentException("capacityHint > 0 required");
    }

    private CachedObservable(defpackage.wud.a<T> aVar, a<T> aVar2) {
        super(aVar);
        this.a = aVar2;
    }
}
