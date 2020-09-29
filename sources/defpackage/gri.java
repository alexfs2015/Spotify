package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;

/* renamed from: gri reason: default package */
public final class gri implements vua<wud<ConnectState>> {
    private final wlc<ConnectManager> a;

    public static wud<ConnectState> a(ConnectManager connectManager) {
        return (wud) vuf.a(CC.a(connectManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ConnectManager) this.a.get());
    }
}
