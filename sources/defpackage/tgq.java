package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tgq reason: default package */
public final class tgq {
    private final wzi<Player> a;

    public tgq(wzi<Player> wzi) {
        if (wzi != null) {
            this.a = wzi;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
