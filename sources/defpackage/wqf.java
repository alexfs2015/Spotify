package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: wqf reason: default package */
public abstract class wqf extends wwo implements wqb {
    private static final wyc a = wyd.a(wqf.class);
    private static final int b = Math.max(1, wxu.a("io.netty.eventLoopThreads", Runtime.getRuntime().availableProcessors() << 1));

    static {
        if (a.b()) {
            a.b("-Dio.netty.eventLoopThreads: {}", (Object) Integer.valueOf(b));
        }
    }

    protected wqf(int i, Executor executor, Object... objArr) {
        if (i == 0) {
            i = b;
        }
        super(i, executor, objArr);
    }

    public final ThreadFactory a() {
        return new wwb(getClass(), 10);
    }

    public final wox a(wot wot) {
        return ((wqa) super.b()).a(wot);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract wqa b(Executor executor, Object... objArr);

    public final /* bridge */ /* synthetic */ wwc b() {
        return (wqa) super.b();
    }
}
