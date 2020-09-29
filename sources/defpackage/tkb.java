package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tkb reason: default package */
public final class tkb implements tke, a<PlayerState> {
    private final Player a;
    private final vcq b;
    private final sso c;
    private final lar d;
    private final rka e;
    private final vei f;
    private final tkd g;
    private tkf h;

    public tkb(Player player, vcq vcq, sso sso, lar lar, rka rka, vei vei, tkd tkd) {
        this.a = player;
        this.b = vcq;
        this.c = sso;
        this.d = lar;
        this.e = rka;
        this.f = vei;
        this.g = tkd;
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

    public final void a(tkf tkf) {
        this.h = (tkf) fbp.a(tkf);
        this.h.a((a) this);
        this.b.a((a<T>) this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection"));
        this.h.setEnabled(parseBoolean);
        this.h.a(parseBoolean2);
    }
}
