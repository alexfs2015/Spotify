package defpackage;

import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.npn.NextProtoNego;
import org.eclipse.jetty.npn.NextProtoNego.ClientProvider;
import org.eclipse.jetty.npn.NextProtoNego.ServerProvider;

/* renamed from: wfd reason: default package */
final class wfd extends wfg {
    private static boolean b;

    wfd(SSLEngine sSLEngine, final wez wez, boolean z) {
        super(sSLEngine);
        wjk.a(wez, "applicationNegotiator");
        if (z) {
            final a aVar = (a) wjk.a(wez.c().a(this, wez.a()), "protocolListener");
            NextProtoNego.put(sSLEngine, new ServerProvider() {
            });
            return;
        }
        final c cVar = (c) wjk.a(wez.d().a(this, new LinkedHashSet(wez.a())), "protocolSelector");
        NextProtoNego.put(sSLEngine, new ClientProvider() {
        });
    }

    static boolean a() {
        if (!b) {
            try {
                Class.forName("sun.security.ssl.NextProtoNegoExtension", true, null);
                b = true;
            } catch (Exception unused) {
            }
        }
        return b;
    }

    public final void closeInbound() {
        NextProtoNego.remove(this.a);
        super.closeInbound();
    }

    public final void closeOutbound() {
        NextProtoNego.remove(this.a);
        super.closeOutbound();
    }
}
