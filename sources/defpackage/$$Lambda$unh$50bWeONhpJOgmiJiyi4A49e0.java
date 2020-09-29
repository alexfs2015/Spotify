package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: -$$Lambda$unh$-50bWeONhpJO-gmiJiyi4A49-e0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$unh$50bWeONhpJOgmiJiyi4A49e0 implements PlayerStateObserver {
    private final /* synthetic */ unh f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Intent f$2;

    public /* synthetic */ $$Lambda$unh$50bWeONhpJOgmiJiyi4A49e0(unh unh, String str, Intent intent) {
        this.f$0 = unh;
        this.f$1 = str;
        this.f$2 = intent;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.a(this.f$1, this.f$2, playerState);
    }
}
