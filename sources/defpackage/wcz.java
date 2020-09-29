package defpackage;

import com.spotify.base.java.logging.Logger;
import java.nio.ByteBuffer;

/* renamed from: wcz reason: default package */
public final class wcz implements xis<ho<wot, ByteBuffer>> {
    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wwi wwi) {
        if (wwi.g()) {
            Logger.b("Channel successfully closed by SpeechChannelWriter", new Object[0]);
            return;
        }
        Logger.e("Failed to close future: %s", wwi.f().getMessage());
    }

    /* access modifiers changed from: private */
    public static void b(wot wot) {
        wot.i().a($$Lambda$wcz$Uq8BS1K_qqVXFkEkzLXF2wfsKNQ.INSTANCE);
    }

    public final /* synthetic */ void call(Object obj) {
        ho hoVar = (ho) obj;
        final wot wot = (wot) fbp.a(hoVar.a);
        if (!wot.D()) {
            b(wot);
        } else {
            wot.b((Object) woc.a((ByteBuffer) hoVar.b)).a(new woy() {
                public final /* synthetic */ void operationComplete(wwi wwi) {
                    if (!((wox) wwi).g() && wot.D()) {
                        wcz.b(wot);
                    }
                }
            });
        }
    }
}
