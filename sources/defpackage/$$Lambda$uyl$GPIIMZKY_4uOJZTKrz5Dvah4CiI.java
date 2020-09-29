package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: -$$Lambda$uyl$GPIIMZKY_4uOJZTKrz5Dvah4CiI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uyl$GPIIMZKY_4uOJZTKrz5Dvah4CiI implements PlayerStateObserver {
    private final /* synthetic */ uyl f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Intent f$2;

    public /* synthetic */ $$Lambda$uyl$GPIIMZKY_4uOJZTKrz5Dvah4CiI(uyl uyl, String str, Intent intent) {
        this.f$0 = uyl;
        this.f$1 = str;
        this.f$2 = intent;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.a(this.f$1, this.f$2, playerState);
    }
}
