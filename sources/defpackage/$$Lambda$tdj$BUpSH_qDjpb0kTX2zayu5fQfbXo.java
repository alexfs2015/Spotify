package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tdj$BUpSH_qDjpb0kTX2zayu5fQfbXo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tdj$BUpSH_qDjpb0kTX2zayu5fQfbXo implements Consumer {
    public static final /* synthetic */ $$Lambda$tdj$BUpSH_qDjpb0kTX2zayu5fQfbXo INSTANCE = new $$Lambda$tdj$BUpSH_qDjpb0kTX2zayu5fQfbXo();

    private /* synthetic */ $$Lambda$tdj$BUpSH_qDjpb0kTX2zayu5fQfbXo() {
    }

    public final void accept(Object obj) {
        Logger.e("Error when subscribing: %s", ((Throwable) obj).getMessage());
    }
}
