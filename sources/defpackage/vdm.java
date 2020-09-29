package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Collection;
import java.util.Set;

/* renamed from: vdm reason: default package */
public class vdm implements a {
    private final Player a;
    private final vcq b;
    private final vdo c;
    private final vdl d;
    private vdn e;

    public vdm(Player player, vcq vcq, vdo vdo, vdl vdl) {
        this.a = player;
        this.b = vcq;
        this.c = vdo;
        this.d = vdl;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.e.b(playerState.restrictions().disallowSkippingNextReasons().isEmpty());
    }

    public void a() {
        PlayerState playerState = (PlayerState) fbp.a(this.a.getLastPlayerState());
        this.d.d();
        Set disallowSkippingNextReasons = playerState.restrictions().disallowSkippingNextReasons();
        if (disallowSkippingNextReasons.isEmpty()) {
            this.a.skipToNextTrack();
        } else {
            this.c.call(ImmutableSet.a((Collection<? extends E>) disallowSkippingNextReasons));
        }
    }

    public final void a(vdn vdn) {
        this.e = (vdn) fbp.a(vdn);
        this.e.a((a) this);
        this.b.a((a<T>) new $$Lambda$vdm$nIICWYlUgCSesHc_Cd4WSeBzMqE<T>(this));
    }
}
