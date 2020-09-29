package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: -$$Lambda$bdw$Kpd2ZtI9R5LLMAkSjClz8A1kXGM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$bdw$Kpd2ZtI9R5LLMAkSjClz8A1kXGM implements ThreadFactory {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$bdw$Kpd2ZtI9R5LLMAkSjClz8A1kXGM(String str) {
        this.f$0 = str;
    }

    public final Thread newThread(Runnable runnable) {
        return bdw.a(this.f$0, runnable);
    }
}
