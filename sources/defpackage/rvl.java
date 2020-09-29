package defpackage;

import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: rvl reason: default package */
final class rvl implements UncaughtExceptionHandler {
    private final rvj a;
    private final UncaughtExceptionHandler b;
    private final rur c;
    private final rup d;

    rvl(rvj rvj, UncaughtExceptionHandler uncaughtExceptionHandler, rur rur, rup rup) {
        this.a = rvj;
        this.b = uncaughtExceptionHandler;
        this.c = rur;
        this.d = rup;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Throwable th2 = th;
        while (true) {
            if (th2 == 0) {
                r5 = th;
                break;
            } else if (th2 instanceof OutOfMemoryError) {
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
                outOfMemoryError.initCause(th);
                outOfMemoryError.fillInStackTrace();
                r5 = outOfMemoryError;
                break;
            } else {
                th2 = th2.getCause();
            }
        }
        if (!(r5 instanceof RecoverableAssertionError)) {
            this.c.a(this.d.a());
            this.a.a(5000);
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, r5);
        }
    }
}
