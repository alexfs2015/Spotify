package defpackage;

import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wex reason: default package */
public final class wex extends wfa {
    private static final e e = new e() {
        {
            if (!wey.a()) {
                throw new RuntimeException("ALPN unsupported. Is your classpatch configured correctly? See http://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-starting");
            }
        }

        public final SSLEngine a(SSLEngine sSLEngine, wez wez, boolean z) {
            return new wey(sSLEngine, wez, z);
        }
    };

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

    public wex(boolean z, Iterable<String> iterable) {
        this(z, z, iterable);
    }

    private wex(boolean z, boolean z2, Iterable<String> iterable) {
        this(z2 ? a : b, z ? c : d, iterable);
    }

    private wex(d dVar, b bVar, Iterable<String> iterable) {
        super(e, dVar, bVar, iterable);
    }
}
