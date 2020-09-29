package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: oyj reason: default package */
final class oyj {
    final wzi<PlayOrigin> a;

    oyj(wzi<PlayOrigin> wzi) {
        this.a = (wzi) a(wzi, 1);
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
