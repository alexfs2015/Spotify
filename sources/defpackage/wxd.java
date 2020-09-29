package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* renamed from: wxd reason: default package */
public final class wxd extends wug implements wxi {
    static final c a;
    private static int b;
    private static b c = new b(null, 0);
    private ThreadFactory d;
    private AtomicReference<b> e = new AtomicReference<>(c);

    /* renamed from: wxd$a */
    static final class a extends defpackage.wug.a {
        private final wxu a = new wxu();
        private final xag b = new xag();
        private final wxu c = new wxu(this.a, this.b);
        private final c d;

        a(c cVar) {
            this.d = cVar;
        }

        public final void unsubscribe() {
            this.c.unsubscribe();
        }

        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        public final wuk a(final wum wum) {
            if (isUnsubscribed()) {
                return xaj.b();
            }
            c cVar = this.d;
            AnonymousClass1 r1 = new wum() {
                public final void call() {
                    if (!a.this.isUnsubscribed()) {
                        wum.call();
                    }
                }
            };
            wxu wxu = this.a;
            ScheduledAction scheduledAction = new ScheduledAction(wzs.a((wum) r1), wxu);
            wxu.a(scheduledAction);
            scheduledAction.a(cVar.b.submit(scheduledAction));
            return scheduledAction;
        }

        public final wuk a(final wum wum, long j, TimeUnit timeUnit) {
            Future future;
            if (isUnsubscribed()) {
                return xaj.b();
            }
            c cVar = this.d;
            AnonymousClass2 r1 = new wum() {
                public final void call() {
                    if (!a.this.isUnsubscribed()) {
                        wum.call();
                    }
                }
            };
            xag xag = this.b;
            ScheduledAction scheduledAction = new ScheduledAction(wzs.a((wum) r1), xag);
            xag.a((wuk) scheduledAction);
            if (j <= 0) {
                future = cVar.b.submit(scheduledAction);
            } else {
                future = cVar.b.schedule(scheduledAction, j, timeUnit);
            }
            scheduledAction.a(future);
            return scheduledAction;
        }
    }

    /* renamed from: wxd$b */
    static final class b {
        private int a;
        private c[] b;
        private long c;

        b(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public final c a() {
            int i = this.a;
            if (i == 0) {
                return wxd.a;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public final void b() {
            for (c unsubscribe : this.b) {
                unsubscribe.unsubscribe();
            }
        }
    }

    /* renamed from: wxd$c */
    static final class c extends wxg {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        b = intValue;
        c cVar = new c(RxThreadFactory.a);
        a = cVar;
        cVar.unsubscribe();
    }

    public wxd(ThreadFactory threadFactory) {
        this.d = threadFactory;
        b bVar = new b(this.d, b);
        if (!this.e.compareAndSet(c, bVar)) {
            bVar.b();
        }
    }

    public final defpackage.wug.a c() {
        return new a(((b) this.e.get()).a());
    }

    public final void b() {
        b bVar;
        b bVar2;
        do {
            bVar = (b) this.e.get();
            bVar2 = c;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.e.compareAndSet(bVar, bVar2));
        bVar.b();
    }

    public final wuk a(wum wum) {
        return ((b) this.e.get()).a().b(wum, -1, TimeUnit.NANOSECONDS);
    }
}
