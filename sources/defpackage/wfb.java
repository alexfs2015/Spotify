package defpackage;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;

/* renamed from: wfb reason: default package */
final class wfb implements wez {
    public static final wfb a = new wfb();
    private static final e b = new e() {
        public final SSLEngine a(SSLEngine sSLEngine, wez wez, boolean z) {
            return sSLEngine;
        }
    };

    private wfb() {
    }

    public final e b() {
        return b;
    }

    public final d d() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }

    public final b c() {
        throw new UnsupportedOperationException("Application protocol negotiation unsupported");
    }

    public final List<String> a() {
        return Collections.emptyList();
    }
}
