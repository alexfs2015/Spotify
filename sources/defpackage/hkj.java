package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: hkj reason: default package */
public final class hkj {
    private final hpn a;

    public hkj(hpn hpn) {
        this.a = hpn;
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
        return !fbo.a(uri) && jva.a(uri).b == LinkType.SHOW_EPISODE;
    }

    public final boolean a(PlayerTrack playerTrack) {
        return c(playerTrack) ? this.a.a(15000) : this.a.c();
    }

    public final boolean b(PlayerTrack playerTrack) {
        return c(playerTrack) ? this.a.a(-15000) : this.a.b();
    }
}
