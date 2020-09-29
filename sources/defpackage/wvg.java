package defpackage;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.operators.OnSubscribeFromIterable.IterableProducer;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: wvg reason: default package */
public final class wvg<T, R> implements defpackage.wud.a<R> {
    private wud<? extends T> a;
    private wut<? super T, ? extends Iterable<? extends R>> b;
    private int c;

    /* renamed from: wvg$a */
    static final class a<T, R> extends wuj<T> {
        final AtomicLong a = new AtomicLong();
        private wuj<? super R> b;
        private wut<? super T, ? extends Iterable<? extends R>> c;
        private long d;
        private Queue<Object> e;
        private AtomicReference<Throwable> f = new AtomicReference<>();
        private AtomicInteger g = new AtomicInteger();
        private volatile boolean h;
        private long i;
        private Iterator<? extends R> j;

        public a(wuj<? super R> wuj, wut<? super T, ? extends Iterable<? extends R>> wut, int i2) {
            this.b = wuj;
            this.c = wut;
            if (i2 == Integer.MAX_VALUE) {
                this.d = Long.MAX_VALUE;
                this.e = new wxz(wxs.b);
            } else {
                this.d = (long) (i2 - (i2 >> 2));
                if (wzh.a()) {
                    this.e = new wyt(i2);
                } else {
                    this.e = new wxy(i2);
                }
            }
            request((long) i2);
        }

