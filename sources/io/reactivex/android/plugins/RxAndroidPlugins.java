package io.reactivex.android.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

public final class RxAndroidPlugins {
    public static Scheduler a(Scheduler scheduler) {
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("scheduler == null");
    }

    public static Scheduler a(Callable<Scheduler> callable) {
        return b(callable);
    }

    private static Scheduler b(Callable<Scheduler> callable) {
        try {
            Scheduler scheduler = (Scheduler) callable.call();
            if (scheduler != null) {
                return scheduler;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw Exceptions.a(th);
        }
    }
}
