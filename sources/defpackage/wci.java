package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wci reason: default package */
public final class wci extends whp<Void> implements wbi {
    private final wan a;
    private final boolean b;

    public final /* bridge */ /* synthetic */ wim a(Object obj) {
        return this;
    }

    public final boolean aU_() {
        return false;
    }

    public final boolean aY_() {
        return true;
    }

    public final /* bridge */ /* synthetic */ wbi b() {
        return this;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return false;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return null;
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

    public wci(wan wan, boolean z) {
        if (wan != null) {
            this.a = wan;
            this.b = z;
            return;
        }
        throw new NullPointerException("channel");
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        h();
        return false;
    }

    public final wan e() {
        return this.a;
    }

    public final boolean b(Throwable th) {
        d(th);
        return false;
    }

    private static void h() {
        throw new IllegalStateException("void future");
    }

    private void d(Throwable th) {
        if (this.b && this.a.h()) {
            this.a.c().a(th);
        }
    }

    public final /* synthetic */ wic c() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public final /* synthetic */ wic aX_() {
        h();
        return this;
    }

    public final /* synthetic */ wbi a(Throwable th) {
        d(th);
        return this;
    }

    public final /* synthetic */ war a(wie wie) {
        h();
        return this;
    }

    public final /* synthetic */ wim c(wie wie) {
        h();
        return this;
    }

    public final /* synthetic */ wim c(Throwable th) {
        d(th);
        return this;
    }
}