        public final void onNext(T t) {
            if (!this.e.offer(NotificationLite.a(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            a();
        }

        public final void onError(Throwable th) {
            if (ExceptionsUtils.a(this.f, th)) {
                this.h = true;
                a();
                return;
            }
            wzs.a(th);
        }

        public final void onCompleted() {
            this.h = true;
            a();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
            if (r14 != null) goto L_0x00cf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0010 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r17 = this;
                r1 = r17
                java.util.concurrent.atomic.AtomicInteger r0 = r1.g
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                wuj<? super R> r2 = r1.b
                java.util.Queue<java.lang.Object> r3 = r1.e
                r5 = 1
            L_0x0010:
                java.util.Iterator<? extends R> r0 = r1.j
                r6 = 1
                r8 = 0
                r10 = 0
                if (r0 != 0) goto L_0x0061
                boolean r11 = r1.h
                java.lang.Object r12 = r3.poll()
                if (r12 != 0) goto L_0x0023
                r13 = 1
                goto L_0x0024
            L_0x0023:
                r13 = 0
            L_0x0024:
                boolean r11 = r1.a(r11, r13, r2, r3)
                if (r11 == 0) goto L_0x002b
                return
            L_0x002b:
                if (r13 != 0) goto L_0x0061
                long r13 = r1.i
                long r13 = r13 + r6
                r15 = r5
                long r4 = r1.d
                int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x003d
                r1.i = r8
                r1.request(r13)
                goto L_0x003f
            L_0x003d:
                r1.i = r13
            L_0x003f:
                wut<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r1.c     // Catch:{ all -> 0x0058 }
                java.lang.Object r4 = rx.internal.operators.NotificationLite.e(r12)     // Catch:{ all -> 0x0058 }
                java.lang.Object r0 = r0.call(r4)     // Catch:{ all -> 0x0058 }
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0058 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0058 }
                boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0058 }
                if (r4 == 0) goto L_0x00cc
                r1.j = r0
                goto L_0x0062
            L_0x0058:
                r0 = move-exception
                defpackage.wul.b(r0)
                r1.onError(r0)
                goto L_0x00cc
            L_0x0061:
                r15 = r5
            L_0x0062:
                if (r0 == 0) goto L_0x00cf
                java.util.concurrent.atomic.AtomicLong r4 = r1.a
                long r4 = r4.get()
                r12 = r8
            L_0x006b:
                r14 = 0
                int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r16 == 0) goto L_0x00a9
                boolean r11 = r1.h
                boolean r11 = r1.a(r11, r10, r2, r3)
                if (r11 == 0) goto L_0x0079
                return
            L_0x0079:
                java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x009e }
                r2.onNext(r11)
                boolean r11 = r1.h
                boolean r11 = r1.a(r11, r10, r2, r3)
                if (r11 == 0) goto L_0x0089
                return
            L_0x0089:
                long r12 = r12 + r6
                boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0093 }
                if (r11 != 0) goto L_0x006b
                r1.j = r14
                goto L_0x00aa
            L_0x0093:
                r0 = move-exception
                r6 = r0
                defpackage.wul.b(r6)
                r1.j = r14
                r1.onError(r6)
                goto L_0x00aa
            L_0x009e:
                r0 = move-exception
                r6 = r0
                defpackage.wul.b(r6)
                r1.j = r14
                r1.onError(r6)
                goto L_0x00aa
            L_0x00a9:
                r14 = r0
            L_0x00aa:
                int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x00c0
                boolean r0 = r1.h
                boolean r4 = r3.isEmpty()
                if (r4 == 0) goto L_0x00b9
                if (r14 != 0) goto L_0x00b9
                r10 = 1
            L_0x00b9:
                boolean r0 = r1.a(r0, r10, r2, r3)
                if (r0 == 0) goto L_0x00c0
                return
            L_0x00c0:
                int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r0 == 0) goto L_0x00c9
                java.util.concurrent.atomic.AtomicLong r0 = r1.a
                defpackage.wuz.b(r0, r12)
            L_0x00c9:
                if (r14 == 0) goto L_0x00cc
                goto L_0x00cf
            L_0x00cc:
                r5 = r15
                goto L_0x0010
            L_0x00cf:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.g
                int r4 = -r15
                int r5 = r0.addAndGet(r4)
                if (r5 == 0) goto L_0x00da
                goto L_0x0010
            L_0x00da:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wvg.a.a():void");
        }

        private boolean a(boolean z, boolean z2, wuj<?> wuj, Queue<?> queue) {
            if (wuj.isUnsubscribed()) {
                queue.clear();
                this.j = null;
                return true;
            }
            if (z) {
                if (((Throwable) this.f.get()) != null) {
                    Throwable a2 = ExceptionsUtils.a(this.f);
                    unsubscribe();
                    queue.clear();
                    this.j = null;
                    wuj.onError(a2);
                    return true;
                } else if (z2) {
                    wuj.onCompleted();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: wvg$b */
    static final class b<T, R> implements defpackage.wud.a<R> {
        private T a;
        private wut<? super T, ? extends Iterable<? extends R>> b;

        public final /* synthetic */ void call(Object obj) {
            wuj wuj = (wuj) obj;
            try {
                Iterator it = ((Iterable) this.b.call(this.a)).iterator();
                if (!it.hasNext()) {
                    wuj.onCompleted();
                } else {
                    wuj.setProducer(new IterableProducer(wuj, it));
                }
            } catch (Throwable th) {
                wul.a(th, wuj, this.a);
            }
        }

        public b(T t, wut<? super T, ? extends Iterable<? extends R>> wut) {
            this.a = t;
            this.b = wut;
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        final a aVar = new a(wuj, this.b, this.c);
        wuj.add(aVar);
        wuj.setProducer(new wuf() {
            public final void a(long j) {
                a aVar = aVar;
                if (j > 0) {
                    wuz.a(aVar.a, j);
                    aVar.a();
                } else if (j < 0) {
                    StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
                    sb.append(j);
                    throw new IllegalStateException(sb.toString());
                }
            }
        });
        this.a.a((wuj<? super T>) aVar);
    }

    private wvg(wud<? extends T> wud, wut<? super T, ? extends Iterable<? extends R>> wut, int i) {
        this.a = wud;
        this.b = wut;
        this.c = i;
    }

    public static <T, R> wud<R> a(wud<? extends T> wud, wut<? super T, ? extends Iterable<? extends R>> wut, int i) {
        if (wud instanceof ScalarSynchronousObservable) {
            return wud.b((defpackage.wud.a<T>) new b<T>(((ScalarSynchronousObservable) wud).a, wut));
        }
        return wud.b((defpackage.wud.a<T>) new wvg<T>(wud, wut, i));
    }
}
