package defpackage;

import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: wqm reason: default package */
public abstract class wqm extends wxa implements wqa {
    protected static final int a = Math.max(16, wxu.a("io.netty.eventLoop.maxPendingTasks", Integer.MAX_VALUE));
    private final Queue<Runnable> b;

    /* renamed from: wqm$a */
    interface a extends Runnable {
    }

    protected wqm(wqb wqb, Executor executor, boolean z, int i, www www) {
        super(wqb, executor, false, i, www);
        this.b = a(i);
    }

    public final wox a(wot wot) {
        wpv wpv = new wpv(wot, this);
        wxq.a(wpv, "promise");
        wpv.e().l().a((wqa) this, (wpo) wpv);
        return wpv;
    }

    public final void a() {
        a(this.b);
    }

    public final boolean a(Runnable runnable) {
        return !(runnable instanceof a);
    }

    public final /* bridge */ /* synthetic */ wwc b() {
        return (wqa) super.b();
    }

    public final boolean c() {
        return super.c() || !this.b.isEmpty();
    }

    public int d() {
        return super.d() + this.b.size();
    }
}
