package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: -$$Lambda$rvk$oEQy_zYhTQUtWucJha0ciBa_YA0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rvk$oEQy_zYhTQUtWucJha0ciBa_YA0 implements UncaughtExceptionHandler {
    private final /* synthetic */ rvk f$0;
    private final /* synthetic */ UncaughtExceptionHandler f$1;

    public /* synthetic */ $$Lambda$rvk$oEQy_zYhTQUtWucJha0ciBa_YA0(rvk rvk, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f$0 = rvk;
        this.f$1 = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f$0.a(this.f$1, thread, th);
    }
}
