package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: cfl reason: default package */
final class cfl implements UncaughtExceptionHandler {
    private final /* synthetic */ UncaughtExceptionHandler a;
    private final /* synthetic */ cfj b;

    cfl(cfj cfj, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = cfj;
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
