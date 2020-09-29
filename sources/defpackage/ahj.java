package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahj reason: default package */
final class ahj {
    final ScheduledExecutorService a;
    final List<a> b = new ArrayList();
    volatile boolean c = true;
    final AtomicReference<ScheduledFuture<?>> d = new AtomicReference<>();
    boolean e = true;

    /* renamed from: ahj$a */
    public interface a {
        void a();
    }

    public ahj(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }
}
