package defpackage;

import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.alpn.ALPN;
import org.eclipse.jetty.alpn.ALPN.ClientProvider;
import org.eclipse.jetty.alpn.ALPN.ServerProvider;

/* renamed from: wey reason: default package */
final class wey extends wfg {
    private static boolean b;

    wey(SSLEngine sSLEngine, final wez wez, boolean z) {
        super(sSLEngine);
        wjk.a(wez, "applicationNegotiator");
        if (z) {
            final c cVar = (c) wjk.a(wez.d().a(this, new LinkedHashSet(wez.a())), "protocolSelector");
            ALPN.put(sSLEngine, new ServerProvider() {
            });
            return;
        }
        final a aVar = (a) wjk.a(wez.c().a(this, wez.a()), "protocolListener");
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
