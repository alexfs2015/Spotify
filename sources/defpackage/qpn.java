package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;

/* renamed from: qpn reason: default package */
public final class qpn implements PreparePlayCallback {
    private final a a;

    public qpn(a aVar) {
        this.a = aVar;
    }

    public final void onPreparePlaySuccess(PlayerSession playerSession) {
        this.a.a();
    }

    public final void onPreparePlayFailed() {
        this.a.b();
    }
}
