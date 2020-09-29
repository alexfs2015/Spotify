package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

final class HandlerScheduler extends Scheduler {
    private final Handler b;
    private final boolean c;

    static final class HandlerWorker extends Worker {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        HandlerWorker(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.c) {
                return Disposables.b();
            } else {
                ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.a, RxJavaPlugins.a(runnable));
                Message obtain = Message.obtain(this.a, scheduledRunnable);
                obtain.obj = this;
                if (this.b) {
                    obtain.setAsynchronous(true);
                }
                this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.c) {
                    return scheduledRunnable;
                }
                this.a.removeCallbacks(scheduledRunnable);
                return Disposables.b();
            }
        }

        public final boolean b() {
            return this.c;
        }

        public final void bd_() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }
    }

    static final class ScheduledRunnable implements Disposable, Runnable {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        ScheduledRunnable(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public final boolean b() {
            return this.c;
        }

        public final void bd_() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        public final void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                RxJavaPlugins.a(th);
            }
        }
    }

    HandlerScheduler(Handler handler, boolean z) {
        this.b = handler;
        this.c = z;
    }

    public final Worker a() {
        return new HandlerWorker(this.b, this.c);
    }

    public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.b, RxJavaPlugins.a(runnable));
            this.b.postDelayed(scheduledRunnable, timeUnit.toMillis(j));
            return scheduledRunnable;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
