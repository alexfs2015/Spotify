package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* renamed from: xli reason: default package */
public final class xli extends xil implements xln {
    static final c a;
    private static int b;
    private static b c = new b(null, 0);
    private ThreadFactory d;
    private AtomicReference<b> e = new AtomicReference<>(c);

    /* renamed from: xli$a */
    static final class a extends defpackage.xil.a {
        private final xlz a = new xlz();
        private final xok b = new xok();
        private final xlz c = new xlz(this.a, this.b);
        private final c d;

        a(c cVar) {
            this.d = cVar;
        }

        public final xip a(final xir xir) {
            if (isUnsubscribed()) {
                return xon.b();
            }
            c cVar = this.d;
            AnonymousClass1 r1 = new xir() {
                public final void call() {
                    if (!a.this.isUnsubscribed()) {
                        xir.call();
                    }
                }
            };
            xlz xlz = this.a;
            ScheduledAction scheduledAction = new ScheduledAction(xnx.a((xir) r1), xlz);
            xlz.a(scheduledAction);
            scheduledAction.a(cVar.b.submit(scheduledAction));
            return scheduledAction;
        }

        public final xip a(final xir xir, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return xon.b();
            }
            c cVar = this.d;
            AnonymousClass2 r1 = new xir() {
                public final void call() {
                    if (!a.this.isUnsubscribed()) {
                        xir.call();
                    }
                }
            };
            xok xok = this.b;
            ScheduledAction scheduledAction = new ScheduledAction(xnx.a((xir) r1), xok);
            xok.a((xip) scheduledAction);
            scheduledAction.a(j <= 0 ? cVar.b.submit(scheduledAction) : cVar.b.schedule(scheduledAction, j, timeUnit));
            return scheduledAction;
        }

        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        public final void unsubscribe() {
            this.c.unsubscribe();
        }
    }

    /* renamed from: xli$b */
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
                return xli.a;
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

    /* renamed from: xli$c */
    static final class c extends xll {
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

    public xli(ThreadFactory threadFactory) {
        this.d = threadFactory;
        b bVar = new b(this.d, b);
        if (!this.e.compareAndSet(c, bVar)) {
            bVar.b();
        }
    }

    public final xip a(xir xir) {
        return ((b) this.e.get()).a().b(xir, -1, TimeUnit.NANOSECONDS);
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

    public final defpackage.xil.a c() {
        return new a(((b) this.e.get()).a());
    }
}
