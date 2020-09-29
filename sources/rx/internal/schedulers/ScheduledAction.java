package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;

public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, xip {
    private static final long serialVersionUID = -3962399486978279857L;
    final xir action;
    final xlz cancel;

    static final class Remover extends AtomicBoolean implements xip {
        private static final long serialVersionUID = 247232374289553518L;
        final xok parent;
        final ScheduledAction s;

        public Remover(ScheduledAction scheduledAction, xok xok) {
            this.s = scheduledAction;
            this.parent = xok;
        }

        public final boolean isUnsubscribed() {
            return this.s.isUnsubscribed();
        }

        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.b(this.s);
            }
        }
    }

    static final class Remover2 extends AtomicBoolean implements xip {
        private static final long serialVersionUID = 247232374289553518L;
        final xlz parent;
        final ScheduledAction s;

        public Remover2(ScheduledAction scheduledAction, xlz xlz) {
            this.s = scheduledAction;
            this.parent = xlz;
        }

        public final boolean isUnsubscribed() {
            return this.s.isUnsubscribed();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            if (r2 == false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            r1.unsubscribe();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void unsubscribe() {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r4.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x002a
                xlz r0 = r4.parent
                rx.internal.schedulers.ScheduledAction r1 = r4.s
                boolean r2 = r0.b
                if (r2 != 0) goto L_0x002a
                monitor-enter(r0)
                java.util.List<xip> r2 = r0.a     // Catch:{ all -> 0x0027 }
                boolean r3 = r0.b     // Catch:{ all -> 0x0027 }
                if (r3 != 0) goto L_0x0025
                if (r2 != 0) goto L_0x001a
                goto L_0x0025
            L_0x001a:
                boolean r2 = r2.remove(r1)     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r2 == 0) goto L_0x002a
                r1.unsubscribe()
                goto L_0x002a
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.schedulers.ScheduledAction.Remover2.unsubscribe():void");
        }
    }

    final class a implements xip {
        private final Future<?> a;

        a(Future<?> future) {
            this.a = future;
        }

        public final boolean isUnsubscribed() {
            return this.a.isCancelled();
        }

        public final void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.a.cancel(true);
            } else {
                this.a.cancel(false);
            }
        }
    }

    public ScheduledAction(xir xir) {
        this.action = xir;
        this.cancel = new xlz();
    }

    public ScheduledAction(xir xir, xlz xlz) {
        this.action = xir;
        this.cancel = new xlz((xip) new Remover2(this, xlz));
    }

    public ScheduledAction(xir xir, xok xok) {
        this.action = xir;
        this.cancel = new xlz((xip) new Remover(this, xok));
    }

    private static void a(Throwable th) {
        xnx.a(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final void a(Future<?> future) {
        this.cancel.a(new a(future));
    }

    public final void a(xok xok) {
        this.cancel.a(new Remover(this, xok));
    }

    public final boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    public final void run() {
        try {
            lazySet(Thread.currentThread());
            this.action.call();
        } catch (OnErrorNotImplementedException e) {
            a((Throwable) new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            a((Throwable) new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
        } finally {
            unsubscribe();
        }
    }

    public final void unsubscribe() {
        if (!this.cancel.isUnsubscribed()) {
            this.cancel.unsubscribe();
        }
    }
}
