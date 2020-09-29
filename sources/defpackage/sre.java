package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: sre reason: default package */
public final class sre {
    private final wlc<Player> a;

    public sre(wlc<Player> wlc) {
        if (wlc != null) {
            this.a = wlc;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
