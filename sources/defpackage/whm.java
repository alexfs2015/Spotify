package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: whm reason: default package */
public final class whm {
    /* access modifiers changed from: private */
    public static final wjw a = wjx.a(whm.class);
    private static ThreadFactory b;
    /* access modifiers changed from: private */
    public static final Queue<a> c = PlatformDependent.m();
    private static final b d = new b(0);
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean();
    private static volatile Thread f;

    /* renamed from: whm$a */
    static final class a {
        final Thread a;
        final Runnable b;
        final boolean c;

        a(Thread thread, Runnable runnable, boolean z) {
            this.a = thread;
            this.b = runnable;
            this.c = z;
        }

        public final int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }
    }

    /* renamed from: whm$b */
    static final class b implements Runnable {
        private static /* synthetic */ boolean b = (!whm.class.desiredAssertionStatus());
        private final List<a> a;

        private b() {
            this.a = new ArrayList();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void run() {
            while (true) {
                a();
                b();
                a();
                b();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (this.a.isEmpty() && whm.c.isEmpty()) {
                    boolean compareAndSet = whm.e.compareAndSet(true, false);
                    if (!b && !compareAndSet) {
                        throw new AssertionError();
                    } else if (whm.c.isEmpty() || !whm.e.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }

        private void a() {
            while (true) {
                a aVar = (a) whm.c.poll();
                if (aVar == null) {
                    return;
                }
                if (aVar.c) {
                    this.a.add(aVar);
                } else {
                    this.a.remove(aVar);
                }
            }
        }

        private void b() {
            List<a> list = this.a;
            int i = 0;
            while (i < list.size()) {
                a aVar = (a) list.get(i);
                if (!aVar.a.isAlive()) {
                    list.remove(i);
                    try {
                        aVar.b.run();
                    } catch (Throwable th) {
                        whm.a.d("Thread death watcher task raised an exception:", th);
                    }
                } else {
                    i++;
                }
            }
        }
    }

    static {
        String b2 = wjo.b("io.netty.serviceThreadPrefix");
        String str = "threadDeathWatcher";
        if (!wjn.a(b2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(b2);
            sb.append(str);
            str = sb.toString();
        }
        b = new whv(str, true, 1, null);
    }

    public static void a(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        } else if (runnable == null) {
            throw new NullPointerException("task");
        } else if (thread.isAlive()) {
            a(thread, runnable, true);
        } else {
            throw new IllegalArgumentException("thread must be alive.");
        }
    }

    public static void b(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        } else if (runnable != null) {
            a(thread, runnable, false);
        } else {
            throw new NullPointerException("task");
        }
    }

    private static void a(Thread thread, Runnable runnable, boolean z) {
        c.add(new a(thread, runnable, z));
        if (e.compareAndSet(false, true)) {
            Thread newThread = b.newThread(d);
            newThread.start();
            f = newThread;
        }
    }

    private whm() {
    }
}
