package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;

/* renamed from: qyd reason: default package */
public final class qyd implements PreparePlayCallback {
    private final a a;

    public qyd(a aVar) {
        this.a = aVar;
    }

    public final void onPreparePlayFailed() {
        this.a.b();
    }

    public final void onPreparePlaySuccess(PlayerSession playerSession) {
        this.a.a();
    }
}
