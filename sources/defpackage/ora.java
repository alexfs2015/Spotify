package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ora reason: default package */
final class ora {
    final wlc<Player> a;
    final wlc<String> b;

    ora(wlc<Player> wlc, wlc<String> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
