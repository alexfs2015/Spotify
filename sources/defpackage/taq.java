package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: taq reason: default package */
public class taq implements a, a<PlayerState> {
    private final Player a;
    private final url b;
    private final usa c;
    private tar d;

    public /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        this.d.a(playerState.reverse(), playerState.track(), playerState.future());
        this.d.e(!playerState.restrictions().disallowPeekingPrevReasons().isEmpty());
        this.d.f(!playerState.restrictions().disallowPeekingNextReasons().isEmpty());
        this.d.c(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
        this.d.d(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
        this.d.e_(false);
    }

    public taq(Player player, usa usa, url url) {
        this.a = player;
        this.c = usa;
        this.b = url;
    }

    public void a() {
        this.c.g();
        this.a.skipToNextTrack();
        this.d.e_(true);
    }

    public final void b() {
        this.c.h();
        this.a.skipToPreviousTrackAndDisableSeeking();
        this.d.e_(true);
    }

    public final void a(tar tar) {
        this.d = (tar) fay.a(tar);
        this.d.a(this);
        this.b.a((a<T>) this);
    }
}
