package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tas reason: default package */
public final class tas {
    private final wzi<Player> a;

    public tas(wzi<Player> wzi) {
        if (wzi != null) {
            this.a = wzi;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
