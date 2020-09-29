package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;

/* renamed from: gtj reason: default package */
public final class gtj implements wig<xii<ConnectState>> {
    private final wzi<ConnectManager> a;

    public static xii<ConnectState> a(ConnectManager connectManager) {
        return (xii) wil.a(CC.a(connectManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ConnectManager) this.a.get());
    }
}
