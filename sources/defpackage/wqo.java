package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wqo reason: default package */
public final class wqo extends wvv<Void> implements wpo {
    private final wot a;
    private final boolean b;

    public wqo(wot wot, boolean z) {
        if (wot != null) {
            this.a = wot;
            this.b = z;
            return;
        }
        throw new NullPointerException("channel");
    }

    private void d(Throwable th) {
        if (this.b && this.a.h()) {
            this.a.c().a(th);
        }
    }

    private static void h() {
        throw new IllegalStateException("void future");
    }

    public final /* synthetic */ wox a(wwk wwk) {
        h();
        return this;
    }

    public final /* synthetic */ wpo a(Throwable th) {
        d(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ wws a(Object obj) {
        return this;
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        h();
        return false;
    }

    public final boolean aS_() {
        return false;
    }

    public final /* synthetic */ wwi aV_() {
        h();
        return this;
    }

    public final boolean aW_() {
        return true;
    }

    public final /* bridge */ /* synthetic */ wpo b() {
        return this;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return false;
    }

    public final boolean b(Throwable th) {
        d(th);
        return false;
    }

    public final /* synthetic */ wwi c() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public final /* synthetic */ wws c(Throwable th) {
        d(th);
        return this;
    }

    public final /* synthetic */ wws c(wwk wwk) {
        h();
        return this;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return null;
    }

    public final wot e() {
        return this.a;
    }

    public final Throwable f() {
        return null;
    }

    public final boolean g() {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }
}
