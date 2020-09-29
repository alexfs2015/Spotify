package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;

/* renamed from: ixy reason: default package */
public final class ixy {
    private final MiniPlayerPageView a;
    private final ixx b = new ixw(this.a);
    private PlayerTrack c;

    public ixy(MiniPlayerPageView miniPlayerPageView) {
        this.a = miniPlayerPageView;
    }

    public final void a() {
        this.a.c();
        this.a.a(this.b.b(this.c));
    }

    public final void a(PlayerTrack playerTrack) {
        this.c = playerTrack;
        this.b.a(playerTrack);
    }
}
