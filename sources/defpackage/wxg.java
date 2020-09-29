package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* renamed from: wxg reason: default package */
public class wxg extends a implements wuk {
    private static final boolean c;
    private static int d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> e = new ConcurrentHashMap<>();
    private static final AtomicReference<ScheduledExecutorService> f = new AtomicReference<>();
    private static volatile Object g;
    private static final Object h = new Object();
    private volatile boolean a;
    final ScheduledExecutorService b;

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int b2 = wxr.b();
        c = !z && (b2 == 0 || b2 >= 21);
    }

    static void b() {
        try {
            Iterator it = e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (!scheduledThreadPoolExecutor.isShutdown()) {
                    scheduledThreadPoolExecutor.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            wul.b(th);
            wzs.a(th);
        }
    }

    public static boolean a(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        Object obj;
        if (c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj2 = g;
                if (obj2 == h) {
                    return false;
                }
                if (obj2 == null) {
                    Method b2 = b(scheduledExecutorService);
                    if (b2 != 0) {
                        obj = b2;
                    } else {
                        obj = h;
                    }
                    g = obj;
                    method = b2;
                } else {
                    method = (Method) obj2;
                }
            } else {
                method = b(scheduledExecutorService);
            }
            if (method != 0) {
                try {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.TRUE});
                    return true;
                } catch (InvocationTargetException e2) {
                    wzs.a((Throwable) e2);
                } catch (IllegalAccessException e3) {
                    wzs.a((Throwable) e3);
                } catch (IllegalArgumentException e4) {
                    wzs.a((Throwable) e4);
                }
            }
        }
        return false;
    }

    private static Method b(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods;
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public wxg(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!a(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) newScheduledThreadPool;
            while (true) {
                if (((ScheduledExecutorService) f.get()) != null) {
                    break;
                }
                ScheduledExecutorService newScheduledThreadPool2 = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
                if (f.compareAndSet(null, newScheduledThreadPool2)) {
                    AnonymousClass1 r5 = new Runnable() {
                        public final void run() {
                            wxg.b();
                        }
                    };
                    int i = d;
                    newScheduledThreadPool2.scheduleAtFixedRate(r5, (long) i, (long) i, TimeUnit.MILLISECONDS);
                    break;
                }
                newScheduledThreadPool2.shutdownNow();
            }
            e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
        }
        this.b = newScheduledThreadPool;
    }

    public final wuk a(wum wum) {
        return a(wum, 0, null);
    }

    public final wuk a(wum wum, long j, TimeUnit timeUnit) {
        if (this.a) {
            return xaj.b();
        }
        return b(wum, j, timeUnit);
    }

    public final ScheduledAction b(wum wum, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledAction scheduledAction = new ScheduledAction(wzs.a(wum));
        if (j <= 0) {
            future = this.b.submit(scheduledAction);
        } else {
            future = this.b.schedule(scheduledAction, j, timeUnit);
        }
        scheduledAction.a(future);
        return scheduledAction;
    }

    public void unsubscribe() {
        this.a = true;
        this.b.shutdownNow();
        e.remove(this.b);
    }

    public boolean isUnsubscribed() {
        return this.a;
    }
}
