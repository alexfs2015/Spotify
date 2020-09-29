package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: -$$Lambda$rme$7G5SdVH1i9T-XbckL0oDTm5BBqg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rme$7G5SdVH1i9TXbckL0oDTm5BBqg implements UncaughtExceptionHandler {
    private final /* synthetic */ rme f$0;
    private final /* synthetic */ UncaughtExceptionHandler f$1;

    public /* synthetic */ $$Lambda$rme$7G5SdVH1i9TXbckL0oDTm5BBqg(rme rme, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f$0 = rme;
        this.f$1 = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f$0.a(this.f$1, thread, th);
    }
}
