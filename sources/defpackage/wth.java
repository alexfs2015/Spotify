package defpackage;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wth reason: default package */
final class wth implements wtf {
    public static final wth a = new wth();
    private static final e b = new e() {
        public final SSLEngine a(SSLEngine sSLEngine, wtf wtf, boolean z) {
            return sSLEngine;
        }
    };

    private wth() {
    }

    public final List<String> a() {
        return Collections.emptyList();
    }

    public final e b() {
        return b;
    }

    public final b c() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }

    public final d d() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }
}
