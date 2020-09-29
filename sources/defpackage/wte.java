package defpackage;

import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.alpn.ALPN;
import org.eclipse.jetty.alpn.ALPN.ClientProvider;
import org.eclipse.jetty.alpn.ALPN.ServerProvider;

/* renamed from: wte reason: default package */
final class wte extends wtm {
    private static boolean b;

    wte(SSLEngine sSLEngine, final wtf wtf, boolean z) {
        super(sSLEngine);
        wxq.a(wtf, "applicationNegotiator");
        if (z) {
            final c cVar = (c) wxq.a(wtf.d().a(this, new LinkedHashSet(wtf.a())), "protocolSelector");
            ALPN.put(sSLEngine, new ServerProvider() {
            });
            return;
        }
        final a aVar = (a) wxq.a(wtf.c().a(this, wtf.a()), "protocolListener");
        ALPN.put(sSLEngine, new ClientProvider() {
        });
    }

    static boolean a() {
        if (!b) {
            try {
                Class.forName("sun.security.ssl.ALPNExtension", true, null);
                b = true;
            } catch (Exception unused) {
            }
        }
        return b;
    }

    public final void closeInbound() {
        ALPN.remove(this.a);
        super.closeInbound();
    }

    public final void closeOutbound() {
        ALPN.remove(this.a);
        super.closeOutbound();
    }
}
