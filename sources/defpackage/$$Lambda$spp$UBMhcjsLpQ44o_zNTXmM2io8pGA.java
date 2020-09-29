package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$spp$UBMhcjsLpQ44o_zNTXmM2io8pGA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$spp$UBMhcjsLpQ44o_zNTXmM2io8pGA implements Consumer {
    private final /* synthetic */ Object f$0;

    public /* synthetic */ $$Lambda$spp$UBMhcjsLpQ44o_zNTXmM2io8pGA(Object obj) {
        this.f$0 = obj;
    }

    public final void accept(Object obj) {
        Logger.b("AppReadyCommand(%x): session state ready.", Integer.valueOf(this.f$0.hashCode()));
    }
}
