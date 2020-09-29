package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: wbz reason: default package */
public abstract class wbz extends wii implements wbv {
    private static final wjw a = wjx.a(wbz.class);
    private static final int b = Math.max(1, wjo.a("io.netty.eventLoopThreads", Runtime.getRuntime().availableProcessors() << 1));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract wbu b(Executor executor, Object... objArr);

    static {
        if (a.b()) {
            a.b("-Dio.netty.eventLoopThreads: {}", (Object) Integer.valueOf(b));
        }
    }

    protected wbz(int i, Executor executor, Object... objArr) {
        if (i == 0) {
            i = b;
        }
        super(i, executor, objArr);
    }

    public final ThreadFactory a() {
        return new whv(getClass(), 10);
    }

    public final war a(wan wan) {
        return ((wbu) super.b()).a(wan);
    }

    public final /* bridge */ /* synthetic */ whw b() {
        return (wbu) super.b();
    }
}
