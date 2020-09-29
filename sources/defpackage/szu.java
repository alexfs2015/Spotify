package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: szu reason: default package */
public final class szu implements szx, a<PlayerState> {
    private final Player a;
    private final url b;
    private final sih c;
    private final kxi d;
    private final rbe e;
    private final utd f;
    private final szw g;
    private szy h;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        this.h.setEnabled(parseBoolean);
        this.h.a(parseBoolean2);
    }

    public szu(Player player, url url, sih sih, kxi kxi, rbe rbe, utd utd, szw szw) {
        this.a = player;
        this.b = url;
        this.c = sih;
        this.d = kxi;
        this.e = rbe;
        this.f = utd;
        this.g = szw;
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null) {
                String uri = track.uri();
                String contextUri = lastPlayerState.contextUri();
                boolean parseBoolean = Boolean.parseBoolean((String) track.metadata().get("collection.in_collection"));
                this.f.a(parseBoolean);
                if (parseBoolean) {
                    this.d.a(uri, false);
                    this.e.a(uri, contextUri, this.g.a());
                    return;
                }
                this.d.a(uri, contextUri, false);
                this.e.a(uri, contextUri, this.c.toString(), this.g.a());
            }
        }
    }

    public final void a(szy szy) {
        this.h = (szy) fay.a(szy);
        this.h.a((a) this);
        this.b.a((a<T>) this);
    }
}
