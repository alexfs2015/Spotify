package defpackage;

import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wtd reason: default package */
public final class wtd extends wtg {
    private static final e e = new e() {
        {
            if (!wte.a()) {
                throw new RuntimeException("ALPN unsupported. Is your classpatch configured correctly? See http://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-starting");
            }
        }

        public final SSLEngine a(SSLEngine sSLEngine, wtf wtf, boolean z) {
            return new wte(sSLEngine, wtf, z);
        }
    };

    private wtd(d dVar, b bVar, Iterable<String> iterable) {
        super(e, dVar, bVar, iterable);
    }

    public wtd(boolean z, Iterable<String> iterable) {
        this(z, z, iterable);
    }

    private wtd(boolean z, boolean z2, Iterable<String> iterable) {
        this(z2 ? a : b, z ? c : d, iterable);
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
