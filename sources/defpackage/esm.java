package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: esm reason: default package */
final class esm implements UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ esl b;

    public esm(esl esl, String str) {
        this.b = esl;
        bxo.a(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.q().c.a(this.a, th);
    }
}
