package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: hhp reason: default package */
public final class hhp {
    private final hmw a;

    public hhp(hmw hmw) {
        this.a = hmw;
    }

    public final boolean a(PlayerTrack playerTrack) {
        if (c(playerTrack)) {
            return this.a.a(15000);
        }
        return this.a.c();
    }

    public final boolean b(PlayerTrack playerTrack) {
        if (c(playerTrack)) {
            return this.a.a(-15000);
        }
        return this.a.b();
    }

    private static boolean c(PlayerTrack playerTrack) {
        return playerTrack != null && d(playerTrack) && e(playerTrack);
    }

    private static boolean d(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("media.type");
        return str == null || str.equals("audio");
    }

    private static boolean e(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        if (fax.a(uri) || jst.a(uri).b != LinkType.SHOW_EPISODE) {
            return false;
        }
        return true;
    }
}
