package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory a = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    };
    private static final long serialVersionUID = -8841098858898482335L;
    final String prefix;

    public RxThreadFactory(String str) {
        this.prefix = str;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        sb.append(incrementAndGet());
        Thread thread = new Thread(runnable, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
