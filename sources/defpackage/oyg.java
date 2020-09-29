package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: oyg reason: default package */
final class oyg {
    final wzi<Player> a;
    final wzi<String> b;

    oyg(wzi<Player> wzi, wzi<String> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
