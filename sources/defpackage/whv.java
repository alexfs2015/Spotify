package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: whv reason: default package */
public final class whv implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b;
    private final String c;
    private final boolean d;
    private final int e;
    private ThreadGroup f;

    /* renamed from: whv$a */
    static final class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        public final void run() {
            try {
                this.a.run();
            } finally {
                wia.b();
            }
        }
    }

    public whv(Class<?> cls) {
        this(cls, false, 5);
    }

    public whv(Class<?> cls, int i) {
        this(cls, false, 10);
    }

    private whv(Class<?> cls, boolean z, int i) {
        this(a(cls), false, i);
    }

    public static String a(Class<?> cls) {
        if (cls != null) {
            String a2 = wjn.a(cls);
            int length = a2.length();
            if (length == 0) {
                return "unknown";
            }
            if (length == 1) {
                return a2.toLowerCase(Locale.US);
            }
            if (Character.isUpperCase(a2.charAt(0)) && Character.isLowerCase(a2.charAt(1))) {
                StringBuilder sb = new StringBuilder();
                sb.append(Character.toLowerCase(a2.charAt(0)));
                sb.append(a2.substring(1));
                a2 = sb.toString();
            }
            return a2;
        }
        throw new NullPointerException("poolType");
    }

    public whv(String str, boolean z, int i, ThreadGroup threadGroup) {
        this.b = new AtomicInteger();
        if (str == null) {
            throw new NullPointerException("poolName");
        } else if (i <= 0 || i > 10) {
            StringBuilder sb = new StringBuilder("priority: ");
            sb.append(i);
            sb.append(" (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)");
            throw new IllegalArgumentException(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('-');
            sb2.append(a.incrementAndGet());
            sb2.append('-');
            this.c = sb2.toString();
            this.d = z;
            this.e = i;
            this.f = threadGroup;
        }
    }

    private whv(String str, boolean z, int i) {
        this(str, z, i, System.getSecurityManager() == null ? Thread.currentThread().getThreadGroup() : System.getSecurityManager().getThreadGroup());
    }

    public final Thread newThread(Runnable runnable) {
        a aVar = new a(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(this.b.incrementAndGet());
        wib wib = new wib(this.f, aVar, sb.toString());
        try {
            if (wib.isDaemon()) {
                if (!this.d) {
                    wib.setDaemon(false);
                }
            } else if (this.d) {
                wib.setDaemon(true);
            }
            if (wib.getPriority() != this.e) {
                wib.setPriority(this.e);
            }
        } catch (Exception unused) {
        }
        return wib;
    }
}
