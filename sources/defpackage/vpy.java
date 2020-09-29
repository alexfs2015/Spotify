package defpackage;

import com.spotify.base.java.logging.Logger;
import java.nio.ByteBuffer;

/* renamed from: vpy reason: default package */
public final class vpy implements wun<ho<wan, ByteBuffer>> {
    public final /* synthetic */ void call(Object obj) {
        ho hoVar = (ho) obj;
        final wan wan = (wan) fay.a(hoVar.a);
        if (!wan.D()) {
            b(wan);
        } else {
            wan.b((Object) vzw.a((ByteBuffer) hoVar.b)).a(new was() {
                public final /* synthetic */ void operationComplete(wic wic) {
                    if (!((war) wic).g() && wan.D()) {
                        vpy.b(wan);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void b(wan wan) {
        wan.i().a($$Lambda$vpy$IJcQ_QdPOz3AANkHPVSN3eOwKs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wic wic) {
        if (wic.g()) {
            Logger.b("Channel successfully closed by SpeechChannelWriter", new Object[0]);
            return;
        }
        Logger.e("Failed to close future: %s", wic.f().getMessage());
    }
}
