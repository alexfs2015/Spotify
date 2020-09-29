package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiv reason: default package */
final class aiv implements UncaughtExceptionHandler {
    final AtomicBoolean a = new AtomicBoolean(false);
    private final a b;
    private final b c;
    private final boolean d;
    private final UncaughtExceptionHandler e;

    /* renamed from: aiv$a */
    interface a {
        void a(b bVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: aiv$b */
    interface b {
        wmh a();
    }

    public aiv(a aVar, b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = aVar;
        this.c = bVar;
        this.d = z;
        this.e = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "Crashlytics completed exception processing. Invoking default exception handler.";
        String str2 = "CrashlyticsCore";
        this.a.set(true);
        try {
            this.b.a(this.c, thread, th, this.d);
        } catch (Exception e2) {
            wja.a().c(str2, "An error occurred in the uncaught exception handler", e2);
        } catch (Throwable th2) {
            wja.a().a(str2, str);
            this.e.uncaughtException(thread, th);
            this.a.set(false);
            throw th2;
        }
        wja.a().a(str2, str);
        this.e.uncaughtException(thread, th);
        this.a.set(false);
    }
}
