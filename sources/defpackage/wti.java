package defpackage;

import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wti reason: default package */
public final class wti extends wtg {
    private static final e e = new e() {
        {
            if (!wtj.a()) {
                throw new RuntimeException("NPN unsupported. Is your classpatch configured correctly? See https://wiki.eclipse.org/Jetty/Feature/NPN");
            }
        }

        public final SSLEngine a(SSLEngine sSLEngine, wtf wtf, boolean z) {
            return new wtj(sSLEngine, wtf, z);
        }
    };

    private wti(d dVar, b bVar, Iterable<String> iterable) {
        super(e, dVar, bVar, iterable);
    }

    public wti(boolean z, Iterable<String> iterable) {
        this(z, z, iterable);
    }

    private wti(boolean z, boolean z2, Iterable<String> iterable) {
        this(z ? a : b, z2 ? c : d, iterable);
    }

    public final /* bridge */ /* synthetic */ List a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ e b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ b c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ d d() {
        return super.d();
    }
}
