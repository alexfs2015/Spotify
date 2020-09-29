package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: sqt reason: default package */
public final class sqt {
    private final wlc<Player> a;

    public sqt(wlc<Player> wlc) {
        if (wlc != null) {
            this.a = wlc;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
