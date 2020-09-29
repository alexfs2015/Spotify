package io.reactivex.android.schedulers;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.concurrent.Callable;

public final class AndroidSchedulers {
    private static final Scheduler a = RxAndroidPlugins.a((Callable<Scheduler>) new Callable<Scheduler>() {
        public final /* bridge */ /* synthetic */ Object call() {
            return MainHolder.a;
        }
    });

    static final class MainHolder {
        static final Scheduler a = new HandlerScheduler(new Handler(Looper.getMainLooper()), false);
    }

    public static Scheduler a() {
        return RxAndroidPlugins.a(a);
    }

    public static Scheduler a(Looper looper) {
        if (looper != null) {
            int i = VERSION.SDK_INT;
            return new HandlerScheduler(new Handler(looper), false);
        }
        throw new NullPointerException("looper == null");
    }
}
