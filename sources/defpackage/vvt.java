package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vvt reason: default package */
public final class vvt {
    public static final ThreadFactory a(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new vvp() {
                    public final void a() {
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(atomicLong.getAndIncrement());
                newThread.setName(sb.toString());
                return newThread;
            }
        };
    }

    public static final void a(String str, ExecutorService executorService) {
        a(str, executorService, 2, TimeUnit.SECONDS);
    }

    private static void a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        final String str2 = str;
        final ExecutorService executorService2 = executorService;
        final TimeUnit timeUnit2 = timeUnit;
        AnonymousClass2 r0 = new vvp(2) {
            public final void a() {
                String str = "Fabric";
                try {
                    vvc a2 = vuu.a();
                    StringBuilder sb = new StringBuilder("Executing shutdown hook for ");
                    sb.append(str2);
                    a2.a(str, sb.toString());
                    executorService2.shutdown();
                    if (!executorService2.awaitTermination(2, timeUnit2)) {
                        vvc a3 = vuu.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        a3.a(str, sb2.toString());
                        executorService2.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    vuu.a().a(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str2}));
                    executorService2.shutdownNow();
                }
            }
        };
        StringBuilder sb = new StringBuilder("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(r0, sb.toString()));
    }
}
