package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: szs reason: default package */
public final class szs implements szx, a<PlayerState> {
    private final Player a;
    private final url b;
    private final kxi c;
    private final utd d;
    private final szw e;
    private szy f;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        this.f.setEnabled(parseBoolean);
        this.f.a(parseBoolean2);
    }

    public szs(Player player, url url, kxi kxi, utd utd, szw szw) {
        this.a = player;
        this.b = url;
        this.c = kxi;
        this.d = utd;
        this.e = szw;
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null) {
                String uri = track.uri();
                String contextUri = lastPlayerState.contextUri();
                boolean parseBoolean = Boolean.parseBoolean((String) track.metadata().get("collection.in_collection"));
                this.d.a(parseBoolean);
                if (parseBoolean) {
                    this.c.a(uri, this.e.a());
                } else {
                    this.c.a(uri, contextUri, this.e.a());
                }
            }
        }
    }

    public final void a(szy szy) {
        this.f = (szy) fay.a(szy);
        this.f.a((a) this);
        this.b.a((a<T>) this);
    }
}
