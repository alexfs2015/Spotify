package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tjz reason: default package */
public final class tjz implements tke, a<PlayerState> {
    private final Player a;
    private final vcq b;
    private final lar c;
    private final vei d;
    private final tkd e;
    private tkf f;

    public tjz(Player player, vcq vcq, lar lar, vei vei, tkd tkd) {
        this.a = player;
        this.b = vcq;
        this.c = lar;
        this.d = vei;
        this.e = tkd;
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

    public final void a(tkf tkf) {
        this.f = (tkf) fbp.a(tkf);
        this.f.a((a) this);
        this.b.a((a<T>) this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        this.f.setEnabled(parseBoolean);
        this.f.a(parseBoolean2);
    }
}
