package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: te reason: default package */
final class te {
    final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(this.e);
    final Map<String, b> b = new HashMap();
    final Map<String, a> c = new HashMap();
    final Object d = new Object();
    private final ThreadFactory e = new ThreadFactory() {
        private int a = 0;

        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sb = new StringBuilder("WorkManager-WorkTimer-thread-");
            sb.append(this.a);
            newThread.setName(sb.toString());
            this.a++;
            return newThread;
        }
    };

    /* renamed from: te$a */
    interface a {
        void a(String str);
    }

    /* renamed from: te$b */
    static class b implements Runnable {
        private final te a;
        private final String b;

        b(te teVar, String str) {
            this.a = teVar;
            this.b = str;
        }

        public final void run() {
            synchronized (this.a.d) {
                if (((b) this.a.b.remove(this.b)) != null) {
                    a aVar = (a) this.a.c.remove(this.b);
                    if (aVar != null) {
                        aVar.a(this.b);
                    }
                } else {
                    sg.a();
                    String.format("Timer with %s is already marked as complete.", new Object[]{this.b});
                }
            }
        }
    }

    static {
        sg.a("WorkTimer");
    }

    te() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        synchronized (this.d) {
            if (((b) this.b.remove(str)) != null) {
                sg.a();
                String.format("Stopping timer for %s", new Object[]{str});
                this.c.remove(str);
            }
        }
    }
}
