package defpackage;

import defpackage.wot;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;

@a
/* renamed from: wpe reason: default package */
public abstract class wpe<C extends wot> extends wpd {
    private static final wyc b = wyd.a(wpe.class);
    private final ConcurrentMap<wpb, Boolean> c = PlatformDependent.j();

    private boolean c(wpb wpb) {
        if (this.c.putIfAbsent(wpb, Boolean.TRUE) != null) {
            return false;
        }
        try {
            a(wpb.a());
        } catch (Throwable th) {
            d(wpb);
            throw th;
        }
        d(wpb);
        return true;
    }

    private void d(wpb wpb) {
        try {
            wpl b2 = wpb.b();
            if (b2.b((woz) this) != null) {
                b2.a((woz) this);
            }
        } finally {
            this.c.remove(wpb);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(C c2);

    public final void a(wpb wpb, Throwable th) {
        wyc wyc = b;
        StringBuilder sb = new StringBuilder("Failed to initialize a channel. Closing: ");
        sb.append(wpb.a());
        wyc.d(sb.toString(), th);
        wpb.i();
    }

    public final void e(wpb wpb) {
        if (wpb.a().h()) {
            c(wpb);
        }
    }

    public final void g(wpb wpb) {
        if (c(wpb)) {
            wpb.b().a();
        } else {
            wpb.e();
        }
    }
}
