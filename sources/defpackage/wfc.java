package defpackage;

import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wfc reason: default package */
public final class wfc extends wfa {
    private static final e e = new e() {
        {
            if (!wfd.a()) {
                throw new RuntimeException("NPN unsupported. Is your classpatch configured correctly? See https://wiki.eclipse.org/Jetty/Feature/NPN");
            }
        }

        public final SSLEngine a(SSLEngine sSLEngine, wez wez, boolean z) {
            return new wfd(sSLEngine, wez, z);
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

    public wfc(boolean z, Iterable<String> iterable) {
        this(z, z, iterable);
    }

    private wfc(boolean z, boolean z2, Iterable<String> iterable) {
        this(z ? a : b, z2 ? c : d, iterable);
    }

    private wfc(d dVar, b bVar, Iterable<String> iterable) {
        super(e, dVar, bVar, iterable);
    }
}
