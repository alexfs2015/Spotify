package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SchedulerPoolFactory {
    static final Map<ScheduledThreadPoolExecutor, Object> a = new ConcurrentHashMap();
    private static boolean b;
    private static int c;
    private static AtomicReference<ScheduledExecutorService> d = new AtomicReference<>();

    static final class PurgeProperties {
        boolean a;
        int b;

        PurgeProperties() {
        }
    }

    static final class ScheduledTask implements Runnable {
        ScheduledTask() {
        }

        public final void run() {
            Iterator it = new ArrayList(SchedulerPoolFactory.a.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.a.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        String str = "rx2.purge-enabled";
        if (properties.containsKey(str)) {
            purgeProperties.a = Boolean.parseBoolean(properties.getProperty(str));
        } else {
            purgeProperties.a = true;
        }
        if (purgeProperties.a) {
            String str2 = "rx2.purge-period-seconds";
            if (properties.containsKey(str2)) {
                try {
                    purgeProperties.b = Integer.parseInt(properties.getProperty(str2));
                } catch (NumberFormatException unused) {
                }
                b = purgeProperties.a;
                c = purgeProperties.b;
                a();
            }
        }
        purgeProperties.b = 1;
        b = purgeProperties.a;
        c = purgeProperties.b;
        a();
    }

    private static void a() {
        if (b) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) d.get();
                if (scheduledExecutorService != null) {
                    break;
                }
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                if (d.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    ScheduledTask scheduledTask = new ScheduledTask();
                    int i = c;
                    newScheduledThreadPool.scheduleAtFixedRate(scheduledTask, (long) i, (long) i, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            }
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (b && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            a.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
