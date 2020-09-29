package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qcj reason: default package */
public final class qcj implements vua<qci> {
    private final wlc<saj> a;
    private final wlc<Player> b;

    private qcj(wlc<saj> wlc, wlc<Player> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qcj a(wlc<saj> wlc, wlc<Player> wlc2) {
        return new qcj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qci((saj) this.a.get(), (Player) this.b.get());
    }
}
