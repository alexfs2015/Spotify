package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tht reason: default package */
public final class tht implements thr, a<PlayerState> {
    private final Player a;
    private final vcq b;
    private final lal c;
    private final vde d;
    private final thq e;
    private ths f;

    public tht(Player player, vcq vcq, lal lal, vde vde, thq thq) {
        this.a = player;
        this.b = vcq;
        this.c = lal;
        this.d = vde;
        this.e = thq;
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

    public final void a(ths ths) {
        this.f = (ths) fbp.a(ths);
        this.f.a((a) this);
        this.b.a((a<T>) this);
        if (this.e.c()) {
            ths.e();
        } else {
            ths.f();
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(((PlayerState) obj).track());
        boolean parseBoolean = Boolean.parseBoolean((String) playerTrack.metadata().get("collection.is_banned"));
        this.f.setEnabled(Boolean.parseBoolean((String) playerTrack.metadata().get("collection.can_ban")));
        this.f.a(parseBoolean);
    }
}
