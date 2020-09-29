package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* renamed from: wxc reason: default package */
public final class wxc extends wug implements wxi {
    static final c a;
    private static final long b = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());
    private static final TimeUnit c = TimeUnit.SECONDS;
    private static a d;
    private ThreadFactory e;
    private AtomicReference<a> f = new AtomicReference<>(d);

    /* renamed from: wxc$a */
    static final class a {
        final long a;
        final ConcurrentLinkedQueue<c> b;
        final xag c;
        private final ThreadFactory d;
        private final ScheduledExecutorService e;
        private final Future<?> f;

        a(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorService;
            this.d = threadFactory;
            this.a = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new xag();
            ScheduledFuture scheduledFuture = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactory() {
                    public final Thread newThread(Runnable runnable) {
                        Thread newThread = threadFactory.newThread(runnable);
                        StringBuilder sb = new StringBuilder();
                        sb.append(newThread.getName());
                        sb.append(" (Evictor)");
                        newThread.setName(sb.toString());
                        return newThread;
                    }
                });
                wxg.a(scheduledExecutorService);
                AnonymousClass2 r1 = new Runnable() {
                    public final void run() {
                        a aVar = a.this;
                        if (!aVar.b.isEmpty()) {
                            long nanoTime = System.nanoTime();
                            Iterator it = aVar.b.iterator();
                            while (it.hasNext()) {
                                c cVar = (c) it.next();
                                if (cVar.a > nanoTime) {
                                    return;
                                }
                                if (aVar.b.remove(cVar)) {
                                    aVar.c.b(cVar);
                                }
                            }
                        }
                    }
                };
                long j2 = this.a;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(r1, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
            }
            this.e = scheduledExecutorService;
            this.f = scheduledFuture;
        }

        /* access modifiers changed from: 0000 */
        public final c a() {
            if (this.c.isUnsubscribed()) {
                return wxc.a;
            }
            while (!this.b.isEmpty()) {
                c cVar = (c) this.b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.d);
            this.c.a((wuk) cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            try {
                if (this.f != null) {
                    this.f.cancel(true);
                }
                if (this.e != null) {
                    this.e.shutdownNow();
                }
            } finally {
                this.c.unsubscribe();
            }
        }
    }

    /* renamed from: wxc$b */
    static final class b extends defpackage.wug.a implements wum {
        private final xag a = new xag();
        private final a b;
        private final c c;
        private AtomicBoolean d;

        b(a aVar) {
            this.b = aVar;
            this.d = new AtomicBoolean();
            this.c = aVar.a();
        }

        public final void unsubscribe() {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(this, 0, null);
            }
            this.a.unsubscribe();
        }

        public final void call() {
            a aVar = this.b;
            c cVar = this.c;
            cVar.a = System.nanoTime() + aVar.a;
            aVar.b.offer(cVar);
        }

        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        public final wuk a(wum wum) {
            return a(wum, 0, null);
        }

        public final wuk a(final wum wum, long j, TimeUnit timeUnit) {
            if (this.a.isUnsubscribed()) {
                return xaj.b();
            }
            ScheduledAction b2 = this.c.b(new wum() {
                public final void call() {
                    if (!b.this.isUnsubscribed()) {
                        wum.call();
                    }
                }
            }, j, timeUnit);
            this.a.a((wuk) b2);
            b2.a(this.a);
            return b2;
        }
    }

    /* renamed from: wxc$c */
    static final class c extends wxg {
        long a = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(RxThreadFactory.a);
        a = cVar;
        cVar.unsubscribe();
        a aVar = new a(null, 0, null);
        d = aVar;
        aVar.b();
    }

    public wxc(ThreadFactory threadFactory) {
        this.e = threadFactory;
        a aVar = new a(this.e, b, c);
        if (!this.f.compareAndSet(d, aVar)) {
            aVar.b();
        }
    }

    public final void b() {
        a aVar;
        a aVar2;
        do {
            aVar = (a) this.f.get();
            aVar2 = d;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f.compareAndSet(aVar, aVar2));
        aVar.b();
    }

    public final defpackage.wug.a c() {
        return new b((a) this.f.get());
    }
}
