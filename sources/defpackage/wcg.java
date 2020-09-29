package defpackage;

import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: wcg reason: default package */
public abstract class wcg extends wiu implements wbu {
    protected static final int a = Math.max(16, wjo.a("io.netty.eventLoop.maxPendingTasks", Integer.MAX_VALUE));
    private final Queue<Runnable> b;

    /* renamed from: wcg$a */
    interface a extends Runnable {
    }

    protected wcg(wbv wbv, Executor executor, boolean z, int i, wiq wiq) {
        super(wbv, executor, false, i, wiq);
        this.b = a(i);
    }

    public final war a(wan wan) {
        wbp wbp = new wbp(wan, this);
        wjk.a(wbp, "promise");
        wbp.e().l().a((wbu) this, (wbi) wbp);
        return wbp;
    }

    public final boolean a(Runnable runnable) {
        return !(runnable instanceof a);
    }

    public final void a() {
        a(this.b);
    }

    public final boolean c() {
        return super.c() || !this.b.isEmpty();
    }

    public int d() {
        return super.d() + this.b.size();
    }

    public final /* bridge */ /* synthetic */ whw b() {
        return (wbu) super.b();
    }
}
