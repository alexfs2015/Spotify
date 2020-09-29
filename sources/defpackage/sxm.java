package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: sxm reason: default package */
public final class sxm implements sxk, a<PlayerState> {
    private final Player a;
    private final url b;
    private final kxc c;
    private final urz d;
    private final sxj e;
    private sxl f;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.is_banned"));
        this.f.setEnabled(Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_ban")));
        this.f.a(parseBoolean);
    }

    public sxm(Player player, url url, kxc kxc, urz urz, sxj sxj) {
        this.a = player;
        this.b = url;
        this.c = kxc;
        this.d = urz;
        this.e = sxj;
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null) {
                String uri = track.uri();
                String contextUri = lastPlayerState.contextUri();
                boolean parseBoolean = Boolean.parseBoolean((String) track.metadata().get("collection.is_banned"));
                this.d.b(parseBoolean);
                if (parseBoolean) {
                    this.c.b(uri, contextUri, false);
                } else {
                    this.c.a(uri, contextUri, this.e.a());
                }
            }
        }
    }

    public final void a(sxl sxl) {
        this.f = (sxl) fay.a(sxl);
        this.f.a((a) this);
        this.b.a((a<T>) this);
        if (this.e.c()) {
            sxl.e();
        } else {
            sxl.f();
        }
    }
}
