package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: cet reason: default package */
final class cet implements UncaughtExceptionHandler {
    private final /* synthetic */ UncaughtExceptionHandler a;
    private final /* synthetic */ ces b;

    cet(ces ces, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = ces;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.b.a(th);
            UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
