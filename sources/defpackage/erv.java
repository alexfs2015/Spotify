package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: erv reason: default package */
final class erv implements UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ eru b;

    public erv(eru eru, String str) {
        this.b = eru;
        bwx.a(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.q().c.a(this.a, th);
    }
}
