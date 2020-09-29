package defpackage;

import java.util.LinkedHashSet;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.npn.NextProtoNego;
import org.eclipse.jetty.npn.NextProtoNego.ClientProvider;
import org.eclipse.jetty.npn.NextProtoNego.ServerProvider;

/* renamed from: wtj reason: default package */
final class wtj extends wtm {
    private static boolean b;

    wtj(SSLEngine sSLEngine, final wtf wtf, boolean z) {
        super(sSLEngine);
        wxq.a(wtf, "applicationNegotiator");
        if (z) {
            final a aVar = (a) wxq.a(wtf.c().a(this, wtf.a()), "protocolListener");
            NextProtoNego.put(sSLEngine, new ServerProvider() {
            });
            return;
        }
        final c cVar = (c) wxq.a(wtf.d().a(this, new LinkedHashSet(wtf.a())), "protocolSelector");
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
