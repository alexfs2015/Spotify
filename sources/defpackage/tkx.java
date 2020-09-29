package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tkx reason: default package */
public class tkx implements a, a<PlayerState> {
    private final Player a;
    private final vcq b;
    private final vdf c;
    private tky d;

    public tkx(Player player, vdf vdf, vcq vcq) {
        this.a = player;
        this.c = vdf;
        this.b = vcq;
    }

    public void a() {
        this.c.g();
        this.a.skipToNextTrack();
        this.d.e_(true);
    }

    public final void a(tky tky) {
        this.d = (tky) fbp.a(tky);
        this.d.a(this);
        this.b.a((a<T>) this);
    }

    public final void b() {
        this.c.h();
        this.a.skipToPreviousTrackAndDisableSeeking();
        this.d.e_(true);
    }

    public /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        this.d.a(playerState.reverse(), playerState.track(), playerState.future());
        this.d.e(!playerState.restrictions().disallowPeekingPrevReasons().isEmpty());
        this.d.f(!playerState.restrictions().disallowPeekingNextReasons().isEmpty());
        this.d.c(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
        this.d.d(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
        this.d.e_(false);
    }
}
