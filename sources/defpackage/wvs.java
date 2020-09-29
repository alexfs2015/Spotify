package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wvs reason: default package */
public final class wvs {
    /* access modifiers changed from: private */
    public static final wyc a = wyd.a(wvs.class);
    private static ThreadFactory b;
    /* access modifiers changed from: private */
    public static final Queue<a> c = PlatformDependent.m();
    private static final b d = new b(0);
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean();
    private static volatile Thread f;

    /* renamed from: wvs$a */
    static final class a {
        final Thread a;
        final Runnable b;
        final boolean c;

        a(Thread thread, Runnable runnable, boolean z) {
            this.a = thread;
            this.b = runnable;
            this.c = z;
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

        public final int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }
    }

    /* renamed from: wvs$b */
    static final class b implements Runnable {
        private static /* synthetic */ boolean b = (!wvs.class.desiredAssertionStatus());
        private final List<a> a;

        private b() {
            this.a = new ArrayList();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        private void a() {
            while (true) {
                a aVar = (a) wvs.c.poll();
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
                        wvs.a.d("Thread death watcher task raised an exception:", th);
                    }
                } else {
                    i++;
                }
            }
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
                if (this.a.isEmpty() && wvs.c.isEmpty()) {
                    boolean compareAndSet = wvs.e.compareAndSet(true, false);
                    if (!b && !compareAndSet) {
                        throw new AssertionError();
                    } else if (wvs.c.isEmpty() || !wvs.e.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }

    static {
        String b2 = wxu.b("io.netty.serviceThreadPrefix");
        String str = "threadDeathWatcher";
        if (!wxt.a(b2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(b2);
            sb.append(str);
            str = sb.toString();
        }
        b = new wwb(str, true, 1, null);
    }

    private wvs() {
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

    private static void a(Thread thread, Runnable runnable, boolean z) {
        c.add(new a(thread, runnable, z));
        if (e.compareAndSet(false, true)) {
            Thread newThread = b.newThread(d);
            newThread.start();
            f = newThread;
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
}
