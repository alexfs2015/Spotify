package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Collection;
import java.util.Set;

/* renamed from: ush reason: default package */
public class ush implements a {
    private final Player a;
    private final url b;
    private final usj c;
    private final usg d;
    private usi e;

    public ush(Player player, url url, usj usj, usg usg) {
        this.a = player;
        this.b = url;
        this.c = usj;
        this.d = usg;
    }

    public void a() {
        PlayerState playerState = (PlayerState) fay.a(this.a.getLastPlayerState());
        this.d.d();
        Set disallowSkippingNextReasons = playerState.restrictions().disallowSkippingNextReasons();
        if (disallowSkippingNextReasons.isEmpty()) {
            this.a.skipToNextTrack();
        } else {
            this.c.call(ImmutableSet.a((Collection<? extends E>) disallowSkippingNextReasons));
        }
    }

    public final void a(usi usi) {
        this.e = (usi) fay.a(usi);
        this.e.a((a) this);
        this.b.a((a<T>) new $$Lambda$ush$9h4kOu4eJZ8e5Ndj0ToGtrfN4hg<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.e.b(playerState.restrictions().disallowSkippingNextReasons().isEmpty());
    }
}
