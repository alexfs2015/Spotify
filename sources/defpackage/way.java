package defpackage;

import defpackage.wan;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;

@a
/* renamed from: way reason: default package */
public abstract class way<C extends wan> extends wax {
    private static final wjw b = wjx.a(way.class);
    private final ConcurrentMap<wav, Boolean> c = PlatformDependent.j();

    /* access modifiers changed from: protected */
    public abstract void a(C c2);

    public final void g(wav wav) {
        if (c(wav)) {
            wav.b().a();
        } else {
            wav.e();
        }
    }

    public final void a(wav wav, Throwable th) {
        wjw wjw = b;
        StringBuilder sb = new StringBuilder("Failed to initialize a channel. Closing: ");
        sb.append(wav.a());
        wjw.d(sb.toString(), th);
        wav.i();
    }

    public final void e(wav wav) {
        if (wav.a().h()) {
            c(wav);
        }
    }

    private boolean c(wav wav) {
        if (this.c.putIfAbsent(wav, Boolean.TRUE) != null) {
            return false;
        }
        try {
            a(wav.a());
        } catch (Throwable th) {
            d(wav);
            throw th;
        }
        d(wav);
        return true;
    }

    private void d(wav wav) {
        try {
            wbf b2 = wav.b();
            if (b2.b((wat) this) != null) {
                b2.a((wat) this);
            }
        } finally {
            this.c.remove(wav);
        }
    }
}
