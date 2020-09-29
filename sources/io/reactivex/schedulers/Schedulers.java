package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class Schedulers {
    private static Scheduler a = RxJavaPlugins.d((Callable<Scheduler>) new SingleTask<Scheduler>());
    private static Scheduler b = RxJavaPlugins.a((Callable<Scheduler>) new ComputationTask<Scheduler>());
    private static Scheduler c = RxJavaPlugins.b((Callable<Scheduler>) new IOTask<Scheduler>());
    private static Scheduler d = TrampolineScheduler.d();

    static final class ComputationHolder {
        static final Scheduler a = new ComputationScheduler();
    }

    static final class ComputationTask implements Callable<Scheduler> {
        ComputationTask() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return ComputationHolder.a;
        }
    }

    static final class IOTask implements Callable<Scheduler> {
        IOTask() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return IoHolder.a;
        }
    }

    static final class IoHolder {
        static final Scheduler a = new IoScheduler();
    }

    static final class NewThreadHolder {
        static final Scheduler a = new NewThreadScheduler();
    }

    static final class NewThreadTask implements Callable<Scheduler> {
        NewThreadTask() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return NewThreadHolder.a;
        }
    }

    static final class SingleHolder {
        static final Scheduler a = new SingleScheduler();
    }

    static final class SingleTask implements Callable<Scheduler> {
        SingleTask() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return SingleHolder.a;
        }
    }

    static {
        RxJavaPlugins.c((Callable<Scheduler>) new NewThreadTask<Scheduler>());
    }

    public static Scheduler a() {
        return RxJavaPlugins.a(b);
    }

    public static Scheduler b() {
        return RxJavaPlugins.b(c);
    }

    public static Scheduler c() {
        return d;
    }

    public static Scheduler d() {
        return RxJavaPlugins.c(a);
    }
}
