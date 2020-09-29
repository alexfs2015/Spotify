package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cx reason: default package */
public class cx extends cz {
    private static volatile cx b;
    private static final Executor d = new Executor() {
        public final void execute(Runnable runnable) {
            cx.a().a(runnable);
        }
    };
    public cz a = this.c;
    private cz c = new cy();

    static {
        new Executor() {
            public final void execute(Runnable runnable) {
                cx.a().b(runnable);
            }
        };
    }

    private cx() {
    }

    public static cx a() {
        if (b != null) {
            return b;
        }
        synchronized (cx.class) {
            if (b == null) {
                b = new cx();
            }
        }
        return b;
    }

    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public final void b(Runnable runnable) {
        this.a.b(runnable);
    }

    public static Executor b() {
        return d;
    }

    public final boolean c() {
        return this.a.c();
    }
}
